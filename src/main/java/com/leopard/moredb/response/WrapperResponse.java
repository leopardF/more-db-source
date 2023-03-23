package com.leopard.moredb.response;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.UUID;

@Slf4j
public class WrapperResponse<T> implements Serializable {
    private static final long serialVersionUID = 4308389749594040329L;
    final public static String SUCCESS = "0";
    final public static String MSG_SUCCESS = "成功";

    private String code;
    private String message;
    private String requestId = UUID.randomUUID().toString();
    private T data;

    public WrapperResponse() {
        log.info("requestId ==> " + requestId);
    }

    private WrapperResponse(String code, String message) {
        this.code = code;
        this.message = message;
        log.info("requestId ==> " + requestId);
    }

    private WrapperResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        log.info("requestId ==> " + requestId);
    }

    public boolean isSuccess() {
        boolean reuslt = this.code.equals(WrapperResponse.SUCCESS);
        return reuslt;
    }


    public static WrapperResponse success() {
        return new WrapperResponse(WrapperResponse.SUCCESS, WrapperResponse.MSG_SUCCESS);
    }

    public static WrapperResponse success(Object data) {
        return new WrapperResponse(WrapperResponse.SUCCESS, WrapperResponse.MSG_SUCCESS, data);
    }



    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
