public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer player = null;

    public MediaPlayerAdapter(TipoMedia tipo) {
        if(!tipo.name().equals("MP3")){
            this.player = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String arquivo) {
        switch (tipoMedia) {
            case VLC:
                player.reproduzirVlc(arquivo);
                break;
        
            case MP4:
                player.reproduzirMp4(arquivo);
                break;
            case MP3:
                break;
        }
    }
    
}
