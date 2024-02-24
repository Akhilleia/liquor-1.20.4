package net.conitexk.liquor.item;

import net.conitexk.liquor.Liquor;
import net.conitexk.liquor.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LIQUORS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Liquor.MOD_ID, "liquors"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.liquors"))
                    .icon(() -> new ItemStack(ModItems.WHISKY)).entries((displayContext, entries) -> {
//----------------------------------------------------------------------------------------------------------------------
                        entries.add(ModItems.TEQUILA);
                        entries.add(ModItems.WHISKY);
                        entries.add(ModItems.BEER);
                        entries.add(ModItems.RUM);
                        entries.add(ModItems.GIN);
                        entries.add(ModItems.VODKA);
                        entries.add(ModItems.MEAD);
                        entries.add(ModItems.WINE);
                        entries.add(ModItems.CHAMPAGNE);
                        entries.add(ModItems.BRANDY);
                        entries.add(ModItems.VERMOUTH);
                        entries.add(ModItems.CIDER);
                        entries.add(ModItems.ABSINTHE);
                        entries.add(ModItems.SCHNAPPS);
                        entries.add(ModItems.GRAPPA);
                        entries.add(ModItems.COKE);

                        entries.add(ModItems.LIQUOR_BOTTLE);
//----------------------------------------------------------------------------------------------------------------------

                        entries.add(ModItems.GRAPE);

                        entries.add(ModItems.GRAIN_MASH);

                        entries.add(ModItems.CORN);
                        entries.add(ModItems.CORN_SEEDS);

                        entries.add(ModItems.BARLEY);
                        entries.add(ModItems.BARLEY_SEEDS);
//----------------------------------------------------------------------------------------------------------------------
                        entries.add(ModBlocks.FERMENTATION);
                        entries.add(ModBlocks.SHAKER);
//----------------------------------------------------------------------------------------------------------------------
                        entries.add(ModBlocks.CHERRY_LOG);
                        entries.add(ModBlocks.CHERRY_WOOD);
                        entries.add(ModBlocks.STRIPPED_CHERRY_LOG);
                        entries.add(ModBlocks.STRIPPED_CHERRY_WOOD);
                        entries.add(ModBlocks.CHERRY_PLANKS);
                        entries.add(ModBlocks.CHERRY_LEAVES);

                        entries.add(ModBlocks.CHERRY_STAIRS);
                        entries.add(ModBlocks.CHERRY_SLAB);
                        entries.add(ModBlocks.CHERRY_FENCE);
                        entries.add(ModBlocks.CHERRY_FENCE_GATE);
                        entries.add(ModBlocks.CHERRY_WALL);
                        entries.add(ModBlocks.CHERRY_DOOR);
                        entries.add(ModBlocks.CHERRY_TRAPDOOR);
                        entries.add(ModBlocks.CHERRY_BUTTON);
                        entries.add(ModBlocks.CHERRY_PRESSURE_PLATE);

                        entries.add(ModItems.CHERRY_SIGN);
                        entries.add(ModItems.HANGING_CHERRY_SIGN);

                        entries.add(ModItems.CHERRY_BOAT);
                        entries.add(ModItems.CHERRY_CHEST_BOAT);

                        entries.add(ModBlocks.CHERRY_SAPLING);
                        entries.add(ModItems.CHERRY);

//----------------------------------------------------------------------------------------------------------------------
                    }).build());



    public static void registerItemGroups(){
        Liquor.LOGGER.info("Registering Item Groups for " + Liquor.MOD_ID);
    }
}
