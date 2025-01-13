package multimedia;

public class Audio extends ElementoMultimediale implements Riproducibile, RegolaVolume {
    private int durata; // Durata in secondi
    private int volume; // Volume iniziale

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
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
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }

    @Override
    public void show() {
        // Implementazione per gestire la visualizzazione di un audio.
        System.out.println("Audio: " + titolo + " (Durata: " + durata + "s, Volume: " + volume + ")");
    }
}
