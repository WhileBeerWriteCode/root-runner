package com.cerealkillers.rootrunner.GameObjects;

import com.cerealkillers.rootrunner.GameWorld.Map;

/**
 * Created by Tyler Herrin on 6/3/2015.
 */
public interface MapToolBehavior
{
    /**
     *
     * @param map
     * @param x
     * @param y
     */
    public void use(Map map, float x, float y);
}
