package com.lyf.mapper;

import com.lyf.model.Placejobintension;
import com.lyf.model.PlacejobintensionExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface PlacejobintensionMapper {
    @SelectProvider(type=PlacejobintensionSqlProvider.class, method="countByExample")
    int countByExample(PlacejobintensionExample example);

    @DeleteProvider(type=PlacejobintensionSqlProvider.class, method="deleteByExample")
    int deleteByExample(PlacejobintensionExample example);

    @Delete({
        "delete from placejobintension",
        "where placeid = #{placeid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer placeid);

    @Insert({
        "insert into placejobintension (placeid, placename, ",
        "placescore, jid)",
        "values (#{placeid,jdbcType=INTEGER}, #{placename,jdbcType=VARCHAR}, ",
        "#{placescore,jdbcType=INTEGER}, #{jid,jdbcType=INTEGER})"
    })
    int insert(Placejobintension record);

    @InsertProvider(type=PlacejobintensionSqlProvider.class, method="insertSelective")
    int insertSelective(Placejobintension record);

    @SelectProvider(type=PlacejobintensionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="placeid", property="placeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="placename", property="placename", jdbcType=JdbcType.VARCHAR),
        @Result(column="placescore", property="placescore", jdbcType=JdbcType.INTEGER),
        @Result(column="jid", property="jid", jdbcType=JdbcType.INTEGER)
    })
    List<Placejobintension> selectByExample(PlacejobintensionExample example);

    @Select({
        "select",
        "placeid, placename, placescore, jid",
        "from placejobintension",
        "where placeid = #{placeid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="placeid", property="placeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="placename", property="placename", jdbcType=JdbcType.VARCHAR),
        @Result(column="placescore", property="placescore", jdbcType=JdbcType.INTEGER),
        @Result(column="jid", property="jid", jdbcType=JdbcType.INTEGER)
    })
    Placejobintension selectByPrimaryKey(Integer placeid);



    @UpdateProvider(type=PlacejobintensionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Placejobintension record, @Param("example") PlacejobintensionExample example);

    @UpdateProvider(type=PlacejobintensionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Placejobintension record, @Param("example") PlacejobintensionExample example);

    @UpdateProvider(type=PlacejobintensionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Placejobintension record);

    @Update({
        "update placejobintension",
        "set placename = #{placename,jdbcType=VARCHAR},",
          "placescore = #{placescore,jdbcType=INTEGER},",
          "jid = #{jid,jdbcType=INTEGER}",
        "where placeid = #{placeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Placejobintension record);
}