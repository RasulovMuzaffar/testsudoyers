package test.sudo.sudoyers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import test.sudo.sudoyers.entity.Jobs;
import test.sudo.sudoyers.service.JobService;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobsController {
    @Autowired
    private JobService jobService;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }

    @GetMapping("/whoiam")
    public String whoIAm() {
        return "I'm Jobs controller";
    }

    @GetMapping("")
    public List<Jobs> getAllJobs() {

        return jobService.getAllJobs();
    }
}
