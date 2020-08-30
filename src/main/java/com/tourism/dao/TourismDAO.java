package com.tourism.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.DistinctRootEntityResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tourism.dto.DesginationDTO;
import com.tourism.model.Desgination;

@Repository
public class TourismDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Desgination> get8RandomDest() {

		/*
		 * Object result = null; Session session = sessionFactory.getCurrentSession();
		 * Criteria criteria = session.createCriteria(Desgination.class);
		 * 
		 * criteria.add(Restrictions.sqlRestriction(""));
		 * criteria.setProjection(Projections.rowCount());
		 * 
		 * int count = ((Number) criteria.uniqueResult()).intValue(); if (0 != count) {
		 * int index = new Random().nextInt(count); criteria =
		 * session.createCriteria(Desgination.class);
		 * criteria.add(Restrictions.sqlRestriction("")); result =
		 * criteria.setFirstResult(index).setMaxResults(7).uniqueResult(); }
		 * 
		 * 
		 * //criteria.add(Restrictions.sqlRestriction("1=1 order RANDOM() "));
		 * //criteria.setMaxResults(7); return (List<Desgination>) result;
		 */

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Desgination.class);
		criteria.add(Restrictions.sqlRestriction("1=1 order by RANDOM() "));
		criteria.setMaxResults(7);
		return criteria.list();
	}

	public List<Desgination> getRandomImgByTag(String tag) {

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Desgination.class);
		criteria.add(Restrictions.eq("primaryTag", tag));
		criteria.add(Restrictions.sqlRestriction("1=1 order by RANDOM() "));
		criteria.setMaxResults(1);

		return criteria.list();

	}

	public List<String> getAllTags() {

		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(Desgination.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.groupProperty("primaryTag"));
		criteria.setProjection(projectionList);
		criteria.setResultTransformer(DistinctRootEntityResultTransformer.INSTANCE);
		return criteria.list();
	}

	// ===============================================================================================
	public List<Desgination> groupedItemPage(String primaryTag) {

		List<Desgination> desginations = sessionFactory.getCurrentSession()
				.createQuery("from Desgination d where d.primaryTag='" + primaryTag + "'").list();
		return desginations;
	}

	public List<Desgination> singleItemPage(String destName) {

		List<Desgination> singleItem = sessionFactory.getCurrentSession()
				.createQuery("from Desgination d where d.destName='" + destName + "'").list();
		return singleItem;
	}

	// ==========================================================
	// SEARCH OPRATIONS
	// ==========================================================

	public List<Desgination> getSearchResult(String search) {

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Desgination.class);
		// Here like() takes 1 arg as column name and 2 arg as string to be found.
		criteria.add(Restrictions.like("destName", search, MatchMode.ANYWHERE));
		return criteria.list();
	}

	public List<Desgination> recommedation(String tag) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Desgination.class);
		criteria.add(Restrictions.eq("primaryTag", tag));
		criteria.add(Restrictions.sqlRestriction("1=1 order by RANDOM() "));
		criteria.setMaxResults(4);
		return criteria.list();

	}
	// ==========================================================
	// CURD OPRATIONS
	// ==========================================================

	public long addDesgination(Desgination desgination) {
		sessionFactory.getCurrentSession().save(desgination);
		return desgination.getId();
	}

	public List<Desgination> getAllDesgination() {
		Desgination desgination = new Desgination();
		List<Desgination> desginations = sessionFactory.getCurrentSession().createQuery("from Desgination").list();

		DesginationDTO desginationDTO = new DesginationDTO();

		for (Desgination desg : desginations) {
			desginationDTO.setId(desg.getId());

			desginationDTO.setId(desg.getId());
			desginationDTO.setDestName(desg.getDestName());

			desginationDTO.setLocation(desg.getLocation());
			desginationDTO.setDescription(desg.getDescription());

			desginationDTO.setPrimaryImage(desg.getPrimaryImage());
			desginationDTO.setOtherImage1(desg.getOtherImage1());
			desginationDTO.setOtherImage2(desg.getOtherImage2());
			desginationDTO.setOtherImage3(desg.getOtherImage3());
			desginationDTO.setOtherImage4(desg.getOtherImage4());

			desginationDTO.setMaps(desg.getMaps());

			desginationDTO.setPrimaryTag(desg.getPrimaryTag());
			desginationDTO.setSecondaryTag(desg.getSecondaryTag());

		}
		return desginations;

	}

	public Desgination getDestination(long id) {
		return sessionFactory.getCurrentSession().get(Desgination.class, id);
	}

	public void updateDestination(long id, Desgination desgination) {

		Session session = sessionFactory.getCurrentSession();
		Desgination oldDesg = getDestination(id);

		oldDesg.setId(desgination.getId());
		oldDesg.setDestName(desgination.getDestName());

		oldDesg.setLocation(desgination.getLocation());
		oldDesg.setDescription(desgination.getDescription());

		oldDesg.setPrimaryImage(desgination.getPrimaryImage());
		oldDesg.setOtherImage1(desgination.getOtherImage1());
		oldDesg.setOtherImage2(desgination.getOtherImage2());
		oldDesg.setOtherImage3(desgination.getOtherImage3());
		oldDesg.setOtherImage4(desgination.getOtherImage4());

		oldDesg.setMaps(desgination.getMaps());

		oldDesg.setPrimaryTag(desgination.getPrimaryTag());
		oldDesg.setSecondaryTag(desgination.getSecondaryTag());
		session.flush();
	}

	public void deleteDestination(long id) {
		Session session = sessionFactory.getCurrentSession();
		Desgination desgination = session.get(Desgination.class, id);
		session.delete(desgination);
	}
}
