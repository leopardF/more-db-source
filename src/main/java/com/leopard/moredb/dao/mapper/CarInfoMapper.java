package com.leopard.moredb.dao.mapper;

import com.leopard.moredb.config.DataSource;
import com.leopard.moredb.entity.CarInfo;
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
public interface CarInfoMapper extends Mapper<CarInfo> {

    @DataSource("slave2")
    @Results(value = {@Result(column = "id", property = "id"),
            @Result(column = "car_name", property = "carName"),
            @Result(column = "price", property = "price")
    })
    @Select("select * from car_info ")
    public List<CarInfo> queryCarInfo();


}
