
package net.mcreator.loloitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.loloitems.itemgroup.SkintsItemGroup;
import net.mcreator.loloitems.LoloitemsModElements;

import java.util.List;

@LoloitemsModElements.ModElement.Tag
public class AntiskintItem extends LoloitemsModElements.ModElement {
	@ObjectHolder("loloitems:antiskint")
	public static final Item block = null;

	public AntiskintItem(LoloitemsModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SkintsItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("antiskint");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent(
					"\u041E\u0442 \u043D\u0435\u0433\u043E \u0438\u0441\u0445\u043E\u0434\u0438\u0442 \u043D\u0435\u043F\u0440\u0438\u044F\u0442\u043D\u0430\u044F \u043E\u043F\u0443\u0441\u0442\u043E\u0448\u0430\u044E\u0449\u0430\u044F \u044D\u043D\u0435\u0440\u0433\u0438\u044F"));
		}
	}
}
