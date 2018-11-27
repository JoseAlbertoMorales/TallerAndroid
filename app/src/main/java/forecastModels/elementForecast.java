package forecastModels;

public class elementForecast {
    String dia ;
    String icono ;
    String temperatura ;
    String pronostico ;
    String probLluvia ;



    public elementForecast() {

    }

    public elementForecast(String dia, String icono, String temperatura, String pronostico, String probLluvia) {
        this.dia = dia;
        this.icono = icono;
        this.temperatura = temperatura;
        this.pronostico = pronostico;
        this.probLluvia = probLluvia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getProbLluvia() {
        return probLluvia;
    }

    public void setProbLluvia(String probLluvia) {
        this.probLluvia = probLluvia;
    }
}
