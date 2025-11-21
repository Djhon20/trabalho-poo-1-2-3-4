public class Folhapagamentosempolimorfismo {
    
    public static void main(String[] args) {
        
        System.out.println("=== Folha de Pagamento Simples (Sem Polimorfismo) ===");
        
        // 1. Funcionário Assalariado
        // Note o uso do nome CORRETO da classe: Funcionariosempolimorfismo
        Funcionariosempolimorfismo f1 = new Funcionariosempolimorfismo("João Silva", "Assalariado");
        f1.setSalarioMensal(3000.0);
        
        System.out.println("\n--- Dados do Funcionário 1 ---");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Tipo: " + f1.getTipo());
        // Uso de printf para formatar o valor monetário com 2 casas decimais
        System.out.printf("Salário Calculado: R$ %.2f\n", f1.calcularSalario());
        
        // 2. Funcionário Horista
        Funcionariosempolimorfismo f2 = new Funcionariosempolimorfismo("Maria Souza", "Horista");
        // 45 horas trabalhadas a R$ 50.00/h (com 5 horas extras)
        f2.setHorasTrabalhadas(45.0, 50.0);
        
        System.out.println("\n--- Dados do Funcionário 2 ---");
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Tipo: " + f2.getTipo());
        System.out.printf("Salário Calculado: R$ %.2f\n", f2.calcularSalario()); 
        
        // 3. Funcionário Comissionado
        Funcionariosempolimorfismo f3 = new Funcionariosempolimorfismo("Carlos Pereira", "Comissionado");
        // Salário base R$ 2000.0, Vendas R$ 15000.0, Comissão 10% (0.10)
        f3.setComissao(2000.0, 15000.0, 0.10);
        
        System.out.println("\n--- Dados do Funcionário 3 ---");
        System.out.println("Nome: " + f3.getNome());
        System.out.println("Tipo: " + f3.getTipo());
        System.out.printf("Salário Calculado: R$ %.2f\n", f3.calcularSalario());
    }
}