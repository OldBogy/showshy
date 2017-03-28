package com.showshy.mapper;

import com.showshy.models.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by Administrator on 2017-03-28.
 */
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> getUserList();

    @Select("SELECT * FROM user WHERE Id = #{id}")
    User getUserById(@Param("userId") String userId);

    @Update("UPDATE user SET sex = #{sex} WHERE id = #{id}")
    void updateUserEmailById(@Param("id") String Id, @Param("sex") String sex);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void deleteUserById(@Param("id") String id);

    void insertUser(User user);
}
