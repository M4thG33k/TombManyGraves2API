package com.m4thg33k.tombmanygraves2api.api.events;

import com.m4thg33k.tombmanygraves2api.api.inventory.ISpecialInventory;
import net.minecraftforge.fml.common.eventhandler.Event;

import javax.annotation.ParametersAreNonnullByDefault;

public class EventRegisterMySpecialInventory extends Event {

    private ISpecialInventory myInventory;

    @ParametersAreNonnullByDefault
    public EventRegisterMySpecialInventory(ISpecialInventory iSpecialInventory){
        super();
        myInventory = iSpecialInventory;
    }

    public ISpecialInventory getInventory(){
        return myInventory;
    }
}
