package clrdsnd;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static clrdsnd.ClrdSnd.MOD_ID;
import static clrdsnd.ClrdSnd.SandGroup;

public class Items {

    public static final Item ORANGE_SAND = register("orange_sand", Blocks.ORANGE_SAND);
    public static final Item YELLOW_SAND = register("yellow_sand", Blocks.YELLOW_SAND);
    public static final Item LIME_SAND = register("lime_sand", Blocks.LIME_SAND);
    public static final Item GREEN_SAND = register("green_sand", Blocks.GREEN_SAND);
    public static final Item CYAN_SAND = register("cyan_sand", Blocks.CYAN_SAND);
    public static final Item LIGHT_BLUE_SAND = register("light_blue_sand", Blocks.LIGHT_BLUE_SAND);
    public static final Item BLUE_SAND = register("blue_sand", Blocks.BLUE_SAND);
    public static final Item PURPLE_SAND = register("purple_sand", Blocks.PURPLE_SAND);
    public static final Item MAGENTA_SAND = register("magenta_sand", Blocks.MAGENTA_SAND);
    public static final Item PINK_SAND = register("pink_sand", Blocks.PINK_SAND);
    public static final Item BROWN_SAND = register("brown_sand", Blocks.BROWN_SAND);
    public static final Item WHITE_SAND = register("white_sand", Blocks.WHITE_SAND);
    public static final Item LIGHT_GRAY_SAND = register("light_gray_sand", Blocks.LIGHT_GRAY_SAND);
    public static final Item GRAY_SAND = register("gray_sand", Blocks.GRAY_SAND);
    public static final Item BLACK_SAND = register("black_sand", Blocks.BLACK_SAND);

    private static Item register(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), new BlockItem(block, new Item.Settings().group(SandGroup)));
    }
    public static void init() {}
}
