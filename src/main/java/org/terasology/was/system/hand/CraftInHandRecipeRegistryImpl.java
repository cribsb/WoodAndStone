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
package org.terasology.was.system.hand;

import org.terasology.entitySystem.systems.ComponentSystem;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.entitySystem.systems.Share;
import org.terasology.was.system.hand.recipe.CraftInHandRecipe;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Marcin Sciesinski <marcins78@gmail.com>
 */
@RegisterSystem
@Share(value = CraftInHandRecipeRegistry.class)
public class CraftInHandRecipeRegistryImpl implements CraftInHandRecipeRegistry, ComponentSystem {
    private Map<String, CraftInHandRecipe> recipes = new LinkedHashMap<>();

    @Override
    public void initialise() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void addCraftInHandRecipe(String recipeId, CraftInHandRecipe craftInHandRecipe) {
        recipes.put(recipeId, craftInHandRecipe);
    }

    @Override
    public Map<String, CraftInHandRecipe> getRecipes() {
        return recipes;
    }
}