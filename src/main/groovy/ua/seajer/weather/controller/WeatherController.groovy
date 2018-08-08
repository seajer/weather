package ua.seajer.weather.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ua.seajer.weather.job.JobRunner

@RestController
class WeatherController {

    @Autowired
    JobRunner jobRunner

    @GetMapping
    void getSth(){
        jobRunner.getData()
    }
}
