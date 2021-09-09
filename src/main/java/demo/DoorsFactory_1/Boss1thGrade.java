package demo.DoorsFactory_1;

import demo.Manager;

public class Boss1thGrade implements Manager {
    @Override
    public void manage() {
        System.out.println("Слежу как собирают двери 1");
    }
}
