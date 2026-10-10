
interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

public class Multiple implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Taking a Photo");
    }

    public void playMusic() {
        System.out.println("Playing Music");
    }

    public static void main(String[] args) {

        Multiple obj = new Multiple();

        obj.takePhoto();
        obj.playMusic();

    }
}
