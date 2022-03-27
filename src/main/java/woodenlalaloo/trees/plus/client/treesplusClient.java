package woodenlalaloo.trees.plus.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import woodenlalaloo.trees.plus.treesplus;

@Environment(EnvType.CLIENT)
public class treesplusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(treesplus.CHERRY_TREE_SAPLING, RenderLayer.getCutout());

    }
}
