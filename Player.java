package HomeWORK.Part2.lesson1.Task2;

public class Player implements Action {
    private String name;
    private int runLimit,  jumpLimit;


    public Player( String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }
    public  String getName(){
        return  name;
    }

    @Override
    public boolean run(Barrier barrier) {
        return (barrier.getLength() <= runLimit & barrier.getHeight() == 0);

    }

    @Override
    public boolean jump(Barrier barrier) {
        return (barrier.getHeight() <= jumpLimit & barrier.getLength() == 0);
    }

    public void actionInfo(Barrier barrier) {
        if (run(barrier)){
            System.out.println(getName() + "пробежал");
        }
        else if (jump(barrier)){
            System.out.println(getName() + " пригнул");
        }
        else System.out.println(getName() + " не смог ");
    }
}
