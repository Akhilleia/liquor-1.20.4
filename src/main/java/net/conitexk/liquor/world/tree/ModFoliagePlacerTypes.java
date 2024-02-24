package net.conitexk.liquor.world.tree;

import net.conitexk.liquor.Liquor;
import net.conitexk.liquor.mixin.FoliagePlacerTypeInvoker;
import net.conitexk.liquor.world.tree.custom.CherryFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> CHERRY_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("cherry_foliage_placer", CherryFoliagePlacer.CODEC);

    public static void register() {
        Liquor.LOGGER.info("Registering Foliage Placer for " + Liquor.MOD_ID);
    }
}
