package ua.seajer.weather.model

class City {

    private Integer id;
    private String name
    private Coordinate coordinate
    private String country

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Coordinate getCoordinate() {
        return coordinate
    }

    void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate
    }

    String getCountry() {
        return country
    }

    void setCountry(String country) {
        this.country = country
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", coordinate=").append(coordinate);
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
