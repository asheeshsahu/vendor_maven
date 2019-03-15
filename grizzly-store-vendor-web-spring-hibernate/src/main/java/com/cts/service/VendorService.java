package com.cts.service;

import java.util.List;

import com.cts.entity.Vendor;

public interface VendorService {
	void saveVendor(Vendor vendor);
	List<Vendor> listallVendor();
	Vendor getVendor(int Id);
	void deleteVendor(int Id);
}
