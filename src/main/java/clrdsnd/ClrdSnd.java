package clrdsnd;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static clrdsnd.Items.ORANGE_SAND;

public class ClrdSnd implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "cplus_clrsnd";
    public static final String MOD_NAME = "Colored Sand";

    public static final ItemGroup SandGroup = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "sand_group"))
            .icon(() -> new ItemStack(ORANGE_SAND))
            .build();


    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        Blocks.init();
        Items.init();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "[Colored Sand] " + message);
    }

}