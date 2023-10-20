package org.example;

public class JogadorEstadoAquecendo extends JogadorEstado {

    private JogadorEstadoAquecendo() {};
    private static JogadorEstadoAquecendo instance = new JogadorEstadoAquecendo();
    public static JogadorEstadoAquecendo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aquecendo";
    }

    public boolean entrarEmCampo(Jogador jogador) {
        jogador.setEstado(JogadorEstadoEmCampo.getInstance());
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
