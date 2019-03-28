package com.lyf.mapper;

import com.lyf.model.Xuelipeopleintension;
import com.lyf.model.XuelipeopleintensionExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface XuelipeopleintensionMapper {
    @SelectProvider(type=XuelipeopleintensionSqlProvider.class, method="countByExample")
    int countByExample(XuelipeopleintensionExample example);

    @DeleteProvider(type=XuelipeopleintensionSqlProvider.class, method="deleteByExample")
    int deleteByExample(XuelipeopleintensionExample example);

    @Delete({
        "delete from xuelipeopleintension",
        "where xueliid = #{xueliid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer xueliid);

    @Insert({
        "insert into xuelipeopleintension (xueliid, xueliname, ",
        "xueliscore, pid)",
        "values (#{xueliid,jdbcType=INTEGER}, #{xueliname,jdbcType=VARCHAR}, ",
        "#{xueliscore,jdbcType=INTEGER}, #{pid,jdbcType=INTEGER})"
    })
    int insert(Xuelipeopleintension record);

    @InsertProvider(type=XuelipeopleintensionSqlProvider.class, method="insertSelective")
    int insertSelective(Xuelipeopleintension record);

    @SelectProvider(type=XuelipeopleintensionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="xueliid", property="xueliid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="xueliname", property="xueliname", jdbcType=JdbcType.VARCHAR),
        @Result(column="xueliscore", property="xueliscore", jdbcType=JdbcType.INTEGER),
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER)
    })
    List<Xuelipeopleintension> selectByExample(XuelipeopleintensionExample example);

    @Select({
        "select",
        "xueliid, xueliname, xueliscore, pid",
        "from xuelipeopleintension",
        "where xueliid = #{xueliid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="xueliid", property="xueliid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="xueliname", property="xueliname", jdbcType=JdbcType.VARCHAR),
        @Result(column="xueliscore", property="xueliscore", jdbcType=JdbcType.INTEGER),
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER)
    })
    Xuelipeopleintension selectByPrimaryKey(Integer xueliid);

    @UpdateProvider(type=XuelipeopleintensionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Xuelipeopleintension record, @Param("example") XuelipeopleintensionExample example);

    @UpdateProvider(type=XuelipeopleintensionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Xuelipeopleintension record, @Param("example") XuelipeopleintensionExample example);

    @UpdateProvider(type=XuelipeopleintensionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Xuelipeopleintension record);

    @Update({
        "update xuelipeopleintension",
        "set xueliname = #{xueliname,jdbcType=VARCHAR},",
          "xueliscore = #{xueliscore,jdbcType=INTEGER},",
          "pid = #{pid,jdbcType=INTEGER}",
        "where xueliid = #{xueliid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Xuelipeopleintension record);
}