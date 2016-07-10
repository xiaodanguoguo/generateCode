package com.img.gen.service;

import java.util.List;
import com.img.gen.service.service.Joke;
import com.img.gen.service.model.Joke;

import org.springframework.stereotype.Repository;

/**
 * dal Interface:Joke
 * @author kim
 * @date 2016-7-10
 */
public interface JokeService {

    public List<Joke> findAll();

    public List<Joke> findJokes(Joke record);

    public Joke getJokeByPrimaryKey(Object key);

    public Integer createJoke(Joke record);

    public Integer deleteJoke(Joke record);

    public Integer removeJoke(Joke record);

    public Integer updateJokeByPrimaryKey(Joke record);

}