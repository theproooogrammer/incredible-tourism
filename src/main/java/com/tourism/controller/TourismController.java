package com.tourism.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tourism.dto.DesginationDTO;
import com.tourism.model.Desgination;
import com.tourism.service.TourismService;

@Controller
public class TourismController {

	@Autowired
	private TourismService tourismService;

	// This function sets-up the home page.
	@RequestMapping(value = { "/", "homepage" }, method = RequestMethod.GET)
	public String homePage(Model model) {

		System.out.println("homePage  ");

		// =========================================================================
		// This is for random image generation and to show distinct tag on home page.
		// =========================================================================
		List<String> list = new ArrayList<String>();
		DesginationDTO desginationDTO = new DesginationDTO();

		// this function get distinct tags from db and return only tags in string.
		List<String> tags = tourismService.getAllTags();
		// this is use for random img for the home page.
		List<Desgination> img = null;

		// By using for loop iterating 'tag' obj which has all the tags present.
		for (String string : tags) {
			// single tag is passed to the function getRandomImgByTag(), this return and
			// list of type
			// desgination . Further this obj 'img' is iterated to get primayImg from obj.
			img = tourismService.getRandomImgByTag(string);
			for (Desgination desgination : img) {
				// this function add the primaryiMg fetch to list and this list is further set
				// in DTO
				list.add(desgination.getPrimaryImage());
			}
		}

		desginationDTO.setGetAllTags(tags);
		desginationDTO.setGetRandomImgOnTag(list);

		/*
		 * for (String desgination : desginationDTO.getGetAllTags()) {
		 * System.out.println("1st for " + desgination); }
		 * 
		 * for (String desgination : desginationDTO.getGetRandomImgOnTag()) {
		 * System.out.println("2st for " + desgination); }
		 */

		model.addAttribute("desginationDTO", desginationDTO);

		// =====================================================================
		// this show must places to visit based on Any random 8 destination
		// =====================================================================

		List<Desgination> desginations = tourismService.get8RandomDest();
		desginationDTO.setAllDesgination(desginations);

		/*
		 * for (Desgination desgination : desginationDTO.getAllDesgination()) {
		 * System.out.println("for in service "+desgination.getDestName()); }
		 */

		model.addAttribute("desginationDTO", desginationDTO);
		return "home-page";
	}

	// ==================================================================================
	// For getting destination for tags and single-destination
	// ==================================================================================

	// the name in the path variable can be different than the mentioned in the jsp.
	@RequestMapping(value = "/single-item-{destName}")
	public String singleItemPage(@PathVariable("destName") String destName, Model model) {

		List<Desgination> desgination = tourismService.singleItemPage(destName);

		DesginationDTO desginationDTO = new DesginationDTO();

		for (Desgination desgination2 : desgination) {
			desginationDTO.setDestName(desgination2.getDestName());
			desginationDTO.setLocation(desgination2.getLocation());
			desginationDTO.setDescription(desgination2.getDescription());
			desginationDTO.setPrimaryTag(desgination2.getPrimaryTag());
			desginationDTO.setPrimaryImage(desgination2.getPrimaryImage());

			desginationDTO.setOtherImage1(desgination2.getOtherImage1());
			desginationDTO.setOtherImage2(desgination2.getOtherImage2());
			desginationDTO.setOtherImage3(desgination2.getOtherImage3());
			desginationDTO.setOtherImage4(desgination2.getOtherImage4());
			
			desginationDTO.setOtherImage4(desgination2.getMaps());
		}
		/*
		 * System.out.println("singleItemPage  " + desginationDTO.getDestName());
		 * System.out.println("singleItemPage  " + desginationDTO.getLocation());
		 * System.out.println("singleItemPage  " + desginationDTO.getDescription());
		 * System.out.println("singleItemPage  " + desginationDTO.getPrimaryImage());
		 */
		model.addAttribute("desginationDTO", desginationDTO);

		return "single-item";
	}

	// this pass parameter name should be same as mentioned in jsp page.
	@RequestMapping(value = "/tag-{string}", method = RequestMethod.GET)
	public String groupedItemPage(@PathVariable("string") String tag, DesginationDTO desginationDTO, Model model) {

		// this function return all the destinations based on group by tag criteria
		List<Desgination> desgination = tourismService.groupedItemPage(tag);

		desginationDTO.setPrimaryTag(tag);

		desginationDTO.setAllDesgination(desgination);
		model.addAttribute("desginationDTO", desginationDTO);

		return "grouped-items";
	}

