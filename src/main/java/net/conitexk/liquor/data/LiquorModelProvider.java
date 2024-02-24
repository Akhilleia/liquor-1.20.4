package net.conitexk.liquor.data;

import net.conitexk.liquor.block.ModBlocks;
import net.conitexk.liquor.block.custom.BarleyCropBlock;
import net.conitexk.liquor.block.custom.CornCropBlock;
import net.conitexk.liquor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import java.util.Optional;

public class LiquorModelProvider extends FabricModelProvider {
    public LiquorModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleState(ModBlocks.FERMENTATION);
        blockStateModelGenerator.registerSimpleState(ModBlocks.SHAKER);

        blockStateModelGenerator.registerCrop(ModBlocks.BARLEY_CROP, BarleyCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8);
        blockStateModelGenerator.registerCrop(ModBlocks.CORN_CROP, CornCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8);
//----------------------------------------------------------------------------------------------------------------------
        blockStateModelGenerator.registerLog(ModBlocks.CHERRY_LOG).log(ModBlocks.CHERRY_LOG).wood(ModBlocks.CHERRY_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CHERRY_LOG).log(ModBlocks.STRIPPED_CHERRY_LOG).wood(ModBlocks.STRIPPED_CHERRY_WOOD);
        //AaAaAaAaAa
        BlockStateModelGenerator.BlockTexturePool cherryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHERRY_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHERRY_LEAVES);
        //AaAaAaAaAa
        cherryPool.stairs(ModBlocks.CHERRY_STAIRS);
        cherryPool.slab(ModBlocks.CHERRY_SLAB);
        cherryPool.button(ModBlocks.CHERRY_BUTTON);
        cherryPool.pressurePlate(ModBlocks.CHERRY_PRESSURE_PLATE);
        cherryPool.fence(ModBlocks.CHERRY_FENCE);
        cherryPool.fenceGate(ModBlocks.CHERRY_FENCE_GATE);
        cherryPool.wall(ModBlocks.CHERRY_WALL);
        //AaAaAaAaAa
        blockStateModelGenerator.registerDoor(ModBlocks.CHERRY_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHERRY_TRAPDOOR);

        blockStateModelGenerator.registerTintableCross(ModBlocks.CHERRY_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        cherryPool.family(ModBlocks.CHERRY_FAMILY);

//----------------------------------------------------------------------------------------------------------------------
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TEQUILA, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHISKY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.VODKA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHAMPAGNE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.VERMOUTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.CIDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ABSINTHE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCHNAPPS, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPPA, Models.GENERATED);
        itemModelGenerator.register(ModItems.COKE, Models.GENERATED);

        itemModelGenerator.register(ModItems.LIQUOR_BOTTLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ORYZA_SATIVA, Models.GENERATED);
        itemModelGenerator.register(ModItems.RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARLEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAIN_MASH, Models.GENERATED);

        itemModelGenerator.register(ModItems.GRAPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY, Models.GENERATED);

        itemModelGenerator.register(ModItems.HANGING_CHERRY_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.CHERRY_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_CHEST_BOAT, Models.GENERATED);

    }
}