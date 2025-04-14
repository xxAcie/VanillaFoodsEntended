package net.acie.vfe.util;

import net.acie.vfe.AciesAdditionalFoods;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static class Items {

        public static final TagKey<Item> FISH = createTag("fish");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(AciesAdditionalFoods.MOD_ID, name));
        }
    }
}
