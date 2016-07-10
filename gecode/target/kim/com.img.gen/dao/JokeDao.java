package com.img.gen.dao.joke;

import java.util.List;
import com.img.gen.dao.joke.model.Joke;
import org.springframework.stereotype.Repository;

/**
 * dal Interface:Joke
 * @author kim
 * @date 2016-7-10
 */
public interface JokeDao {

    List<Joke> selectAll();

    List<Joke> select(Joke record);

    Integer getCount(Joke record);

    Joke selectByPrimaryKey(Object key);

    Integer insert(Joke record);

    Integer insertSelective(Joke record);

    Integer delete(Joke record);

    Integer deleteByPrimaryKey(Object key);

    Integer updateByPrimaryKey(Joke record);

    Integer updateByPrimaryKeySelective(Joke record);

}