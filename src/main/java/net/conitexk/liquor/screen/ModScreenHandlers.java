package net.conitexk.liquor.screen;

import net.conitexk.liquor.Liquor;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<FermentationScreenHandler> FERMENTATION_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Liquor.MOD_ID, "fermentation"),
                    new ExtendedScreenHandlerType<>(FermentationScreenHandler::new));

    public static final ScreenHandlerType<ShakerScreenHandler> SHAKER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Liquor.MOD_ID, "shaker"),
                    new ExtendedScreenHandlerType<>(ShakerScreenHandler::new));

    public static void registerScreenHandlers() {
        Liquor.LOGGER.info("Registering Screen Handlers for " + Liquor.MOD_ID);
    }
}
