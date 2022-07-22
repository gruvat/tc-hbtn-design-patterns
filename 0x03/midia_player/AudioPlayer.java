public class AudioPlayer implements MediaPlayer {

    @Override
    public void reproduzir(TipoMedia tipoMedia, String arquivo) {
        if(tipoMedia.name().equals("MP3")) {
            System.out.print("Reproduzindo MP3: " + arquivo);
        } else {
            MediaPlayer adapter = new MediaPlayerAdapter(tipoMedia);
            adapter.reproduzir(tipoMedia, arquivo);
        }
    }
}
