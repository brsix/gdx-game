package wtf.breno.factory.block;

import com.badlogic.gdx.graphics.Texture;

public class Block {

    public static final int TILE_SIZE = 16;
    private final Texture texture;

    public Block(Texture texture) {
        this.texture = texture;
    }

    public Texture getTexture() {
        return texture;
    }

}
