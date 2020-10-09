package demo;

public class FootBall extends Ball{
    public FootBall(int size, String name) {
        super(size, name);
    }

    @Override
    public String ekstraInfo() {
        return "jeg er stadig en dum fodbold";
    }
}
