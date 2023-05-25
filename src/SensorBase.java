import java.time.LocalTime;

class SensorBase {
    protected int horaLeitura;
    protected int minutoLeitura;

    public int getHoraLeitura() {
        return horaLeitura;
    }

    public void setHoraLeitura(int horaLeitura) {
        this.horaLeitura = horaLeitura;
    }

    public SensorBase() {
        LocalTime agora = LocalTime.now();
        horaLeitura = agora.getHour();
        minutoLeitura = agora.getMinute();
    }
}



