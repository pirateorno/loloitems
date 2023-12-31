
package net.mcreator.loloitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.loloitems.itemgroup.TeacupsItemGroup;
import net.mcreator.loloitems.LoloitemsModElements;

@LoloitemsModElements.ModElement.Tag
public class EmptyCupItem extends LoloitemsModElements.ModElement {
	@ObjectHolder("loloitems:empty_cup")
	public static final Item block = null;

	public EmptyCupItem(LoloitemsModElements instance) {
		super(instance, 157);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TeacupsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("empty_cup");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 40;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
