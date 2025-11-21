

public abstract class Funcionario{
    private String nome;
    private String cpf;

    public Funcionario(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract double calcularSalario();

    public void exibirInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salário: " + calcularSalario());
    }
}