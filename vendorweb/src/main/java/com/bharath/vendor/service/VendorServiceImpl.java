package com.bharath.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharath.vendor.entities.Vendor;
import com.bharath.vendor.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository repository;

	@Override
	public Vendor saveVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		repository.delete(vendor);
	}

	@Override
	public Vendor getVendorById(int id) {
		return repository.findOne(id);
	}

	@Override
	public List<Vendor> getAllVendors() {
		return repository.findAll();
	}

	public VendorRepository getRepository() {
		return repository;
	}

	public void setRepository(VendorRepository repository) {
		this.repository = repository;
	}

}
