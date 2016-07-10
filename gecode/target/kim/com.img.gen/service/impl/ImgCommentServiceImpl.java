package com.img.gen.service.impl;

import java.util.List;
import com.img.gen.service.impl.service.ImgComment;
import com.img.gen.service.impl.dao.ImgCommentDao;
import com.img.gen.service.impl.model.ImgComment;

import org.springframework.stereotype.Repository;

/**
 * dal Interface:ImgComment
 * @author kim
 * @date 2016-7-10
 */
public class ImgCommentServiceImpl implements ImgCommentService{

    @Autowired
    private ImgCommentDao imgCommentDao;

    public List<ImgComment> findAll() {
       return imgCommentDao.selectAll();
    }

    public List<ImgComment> findImgComments(ImgComment record){
       return imgCommentDao.select(record);
    }

    public ImgComment getImgCommentByPrimaryKey(Object key){
        return imgCommentDao.selectByPrimaryKey(key);
    }

    public Integer createImgComment(ImgComment record){
        return imgCommentDao.insert(record);

    }

    public Integer deleteImgComment(ImgComment record){
        return imgCommentDao.delete(record);
    }

    public Integer removeImgComment(ImgComment record){
        return imgCommentDao.updateByPrimaryKeySelective(record);
    }

    public Integer updateImgCommentByPrimaryKey(ImgComment record){
        return imgCommentDao.updateByPrimaryKeySelective(record);
    }

}