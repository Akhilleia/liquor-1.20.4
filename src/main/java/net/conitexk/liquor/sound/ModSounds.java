package net.conitexk.liquor.sound;

import net.conitexk.liquor.Liquor;
import net.conitexk.liquor.Liquor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent WHISKY_COKE_TEQUILA = registerSoundEvent("whisky_coke_tequila");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Liquor.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Liquor.LOGGER.info("Registering Sounds for " + Liquor.MOD_ID);
    }
}
