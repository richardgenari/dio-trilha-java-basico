import java.util.Scanner; // Importação da classe Scanner para leitura de dados do teclado

public class TiposVariaveis { // Declaração da classe TiposVariaveis
    public static void main(String[] args) throws Exception { // Método principal que inicia a execução do programa
        Scanner ler = new Scanner(System.in); // Criação de um objeto Scanner para ler a entrada do usuário

        System.out.print("Digite um número: "); // Exibe a mensagem "Digite um número: " no console
        int numero = ler.nextInt(); // Lê um número inteiro digitado pelo usuário e armazena na variável 'numero'

        System.out.println("Você digitou: " + numero); // Exibe a mensagem "Você digitou: " seguida do número digitado pelo usuário

        ler.close(); // Fecha o objeto Scanner para liberar os recursos
    }
}