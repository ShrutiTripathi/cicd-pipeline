package com.shruti.cicdpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicdPipelineApplication {
//	echo "# cicd-pipeline" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/ShrutiTripathi/cicd-pipeline.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(CicdPipelineApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome !";
	}


}
