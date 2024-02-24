package net.conitexk.liquor.data;

import net.conitexk.liquor.block.ModBlocks;
import net.conitexk.liquor.block.custom.BarleyCropBlock;
import net.conitexk.liquor.block.custom.CornCropBlock;
import net.conitexk.liquor.block.custom.RiceCropBlock;
import net.conitexk.liquor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.item.ItemConvertible;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import java.util.function.Function;

public class LiquorLootTableGenerator extends FabricBlockLootTableProvider {
    public LiquorLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.RICE_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(RiceCropBlock.AGE, 7));
        addDrop(ModBlocks.RICE_CROP, cropDrops(ModBlocks.RICE_CROP, ModItems.RICE, ModItems.ORYZA_SATIVA, builder));

        AnyOfLootCondition.Builder builder2 =
                BlockStatePropertyLootCondition.builder(ModBlocks.BARLEY_CROP).properties(StatePredicate.Builder.create()
                                .exactMatch(BarleyCropBlock.AGE, 7))
                        .or(BlockStatePropertyLootCondition.builder(ModBlocks.BARLEY_CROP).properties(StatePredicate.Builder.create()
                                .exactMatch(BarleyCropBlock.AGE, 8)));

        addDrop(ModBlocks.BARLEY_CROP, cropDrops(ModBlocks.BARLEY_CROP, ModItems.BARLEY, ModItems.BARLEY_SEEDS, builder2));

        AnyOfLootCondition.Builder builder3 =
                BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create()
                                .exactMatch(CornCropBlock.AGE, 7))
                        .or(BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create()
                                .exactMatch(CornCropBlock.AGE, 8)));

        // BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create()
        //         .exactMatch(CornCropBlock.AGE, 8));

        addDrop(ModBlocks.CORN_CROP, cropDrops(ModBlocks.CORN_CROP, ModItems.CORN, ModItems.CORN_SEEDS, builder3));


        addDrop(ModBlocks.CHERRY_LOG);
        addDrop(ModBlocks.CHERRY_WOOD);
        addDrop(ModBlocks.STRIPPED_CHERRY_LOG);
        addDrop(ModBlocks.STRIPPED_CHERRY_WOOD);
        addDrop(ModBlocks.CHERRY_PLANKS);
        addDrop(ModBlocks.CHERRY_SAPLING);

        addDrop(ModBlocks.CHERRY_LEAVES, leavesDrops(ModBlocks.CHERRY_LEAVES, ModBlocks.CHERRY_SAPLING,0.05f));

        addDrop(ModBlocks.CHERRY_STAIRS);
        addDrop(ModBlocks.CHERRY_FENCE);
        addDrop(ModBlocks.CHERRY_TRAPDOOR);
        addDrop(ModBlocks.CHERRY_WALL);
        addDrop(ModBlocks.CHERRY_FENCE_GATE);
        addDrop(ModBlocks.CHERRY_BUTTON);
        addDrop(ModBlocks.CHERRY_PRESSURE_PLATE);

        addDrop(ModBlocks.CHERRY_DOOR, doorDrops(ModBlocks.CHERRY_DOOR));
        addDrop(ModBlocks.CHERRY_SLAB, slabDrops(ModBlocks.CHERRY_SLAB));


    }


}