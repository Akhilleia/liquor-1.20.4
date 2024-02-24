package net.conitexk.liquor.item;

import net.conitexk.liquor.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f).build();
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f).build();

    public static final FoodComponent GRAPE = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f).build();
    public static final FoodComponent CHERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f).build();
//----------------------------------------------------------------------------------------------------------------------
    public static final FoodComponent WHISKY = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 800, 2), 1F).
            statusEffect(new StatusEffectInstance(ModEffects.FREEZE, 200, 2), 0.5F).build();

    public static final FoodComponent TEQUILA = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();

    public static final FoodComponent BEER = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();

    public static final FoodComponent RUM = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.15F).alwaysEdible().build();

    public static final FoodComponent GIN = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();

    public static final FoodComponent VODKA = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();

    public static final FoodComponent MEAD = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();

    public static final FoodComponent WINE = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().
            statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 100, 0), 1F).alwaysEdible().build();

    public static final FoodComponent CHAMPAGNE = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();

    public static final FoodComponent BRANDY = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();

    public static final FoodComponent VERMOUTH = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();

    public static final FoodComponent CIDER = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();

    public static final FoodComponent ABSINTHE = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.15F).alwaysEdible().
            statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 100, 0), 0.15F).alwaysEdible().build();

    public static final FoodComponent SCHNAPPS = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();

    public static final FoodComponent GRAPPA = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();

    public static final FoodComponent COKE = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 0.10F).alwaysEdible().build();



}