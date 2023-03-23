package com.leopard.moredb.service;

import com.leopard.moredb.dao.mapper.BikeInfoMapper;
import com.leopard.moredb.dao.mapper.CarInfoMapper;
import com.leopard.moredb.dao.mapper.UserInfoMapper;
import com.leopard.moredb.entity.BikeInfo;
import com.leopard.moredb.entity.CarInfo;
import com.leopard.moredb.entity.UserInfo;
import com.leopard.moredb.response.WrapperResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author leopard.ji
 */
@Service
@Slf4j
public class SourceService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private BikeInfoMapper bikeInfoMapper;

    @Autowired
    private CarInfoMapper carInfoMapper;


    public WrapperResponse queryUserInfo() throws Exception {

        List<UserInfo> list = userInfoMapper.queryUserInfo();

        return WrapperResponse.success(list);
    }


    public WrapperResponse queryBikeInfo() throws Exception {

        List<BikeInfo> list = bikeInfoMapper.queryBikeInfo();

        return WrapperResponse.success(list);
    }

    public WrapperResponse queryCarInfo() throws Exception {

        List<CarInfo> list = carInfoMapper.queryCarInfo();

        return WrapperResponse.success(list);
    }

}
