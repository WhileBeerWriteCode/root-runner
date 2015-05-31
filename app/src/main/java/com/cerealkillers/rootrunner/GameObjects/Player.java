package com.cerealkillers.rootrunner.GameObjects;

import com.cerealkillers.rootrunner.GameWorld.Map;

import org.andengine.entity.sprite.AnimatedSprite;

/**
 * Created by Benjamin Daschel on 5/29/15.
 */
public class Player extends MapObject<AnimatedSprite> {

    private IControl mPlayerControls;

    public interface PlayerSpawnedListener{
        public void onPlayerSpawned(Player player);
    }

    public Player(int id, AnimatedSprite sprite) {
        super(id, sprite);
        mPlayerControls = new PlayerControl();
    }

    @Override
    public void onAttachToMap(Map attached) {
        super.onAttachToMap(attached);
        setCollisionDetector(new MapObjectCollisionDetector(this, attached));
        attached.onPlayerSpawned(this);
    }

    private class PlayerControl implements IControl{

        @Override
        public void onMove(Direction direction) {

            AnimatedSprite playerSprite = getSprite();
            switch (direction){
                case UP:
                    playerSprite.animate(new long[]{100,100,100},6,8,true);
                    break;
                case RIGHT:
                    playerSprite.animate(new long[]{100,100,100},3,5,true);
                    break;
                case DOWN:
                    playerSprite.animate(new long[]{100,100,100},0,2,true);
                    break;
                case LEFT:
                    playerSprite.animate(new long[]{100,100,100},9,11,true);
                    break;
            }
        }
    }

}
