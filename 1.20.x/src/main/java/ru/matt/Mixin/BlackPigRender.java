package ru.matt.Mixin;

import net.minecraft.client.render.entity.PigEntityRenderer;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PigEntityRenderer.class)
public class BlackPigRender {

    @Inject(method = "getTexture", at = @At("HEAD"), cancellable = true)
    private void changePigTexture(CallbackInfoReturnable<Identifier> cir) {
        Identifier newTexture = new Identifier("blackpigs", "textures/black_pig.png");
        cir.setReturnValue(newTexture);
    }
}

