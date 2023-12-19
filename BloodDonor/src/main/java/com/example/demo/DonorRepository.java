package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.donorPackage.BloodDonor;

@Repository
public interface DonorRepository extends CrudRepository<BloodDonor,String> {



}
