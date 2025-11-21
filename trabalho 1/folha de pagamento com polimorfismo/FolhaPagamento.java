public class FolhaPagamento {
    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioAssalariado("João Silva","123.456.789-00", 3000.0);
        Funcionario f2 = new FuncionarioHorista("Maria Souza","987.654.321-00", 50.0, 45);
        Funcionario f3 = new FuncionarioComissionado("Carlos Pereira","111.222.333-44", 2000.0, 15000.0, 0.10);

        System.out.println("Funcionário Assalariado:");
        f1.exibirInfo();
        System.out.println();

        System.out.println("Funcionário Horista:");
        f2.exibirInfo();
        System.out.println();

        System.out.println("Funcionário Comissionado:");
        f3.exibirInfo();
    }
}