
import java.util.Random;
import java.util.Scanner;


public class JavaSortsSelection {

    static int menuEntrada() {
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("1- Gerar dados");
        System.out.println("2- Entrar com dados");
        op = scanner.nextInt();
        return op;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tamanho, op;
        System.out.println("Tamanho do vetor:");
        tamanho = scanner.nextInt();
        char[] vetor = new char[tamanho];
        op = menuEntrada();
        switch (op) {
            case 1:
                for (int i = 0; i < vetor.length; i++)
                    vetor[i] = (char) (rand.nextInt(26) + 'a'); // Preenche com caracteres aleatórios de 'a' a 'z'
                break;
            case 2:
                System.out.println("Dados vetor:");
                for (int i = 0; i < vetor.length; i++)
                    vetor[i] = scanner.next().charAt(0); // Lê caracteres do usuário
                break;
        }

        printArray(vetor);//mostrar o vetor
        Ssort(vetor);
        System.out.println("Vetor ordenado");
        printArray(vetor);//mostrar ordenado
    }

    public static void Ssort(char array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }
            char temp = array[i];
            array[i] = array[k];
            array[k] = temp;
        }
    }

    public static void printArray(char array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }
        System.out.println("\n");
    }
}
