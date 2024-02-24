package net.conitexk.liquor.world.tree;

import net.conitexk.liquor.Liquor;
import net.conitexk.liquor.mixin.TrunkPlacerTypeInvoker;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> CHERRY_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("cherry_trunk_placer", CherryTrunkPlacer.CODEC);

    public static void register() {
        Liquor.LOGGER.info("Registering Trunk Placers for " + Liquor.MOD_ID);
    }
}
