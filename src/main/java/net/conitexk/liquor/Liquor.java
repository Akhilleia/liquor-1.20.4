package net.conitexk.liquor;

import net.conitexk.liquor.block.ModBlocks;
import net.conitexk.liquor.block.entity.ModBlockEntities;
import net.conitexk.liquor.entity.ModBoats;
import net.conitexk.liquor.item.ModItemGroups;
import net.conitexk.liquor.item.ModItems;
import net.conitexk.liquor.recipe.ModRecipes;
import net.conitexk.liquor.registry.RegisterModEffects;
import net.conitexk.liquor.screen.ModScreenHandlers;
import net.conitexk.liquor.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.conitexk.liquor.sound.ModSounds;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.item.ItemStack;
import net.minecraft.util.TypedActionResult;
import net.conitexk.liquor.listener.ItemConsumptionListener;

public class Liquor implements ModInitializer {

	public static final String MOD_ID = "liquor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		RegisterModEffects.registerEffects();

		ModBlockEntities.registerBlockEntites();
		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();

		LOGGER.info("Liquor works properly! BARIS, ANNENE SELAMLAR KARDESIM!<3");
		LOGGER.info("Liquor works properly! MURATHAN, ANNENE SELAMLAR KARDESIM!<3");

		// Register the item consumption listener
		UseItemCallback.EVENT.register((player, world, hand) -> {
			ItemStack consumedItem = player.getStackInHand(hand);
			ItemConsumptionListener.onItemConsumed(player, consumedItem, world);
			return TypedActionResult.pass(consumedItem);
		});

		StrippableBlockRegistry.register(ModBlocks.CHERRY_LOG, ModBlocks.STRIPPED_CHERRY_LOG);
		StrippableBlockRegistry.register(ModBlocks.CHERRY_WOOD, ModBlocks.STRIPPED_CHERRY_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHERRY_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHERRY_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_LEAVES, 30, 60);

		ModBoats.registerBoats();
		ModWorldGeneration.generateModWorldGen();

	}
}