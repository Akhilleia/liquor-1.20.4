package net.conitexk.liquor.data;

import net.conitexk.liquor.block.ModBlocks;
import net.conitexk.liquor.block.custom.BarleyCropBlock;
import net.conitexk.liquor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class LiquorItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public LiquorItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.CHERRY_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.CHERRY_LOG.asItem())
                .add(ModBlocks.CHERRY_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHERRY_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHERRY_WOOD.asItem());

    }
}



    //AnyOfLootCondition.Builder builder2 =
            //BlockStatePropertyLootCondition.builder(ModBlocks.BARLEY_CROP).properties(StatePredicate.Builder.create()
                            //.exactMatch(BarleyCropBlock.AGE, 7))
                    //.or(BlockStatePropertyLootCondition.builder(ModBlocks.BARLEY_CROP).properties(StatePredicate.Builder.create()
                            //.exactMatch(BarleyCropBlock.AGE, 8)));
    //addDrop(ModBlocks.BARLEY_CROP, CropDrops(ModBlocks.BARLEY_CROP, ModItems.BARLEY, ModItems.BARLEY_SEEDS, builder2));
//}


    //@Override
    //public void generate() {
        //addDrop(ModBlocks.LIQUOR_BARREL);
//}

    //@Override
    //public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIQUOR_BARREL);

       //BlockStateModelGenerator.registerCrop(ModBlocks.BARLEY_CROP, BarleyCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8);