package ua.seajer.weather.model

class Coordinate {

    private long lat
    private long lon

    long getLat() {
        return lat
    }

    void setLat(long lat) {
        this.lat = lat
    }

    long getLon() {
        return lon
    }

    void setLon(long lon) {
        this.lon = lon
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coordinate{");
        sb.append("lat=").append(lat);
        sb.append(", lon=").append(lon);
        sb.append('}');
        return sb.toString();
    }
}
