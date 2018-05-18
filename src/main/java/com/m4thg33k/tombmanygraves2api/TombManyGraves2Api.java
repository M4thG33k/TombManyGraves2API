package com.m4thg33k.tombmanygraves2api;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = TombManyGraves2Api.MODID,
        name = TombManyGraves2Api.MODNAME,
        version = TombManyGraves2Api.VERSION,
        dependencies = TombManyGraves2Api.DEPENDENCIES
)
public class TombManyGraves2Api {


    public static final String MODID = "tombmanygraves2api";
    public static final String VERSION = "@VERSION@";
    public static final String MODNAME = "TombManyGraves2 API";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.3.2655,)";

    @Mod.Instance
    public static TombManyGraves2Api INSTANCE = new TombManyGraves2Api();
}


