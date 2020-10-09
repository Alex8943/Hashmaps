package demo;

public class TennisBall extends Ball {
    public TennisBall(int size, String name) {
        super(size, name);
    }


    @Override
    public boolean isTennisBall(){
        return true;
    }


}
