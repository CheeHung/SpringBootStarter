package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;


@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping(path="/aliens")
	public List<Alien> getAliens() {
		return repo.findAll();
	}
	
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	@PutMapping("/alien")
	public Alien saveOrUpdateAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}

	
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable("aid") int aid) {
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";
	}
	
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAlienRest(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	
	
	
	
	
	
//	@RequestMapping("/")
//	public String home()
//
//	{
//		return "home.jsp";
//	} 
//	
//	@RequestMapping("/addAlien")
//	public String addAlien(Alien alien) {
//		repo.save(alien);
//		return "home.jsp";
//	}
//	
//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam int aid) {
//		
//		ModelAndView mv = new ModelAndView("showAlien.jsp");
//		Alien alien = repo.findById(aid).orElse(new Alien());
//		mv.addObject(alien);
//		return mv;
//	}
//	
//	@RequestMapping("/getAlienByTech")
//	public ModelAndView getAlienByTech(@RequestParam String tech) {
//		
//		ModelAndView mv = new ModelAndView("showAlien.jsp");
//		System.out.println(tech);
//		List<Alien> alien = repo.findByTech(tech);
//		System.out.println(alien);
//		System.out.println(repo.findByTechSorted(tech));
//		mv.addObject(alien.get(0));
//		return mv;
//	}
}
