public class Main {

    public static void main(String[] args) {

        System.out.println("=== Multimedia Management System ===");

        // Phase 1: Remote Proxy
        System.out.println("\n--- Remote Proxy Test ---");

        RealMedia movie = new RealMedia(
                "Avengers: Endgame", 10800
        );

        MediaItem remoteProxy = new RemoteMediaProxy(movie);

        System.out.println("Title: " + remoteProxy.getTitle());
        System.out.println("Duration: "
                + remoteProxy.getDuration() + " seconds");

        remoteProxy.play();
        remoteProxy.play();

        // Phase 2: Virtual Proxy
        System.out.println("\n--- Virtual Proxy Test ---");

        MediaItem virtualProxy = new VirtualMediaProxy(
                "Spider-Man: No Way Home", 8880
        );

        System.out.println("Virtual proxy created.");
        System.out.println("Title: " + virtualProxy.getTitle());
        System.out.println("Duration: "
                + virtualProxy.getDuration() + " seconds");

        virtualProxy.play();
        virtualProxy.play();

        // Phase 3: Multiple Users and Proxy Validation
        System.out.println("\n--- Phase 3: Multiple User Testing ---");

        String[] users = {"Alice", "Bob", "Charlie"};

        MediaItem[] mediaLibrary = {
                remoteProxy,
                virtualProxy,
                new VirtualMediaProxy("The Batman", 10560)
        };

        for (int i = 0; i < users.length; i++) {

            System.out.println("\nUser: " + users[i]);

            MediaItem selectedMedia = mediaLibrary[i];

            System.out.println("Selected: "
                    + selectedMedia.getTitle());

            selectedMedia.play();
        }

        // Repeat access test
        System.out.println("\n--- Repeated Access Test ---");

        remoteProxy.play();
        virtualProxy.play();

        System.out.println("\nAll proxy tests completed!");
    }
}