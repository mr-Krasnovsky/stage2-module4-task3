package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.repository.RectangleRepository;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver  implements Observer {
    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle = event.getSource();
        int id = rectangle.getId();
        double sideA = rectangle.getSideA();
        double sideB = rectangle.getSideB();
        
        RectangleValues values =new RectangleValues(sideA * sideB, 2d * sideA + 2d * sideB);
        RectangleWarehouse.getInstance().put(id, values);
    }
}
