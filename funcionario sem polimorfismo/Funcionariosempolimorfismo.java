public class Funcionariosempolimorfismo {

    private String nome;
    private String tipo; // "assalariado", "horista", "comissionado"
    private double salarioMensal;
    private double horasTrabalhadas;
    private double valorHora;
    private double salarioBase;
    private double vendas;
    private double porcentagemComissao;

    
    public Funcionariosempolimorfismo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // GETTERS
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public double getSalarioMensal() { return salarioMensal; }
    public double getHorasTrabalhadas() { return horasTrabalhadas; }
    public double getValorHora() { return valorHora; }
    public double getSalarioBase() { return salarioBase; }
    public double getVendas() { return vendas; }
    public double getPorcentagemComissao() { return porcentagemComissao; }

    // SETTERS
    public void setSalarioMensal(double salarioMensal) { this.salarioMensal = salarioMensal; }

    public void setHorasTrabalhadas(double horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public void setComissao(double salarioBase, double vendas, double porcentagemComissao) {
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        this.porcentagemComissao = porcentagemComissao;
    }

    // método para calcular salário
    public double calcularSalario() {
        switch (tipo.toLowerCase()) {
            case "assalariado":
                return salarioMensal;
            case "horista":
                // Uso de double para manter precisão
                double horasNormais = Math.min(horasTrabalhadas, 40.0);
                double horasExtras = Math.max(horasTrabalhadas - 40.0, 0.0);
                double salarioNormal = horasNormais * valorHora;
                double salarioExtra = horasExtras * valorHora * 1.5;
                return salarioNormal + salarioExtra;
            case "comissionado":
                // A porcentagem de comissão geralmente é 0.XX (ex: 10% é 0.10)
                return salarioBase + (vendas * porcentagemComissao);
            default:
                throw new IllegalArgumentException("Tipo de funcionário inválido: " + tipo);
        }
    }
    
}