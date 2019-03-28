package com.lyf.mapper;

import com.lyf.model.TypeJobintension;
import com.lyf.model.TypeJobintensionExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface TypeJobintensionMapper {
    @SelectProvider(type=TypeJobintensionSqlProvider.class, method="countByExample")
    int countByExample(TypeJobintensionExample example);

    @DeleteProvider(type=TypeJobintensionSqlProvider.class, method="deleteByExample")
    int deleteByExample(TypeJobintensionExample example);

    @Delete({
        "delete from typejobintension",
        "where typeid = #{typeid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer typeid);

    @Insert({
        "insert into typejobintension (typeid, typename, ",
        "typescore, jid)",
        "values (#{typeid,jdbcType=INTEGER}, #{typename,jdbcType=VARCHAR}, ",
        "#{typescore,jdbcType=INTEGER}, #{jid,jdbcType=INTEGER})"
    })
    int insert(TypeJobintension record);

    @InsertProvider(type=TypeJobintensionSqlProvider.class, method="insertSelective")
    int insertSelective(TypeJobintension record);

    @SelectProvider(type=TypeJobintensionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="typeid", property="typeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="typename", property="typename", jdbcType=JdbcType.VARCHAR),
        @Result(column="typescore", property="typescore", jdbcType=JdbcType.INTEGER),
        @Result(column="jid", property="jid", jdbcType=JdbcType.INTEGER)
    })
    List<TypeJobintension> selectByExample(TypeJobintensionExample example);

    @Select({
            "select",
            "typeid, typename, typescore, jid",
            "from typejobintension",
            "where typeid = #{typeid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="typeid", property="typeid", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="typename", property="typename", jdbcType=JdbcType.VARCHAR),
            @Result(column="typescore", property="typescore", jdbcType=JdbcType.INTEGER),
            @Result(column="jid", property="jid", jdbcType=JdbcType.INTEGER)
    })
    TypeJobintension selectByPrimaryKey(Integer typeid);

//    @Select({
//            "select",
//            "typeid, typename, typescore, jid",
//            "from typejobintension",
//            "where jid = #{jid,jdbcType=INTEGER}"
//    })
//    @Results({
//            @Result(column="typeid", property="typeid", jdbcType=JdbcType.INTEGER, id=true),
//            @Result(column="typename", property="typename", jdbcType=JdbcType.VARCHAR),
//            @Result(column="typescore", property="typescore", jdbcType=JdbcType.INTEGER),
//            @Result(column="jid", property="jid", jdbcType=JdbcType.INTEGER)
//    })
//    TypeJobintension selectByJid(Integer jid);

    @UpdateProvider(type=TypeJobintensionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TypeJobintension record, @Param("example") TypeJobintensionExample example);

    @UpdateProvider(type=TypeJobintensionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TypeJobintension record, @Param("example") TypeJobintensionExample example);

    @UpdateProvider(type=TypeJobintensionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TypeJobintension record);

    @Update({
        "update typejobintension",
        "set typename = #{typename,jdbcType=VARCHAR},",
          "typescore = #{typescore,jdbcType=INTEGER},",
          "jid = #{jid,jdbcType=INTEGER}",
        "where typeid = #{typeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TypeJobintension record);
}