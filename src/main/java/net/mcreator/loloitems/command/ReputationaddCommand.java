
package net.mcreator.loloitems.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.Commands;
import net.minecraft.command.CommandSource;

import net.mcreator.loloitems.procedures.ReputaionAddProcedureProcedure;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class ReputationaddCommand {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(LiteralArgumentBuilder.<CommandSource>literal("reputation").requires(s -> s.hasPermissionLevel(4))
						.then(Commands.argument("clanName", StringArgumentType.string())
								.then(Commands.argument("howManyReputation", DoubleArgumentType.doubleArg())
										.then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
											ServerWorld world = arguments.getSource().getWorld();
											double x = arguments.getSource().getPos().getX();
											double y = arguments.getSource().getPos().getY();
											double z = arguments.getSource().getPos().getZ();
											Entity entity = arguments.getSource().getEntity();
											if (entity == null)
												entity = FakePlayerFactory.getMinecraft(world);
											Direction direction = entity.getHorizontalFacing();

											ReputaionAddProcedureProcedure
													.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("arguments", arguments))
															.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
											return 0;
										})))));
	}
}
