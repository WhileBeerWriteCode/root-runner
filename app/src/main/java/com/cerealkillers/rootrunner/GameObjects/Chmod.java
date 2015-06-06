package com.cerealkillers.rootrunner.GameObjects;

import android.util.Log;

import com.cerealkillers.rootrunner.GameWorld.Map;

import org.andengine.entity.sprite.Sprite;

/**
 * Created by Tyler Herrin on 6/5/2015.
 */
public class Chmod extends ObjectTool
{
    /**
     *
     * @param sprite
     */
    public Chmod(Sprite sprite)
    {
        super(sprite, "chmod", "Changes file permissions.");
    }

    /**
     *
     * @param map The current map
     * @param mapObject the map object for this to be used on.
     */
    public void use(Map map, MapObject mapObject)
    {
        Log.d("chmod", "detected chmod tool use");

        Tag locked = mapObject.getTag("locked");
        if(locked != null && locked.value != null)
        {
            mapObject.removeTag(locked);
            Tag unlocked = new Tag("locked", "unlocked");
            mapObject.addTag(unlocked);
        }
    }
}
