package jimbae.jenkins.ci_test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Value("${app.version}")
	private String version;

	@GetMapping("/")
	public ResponseEntity main(){

		return ResponseEntity.ok(version);

	}

}
