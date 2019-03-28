package com.lyf.mapper;

import com.lyf.model.User;
import com.lyf.model.UserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserMapper {
    @SelectProvider(type = UserSqlProvider.class, method = "countByExample")
    long countByExample(UserExample example);

    @DeleteProvider(type = UserSqlProvider.class, method = "deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
            "delete from user",
            "where uid = #{uid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer uid);

    @Insert({
            "insert into user (uid, username, ",
            "password, mail, ",
            "role)",
            "values (#{uid,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
            "#{password,jdbcType=VARCHAR}, #{mail,jdbcType=VARCHAR}, ",
            "#{role,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type = UserSqlProvider.class, method = "insertSelective")
    int insertSelective(User record);

    @SelectProvider(type = UserSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "uid", property = "uid", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mail", property = "mail", jdbcType = JdbcType.VARCHAR),
            @Result(column = "role", property = "role", jdbcType = JdbcType.VARCHAR)
    })
    User selectByExample(UserExample example);

    @Select({
            "select",
            "uid, username, password, mail, role",
            "from user",
            "where uid = #{uid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "uid", property = "uid", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "mail", property = "mail", jdbcType = JdbcType.VARCHAR),
            @Result(column = "role", property = "role", jdbcType = JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Integer uid);

    //登录
    @Select({
            "select",
            "uid, username, password, role",
            "from user",
            "where username = #{username,jdbcType=INTEGER}"+
                    "and password = #{password,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
            @Result(column="role", property="role", jdbcType=JdbcType.VARCHAR)
    })
    User login(@Param("username") String username,@Param("password") String password);

    @UpdateProvider(type = UserSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type = UserSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type = UserSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
            "update user",
            "set username = #{username,jdbcType=VARCHAR},",
            "password = #{password,jdbcType=VARCHAR},",
            "mail = #{mail,jdbcType=VARCHAR},",
            "role = #{role,jdbcType=VARCHAR}",
            "where uid = #{uid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}