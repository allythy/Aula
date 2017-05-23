package sistemarecuros;

public abstract class Empregados {
    
    private String nome;
    private String codigo;
    private double salarioBase;

    public Empregados(String nome, String codigo, double salarioBase) {
        this.nome = nome;
        this.codigo = codigo;
        this.salarioBase = salarioBase;
    }    

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
}
