# jvm-cl

Simple custom ClassLoader project illustrating how to swap class definition in runtime using JAR file downloaded from the remote server. 

```
Welcome to the custom JarClassLoader demo!
Our new pen appears. This one is created using application's ClassLoader:
	Make: Standard pen	/ Color: Standard color 	/ ClassLoader: sun.misc.Launcher$AppClassLoader@2b193f2d
Now the magic begins. We swap our little pen definition in runtime with the custom pen class got from www.nadoba.pl/pen.jar
Our old-new pen says Hi again:
	Make: Parker	/ Color: black 	/ ClassLoader: pl.nadoba.cl.MyClassLoader@6b884d57
We can observe that the same object has now the whole different definition.

Process finished with exit code 0
```

### Strangely doesn't work with exec-maven-plugin
