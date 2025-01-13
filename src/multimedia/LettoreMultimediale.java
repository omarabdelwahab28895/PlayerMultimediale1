package multimedia;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Audio audio = new Audio("Canzone1", 5, 3);
        Video video = new Video("Filmato1", 3, 4, 2);
        Immagine immagine = new Immagine("Foto1", 5);

        System.out.println("Riproduzione Audio:");
        audio.play();

        System.out.println("\nRiproduzione Video:");
        video.play();

        System.out.println("\nVisualizzazione Immagine:");
        immagine.show();
    }
}
