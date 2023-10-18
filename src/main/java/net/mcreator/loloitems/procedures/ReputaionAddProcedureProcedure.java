package net.mcreator.loloitems.procedures;

import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.CommandSource;

import net.mcreator.loloitems.LoloitemsModVariables;
import net.mcreator.loloitems.LoloitemsMod;

import java.util.Map;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ReputaionAddProcedureProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("arguments") == null) {
			if (!dependencies.containsKey("arguments"))
				LoloitemsMod.LOGGER.warn("Failed to load dependency arguments for procedure ReputaionAddProcedure!");
			return;
		}
		CommandContext<CommandSource> arguments = (CommandContext<CommandSource>) dependencies.get("arguments");
		if ((StringArgumentType.getString(arguments, "clanName")).equals("magic")
				|| (StringArgumentType.getString(arguments, "clanName")).equals("Magic")) {
			{
				Entity _ent = (new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity());
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("/title @a actionbar [\"\",{\"text\":\"+" + "" + DoubleArgumentType.getDouble(arguments, "howManyReputation")
									+ " \\u0440\\u0435\\u043f\\u0443\\u0442\\u0430\\u0446\\u0438\\u0438 \"},{\"text\":\"\\u043c\\u0430\\u0433\\u043e\\u0432\",\"color\":\"dark_aqua\"}]"));
				}
			}
			{
				double _setval = (((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new LoloitemsModVariables.PlayerVariables())).Magic_val
						+ DoubleArgumentType.getDouble(arguments, "howManyReputation"));
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Magic_val = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
		} else if ((StringArgumentType.getString(arguments, "clanName")).equals("killers")
				|| (StringArgumentType.getString(arguments, "clanName")).equals("Killers")) {
			{
				Entity _ent = (new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity());
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("/title @a actionbar [\"\",{\"text\":\"+" + "" + DoubleArgumentType.getDouble(arguments, "howManyReputation")
									+ " \\u0440\\u0435\\u043f\\u0443\\u0442\\u0430\\u0446\\u0438\\u0438 \"},{\"text\":\"\\u0443\\u0431\\u0438\\u0439\\u0446\\u043e\\u0432\",\"color\":\"dark_red\"}]"));
				}
			}
			{
				double _setval = (((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new LoloitemsModVariables.PlayerVariables())).Killers_val
						+ DoubleArgumentType.getDouble(arguments, "howManyReputation"));
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Killers_val = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
		} else if ((StringArgumentType.getString(arguments, "clanName")).equals("robbers")
				|| (StringArgumentType.getString(arguments, "clanName")).equals("Robbers")) {
			{
				Entity _ent = (new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity());
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("/title @a actionbar [\"\",{\"text\":\"+" + "" + DoubleArgumentType.getDouble(arguments, "howManyReputation")
									+ " \\u0440\\u0435\\u043f\\u0443\\u0442\\u0430\\u0446\\u0438\\u0438 \"},{\"text\":\"\\u0432\\u043e\\u0440\\u043e\\u0432\",\"color\":\"dark_green\"}]"));
				}
			}
			{
				double _setval = (((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new LoloitemsModVariables.PlayerVariables())).Robbers_val
						+ DoubleArgumentType.getDouble(arguments, "howManyReputation"));
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Robbers_val = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
		} else if ((StringArgumentType.getString(arguments, "clanName")).equals("contrs")
				|| (StringArgumentType.getString(arguments, "clanName")).equals("Contrs")) {
			{
				Entity _ent = (new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity());
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("/title @a actionbar [\"\",{\"text\":\"+" + "" + DoubleArgumentType.getDouble(arguments, "howManyReputation")
									+ " \\u0440\\u0435\\u043f\\u0443\\u0442\\u0430\\u0446\\u0438\\u0438 \"},{\"text\":\"\\u043a\\u043e\\u043d\\u0442\\u0440\\u0430\\u0431\\u0430\\u043d\\u0434\\u0438\\u0441\\u0442\\u043e\\u0432\",\"color\":\"dark_aqua\"}]"));
				}
			}
			{
				double _setval = (((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new LoloitemsModVariables.PlayerVariables())).Contrs_val
						+ DoubleArgumentType.getDouble(arguments, "howManyReputation"));
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Contrs_val = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
		} else if ((StringArgumentType.getString(arguments, "clanName")).equals("traders")
				|| (StringArgumentType.getString(arguments, "clanName")).equals("Traders")) {
			{
				Entity _ent = (new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity());
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("/title @a actionbar [\"\",{\"text\":\"+" + "" + DoubleArgumentType.getDouble(arguments, "howManyReputation")
									+ " \\u0440\\u0435\\u043f\\u0443\\u0442\\u0430\\u0446\\u0438\\u0438 \"},{\"text\":\"\\u0442\\u043e\\u0440\\u0433\\u043e\\u0432\\u0446\\u0435\\u0432 \\u043f\\u0440\\u044f\\u043d\\u043e\\u0441\\u0442\\u044f\\u043c\\u0438\",\"color\":\"dark_green\"}]"));
				}
			}
			{
				double _setval = (((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new LoloitemsModVariables.PlayerVariables())).Traders_val
						+ DoubleArgumentType.getDouble(arguments, "howManyReputation"));
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Traders_val = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
		} else if ((StringArgumentType.getString(arguments, "clanName")).equals("all")
				|| (StringArgumentType.getString(arguments, "clanName")).equals("All")) {
			{
				Entity _ent = (new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity());
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							("/title @a actionbar [\"\",{\"text\":\"+" + "" + DoubleArgumentType.getDouble(arguments, "howManyReputation")
									+ " \\u0440\\u0435\\u043f\\u0443\\u0442\\u0430\\u0446\\u0438\\u0438 \"},{\"text\":\"\\u043e\\u0442 \\u0432\\u0441\\u0435\\u0445 \\u0433\\u0438\\u043b\\u0434\\u044c\\u0438\\u0439\",\"color\":\"yellow\"}]"));
				}
			}
			{
				double _setval = (((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new LoloitemsModVariables.PlayerVariables())).Magic_val
						+ DoubleArgumentType.getDouble(arguments, "howManyReputation"));
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Magic_val = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
			{
				double _setval = (((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new LoloitemsModVariables.PlayerVariables())).Killers_val
						+ DoubleArgumentType.getDouble(arguments, "howManyReputation"));
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Killers_val = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
			{
				double _setval = (((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new LoloitemsModVariables.PlayerVariables())).Robbers_val
						+ DoubleArgumentType.getDouble(arguments, "howManyReputation"));
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Robbers_val = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
			{
				double _setval = (((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new LoloitemsModVariables.PlayerVariables())).Contrs_val
						+ DoubleArgumentType.getDouble(arguments, "howManyReputation"));
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Contrs_val = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
			{
				double _setval = (((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new LoloitemsModVariables.PlayerVariables())).Traders_val
						+ DoubleArgumentType.getDouble(arguments, "howManyReputation"));
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Traders_val = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
		}
	}
}
