package net.acie.vfe.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModFoodProperties {

    public static final FoodProperties VEGETABLE_SOUP = new FoodProperties.Builder().nutrition(9)
            .saturationModifier(1.2F).usingConvertsTo(Items.BOWL).build();

    public static final FoodProperties CHICKEN_SANDWICH = new FoodProperties.Builder().nutrition(11)
            .saturationModifier(1.2F).build();

    public static final FoodProperties FRIED_EGG = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.5F).build();

    public static final FoodProperties EGGS_AND_BACON = new FoodProperties.Builder().nutrition(12)
            .saturationModifier(1.2F).build();

    public static final FoodProperties OATMEAL_CREAM_PIE = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.4F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 1), 1.0F).build();

    public static final FoodProperties HAMBURGER = new FoodProperties.Builder().nutrition(11)
            .saturationModifier(1.2F).build();

    public static final FoodProperties CHOCOLATE_GLOWBERRIES = new FoodProperties.Builder().nutrition(5)
            .saturationModifier(0.4f).build();

    public static final FoodProperties SUSHI = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.6F).build();

    public static final FoodProperties JELLY_DONUT = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.4F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 450, 0),1.0F).build();
}
