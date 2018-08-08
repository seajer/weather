package ua.seajer.weather.model

class Sys {

    private String pod

    String getPod() {
        return pod
    }

    void setPod(String pod) {
        this.pod = pod
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sys{");
        sb.append("pod='").append(pod).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
