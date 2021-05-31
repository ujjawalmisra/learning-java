package me.ujjawal.learning_java.core;

/**
 * The first thing that we define in a Java program is the package. Packages are like namespaces for better
 * organization of the code. Packages are hierarchical in nature and follow the reverse FQDN approach. The name of
 * the package should be chosen so as to clearly depict the hierarchy as well as what is supposed to be the contents
 * of the package.<br>
 * As you can see the name of this package is me.ujjawal.learning.java.core. Let's analyze it.<br>
 * <b>me.ujjawal</b> is the reverse FQDN for a domain ujjawal.me. The next component of the package learning.java
 * define this project <b>learning-java</b>. Well it could as well have been java.learning.
 * After that we have <b>core</b>. This part of the package is suggestive that we would be talking a<br>bout very core
 * features of Java as a part of this package.<br>
 * Packages are always named in the lower case and without any special characters, except the dot used as the
 * separator for the parts of the package, and underscore when we are trying to represent the name of something that
 * is originally hyphenated.<br>
 * Also note that the package defined here should match the directory structure in which this class is kept. Each
 * part of the package is a directory. For example, the package <i>me.ujjawal.learning.java.core</i> means that this
 * class is a part of the directory <i>me/ujjawal/learning/java/core</i>.
 * We must try to be very particular about the choice of the name of the package.
 * After declaring the package to which this class belongs the next thing to follow is the imports. Imports are
 * similar to includes in C. They are a way to tell the compiler what all other classes do we depend on as a part of
 * this class. Those other classes might be a part of other packages. Those packages might be getting provided either
 * by the Java SDK or may be other libraries developed by others, commonly known as 3rd-party libraries.<br>
 * The IDEs of today are intelligent enough to locate these classes in the included libraries, or JARs as we call them.
 * A JAR is a collection of files (i.e. classes) organized in packages.<br>
 * Traditionally, JAVA needs to know the location of JARs so that it can load them and the classes in them. For this
 * JAVA relies on something called as CLASSPATH. Imagine CLASSPATH to be something similar to PATH. While PATH
 * defines the location of binaries for the operating system, CLASSPATH defines the location of classes for JAVA.<br>
 * Build systems like ANT, Maven and Gradle allow standard ways of allowing JARs to be included in projects.<br>
 * The first thing that you would notice here is the keyword <code>public</code>. This keyword is one of the scope
 * specifiers. Scope specifiers specify which all pieces of code in the project can see or make use of this
 * functionality and how. The functionality in reference can be a class, function, constant or variable. These are
 * some of the scope specifiers:<br>
 * <ol>
 *     <li><code>public</code> - Accessible everywhere.</li>
 *     <li><code>protected</code> - Accessible in this class and its subclasses, and this package.</li>
 *     <li><code>private</code> - Accessible only in this class.</li>
 *     <li><code>{DEFAULT}</code> - Accessible everywhere within this package.</li>
 * </ol>
 * <br>
 * References:
 * <ol>
 *     <li>{@link https://docs.oracle.com/javase/tutorial/java/package/packages.html}</li>
 *     <li>{@link https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html}</li>
 * </ol>
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
