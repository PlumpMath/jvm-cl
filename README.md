# jvm-cl

Simple custom ClassLoader project illustrating how to swap class definition in runtime using JAR file downloaded from the remote server. 

First of all we create a new instance of StandardPen. No magic - using simple 'new' keyword and class name from the package. 
Then class' fields are printed. We can observe that this instance is made using standard Sun AppClassLoader.
Next, we swap the variable definition with custom class got from the remote server in a JAR file.
After all details of the old-new Penable :) instance are printed the whole situation is clear - our Pen now says that it's made with custom MyClassLoader 
and  its fields have different values.


## running the project

`mvn compile exec:java`