package com.img.gen.dao.userCollection;

import java.util.List;
import com.img.gen.dao.userCollection.model.UserCollection;
import org.springframework.stereotype.Repository;

/**
 * dal Interface:UserCollection
 * @author kim
 * @date 2016-7-10
 */
public interface UserCollectionDao {

    List<UserCollection> selectAll();

    List<UserCollection> select(UserCollection record);

    Integer getCount(UserCollection record);

    UserCollection selectByPrimaryKey(Object key);

    Integer insert(UserCollection record);

    Integer insertSelective(UserCollection record);

    Integer delete(UserCollection record);

    Integer deleteByPrimaryKey(Object key);

    Integer updateByPrimaryKey(UserCollection record);

    Integer updateByPrimaryKeySelective(UserCollection record);

}