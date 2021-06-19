public class Main {

    public static void main(String[] args){
<<<<<<< Updated upstream
        System.out.println("Starting REST Service...");
        ResourceConfig rc = new ResourceConfig().packages("at.resources");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
        System.out.println("Server started");

        try {
            //noinspection ResultOfMethodCallIgnored
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        server.stop(0);
        System.out.println("Server stopped");
    }
=======

>>>>>>> Stashed changes
    }
}
