package net.conitexk.liquor.recipe;

import net.conitexk.liquor.Liquor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Liquor.MOD_ID, FermentationRecipe.Serializer.ID),
                FermentationRecipe.Serializer.INSTANCE);

        Registry.register(Registries.RECIPE_TYPE, new Identifier(Liquor.MOD_ID, FermentationRecipe.Type.ID),
                FermentationRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Liquor.MOD_ID, ShakerRecipe.Serializer.ID),
                ShakerRecipe.Serializer.INSTANCE);

        Registry.register(Registries.RECIPE_TYPE, new Identifier(Liquor.MOD_ID, ShakerRecipe.Type.ID),
                ShakerRecipe.Type.INSTANCE);
    }

}
