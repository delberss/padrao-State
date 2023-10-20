package org.example;

public abstract class JogadorEstado {

    public abstract String getEstado();

    public boolean entrarEmCampo(Jogador jogador) {
        return false;
    }

    public boolean sairParaSubstituicao(Jogador jogador) {
        return false;
    }

    public boolean receberCartaoAmarelo(Jogador jogador) {
        return false;
    }

    public boolean receberCartaoVermelho(Jogador jogador) {
        return false;
    }

    public boolean aquecer(Jogador jogador) {
        return false;
    }

    public boolean lesionar(Jogador jogador) {
        return false;
    }
}