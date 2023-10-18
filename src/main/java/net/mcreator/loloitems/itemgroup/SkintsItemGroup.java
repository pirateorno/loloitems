
package net.mcreator.loloitems.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.loloitems.item.AntiskintItem;
import net.mcreator.loloitems.LoloitemsModElements;

@LoloitemsModElements.ModElement.Tag
public class SkintsItemGroup extends LoloitemsModElements.ModElement {
	public SkintsItemGroup(LoloitemsModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabskints") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AntiskintItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
