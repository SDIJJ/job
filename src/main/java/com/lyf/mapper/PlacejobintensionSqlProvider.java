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

import com.lyf.model.Placejobintension;
import com.lyf.model.PlacejobintensionExample.Criteria;
import com.lyf.model.PlacejobintensionExample.Criterion;
import com.lyf.model.PlacejobintensionExample;
import java.util.List;
import java.util.Map;

public class PlacejobintensionSqlProvider {

    public String countByExample(PlacejobintensionExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("placejobintension");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(PlacejobintensionExample example) {
        BEGIN();
        DELETE_FROM("placejobintension");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Placejobintension record) {
        BEGIN();
        INSERT_INTO("placejobintension");
        
        if (record.getPlaceid() != null) {
            VALUES("placeid", "#{placeid,jdbcType=INTEGER}");
        }
        
        if (record.getPlacename() != null) {
            VALUES("placename", "#{placename,jdbcType=VARCHAR}");
        }
        
        if (record.getPlacescore() != null) {
            VALUES("placescore", "#{placescore,jdbcType=INTEGER}");
        }
        
        if (record.getJid() != null) {
            VALUES("jid", "#{jid,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(PlacejobintensionExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("placeid");
        } else {
            SELECT("placeid");
        }
        SELECT("placename");
        SELECT("placescore");
        SELECT("jid");
        FROM("placejobintension");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Placejobintension record = (Placejobintension) parameter.get("record");
        PlacejobintensionExample example = (PlacejobintensionExample) parameter.get("example");
        
        BEGIN();
        UPDATE("placejobintension");
        
        if (record.getPlaceid() != null) {
            SET("placeid = #{record.placeid,jdbcType=INTEGER}");
        }
        
        if (record.getPlacename() != null) {
            SET("placename = #{record.placename,jdbcType=VARCHAR}");
        }
        
        if (record.getPlacescore() != null) {
            SET("placescore = #{record.placescore,jdbcType=INTEGER}");
        }
        
        if (record.getJid() != null) {
            SET("jid = #{record.jid,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("placejobintension");
        
        SET("placeid = #{record.placeid,jdbcType=INTEGER}");
        SET("placename = #{record.placename,jdbcType=VARCHAR}");
        SET("placescore = #{record.placescore,jdbcType=INTEGER}");
        SET("jid = #{record.jid,jdbcType=INTEGER}");
        
        PlacejobintensionExample example = (PlacejobintensionExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Placejobintension record) {
        BEGIN();
        UPDATE("placejobintension");
        
        if (record.getPlacename() != null) {
            SET("placename = #{placename,jdbcType=VARCHAR}");
        }
        
        if (record.getPlacescore() != null) {
            SET("placescore = #{placescore,jdbcType=INTEGER}");
        }
        
        if (record.getJid() != null) {
            SET("jid = #{jid,jdbcType=INTEGER}");
        }
        
        WHERE("placeid = #{placeid,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(PlacejobintensionExample example, boolean includeExamplePhrase) {
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