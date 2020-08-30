package com.tourism.dto;

import java.util.List;

import com.tourism.model.Desgination;

public class DesginationDTO {

	private long id;
	private String destName;

	private String location;
	private String description;

	private String primaryImage;
	private String otherImage1;
	private String otherImage2;
	private String otherImage3;
	private String otherImage4;

	private String maps;

	private String primaryTag;
	private String secondaryTag;

	private List<Desgination> allDesgination;

	private List<String> getAllTags;
	private List<String> getRandomImgOnTag;

	private String search;

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

	public List<Desgination> getAllDesgination() {
		return allDesgination;
	}

	public void setAllDesgination(List<Desgination> allDesgination) {
		this.allDesgination = allDesgination;
	}

	public List<String> getGetAllTags() {
		return getAllTags;
	}

	public void setGetAllTags(List<String> getAllTags) {
		this.getAllTags = getAllTags;
	}

	public List<String> getGetRandomImgOnTag() {
		return getRandomImgOnTag;
	}

	public void setGetRandomImgOnTag(List<String> getRandomImgOnTag) {
		this.getRandomImgOnTag = getRandomImgOnTag;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public DesginationDTO() {
		super();
	}

	public DesginationDTO(long id, String destName, String location, String description, String primaryImage,
			String otherImage1, String otherImage2, String otherImage3, String otherImage4, String maps,
			String primaryTag, String secondaryTag, List<Desgination> allDesgination, List<String> getAllTags,
			List<String> getRandomImgOnTag, String search) {
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
		this.allDesgination = allDesgination;
		this.getAllTags = getAllTags;
		this.getRandomImgOnTag = getRandomImgOnTag;
		this.search = search;
	}

	@Override
	public String toString() {
		return "DesginationDTO [id=" + id + ", destName=" + destName + ", location=" + location + ", description="
				+ description + ", primaryImage=" + primaryImage + ", otherImage1=" + otherImage1 + ", otherImage2="
				+ otherImage2 + ", otherImage3=" + otherImage3 + ", otherImage4=" + otherImage4 + ", maps=" + maps
				+ ", primaryTag=" + primaryTag + ", secondaryTag=" + secondaryTag + ", allDesgination=" + allDesgination
				+ ", getAllTags=" + getAllTags + ", getRandomImgOnTag=" + getRandomImgOnTag + ", search=" + search
				+ "]";
	}

}
