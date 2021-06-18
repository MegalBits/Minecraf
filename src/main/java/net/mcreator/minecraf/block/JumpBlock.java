
package net.mcreator.minecraf.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.minecraf.particle.GreenParticleParticle;
import net.mcreator.minecraf.itemgroup.MinecrafItemGroup;
import net.mcreator.minecraf.MinecrafModElements;

import java.util.Random;
import java.util.List;
import java.util.Collections;

@MinecrafModElements.ModElement.Tag
public class JumpBlock extends MinecrafModElements.ModElement {
	@ObjectHolder("minecraf:jump")
	public static final Block block = null;
	public JumpBlock(MinecrafModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MinecrafItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.CLOTH).hardnessAndResistance(2f, 1f).setLightLevel(s -> 0).jumpFactor(5f));
			setRegistryName("jump");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public void animateTick(BlockState state, World world, BlockPos pos, Random random) {
			super.animateTick(state, world, pos, random);
			PlayerEntity entity = Minecraft.getInstance().player;
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			if (true)
				for (int l = 0; l < 20; ++l) {
					double d0 = (double) ((float) x + 0.5) + (double) (random.nextFloat() - 0.5) * 0.8000000014901161D;
					double d1 = ((double) ((float) y + 0.7) + (double) (random.nextFloat() - 0.5) * 0.8000000014901161D) + 0.5;
					double d2 = (double) ((float) z + 0.5) + (double) (random.nextFloat() - 0.5) * 0.8000000014901161D;
					world.addParticle(GreenParticleParticle.particle, d0, d1, d2, 0, 0, 0);
				}
		}
	}
}
