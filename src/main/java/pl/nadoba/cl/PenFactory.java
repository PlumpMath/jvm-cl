package pl.nadoba.cl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;

public class PenFactory {

    public static Penable getPenOverTheInternet() throws InstantiationException, IllegalAccessException, ClassNotFoundException, MalformedURLException {

        URL[] urls = new URL[]{new URL("jar:http://www.nadoba.pl/pen.jar!/pl/nadoba/cl/pen/Pen.class")};

        ClassLoader myCL = new MyClassLoader(urls);

        return (Penable) myCL.loadClass("pl.nadoba.cl.pen.Pen").newInstance();
    }
}

class MyClassLoader extends URLClassLoader {

    private URL url;

    public MyClassLoader(URL[] urls) {
        super(urls);
        this.url = urls[0];
    }


    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        byte[] bytes = null;
        try {
            URLConnection connection = url.openConnection();
            InputStream input = connection.getInputStream();
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            int data = input.read();

            while (data != -1) {
                buffer.write(data);
                data = input.read();
            }

            input.close();

            bytes = buffer.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Class<?> result = this.defineClass(name, bytes, 0, bytes.length);
        return result;
    }
}