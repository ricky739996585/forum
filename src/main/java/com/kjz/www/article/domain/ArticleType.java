
package com.kjz.www.article.domain;
import java.math.BigDecimal;
import java.util.Date;

public class ArticleType implements java.io.Serializable {
	private Integer typeId; // 类型编号
	private String typeName; // 类型名称
	private String tbStatus; // 状态：正常，正常；删除，删除；

	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTbStatus() {
		return tbStatus;
	}
	public void setTbStatus(String tbStatus) {
		this.tbStatus = tbStatus;
	}

}

