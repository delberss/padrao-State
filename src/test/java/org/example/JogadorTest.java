package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

    Jogador jogador;

    @BeforeEach
    public void setUp() {
        jogador = new Jogador();
    }

    // Testes para Jogador em campo

    @Test
    public void naoDeveEntrarEmCampoSeJaEstiverEmCampo() {
        jogador.setEstado(JogadorEstadoEmCampo.getInstance());
        assertFalse(jogador.entrarEmCampo());
    }

    @Test
    public void naoDeveAquecerSeEstiverEmCampo() {
        jogador.setEstado(JogadorEstadoEmCampo.getInstance());
        assertFalse(jogador.aquecer());
    }

    @Test
    public void deveSairParaSubstituicaoSeEstiverEmCampo() {
        jogador.setEstado(JogadorEstadoEmCampo.getInstance());
        assertTrue(jogador.sairParaSubstituicao());
        assertEquals(JogadorEstadoNoBanco.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveReceberCartaoAmareloSeEstiverEmCampo() {
        jogador.setEstado(JogadorEstadoEmCampo.getInstance());
        assertTrue(jogador.receberCartaoAmarelo());
        assertEquals(JogadorEstadoAmarelado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveReceberCartaoVermelhoSeEstiverEmCampo() {
        jogador.setEstado(JogadorEstadoEmCampo.getInstance());
        assertTrue(jogador.receberCartaoVermelho());
        assertEquals(JogadorEstadoExpulso.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveSeLesionarSeEstiverEmCampo() {
        jogador.setEstado(JogadorEstadoEmCampo.getInstance());
        assertTrue(jogador.lesionar());
        assertEquals(JogadorEstadoLesionado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveReceberCartaoVermelhoAposSegundoCartaoAmareloSeEstiverEmCampo() {
        jogador.setEstado(JogadorEstadoEmCampo.getInstance());
        jogador.receberCartaoAmarelo();
        assertTrue(jogador.receberCartaoAmarelo());
        assertEquals(JogadorEstadoExpulso.getInstance(), jogador.getEstado());
    }

    // Testes para Jogador no banco

    @Test
    public void naoDeveSairParaSubstituicaoSeEstiverNoBanco() {
        jogador.setEstado(JogadorEstadoNoBanco.getInstance());
        assertFalse(jogador.sairParaSubstituicao());
    }

    @Test
    public void naoDeveSeLesionarNoBanco() {
        jogador.setEstado(JogadorEstadoNoBanco.getInstance());
        assertFalse(jogador.lesionar());
    }

    @Test
    public void deveEntrarEmCampoSeEstiverNoBanco() {
        jogador.setEstado(JogadorEstadoNoBanco.getInstance());
        assertTrue(jogador.entrarEmCampo());
        assertEquals(JogadorEstadoEmCampo.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveReceberCartaoAmareloSeEstiverNoBanco() {
        jogador.setEstado(JogadorEstadoNoBanco.getInstance());
        assertTrue(jogador.receberCartaoAmarelo());
        assertEquals(JogadorEstadoAmarelado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveReceberCartaoVermelhoSeEstiverNoBanco() {
        jogador.setEstado(JogadorEstadoNoBanco.getInstance());
        assertTrue(jogador.receberCartaoVermelho());
        assertEquals(JogadorEstadoExpulso.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveComecarAAquecerSeEstiverNoBanco() {
        jogador.setEstado(JogadorEstadoNoBanco.getInstance());
        assertTrue(jogador.aquecer());
        assertEquals(JogadorEstadoAquecendo.getInstance(), jogador.getEstado());
    }


    // Testes para Jogador amarelado

    @Test
    public void deveEntrarEmCampoSeEstiverAmarelado() {
        jogador.setEstado(JogadorEstadoAmarelado.getInstance());
        assertTrue(jogador.entrarEmCampo());
        assertEquals(JogadorEstadoEmCampo.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveSairParaSubstituicaoSeEstiverAmarelado() {
        jogador.setEstado(JogadorEstadoAmarelado.getInstance());
        assertTrue(jogador.sairParaSubstituicao());
        assertEquals(JogadorEstadoNoBanco.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveReceberCartaoAmareloSeEstiverAmarelado() {
        jogador.setEstado(JogadorEstadoAmarelado.getInstance());
        assertTrue(jogador.receberCartaoAmarelo());
        assertEquals(JogadorEstadoExpulso.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveReceberCartaoVermelhoSeEstiverAmarelado() {
        jogador.setEstado(JogadorEstadoAmarelado.getInstance());
        assertTrue(jogador.receberCartaoVermelho());
        assertEquals(JogadorEstadoExpulso.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveAquecerSeEstiverAmarelado() {
        jogador.setEstado(JogadorEstadoAmarelado.getInstance());
        assertTrue(jogador.aquecer());
        assertEquals(JogadorEstadoAquecendo.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveLesionarSeEstiverAmarelado() {
        jogador.setEstado(JogadorEstadoAmarelado.getInstance());
        assertTrue(jogador.lesionar());
        assertEquals(JogadorEstadoLesionado.getInstance(), jogador.getEstado());
    }


    // Testes para Jogador aquecendo
    @Test
    public void naoDeveSairParaSubstituicaoSeEstiverAquecendo() {
        jogador.setEstado(JogadorEstadoAquecendo.getInstance());
        assertFalse(jogador.sairParaSubstituicao());
    }

    @Test
    public void deveEntrarEmCampoSeEstiverAquecendo() {
        jogador.setEstado(JogadorEstadoAquecendo.getInstance());
        assertTrue(jogador.entrarEmCampo());
        assertEquals(JogadorEstadoEmCampo.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveSeLesionarAquecendo() {
        jogador.setEstado(JogadorEstadoAquecendo.getInstance());
        assertTrue(jogador.lesionar());
        assertEquals(JogadorEstadoLesionado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveReceberCartaoAmareloAquecendo() {
        jogador.setEstado(JogadorEstadoAquecendo.getInstance());
        assertTrue(jogador.receberCartaoAmarelo());
        assertEquals(JogadorEstadoAmarelado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveReceberCartaoVermelhoAquecendo() {
        jogador.setEstado(JogadorEstadoAquecendo.getInstance());
        assertTrue(jogador.receberCartaoVermelho());
        assertEquals(JogadorEstadoExpulso.getInstance(), jogador.getEstado());
    }


    // Testes para Jogador lesionado
    @Test
    public void naoDeveEntrarEmCampoSeEstiverLesionado() {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertFalse(jogador.entrarEmCampo());
    }

    @Test
    public void deveSairParaSubstituicaoSeEstiverLesionado() {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertTrue(jogador.sairParaSubstituicao());
        assertEquals(JogadorEstadoNoBanco.getInstance(), jogador.getEstado());
    }

    @Test
    public void naoDeveReceberCartaoAmareloLesionado() {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertFalse(jogador.receberCartaoAmarelo());
    }

    @Test
    public void naoDeveReceberCartaoVermelhoLesionado() {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertFalse(jogador.receberCartaoVermelho());
    }

    @Test
    public void naoDeveAquecerSeEstiverLesionado() {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertFalse(jogador.aquecer());
    }


    // Testes para Jogador expulso

    @Test
    public void naoDeveEntrarEmCampoSeEstiverExpulso() {
        jogador.setEstado(JogadorEstadoExpulso.getInstance());
        assertFalse(jogador.entrarEmCampo());
    }

    @Test
    public void naoDeveSerSubstituidoSeEstiverExpulso() {
        jogador.setEstado(JogadorEstadoExpulso.getInstance());
        assertFalse(jogador.sairParaSubstituicao());
    }

    @Test
    public void naoDeveReceberCartaoAmareloSeEstiverExpulso() {
        jogador.setEstado(JogadorEstadoExpulso.getInstance());
        assertFalse(jogador.receberCartaoAmarelo());
    }

    @Test
    public void naoDeveReceberCartaoVermelhoSeEstiverExpulso() {
        jogador.setEstado(JogadorEstadoExpulso.getInstance());
        assertFalse(jogador.receberCartaoVermelho());
    }

    @Test
    public void naoDeveAquecerSeEstiverExpulso() {
        jogador.setEstado(JogadorEstadoExpulso.getInstance());
        assertFalse(jogador.aquecer());
    }

    @Test
    public void naoDeveLesionarSeEstiverExpulso() {
        jogador.setEstado(JogadorEstadoExpulso.getInstance());
        assertFalse(jogador.lesionar());
    }
}
