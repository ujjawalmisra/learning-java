public class CNFSample {
    public static void main(String[] args) {
        System.out.println("Will try to demo a ClassNotFoundException");
        SomeUnknownClass obj = new SomeUnknownClass();
        System.out.println("SomeUnknownClass obj --> " + obj);
    }
}
