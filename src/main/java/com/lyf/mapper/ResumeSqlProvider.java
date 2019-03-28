package com.lyf.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.lyf.model.Resume;
import com.lyf.model.ResumeExample.Criteria;
import com.lyf.model.ResumeExample.Criterion;
import com.lyf.model.ResumeExample;
import java.util.List;
import java.util.Map;

public class ResumeSqlProvider {

    public String countByExample(ResumeExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("resume");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(ResumeExample example) {
        BEGIN();
        DELETE_FROM("resume");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Resume record) {
        BEGIN();
        INSERT_INTO("resume");
        
        if (record.getRid() != null) {
            VALUES("rid", "#{rid,jdbcType=INTEGER}");
        }
        
        if (record.getPosition() != null) {
            VALUES("position", "#{position,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            VALUES("age", "#{age,jdbcType=INTEGER}");
        }
        
        if (record.getSex() != null) {
            VALUES("sex", "#{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getHuji() != null) {
            VALUES("huji", "#{huji,jdbcType=VARCHAR}");
        }
        
        if (record.getXueli() != null) {
            VALUES("xueli", "#{xueli,jdbcType=VARCHAR}");
        }
        
        if (record.getSchool() != null) {
            VALUES("school", "#{school,jdbcType=VARCHAR}");
        }
        
        if (record.getMajor() != null) {
            VALUES("major", "#{major,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorpm() != null) {
            VALUES("majorpm", "#{majorpm,jdbcType=INTEGER}");
        }
        
        if (record.getCertificate() != null) {
            VALUES("certificate", "#{certificate,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            VALUES("level", "#{level,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkexp() != null) {
            VALUES("workexp", "#{workexp,jdbcType=VARCHAR}");
        }
        
        if (record.getPpath() != null) {
            VALUES("ppath", "#{ppath,jdbcType=VARCHAR}");
        }
        
        if (record.getRpath() != null) {
            VALUES("rpath", "#{rpath,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            VALUES("role", "#{role,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(ResumeExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("rid");
        } else {
            SELECT("rid");
        }
        SELECT("position");
        SELECT("name");
        SELECT("age");
        SELECT("sex");
        SELECT("email");
        SELECT("address");
        SELECT("phone");
        SELECT("huji");
        SELECT("xueli");
        SELECT("school");
        SELECT("major");
        SELECT("majorpm");
        SELECT("certificate");
        SELECT("level");
        SELECT("workexp");
        SELECT("ppath");
        SELECT("rpath");
        SELECT("uid");
        SELECT("username");
        SELECT("role");
        FROM("resume");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Resume record = (Resume) parameter.get("record");
        ResumeExample example = (ResumeExample) parameter.get("example");
        
        BEGIN();
        UPDATE("resume");
        
        if (record.getRid() != null) {
            SET("rid = #{record.rid,jdbcType=INTEGER}");
        }
        
        if (record.getPosition() != null) {
            SET("position = #{record.position,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            SET("age = #{record.age,jdbcType=INTEGER}");
        }
        
        if (record.getSex() != null) {
            SET("sex = #{record.sex,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            SET("phone = #{record.phone,jdbcType=VARCHAR}");
        }
        
        if (record.getHuji() != null) {
            SET("huji = #{record.huji,jdbcType=VARCHAR}");
        }
        
        if (record.getXueli() != null) {
            SET("xueli = #{record.xueli,jdbcType=VARCHAR}");
        }
        
        if (record.getSchool() != null) {
            SET("school = #{record.school,jdbcType=VARCHAR}");
        }
        
        if (record.getMajor() != null) {
            SET("major = #{record.major,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorpm() != null) {
            SET("majorpm = #{record.majorpm,jdbcType=INTEGER}");
        }
        
        if (record.getCertificate() != null) {
            SET("certificate = #{record.certificate,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            SET("level = #{record.level,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkexp() != null) {
            SET("workexp = #{record.workexp,jdbcType=VARCHAR}");
        }
        
        if (record.getPpath() != null) {
            SET("ppath = #{record.ppath,jdbcType=VARCHAR}");
        }
        
        if (record.getRpath() != null) {
            SET("rpath = #{record.rpath,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            SET("uid = #{record.uid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            SET("role = #{record.role,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("resume");
        
        SET("rid = #{record.rid,jdbcType=INTEGER}");
        SET("position = #{record.position,jdbcType=VARCHAR}");
        SET("name = #{record.name,jdbcType=VARCHAR}");
        SET("age = #{record.age,jdbcType=INTEGER}");
        SET("sex = #{record.sex,jdbcType=VARCHAR}");
        SET("email = #{record.email,jdbcType=VARCHAR}");
        SET("address = #{record.address,jdbcType=VARCHAR}");
        SET("phone = #{record.phone,jdbcType=VARCHAR}");
        SET("huji = #{record.huji,jdbcType=VARCHAR}");
        SET("xueli = #{record.xueli,jdbcType=VARCHAR}");
        SET("school = #{record.school,jdbcType=VARCHAR}");
        SET("major = #{record.major,jdbcType=VARCHAR}");
        SET("majorpm = #{record.majorpm,jdbcType=INTEGER}");
        SET("certificate = #{record.certificate,jdbcType=VARCHAR}");
        SET("level = #{record.level,jdbcType=VARCHAR}");
        SET("workexp = #{record.workexp,jdbcType=VARCHAR}");
        SET("ppath = #{record.ppath,jdbcType=VARCHAR}");
        SET("rpath = #{record.rpath,jdbcType=VARCHAR}");
        SET("uid = #{record.uid,jdbcType=INTEGER}");
        SET("username = #{record.username,jdbcType=VARCHAR}");
        SET("role = #{record.role,jdbcType=VARCHAR}");
        
        ResumeExample example = (ResumeExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Resume record) {
        BEGIN();
        UPDATE("resume");
        
        if (record.getPosition() != null) {
            SET("position = #{position,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            SET("age = #{age,jdbcType=INTEGER}");
        }
        
        if (record.getSex() != null) {
            SET("sex = #{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getHuji() != null) {
            SET("huji = #{huji,jdbcType=VARCHAR}");
        }
        
        if (record.getXueli() != null) {
            SET("xueli = #{xueli,jdbcType=VARCHAR}");
        }
        
        if (record.getSchool() != null) {
            SET("school = #{school,jdbcType=VARCHAR}");
        }
        
        if (record.getMajor() != null) {
            SET("major = #{major,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorpm() != null) {
            SET("majorpm = #{majorpm,jdbcType=INTEGER}");
        }
        
        if (record.getCertificate() != null) {
            SET("certificate = #{certificate,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            SET("level = #{level,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkexp() != null) {
            SET("workexp = #{workexp,jdbcType=VARCHAR}");
        }
        
        if (record.getPpath() != null) {
            SET("ppath = #{ppath,jdbcType=VARCHAR}");
        }
        
        if (record.getRpath() != null) {
            SET("rpath = #{rpath,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            SET("uid = #{uid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            SET("role = #{role,jdbcType=VARCHAR}");
        }
        
        WHERE("rid = #{rid,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(ResumeExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}