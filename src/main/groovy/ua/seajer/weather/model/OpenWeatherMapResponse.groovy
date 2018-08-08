package ua.seajer.weather.model

class OpenWeatherMapResponse {

    private Integer cod
    private String message
    private Integer cnt
    private List<WeatherData> list
    private City city

    Integer getCod() {
        return cod
    }

    void setCod(Integer cod) {
        this.cod = cod
    }

    String getMessage() {
        return message
    }

    void setMessage(String message) {
        this.message = message
    }

    Integer getCnt() {
        return cnt
    }

    void setCnt(Integer cnt) {
        this.cnt = cnt
    }

    List<WeatherData> getList() {
        return list
    }

    void setList(List<WeatherData> list) {
        this.list = list
    }

    City getCity() {
        return city
    }

    void setCity(City city) {
        this.city = city
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OpenWeatherMapResponse{");
        sb.append("cod=").append(cod);
        sb.append(", message='").append(message).append('\'');
        sb.append(", cnt=").append(cnt);
        sb.append(", list=").append(list);
        sb.append(", city=").append(city);
        sb.append('}');
        return sb.toString();
    }
}
