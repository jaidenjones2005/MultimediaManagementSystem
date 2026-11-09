public class Main {

    public static void main(String[] args) {

        System.out.println("=== Multimedia Management System ===");

        RealMedia movie = new RealMedia(
                "Avengers: Endgame", 10800
        );

        MediaItem remoteProxy = new RemoteMediaProxy(movie);

        System.out.println("\n--- Remote Proxy Test ---");

        System.out.println("Title: " + remoteProxy.getTitle());

        System.out.println(
                "Duration: " + remoteProxy.getDuration() + " seconds"
        );

        remoteProxy.play();

        System.out.println("\nPlaying again...");
        remoteProxy.play();
    }
}