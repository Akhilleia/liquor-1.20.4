package net.conitexk.liquor;

import net.conitexk.liquor.data.*;
import net.conitexk.liquor.world.ModConfiguredFeatures;
import net.conitexk.liquor.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class LiquorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(LiquorBlockTagGenerator::new);
		pack.addProvider(LiquorItemTagGenerator::new);
		pack.addProvider(LiquorLootTableGenerator::new);
		pack.addProvider(LiquorModelProvider::new);
		pack.addProvider(LiquorRecipeGenerator::new);
		pack.addProvider(LiquorWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::boostrap);
	}

}