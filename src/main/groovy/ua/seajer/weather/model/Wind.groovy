package ua.seajer.weather.model

class Wind {

    private long speed
    private long deg

    long getSpeed() {
        return speed
    }

    void setSpeed(long speed) {
        this.speed = speed
    }

    long getDeg() {
        return deg
    }

    void setDeg(long deg) {
        this.deg = deg
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wind{");
        sb.append("speed=").append(speed);
        sb.append(", deg=").append(deg);
        sb.append('}');
        return sb.toString();
    }
}
