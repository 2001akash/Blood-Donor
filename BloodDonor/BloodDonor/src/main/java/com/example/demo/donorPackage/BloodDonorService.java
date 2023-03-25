package com.example.demo.donorPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DonorRepository;

@Service
public class BloodDonorService {
	@Autowired
	DonorRepository donorRepository;
	
	private ArrayList<BloodDonor> donors= new ArrayList<BloodDonor>(
			Arrays.asList(
			new BloodDonor("1","Satyam","Gaya","AB+","Bihar","6207621814"),
			new BloodDonor("2","Shivam","patna","O+","Bihar","7903124074"),
			new BloodDonor("3","Aditya","Patna","A+","Bihar","2698706589")
			));

	public List<BloodDonor> getAllDonor() {
		// TODO Auto-generated method stub
		List<BloodDonor> donors = new ArrayList<>();
		donorRepository.findAll().forEach(donors::add);
		return donors;
	}

	public void addDonor(BloodDonor don) {
		// TODO Auto-generated method stub
		donorRepository.save(don);
	}

//	public Optional<BloodDonor> searchDonor(String id) {
//		// TODO Auto-generated method stub
//		
//		return donorRepository.findById(id);
//		
//		
//	}
	// search all donar belongs to same city

	public List<BloodDonor> searchDonorByCity(String cityName) {
		// TODO Auto-generated method stub
		List<BloodDonor> donorList = new ArrayList<>();
//		donorList.add(donors.stream().filter(city->city.getD_city().equalsIgnoreCase(cityName)).findAny().get());
		for(int i=0;i<donors.size();i++){
			BloodDonor b= donors.get(i);
			if(b.getD_city().equalsIgnoreCase(cityName)) {
				donorList.add(b);
			}
		}
		return donorList;
	}

	// search donor by mobile number
	
	public BloodDonor searchByMobile(String mobile) {
		// TODO Auto-generated method stub
		
		return donors.stream().filter(mob->mob.getD_MobileNo().equals(mobile)).findFirst().get();
	}
//		To Update Donor Detail by ID
	
	public void updateDonor(BloodDonor don) {
		// TODO Auto-generated method stub
//		
//		for(int i =0; i<donors.size();i++) {
//			BloodDonor db = donors.get(i);
//			if(db.getD_id().equals(id)) {
//				donors.set(i,don);
//			}
//		}
		
		donorRepository.save(don);
		
		//TO Delete Donor Detail By ID
	}

	public void removeDonor(String id) {
		// TODO Auto-generated method stub
		
//		for(int i =0; i<donors.size();i++) {
//			BloodDonor db = donors.get(i);
//			if(db.getD_id().equals(id)) {
//				donors.remove(i);
//			}
//		}
		
		//delete from database
		
		donorRepository.deleteById(id);
		
	}

	public List<BloodDonor> searchByBg(String bg) {
		// TODO Auto-generated method stub
		List<BloodDonor> donorList = new ArrayList<>();
		for(int i=0;i<donors.size();i++){
			BloodDonor b= donors.get(i);
			if(b.getD_bloodGroup().equalsIgnoreCase(bg)) {
				donorList.add(b);
			}
		}
		return donorList;
	}
	
	
	

}
