package davetcode.lxi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping()
public class HealthcheckController {
  
  @GetMapping(path = "/status", produces = "text/plain")
  public String Execute() {
    return "Healthy";
  }
}
