package demo;

import demo.DoorsFactory_1.FactoryTeamFabric1;

public class BuildingDoors1 {
    public static void main(String[] args) {
        DoorShop doorShop = new FactoryTeamFabric1();
        Carpenter carpenter = doorShop.getCarpenter();
        Fitter fitter = doorShop.getFitter();
        Paint paint = doorShop.getPaint();
        Manager manager = doorShop.getManager();
        System.out.println("Приступаем делать двери");
        carpenter.madeBoards();
        fitter.pick();
        paint.paint();
        manager.manage();
    }
}
