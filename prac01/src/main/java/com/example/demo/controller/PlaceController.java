package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.PlaceService;
import com.example.demo.vo.Place;

import lombok.Setter;

@Controller
@Setter
public class PlaceController {

	@Autowired
	private PlaceService placeS;
	
	@GetMapping("/listPlace")
	@ResponseBody
	public List<Place> findAll(){
		return placeS.findAll();
	}
	
}
