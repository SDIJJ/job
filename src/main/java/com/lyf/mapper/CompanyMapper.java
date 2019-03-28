package com.lyf.mapper;

import com.lyf.model.Company;
import com.lyf.model.CompanyExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

import javax.persistence.OneToMany;
import java.util.List;

public interface CompanyMapper {
    @SelectProvider(type = CompanySqlProvider.class, method = "countByExample")
    int countByExample(CompanyExample example);

    @DeleteProvider(type = CompanySqlProvider.class, method = "deleteByExample")
    int deleteByExample(CompanyExample example);

    @Delete({
            "delete from company",
            "where cid = #{cid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cid);

    @Insert({
            "insert into company (cid, cname, ",
            "typename, cintroduce, ",
            "cphotopath, position, ",
            "place, skillNeed, ",
            "others, uid, username)",
            "values (#{cid,jdbcType=INTEGER}, #{cname,jdbcType=VARCHAR}, ",
            "#{typename,jdbcType=VARCHAR}, #{cintroduce,jdbcType=VARCHAR}, ",
            "#{cphotopath,jdbcType=VARCHAR}, #{position,jdbcType=VARCHAR}, ",
            "#{place,jdbcType=VARCHAR}, #{skillneed,jdbcType=VARCHAR}, ",
            "#{others,jdbcType=VARCHAR}, #{uid,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR})"
    })
    int insert(Company record);

    @InsertProvider(type = CompanySqlProvider.class, method = "insertSelective")
    int insertSelective(Company record);

    @SelectProvider(type = CompanySqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "cid", property = "cid", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "cname", property = "cname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "typename", property = "typename", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cintroduce", property = "cintroduce", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cphotopath", property = "cphotopath", jdbcType = JdbcType.VARCHAR),
            @Result(column = "position", property = "position", jdbcType = JdbcType.VARCHAR),
            @Result(column = "place", property = "place", jdbcType = JdbcType.VARCHAR),
            @Result(column = "skillNeed", property = "skillneed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "others", property = "others", jdbcType = JdbcType.VARCHAR),
            @Result(column = "uid", property = "uid", jdbcType = JdbcType.INTEGER),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR)
    })
    List<Company> selectByExample(CompanyExample example);

    @Select({
            "select",
            "cid, cname, typename, cintroduce, cphotopath, position, place, skillNeed, others, ",
            "uid, username",
            "from company",
            "where cid = #{cid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "cid", property = "cid", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "cname", property = "cname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "typename", property = "typename", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cintroduce", property = "cintroduce", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cphotopath", property = "cphotopath", jdbcType = JdbcType.VARCHAR),
            @Result(column = "position", property = "position", jdbcType = JdbcType.VARCHAR),
            @Result(column = "place", property = "place", jdbcType = JdbcType.VARCHAR),
            @Result(column = "skillNeed", property = "skillneed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "others", property = "others", jdbcType = JdbcType.VARCHAR),
            @Result(column = "uid", property = "uid", jdbcType = JdbcType.INTEGER),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR)
    })
    Company selectByCid(Integer cid);

    //正在尝试写公司简历关联查询，很菜还不放弃
    @Select({
            "select",
            "c.*",
            "from company c",
            "where  cid = #{cid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "cid", property = "cid", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "cname", property = "cname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "typename", property = "typename", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cintroduce", property = "cintroduce", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cphotopath", property = "cphotopath", jdbcType = JdbcType.VARCHAR),
            @Result(column = "position", property = "position", jdbcType = JdbcType.VARCHAR),
            @Result(column = "place", property = "place", jdbcType = JdbcType.VARCHAR),
            @Result(column = "skillNeed", property = "skillneed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "others", property = "others", jdbcType = JdbcType.VARCHAR),
            @Result(column = "uid", property = "uid", jdbcType = JdbcType.INTEGER),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(property = "resumes", column = "cid", javaType = List.class,
                    many = @Many(select = "com.lyf.mapper.ResumeMapper.selectResumeByCid",
                            fetchType = FetchType.EAGER
                    )
            )})
    Company selectCompanyWithResuem(Integer cid);

    @Select({
            "select",
            "cid, cname, typename, cintroduce, cphotopath, position, place, skillNeed, others, ",
            "uid, username",
            "from company",
            "where uid = #{uid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "cid", property = "cid", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "cname", property = "cname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "typename", property = "typename", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cintroduce", property = "cintroduce", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cphotopath", property = "cphotopath", jdbcType = JdbcType.VARCHAR),
            @Result(column = "position", property = "position", jdbcType = JdbcType.VARCHAR),
            @Result(column = "place", property = "place", jdbcType = JdbcType.VARCHAR),
            @Result(column = "skillNeed", property = "skillneed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "others", property = "others", jdbcType = JdbcType.VARCHAR),
            @Result(column = "uid", property = "uid", jdbcType = JdbcType.INTEGER),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR)
    })
    Company selectByUid(Integer uid);


    //根据简历rid查询company
    @Select({
            "select * from company where cid in (select company_id from company_resume where " +
                    "resume_id=#{rid,jdbcType=INTEGER})"
    })
    @Results({
            @Result(column = "cid", property = "cid", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "cname", property = "cname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "typename", property = "typename", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cintroduce", property = "cintroduce", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cphotopath", property = "cphotopath", jdbcType = JdbcType.VARCHAR),
            @Result(column = "position", property = "position", jdbcType = JdbcType.VARCHAR),
            @Result(column = "place", property = "place", jdbcType = JdbcType.VARCHAR),
            @Result(column = "skillNeed", property = "skillneed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "others", property = "others", jdbcType = JdbcType.VARCHAR),
            @Result(column = "uid", property = "uid", jdbcType = JdbcType.INTEGER),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR)
    })
    List<Company> selectCompanyByRid(Integer rid);

    @Select({
            "select",
            "cid, cname, typename, cintroduce, cphotopath, position, place, skillNeed, others, ",
            "uid, username",
            "from company",
            "where cid = #{cid,jdbcType=INTEGER}"
    })

    @Results({
            @Result(column = "cid", property = "cid", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "cname", property = "cname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "typename", property = "typename", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cintroduce", property = "cintroduce", jdbcType = JdbcType.VARCHAR),
            @Result(column = "cphotopath", property = "cphotopath", jdbcType = JdbcType.VARCHAR),
            @Result(column = "position", property = "position", jdbcType = JdbcType.VARCHAR),
            @Result(column = "place", property = "place", jdbcType = JdbcType.VARCHAR),
            @Result(column = "skillNeed", property = "skillneed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "others", property = "others", jdbcType = JdbcType.VARCHAR),
            @Result(column = "uid", property = "uid", jdbcType = JdbcType.INTEGER),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR)
    })
    Company selectByPrimaryKey(Integer cid);

    @UpdateProvider(type = CompanySqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    @UpdateProvider(type = CompanySqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    @UpdateProvider(type = CompanySqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Company record);

    @Update({
            "update company",
            "set cname = #{cname,jdbcType=VARCHAR},",
            "typename = #{typename,jdbcType=VARCHAR},",
            "cintroduce = #{cintroduce,jdbcType=VARCHAR},",
            "cphotopath = #{cphotopath,jdbcType=VARCHAR},",
            "position = #{position,jdbcType=VARCHAR},",
            "place = #{place,jdbcType=VARCHAR},",
            "skillNeed = #{skillneed,jdbcType=VARCHAR},",
            "others = #{others,jdbcType=VARCHAR},",
            "uid = #{uid,jdbcType=INTEGER},",
            "username = #{username,jdbcType=VARCHAR}",
            "where cid = #{cid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Company record);
}