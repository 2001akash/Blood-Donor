package com.example.demo.donorPackage;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DonorRepository;

@RestController
public class BloodDonorController {

	@Autowired
	private BloodDonorService services;
	
	
	// display all donor list
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/donor/all")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<BloodDonor> getAllDonor() {
		// TODO Auto-generated constructor stub
		
		return services.getAllDonor();
		
	}
	// we can add blood donor 
	
	@RequestMapping(method=RequestMethod.POST,value="/donor/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public void addDonor(@RequestBody BloodDonor don) {
		services.addDonor(don);
	
	}
	
	
	// search for donor detail by using id
	

//           @RequestMapping("/donor/search/{id}")
//           public BloodDonor searchDonor(@PathVariable String id) {
//
//           	return services.searchDonor(id);
//           }
//	
	
	// search donors by city name
	
	
	@RequestMapping("/donor/searchByCity/{cityName}")
	public List<BloodDonor> searchDonorByCity(@PathVariable String cityName ) {
		return services.searchDonorByCity(cityName);
	}
	
	// to get donor details by Mobile no.
	
	
	@RequestMapping("/donor/searchByMobile/{mobile}")
	public BloodDonor searchByMobile(@PathVariable String mobile) {
		return services.searchByMobile(mobile);
		
	}
	
	//To Update Donor Detail by ID

	@RequestMapping(method=RequestMethod.PUT,value="/donor/update")
	@CrossOrigin(origins = "http://localhost:4200")

	public void updateDonor(@RequestBody BloodDonor don) {
		services.updateDonor(don);
	}
	
	//TO Delete Donor Detail By ID
	
	@RequestMapping(method=RequestMethod.DELETE,value="/donor/delete")
	@CrossOrigin(origins = "http://localhost:4200")

	public void removeDonor(@RequestParam String id) {
		services.removeDonor(id);
	}
	
	//To Search Donor Details by BloodGroup
	
	@RequestMapping("/donor/searchByGroup/{bg}")
	public List<BloodDonor> searchByBg(@PathVariable String bg){
		return services.searchByBg(bg);
	}

	
	
}
