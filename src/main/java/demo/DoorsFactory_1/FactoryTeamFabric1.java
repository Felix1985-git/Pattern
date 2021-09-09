package demo.DoorsFactory_1;

import demo.*;

public class FactoryTeamFabric1 implements DoorShop {
    @Override
    public Carpenter getCarpenter() {
        return new Carpenter1thGrade();
    }

    @Override
    public Fitter getFitter() {
        return new Fitter1thGrade();
    }

    @Override
    public Paint getPaint() {
        return new Paint1thGradle();
    }

    @Override
    public Manager getManager() {
        return new Boss1thGrade();
    }
}
