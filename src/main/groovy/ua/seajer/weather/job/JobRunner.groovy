package ua.seajer.weather.job

import org.springframework.beans.factory.annotation.Value
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import ua.seajer.weather.model.OpenWeatherMapResponse

@Component
class JobRunner {

    @Value(value = '${api.url}')
    private String apiUrl
    @Value(value = '${api.city}')
    private String apiCity
    @Value(value = '${api.key}')
    private String apiKey

    static RestTemplate restTemplate = new RestTemplate();

    @Scheduled(fixedRate = 600_000l)
    getData(){
        def url = apiUrl + apiCity + apiKey
        def response = restTemplate.getForEntity(url, OpenWeatherMapResponse.class)
        println("Get data by scheduler")
    }
}
