package demo.DoorsFactory_1;

import demo.Carpenter;

public class Carpenter1thGrade implements Carpenter {
    @Override
    public void madeBoards() {
        System.out.println("Стругаю доски 1");
    }
}
