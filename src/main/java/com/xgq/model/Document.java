package com.xgq.model;

import com.xgq.dto.DocumentDto;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * Title: Document
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class Document implements Serializable {
    private Integer id = 0;
    private String name;
    private String content;
    private String title = "";
    private String keywords;
    private String description;
    private Integer typeid;
    private Integer active;
    private Integer mainLevel;
    private Date createDate;
    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getMainLevel() {
        return mainLevel;
    }

    public void setMainLevel(Integer mainLevel) {
        this.mainLevel = mainLevel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void setDefaultContent(int type) {
        switch (type){
           case 1: this.content = serviceContent;break;
            case 2: this.content = solutionContent;break;
            case 5: this.content = newsContent;break;
            case 6: this.content = companyLeftLinkContent;break;
            case 7: this.content = companyRightLinkContent;break;
        }
    }

    private static String companyRightLinkContent = "companyRightLinkContent";

    private static String companyLeftLinkContent = "companyLeftLinkContent";

    private static String serviceContent = "serviceContent";

    private static String solutionContent = "solutionContent";

    private static String newsContent = "newContent";

    public DocumentDto toDto() {
        DocumentDto documentDto = new DocumentDto();
        documentDto.setName(getName());
        documentDto.setId(getId());
        documentDto.setContent(getContent());
        return documentDto;
    }
}
