package net.acie.vfe.item;

import net.acie.vfe.AciesAdditionalFoods;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, AciesAdditionalFoods.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_ITEMS_TAB = CREATIVE_MODE_TAB.register("mod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VEGETABLE_SOUP.get()))
                    .title(Component.translatable("creativetab.aciesadditionalfoods.mod_items"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(ModItems.VEGETABLE_SOUP.get());
                        output.accept(ModItems.CHICKEN_SANDWICH.get());
                        output.accept(ModItems.FRIED_EGG.get());
                        output.accept(ModItems.EGGS_AND_BACON.get());
                        output.accept(ModItems.OATMEAL_CREAM_PIE.get());
                        output.accept(ModItems.BEER.get());
                        output.accept(ModItems.HAMBURGER.get());
                        output.accept(ModItems.CHOCOLATE_GLOWBERRIES.get());
                        output.accept(ModItems.SUSHI.get());
                        output.accept(ModItems.JELLY_DONUT.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
