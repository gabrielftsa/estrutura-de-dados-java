import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;

class SensorTemperatura extends SensorBase {
    private final Queue<Double> temperatura;

    public SensorTemperatura() {
        temperatura = new LinkedList<>();
    }

    public void adicionarNovaLeitura(double temperatura) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime proximoRegistro = agora.plusMinutes(30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String horaAtual = agora.format(formatter);
        String proximaHora = proximoRegistro.format(formatter);

        System.out.println("------------------------------------------");
        System.out.println("Nova leitura de temperatura registrada às " + horaAtual);
        System.out.println("Próximo registro será em: " + proximaHora);

        this.temperatura.offer(temperatura);
        setHoraLeitura(agora.getHour() * 60 + agora.getMinute()); // Atualiza a última hora de leitura
    }

    public void exibirDados() {
        System.out.println("\nDados de temperatura (Armazenado em Fila): ");
        for (double valor : temperatura) {
            System.out.println("[" + valor + "]");
        }
    }

}
