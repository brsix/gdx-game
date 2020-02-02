package wtf.breno;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import wtf.breno.factory.world.World;

public class JavaGame extends ApplicationAdapter {

	private static JavaGame gameInstance;
	public static final boolean DEBUG = true;

    private SpriteBatch batch;

    private OrthographicCamera camera;
    private Viewport viewport;

    private World world;

	public JavaGame() {
		gameInstance = this;
	}

	@Override
	public void create () {
		batch = new SpriteBatch();

		camera = new OrthographicCamera(
				Gdx.graphics.getWidth(),
				Gdx.graphics.getHeight()
		);

		camera.setToOrtho(false);

		viewport = new FillViewport(
				Gdx.graphics.getWidth(),
				Gdx.graphics.getHeight()
		);

		world = new World();
		world.regenerate();
	}

	@Override
	public void resize(int width, int height) {
		viewport.update(width, height);
	}

	@Override
	public void render () {
        Gdx.gl.glClearColor(0, 153, 255, 0.2f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
        world.render(batch); //rendering world
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}

	public static JavaGame getGameInstance() {
		return gameInstance;
	}

}
