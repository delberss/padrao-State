package org.example;

public class JogadorEstadoExpulso extends JogadorEstado {

    private JogadorEstadoExpulso() {};
    private static JogadorEstadoExpulso instance = new JogadorEstadoExpulso();
    public static JogadorEstadoExpulso getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Expulso";
    }
}