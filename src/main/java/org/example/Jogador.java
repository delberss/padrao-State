package org.example;

public class Jogador {

    private String nome;
    private JogadorEstado estado;

    public Jogador() {
        this.estado = JogadorEstadoEmCampo.getInstance();
    }

    public void setEstado(JogadorEstado estado) {
        this.estado = estado;
    }

    public boolean entrarEmCampo() {
        return estado.entrarEmCampo(this);
    }

    public boolean sairParaSubstituicao() {
        return estado.sairParaSubstituicao(this);
    }

    public boolean receberCartaoAmarelo() {
        return estado.receberCartaoAmarelo(this);
    }

    public boolean receberCartaoVermelho() {
        return estado.receberCartaoVermelho(this);
    }

    public boolean aquecer() {
        return estado.aquecer(this);
    }

    public boolean lesionar() {
        return estado.lesionar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogadorEstado getEstado() {
        return estado;
    }
}
