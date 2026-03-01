class App implements InnerApp01 {
    public void myMethod(){
    System.out.println("Hello World");
    }
}

interface InnerApp01 {
    
    public void myMethod();
    
}

public class App01 {
public static void main(String[] args) {
    App myApp = new App();
    myApp.myMethod();
}
}
