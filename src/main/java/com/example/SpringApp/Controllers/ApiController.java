package com.example.SpringApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.SpringApp.Model.Courier;
import com.example.SpringApp.Service.ApiService;
@RestController
@CrossOrigin
public class ApiController {
	@Autowired
	 ApiService stuService;
	 @PostMapping("/addDetails")
	 public Courier addinfo(@RequestBody Courier st) {
		 return stuService.saveDetails(st);
	 }
	 @GetMapping("fetch")
	 public List<Courier> fetchDetails(){
		 return stuService.getDetails();
	 }
	 @PutMapping("/update")
	 public Courier updateInfo (@RequestBody Courier st1 ) {
		 return stuService.updateDetails(st1);
	 }
	 @DeleteMapping("/delete/{id}")
	 public String deleteInfo(@PathVariable("id") int id) {
		 stuService.deleteDetails(id);
		 return "Details deleted success";
	 }
	 @GetMapping("/column/{field}")
		public List<Courier> getWithSort(@PathVariable String field) {
			return stuService.getSorted(field);
		}

		// pagination
		@GetMapping("/column/{offset}/{pageSize}")
		public List<Courier> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			return stuService.getWithPagination(offset, pageSize);
		}
}
