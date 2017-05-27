package pkgfor;

public class For {

    public static void main(String[] args) {
        /* 
        for(inicialização(contador); codição: incremento ou decremento){
        bloco de intruções
        }  */

        System.out.println("Incremento");
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor: " + i);
        }
        System.out.println("\n");  //pular uma linha

        
        System.out.println("Decremento");
        for (int i = 5; i > 0; i--) {
            System.out.println("Valor: " + i);
        }System.out.println("\n");  //pular uma linha

        // FOR COM MAIS DE UMA VARIAVEL

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i tem o valor: " + i + " j tem o valor: " + j);

        }
    }

}
