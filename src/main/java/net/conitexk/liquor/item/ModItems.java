package net.conitexk.liquor.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.conitexk.liquor.Liquor;
import net.conitexk.liquor.block.ModBlocks;
import net.conitexk.liquor.entity.ModBoats;
import net.conitexk.liquor.item.custom.LiquorBottleItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WHISKY = registerItem("whisky", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.WHISKY).maxCount(16)));
    public static final Item TEQUILA = registerItem("tequila", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.TEQUILA).maxCount(16)));
    public static final Item BEER = registerItem("beer", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.BEER).maxCount(16)));
    public static final Item RUM = registerItem("rum", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.RUM).maxCount(16)));
    public static final Item GIN = registerItem("gin", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.GIN).maxCount(16)));
    public static final Item VODKA = registerItem("vodka", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.VODKA).maxCount(16)));
    public static final Item MEAD = registerItem("mead", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.MEAD).maxCount(16)));
    public static final Item WINE = registerItem("wine", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.WINE).maxCount(16)));
    public static final Item CHAMPAGNE = registerItem("champagne", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.CHAMPAGNE).maxCount(16)));
    public static final Item BRANDY = registerItem("brandy", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.BRANDY).maxCount(16)));
    public static final Item VERMOUTH = registerItem("vermouth", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.VERMOUTH).maxCount(16)));
    public static final Item CIDER = registerItem("cider", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.CIDER).maxCount(16)));
    public static final Item ABSINTHE = registerItem("absinthe", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.ABSINTHE).maxCount(16)));
    public static final Item SCHNAPPS = registerItem("schnapps", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.SCHNAPPS).maxCount(16)));
    public static final Item GRAPPA = registerItem("grappa", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.GRAPPA).maxCount(16)));
    public static final Item COKE = registerItem("coke", new LiquorBottleItem(new FabricItemSettings().recipeRemainder(ModItems.LIQUOR_BOTTLE).food(ModFoodComponents.COKE).maxCount(16)));
    
    public static final Item LIQUOR_BOTTLE = registerItem("liquor_bottle", new Item(new FabricItemSettings().maxCount(16)));

    public static final Item GRAIN_MASH = registerItem("grain_mash", new Item(new FabricItemSettings()));

    public static final Item RICE = registerItem("rice",
            new Item(new FabricItemSettings().food(ModFoodComponents.RICE)));
    public static final Item ORYZA_SATIVA = registerItem("oryza_sativa",
            new AliasedBlockItem(ModBlocks.RICE_CROP, new FabricItemSettings()));

    public static final Item CORN_SEEDS = registerItem("corn_seeds",
            new AliasedBlockItem(ModBlocks.CORN_CROP, new FabricItemSettings()));
    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings().food(ModFoodComponents.CORN)));
    //------------------------------------------------------------------------------------------------------------------
    public static final Item GRAPE = registerItem("grape", new Item(new FabricItemSettings().food(ModFoodComponents.GRAPE).maxCount(32)));
    public static final Item CHERRY = registerItem("cherry", new Item(new FabricItemSettings().food(ModFoodComponents.CHERRY).maxCount(32)));
    //------------------------------------------------------------------------------------------------------------------
    public static final Item BARLEY_SEEDS = registerItem("barley_seeds",
            new AliasedBlockItem(ModBlocks.BARLEY_CROP, new FabricItemSettings()));
    public static final Item BARLEY = registerItem("barley",
            new Item(new FabricItemSettings()));
    //------------------------------------------------------------------------------------------------------------------

    public static final Item CHERRY_SIGN = registerItem("cherry_sign",
    new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CHERRY_SIGN, ModBlocks.WALL_CHERRY_SIGN));

    public static final Item HANGING_CHERRY_SIGN = registerItem("cherry_hanging_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.HANGING_CHERRY_SIGN, ModBlocks.WALL_HANGING_CHERRY_SIGN));

    public static final Item CHERRY_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CHERRY_BOAT_ID, ModBoats.CHERRY_BOAT_KEY, false);
    public static final Item CHERRY_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CHERRY_CHEST_BOAT_ID, ModBoats.CHERRY_BOAT_KEY, false);

    //------------------------------------------------------------------------------------------------------------------
    private static void addItemsToFood_And_DrinkItemGroup(FabricItemGroupEntries entries) {
        //Şişe
        entries.add(LIQUOR_BOTTLE);
        //Alkoller
        entries.add(WHISKY);
        entries.add(TEQUILA);
        entries.add(BEER);
        entries.add(RUM);
        entries.add(GIN);
        entries.add(VODKA);
        entries.add(MEAD);
        entries.add(WINE);
        entries.add(CHAMPAGNE);
        entries.add(BRANDY);
        entries.add(VERMOUTH);
        entries.add(CIDER);
        entries.add(ABSINTHE);
        entries.add(SCHNAPPS);
        entries.add(GRAPPA);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Liquor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Liquor.LOGGER.info("Registering Mod Items for" + Liquor.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFood_And_DrinkItemGroup);
    }
}