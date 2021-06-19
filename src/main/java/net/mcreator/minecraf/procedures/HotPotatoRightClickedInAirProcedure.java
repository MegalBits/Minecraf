package net.mcreator.minecraf.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.minecraf.MinecrafModElements;
import net.mcreator.minecraf.MinecrafMod;

import java.util.Map;

@MinecrafModElements.ModElement.Tag
public class HotPotatoRightClickedInAirProcedure extends MinecrafModElements.ModElement {
	public HotPotatoRightClickedInAirProcedure(MinecrafModElements instance) {
		super(instance, 41);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MinecrafMod.LOGGER.warn("Failed to load dependency entity for procedure HotPotatoRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Its too hot to eat"), (true));
		}
	}
}
