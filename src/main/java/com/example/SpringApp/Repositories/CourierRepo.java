package com.example.SpringApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringApp.Model.Courier;

public interface CourierRepo extends JpaRepository<Courier, Integer>{

}
