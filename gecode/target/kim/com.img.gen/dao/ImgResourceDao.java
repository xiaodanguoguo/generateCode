package com.img.gen.dao.imgResource;

import java.util.List;
import com.img.gen.dao.imgResource.model.ImgResource;
import org.springframework.stereotype.Repository;

/**
 * dal Interface:ImgResource
 * @author kim
 * @date 2016-7-10
 */
public interface ImgResourceDao {

    List<ImgResource> selectAll();

    List<ImgResource> select(ImgResource record);

    Integer getCount(ImgResource record);

    ImgResource selectByPrimaryKey(Object key);

    Integer insert(ImgResource record);

    Integer insertSelective(ImgResource record);

    Integer delete(ImgResource record);

    Integer deleteByPrimaryKey(Object key);

    Integer updateByPrimaryKey(ImgResource record);

    Integer updateByPrimaryKeySelective(ImgResource record);

}