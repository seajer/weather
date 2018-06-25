package ua.seajer.weather

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class WeatherApplication {

	static void main(String[] args) {
		def context = new SpringApplicationBuilder()
            .sources(WeatherApplication.class)
            .bannerMode(Banner.Mode.OFF)
            .run()
	    def app = context.getBean(WeatherApplication)
        app.stat()
	}

    def stat(){
        println("Hi there")
    }
}
