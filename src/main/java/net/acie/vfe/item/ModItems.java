package net.acie.vfe.item;

import net.acie.vfe.VanillaFoodsExpanded;
import net.acie.vfe.item.custom.BeerItem;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            VanillaFoodsExpanded.MOD_ID);

    public static final RegistryObject<Item> VEGETABLE_SOUP = ITEMS.register("vegetable_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.VEGETABLE_SOUP)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext,
                                            List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()){
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.vegetable_soup.shift_down"));
                    }
                    else{
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.vegetable_soup"));
                    }
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> CHICKEN_SANDWICH =  ITEMS.register("chicken_sandwich",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHICKEN_SANDWICH)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext,
                                            List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()){
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.chicken_sandwich.shift_down"));
                    }
                    else{
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.chicken_sandwich"));
                    }
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIED_EGG)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext,
                                            List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()){
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.fried_egg.shift_down"));
                    }
                    else{
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.fried_egg"));
                    }
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> EGGS_AND_BACON = ITEMS.register("eggs_and_bacon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.EGGS_AND_BACON)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext,
                                            List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()){
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.eggs_and_bacon.shift_down"));
                    }
                    else{
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.eggs_and_bacon"));
                    }
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> OATMEAL_CREAM_PIE = ITEMS.register("oatmeal_cream_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.OATMEAL_CREAM_PIE)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext,
                                            List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()){
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.oatmeal_cream_pie.shift_down"));
                    }
                    else{
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.oatmeal_cream_pie"));
                    }
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> BEER = ITEMS.register("beer",
            () -> new BeerItem(new Item.Properties().food(BeerItem.BEER)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext,
                                            List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()){
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.beer.shift_down"));
                    }
                    else{
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.beer"));
                    }
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HAMBURGER)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext,
                                            List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()){
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.hamburger.shift_down"));
                    }
                    else{
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.hamburger"));
                    }
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> CHOCOLATE_GLOWBERRIES = ITEMS.register("chocolate_glowberries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_GLOWBERRIES)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext,
                                            List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()){
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.chocolate_glowberries.shift_down"));
                    }
                    else{
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.chocolate_glowberries"));
                    }
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> SUSHI = ITEMS.register("sushi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SUSHI)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext,
                                            List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()){
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.sushi.shift_down"));
                    }
                    else{
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.sushi"));
                    }
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> JELLY_DONUT = ITEMS.register("jelly_donut",
            () -> new Item(new Item.Properties().food(ModFoodProperties.JELLY_DONUT)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext,
                                            List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()){
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.jelly_donut.shift_down"));
                    }
                    else{
                        pTooltipComponents.add(
                                Component.translatable("tooltip.vanillafoodsexpanded.jelly_donut"));
                    }
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
