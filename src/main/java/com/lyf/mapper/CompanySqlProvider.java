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

import com.lyf.model.Company;
import com.lyf.model.CompanyExample.Criteria;
import com.lyf.model.CompanyExample.Criterion;
import com.lyf.model.CompanyExample;
import java.util.List;
import java.util.Map;

public class CompanySqlProvider {

    public String countByExample(CompanyExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("company");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(CompanyExample example) {
        BEGIN();
        DELETE_FROM("company");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Company record) {
        BEGIN();
        INSERT_INTO("company");
        
        if (record.getCid() != null) {
            VALUES("cid", "#{cid,jdbcType=INTEGER}");
        }
        
        if (record.getCname() != null) {
            VALUES("cname", "#{cname,jdbcType=VARCHAR}");
        }
        
        if (record.getTypename() != null) {
            VALUES("typename", "#{typename,jdbcType=VARCHAR}");
        }
        
        if (record.getCintroduce() != null) {
            VALUES("cintroduce", "#{cintroduce,jdbcType=VARCHAR}");
        }
        
        if (record.getCphotopath() != null) {
            VALUES("cphotopath", "#{cphotopath,jdbcType=VARCHAR}");
        }
        
        if (record.getPosition() != null) {
            VALUES("position", "#{position,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace() != null) {
            VALUES("place", "#{place,jdbcType=VARCHAR}");
        }
        
        if (record.getSkillneed() != null) {
            VALUES("skillNeed", "#{skillneed,jdbcType=VARCHAR}");
        }
        
        if (record.getOthers() != null) {
            VALUES("others", "#{others,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(CompanyExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("cid");
        } else {
            SELECT("cid");
        }
        SELECT("cname");
        SELECT("typename");
        SELECT("cintroduce");
        SELECT("cphotopath");
        SELECT("position");
        SELECT("place");
        SELECT("skillNeed");
        SELECT("others");
        SELECT("uid");
        SELECT("username");
        FROM("company");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Company record = (Company) parameter.get("record");
        CompanyExample example = (CompanyExample) parameter.get("example");
        
        BEGIN();
        UPDATE("company");
        
        if (record.getCid() != null) {
            SET("cid = #{record.cid,jdbcType=INTEGER}");
        }
        
        if (record.getCname() != null) {
            SET("cname = #{record.cname,jdbcType=VARCHAR}");
        }
        
        if (record.getTypename() != null) {
            SET("typename = #{record.typename,jdbcType=VARCHAR}");
        }
        
        if (record.getCintroduce() != null) {
            SET("cintroduce = #{record.cintroduce,jdbcType=VARCHAR}");
        }
        
        if (record.getCphotopath() != null) {
            SET("cphotopath = #{record.cphotopath,jdbcType=VARCHAR}");
        }
        
        if (record.getPosition() != null) {
            SET("position = #{record.position,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace() != null) {
            SET("place = #{record.place,jdbcType=VARCHAR}");
        }
        
        if (record.getSkillneed() != null) {
            SET("skillNeed = #{record.skillneed,jdbcType=VARCHAR}");
        }
        
        if (record.getOthers() != null) {
            SET("others = #{record.others,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            SET("uid = #{record.uid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("company");
        
        SET("cid = #{record.cid,jdbcType=INTEGER}");
        SET("cname = #{record.cname,jdbcType=VARCHAR}");
        SET("typename = #{record.typename,jdbcType=VARCHAR}");
        SET("cintroduce = #{record.cintroduce,jdbcType=VARCHAR}");
        SET("cphotopath = #{record.cphotopath,jdbcType=VARCHAR}");
        SET("position = #{record.position,jdbcType=VARCHAR}");
        SET("place = #{record.place,jdbcType=VARCHAR}");
        SET("skillNeed = #{record.skillneed,jdbcType=VARCHAR}");
        SET("others = #{record.others,jdbcType=VARCHAR}");
        SET("uid = #{record.uid,jdbcType=INTEGER}");
        SET("username = #{record.username,jdbcType=VARCHAR}");
        
        CompanyExample example = (CompanyExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Company record) {
        BEGIN();
        UPDATE("company");
        
        if (record.getCname() != null) {
            SET("cname = #{cname,jdbcType=VARCHAR}");
        }
        
        if (record.getTypename() != null) {
            SET("typename = #{typename,jdbcType=VARCHAR}");
        }
        
        if (record.getCintroduce() != null) {
            SET("cintroduce = #{cintroduce,jdbcType=VARCHAR}");
        }
        
        if (record.getCphotopath() != null) {
            SET("cphotopath = #{cphotopath,jdbcType=VARCHAR}");
        }
        
        if (record.getPosition() != null) {
            SET("position = #{position,jdbcType=VARCHAR}");
        }
        
        if (record.getPlace() != null) {
            SET("place = #{place,jdbcType=VARCHAR}");
        }
        
        if (record.getSkillneed() != null) {
            SET("skillNeed = #{skillneed,jdbcType=VARCHAR}");
        }
        
        if (record.getOthers() != null) {
            SET("others = #{others,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            SET("uid = #{uid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        WHERE("cid = #{cid,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(CompanyExample example, boolean includeExamplePhrase) {
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