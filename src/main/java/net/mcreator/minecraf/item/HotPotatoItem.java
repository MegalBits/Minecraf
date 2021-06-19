
package net.mcreator.minecraf.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.minecraf.procedures.HotPotatoRightClickedInAirProcedure;
import net.mcreator.minecraf.procedures.HotPotatoItemInInventoryTickProcedure;
import net.mcreator.minecraf.itemgroup.MinecrafItemGroup;
import net.mcreator.minecraf.MinecrafModElements;

import java.util.Map;
import java.util.HashMap;

@MinecrafModElements.ModElement.Tag
public class HotPotatoItem extends MinecrafModElements.ModElement {
	@ObjectHolder("minecraf:hot_potato")
	public static final Item block = null;
	public HotPotatoItem(MinecrafModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MinecrafItemGroup.tab).maxStackSize(1).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("hot_potato");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				HotPotatoRightClickedInAirProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				HotPotatoItemInInventoryTickProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
