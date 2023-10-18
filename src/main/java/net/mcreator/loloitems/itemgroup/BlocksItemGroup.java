
package net.mcreator.loloitems.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.loloitems.block.SkintOreBlock;
import net.mcreator.loloitems.LoloitemsModElements;

@LoloitemsModElements.ModElement.Tag
public class BlocksItemGroup extends LoloitemsModElements.ModElement {
	public BlocksItemGroup(LoloitemsModElements instance) {
		super(instance, 64);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabblocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SkintOreBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
