package com.tourism.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tourism.dao.TourismDAO;
import com.tourism.model.Desgination;

@Service
public class TourismService {

	@Autowired
	TourismDAO tourismDAO;

	@Transactional
	public List<Desgination> get8RandomDest() {
		return tourismDAO.get8RandomDest();
	}

	@Transactional
	public List<Desgination> getRandomImgByTag(String tag) {
		return tourismDAO.getRandomImgByTag(tag);
	}

	@Transactional
	public List<String> getAllTags() {
		return tourismDAO.getAllTags();
	}

	// ===========================================================

	@Transactional
	public List<Desgination> groupedItemPage(String tag) {
		return tourismDAO.groupedItemPage(tag);
	}

	@Transactional
	public List<Desgination> singleItemPage(String destName) {
		return tourismDAO.singleItemPage(destName);
	}

	// ==========================================================
	// SEARCH OPRATIONS
	// ==========================================================

	@Transactional
	public List<Desgination> getSearchResult(String search) {
		return tourismDAO.getSearchResult(search);
	}
	
	@Transactional
	public List<Desgination> recommedation(String tag){
		return tourismDAO.recommedation(tag);
	}

	// ==========================================================
	// CURD OPRATIONS
	// ==========================================================

	@Transactional
	public long addDesgination(Desgination desgination) {
		return tourismDAO.addDesgination(desgination);
	}

	@Transactional
	public List<Desgination> getAllDesgination() {
		return tourismDAO.getAllDesgination();
	}

	@Transactional
	public Desgination getDestination(long id) {
		return tourismDAO.getDestination(id);
	}

	@Transactional
	public void updateDestination(long id, Desgination desgination) {
		tourismDAO.updateDestination(id, desgination);
	}
	
	@Transactional
	public void deleteDestination(long id) {
		tourismDAO.deleteDestination(id);
	}
}
