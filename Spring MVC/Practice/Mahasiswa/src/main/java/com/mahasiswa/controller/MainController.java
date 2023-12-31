package com.mahasiswa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mahasiswa.dao.MahasiswaDAO;
import com.mahasiswa.model.Mahasiswa;

@Controller
public class MainController {

	@Autowired
	private MahasiswaDAO mahasiswaDAO;

	@RequestMapping(value = "/")
	public ModelAndView listMahasiswa(ModelAndView model) {
		List<Mahasiswa> listMahasiswa = mahasiswaDAO.list();
		model.addObject("listMahasiswa", listMahasiswa);
		model.setViewName("index");

		return model;
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Mahasiswa newMahasiswa = new Mahasiswa();
		model.addObject("mahasiswa", newMahasiswa);
		model.setViewName("mahasiswa_form");

		return model;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveMahasiswa(@ModelAttribute Mahasiswa mahasiswa ) {
		mahasiswaDAO.save(mahasiswa);
		
		return new ModelAndView("redirect:/");
	}
}
