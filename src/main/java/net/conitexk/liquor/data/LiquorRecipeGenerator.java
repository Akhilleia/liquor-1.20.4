package net.conitexk.liquor.data;

import net.conitexk.liquor.block.ModBlocks;
import net.conitexk.liquor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.ImpossibleCriterion;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class LiquorRecipeGenerator extends FabricRecipeProvider {
    //private static List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.//RAW_RUBY,
            //ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModBlocks.NETHER_RUBY_ORE, ModBlocks.END_STONE_RUBY_ORE);



    public LiquorRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        //offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                //0.7f, 200, "ruby");
        //offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                //0.7f, 200, "ruby");
//----------------------------------------------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FERMENTATION)
                .pattern("B B")
                .pattern(" I ")
                .pattern("S S")
                .input('B', Items.BARREL)
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.BARREL), conditionsFromItem(Items.BARREL))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FERMENTATION)));
//----------------------------------------------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHERRY_BOAT)
                .pattern("C C")
                .pattern("CCC")
                .input('C', Items.CHERRY_PLANKS)
                .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHERRY_BOAT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHERRY_CHEST_BOAT)
                .pattern("CB ")
                .pattern("   ")
                .input('C', Items.CHEST)
                .input('B', ModItems.CHERRY_BOAT)
                .criterion(hasItem(ModItems.CHERRY_BOAT), conditionsFromItem(ModItems.CHERRY_BOAT))
                .criterion(hasItem(Items.CHEST), conditionsFromItem(Items.CHEST))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHERRY_CHEST_BOAT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STANDING_CHERRY_SIGN, 3)
                .pattern("CCC")
                .pattern("CCC")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModBlocks.CHERRY_PLANKS)
                .criterion(hasItem(ModBlocks.CHERRY_PLANKS), conditionsFromItem(ModBlocks.CHERRY_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STANDING_CHERRY_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.HANGING_CHERRY_SIGN, 6)
                .pattern("S S")
                .pattern("CCC")
                .pattern("CCC")
                .input('S', Items.CHAIN)
                .input('C', ModBlocks.STRIPPED_CHERRY_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_CHERRY_LOG), conditionsFromItem(ModBlocks.STRIPPED_CHERRY_LOG))
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.HANGING_CHERRY_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', ModBlocks.CHERRY_PLANKS)
                .criterion(hasItem(ModBlocks.CHERRY_PLANKS), conditionsFromItem(ModBlocks.CHERRY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_SLAB, 6)
                .pattern("CCC")
                .input('C', ModBlocks.CHERRY_PLANKS)
                .criterion(hasItem(ModBlocks.CHERRY_PLANKS), conditionsFromItem(ModBlocks.CHERRY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_BUTTON)
                .pattern(" C ")
                .input('C', ModBlocks.CHERRY_PLANKS)
                .criterion(hasItem(ModBlocks.CHERRY_PLANKS), conditionsFromItem(ModBlocks.CHERRY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_PRESSURE_PLATE)
                .pattern("CC ")
                .input('C', ModBlocks.CHERRY_PLANKS)
                .criterion(hasItem(ModBlocks.CHERRY_PLANKS), conditionsFromItem(ModBlocks.CHERRY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_FENCE, 3)
                .pattern("CSC")
                .pattern("CSC")
                .input('S', ModBlocks.CHERRY_PLANKS)
                .input('C', Items.STICK)
                .criterion(hasItem(ModBlocks.CHERRY_PLANKS), conditionsFromItem(ModBlocks.CHERRY_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_FENCE_GATE)
                .pattern("CSC")
                .pattern("CSC")
                .input('S', ModBlocks.CHERRY_PLANKS)
                .input('C', Items.STICK)
                .criterion(hasItem(ModBlocks.CHERRY_PLANKS), conditionsFromItem(ModBlocks.CHERRY_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_DOOR, 3)
                .pattern("CC ")
                .pattern("CC ")
                .pattern("CC ")
                .input('C', ModBlocks.CHERRY_PLANKS)
                .criterion(hasItem(ModBlocks.CHERRY_PLANKS), conditionsFromItem(ModBlocks.CHERRY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_TRAPDOOR, 2)
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModBlocks.CHERRY_PLANKS)
                .criterion(hasItem(ModBlocks.CHERRY_PLANKS), conditionsFromItem(ModBlocks.CHERRY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_PLANKS, 4)
                .pattern("C  ")
                .input('C', ModBlocks.CHERRY_LOG)
                .criterion(hasItem(ModBlocks.CHERRY_LOG), conditionsFromItem(ModBlocks.CHERRY_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_WOOD, 3)
                .pattern("CC ")
                .pattern("CC ")
                .input('C', ModBlocks.CHERRY_LOG)
                .criterion(hasItem(ModBlocks.CHERRY_LOG), conditionsFromItem(ModBlocks.CHERRY_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_WOOD)));
//----------------------------------------------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIQUOR_BOTTLE, 3)
                .pattern("C C")
                .pattern(" C ")
                .input('C', Items.GLASS_BOTTLE)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIQUOR_BOTTLE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRAIN_MASH, 3)
                .input(ModItems.CORN)
                .input(ModItems.BARLEY)
                .input(Items.WHEAT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORN),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORN))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BARLEY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BARLEY))
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.GRAIN_MASH), FabricRecipeProvider.conditionsFromItem(ModItems.GRAIN_MASH)).offerTo(exporter);







    }
}