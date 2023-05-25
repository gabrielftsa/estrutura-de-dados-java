import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Stack;

class SensorCo2 extends SensorBase {
    private final Stack<Double> co2;

    public SensorCo2() {
        co2 = new Stack<>();
    }

    public void adicionarNovaLeitura(double co2) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime proximoRegistro = agora.plusMinutes(30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String horaAtual = agora.format(formatter);
        String proximaHora = proximoRegistro.format(formatter);

        System.out.println("------------------------------------------");
        System.out.println("Nova leitura de Co2 registrada às " + horaAtual);
        System.out.println("Próximo registro será em: " + proximaHora);

        this.co2.add(co2);
        setHoraLeitura(agora.getHour() * 60 + agora.getMinute()); // Atualiza a última hora de leitura
    }


    public void exibirDados() {
        System.out.println("Dados de CO2 (Armazenado em Pilha): ");
        while (!co2.isEmpty()) {
            System.out.println("[" + co2.pop() + "]");
        }
    }
}