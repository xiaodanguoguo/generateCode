package com.img.gen.service;

import java.util.List;
import com.img.gen.service.service.UserInfo;
import com.img.gen.service.model.UserInfo;

import org.springframework.stereotype.Repository;

/**
 * dal Interface:UserInfo
 * @author kim
 * @date 2016-7-10
 */
public interface UserInfoService {

    public List<UserInfo> findAll();

    public List<UserInfo> findUserInfos(UserInfo record);

    public UserInfo getUserInfoByPrimaryKey(Object key);

    public Integer createUserInfo(UserInfo record);

    public Integer deleteUserInfo(UserInfo record);

    public Integer removeUserInfo(UserInfo record);

    public Integer updateUserInfoByPrimaryKey(UserInfo record);

}