
package net.mcreator.loloitems.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.loloitems.procedures.T9Procedure;
import net.mcreator.loloitems.procedures.T8Procedure;
import net.mcreator.loloitems.procedures.T7Procedure;
import net.mcreator.loloitems.procedures.T6Procedure;
import net.mcreator.loloitems.procedures.T5Procedure;
import net.mcreator.loloitems.procedures.T4Procedure;
import net.mcreator.loloitems.procedures.T3Procedure;
import net.mcreator.loloitems.procedures.T2Procedure;
import net.mcreator.loloitems.procedures.T1Procedure;
import net.mcreator.loloitems.procedures.T18Procedure;
import net.mcreator.loloitems.procedures.T17Procedure;
import net.mcreator.loloitems.procedures.T16Procedure;
import net.mcreator.loloitems.procedures.T15Procedure;
import net.mcreator.loloitems.procedures.T14Procedure;
import net.mcreator.loloitems.procedures.T13Procedure;
import net.mcreator.loloitems.procedures.T12Procedure;
import net.mcreator.loloitems.procedures.T11Procedure;
import net.mcreator.loloitems.procedures.T10Procedure;
import net.mcreator.loloitems.procedures.R9Procedure;
import net.mcreator.loloitems.procedures.R8Procedure;
import net.mcreator.loloitems.procedures.R7Procedure;
import net.mcreator.loloitems.procedures.R6Procedure;
import net.mcreator.loloitems.procedures.R5Procedure;
import net.mcreator.loloitems.procedures.R4Procedure;
import net.mcreator.loloitems.procedures.R3Procedure;
import net.mcreator.loloitems.procedures.R2Procedure;
import net.mcreator.loloitems.procedures.R1Procedure;
import net.mcreator.loloitems.procedures.R18Procedure;
import net.mcreator.loloitems.procedures.R17Procedure;
import net.mcreator.loloitems.procedures.R16Procedure;
import net.mcreator.loloitems.procedures.R15Procedure;
import net.mcreator.loloitems.procedures.R14Procedure;
import net.mcreator.loloitems.procedures.R13Procedure;
import net.mcreator.loloitems.procedures.R12Procedure;
import net.mcreator.loloitems.procedures.R11Procedure;
import net.mcreator.loloitems.procedures.R10Procedure;
import net.mcreator.loloitems.procedures.M9Procedure;
import net.mcreator.loloitems.procedures.M8Procedure;
import net.mcreator.loloitems.procedures.M7Procedure;
import net.mcreator.loloitems.procedures.M6Procedure;
import net.mcreator.loloitems.procedures.M5Procedure;
import net.mcreator.loloitems.procedures.M4Procedure;
import net.mcreator.loloitems.procedures.M3Procedure;
import net.mcreator.loloitems.procedures.M2Procedure;
import net.mcreator.loloitems.procedures.M1Procedure;
import net.mcreator.loloitems.procedures.M18Procedure;
import net.mcreator.loloitems.procedures.M17Procedure;
import net.mcreator.loloitems.procedures.M16Procedure;
import net.mcreator.loloitems.procedures.M15Procedure;
import net.mcreator.loloitems.procedures.M14Procedure;
import net.mcreator.loloitems.procedures.M13Procedure;
import net.mcreator.loloitems.procedures.M12Procedure;
import net.mcreator.loloitems.procedures.M11Procedure;
import net.mcreator.loloitems.procedures.M10Procedure;
import net.mcreator.loloitems.procedures.K9Procedure;
import net.mcreator.loloitems.procedures.K8Procedure;
import net.mcreator.loloitems.procedures.K7Procedure;
import net.mcreator.loloitems.procedures.K6Procedure;
import net.mcreator.loloitems.procedures.K5Procedure;
import net.mcreator.loloitems.procedures.K4Procedure;
import net.mcreator.loloitems.procedures.K3Procedure;
import net.mcreator.loloitems.procedures.K2Procedure;
import net.mcreator.loloitems.procedures.K1Procedure;
import net.mcreator.loloitems.procedures.K18Procedure;
import net.mcreator.loloitems.procedures.K17Procedure;
import net.mcreator.loloitems.procedures.K16Procedure;
import net.mcreator.loloitems.procedures.K15Procedure;
import net.mcreator.loloitems.procedures.K14Procedure;
import net.mcreator.loloitems.procedures.K13Procedure;
import net.mcreator.loloitems.procedures.K12Procedure;
import net.mcreator.loloitems.procedures.K11Procedure;
import net.mcreator.loloitems.procedures.K10Procedure;
import net.mcreator.loloitems.procedures.C9Procedure;
import net.mcreator.loloitems.procedures.C8Procedure;
import net.mcreator.loloitems.procedures.C7Procedure;
import net.mcreator.loloitems.procedures.C6Procedure;
import net.mcreator.loloitems.procedures.C5Procedure;
import net.mcreator.loloitems.procedures.C4Procedure;
import net.mcreator.loloitems.procedures.C3Procedure;
import net.mcreator.loloitems.procedures.C2Procedure;
import net.mcreator.loloitems.procedures.C1Procedure;
import net.mcreator.loloitems.procedures.C18Procedure;
import net.mcreator.loloitems.procedures.C17Procedure;
import net.mcreator.loloitems.procedures.C16Procedure;
import net.mcreator.loloitems.procedures.C15Procedure;
import net.mcreator.loloitems.procedures.C14Procedure;
import net.mcreator.loloitems.procedures.C13Procedure;
import net.mcreator.loloitems.procedures.C12Procedure;
import net.mcreator.loloitems.procedures.C11Procedure;
import net.mcreator.loloitems.procedures.C10Procedure;
import net.mcreator.loloitems.LoloitemsModVariables;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ReputationsGuiWindow extends ContainerScreen<ReputationsGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = ReputationsGui.guistate;

	public ReputationsGuiWindow(ReputationsGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 200;
		this.ySize = 160;
	}

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/reputation5.png"));
		this.blit(ms, this.guiLeft + -26, this.guiTop + -5, 0, 0, 250, 176, 250, 176);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/reputation_dada3.png"));
		this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);

		if (M1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation1.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation2.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M3Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation3.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M4Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation4.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M5Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation5.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M6Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation6.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M7Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation7.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M8Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation8.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M9Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation9.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M10Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation10.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M11Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation11.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M12Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation12.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M13Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation13.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M14Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation14.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M15Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation15.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M16Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation16.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M17Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation17.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}
		if (M18Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/magic_reputation18.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 49, 0, 0, 176, 13, 176, 13);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/reputation_dada3.png"));
		this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);

		if (K1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation2.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K3Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation3.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K4Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation4.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K5Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation5.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K6Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation6.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K7Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation7.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K8Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation8.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K9Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation9.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K10Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation10.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K11Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation11.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K12Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation12.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K13Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation13.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K14Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation14.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K15Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation15.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K16Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation16.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K17Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation17.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}
		if (K18Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/killers_reputation18.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 67, 0, 0, 176, 13, 176, 13);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/reputation_dada3.png"));
		this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/reputation_dada3.png"));
		this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/reputation_dada3.png"));
		this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/reputation_da.png"));
		this.blit(ms, this.guiLeft + 5, this.guiTop + 48, 0, 0, 25, 12, 25, 12);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/reputation_da.png"));
		this.blit(ms, this.guiLeft + 5, this.guiTop + 66, 0, 0, 25, 12, 25, 12);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/maghi_kartinka3.png"));
		this.blit(ms, this.guiLeft + 10, this.guiTop + 46, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/ubiitsy_kartinka3.png"));
		this.blit(ms, this.guiLeft + 10, this.guiTop + 63, 0, 0, 16, 17, 16, 17);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/vory_kartinka3.png"));
		this.blit(ms, this.guiLeft + 10, this.guiTop + 83, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/kontry_kartinka3.png"));
		this.blit(ms, this.guiLeft + 10, this.guiTop + 101, 0, 0, 16, 16, 16, 16);

		if (T1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation2.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T3Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation3.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T4Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation4.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T5Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation5.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T6Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation6.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T7Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation7.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T8Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation8.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T9Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation9.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T10Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation10.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T11Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation11.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T12Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation12.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T13Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation13.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T14Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation14.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T15Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation15.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T16Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation16.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T17Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation17.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}
		if (T18Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/traders_reputation18.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 121, 0, 0, 176, 13, 176, 13);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/reputation_da.png"));
		this.blit(ms, this.guiLeft + 5, this.guiTop + 121, 0, 0, 25, 12, 25, 12);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/torghovtsy_kartinka3.png"));
		this.blit(ms, this.guiLeft + 10, this.guiTop + 118, 0, 0, 16, 17, 16, 17);

		if (C1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation2.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C3Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation3.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C4Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation4.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C5Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation5.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C6Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation6.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C7Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation7.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C8Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation8.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C9Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation9.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C10Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation10.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C11Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation11.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C12Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation12.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C13Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation13.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C14Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation14.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C15Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation15.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C16Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation16.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C17Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation17.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}
		if (C18Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/contrs_reputation18.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 103, 0, 0, 176, 13, 176, 13);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/reputation_da.png"));
		this.blit(ms, this.guiLeft + 5, this.guiTop + 103, 0, 0, 25, 12, 25, 12);

		if (R1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation2.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R3Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation3.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R4Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation4.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R5Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation5.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R6Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation6.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R7Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation7.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R8Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation8.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R9Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation9.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R10Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation10.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R11Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation11.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R12Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation12.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R13Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation13.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R14Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation14.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R15Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation15.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R16Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation16.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R17Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation17.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}
		if (R18Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/robbers_reputation18.png"));
			this.blit(ms, this.guiLeft + 27, this.guiTop + 85, 0, 0, 176, 13, 176, 13);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("loloitems:textures/screens/reputation_da.png"));
		this.blit(ms, this.guiLeft + 5, this.guiTop + 85, 0, 0, 25, 12, 25, 12);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "", 72, 31, -12829636);
		this.font.drawString(ms, "\u0412\u043E\u0440\u044B: " + ((entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new LoloitemsModVariables.PlayerVariables())).Robbers_val) + "", 27, 78, -16777216);
		this.font.drawString(ms,
				"\u041A\u043E\u043D\u0442\u0440\u0430\u0431\u0430\u043D\u0434\u0438\u0441\u0442\u044B: "
						+ ((entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new LoloitemsModVariables.PlayerVariables())).Contrs_val)
						+ "",
				27, 98, -16777216);
		this.font.drawString(ms,
				"\u0422\u043E\u0440\u0433\u043E\u0432\u0446\u044B \u043F\u0440\u044F\u043D\u043E\u0441\u0442\u044F\u043C\u0438: "
						+ ((entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new LoloitemsModVariables.PlayerVariables())).Traders_val)
						+ "",
				27, 116, -16777216);
		this.font.drawString(ms, "\u041C\u0430\u0433\u0438: " + ((entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new LoloitemsModVariables.PlayerVariables())).Magic_val) + "", 27, 43, -16777216);
		this.font.drawString(ms,
				"\u0423\u0431\u0438\u0439\u0446\u044B: " + ((entity.getCapability(LoloitemsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new LoloitemsModVariables.PlayerVariables())).Killers_val) + "",
				27, 61, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
	}
}
