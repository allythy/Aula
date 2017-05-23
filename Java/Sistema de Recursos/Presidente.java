package sistemarecuros;

public class Presidente extends Empregados{
    private double valorCota;
    private double salarioPresidente;
    

    public Presidente(double valorCota, double salarioPresidente, String nome, String codigo, double salarioBase) {
        super(nome, codigo, salarioBase);
        this.valorCota = valorCota;
        this.salarioPresidente = salarioPresidente;
         calcularSalario();
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    public double getSalarioPresidente() {
        return salarioPresidente;
    }

    public void setSalarioPresidente(double salarioPresidente) {
        this.salarioPresidente = salarioPresidente;
    }
    
    public void calcularSalario()
    {
       salarioPresidente = getSalarioBase() + valorCota;
    }
    
}
