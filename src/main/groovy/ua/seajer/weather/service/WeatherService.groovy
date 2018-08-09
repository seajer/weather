package ua.seajer.weather.service

import org.springframework.stereotype.Service

import javax.annotation.PostConstruct

@Service
class WeatherService {

    @PostConstruct
    initCities(){
        println("post constructor in weather service")
    }
}
