package com.betterarcheologycataclysmcompat;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BetterArcheologyCataclysmCompat.MOD_ID)
public class BetterArcheologyCataclysmCompat {
    public static final String MOD_ID = "betterarcheologycataclysmcompat";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BetterArcheologyCataclysmCompat() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        modEventBus.addListener(this::commonSetup);
        
        MinecraftForge.EVENT_BUS.register(this);
        
        LOGGER.info("Better Archeology Cataclysm Compat initialized - Soaring Winds can now be applied to Ignitium Elytra!");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Better Archeology Cataclysm Compat - Common setup");
    }
}
