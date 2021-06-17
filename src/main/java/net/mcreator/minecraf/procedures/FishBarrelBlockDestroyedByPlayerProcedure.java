package net.mcreator.minecraf.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.passive.fish.CodEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.minecraf.MinecrafModElements;
import net.mcreator.minecraf.MinecrafMod;

import java.util.Map;

@MinecrafModElements.ModElement.Tag
public class FishBarrelBlockDestroyedByPlayerProcedure extends MinecrafModElements.ModElement {
	public FishBarrelBlockDestroyedByPlayerProcedure(MinecrafModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MinecrafMod.LOGGER.warn("Failed to load dependency x for procedure FishBarrelBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MinecrafMod.LOGGER.warn("Failed to load dependency y for procedure FishBarrelBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MinecrafMod.LOGGER.warn("Failed to load dependency z for procedure FishBarrelBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MinecrafMod.LOGGER.warn("Failed to load dependency world for procedure FishBarrelBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
			entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
			entityToSpawn.setRenderYawOffset((float) 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
			entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
			entityToSpawn.setRenderYawOffset((float) 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;
			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
					entityToSpawn.setRenderYawOffset((float) 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
					entityToSpawn.setRenderYawOffset((float) 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private IWorld world;
					public void start(IWorld world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private IWorld world;
							public void start(IWorld world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
									entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
									entityToSpawn.setRenderYawOffset((float) 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
									entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
									entityToSpawn.setRenderYawOffset((float) 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private IWorld world;
									public void start(IWorld world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
											entityToSpawn.setRenderYawOffset((float) 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
										if (world instanceof ServerWorld) {
											Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
											entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
											entityToSpawn.setRenderYawOffset((float) 0);
											if (entityToSpawn instanceof MobEntity)
												((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
														world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
														(ILivingEntityData) null, (CompoundNBT) null);
											world.addEntity(entityToSpawn);
										}
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private IWorld world;
											public void start(IWorld world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												if (world instanceof ServerWorld) {
													Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
													entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
													entityToSpawn.setRenderYawOffset((float) 0);
													if (entityToSpawn instanceof MobEntity)
														((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
																(ILivingEntityData) null, (CompoundNBT) null);
													world.addEntity(entityToSpawn);
												}
												if (world instanceof ServerWorld) {
													Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
													entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
													entityToSpawn.setRenderYawOffset((float) 0);
													if (entityToSpawn instanceof MobEntity)
														((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
																(ILivingEntityData) null, (CompoundNBT) null);
													world.addEntity(entityToSpawn);
												}
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private IWorld world;
													public void start(IWorld world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														if (world instanceof ServerWorld) {
															Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
															entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
															entityToSpawn.setRenderYawOffset((float) 0);
															if (entityToSpawn instanceof MobEntity)
																((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																		world.getDifficultyForLocation(entityToSpawn.getPosition()),
																		SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
															world.addEntity(entityToSpawn);
														}
														if (world instanceof ServerWorld) {
															Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
															entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
															entityToSpawn.setRenderYawOffset((float) 0);
															if (entityToSpawn instanceof MobEntity)
																((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																		world.getDifficultyForLocation(entityToSpawn.getPosition()),
																		SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
															world.addEntity(entityToSpawn);
														}
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private IWorld world;
															public void start(IWorld world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																if (world instanceof ServerWorld) {
																	Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
																	entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
																	entityToSpawn.setRenderYawOffset((float) 0);
																	if (entityToSpawn instanceof MobEntity)
																		((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																				world.getDifficultyForLocation(entityToSpawn.getPosition()),
																				SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																				(CompoundNBT) null);
																	world.addEntity(entityToSpawn);
																}
																if (world instanceof ServerWorld) {
																	Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
																	entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
																	entityToSpawn.setRenderYawOffset((float) 0);
																	if (entityToSpawn instanceof MobEntity)
																		((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																				world.getDifficultyForLocation(entityToSpawn.getPosition()),
																				SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																				(CompoundNBT) null);
																	world.addEntity(entityToSpawn);
																}
																new Object() {
																	private int ticks = 0;
																	private float waitTicks;
																	private IWorld world;
																	public void start(IWorld world, int waitTicks) {
																		this.waitTicks = waitTicks;
																		MinecraftForge.EVENT_BUS.register(this);
																		this.world = world;
																	}

																	@SubscribeEvent
																	public void tick(TickEvent.ServerTickEvent event) {
																		if (event.phase == TickEvent.Phase.END) {
																			this.ticks += 1;
																			if (this.ticks >= this.waitTicks)
																				run();
																		}
																	}

																	private void run() {
																		if (world instanceof ServerWorld) {
																			Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
																			entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
																			entityToSpawn.setRenderYawOffset((float) 0);
																			if (entityToSpawn instanceof MobEntity)
																				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																						world.getDifficultyForLocation(entityToSpawn.getPosition()),
																						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																						(CompoundNBT) null);
																			world.addEntity(entityToSpawn);
																		}
																		if (world instanceof ServerWorld) {
																			Entity entityToSpawn = new CodEntity(EntityType.COD, (World) world);
																			entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
																			entityToSpawn.setRenderYawOffset((float) 0);
																			if (entityToSpawn instanceof MobEntity)
																				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																						world.getDifficultyForLocation(entityToSpawn.getPosition()),
																						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																						(CompoundNBT) null);
																			world.addEntity(entityToSpawn);
																		}
																		new Object() {
																			private int ticks = 0;
																			private float waitTicks;
																			private IWorld world;
																			public void start(IWorld world, int waitTicks) {
																				this.waitTicks = waitTicks;
																				MinecraftForge.EVENT_BUS.register(this);
																				this.world = world;
																			}

																			@SubscribeEvent
																			public void tick(TickEvent.ServerTickEvent event) {
																				if (event.phase == TickEvent.Phase.END) {
																					this.ticks += 1;
																					if (this.ticks >= this.waitTicks)
																						run();
																				}
																			}

																			private void run() {
																				if (world instanceof ServerWorld) {
																					Entity entityToSpawn = new CodEntity(EntityType.COD,
																							(World) world);
																					entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
																					entityToSpawn.setRenderYawOffset((float) 0);
																					if (entityToSpawn instanceof MobEntity)
																						((MobEntity) entityToSpawn).onInitialSpawn(
																								(ServerWorld) world,
																								world.getDifficultyForLocation(
																										entityToSpawn.getPosition()),
																								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																								(CompoundNBT) null);
																					world.addEntity(entityToSpawn);
																				}
																				if (world instanceof ServerWorld) {
																					Entity entityToSpawn = new CodEntity(EntityType.COD,
																							(World) world);
																					entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
																					entityToSpawn.setRenderYawOffset((float) 0);
																					if (entityToSpawn instanceof MobEntity)
																						((MobEntity) entityToSpawn).onInitialSpawn(
																								(ServerWorld) world,
																								world.getDifficultyForLocation(
																										entityToSpawn.getPosition()),
																								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																								(CompoundNBT) null);
																					world.addEntity(entityToSpawn);
																				}
																				new Object() {
																					private int ticks = 0;
																					private float waitTicks;
																					private IWorld world;
																					public void start(IWorld world, int waitTicks) {
																						this.waitTicks = waitTicks;
																						MinecraftForge.EVENT_BUS.register(this);
																						this.world = world;
																					}

																					@SubscribeEvent
																					public void tick(TickEvent.ServerTickEvent event) {
																						if (event.phase == TickEvent.Phase.END) {
																							this.ticks += 1;
																							if (this.ticks >= this.waitTicks)
																								run();
																						}
																					}

																					private void run() {
																						if (world instanceof ServerWorld) {
																							Entity entityToSpawn = new CodEntity(EntityType.COD,
																									(World) world);
																							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0,
																									(float) 0);
																							entityToSpawn.setRenderYawOffset((float) 0);
																							if (entityToSpawn instanceof MobEntity)
																								((MobEntity) entityToSpawn).onInitialSpawn(
																										(ServerWorld) world,
																										world.getDifficultyForLocation(
																												entityToSpawn.getPosition()),
																										SpawnReason.MOB_SUMMONED,
																										(ILivingEntityData) null, (CompoundNBT) null);
																							world.addEntity(entityToSpawn);
																						}
																						if (world instanceof ServerWorld) {
																							Entity entityToSpawn = new CodEntity(EntityType.COD,
																									(World) world);
																							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0,
																									(float) 0);
																							entityToSpawn.setRenderYawOffset((float) 0);
																							if (entityToSpawn instanceof MobEntity)
																								((MobEntity) entityToSpawn).onInitialSpawn(
																										(ServerWorld) world,
																										world.getDifficultyForLocation(
																												entityToSpawn.getPosition()),
																										SpawnReason.MOB_SUMMONED,
																										(ILivingEntityData) null, (CompoundNBT) null);
																							world.addEntity(entityToSpawn);
																						}
																						new Object() {
																							private int ticks = 0;
																							private float waitTicks;
																							private IWorld world;
																							public void start(IWorld world, int waitTicks) {
																								this.waitTicks = waitTicks;
																								MinecraftForge.EVENT_BUS.register(this);
																								this.world = world;
																							}

																							@SubscribeEvent
																							public void tick(TickEvent.ServerTickEvent event) {
																								if (event.phase == TickEvent.Phase.END) {
																									this.ticks += 1;
																									if (this.ticks >= this.waitTicks)
																										run();
																								}
																							}

																							private void run() {
																								if (world instanceof ServerWorld) {
																									Entity entityToSpawn = new CodEntity(
																											EntityType.COD, (World) world);
																									entityToSpawn.setLocationAndAngles(x, y, z,
																											(float) 0, (float) 0);
																									entityToSpawn.setRenderYawOffset((float) 0);
																									if (entityToSpawn instanceof MobEntity)
																										((MobEntity) entityToSpawn).onInitialSpawn(
																												(ServerWorld) world,
																												world.getDifficultyForLocation(
																														entityToSpawn.getPosition()),
																												SpawnReason.MOB_SUMMONED,
																												(ILivingEntityData) null,
																												(CompoundNBT) null);
																									world.addEntity(entityToSpawn);
																								}
																								if (world instanceof ServerWorld) {
																									Entity entityToSpawn = new CodEntity(
																											EntityType.COD, (World) world);
																									entityToSpawn.setLocationAndAngles(x, y, z,
																											(float) 0, (float) 0);
																									entityToSpawn.setRenderYawOffset((float) 0);
																									if (entityToSpawn instanceof MobEntity)
																										((MobEntity) entityToSpawn).onInitialSpawn(
																												(ServerWorld) world,
																												world.getDifficultyForLocation(
																														entityToSpawn.getPosition()),
																												SpawnReason.MOB_SUMMONED,
																												(ILivingEntityData) null,
																												(CompoundNBT) null);
																									world.addEntity(entityToSpawn);
																								}
																								new Object() {
																									private int ticks = 0;
																									private float waitTicks;
																									private IWorld world;
																									public void start(IWorld world, int waitTicks) {
																										this.waitTicks = waitTicks;
																										MinecraftForge.EVENT_BUS.register(this);
																										this.world = world;
																									}

																									@SubscribeEvent
																									public void tick(
																											TickEvent.ServerTickEvent event) {
																										if (event.phase == TickEvent.Phase.END) {
																											this.ticks += 1;
																											if (this.ticks >= this.waitTicks)
																												run();
																										}
																									}

																									private void run() {
																										if (world instanceof ServerWorld) {
																											Entity entityToSpawn = new CodEntity(
																													EntityType.COD, (World) world);
																											entityToSpawn.setLocationAndAngles(x, y,
																													z, (float) 0, (float) 0);
																											entityToSpawn
																													.setRenderYawOffset((float) 0);
																											if (entityToSpawn instanceof MobEntity)
																												((MobEntity) entityToSpawn)
																														.onInitialSpawn(
																																(ServerWorld) world,
																																world.getDifficultyForLocation(
																																		entityToSpawn
																																				.getPosition()),
																																SpawnReason.MOB_SUMMONED,
																																(ILivingEntityData) null,
																																(CompoundNBT) null);
																											world.addEntity(entityToSpawn);
																										}
																										if (world instanceof ServerWorld) {
																											Entity entityToSpawn = new CodEntity(
																													EntityType.COD, (World) world);
																											entityToSpawn.setLocationAndAngles(x, y,
																													z, (float) 0, (float) 0);
																											entityToSpawn
																													.setRenderYawOffset((float) 0);
																											if (entityToSpawn instanceof MobEntity)
																												((MobEntity) entityToSpawn)
																														.onInitialSpawn(
																																(ServerWorld) world,
																																world.getDifficultyForLocation(
																																		entityToSpawn
																																				.getPosition()),
																																SpawnReason.MOB_SUMMONED,
																																(ILivingEntityData) null,
																																(CompoundNBT) null);
																											world.addEntity(entityToSpawn);
																										}
																										MinecraftForge.EVENT_BUS.unregister(this);
																									}
																								}.start(world, (int) 2);
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, (int) 2);
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, (int) 2);
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, (int) 2);
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 2);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 2);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 2);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 2);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 2);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 2);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 2);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 2);
	}
}
