package ua.seajer.weather.model

class Cloud {

    private long all

    long getAll() {
        return all
    }

    void setAll(long all) {
        this.all = all
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cloud{");
        sb.append("all=").append(all);
        sb.append('}');
        return sb.toString();
    }
}
