
public class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    //construtor da classe FuncionarioHorista
    public FuncionarioHorista(String nome,String cpf, double valorHora, int horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    //cria o metodo para calcular o salario do funcionario horista
    @Override
    public double calcularSalario() {
        int horasNormais = Math.min(horasTrabalhadas, 40);
        int horasExtras = Math.max(horasTrabalhadas - 40, 0);
        double salarioNormal = horasNormais * valorHora;
        double salarioExtra = horasExtras * valorHora * 1.5;
        return salarioNormal + salarioExtra;
    }
}