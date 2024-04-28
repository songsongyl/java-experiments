package com.example06.resource;

import com.example06.entity.Container;
import com.example06.entity.Ship;

public class DatabaseUtils {
    private static final Ship SHIP = create();
    private static Ship create() {
        Container container1 = new Container(1, 23);
        Container container2 = new Container(2, 12);
        Container container3 = new Container(3, 45);
        Container[] containers = {container1, container2, container3};
        Ship ship1 = new Ship(1, "mike", 100, containers);
        return ship1;
    }
    public static Ship data(){
        return SHIP;
    }
}
