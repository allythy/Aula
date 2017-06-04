package sistemarecursos;

public class Gerente extends Empregados{
    private String area;
    private double bonus = 500;
    private double salarioGerente;

    public Gerente(String area, double bonus, String nome, String codigo, double salarioBase) {
        super(nome, codigo, salarioBase);
        this.area = area;
        this.bonus = bonus;
   
        calcularSalario();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalarioGerente() {
        return salarioGerente;
    }

    public void setSalarioGerente(double salarioGerente) {
        this.salarioGerente = salarioGerente;
    }
    
    public void calcularSalario()
    {
       salarioGerente= getSalarioBase() + bonus;
    }
    
    
  
}
