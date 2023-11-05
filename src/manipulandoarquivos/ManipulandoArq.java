package manipulandoarquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulandoArq {

    public static void main(String[] args) {
        // Leitura de um arquivo
        lerArquivo("C:\\Users\\user\\Desktop\\teste.txt");

        // Escrita em um arquivo
        escreverArquivo("C:\\Users\\user\\Desktop\\teste2.txt", "Este é um exemplo de escrita em arquivo.");
    }

    // Método para ler o conteúdo de um arquivo
    public static void lerArquivo(String nomeArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para escrever em um arquivo
    public static void escreverArquivo(String nomeArquivo, String conteudo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            bw.write(conteudo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
