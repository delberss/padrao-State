package org.example;

public class JogadorEstadoAmarelado extends JogadorEstado {

    private JogadorEstadoAmarelado() {};
    private static JogadorEstadoAmarelado instance = new JogadorEstadoAmarelado();
    public static JogadorEstadoAmarelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Amarelado";
    }

    public boolean entrarEmCampo(Jogador jogador) {
        jogador.setEstado(JogadorEstadoEmCampo.getInstance());
        return true;
    }

    public boolean lesionar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        return true;
    }

    public boolean aquecer(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAquecendo.getInstance());
        return true;
    }

    public boolean receberCartaoAmarelo(Jogador jogador) {
        jogador.setEstado(JogadorEstadoExpulso.getInstance());
        return true;
    }

    public boolean receberCartaoVermelho(Jogador jogador) {
        jogador.setEstado(JogadorEstadoExpulso.getInstance());
        return true;
    }

    public boolean sairParaSubstituicao(Jogador jogador) {
        jogador.setEstado(JogadorEstadoNoBanco.getInstance());
        return true;
    }
}