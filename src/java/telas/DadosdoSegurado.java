package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilidade.Variaveis;

public class DadosdoSegurado {
    public void trocaCNPJ(WebDriver navegador,Variaveis param) {

        try {
            WebDriverWait wait = new WebDriverWait(navegador, 30);
            System.out.println("vou trocar cnpj");
            Thread.sleep(2000);
            navegador.findElement(By.xpath("//*[@id=\"formCotacao:ICpfCnpjProponente\"]")).sendKeys(param.getCnpjcpf());

            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
}

