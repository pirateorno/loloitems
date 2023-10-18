package net.mcreator.loloitems.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.loloitems.potion.PogashayaiskraPotionEffect;
import net.mcreator.loloitems.LoloitemsModVariables;
import net.mcreator.loloitems.LoloitemsMod;

import java.util.Random;
import java.util.Map;
import java.util.Collection;

public class RassudokUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LoloitemsMod.LOGGER.warn("Failed to load dependency world for procedure RassudokUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LoloitemsMod.LOGGER.warn("Failed to load dependency entity for procedure RassudokUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		double multiplier = 0;
		if (("" + (world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD)).contains("overworld")) {
			if ((entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new LoloitemsModVariables.PlayerVariables())).Rossudok_val > 0) {
				multiplier = 1;
				if (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == PogashayaiskraPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) {
					multiplier = 2;
				}
				if (Math.round(MathHelper.nextDouble(new Random(), 1, 10)) <= 3) {
					{
						double _setval = ((entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new LoloitemsModVariables.PlayerVariables())).Rossudok_val
								- Math.round(MathHelper.nextDouble(new Random(), 0, 1)) * multiplier);
						entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Rossudok_val = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
