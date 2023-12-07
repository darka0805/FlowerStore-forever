package ucu.edu.apps.flowerstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class DHLController {
    @GetMapping("/dhl")
    public String getDHL() {
        return "DHL!";
    }
}
