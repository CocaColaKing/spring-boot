package com.jyw.springboot.mapper;

import com.jyw.springboot.model.User;
import com.jyw.springboot.model.UserExample;
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

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from user_basic_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user_basic_info (id, uid, ",
        "username, pwd, crt_time, ",
        "update_time, user_type, ",
        "extra_info, head, ",
        "level, balance, ",
        "nickname)",
        "values (#{id,jdbcType=INTEGER}, #{uid,jdbcType=VARCHAR}, ",
        "#{username,jdbcType=VARCHAR}, #{pwd,jdbcType=VARCHAR}, #{crtTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{userType,jdbcType=VARCHAR}, ",
        "#{extraInfo,jdbcType=VARCHAR}, #{head,jdbcType=VARCHAR}, ",
        "#{level,jdbcType=VARCHAR}, #{balance,jdbcType=INTEGER}, ",
        "#{nickname,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="crt_time", property="crtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.VARCHAR),
        @Result(column="extra_info", property="extraInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="head", property="head", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.VARCHAR),
        @Result(column="balance", property="balance", jdbcType=JdbcType.INTEGER),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, uid, username, pwd, crt_time, update_time, user_type, extra_info, head, ",
        "level, balance, nickname",
        "from user_basic_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="crt_time", property="crtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.VARCHAR),
        @Result(column="extra_info", property="extraInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="head", property="head", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.VARCHAR),
        @Result(column="balance", property="balance", jdbcType=JdbcType.INTEGER),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user_basic_info",
        "set uid = #{uid,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "pwd = #{pwd,jdbcType=VARCHAR},",
          "crt_time = #{crtTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "user_type = #{userType,jdbcType=VARCHAR},",
          "extra_info = #{extraInfo,jdbcType=VARCHAR},",
          "head = #{head,jdbcType=VARCHAR},",
          "level = #{level,jdbcType=VARCHAR},",
          "balance = #{balance,jdbcType=INTEGER},",
          "nickname = #{nickname,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}