package com.example06;
import com.example06.entity.Container;
import com.example06.entity.Ship;
import com.example06.service.Loading;
import com.example06.resource.DatabaseUtils;


public class Test {
    public static void main(String[] args){

     test01();
    test02();
    }
public static void test01(){
    Ship ship = DatabaseUtils.data();
    Container[] containers =   ship.getContainers();

    try {
        Ship ship1 = Loading.serveMethod(ship,containers);
        System.out.println(ship1.getName());
    }catch (OverWeightException e){
        System.out.println(e.getMessage());
        //System.out.println(ship.getId() + " " + ship.getName() + " " + (all - ship.getWeightAll()));
    }finally {
        System.out.println("启航");
    }
}

public static void test02(){
    Ship ship = DatabaseUtils.data();
    Container[] containers =   ship.getContainers();
    Container container = new Container(4,12);
    Container container1 = new Container(5,98);
    Container[] containers1 = {container1 , container};
    ship.setContainers(containers1);
    try {
        Ship ship1 = Loading.serveMethod(ship,containers1);
        System.out.println(ship1.getName());
    }catch (OverWeightException e){
        System.out.println(e.getMessage());
        //System.out.println(ship.getId() + " " + ship.getName() + " " + (all - ship.getWeightAll()));
    }finally {
        System.out.println("启航");
    }

}
}
