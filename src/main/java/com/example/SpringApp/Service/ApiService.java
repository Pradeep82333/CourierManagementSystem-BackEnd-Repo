package com.example.SpringApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.SpringApp.Model.Courier;
import com.example.SpringApp.Repositories.CourierRepo;

@Service

public class ApiService {
	@Autowired
	CourierRepo stRepo;
	
	public Courier saveDetails(Courier e)
	{
		return stRepo.save(e);
	}
	public List<Courier> getDetails(){
		return stRepo.findAll();
	}
	public Courier updateDetails (Courier e1) {
		return stRepo.saveAndFlush(e1);
	}
	public void deleteDetails(int id) {
		stRepo.deleteById(id);
	}
	public List<Courier> getSorted(String field) {
		return stRepo.findAll(Sort.by(Sort.Direction.DESC,field));
	}
	
	public List<Courier> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<Courier> page =stRepo.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
}
