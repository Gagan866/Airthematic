package Airthematic;

interface method {
    void add();
    void sub();
    void mul();

    
}

class operations implements method{
    public void add(){
        System.out.println("Addition");
    }
    public void sub(){
        System.out.println("Subtraction");
    }
    public void mul(){
        System.out.println("Multiplication");
    }
}