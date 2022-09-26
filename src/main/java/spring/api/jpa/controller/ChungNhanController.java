package spring.api.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.api.jpa.entity.ChungNhan;
import spring.api.jpa.repository.ChungNhanRepository;

@RestController()
public class ChungNhanController {
	@Autowired
	private ChungNhanRepository chungNhanRepository;
	@GetMapping("/findMaMBByFirstName")
	public ResponseEntity<List<String>>  findMaMBByFirstName(){
		return ResponseEntity.ok(chungNhanRepository.findMaMBByFirstName("Nguyen"));
	}
}
