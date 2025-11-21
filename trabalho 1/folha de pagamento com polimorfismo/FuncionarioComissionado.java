public class FuncionarioComissionado extends Funcionario {
    private double salarioMensal;
    private double vendasMensais;
    private double taxaComissao;

    //construtor da classe FuncionarioComissionado
    public FuncionarioComissionado(String nome,String cpf,double salarioMensal, double vendasMensais, double taxaComissao) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
        this.vendasMensais = vendasMensais;
        this.taxaComissao = taxaComissao;
    }

    public double getVendasMensais() {
        return vendasMensais;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setVendasMensais(double vendasMensais) {
        this.vendasMensais = vendasMensais;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    //cria o metodo para calcular o salario do funcionario comissionado
    @Override
    public double calcularSalario() {
        return salarioMensal + (vendasMensais * taxaComissao);
    }
}