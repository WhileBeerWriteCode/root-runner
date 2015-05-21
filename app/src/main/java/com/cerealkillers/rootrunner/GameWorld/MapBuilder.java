package com.cerealkillers.rootrunner.GameWorld;

import android.util.SparseArray;

import com.cerealkillers.rootrunner.GameObjects.Characters.GameCharacter;
import com.cerealkillers.rootrunner.GameObjects.Items.Item;
import com.cerealkillers.rootrunner.GameObjects.Structures.Portal;

import org.andengine.extension.tmx.TMXObject;
import org.andengine.extension.tmx.TMXObjectGroup;

/**
 * Created by Benjamin Daschel on 5/20/15.
 */
public class MapBuilder {

    Map mMap;

    public MapBuilder() {
        this.mMap = new Map();
    }

    public void addPortals(TMXObjectGroup portals){

        SparseArray<Portal> portalArray = sparseArrayForObjects(portals, Portal.class);
        for(TMXObject portal: portals.getTMXObjects()){
        
        }
    }

    public void addItems(TMXObjectGroup items){

        SparseArray<Item> itemsArray = sparseArrayForObjects(items, Item.class);
        for(TMXObject item: items.getTMXObjects()){

        }
    }

    public void addCharacters(TMXObjectGroup characters){

        SparseArray<GameCharacter> charactersArray = sparseArrayForObjects(characters, GameCharacter.class);
        for(TMXObject character: characters.getTMXObjects()){

        }
    }

    private <T> SparseArray<T> sparseArrayForObjects(TMXObjectGroup objectGroup, Class<T> clazz){
        if(objectGroup != null){
            return new SparseArray<>(objectGroup.getTMXObjects().size());
        }
        return new SparseArray<>(10);
    }
}
