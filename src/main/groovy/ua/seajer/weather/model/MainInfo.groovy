package ua.seajer.weather.model

class MainInfo {

    private long temp
    private long temp_min
    private long temp_max
    private long pressure
    private long sea_level
    private long grnd_level
    private long humidity
    private long temp_kf

    long getTemp() {
        return temp
    }

    void setTemp(long temp) {
        this.temp = temp
    }

    long getTemp_min() {
        return temp_min
    }

    void setTemp_min(long temp_min) {
        this.temp_min = temp_min
    }

    long getTemp_max() {
        return temp_max
    }

    void setTemp_max(long temp_max) {
        this.temp_max = temp_max
    }

    long getPressure() {
        return pressure
    }

    void setPressure(long pressure) {
        this.pressure = pressure
    }

    long getSea_level() {
        return sea_level
    }

    void setSea_level(long sea_level) {
        this.sea_level = sea_level
    }

    long getGrnd_level() {
        return grnd_level
    }

    void setGrnd_level(long grnd_level) {
        this.grnd_level = grnd_level
    }

    long getHumidity() {
        return humidity
    }

    void setHumidity(long humidity) {
        this.humidity = humidity
    }

    long getTemp_kf() {
        return temp_kf
    }

    void setTemp_kf(long temp_kf) {
        this.temp_kf = temp_kf
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MainInfo{");
        sb.append("temp=").append(temp);
        sb.append(", temp_min=").append(temp_min);
        sb.append(", temp_max=").append(temp_max);
        sb.append(", pressure=").append(pressure);
        sb.append(", sea_level=").append(sea_level);
        sb.append(", grnd_level=").append(grnd_level);
        sb.append(", humidity=").append(humidity);
        sb.append(", temp_kf=").append(temp_kf);
        sb.append('}');
        return sb.toString();
    }
}
