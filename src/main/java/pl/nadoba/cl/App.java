package pl.nadoba.cl;

import java.net.MalformedURLException;

public class App {
    public static void main(String[] args) throws InstantiationException,
            IllegalAccessException, ClassNotFoundException,
            InterruptedException, MalformedURLException {

        System.out.println("Welcome to the custom JarClassLoader demo!");

        Penable pen = new StandardPen();

        System.out.println("Our new pen appears. This one is created using application's ClassLoader:");
        System.out.println("\tMake: " + pen.getMake() + "\t/ Color: " + pen.getColor() + " \t/ ClassLoader: " + pen.getClass().getClassLoader());


        System.out.println("Now the magic begins. We swap our little pen definition in runtime with the custom pen class got from www.nadoba.pl/pen.jar");

        pen = PenFactory.getPenOverTheInternet();

        System.out.println("Our old-new pen says Hi again:");
        System.out.println("\tMake: " + pen.getMake() + "\t/ Color: " + pen.getColor() + " \t/ ClassLoader: " + pen.getClass().getClassLoader());

        System.out.println("We can observe that the same object has now the whole different definition.");
    }
}
