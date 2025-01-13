package multimedia;

public class Video extends ElementoMultimediale implements Riproducibile, RegolaVolume, RegolaLuminosita {
    private int durata; // Durata in secondi
    private int volume; // Volume iniziale
    private int luminosita; // Luminosità iniziale

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    @Override
    public void show() {
        System.out.println("Video: " + titolo + " (Durata: " + durata + "s, Volume: " + volume + ", Luminosità: " + luminosita + ")");
    }
}
