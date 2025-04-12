package net.acie.vfe.item;

import net.acie.vfe.VanillaFoodsExpanded;
import net.acie.vfe.item.custom.BeerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            VanillaFoodsExpanded.MOD_ID);

    public static final RegistryObject<Item> VEGETABLE_SOUP = ITEMS.register("vegetable_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.VEGETABLE_SOUP)));

    public static final RegistryObject<Item> CHICKEN_SANDWICH =  ITEMS.register("chicken_sandwich",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHICKEN_SANDWICH)));

    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIED_EGG)));

    public static final RegistryObject<Item> EGGS_AND_BACON = ITEMS.register("eggs_and_bacon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.EGGS_AND_BACON)));

    public static final RegistryObject<Item> OATMEAL_CREAM_PIE = ITEMS.register("oatmeal_cream_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.OATMEAL_CREAM_PIE)));

    public static final RegistryObject<Item> BEER = ITEMS.register("beer",
            () -> new BeerItem(new Item.Properties().food(BeerItem.BEER)));

    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HAMBURGER)));

    public static final RegistryObject<Item> CHOCOLATE_GLOWBERRIES = ITEMS.register("chocolate_glowberries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_GLOWBERRIES)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
