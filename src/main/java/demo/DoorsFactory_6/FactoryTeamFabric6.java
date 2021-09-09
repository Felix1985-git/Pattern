package demo.DoorsFactory_6;

import demo.*;

public class FactoryTeamFabric6 implements DoorShop {
    @Override
    public Carpenter getCarpenter() {
        return new Carpenter6thGrade();
    }

    @Override
    public Fitter getFitter() {
        return new Fitter6thGrade();
    }

    @Override
    public Paint getPaint() {
        return new Paint6thGradle();
    }

    @Override
    public Manager getManager() {
        return new Boss6tnGrade();
    }
}
