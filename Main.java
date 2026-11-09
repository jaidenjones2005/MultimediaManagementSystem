public class Main {

    public static void main(String[] args) {

        System.out.println("=== Multimedia Management System ===");

        // Phase 1: Remote Proxy
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

        // Phase 2: Virtual Proxy
        System.out.println("\n--- Virtual Proxy Test ---");

        MediaItem virtualProxy = new VirtualMediaProxy(
                "Spider-Man: No Way Home", 8880
        );

        System.out.println("Virtual proxy created.");

        System.out.println("\nAccessing media for the first time...");
        System.out.println("Title: " + virtualProxy.getTitle());

        System.out.println(
                "Duration: " + virtualProxy.getDuration() + " seconds"
        );

        virtualProxy.play();

        System.out.println("\nPlaying again...");
        virtualProxy.play();
    }
}