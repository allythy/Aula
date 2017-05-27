package ciclico;

public class Ciclico {

    static Thread espere = new Thread();

    public static void main(String[] args) throws InterruptedException {
        int hora = 0, minuto = 0, segundo = 0;

        do {    //hora
            do {     //minuto
                do {     // segundos
                    if (hora < 10) {
                        System.out.print("0");
                    }
                    System.out.print(hora + ":");

                    if (minuto < 10) {
                        System.out.print("0");
                    }
                    System.out.print(minuto + ":");
                    if (segundo < 10) {
                        System.out.print("0");
                    }
                    System.out.print(segundo + "\n");
                    segundo++;
                    Thread.sleep(1000); // vai esperar 1s

                } while (segundo <= 59);
                segundo = 0;
                minuto++;

            } while (minuto <= 59);

            segundo = 0;
            minuto = 0;
            hora++;

        } while (hora == 1);
    }

}

