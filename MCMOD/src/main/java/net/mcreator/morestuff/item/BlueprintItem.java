
package net.mcreator.morestuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class BlueprintItem extends Item {
	public BlueprintItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("blueprint");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
