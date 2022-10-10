package utilidade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LerArquivos {

    private String nrlinha;

    public ArrayList carregarArquivos() {

        ArrayList<String> listaNrlinha = new ArrayList<String>();

        File[] files = new File("/home/robertinho/bradesco_rd/arquivos/").listFiles();
        try {
            for (File file : files) {
                listaNrlinha.add(file.getName());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaNrlinha;
    }

    public VariaveisConfiguracao lerConfiguracoes() throws IOException {
        VariaveisConfiguracao v = new VariaveisConfiguracao();
        File file = new File("/home/robertinho/bradesco_rd/cotacao/login.txt");

        if (file.exists()) {
            Scanner ler = new Scanner("/home/robertinho/bradesco_rd/cotacao/login.txt");
            String arquivo = ler.nextLine();
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);

            v.setLogin(lerArq.readLine());
            v.setSenha(lerArq.readLine());
        }
        file = new File("/home/robertinho/bradesco_rd/cotacao/resumo.txt");

        if (file.exists()) {
            Scanner ler = new Scanner("/home/robertinho/bradesco_rd/cotacao/resumo.txt");
            String arquivo = ler.nextLine();
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);
            lerArq.readLine();
            v.setSegmento(lerArq.readLine());
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            v.setAlterarLMI(lerArq.readLine());
        }

        file = new File("/home/robertinho/bradesco_rd/cotacao/matriz.txt");

        if (file.exists()) {
            Scanner ler = new Scanner("/home/robertinho/bradesco_rd/cotacao/matriz.txt");
            String arquivo = ler.nextLine();
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);

            v.setMatriz(lerArq.readLine());

        }
        return v;
    }

    public Variaveis lerArquivo(String nrlinha) throws IOException {
        this.nrlinha = nrlinha;
        Variaveis v = new Variaveis();

        File file = new File("/home/robertinho/bradesco_rd/arquivos/" + nrlinha);

        if (file.exists()) {
            Scanner ler = new Scanner("/home/robertinho/bradesco_rd/arquivos/" + nrlinha);
            String arquivo = ler.nextLine();
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);

            v.setCnpjcpf(lerArq.readLine());
            v.setNome(lerArq.readLine());
            v.setCod(lerArq.readLine());
            v.setSubcod(lerArq.readLine());
            v.setAtividade(lerArq.readLine());
            v.setCep(lerArq.readLine());
            lerArq.readLine();
            v.setIncendio(lerArq.readLine());
            lerArq.readLine();
            v.setDanosEletricos(lerArq.readLine());
            lerArq.readLine();
            v.setVendaval(lerArq.readLine());
            lerArq.readLine();
            v.setRoubo(lerArq.readLine());
            lerArq.readLine();
            v.setVidros(lerArq.readLine());
            lerArq.readLine();
            v.setRc(lerArq.readLine());
            lerArq.readLine();
            v.setLucroCessante(lerArq.readLine());
            v.setValorNovo(lerArq.readLine());
            lerArq.readLine();
            lerArq.readLine();
            v.setPatio(lerArq.readLine());
            lerArq.readLine();
            v.setMercadoria(lerArq.readLine());
            lerArq.readLine();
            v.setDesmoronamento(lerArq.readLine());
            lerArq.readLine();
            v.setRecompDctos(lerArq.readLine());
            lerArq.readLine();
            v.setAlagamento(lerArq.readLine());
            lerArq.readLine();
            v.setEqtoPortateis(lerArq.readLine());

        }


        return v;


    }
}
