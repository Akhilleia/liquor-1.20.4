package net.conitexk.liquor.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.conitexk.liquor.Liquor;
import net.conitexk.liquor.block.ModBlocks;
import net.conitexk.liquor.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Language;

public class ModBoats {
    public static final Identifier CHERRY_BOAT_ID = new Identifier(Liquor.MOD_ID, "cherry_boat");
    public static final Identifier CHERRY_CHEST_BOAT_ID = new Identifier(Liquor.MOD_ID, "cherry_chest_boat");

    public static final RegistryKey<TerraformBoatType> CHERRY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CHERRY_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType cherryBoat =  new TerraformBoatType.Builder()
                .item(ModItems.CHERRY_BOAT)
                .chestItem(ModItems.CHERRY_CHEST_BOAT)
                .planks(ModBlocks.CHERRY_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE,CHERRY_BOAT_KEY, cherryBoat);

    }
}
