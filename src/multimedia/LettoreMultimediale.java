package multimedia;

import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        elementi[0] = new Audio("Canzone1", 5, 3);
        elementi[1] = new Video("Filmato1", 3, 4, 2);
        elementi[2] = new Immagine("Foto1", 5);
        elementi[3] = new Audio("Canzone2", 4, 2);
        elementi[4] = new Video("Filmato2", 2, 5, 3);

        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\nSeleziona un elemento da eseguire (1-5) o 0 per uscire:");
            for (int i = 0; i < elementi.length; i++) {
                System.out.println((i + 1) + ": " + elementi[i].getTitolo());
            }

            scelta = scanner.nextInt(); // Legge l'input dell'utente

            if (scelta > 0 && scelta <= 5) {
                ElementoMultimediale elementoSelezionato = elementi[scelta - 1];
                if (elementoSelezionato instanceof Riproducibile) {
                    ((Riproducibile) elementoSelezionato).play();
                } else {
                    elementoSelezionato.show();
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida, riprova.");
            }
        } while (scelta != 0);

        System.out.println("Uscita dal lettore multimediale.");
        scanner.close();
    }
}

