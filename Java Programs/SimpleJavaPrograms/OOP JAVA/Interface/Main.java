
interface Camera {

    void takePhoto();

    void recordVideo();
}

interface Music {

    void playMusic();
}

interface Chat {

    void chat();
}

public class Phone implements Camera, Music, Chat {

    public void takePhoto() {
        System.out.println("Phone Takes photo");
    }

    public void recordVideo() {
        System.out.println("Phone Record video");
    }

    public void playMusic() {
        System.out.println("Phone plays music");
    }

    public void chat() {
        System.out.println("Phone support chat");
    }

    class Laptop implements Camera, Music, Chat {

        public void takePhoto() {
            System.out.println("Laptop takes photo");
        }

        public void recordVideo() {
            System.out.println("Laptop Record video");
        }

        public void playMusic() {
            System.out.println("Laptop play music");
        }

        public void chat() {
            System.out.println("Laptop support chat");
        }
    }

    public static void main(String[] args) {

        Phone p = new Phone();

        p.takePhoto();
        p.recordVideo();
        p.chat();
        p.playMusic();

        Laptop l = new Laptop();

        l.takePhoto();
        l.recordVideo();
        l.playMusic();
        l.chat();
    }
}
