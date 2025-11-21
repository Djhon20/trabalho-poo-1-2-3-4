public class SubtracaoMatrizes {

    public static void subtrairMatrizes3x1(double[] M1, double[] M2, double[] MResultante) {
        // Como são matrizes 3x1 (vetores de 3 elementos), o loop vai de 0 a 2.
        for (int i = 0; i < 3; i++) {
            // A subtração é feita elemento por elemento: MResultante[i] = M1[i] - M2[i]
            MResultante[i] = M1[i] - M2[i];
        }
    }

    
    public static void main(String[] args) {
        // As matrizes 3x1 são representadas como vetores (arrays) de 3 elementos.

        // Matriz 1 
        double[] matrizA = {10.0, 5.0, 8.0}; 

        // Matriz 2
        double[] matrizB = {2.0, 1.0, 4.0};

        // Matriz (Inicializada, será preenchida pelo método)
        double[] matrizC = new double[3];

        // Chamada do método
        subtrairMatrizes3x1(matrizA, matrizB, matrizC);

        // Imprimindo o resultado
        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);
        
        System.out.println("\nMatriz B:");
        imprimirMatriz(matrizB);

        System.out.println("\nResultado da Subtração (A - B):");
        imprimirMatriz(matrizC); 
        
    }
    
    // Método auxiliar para imprimir a matriz no formato 3x1 para melhor visualização
    public static void imprimirMatriz(double[] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("| %.1f |\n", matriz[i]);
        }
    }
}