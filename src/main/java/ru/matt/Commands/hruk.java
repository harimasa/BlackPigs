package ru.matt.Commands;

import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;

public class hruk {

    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
            dispatcher.register(CommandManager.literal("hruk")
                    .executes(hruk::execute));
        });
    }

    private static int execute(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        Vec3d pos = source.getPosition();
        source.getWorld().playSound(null, pos.x, pos.y, pos.z, SoundEvents.ENTITY_PIG_AMBIENT, net.minecraft.sound.SoundCategory.NEUTRAL, 1.0F, 1.0F);
        return 1;
    }
}