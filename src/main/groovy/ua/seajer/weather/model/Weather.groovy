package ua.seajer.weather.model

class Weather {

    private long id
    private String main
    private String description
    private String icon

    long getId() {
        return id
    }

    void setId(long id) {
        this.id = id
    }

    String getMain() {
        return main
    }

    void setMain(String main) {
        this.main = main
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }

    String getIcon() {
        return icon
    }

    void setIcon(String icon) {
        this.icon = icon
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Weather{");
        sb.append("id=").append(id);
        sb.append(", main='").append(main).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", icon='").append(icon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
