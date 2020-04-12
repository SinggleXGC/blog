package com.xgc.blog.service;

import com.xgc.blog.po.Comment;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blodId);

    Comment saveComment(Comment comment);
}
