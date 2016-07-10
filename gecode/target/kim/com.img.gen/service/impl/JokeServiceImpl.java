package com.img.gen.service.impl;

import java.util.List;
import com.img.gen.service.impl.service.Joke;
import com.img.gen.service.impl.dao.JokeDao;
import com.img.gen.service.impl.model.Joke;

import org.springframework.stereotype.Repository;

/**
 * dal Interface:Joke
 * @author kim
 * @date 2016-7-10
 */
public class JokeServiceImpl implements JokeService{

    @Autowired
    private JokeDao jokeDao;

    public List<Joke> findAll() {
       return jokeDao.selectAll();
    }

    public List<Joke> findJokes(Joke record){
       return jokeDao.select(record);
    }

    public Joke getJokeByPrimaryKey(Object key){
        return jokeDao.selectByPrimaryKey(key);
    }

    public Integer createJoke(Joke record){
        return jokeDao.insert(record);

    }

    public Integer deleteJoke(Joke record){
        return jokeDao.delete(record);
    }

    public Integer removeJoke(Joke record){
        return jokeDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateJokeByPrimaryKey(Joke record){
        return jokeDao.updateByPrimaryKeySelective(record);
    }

}