	// =====================================================================================
	// SEARCH OPRATIONS
	// =====================================================================================

	@RequestMapping(value = "/search")
	public String searchDestination(DesginationDTO desginationDTO, Model model) {

		String tag = "";
		String curDest = "";
		List<Desgination> search = tourismService.getSearchResult(desginationDTO.getSearch());
		desginationDTO.setAllDesgination(search);
		for (Desgination desgination : search) {
			System.out.println("Search Result" + desgination);
			curDest = desgination.getDestName();
			tag = desgination.getPrimaryTag();
		}

		model.addAttribute("search", desginationDTO);

		DesginationDTO recom = new DesginationDTO();
		List<Desgination> recommendation = tourismService.recommedation(tag);

		// This is to prevent adding the resulted destination in the recommendation
		// The condition checks for the search result and in the list and eliminate the
		// searched ones.
		Iterator<Desgination> itr = recommendation.iterator();
		while (itr.hasNext()) {
			Desgination x = itr.next();
			if (x.getDestName().equals(curDest))
				itr.remove();
		}

		for (Desgination desgination : recommendation) {
			System.out.println("recommendation" + desgination.getDestName());
		}
		recom.setAllDesgination(recommendation);
		model.addAttribute("recommendation", recom);

		return "search";
	}

	// =====================================================================================
	// SEARCH OPRATIONS
	// =====================================================================================

	public List<Desgination> recommedation(String tag) {

		return null;

	}
	// =====================================================================================
	// CURD OPRATIONS
	// =====================================================================================

	// THis function redirect to admin page which enables admin to add update or
	// delete destinations. This function gets all the destination present in the
	// database and display those.
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String getAllDesgination(DesginationDTO desginationDTO, Model model) {

		List<Desgination> desginations = tourismService.getAllDesgination();
		desginationDTO.setAllDesgination(desginations);
		model.addAttribute("AllDesgination", desginationDTO);
		return "admin-page";
	}

	// this function redirect to add-destination view
	@RequestMapping(value = "/adddestination", method = RequestMethod.GET)
	public String addDesgination() {
		return "add-destination";
	}

	// THis function gets all the values from view which are set in desginationDTO
	// object further this values are set in Form bin which further gets insert in
	// database through hibernate

	@RequestMapping(value = "/savedesgination", method = RequestMethod.POST)
	public String insertDesgination(DesginationDTO desginationDTO, Model model) {

		Desgination desgination = new Desgination();

		desgination.setId(desginationDTO.getId());
		desgination.setDestName(desginationDTO.getDestName());

		desgination.setLocation(desginationDTO.getLocation());
		desgination.setDescription(desginationDTO.getDescription());

		desgination.setPrimaryImage(desginationDTO.getPrimaryImage());
		desgination.setOtherImage1(desginationDTO.getOtherImage1());
		desgination.setOtherImage2(desginationDTO.getOtherImage2());
		desgination.setOtherImage3(desginationDTO.getOtherImage3());
		desgination.setOtherImage4(desginationDTO.getOtherImage4());

		desgination.setMaps(desginationDTO.getMaps());

		desgination.setPrimaryTag(desginationDTO.getPrimaryTag());
		desgination.setSecondaryTag(desginationDTO.getSecondaryTag());

		tourismService.addDesgination(desgination);

		return "success";
	}

	// This get a single record based upon 'id'.
	public Desgination getDestination(long id) {
		return tourismService.getDestination(id);
	}

	// This Take id as a parameter which is to be update and after getting that
	// particular destination set that destination object into model object.
	@RequestMapping(value = "/edit-destination-{id}")
	public String editDetination(@PathVariable("id") long id, Model model) {

		Desgination desgination = getDestination(id);
		model.addAttribute("destination", desgination);
		return "edit-destination";
	}

	// This function that the object which is set in model class and display those
	// properties in view. After update the information is done this function update
	// the record in database.

	@RequestMapping(value = "/update-destination", method = RequestMethod.POST)
	public String updateDestination(@Valid @ModelAttribute("destination") Desgination desgination,
			BindingResult bindingResult) {

		long id = desgination.getId();
		tourismService.updateDestination(id, desgination);

		return "success";

	}
	
	@RequestMapping(value = "/delete-destination-{id}")
	public String deleteDestination(@PathVariable("id") long id) {
		tourismService.deleteDestination(id);
		return "success";
	}

}
