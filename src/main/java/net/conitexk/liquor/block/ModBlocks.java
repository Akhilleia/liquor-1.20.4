package net.conitexk.liquor.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.conitexk.liquor.Liquor;
import net.conitexk.liquor.block.custom.*;
import net.conitexk.liquor.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block FERMENTATION = registerBlock("fermentation",
            new FermentationBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    public static final Block SHAKER = registerBlock("shaker",
            new ShakerBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    public static final Block RICE_CROP = Registry.register(Registries.BLOCK, new Identifier(Liquor.MOD_ID, "rice_crop"),
            new RiceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block BARLEY_CROP = Registry.register(Registries.BLOCK, new Identifier(Liquor.MOD_ID, "barley_crop"),
            new BarleyCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block CORN_CROP = Registry.register(Registries.BLOCK, new Identifier(Liquor.MOD_ID, "corn_crop"),
            new CornCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
//----------------------------------------------------------------------------------------------------------------------
    public static final Block CHERRY_LOG = registerBlock("cherry_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block CHERRY_WOOD = registerBlock("cherry_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));

    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f).nonOpaque()));

    public static final Block CHERRY_STAIRS = registerBlock("cherry_stairs",
            new StairsBlock(ModBlocks.CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CHERRY_SLAB = registerBlock("cherry_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block CHERRY_BUTTON = registerBlock("cherry_button",
            new ButtonBlock(BlockSetType.OAK, 25,FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block CHERRY_FENCE = registerBlock("cherry_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CHERRY_WALL = registerBlock("cherry_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block CHERRY_DOOR = registerBlock("cherry_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Identifier CHERRY_SIGN_TEXTURE = new Identifier(Liquor.MOD_ID, "entity/signs/cherry");
    public static final Identifier CHERRY_HANGING_SIGN_TEXTURE = new Identifier(Liquor.MOD_ID, "entity/signs/hanging/cherry1");
    public static final Identifier CHERRY_HANGING_GUI_SIGN_TEXTURE = new Identifier(Liquor.MOD_ID, "textures/gui/hanging_signs/cherry");

    public static final Block STANDING_CHERRY_SIGN = Registry.register(Registries.BLOCK, new Identifier(Liquor.MOD_ID, "cherry_standing_sign"),
            new TerraformSignBlock(CHERRY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_CHERRY_SIGN = Registry.register(Registries.BLOCK, new Identifier(Liquor.MOD_ID, "cherry_wall_sign"),
            new TerraformWallSignBlock(CHERRY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_CHERRY_SIGN = Registry.register(Registries.BLOCK, new Identifier(Liquor.MOD_ID, "cherry_hanging_sign"),
            new TerraformHangingSignBlock(CHERRY_HANGING_SIGN_TEXTURE, CHERRY_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_CHERRY_SIGN = Registry.register(Registries.BLOCK, new Identifier(Liquor.MOD_ID, "cherry_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(CHERRY_HANGING_SIGN_TEXTURE, CHERRY_HANGING_GUI_SIGN_TEXTURE,FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final Block CHERRY_SAPLING = registerBlock("cherry_sapling",
            new SaplingBlock(ModSaplingGenerators.CHERRY, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));



    public static final BlockFamily CHERRY_FAMILY = BlockFamilies.register(ModBlocks.CHERRY_PLANKS)
            .sign(ModBlocks.STANDING_CHERRY_SIGN, ModBlocks.WALL_CHERRY_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();
//----------------------------------------------------------------------------------------------------------------------

    public static final Block GRAPE_BUSH_BLOCK = Registry.register(Registries.BLOCK, new Identifier(Liquor.MOD_ID, "grape_bush_block"),
            new BarleyCropBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Liquor.MOD_ID, name),block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Liquor.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Liquor.LOGGER.info("Registering ModBlocks for " + Liquor.MOD_ID);
    }
}
