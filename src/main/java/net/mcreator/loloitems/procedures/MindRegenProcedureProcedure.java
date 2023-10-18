package net.mcreator.loloitems.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import net.mcreator.loloitems.LoloitemsModVariables;
import net.mcreator.loloitems.LoloitemsMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class MindRegenProcedureProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onUseItemStart(LivingEntityUseItemEvent.Finish event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				double duration = event.getDuration();
				ItemStack itemstack = event.getItem();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("itemstack", itemstack);
				dependencies.put("duration", duration);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LoloitemsMod.LOGGER.warn("Failed to load dependency entity for procedure MindRegenProcedure!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LoloitemsMod.LOGGER.warn("Failed to load dependency itemstack for procedure MindRegenProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (itemstack.getItem().isFood() && (entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new LoloitemsModVariables.PlayerVariables())).Rossudok_val < 95) {
			if (itemstack.getItem() == Items.COOKIE || itemstack.getItem() == Items.APPLE) {
				{
					double _setval = ((entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new LoloitemsModVariables.PlayerVariables())).Rossudok_val
							+ Math.round(MathHelper.nextDouble(new Random(), 1, 5)));
					entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Rossudok_val = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
