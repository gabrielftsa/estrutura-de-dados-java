import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class SensorUmidade extends SensorBase {
    private final List<Double> umidade;

    public SensorUmidade() {
        umidade = new ArrayList<>();
    }

    public void adicionarNovaLeitura(double umidade) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime proximoRegistro = agora.plusMinutes(30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String horaAtual = agora.format(formatter);
        String proximaHora = proximoRegistro.format(formatter);

        System.out.println("------------------------------------------");
        System.out.println("Nova leitura de Umidade registrada às " + horaAtual);
        System.out.println("Próximo registro será em: " + proximaHora);

        this.umidade.add(umidade);
        setHoraLeitura(agora.getHour() * 60 + agora.getMinute()); // Atualiza a última hora de leitura
    }

    public void exibirDados() {
        System.out.println("Dados de Umidade (Armazenado em Lista): ");
        for (double valor : umidade) {
            System.out.println("[" + valor + "]");
        }
    }
}