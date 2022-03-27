package woodenlalaloo.trees.plus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import javax.annotation.Nullable;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class treesplus implements ModInitializer {
    public static final String MOD_ID = "treesplus";
    public static final Block CHERRY_TREE_SAPLING = new Block(FabricBlockSettings.copy(Blocks.OAK_SAPLING));





    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("treesplus", "cherry_tree_sapling"), CHERRY_TREE_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("treesplus","cherry_tree_sapling"), new BlockItem(CHERRY_TREE_SAPLING, new Item.Settings().group(ItemGroup.DECORATIONS)));




    }
}

