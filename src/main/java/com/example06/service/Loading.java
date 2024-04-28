package com.example06.service;

import com.example06.OverWeightException;
import com.example06.entity.Container;
import com.example06.entity.Ship;

import java.io.IOException;

public class Loading {
    public static Ship serveMethod(Ship ship, Container[] containers) throws OverWeightException{
            double all = 0;
            for (Container i:containers){
              all += i.getWeight();
            }
           if(ship.getWeightAll() <=all ){
              throw new OverWeightException(ship.getId(),ship.getName(),(all-ship.getWeightAll()));
           }
            ship.setContainers(containers);
           return ship;
    }
}
