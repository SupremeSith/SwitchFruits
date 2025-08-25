import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o nome do produto");
        Scanner s = new Scanner((System.in));

        String nomeProduto = s.next();
        System.out.println(nomeProduto);
    }

}