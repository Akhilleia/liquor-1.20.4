package net.conitexk.liquor.data;

import net.conitexk.liquor.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class LiquorBlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public LiquorBlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE); //bişey eklersen ";" sil
                //.add(ModBlocks.//bişey)
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE); //bişey eklersen ";" sil
                //.add(ModBlocks.//bişey)
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE); //bişey eklersen ";" sil
                //.add(ModBlocks.//bişey)
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE); //bişey eklersen ";" sil
                //.add(ModBlocks.//bişey)

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL); //bişey eklersen ";" sil
                //.add(ModBlocks.//bişey)
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL); //bişey eklersen ";" sil
                //.add(ModBlocks.//bişey)
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL); //bişey eklersen ";" sil
                //.add(ModBlocks.//bişey)

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4"))); //bişey eklersen ";" sil
                //.add(ModBlocks.//bişey)


        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.CHERRY_LOG)
                .add(ModBlocks.CHERRY_WOOD)
                .add(ModBlocks.STRIPPED_CHERRY_LOG)
                .add(ModBlocks.STRIPPED_CHERRY_WOOD);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.CHERRY_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.CHERRY_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.CHERRY_WALL);


    }
}
