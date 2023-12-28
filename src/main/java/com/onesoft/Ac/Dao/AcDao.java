package com.onesoft.Ac.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.Ac.Entity.Ac;
import com.onesoft.Ac.Repository.AcRepository;

@Repository
public class AcDao {
	@Autowired
	AcRepository er;

	public String setData(List<Ac> e) {

		er.saveAll(e);
		return "save successfully";
	}

	public String setDate(Ac f) {
		er.save(f);
		return "save success..";
	}

	public String setDat(Ac g) {
		er.save(g);
		return "update successfully";
	}

	public Ac setDa(int id) {

		return er.findById(id).get();
	}

	public List<Ac> set(String name) {

		return er.findAll();
	}

	public String setDatt(int id) {
		er.deleteById(id);
		return "deleted successfully";
	}

}
