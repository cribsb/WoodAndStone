/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.was.system.recipe.hand.behaviour;

import org.terasology.engine.CoreRegistry;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.logic.inventory.SlotBasedInventoryManager;
import org.terasology.was.system.recipe.hand.ItemCraftBehaviour;

/**
 * @author Marcin Sciesinski <marcins78@gmail.com>
 */
public class ConsumeItemCraftBehaviour implements ItemCraftBehaviour {
    @Override
    public boolean isValid(EntityRef character, EntityRef item) {
        SlotBasedInventoryManager inventoryManager = CoreRegistry.get(SlotBasedInventoryManager.class);
        return inventoryManager.findSlotWithItem(character, item) != -1;
    }

    @Override
    public void processForItem(EntityRef character, EntityRef item) {
        SlotBasedInventoryManager inventoryManager = CoreRegistry.get(SlotBasedInventoryManager.class);

        inventoryManager.removeItem(character, item, 1);
    }
}