package com.jyw.springboot.mapper;

import com.jyw.springboot.model.User;
import com.jyw.springboot.model.UserExample.Criteria;
import com.jyw.springboot.model.UserExample.Criterion;
import com.jyw.springboot.model.UserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    public String countByExample(UserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_basic_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_basic_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_basic_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUid() != null) {
            sql.VALUES("uid", "#{uid,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPwd() != null) {
            sql.VALUES("pwd", "#{pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getCrtTime() != null) {
            sql.VALUES("crt_time", "#{crtTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserType() != null) {
            sql.VALUES("user_type", "#{userType,jdbcType=VARCHAR}");
        }
        
        if (record.getExtraInfo() != null) {
            sql.VALUES("extra_info", "#{extraInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getHead() != null) {
            sql.VALUES("head", "#{head,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.VALUES("level", "#{level,jdbcType=VARCHAR}");
        }
        
        if (record.getBalance() != null) {
            sql.VALUES("balance", "#{balance,jdbcType=INTEGER}");
        }
        
        if (record.getNickname() != null) {
            sql.VALUES("nickname", "#{nickname,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("uid");
        sql.SELECT("username");
        sql.SELECT("pwd");
        sql.SELECT("crt_time");
        sql.SELECT("update_time");
        sql.SELECT("user_type");
        sql.SELECT("extra_info");
        sql.SELECT("head");
        sql.SELECT("level");
        sql.SELECT("balance");
        sql.SELECT("nickname");
        sql.FROM("user_basic_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserExample example = (UserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_basic_info");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getUid() != null) {
            sql.SET("uid = #{record.uid,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getPwd() != null) {
            sql.SET("pwd = #{record.pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getCrtTime() != null) {
            sql.SET("crt_time = #{record.crtTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserType() != null) {
            sql.SET("user_type = #{record.userType,jdbcType=VARCHAR}");
        }
        
        if (record.getExtraInfo() != null) {
            sql.SET("extra_info = #{record.extraInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getHead() != null) {
            sql.SET("head = #{record.head,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.SET("level = #{record.level,jdbcType=VARCHAR}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("balance = #{record.balance,jdbcType=INTEGER}");
        }
        
        if (record.getNickname() != null) {
            sql.SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("user_basic_info");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("uid = #{record.uid,jdbcType=VARCHAR}");
        sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        sql.SET("pwd = #{record.pwd,jdbcType=VARCHAR}");
        sql.SET("crt_time = #{record.crtTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("user_type = #{record.userType,jdbcType=VARCHAR}");
        sql.SET("extra_info = #{record.extraInfo,jdbcType=VARCHAR}");
        sql.SET("head = #{record.head,jdbcType=VARCHAR}");
        sql.SET("level = #{record.level,jdbcType=VARCHAR}");
        sql.SET("balance = #{record.balance,jdbcType=INTEGER}");
        sql.SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("user_basic_info");
        
        if (record.getUid() != null) {
            sql.SET("uid = #{uid,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPwd() != null) {
            sql.SET("pwd = #{pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getCrtTime() != null) {
            sql.SET("crt_time = #{crtTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserType() != null) {
            sql.SET("user_type = #{userType,jdbcType=VARCHAR}");
        }
        
        if (record.getExtraInfo() != null) {
            sql.SET("extra_info = #{extraInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getHead() != null) {
            sql.SET("head = #{head,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.SET("level = #{level,jdbcType=VARCHAR}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("balance = #{balance,jdbcType=INTEGER}");
        }
        
        if (record.getNickname() != null) {
            sql.SET("nickname = #{nickname,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserExample example, boolean includeExamplePhrase) {
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
            sql.WHERE(sb.toString());
        }
    }
}