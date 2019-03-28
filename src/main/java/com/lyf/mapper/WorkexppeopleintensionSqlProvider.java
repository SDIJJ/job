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

import com.lyf.model.Workexppeopleintension;
import com.lyf.model.WorkexppeopleintensionExample.Criteria;
import com.lyf.model.WorkexppeopleintensionExample.Criterion;
import com.lyf.model.WorkexppeopleintensionExample;
import java.util.List;
import java.util.Map;

public class WorkexppeopleintensionSqlProvider {

    public String countByExample(WorkexppeopleintensionExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("workexppeopleintension");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(WorkexppeopleintensionExample example) {
        BEGIN();
        DELETE_FROM("workexppeopleintension");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Workexppeopleintension record) {
        BEGIN();
        INSERT_INTO("workexppeopleintension");
        
        if (record.getWorkexpid() != null) {
            VALUES("workexpid", "#{workexpid,jdbcType=INTEGER}");
        }
        
        if (record.getWorkexp() != null) {
            VALUES("workexp", "#{workexp,jdbcType=VARCHAR}");
        }
        
        if (record.getPlacescore() != null) {
            VALUES("placescore", "#{placescore,jdbcType=INTEGER}");
        }
        
        if (record.getPid() != null) {
            VALUES("pid", "#{pid,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(WorkexppeopleintensionExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("workexpid");
        } else {
            SELECT("workexpid");
        }
        SELECT("workexp");
        SELECT("placescore");
        SELECT("pid");
        FROM("workexppeopleintension");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Workexppeopleintension record = (Workexppeopleintension) parameter.get("record");
        WorkexppeopleintensionExample example = (WorkexppeopleintensionExample) parameter.get("example");
        
        BEGIN();
        UPDATE("workexppeopleintension");
        
        if (record.getWorkexpid() != null) {
            SET("workexpid = #{record.workexpid,jdbcType=INTEGER}");
        }
        
        if (record.getWorkexp() != null) {
            SET("workexp = #{record.workexp,jdbcType=VARCHAR}");
        }
        
        if (record.getPlacescore() != null) {
            SET("placescore = #{record.placescore,jdbcType=INTEGER}");
        }
        
        if (record.getPid() != null) {
            SET("pid = #{record.pid,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("workexppeopleintension");
        
        SET("workexpid = #{record.workexpid,jdbcType=INTEGER}");
        SET("workexp = #{record.workexp,jdbcType=VARCHAR}");
        SET("placescore = #{record.placescore,jdbcType=INTEGER}");
        SET("pid = #{record.pid,jdbcType=INTEGER}");
        
        WorkexppeopleintensionExample example = (WorkexppeopleintensionExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Workexppeopleintension record) {
        BEGIN();
        UPDATE("workexppeopleintension");
        
        if (record.getWorkexp() != null) {
            SET("workexp = #{workexp,jdbcType=VARCHAR}");
        }
        
        if (record.getPlacescore() != null) {
            SET("placescore = #{placescore,jdbcType=INTEGER}");
        }
        
        if (record.getPid() != null) {
            SET("pid = #{pid,jdbcType=INTEGER}");
        }
        
        WHERE("workexpid = #{workexpid,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(WorkexppeopleintensionExample example, boolean includeExamplePhrase) {
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