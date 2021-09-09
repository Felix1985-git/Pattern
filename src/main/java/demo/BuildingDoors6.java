package demo;

import demo.DoorsFactory_6.FactoryTeamFabric6;

public class BuildingDoors6 {
    public static void main(String[] args) {
        DoorShop doorShop = new FactoryTeamFabric6();
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
