
package net.mcreator.loloitems.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.loloitems.item.EmptyCupItem;
import net.mcreator.loloitems.LoloitemsModElements;

@LoloitemsModElements.ModElement.Tag
public class TeacupsItemGroup extends LoloitemsModElements.ModElement {
	public TeacupsItemGroup(LoloitemsModElements instance) {
		super(instance, 103);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabteacups") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EmptyCupItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
