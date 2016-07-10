package com.img.gen.dao.userInfo;

import java.util.List;
import com.img.gen.dao.userInfo.model.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * dal Interface:UserInfo
 * @author kim
 * @date 2016-7-10
 */
public interface UserInfoDao {

    List<UserInfo> selectAll();

    List<UserInfo> select(UserInfo record);

    Integer getCount(UserInfo record);

    UserInfo selectByPrimaryKey(Object key);

    Integer insert(UserInfo record);

    Integer insertSelective(UserInfo record);

    Integer delete(UserInfo record);

    Integer deleteByPrimaryKey(Object key);

    Integer updateByPrimaryKey(UserInfo record);

    Integer updateByPrimaryKeySelective(UserInfo record);

}