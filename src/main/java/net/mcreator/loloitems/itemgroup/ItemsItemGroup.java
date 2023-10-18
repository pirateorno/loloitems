
package net.mcreator.loloitems.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.loloitems.item.PropuskkontriItem;
import net.mcreator.loloitems.LoloitemsModElements;

@LoloitemsModElements.ModElement.Tag
public class ItemsItemGroup extends LoloitemsModElements.ModElement {
	public ItemsItemGroup(LoloitemsModElements instance) {
		super(instance, 149);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabitems") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PropuskkontriItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
