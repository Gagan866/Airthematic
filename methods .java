package Airthematic;

interface methods{
    void add();
    void sub();
    void mul();
}

class operations implements methods{
    public void add(){
        System.out.println("Addition is: "+(10+20));
    }
    public void sub(){
        System.out.println("Subtraction is: "+(10-20));
    }
    public void mul(){
        System.out.println("Multiplication is: "+(10*20));
    }


}