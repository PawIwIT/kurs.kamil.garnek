package zadTomka.kul;

public interface Speakable {
    int QUIET = 0; // <- publiczne stałe statyczne
    int LOUD = 1; // domyślnie public static final

   String getVoice(int voice);
}
