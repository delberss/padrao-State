package org.example;

public class JogadorEstadoLesionado extends JogadorEstado {

    private JogadorEstadoLesionado() {};
    private static JogadorEstadoLesionado instance = new JogadorEstadoLesionado();
    public static JogadorEstadoLesionado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Lesionado";
    }

    public boolean sairParaSubstituicao(Jogador jogador) {
        jogador.setEstado(JogadorEstadoNoBanco.getInstance());
        return true;
    }
}
