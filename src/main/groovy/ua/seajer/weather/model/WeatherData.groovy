package ua.seajer.weather.model

class WeatherData {

    private long dt
    private MainInfo main
    private List<Weather> weather
    private Cloud clouds
    private Wind wind
    private Sys sys
    private String dt_txt

    long getDt() {
        return dt
    }

    void setDt(long dt) {
        this.dt = dt
    }

    MainInfo getMain() {
        return main
    }

    void setMain(MainInfo main) {
        this.main = main
    }

    List<Weather> getWeather() {
        return weather
    }

    void setWeather(List<Weather> weather) {
        this.weather = weather
    }

    Cloud getClouds() {
        return clouds
    }

    void setClouds(Cloud clouds) {
        this.clouds = clouds
    }

    Wind getWind() {
        return wind
    }

    void setWind(Wind wind) {
        this.wind = wind
    }

    Sys getSys() {
        return sys
    }

    void setSys(Sys sys) {
        this.sys = sys
    }

    String getDt_txt() {
        return dt_txt
    }

    void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeatherData{");
        sb.append("dt=").append(dt);
        sb.append(", main=").append(main);
        sb.append(", weather=").append(weather);
        sb.append(", clouds=").append(clouds);
        sb.append(", wind=").append(wind);
        sb.append(", sys=").append(sys);
        sb.append(", dt_txt='").append(dt_txt).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
