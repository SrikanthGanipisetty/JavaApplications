package com.bharath.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
