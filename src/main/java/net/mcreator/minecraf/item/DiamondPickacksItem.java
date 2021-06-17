
package net.mcreator.minecraf.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.minecraf.itemgroup.MinecrafItemGroup;
import net.mcreator.minecraf.MinecrafModElements;

@MinecrafModElements.ModElement.Tag
public class DiamondPickacksItem extends MinecrafModElements.ModElement {
	@ObjectHolder("minecraf:diamond_pickacks")
	public static final Item block = null;
	public DiamondPickacksItem(MinecrafModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 30;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DiamondIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(MinecrafItemGroup.tab)) {
		}.setRegistryName("diamond_pickacks"));
	}
}
