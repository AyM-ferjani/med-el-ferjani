package com.example.med.el.ferjani;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController

class MedElFerjaniApplicationTests {
	@GetMapping("/hello")
	public String hello() {
		return "Hello freinds";
	}
	//echo "# med-el-ferjani" >> README.md
	//git init
	//git add README.md
	//git commit -m "first commit"
	//git branch -M main
	//git remote add origin https://github.com/AyM-ferjani/med-el-ferjani.git
	//git push -u origin main
	@Test
	void contextLoads() {
	}

}
