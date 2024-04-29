package net.rpg.rpgsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rpg.rpgsmod.RPGsMod;
import net.rpg.rpgsmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RPGsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RPGS_MOD_TAB = CREATIVE_MODE_TABS.register("rpgs_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ECHOGEM.get()))
                    .title(Component.translatable("creativetab.rpgs_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ECHOGEM.get());
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.COAL_COKE.get());
                        output.accept(ModItems.ALUMINUM_INGOT.get());

                        output.accept(ModBlocks.ECHOGEM_BLOCK.get());
                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModBlocks.COAL_COKE_BLOCK.get());
                        output.accept(ModBlocks.ALUMINUM_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
