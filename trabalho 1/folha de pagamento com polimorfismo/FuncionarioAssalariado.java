public class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    //construtor da classe FuncionarioAssalariado
    public FuncionarioAssalariado(String nome,String cpf,double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    //cria o metodo para calcular o salario do funcionario assalariado
    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
    

