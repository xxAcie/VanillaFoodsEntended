package net.acie.vfe.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;

public class BeerItem extends Item {

    public BeerItem(Properties pProperties) {
        super(pProperties);
    }

    public static final FoodProperties BEER = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(0.2F).usingConvertsTo(Items.GLASS_BOTTLE)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 3000, 0), 1.0F).build();

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }
}
