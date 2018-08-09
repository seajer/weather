package ua.seajer.weather.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ua.seajer.weather.job.JobRunner
import ua.seajer.weather.service.WeatherService

@RestController
class WeatherController {

    @Autowired
    JobRunner jobRunner
    @Autowired
    WeatherService weatherService;

    @GetMapping
    void getSth(){
        jobRunner.getData()
    }
}
