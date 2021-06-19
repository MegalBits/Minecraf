package net.mcreator.minecraf.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.minecraf.MinecrafModElements;
import net.mcreator.minecraf.MinecrafMod;

import java.util.Map;

@MinecrafModElements.ModElement.Tag
public class HotPotatoItemInInventoryTickProcedure extends MinecrafModElements.ModElement {
	public HotPotatoItemInInventoryTickProcedure(MinecrafModElements instance) {
		super(instance, 42);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MinecrafMod.LOGGER.warn("Failed to load dependency entity for procedure HotPotatoItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 1);
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"execute at @p run setblock ~ ~ ~ fire");
			}
		}
	}
}
