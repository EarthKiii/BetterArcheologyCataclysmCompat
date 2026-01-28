package com.betterarcheologycataclysmcompat.mixin;

import com.github.L_Ender.cataclysm.items.Ignitium_Elytra_ChestPlate;
import net.Pandarix.betterarcheology.enchantment.SoaringWindsEnchantment;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Allows the Soaring Winds enchantment to be applied to the Ignitium Elytra Chestplate.
 * Once enchanted, Better Archeology's existing flight boost logic will automatically apply.
 */
@Mixin(value = SoaringWindsEnchantment.class, remap = false)
public class SoaringWindsEnchantmentMixin {
    
    @Inject(method = "canEnchant", at = @At("HEAD"), cancellable = true, remap = false)
    public void onCanEnchant(ItemStack pStack, CallbackInfoReturnable<Boolean> cir) {
        // Allow Soaring Winds on Ignitium Elytra Chestplate
        if (pStack.getItem() instanceof Ignitium_Elytra_ChestPlate) {
            cir.setReturnValue(true);
        }
    }
}
