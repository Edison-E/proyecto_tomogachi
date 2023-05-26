import java.util.Scanner;

public class menu_principal {

    public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)) {
            estados_animo verAnimo = new estados_animo();
            stats feliz = new stats();
            stats comer = new stats();

            int minutos_hora = 0;
            int segundos_hora = 0;

            System.out.println("===========================================");
            System.out.println("||           MI TOMAGOCHI                ||");
            System.out.println("||              MENU:                    ||");
            System.out.println("||            -EMPEZAR                   ||");
            System.out.println("||             -SALIR                    ||");
            System.out.println("==========================================");
            String empezar = lector.nextLine();
            System.out.println("");

            if (empezar.equalsIgnoreCase("empezar")) {
                System.out.println("==========================================");
                System.out.println("Estado actual");
                System.out.println(verAnimo.estado_feliz);
                System.out.println("==========================================");
                while (minutos_hora < 60) {
                    for (int i = 0; i < 60; i++) {
                        segundos_hora++;
                        if (segundos_hora == 60) {
                            segundos_hora = 0;
                            minutos_hora++;
                        }

                    }

                    if (minutos_hora == 4) {
                        System.out.println("=======================");
                        System.out.println("Miau... (esta aburrido)");
                        System.out.println(verAnimo.estado_aburrido);
                        String respuesta_uno = lector.nextLine();
                        if (respuesta_uno.equalsIgnoreCase("jugar")) {
                            System.out.println("grr...miau miua");
                            System.out.println(verAnimo.estado_feliz);
                        }

                    }

                    if (minutos_hora == 15) {
                        System.out.println("=======================");
                        System.out.println("Miau.... ñam ñam (esta con hambre)");
                        System.out.println(verAnimo.estado_hambriento);
                        String respuesta_dos = lector.nextLine();
                        if (respuesta_dos.equalsIgnoreCase("dar de comer")) {
                            System.out.println("ñam ñam... miau");
                            System.out.println(verAnimo.estado_feliz);
                            comer.hambre = "x x x x x x x x";
                            System.out.println("Estado de hambre: " + comer.hambre);
                        }
                    }

                    if (minutos_hora == 30) {
                        System.out.println("=======================");
                        System.out.println("miau....");
                        String cariciar = lector.nextLine();
                        if (!cariciar.equalsIgnoreCase("cariciar")) {
                            System.out.println("miau.... (esta triste)");
                            System.out.println(verAnimo.estado_triste);
                        } else {
                            System.out.println("miua miua miau....");
                            System.out.println(verAnimo.estado_feliz);
                        }
                    }

                }
                System.out.println("==========================================");
            } else {
                System.out.println("miua miua miua miua !!!");
                System.out.println(verAnimo.estado_triste);
            }

            

        }

    }

}