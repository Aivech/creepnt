package com.aivech.creepnt;

import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CreeperEntity.class)
public class EntityCreeperMixin {
    @Redirect(at = @At(value = "INVOKE",
            target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$RuleKey;)Z"),
            method = "explode",require = 1)
    private boolean creepnt_nodestroy(GameRules gameRules, GameRules.RuleKey<GameRules.BooleanRule> gameRules$RuleKey_1) {
        return false;
    }

}
