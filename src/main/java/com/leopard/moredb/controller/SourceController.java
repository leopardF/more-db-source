package com.leopard.moredb.controller;

import com.leopard.moredb.response.WrapperResponse;
import com.leopard.moredb.service.SourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author leopard.ji
 */
@RestController
@Slf4j
public class SourceController {

    @Autowired
    private SourceService sourceService;


    /**
     * 查询用户信息
     *
     * @return
     * @throws Exception
     */
    @GetMapping("/queryUserInfo")
    public WrapperResponse<String> queryUserInfo() throws Exception {

        return sourceService.queryUserInfo();
    }


    /**
     * 查询单车信息
     *
     * @return
     * @throws Exception
     */
    @GetMapping("/queryBikeInfo")
    public WrapperResponse<String> queryBikeInfo() throws Exception {

        return sourceService.queryBikeInfo();
    }

    /**
     * 查询汽车信息
     *
     * @return
     * @throws Exception
     */
    @GetMapping("/queryCarInfo")
    public WrapperResponse<String> queryCarInfo() throws Exception {

        return sourceService.queryCarInfo();
    }


}
