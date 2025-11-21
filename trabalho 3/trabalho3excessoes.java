import java.util.InputMismatchException;
import java.util.Scanner;

public class trabalho3excessoes {

    public static void main(String[] args) {
        Scanner teclado = null; 
        
        try {
            teclado = new Scanner(System.in);
            System.out.println("=== Divisão de dois números ===");
            
            // Leitura do dividendo (x)
            System.out.print("Informe o penúltimo número do seu celular: ");
            int x = teclado.nextInt();
            
            // Leitura do divisor (y)
            System.out.print("Informe o último dígito do seu celular: ");
            int y = teclado.nextInt();
            
            // Lança a exceção ANTES da divisão se o divisor for zero
            if (y == 0) {
                throw new ArithmeticException("Numero nao pode ser  zero."); 
            }
            
            // Execução da divisão (só acontece se y não for 0)
            double r = (double) x / y; 
            
            System.out.println("O resultado da divisão é " + r);

        } catch (InputMismatchException e) {
            // Captura se o usuário digitar algo que não seja um número inteiro
            System.err.println("Erro de entrada: Você deve informar um número inteiro válido.");
            System.err.println("Detalhes: " + e.toString());

        } catch (ArithmeticException e) {
            // Captura a exceção lançada manualmente acima (ou uma divisão de int/int por 0)
            System.err.println("Erro matemático: Divisão por zero não é permitida.");
            System.err.println("Detalhes: " + e.getMessage());
            
        } catch (Exception e) {
            // Captura outras exceções inesperadas
            System.err.println("Ocorreu um erro inesperado.");
            System.err.println("Detalhes: " + e.toString());
            
        } finally {
            if (teclado != null) {
                teclado.close();
            }
        }
    }
}