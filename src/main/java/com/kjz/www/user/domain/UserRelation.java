
package com.kjz.www.user.domain;

public class UserRelation implements java.io.Serializable {
	private Integer relationId; // 关系编号
	private Integer userId; // 用户编号
	private Integer followerId; // 被关注者用户编号
	private String relationType; // 关系：关注，关注；粉丝，粉丝；
	private String tbStatus; // 状态：正常，正常；删除，删除；

	public Integer getRelationId() {
		return relationId;
	}
	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getFollowerId() {
		return followerId;
	}
	public void setFollowerId(Integer followerId) {
		this.followerId = followerId;
	}

	public String getRelationType() {
		return relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getTbStatus() {
		return tbStatus;
	}
	public void setTbStatus(String tbStatus) {
		this.tbStatus = tbStatus;
	}

}

