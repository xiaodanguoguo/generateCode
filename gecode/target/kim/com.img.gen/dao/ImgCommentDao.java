package com.img.gen.dao.imgComment;

import java.util.List;
import com.img.gen.dao.imgComment.model.ImgComment;
import org.springframework.stereotype.Repository;

/**
 * dal Interface:ImgComment
 * @author kim
 * @date 2016-7-10
 */
public interface ImgCommentDao {

    List<ImgComment> selectAll();

    List<ImgComment> select(ImgComment record);

    Integer getCount(ImgComment record);

    ImgComment selectByPrimaryKey(Object key);

    Integer insert(ImgComment record);

    Integer insertSelective(ImgComment record);

    Integer delete(ImgComment record);

    Integer deleteByPrimaryKey(Object key);

    Integer updateByPrimaryKey(ImgComment record);

    Integer updateByPrimaryKeySelective(ImgComment record);

}