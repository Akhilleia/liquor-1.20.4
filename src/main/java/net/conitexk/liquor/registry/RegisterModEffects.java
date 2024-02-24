package net.conitexk.liquor.registry;

import net.conitexk.liquor.Liquor;
import net.conitexk.liquor.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegisterModEffects {

    public static void registerEffect(StatusEffect effect, String name) {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Liquor.MOD_ID, name), effect);
    }
    public static void registerEffects() {
        registerEffect(ModEffects.FREEZE, "freeze");
    }
}
