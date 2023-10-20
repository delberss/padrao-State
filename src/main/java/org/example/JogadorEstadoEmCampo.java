package org.example;

public class JogadorEstadoEmCampo extends JogadorEstado {

    private JogadorEstadoEmCampo() {};
    private static JogadorEstadoEmCampo instance = new JogadorEstadoEmCampo();
    public static JogadorEstadoEmCampo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Campo";
    }

    public boolean sairParaSubstituicao(Jogador jogador) {
        jogador.setEstado(JogadorEstadoNoBanco.getInstance());
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

    public boolean lesionar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        return true;
    }



}