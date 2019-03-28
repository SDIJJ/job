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

import com.lyf.model.Jobintension;
import com.lyf.model.JobintensionExample.Criteria;
import com.lyf.model.JobintensionExample.Criterion;
import com.lyf.model.JobintensionExample;
import java.util.List;
import java.util.Map;

public class JobintensionSqlProvider {

    public String countByExample(JobintensionExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("jobintension");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(JobintensionExample example) {
        BEGIN();
        DELETE_FROM("jobintension");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Jobintension record) {
        BEGIN();
        INSERT_INTO("jobintension");
        
        if (record.getJid() != null) {
            VALUES("jid", "#{jid,jdbcType=INTEGER}");
        }
        
        if (record.getTypeweight() != null) {
            VALUES("typeWeight", "#{typeweight,jdbcType=INTEGER}");
        }
        
        if (record.getPlaceweight() != null) {
            VALUES("placeWeight", "#{placeweight,jdbcType=INTEGER}");
        }
        
        if (record.getAid() != null) {
            VALUES("aid", "#{aid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(JobintensionExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("jid");
        } else {
            SELECT("jid");
        }
        SELECT("typeWeight");
        SELECT("placeWeight");
        SELECT("aid");
        SELECT("username");
        FROM("jobintension");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Jobintension record = (Jobintension) parameter.get("record");
        JobintensionExample example = (JobintensionExample) parameter.get("example");
        
        BEGIN();
        UPDATE("jobintension");
        
        if (record.getJid() != null) {
            SET("jid = #{record.jid,jdbcType=INTEGER}");
        }
        
        if (record.getTypeweight() != null) {
            SET("typeWeight = #{record.typeweight,jdbcType=INTEGER}");
        }
        
        if (record.getPlaceweight() != null) {
            SET("placeWeight = #{record.placeweight,jdbcType=INTEGER}");
        }
        
        if (record.getAid() != null) {
            SET("aid = #{record.aid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("jobintension");
        
        SET("jid = #{record.jid,jdbcType=INTEGER}");
        SET("typeWeight = #{record.typeweight,jdbcType=INTEGER}");
        SET("placeWeight = #{record.placeweight,jdbcType=INTEGER}");
        SET("aid = #{record.aid,jdbcType=INTEGER}");
        SET("username = #{record.username,jdbcType=VARCHAR}");
        
        JobintensionExample example = (JobintensionExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Jobintension record) {
        BEGIN();
        UPDATE("jobintension");
        
        if (record.getTypeweight() != null) {
            SET("typeWeight = #{typeweight,jdbcType=INTEGER}");
        }
        
        if (record.getPlaceweight() != null) {
            SET("placeWeight = #{placeweight,jdbcType=INTEGER}");
        }
        
        if (record.getAid() != null) {
            SET("aid = #{aid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        WHERE("jid = #{jid,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(JobintensionExample example, boolean includeExamplePhrase) {
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