package com.onesoft.Ac.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.Ac.Dao.AcDao;
import com.onesoft.Ac.Entity.Ac;
@Service
public class AcService {
@Autowired
AcDao el;
	public String setData(List<Ac> e) {
		
		return el.setData(e);
	}
	public String setDate(Ac f) {
	
		return el.setDate(f);
	}
	public String setDat(Ac g) {
		
		return el.setDat(g);
	}
	public Ac setDa(int id) {
		
		return el.setDa(id);
	}
	public List<Ac> set(String name) {
		
		return el.set(name);
	}
	public String setDatt(int id) {
		
		return el.setDatt(id);
	}

}
