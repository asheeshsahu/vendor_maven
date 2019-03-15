package com.cts.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vendor")
public class Vendor {
	@Id
	@Column(name = "vendor_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int vendor_id;
	
	
	@Column(name = "address")
	String address;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "contact")
	long contact;
	
	@OneToMany(mappedBy="vendor_id", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	List<Product> listProduct;
	
	public int getVendor_id() {
		return vendor_id;
	}


	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
	
	
	
	public List<Product> getListProduct() {
		return listProduct;
	}


	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}


	public Vendor(int vendor_id, String address, String name, long contact) {
		super();
		this.vendor_id = vendor_id;
		this.address = address;
		this.name = name;
		this.contact = contact;
	}
	
	
	


	public Vendor(String address, String name, long contact, List<Product> listProduct) {
		super();
		this.address = address;
		this.name = name;
		this.contact = contact;
		this.listProduct = listProduct;
	}


	public Vendor(int vendor_id, String address, String name, long contact, List<Product> listProduct) {
		super();
		this.vendor_id = vendor_id;
		this.address = address;
		this.name = name;
		this.contact = contact;
		this.listProduct = listProduct;
	}


	public Vendor(String address, String name, long contact) {
		super();
		this.address = address;
		this.name = name;
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "Vendor [vendor_id=" + vendor_id + ", address=" + address + ", name=" + name + ", contact=" + contact
				+ ", listProduct=" + listProduct + "]";
	}


	public Vendor() {
		// TODO Auto-generated constructor stub
	}

}
