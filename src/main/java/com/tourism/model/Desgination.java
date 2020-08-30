package com.tourism.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "desgination")
public class Desgination {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "destName")
	private String destName;

	@Column(name = "location")
	private String location;
	@Column(name = "description")
	private String description;
	@Column(name = "primaryImage")
	private String primaryImage;

	@Column(name = "otherImage1")
	private String otherImage1;
	@Column(name = "otherImage2")
	private String otherImage2;
	@Column(name = "otherImage3")
	private String otherImage3;
	@Column(name = "otherImage4")
	private String otherImage4;

	@Column(name = "maps")
	private String maps;
	@Column(name = "primaryTag")
	private String primaryTag;
	@Column(name = "secondaryTag")
	private String secondaryTag;

	public Desgination() {
		super();
	}

	public Desgination(long id, String destName, String location, String description, String primaryImage,
			String otherImage1, String otherImage2, String otherImage3, String otherImage4, String maps,
			String primaryTag, String secondaryTag) {
		super();
		this.id = id;
		this.destName = destName;
		this.location = location;
		this.description = description;
		this.primaryImage = primaryImage;
		this.otherImage1 = otherImage1;
		this.otherImage2 = otherImage2;
		this.otherImage3 = otherImage3;
		this.otherImage4 = otherImage4;
		this.maps = maps;
		this.primaryTag = primaryTag;
		this.secondaryTag = secondaryTag;
	}

	@Override
	public String toString() {
		return "Tourism [id=" + id + ", destName=" + destName + ", location=" + location + ", description="
				+ description + ", primaryImage=" + primaryImage + ", otherImage1=" + otherImage1 + ", otherImage2="
				+ otherImage2 + ", otherImage3=" + otherImage3 + ", otherImage4=" + otherImage4 + ", maps=" + maps
				+ ", primaryTag=" + primaryTag + ", secondaryTag=" + secondaryTag + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDestName() {
		return destName;
	}

	public void setDestName(String destName) {
		this.destName = destName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrimaryImage() {
		return primaryImage;
	}

	public void setPrimaryImage(String primaryImage) {
		this.primaryImage = primaryImage;
	}

	public String getOtherImage1() {
		return otherImage1;
	}

	public void setOtherImage1(String otherImage1) {
		this.otherImage1 = otherImage1;
	}

	public String getOtherImage2() {
		return otherImage2;
	}

	public void setOtherImage2(String otherImage2) {
		this.otherImage2 = otherImage2;
	}

	public String getOtherImage3() {
		return otherImage3;
	}

	public void setOtherImage3(String otherImage3) {
		this.otherImage3 = otherImage3;
	}

	public String getOtherImage4() {
		return otherImage4;
	}

	public void setOtherImage4(String otherImage4) {
		this.otherImage4 = otherImage4;
	}

	public String getMaps() {
		return maps;
	}

	public void setMaps(String maps) {
		this.maps = maps;
	}

	public String getPrimaryTag() {
		return primaryTag;
	}

	public void setPrimaryTag(String primaryTag) {
		this.primaryTag = primaryTag;
	}

	public String getSecondaryTag() {
		return secondaryTag;
	}

	public void setSecondaryTag(String secondaryTag) {
		this.secondaryTag = secondaryTag;
	}
}
