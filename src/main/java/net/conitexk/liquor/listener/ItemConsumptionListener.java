package net.conitexk.liquor.listener;

import net.conitexk.liquor.Liquor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
// TODO
public class ItemConsumptionListener {
    private static final Map<Item, Integer> consumedItems = new HashMap<>();
    private static final Identifier WHISKY_COKE_TEQUILA = new Identifier(Liquor.MOD_ID, "whisky_coke_tequila");

    // Store the names of consumable items directly
    private static final String[] CONSUMABLE_ITEM_NAMES = {"whisky", "coke", "tequila"};

    public static void onItemConsumed(PlayerEntity player, ItemStack consumedItem, World world) {
        if (!world.isClient) {
            Item item = consumedItem.getItem();
            if (isConsumable(item)) {
                int count = consumedItems.getOrDefault(item, 0) + 1;
                consumedItems.put(item, count);
                Liquor.LOGGER.info("Consumed " + item.getName().getString() + " - Count: " + count);
                if (count == CONSUMABLE_ITEM_NAMES.length) {
                    playSound(world, player);
                    consumedItems.clear(); // Reset consumed items after playing the sound
                }
            }
        }
    }

    private static boolean isConsumable(Item item) {
        String itemName = item.getName().getString().toLowerCase();
        for (String consumableItemName : CONSUMABLE_ITEM_NAMES) {
            if (itemName.contains(consumableItemName)) {
                return true;
            }
        }
        return false;
    }

    private static void playSound(World world, PlayerEntity player) {
        world.playSound(null, player.getBlockPos(), SoundEvent.of(WHISKY_COKE_TEQUILA), SoundCategory.PLAYERS, 1.0f, 2.0f);
    }
}