public class CoreJavaMethods {

    public static void main(String[] args) {
        CoreJavaMethods m = new CoreJavaMethods();
        m.greeting();
        System.out.println(m.getData());

        CoreJavaMethods2 m2 = new CoreJavaMethods2();
        m2.getData();

        printSomething();

    }

    public void greeting(){
        System.out.println("Hi There!");
    }

    public String getData(){
        return "Hello World";
    }

    public static void printSomething(){
        System.out.println("bye bye!");
    }

}
