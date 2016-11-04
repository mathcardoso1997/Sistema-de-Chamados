/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31507646
 */
public class ControleChamadosTest {
    
    public ControleChamadosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of alterarChamado method, of class ControleChamados.
     */
    @Test
    public void testAlterarChamado_4args() {
        System.out.println("alterarChamado");
        Chamado chamado = new Chamado("XCorp", "Xcorp é 10", 2, new Tecnico("tecX", 123456), new ClienteEmpresa(51, new Empresa(51, "YCorp"), 987654321, "Ricardo", 741852963), "Linux Ubuntu", "16.04", "");
        String status = "OK";
        String causa = "N/A";
        String solucao = "N/A";
        ControleChamados instance = new ControleChamados();
        Chamado expResult = instance.alterarChamado(chamado, status, causa, solucao);;
        Chamado result = instance.alterarChamado(chamado, status, causa, solucao);
        assertEquals(expResult.getStatus(), result.getStatus());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of InserirChamadoRede method, of class ControleChamados.
     */
    @Test
    public void testInserirChamadoRede() {
        System.out.println("InserirChamadoRede");
        String titulo = "Math";
        String descricao = "EE2";
        int prioridade = 1;
        Tecnico tecnico = new Tecnico("Matheus", 999999);
        ClienteEmpresa cliente = new ClienteEmpresa(0, new Empresa(50, "CardosoCORP"), 3971, "", 888888);
        String so = "Windows";
        String versaoSO = "10";
        String conexao = "http";
        String enderecoRede = "google.com";
        ControleChamados instance = new ControleChamados();
        Chamado expResult = instance.InserirChamadoRede(titulo, descricao, prioridade, tecnico, cliente,
                so, versaoSO, conexao, enderecoRede);
        Chamado result = instance.InserirChamadoRede(titulo, descricao, prioridade, tecnico, cliente,
                so, versaoSO, conexao, enderecoRede);
        //result = expResult;
        assertEquals(expResult.getTitulo(), result.getTitulo());
        assertEquals(expResult.getEnderecoRede(), result.getEnderecoRede());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of InserirChamadoBancoDeDados method, of class ControleChamados.
     */
    @Test
    public void testInserirChamadoBancoDeDados() {
        System.out.println("InserirChamadoBancoDeDados");
        String titulo = "ZCorp";
        String descricao = "ZCorp...ruimzinha";
        int prioridade = 3;
        Tecnico tecnico = new Tecnico("Jorge", 123654789);
        ClienteEmpresa cliente = new ClienteEmpresa(52, new Empresa(3, "WCorp"), 112233, "Luiz", 1595159);
        String so = "Mac";
        String versaoSO = "15.2";
        String bancoDeDados = "oracle";
        ControleChamados instance = new ControleChamados();
        Chamado expResult = instance.InserirChamadoBancoDeDados(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, bancoDeDados);;
        Chamado result = instance.InserirChamadoBancoDeDados(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, bancoDeDados);
        assertEquals(expResult.getSistemaOperacional(), result.getSistemaOperacional());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of InserirChamadoDesempenho method, of class ControleChamados.
     */
    @Test
    public void testInserirChamadoDesempenho() {
        System.out.println("InserirChamadoDesempenho");
        String titulo = "ACorp";
        String descricao = "ACorp a n1";
        int prioridade = 0;
        Tecnico tecnico = new Tecnico("Paulo", 222222);
        ClienteEmpresa cliente = null;
        String so = "Windows";
        String versaoSO = "XP";
        String operacao = "Cod";
        double tempo = 60.0;
        ControleChamados instance = new ControleChamados();
        Chamado expResult = instance.InserirChamadoDesempenho(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, operacao, tempo);
        Chamado result = instance.InserirChamadoDesempenho(titulo, descricao, prioridade, tecnico, cliente, so, versaoSO, operacao, tempo);
        assertEquals(expResult.getTecnico().getNome(), result.getTecnico().getNome());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of inserirRegistroChamado method, of class ControleChamados.
     */
    @Test
    public void testInserirRegistroChamado() {
        System.out.println("inserirRegistroChamado");
        String assunto = "Redação ENEM";
        Chamado chamado = new Chamado("Chamada1", "Oi", 4, new Tecnico("Kleber", 55555), new ClienteEmpresa(4, new Empresa(55, "ABC"), 11111, "Caleb", 88888), "Windows", "7", "");
        Tecnico tec = new Tecnico("Lucas", 9988776);
        ControleChamados instance = new ControleChamados();
        RegistroChamado expResult = instance.inserirRegistroChamado(assunto, chamado, tec);;
        RegistroChamado result = instance.inserirRegistroChamado(assunto, chamado, tec);
        assertEquals(expResult.getAssunto(), result.getAssunto());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarChamado method, of class ControleChamados.
     */
    @Test
    public void testCadastrarChamado() {
        System.out.println("cadastrarChamado");
        ControleChamados instance = new ControleChamados();
        instance.cadastrarChamado();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fecharTela method, of class ControleChamados.
     */
    @Test
    public void testFecharTela() {
        System.out.println("fecharTela");
        ControleChamados instance = new ControleChamados();
        instance.fecharTela();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of voltaChamadoCodigo method, of class ControleChamados.
     */
    @Test
    public void testVoltaChamadoCodigo() {
        System.out.println("voltaChamadoCodigo");
        Integer codigo = 121;
        ControleChamados instance = new ControleChamados();
        Chamado expResult = instance.voltaChamadoCodigo(codigo);;
        Chamado result = instance.voltaChamadoCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setChamadoAlterado method, of class ControleChamados.
     */
    @Test
    public void testSetChamadoAlterado() {
        System.out.println("setChamadoAlterado");
        Chamado c = null;
        ControleChamados instance = new ControleChamados();
        instance.setChamadoAlterado(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChamadoAlterado method, of class ControleChamados.
     */
    @Test
    public void testGetChamadoAlterado() {
        System.out.println("getChamadoAlterado");
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.getChamadoAlterado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emitirRelatorios method, of class ControleChamados.
     */
    @Test
    public void testEmitirRelatorios() {
        System.out.println("emitirRelatorios");
        int tipoproblema = 0;
        ControleChamados instance = new ControleChamados();
        String expResult = "";
        String result = instance.emitirRelatorios(tipoproblema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaPeloCodigo method, of class ControleChamados.
     */
    @Test
    public void testBuscaPeloCodigo() {
        System.out.println("buscaPeloCodigo");
        int codigoChamado = 0;
        ControleChamados instance = new ControleChamados();
        Chamado expResult = null;
        Chamado result = instance.buscaPeloCodigo(codigoChamado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornaDetalhesChamado method, of class ControleChamados.
     */
    @Test
    public void testRetornaDetalhesChamado() {
        System.out.println("retornaDetalhesChamado");
        Chamado c = null;
        ControleChamados instance = new ControleChamados();
        String expResult = "";
        String result = instance.retornaDetalhesChamado(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarChamado method, of class ControleChamados.
     */
    @Test
    public void testAlterarChamado_0args() {
        System.out.println("alterarChamado");
        ControleChamados instance = new ControleChamados();
        instance.alterarChamado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of abrirRelatorio method, of class ControleChamados.
     */
    @Test
    public void testAbrirRelatorio() {
        System.out.println("abrirRelatorio");
        ControleChamados instance = new ControleChamados();
        instance.abrirRelatorio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fecharTelaAlteracao method, of class ControleChamados.
     */
    @Test
    public void testFecharTelaAlteracao() {
        System.out.println("fecharTelaAlteracao");
        ControleChamados instance = new ControleChamados();
        instance.fecharTelaAlteracao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarQtdChamados method, of class ControleChamados.
     */
    @Test
    public void testValidarQtdChamados() {
        System.out.println("validarQtdChamados");
        ClienteEmpresa cliente = null;
        ControleChamados instance = new ControleChamados();
        int expResult = 0;
        int result = instance.validarQtdChamados(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
