package HomeWORK.Part2.lesson1.Task2;

public class Result {
    public static void main(String[] args) {
        Player pl1 = new Player("Player1", 125, 30);
        Player pl2 = new Player("Player2",25,25);
        Barrier wall = new Wall(15);
        Barrier Runtrack = new Runtrack(40);
        pl1.run(Runtrack);
        pl1.actionInfo(Runtrack);
        pl1.run(wall);
        pl1.actionInfo(wall);
        pl2.run(Runtrack);
        pl2.actionInfo(Runtrack);
        pl2.run(wall);
        pl2.actionInfo(wall);

    }
}
