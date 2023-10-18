package net.mcreator.loloitems.procedures;

import net.minecraft.util.math.MathHelper;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.loloitems.LoloitemsMod;

import java.util.Random;
import java.util.Map;

public class PogashayaiskraKazhdyiTikVoVriemiaEffiektaProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LoloitemsMod.LOGGER.warn("Failed to load dependency entity for procedure PogashayaiskraKazhdyiTikVoVriemiaEffiekta!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 20, (int) 0));
		if (Math.round(MathHelper.nextDouble(new Random(), 1, 100)) <= 1) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 20, (int) 0));
		}
		if (Math.round(MathHelper.nextDouble(new Random(), 1, 500)) <= 1) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 20, (int) 0));
		}
	}
}
