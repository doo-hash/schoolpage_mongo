package com.mockpage.schoolwebapp.schoolpage.home.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mockpage.schoolwebapp.schoolpage.home.model.Feedback;
import com.mockpage.schoolwebapp.schoolpage.home.repository.FeedbackRepository;
import com.mockpage.schoolwebapp.schoolpage.home.service.DbSequenceService;

@Controller
@RequestMapping("/home")
public class ContactFormController {

	@Autowired
	private FeedbackRepository feedbackrepo;
	
	@Autowired
	private DbSequenceService seqservice;
	
	@GetMapping("/contactus")
	public String contactus(Model model) {
		
		model.addAttribute("feedback",new Feedback());
		model.addAttribute("title_name","Contact Us");
		return "contactus";
	}
	
	@PostMapping("/contactus/save")
	public String feedbackSubmit(@Valid @ModelAttribute("feedback") Feedback feedback,
			BindingResult result) {

		if(result.hasErrors()) {
			System.out.println("errors");
			return "contactus";
		}
		feedback.setId(seqservice.getnextseq(Feedback.SEQ_KEY));
		feedbackrepo.save(feedback);

		return "redirect:/home/contactus?success";
	}
	
	@GetMapping("/contactus?success")
	public String contactussuccess(Model model) {
		
		model.addAttribute("feedback",new Feedback());
		model.addAttribute("title_name","Contact Us");
		return "contactus";
	}
}
