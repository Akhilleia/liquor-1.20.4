package net.conitexk.liquor.world.tree;

import net.conitexk.liquor.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator CHERRY =
            new SaplingGenerator("cherry", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.CHERRY_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

}
