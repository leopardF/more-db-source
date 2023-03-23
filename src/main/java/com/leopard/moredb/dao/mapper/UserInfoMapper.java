package com.leopard.moredb.dao.mapper;

import com.leopard.moredb.config.DataSource;
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
public interface UserInfoMapper extends Mapper<UserInfo> {

    @DataSource
    @Results(value = {@Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "telphone", property = "telphone"),
            @Result(column = "memo", property = "memo")
    })
    @Select("select * from user_info ")
    public List<UserInfo> queryUserInfo();


}
