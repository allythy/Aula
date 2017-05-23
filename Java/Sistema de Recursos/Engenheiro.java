package sistemarecuros;

public class Engenheiro extends Empregados{
    private String departamento;
    private String crea;
    private double salarioEngenheiro;

    public Engenheiro(String departamento, String crea, String nome, String codigo, double salarioBase) {
        super(nome, codigo, salarioBase);
        this.departamento = departamento;
        this.crea = crea;
        calcularSalario();
    }
    
    public double getSalarioEngenheiro() {
        return salarioEngenheiro;
    }
    

    public void setSalarioEngenheiro(double salarioEngenheiro) {
        this.salarioEngenheiro = salarioEngenheiro;
    }
    
    public void calcularSalario()
    {
       salarioEngenheiro = getSalarioBase() * 1.5;
    }
        
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
  
    
}
