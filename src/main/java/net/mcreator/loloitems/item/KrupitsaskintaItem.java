
package net.mcreator.loloitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.loloitems.itemgroup.SkintsItemGroup;
import net.mcreator.loloitems.LoloitemsModElements;

@LoloitemsModElements.ModElement.Tag
public class KrupitsaskintaItem extends LoloitemsModElements.ModElement {
	@ObjectHolder("loloitems:krupitsaskinta")
	public static final Item block = null;

	public KrupitsaskintaItem(LoloitemsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SkintsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("krupitsaskinta");
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
