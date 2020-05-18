package HomeWORK.Part2.lesson1.Task1;

public class Robot  implements Jump, Running {
    String name;

    Robot(String name){
        this.name = name;
    }

    @Override
    public void Jum() {
        System.out.println(name + " не умеет прыгать ");

    }

    @Override
    public void Run() {
        System.out.println(name + " не умеет бегать ");

    }
}
