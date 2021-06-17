package net.mcreator.minecraf.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import net.mcreator.minecraf.MinecrafModElements;
import net.mcreator.minecraf.MinecrafMod;

import java.util.Map;

@MinecrafModElements.ModElement.Tag
public class CreeperRightClickedInAirProcedure extends MinecrafModElements.ModElement {
	public CreeperRightClickedInAirProcedure(MinecrafModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MinecrafMod.LOGGER.warn("Failed to load dependency entity for procedure CreeperRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				MinecrafMod.LOGGER.warn("Failed to load dependency itemstack for procedure CreeperRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"summon creeper");
			}
		}
		((itemstack)).shrink((int) 1);
	}
}
