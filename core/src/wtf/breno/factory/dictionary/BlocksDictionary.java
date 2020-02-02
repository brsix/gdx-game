package wtf.breno.factory.dictionary;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.IntMap;
import wtf.breno.factory.block.Block;

public class BlocksDictionary {

    public static final IntMap<Block> REGISTERY_BLOCK = new IntMap<>();

    public static final Block AIR;
    public static final Block DIRTY;
    public static final Block COBBLESTONE;
    public static final Block OBSIDIAN;

    public static Block getBlock(int id) {
        return REGISTERY_BLOCK.get(id);
    }

    public static int getId(Block block) {
        return REGISTERY_BLOCK.findKey(block, true, 0);
    }

    private static Block register(int id, Block block) {
        REGISTERY_BLOCK.put(id, block);

        return block;
    }

    static {
        AIR         = register(0, new Block(null));
        DIRTY       = register(1, new Block(new Texture("blocks/dirt.png")));
        COBBLESTONE = register(2, new Block(new Texture("blocks/cobblestone.png")));
        OBSIDIAN    = register(3, new Block(new Texture("blocks/obsidian.png")));
    }

}
