package net.mcreator.loloitems.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.loloitems.LoloitemsModVariables;
import net.mcreator.loloitems.LoloitemsMod;

import java.util.Map;

public class T11Procedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LoloitemsMod.LOGGER.warn("Failed to load dependency entity for procedure T11!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new LoloitemsModVariables.PlayerVariables())).Traders_val >= 220) {
			return true;
		}
		return false;
	}
}
