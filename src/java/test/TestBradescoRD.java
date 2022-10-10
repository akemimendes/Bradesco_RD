package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import telas.ConsultarCotacao;
import telas.DadosdoSegurado;
import telas.Login;
import utilidade.LerArquivos;
import utilidade.Navegador;
import utilidade.Variaveis;
import utilidade.VariaveisConfiguracao;

import javax.swing.*;
import java.util.ArrayList;

public class TestBradescoRD {

    @Test
    public void TestBradesco_RD() {

        //instanciando classes
        LerArquivos ler = new LerArquivos();
        ConsultarCotacao consulta = new ConsultarCotacao();
        DadosdoSegurado dadosseg = new DadosdoSegurado();
        Login acesso = new Login();

        try {
            // retornar objeto navegador
            WebDriver navegador = Navegador.navegador();
            // pegar resumo, matriz e login
            VariaveisConfiguracao config = ler.lerConfiguracoes();
            //realizar login na pagina
            acesso.realizarLogin(navegador, config);
            //consultar calculo
            consulta.realizarConsulta(navegador, config);
            //carregar no array os arquivos da pasta arquivos
            ArrayList<String> listaNr = ler.carregarArquivos();

            if (listaNr.size() == 0) {
                JOptionPane.showMessageDialog(null, "Acabou!");
            } else {
                while (listaNr.size() != 0) {
                    // ler variaveis
                    Variaveis param = ler.lerArquivo(listaNr.get(0));
                    //alterar os dados do segurado
                    dadosseg.trocaCNPJ(navegador, param);

                }
            }


        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
