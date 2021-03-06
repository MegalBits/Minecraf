
package net.mcreator.minecraf.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.IRuleTestType;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.World;
import net.minecraft.world.ISeedReader;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.minecraf.itemgroup.MinecrafItemGroup;
import net.mcreator.minecraf.MinecrafModElements;

import java.util.Random;

@MinecrafModElements.ModElement.Tag
public class StaticBlockBlock extends MinecrafModElements.ModElement {
	@ObjectHolder("minecraf:static_block")
	public static final Block block = null;
	public StaticBlockBlock(MinecrafModElements instance) {
		super(instance, 11);
		MinecraftForge.EVENT_BUS.register(this);
		FMLJavaModLoadingContext.get().getModEventBus().register(new FeatureRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MinecrafItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.CLOTH).hardnessAndResistance(0.6f, 1f).setLightLevel(s -> 0));
			setRegistryName("static_block");
		}
	}
	private static Feature<OreFeatureConfig> feature = null;
	private static ConfiguredFeature<?, ?> configuredFeature = null;
	private static IRuleTestType<CustomRuleTest> CUSTOM_MATCH = null;
	private static class CustomRuleTest extends RuleTest {
		static final CustomRuleTest INSTANCE = new CustomRuleTest();
		static final com.mojang.serialization.Codec<CustomRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.STONE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DIRT.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.GRANITE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DIORITE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.ANDESITE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.NETHERRACK.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.SOUL_SAND.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.SOUL_SOIL.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.END_STONE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.BEDROCK.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.NETHER_GOLD_ORE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.GILDED_BLACKSTONE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.NETHER_QUARTZ_ORE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.MAGMA_BLOCK.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.RED_SAND.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.SAND.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.GRAVEL.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.SANDSTONE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.SMOOTH_SANDSTONE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.RED_SANDSTONE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.SMOOTH_RED_SANDSTONE.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.CRIMSON_NYLIUM.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.WARPED_NYLIUM.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.NETHERRACK.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.BASALT.getDefaultState().getBlock())
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.BLACKSTONE.getDefaultState().getBlock())
				blockCriteria = true;
			return blockCriteria;
		}

		protected IRuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}

	private static class FeatureRegisterHandler {
		@SubscribeEvent
		public void registerFeature(RegistryEvent.Register<Feature<?>> event) {
			CUSTOM_MATCH = Registry.register(Registry.RULE_TEST, new ResourceLocation("minecraf:static_block_match"), () -> CustomRuleTest.codec);
			feature = new OreFeature(OreFeatureConfig.CODEC) {
				@Override
				public boolean generate(ISeedReader world, ChunkGenerator generator, Random rand, BlockPos pos, OreFeatureConfig config) {
					RegistryKey<World> dimensionType = world.getWorld().getDimensionKey();
					boolean dimensionCriteria = false;
					if (dimensionType == World.OVERWORLD)
						dimensionCriteria = true;
					if (dimensionType == World.THE_NETHER)
						dimensionCriteria = true;
					if (dimensionType == World.THE_END)
						dimensionCriteria = true;
					if (!dimensionCriteria)
						return false;
					return super.generate(world, generator, rand, pos, config);
				}
			};
			configuredFeature = feature.withConfiguration(new OreFeatureConfig(CustomRuleTest.INSTANCE, block.getDefaultState(), 32)).range(256)
					.square().func_242731_b(32);
			event.getRegistry().register(feature.setRegistryName("static_block"));
			Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation("minecraf:static_block"), configuredFeature);
		}
	}
	@SubscribeEvent
	public void addFeatureToBiomes(BiomeLoadingEvent event) {
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> configuredFeature);
	}
}
