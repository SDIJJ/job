package com.lyf.mapper;

import com.lyf.model.Workexppeopleintension;
import com.lyf.model.WorkexppeopleintensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface WorkexppeopleintensionMapper {
    @SelectProvider(type=WorkexppeopleintensionSqlProvider.class, method="countByExample")
    int countByExample(WorkexppeopleintensionExample example);

    @DeleteProvider(type=WorkexppeopleintensionSqlProvider.class, method="deleteByExample")
    int deleteByExample(WorkexppeopleintensionExample example);

    @Delete({
        "delete from workexppeopleintension",
        "where workexpid = #{workexpid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer workexpid);

    @Insert({
        "insert into workexppeopleintension (workexpid, workexp, ",
        "placescore, pid)",
        "values (#{workexpid,jdbcType=INTEGER}, #{workexp,jdbcType=VARCHAR}, ",
        "#{placescore,jdbcType=INTEGER}, #{pid,jdbcType=INTEGER})"
    })
    int insert(Workexppeopleintension record);

    @InsertProvider(type=WorkexppeopleintensionSqlProvider.class, method="insertSelective")
    int insertSelective(Workexppeopleintension record);

    @SelectProvider(type=WorkexppeopleintensionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="workexpid", property="workexpid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="workexp", property="workexp", jdbcType=JdbcType.VARCHAR),
        @Result(column="placescore", property="placescore", jdbcType=JdbcType.INTEGER),
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER)
    })
    List<Workexppeopleintension> selectByExample(WorkexppeopleintensionExample example);

    @Select({
        "select",
        "workexpid, workexp, placescore, pid",
        "from workexppeopleintension",
        "where workexpid = #{workexpid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="workexpid", property="workexpid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="workexp", property="workexp", jdbcType=JdbcType.VARCHAR),
        @Result(column="placescore", property="placescore", jdbcType=JdbcType.INTEGER),
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER)
    })
    Workexppeopleintension selectByPrimaryKey(Integer workexpid);

    @UpdateProvider(type=WorkexppeopleintensionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Workexppeopleintension record, @Param("example") WorkexppeopleintensionExample example);

    @UpdateProvider(type=WorkexppeopleintensionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Workexppeopleintension record, @Param("example") WorkexppeopleintensionExample example);

    @UpdateProvider(type=WorkexppeopleintensionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Workexppeopleintension record);

    @Update({
        "update workexppeopleintension",
        "set workexp = #{workexp,jdbcType=VARCHAR},",
          "placescore = #{placescore,jdbcType=INTEGER},",
          "pid = #{pid,jdbcType=INTEGER}",
        "where workexpid = #{workexpid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Workexppeopleintension record);
}