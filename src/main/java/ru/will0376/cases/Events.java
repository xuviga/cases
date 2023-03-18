package ru.will0376.cases;

import net.minecraft.client.Minecraft;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import ru.justagod.cutter.GradleSide;
import ru.justagod.cutter.GradleSideOnly;

@Mod.EventBusSubscriber
public class Events {
	@GradleSideOnly(GradleSide.CLIENT)
	@SubscribeEvent
	public static void KeyPress(InputEvent.KeyInputEvent event) {
		if (Cases.KeyTest.isPressed()) {
			Minecraft.getMinecraft().player.sendChatMessage("/jcases list");
		}
	}
	@GradleSideOnly(GradleSide.SERVER)
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().register(Rolling.test);
	}
}
