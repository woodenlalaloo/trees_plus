package woodenlalaloo.trees.plus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import woodenlalaloo.trees.plus.blockstuffs.CherryTreeSapling;

public class treesplus implements ModInitializer {

    public static final Block CHERRY_TREE_SAPLING = new CherryTreeSapling(FabricBlockSettings.copy(Blocks.OAK_SAPLING));

    @Override
    public void onInitialize() {
        register_block(CHERRY_TREE_SAPLING, "cherry_tree_sapling");
    }

    private void register_block(Block bk, String name){
        Registry.register(Registry.BLOCK, new Identifier("treesplus","cherry_tree_sapling"), bk);
        Registry.register(Registry.ITEM, new Identifier("treesplus","cherry_tree_sapling"), new BlockItem(bk, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    }
}