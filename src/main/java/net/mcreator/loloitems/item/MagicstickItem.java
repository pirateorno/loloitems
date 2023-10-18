
package net.mcreator.loloitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.loloitems.itemgroup.ItemsItemGroup;
import net.mcreator.loloitems.LoloitemsModElements;

@LoloitemsModElements.ModElement.Tag
public class MagicstickItem extends LoloitemsModElements.ModElement {
	@ObjectHolder("loloitems:magicstick")
	public static final Item block = null;

	public MagicstickItem(LoloitemsModElements instance) {
		super(instance, 153);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemsItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("magicstick");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
