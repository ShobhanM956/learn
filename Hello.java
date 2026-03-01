class Hello{

    private String name;

    public void getName(){
        System.out.println("Name is " + name);
    }
    public void setName(String n){
        name = n;
    }

    Hello(){
        System.out.println("Constructor is called");
    }

    public void printSurname(String name){
        System.out.println("Surname is "+ this.name);
    }

    public static void main(String[] args){
        System.out.println("Worldsmss");
        Hello hello = new Hello();
        Hello2 h2 = new Hello2();
        h2.callHello();
        // hello.operation();
    }
}    

class Hello2{
    
    Hello2(){
        System.out.println("Hello2 Constructor is called");
    }
    Hello h = new Hello();
    public void callHello(){
        h.setName("Shobhan");
        h.getName();
        h.printSurname("Mondal");
    }
}
