package com.m4thg33k.tombmanygraves2api.api.inventory;

import com.m4thg33k.tombmanygraves2api.api.events.EventRegisterMySpecialInventory;
import net.minecraftforge.common.MinecraftForge;

public abstract class AbstractSpecialInventory implements ISpecialInventory {

    public AbstractSpecialInventory(){
        MinecraftForge.EVENT_BUS.post(new EventRegisterMySpecialInventory(this));
    }
}
