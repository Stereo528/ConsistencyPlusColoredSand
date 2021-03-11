package clrdsnd;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SandBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static clrdsnd.ClrdSnd.MOD_ID;
import static net.minecraft.block.Blocks.SAND;

public class Blocks {

    public static final Block ORANGE_SAND = register("orange_sand", SandBlock(15750676));
    public static final Block YELLOW_SAND = register("yellow_sand", SandBlock(15786260));
    public static final Block LIME_SAND = register("lime_sand", SandBlock(8453990));
    public static final Block GREEN_SAND = register("green_sand", SandBlock(52265));
    public static final Block BLUE_SAND = register("blue_sand", SandBlock(329011));
    public static final Block LIGHT_BLUE_SAND = register("light_blue_sand", SandBlock(7907327));
    public static final Block CYAN_SAND = register("cyan_sand", SandBlock(3310259));
    public static final Block PURPLE_SAND = register("purple_sand", SandBlock(6684876));
    public static final Block MAGENTA_SAND = register("magenta_sand", SandBlock(10898943));
    public static final Block PINK_SAND = register("pink_sand", SandBlock(16741864));
    public static final Block LIGHT_GRAY_SAND = register("light_gray_sand", SandBlock(12566463));
    public static final Block GRAY_SAND = register("gray_sand", SandBlock(9737364));
    public static final Block WHITE_SAND = register("white_sand", SandBlock(16777215));
    public static final Block BLACK_SAND = register("black_sand", SandBlock(2500134));
    public static final Block BROWN_SAND = register("brown_sand", SandBlock(4993291));


    private static Block SandBlock(int color) {
        return new SandBlock(color, FabricBlockSettings.copy(SAND));
    }

    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }
    public static void init() {}
}
