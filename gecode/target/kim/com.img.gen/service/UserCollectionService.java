package com.img.gen.service;

import java.util.List;
import com.img.gen.service.service.UserCollection;
import com.img.gen.service.model.UserCollection;

import org.springframework.stereotype.Repository;

/**
 * dal Interface:UserCollection
 * @author kim
 * @date 2016-7-10
 */
public interface UserCollectionService {

    public List<UserCollection> findAll();

    public List<UserCollection> findUserCollections(UserCollection record);

    public UserCollection getUserCollectionByPrimaryKey(Object key);

    public Integer createUserCollection(UserCollection record);

    public Integer deleteUserCollection(UserCollection record);

    public Integer removeUserCollection(UserCollection record);

    public Integer updateUserCollectionByPrimaryKey(UserCollection record);

}