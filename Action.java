package HomeWORK.Part2.lesson1.Task2;

public interface Action {
    boolean run(Barrier barrier);

    boolean jump (Barrier barrier);

    void actionInfo(Barrier barrier);
}
