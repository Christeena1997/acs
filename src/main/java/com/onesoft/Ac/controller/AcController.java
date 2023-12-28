package com.onesoft.Ac.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.Ac.Entity.Ac;
import com.onesoft.Ac.Service.AcService;

@RestController
@RequestMapping(value = "/follow")
public class AcController {
	@Autowired
	AcService er;

	@PostMapping(value = "/setdata")
	public String setData(@RequestBody List<Ac> e) {
		return er.setData(e);
	}

	@PostMapping(value = "/setdate")
	public String setDate(@RequestBody Ac f) {
		return er.setDate(f);
	}

	@PutMapping(value = "/setdat")
	public String setDat(@RequestBody Ac g) {
		return er.setDat(g);
	}
static Logger log=Logger.getLogger(AcController.class);
	@GetMapping(value = "/zzz/{id}")
	public Ac setDa(@PathVariable int id) {
		PropertyConfigurator.configure("log4j.properties");
		log.info(er.setDa(id));
		return er.setDa(id);
	}
	@GetMapping(value="/ttt/{name}")
	public List<Ac>set(@PathVariable String name){
		return er.set(name);
	}
	@GetMapping(value = "/zzzz/{id}")
	public String setDatt(@PathVariable int id) {
		return er.setDatt(id);
}
}