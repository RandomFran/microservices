package com.example.bikeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bikeservice.entity.Bike;
import com.example.bikeservice.repository.BikeRepository;

@Service
public class BikeService {

	@Autowired
	BikeRepository bikeRepository;

	public List<Bike> getAll() {

		return bikeRepository.findAll();

	}

	public Bike getBikeById(int id) {

		return bikeRepository.findById(id).orElse(null);

	}

	public Bike save(Bike bike) {

		Bike bikeNew = bikeRepository.save(bike);

		return bikeNew;

	}

	public List<Bike> byUserId(int userId) {

		return bikeRepository.findByUserId(userId);
	}

}
