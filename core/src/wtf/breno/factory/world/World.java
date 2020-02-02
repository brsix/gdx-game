package wtf.breno.factory.world;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import wtf.breno.factory.block.Block;
import wtf.breno.factory.dictionary.BlocksDictionary;

public class World {

    public int[][][] map = new int[80][45][2];

    public World() {

    }

    public void regenerate() {
        for (int width = 0; width < getWidth(); width++) {
            for (int height = 0; height < getHeight(); height++) {

                if (height < 10) {
                    map[width][height][1] = BlocksDictionary.getId(BlocksDictionary.OBSIDIAN);
                } else if (height < 20) {
                    map[width][height][1] = BlocksDictionary.getId(BlocksDictionary.COBBLESTONE);
                } else if (height < 22) {
                    map[width][height][1] = BlocksDictionary.getId(BlocksDictionary.DIRTY);
                }

            }
        }
    }

    public void render(Batch batch) {
        Texture texture = null;

        for (int width = 0; width < getWidth(); width++) {
            for (int height = 0; height < getHeight(); height++) {
                texture = BlocksDictionary.getBlock(map[width][height][1]).getTexture();

                if (texture != null)
                    batch.draw(
                            texture, width * Block.TILE_SIZE, height * Block.TILE_SIZE
                    );

            }
        }
    }

    public Block getBlock(int x, int y, int layer) {
        return BlocksDictionary.getBlock(map[x][y][layer]);
    }

    public int getWidth() {
        return map.length;
    }

    public int getHeight() {
        return map[0].length;
    }

    public int getLayers() {
        return map[0][0].length;
    }


}
