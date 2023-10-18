package net.mcreator.loloitems.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.loloitems.LoloitemsMod;

import java.util.Map;

public class CreditsproProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LoloitemsMod.LOGGER.warn("Failed to load dependency world for procedure Creditspro!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LoloitemsMod.LOGGER.warn("Failed to load dependency x for procedure Creditspro!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LoloitemsMod.LOGGER.warn("Failed to load dependency y for procedure Creditspro!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LoloitemsMod.LOGGER.warn("Failed to load dependency z for procedure Creditspro!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"/tellraw @p [\"\",{\"text\":\"[Loloitems] \",\"color\":\"green\"},\"\u0421\u043F\u0430\u0441\u0438\u0431\u043E \u044D\u0442\u0438\u043C \u043B\u044E\u0434\u044F\u043C \u0437\u0430 \u043F\u043E\u043C\u043E\u0449\u044C \u0432 \u0440\u0430\u0437\u0440\u0430\u0431\u043E\u0442\u043A\u0435:\",\"\\n\",{\"text\":\"Sasha3131off\",\"color\":\"gold\"},\" - \u0413\u043B\u0430\u0432\u043D\u044B\u0439 \u0440\u0430\u0437\u0440\u0430\u0431\u043E\u0442\u0447\u0438\u043A \u043C\u043E\u0434\u0430\",\"\\n\",{\"text\":\"M1lkyWay3\",\"color\":\"gold\"},\" - \u0421\u0434\u0435\u043B\u0430\u043B \u0432\u0441\u0435 3\u0434 \u043C\u043E\u0434\u0435\u043B\u0438 \u0438 \u043F\u0440\u0435\u0434\u043B\u0430\u0433\u0430\u043B \u043C\u043D\u043E\u0433\u043E \u0438\u0434\u0435\u0439\",\"\\n\",{\"text\":\"M1lkyWay3\",\"color\":\"gold\"},\" - \u0421\u0434\u0435\u043B\u0430\u043B \u0432\u0441\u0435 2\u0434 \u0442\u0435\u043A\u0441\u0442\u0443\u0440\u044B\",\"\\n\",{\"text\":\"Kramer\",\"color\":\"gold\"},\" - \u0421\u0434\u0435\u043B\u0430\u043B \u043A\u0430\u0440\u0442\u0443 \u043F\u043E\u044D\u043D\u044B \u0438 \u043F\u0440\u0435\u0434\u043B\u0430\u0433\u0430\u043B \u043C\u043D\u043E\u0433\u043E \u0438\u0434\u0435\u0439\",\"\\n\",{\"text\":\"[Loloitems] \",\"color\":\"green\"},\"\u0421\u043F\u0430\u0441\u0438\u0431\u043E \u044D\u0442\u0438\u043C \u043B\u044E\u0434\u044F\u043C \u0437\u0430 \u043F\u043E\u0438\u0441\u043A \u0431\u0430\u0433\u043E\u0432:\",\"\\n\",{\"text\":\"Hiroka|Love  \",\"color\":\"gold\"},\" - \u0442\u0435\u0441\u0442\u0435\u0440\",\"\\n\",{\"text\":\"Zefirkafell\",\"color\":\"gold\"},\" - \u0442\u0435\u0441\u0442\u0435\u0440\",\"\\n\"]");
		}
	}
}
