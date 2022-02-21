package myproject.carrental.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myproject.carrental.business.abstracts.ColorService;
import myproject.carrental.core.utilities.results.DataResult;
import myproject.carrental.core.utilities.results.Result;
import myproject.carrental.entities.concretes.Color;

@RestController
@RequestMapping("/api/colors")
public class ColorsController {

	private ColorService colorService;

	@Autowired
	public ColorsController(ColorService colorService) {
		super();
		this.colorService = colorService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Color>> getAll(){
		return this.colorService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Color color) {
		return this.colorService.add(color);
	}
}
