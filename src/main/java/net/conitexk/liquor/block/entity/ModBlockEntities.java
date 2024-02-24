package net.conitexk.liquor.block.entity;

import net.conitexk.liquor.Liquor;
import net.conitexk.liquor.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<FermentationBlockEntity> FERMENTATION_BLOCK_ENTITY_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Liquor.MOD_ID, "fermentation_be"),
                    FabricBlockEntityTypeBuilder.create(FermentationBlockEntity::new,
                            ModBlocks.FERMENTATION).build());

    public static final BlockEntityType<ShakerBlockEntity> SHAKER_BLOCK_ENTITY_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Liquor.MOD_ID, "shaker_be"),
                    FabricBlockEntityTypeBuilder.create(ShakerBlockEntity::new,
                            ModBlocks.SHAKER).build());

    public static void registerBlockEntites() {
        Liquor.LOGGER.info("Registering Block Entities for " + Liquor.MOD_ID);
    }

}
