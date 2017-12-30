/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.job.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.modules.sys.entity.Area;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 工作Entity
 *
 * @author jyj
 * @version 2017-12-26
 */
public class Job extends DataEntity<Job> {

    private static final long serialVersionUID = 1L;
    private Long userid;        // userid
    private Area area;        // 归属区域
    private String title;        // 标题
    private String content;        // 内容
    private String place;        // 地点
    private String wages;        // 薪资
    private String settlement;        // 0:日结，1周结，3月结
    private String welfare;        // 福利
    private String genderLimit;        // 0:不限制 1:男性 2:女性
    private String identityLimit;        // 0:不限制 1:学生
    private String ageMinLimit;        // 最小年龄限制
    private String ageMaxLimit;        // 最大年龄限制
    private Long type;        // 工作类型
    private String numberOfPeople;        // 人数限制
    private String longitude;        // 经度
    private String latitude;        // 纬度
    private Date enrollBeginDate;        // 报名开始时间
    private Date enrollEndDate;        // 报名结束时间
    private Date jobBeginDate;        // 工作开始时间
    private Date jobEndDate;        // 工作结束时间
    private String detailedDate;        // 详情时间
    private String status;        // 0:正常，1:过期，2:删除
    private String exten;        // 扩展
    private Long auditStatus;        // 审批状态

    public Job() {
        super();
    }

    public Job(String id) {
        super(id);
    }

    @NotNull(message = "userid不能为空")
    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Length(min = 1, max = 128, message = "标题长度必须介于 1 和 128 之间")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Length(min = 1, max = 255, message = "内容长度必须介于 1 和 255 之间")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Length(min = 1, max = 36, message = "地点长度必须介于 1 和 36 之间")
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getWages() {
        return wages;
    }

    public void setWages(String wages) {
        this.wages = wages;
    }

    @Length(min = 1, max = 11, message = "0:日结，1周结，3月结长度必须介于 1 和 11 之间")
    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    @Length(min = 1, max = 256, message = "福利长度必须介于 1 和 256 之间")
    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    @Length(min = 1, max = 11, message = "0:不限制 1:男性 2:女性长度必须介于 1 和 11 之间")
    public String getGenderLimit() {
        return genderLimit;
    }

    public void setGenderLimit(String genderLimit) {
        this.genderLimit = genderLimit;
    }

    @Length(min = 1, max = 11, message = "0:不限制 1:学生长度必须介于 1 和 11 之间")
    public String getIdentityLimit() {
        return identityLimit;
    }

    public void setIdentityLimit(String identityLimit) {
        this.identityLimit = identityLimit;
    }

    @Length(min = 1, max = 11, message = "最小年龄限制长度必须介于 1 和 11 之间")
    public String getAgeMinLimit() {
        return ageMinLimit;
    }

    public void setAgeMinLimit(String ageMinLimit) {
        this.ageMinLimit = ageMinLimit;
    }

    @Length(min = 1, max = 11, message = "最大年龄限制长度必须介于 1 和 11 之间")
    public String getAgeMaxLimit() {
        return ageMaxLimit;
    }

    public void setAgeMaxLimit(String ageMaxLimit) {
        this.ageMaxLimit = ageMaxLimit;
    }

    @NotNull(message = "工作类型不能为空")
    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Length(min = 1, max = 11, message = "人数限制长度必须介于 1 和 11 之间")
    public String getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(String numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message = "报名开始时间不能为空")
    public Date getEnrollBeginDate() {
        return enrollBeginDate;
    }

    public void setEnrollBeginDate(Date enrollBeginDate) {
        this.enrollBeginDate = enrollBeginDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message = "报名结束时间不能为空")
    public Date getEnrollEndDate() {
        return enrollEndDate;
    }

    public void setEnrollEndDate(Date enrollEndDate) {
        this.enrollEndDate = enrollEndDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message = "工作开始时间不能为空")
    public Date getJobBeginDate() {
        return jobBeginDate;
    }

    public void setJobBeginDate(Date jobBeginDate) {
        this.jobBeginDate = jobBeginDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message = "工作结束时间不能为空")
    public Date getJobEndDate() {
        return jobEndDate;
    }

    public void setJobEndDate(Date jobEndDate) {
        this.jobEndDate = jobEndDate;
    }

    @Length(min = 1, max = 256, message = "详情时间长度必须介于 1 和 256 之间")
    public String getDetailedDate() {
        return detailedDate;
    }

    public void setDetailedDate(String detailedDate) {
        this.detailedDate = detailedDate;
    }

    @Length(min = 1, max = 11, message = "0:正常，1:过期，2:删除长度必须介于 1 和 11 之间")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Length(min = 0, max = 32, message = "扩展长度必须介于 0 和 32 之间")
    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    @NotNull(message = "审批状态不能为空")
    public Long getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Long auditStatus) {
        this.auditStatus = auditStatus;
    }

}