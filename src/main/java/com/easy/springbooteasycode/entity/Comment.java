package com.easy.springbooteasycode.entity;

import java.io.Serializable;

/**
 * 评论列表(Comment)实体类
 *
 * @author macia
 * @since 2022-03-08 10:20:07
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = -42266644452040599L;
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论父ID
     */
    private Long parentsId;
    /**
     * 文章id
     */
    private Long articleId;
    /**
     * 评论等级
     */
    private Long commentLevel;
    /**
     * 评论状态
     */
    private Long status;
    /**
     * 点赞数
     */
    private Long likes;
    
    private Long replayComment;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getParentsId() {
        return parentsId;
    }

    public void setParentsId(Long parentsId) {
        this.parentsId = parentsId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getCommentLevel() {
        return commentLevel;
    }

    public void setCommentLevel(Long commentLevel) {
        this.commentLevel = commentLevel;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public Long getReplayComment() {
        return replayComment;
    }

    public void setReplayComment(Long replayComment) {
        this.replayComment = replayComment;
    }

}

