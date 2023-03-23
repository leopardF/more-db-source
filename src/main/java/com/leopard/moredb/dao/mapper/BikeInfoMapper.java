package com.leopard.moredb.dao.mapper;

import com.leopard.moredb.config.DataSource;
import com.leopard.moredb.entity.BikeInfo;
import com.leopard.moredb.entity.UserInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author leopard
 */
@org.apache.ibatis.annotations.Mapper
public interface BikeInfoMapper extends Mapper<BikeInfo> {


    @DataSource("slave1")
    @Results(value = {@Result(column = "id", property = "id"),
            @Result(column = "bike_name", property = "bikeName"),
            @Result(column = "price", property = "price")
    })
    @Select("select * from bike_info ")
    public List<BikeInfo> queryBikeInfo();


}
