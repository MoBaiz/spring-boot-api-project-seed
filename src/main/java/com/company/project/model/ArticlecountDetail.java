package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "articlecount_detail")
public class ArticlecountDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ACD_project")
    private Integer acdProject;

    @Column(name = "ACD_time")
    private Date acdTime;

    @Column(name = "ACD_media")
    private Integer acdMedia;

    @Column(name = "ACD_emotion")
    private Integer acdEmotion;

    @Column(name = "ACD_original")
    private Boolean acdOriginal;

    @Column(name = "ACD_usertype")
    private Integer acdUsertype;

    @Column(name = "ACD_articlecount")
    private Integer acdArticlecount;

    @Column(name = "ACD_timestamp")
    private Long acdTimestamp;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return ACD_project
     */
    public Integer getAcdProject() {
        return acdProject;
    }

    /**
     * @param acdProject
     */
    public void setAcdProject(Integer acdProject) {
        this.acdProject = acdProject;
    }

    /**
     * @return ACD_time
     */
    public Date getAcdTime() {
        return acdTime;
    }

    /**
     * @param acdTime
     */
    public void setAcdTime(Date acdTime) {
        this.acdTime = acdTime;
    }

    /**
     * @return ACD_media
     */
    public Integer getAcdMedia() {
        return acdMedia;
    }

    /**
     * @param acdMedia
     */
    public void setAcdMedia(Integer acdMedia) {
        this.acdMedia = acdMedia;
    }

    /**
     * @return ACD_emotion
     */
    public Integer getAcdEmotion() {
        return acdEmotion;
    }

    /**
     * @param acdEmotion
     */
    public void setAcdEmotion(Integer acdEmotion) {
        this.acdEmotion = acdEmotion;
    }

    /**
     * @return ACD_original
     */
    public Boolean getAcdOriginal() {
        return acdOriginal;
    }

    /**
     * @param acdOriginal
     */
    public void setAcdOriginal(Boolean acdOriginal) {
        this.acdOriginal = acdOriginal;
    }

    /**
     * @return ACD_usertype
     */
    public Integer getAcdUsertype() {
        return acdUsertype;
    }

    /**
     * @param acdUsertype
     */
    public void setAcdUsertype(Integer acdUsertype) {
        this.acdUsertype = acdUsertype;
    }

    /**
     * @return ACD_articlecount
     */
    public Integer getAcdArticlecount() {
        return acdArticlecount;
    }

    /**
     * @param acdArticlecount
     */
    public void setAcdArticlecount(Integer acdArticlecount) {
        this.acdArticlecount = acdArticlecount;
    }

    /**
     * @return ACD_timestamp
     */
    public Long getAcdTimestamp() {
        return acdTimestamp;
    }

    /**
     * @param acdTimestamp
     */
    public void setAcdTimestamp(Long acdTimestamp) {
        this.acdTimestamp = acdTimestamp;
    }
}