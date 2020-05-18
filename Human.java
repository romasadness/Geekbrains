package HomeWORK.Part2.lesson1.Task1;

public class Human implements Jump,Running {
    String name;
    Human(String name){
        this.name = name;
    }

    @Override
    public void Jum() {
        System.out.println(name + " умеет прыгать ");

    }

    @Override
    public void Run() {
        System.out.println(name + " Умеет бегать ");

    }
}
