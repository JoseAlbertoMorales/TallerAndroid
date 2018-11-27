package forecastModels;

public class headerForecast {
    String diafecha ;
    String pronostico ;
    String icono ;
    String probLluvia ;
    String velViento ;
    String humedad ;

    public headerForecast() {
    }

    public headerForecast(String diafecha, String pronostico, String icono, String probLluvia, String velViento, String humedad) {
        this.diafecha = diafecha;
        this.pronostico = pronostico;
        this.icono = icono;
        this.probLluvia = probLluvia;
        this.velViento = velViento;
        this.humedad = humedad;
    }

    public String getDiafecha() {
        return diafecha;
    }

    public void setDiafecha(String diafecha) {
        this.diafecha = diafecha;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getProbLluvia() {
        return probLluvia;
    }

    public void setProbLluvia(String probLluvia) {
        this.probLluvia = probLluvia;
    }

    public String getVelViento() {
        return velViento;
    }

    public void setVelViento(String velViento) {
        this.velViento = velViento;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }
}
