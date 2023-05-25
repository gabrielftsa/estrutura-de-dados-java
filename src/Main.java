public class Main {
    public static void main(String[] args) {

        var sensTemperatura_1 = new SensorTemperatura();
        var sensUmidade_1 = new SensorUmidade();
        var sensCo2_1 = new SensorCo2();

        sensTemperatura_1.adicionarNovaLeitura(22.7);
        sensTemperatura_1.exibirDados();

        sensUmidade_1.adicionarNovaLeitura(67.2);
        sensUmidade_1.exibirDados();

        sensCo2_1.adicionarNovaLeitura(455.0);
        sensCo2_1.exibirDados();

    }
}