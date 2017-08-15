
package dao;

import java.sql.Date;
import model.Carro;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class CarrosDAOJUnitTest {
    
    @Test
    public void inserir(){
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017,8,14));
        gol.setAnoFabricacao((short)2017);
        gol.setAnoLancamento((short)2017);
        gol.setChassi("5151874");
        gol.setCor("Vermelho");
        gol.setDescricao("asdsaokdkaosdokaoerkeqjrqw");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setNome("Nome");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(1588f);
        gol.setTipoPneu((short)17);
        gol.setRenavam(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        assertEquals(codigo,1);
        
        gol.setId(codigo);
        
        Carro carroBuscado = dao.buscarPorld(codigo);
        validarIgualdadeCarro(gol, carroBuscado);

    }
    
    @Test
    public void excluir(){
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017,8,14));
        gol.setAnoFabricacao((short)2017);
        gol.setAnoLancamento((short)2017);
        gol.setChassi("5151874");
        gol.setCor("Vermelho");
        gol.setDescricao("asdsaokdkaosdokaoerkeqjrqw");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setNome("Nome");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(1588f);
        gol.setTipoPneu((short)17);
        gol.setRenavam(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        dao.excluir(codigo);
        
        Carro carroBuscado = dao.buscarPorld(codigo);
        assertNull(carroBuscado);
    }
    
    @Test
    public void alterar(){
     Carro gol = new Carro();
     gol.setDataCompra(new Date(2017,8,14));
     gol.setAnoFabricacao((short)2017);
     gol.setAnoLancamento((short)2017);
     gol.setChassi("5151874");
     gol.setCor("Vermelho");
     gol.setDescricao("asdsaokdkaosdokaoerkeqjrqw");
     gol.setEstaFuncional(false);
     gol.setFabricante("VW");
     gol.setNome("Nome");
     gol.setPlaca("FLA-2017");
     gol.setPotencia(100f);
     gol.setPermitidaCirculacao(true);
     gol.setQuantidadeBatidas((byte) 0);
     gol.setQuantidadePortas((byte) 4);
     gol.setQuilometragem(1588f);
     gol.setTipoPneu((short)17);
     gol.setRenavam(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);    
        gol.setId(codigo);
        
     gol.setDataCompra(new Date(2015,8,04));
     gol.setAnoFabricacao((short)2013);
     gol.setAnoLancamento((short)2013);
     gol.setChassi("5155434");
     gol.setCor("Branco");
     gol.setDescricao("PatatiPatata");
     gol.setEstaFuncional(true);
     gol.setFabricante("Hyundai");
     gol.setNome("lx35");
     gol.setPlaca("BLA-0097");
     gol.setPotencia(150f);
     gol.setPermitidaCirculacao(true);
     gol.setQuantidadeBatidas((byte) 2);
     gol.setQuantidadePortas((byte) 4);
     gol.setQuilometragem(15998f);
     gol.setTipoPneu((short)20);
     gol.setRenavam(19365);
     dao.alterar(gol);
     
     Carro carroModificado = dao.buscarPorld(gol.getId());
     validarIgualdadeCarro(gol, carroModificado);
    }
    
    public void validarIgualdadeCarro(Carro carro,Carro outroCarro){
        assertEquals(carro.getId(),outroCarro.getId());
        assertEquals(carro.getDataCompra(),outroCarro.getDataCompra());
        assertEquals(carro.getAnoFabricacao(),outroCarro.getAnoFabricacao());
        assertEquals(carro.getAnoLancamento(),outroCarro.getAnoLancamento());
        assertEquals(carro.getChassi(),outroCarro.getChassi());
        assertEquals(carro.getCor(),outroCarro.getCor());
        assertEquals(carro.getDescricao(),outroCarro.getDescricao());
        assertEquals(carro.isEstaFuncional(),outroCarro.isEstaFuncional());
        assertEquals(carro.getFabricante(),outroCarro.getFabricante());
        assertEquals(carro.getNome(),outroCarro.getNome());
        assertEquals(carro.getPlaca(),outroCarro.getPlaca());
        assertEquals(carro.getPotencia(),outroCarro.getPotencia(),0);
        assertEquals(carro.isPermitidaCirculacao(),outroCarro.isPermitidaCirculacao());
        assertEquals(carro.getQuantidadeBatidas(),outroCarro.getQuantidadeBatidas());
        assertEquals(carro.getQuantidadePortas(),outroCarro.getQuantidadePortas());
        assertEquals(carro.getQuilometragem(),outroCarro.getQuilometragem(),0);
        assertEquals(carro.getTipoPneu(),outroCarro.getTipoPneu());
        assertEquals(carro.getRenavam(),outroCarro.getRenavam());
        
        
    }
    
}
