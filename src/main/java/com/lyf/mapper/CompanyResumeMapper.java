package com.lyf.mapper;

import com.lyf.model.CompanyResume;
import com.lyf.model.CompanyResumeExample;
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

public interface CompanyResumeMapper {
    @SelectProvider(type=CompanyResumeSqlProvider.class, method="countByExample")
    long countByExample(CompanyResumeExample example);

    @DeleteProvider(type=CompanyResumeSqlProvider.class, method="deleteByExample")
    int deleteByExample(CompanyResumeExample example);

    @Delete({
        "delete from company_resume",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into company_resume (id, company_id, ",
        "resume_id, status)",
        "values (#{id,jdbcType=INTEGER}, #{companyId,jdbcType=INTEGER}, ",
        "#{resumeId,jdbcType=INTEGER}, #{status,jdbcType=INTEGER})"
    })
    int insert(CompanyResume record);

    @InsertProvider(type=CompanyResumeSqlProvider.class, method="insertSelective")
    int insertSelective(CompanyResume record);

    @SelectProvider(type=CompanyResumeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="resume_id", property="resumeId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    List<CompanyResume> selectByExample(CompanyResumeExample example);

    @Select({
        "select",
        "id, company_id, resume_id, status",
        "from company_resume",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="resume_id", property="resumeId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    CompanyResume selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CompanyResumeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CompanyResume record, @Param("example") CompanyResumeExample example);

    @UpdateProvider(type=CompanyResumeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CompanyResume record, @Param("example") CompanyResumeExample example);

    @UpdateProvider(type=CompanyResumeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CompanyResume record);

    @Update({
        "update company_resume",
        "set company_id = #{companyId,jdbcType=INTEGER},",
          "resume_id = #{resumeId,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CompanyResume record);
}