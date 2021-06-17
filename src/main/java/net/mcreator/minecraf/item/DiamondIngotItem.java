
package net.mcreator.minecraf.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.minecraf.itemgroup.MinecrafItemGroup;
import net.mcreator.minecraf.MinecrafModElements;

@MinecrafModElements.ModElement.Tag
public class DiamondIngotItem extends MinecrafModElements.ModElement {
	@ObjectHolder("minecraf:diamond_ingot")
	public static final Item block = null;
	public DiamondIngotItem(MinecrafModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MinecrafItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("diamond_ingot");
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
	}
}
