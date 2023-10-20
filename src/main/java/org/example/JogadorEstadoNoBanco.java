package org.example;

public class JogadorEstadoNoBanco extends JogadorEstado {

    private JogadorEstadoNoBanco() {};
    private static JogadorEstadoNoBanco instance = new JogadorEstadoNoBanco();
    public static JogadorEstadoNoBanco getInstance() {
        return instance;
    }

    public String getEstado() {
        return "No Banco";
    }

    public boolean entrarEmCampo(Jogador jogador) {
        jogador.setEstado(JogadorEstadoEmCampo.getInstance());
        return true;
    }

    public boolean aquecer(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAquecendo.getInstance());
        return true;
    }

    public boolean receberCartaoAmarelo(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAmarelado.getInstance());
        return true;
    }

    public boolean receberCartaoVermelho(Jogador jogador) {
        jogador.setEstado(JogadorEstadoExpulso.getInstance());
        return true;
    }
}