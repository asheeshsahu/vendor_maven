package com.cts.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.entity.Product;
import com.cts.entity.Vendor;
import com.cts.service.VendorService;

@Controller
public class VendorController {
	
	@Autowired
	VendorService vendorService;

	public VendorController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/listvendor")
	public String listAllVendor(Model model) {
		System.out.println("entered in list a book");
		List<Vendor> listVendor = vendorService.listallVendor();
		System.out.println("ProductList :" + listVendor);
		model.addAttribute("vendor", listVendor);
		return "vendorList";
	}
	
	@GetMapping("/showVendor")
	public String showFormForAdd(Model themodel)
	{
		System.out.println("I will accept book data");
		Vendor vendor = new Vendor();
		themodel.addAttribute("vendor", vendor);
		return "addVendor";
	}
	
	@PostMapping("/saveVendor")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor)
	{
		System.out.println("this is save book"+vendor);
		vendorService.saveVendor(vendor);
		return "redirect:/listvendor";
	}
	
	@GetMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("vendor_id") int id)
	{
		vendorService.deleteVendor(id);
		System.out.println("Product is deleted");
		return "redirect:/listvendor";
	}
	
	@GetMapping("/updateVendor")
	public String updateVendor(@RequestParam("vendor_id") int id, Model theModel)
	{
		System.out.println("Vendor Id"+id);
		//Book theBook = bookService.getBook(id);
		//System.out.println(theBook);
		Vendor vendor=new Vendor();
		vendor.setVendor_id(id);
		theModel.addAttribute("vendor", vendor);
		return "addVendor";
	}
	
//	@RequestMapping(value="/logout", method=RequestMethod.GET)  
//    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {  
//	  System.out.println("logout ho gya");
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
//        if (auth != null){      
//           new SecurityContextLogoutHandler().logout(request, response, auth);  
//        }  
//         return "redirect:/login";  
//     }  
	
	 @GetMapping("/viewVendor")
		public String viewProduct(@RequestParam("vendor_id") int id, Model theModel)
		{
			System.out.println("Vendor Id"+id);
			//Book theBook = bookService.getBook(id);
			//System.out.println(theBook);
			Vendor vendor=vendorService.getVendor(id);
			theModel.addAttribute("vendor", vendor);
			return "viewVendor";
		}
}
