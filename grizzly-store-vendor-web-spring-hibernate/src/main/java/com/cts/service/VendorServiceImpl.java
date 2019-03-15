package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.DAO.VendorDAO;
import com.cts.entity.Product;
import com.cts.entity.Vendor;

@Service("vendorService")
public class VendorServiceImpl implements VendorService{
	
	@Autowired
	VendorDAO vendorDAO;
	
	public VendorServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void saveVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		vendorDAO.saveVendor(vendor);
	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public List<Vendor> listallVendor() {
		// TODO Auto-generated method stub
		return vendorDAO.listAllVendor();
	}

	@Override
	@Transactional
	public Vendor getVendor(int Id) {
		// TODO Auto-generated method stub
		Vendor vendor = vendorDAO.getVendor(Id);
		return vendor;
	}

	@Override
	@Transactional
	public void deleteVendor(int Id) {
		// TODO Auto-generated method stub
		vendorDAO.deleteVendor(Id);
	}

}
