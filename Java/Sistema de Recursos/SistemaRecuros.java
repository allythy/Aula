package sistemarecuros;

import javax.swing.JOptionPane;

public class SistemaRecuros {

    public static void main(String[] args) {

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Infome o seu cargo:  \n1- Engenheiro \n2- Gerente \n3- Presidente \n\n"));

        switch (opcao) {
            case 1:
                String nomeTemp = JOptionPane.showInputDialog(null, "Digite o nome do Engenheiro: ");
                double salarioTemp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salario base: "));
                String departamentoTemp = JOptionPane.showInputDialog(null, "Digite o Departamento: ");
                String creaTemp = JOptionPane.showInputDialog(null, "Digite o crea: ");
                String codigoTemp = JOptionPane.showInputDialog(null, "Digite o codigo: ");
                
                Engenheiro e = new Engenheiro(departamentoTemp, creaTemp, nomeTemp, codigoTemp,salarioTemp);
                JOptionPane.showMessageDialog(null,"REGISTRO DO ENGENHEIRO COMPLETO: \n\nNome: "+ e.getNome()+"\nCodigo: "+e.getCodigo()+"\nSalario: "+e.getSalarioEngenheiro()+"\nDepartamento: "+e.getDepartamento()+"\ncrea: "+e.getCrea());
       
        case 2:
                nomeTemp = JOptionPane.showInputDialog(null, "Digite o nome do Gerente: ");
                salarioTemp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salario base: "));
                codigoTemp = JOptionPane.showInputDialog(null, "Digite o codigo do Gerente: ");
                String areaTemp = JOptionPane.showInputDialog(null, "Digite a area do Gerente: ");
                double bonusTemp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do Bonus: "));
            
                Gerente g = new Gerente(areaTemp,bonusTemp, nomeTemp,codigoTemp,salarioTemp);
                JOptionPane.showMessageDialog(null,"REGISTRO DO GERENTE COMPLETO: \n\nNome: "+ g.getNome()+"\nCodigo: "+g.getCodigo()+"\nSalario(com bonus): "+g.getSalarioGerente());
                
        case 3:
                nomeTemp = JOptionPane.showInputDialog(null, "Digite o nome do Presidente: ");
                salarioTemp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salario base: "));
                codigoTemp = JOptionPane.showInputDialog(null, "Digite o codigo do Presidente: ");
                double cotaTemp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da cota: "));
            
                Presidente p = new Presidente(cotaTemp,nomeTemp,codigoTemp,salarioTemp);
                JOptionPane.showMessageDialog(null,"REGISTRO DO PRESIDENTE COMPLETO: \n\nNome: "+ p.getNome()+"\nCodigo: "+p.getCodigo()+"\nSalario(com bonus): "+p.getSalarioPresidente());

            }
    }

  
}
