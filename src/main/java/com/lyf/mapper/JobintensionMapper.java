package com.lyf.mapper;

import com.lyf.model.Jobintension;
import com.lyf.model.JobintensionExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface JobintensionMapper {
    @SelectProvider(type=JobintensionSqlProvider.class, method="countByExample")
    int countByExample(JobintensionExample example);

    @DeleteProvider(type=JobintensionSqlProvider.class, method="deleteByExample")
    int deleteByExample(JobintensionExample example);

    @Delete({
        "delete from jobintension",
        "where jid = #{jid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer jid);

    @Insert({
        "insert into jobintension (jid, typeWeight, ",
        "placeWeight, aid, ",
        "username)",
        "values (#{jid,jdbcType=INTEGER}, #{typeweight,jdbcType=INTEGER}, ",
        "#{placeweight,jdbcType=INTEGER}, #{aid,jdbcType=INTEGER}, ",
        "#{username,jdbcType=VARCHAR})"
    })
    int insert(Jobintension record);

    @InsertProvider(type=JobintensionSqlProvider.class, method="insertSelective")
    int insertSelective(Jobintension record);

    @SelectProvider(type=JobintensionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="jid", property="jid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="typeWeight", property="typeweight", jdbcType=JdbcType.INTEGER),
        @Result(column="placeWeight", property="placeweight", jdbcType=JdbcType.INTEGER),
        @Result(column="aid", property="aid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    List<Jobintension> selectByExample(JobintensionExample example);

    @Select({
        "select",
        "jid, typeWeight, placeWeight, aid, username",
        "from jobintension",
        "where jid = #{jid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="jid", property="jid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="typeWeight", property="typeweight", jdbcType=JdbcType.INTEGER),
        @Result(column="placeWeight", property="placeweight", jdbcType=JdbcType.INTEGER),
        @Result(column="aid", property="aid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    Jobintension selectByPrimaryKey(Integer jid);

    @Select({
            "select",
            "jid, typeWeight, placeWeight, aid, username",
            "from jobintension",
            "where aid = #{aid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="jid", property="jid", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="typeWeight", property="typeweight", jdbcType=JdbcType.INTEGER),
            @Result(column="placeWeight", property="placeweight", jdbcType=JdbcType.INTEGER),
            @Result(column="aid", property="aid", jdbcType=JdbcType.INTEGER),
            @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    Jobintension selectByAid(Integer aid);
    @UpdateProvider(type=JobintensionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Jobintension record, @Param("example") JobintensionExample example);

    @UpdateProvider(type=JobintensionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Jobintension record, @Param("example") JobintensionExample example);

    @UpdateProvider(type=JobintensionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Jobintension record);

    @Update({
        "update jobintension",
        "set typeWeight = #{typeweight,jdbcType=INTEGER},",
          "placeWeight = #{placeweight,jdbcType=INTEGER},",
          "aid = #{aid,jdbcType=INTEGER},",
          "username = #{username,jdbcType=VARCHAR}",
        "where jid = #{jid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Jobintension record);
}