package com.img.gen.service.impl;

import java.util.List;
import com.img.gen.service.impl.service.ImgResource;
import com.img.gen.service.impl.dao.ImgResourceDao;
import com.img.gen.service.impl.model.ImgResource;

import org.springframework.stereotype.Repository;

/**
 * dal Interface:ImgResource
 * @author kim
 * @date 2016-7-10
 */
public class ImgResourceServiceImpl implements ImgResourceService{

    @Autowired
    private ImgResourceDao imgResourceDao;

    public List<ImgResource> findAll() {
       return imgResourceDao.selectAll();
    }

    public List<ImgResource> findImgResources(ImgResource record){
       return imgResourceDao.select(record);
    }

    public ImgResource getImgResourceByPrimaryKey(Object key){
        return imgResourceDao.selectByPrimaryKey(key);
    }

    public Integer createImgResource(ImgResource record){
        return imgResourceDao.insert(record);

    }

    public Integer deleteImgResource(ImgResource record){
        return imgResourceDao.delete(record);
    }

    public Integer removeImgResource(ImgResource record){
        return imgResourceDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateImgResourceByPrimaryKey(ImgResource record){
        return imgResourceDao.updateByPrimaryKeySelective(record);
    }

}