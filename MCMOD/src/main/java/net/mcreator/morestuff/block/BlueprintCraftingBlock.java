
package net.mcreator.morestuff.block;

import net.minecraft.world.level.storage.loot.LootContext;
<<<<<<< Updated upstream
=======
import net.minecraft.world.level.material.PushReaction;
>>>>>>> Stashed changes
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:MCMOD/src/main/java/net/mcreator/morestuff/block/NecrodermisBlockBlock.java
public class NecrodermisBlockBlock extends Block {
	public NecrodermisBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.METAL).strength(1f, 10f).lightLevel(s -> 1).requiresCorrectToolForDrops());
		setRegistryName("necrodermis_block");
=======
>>>>>>> Stashed changes
public class BlueprintCraftingBlock extends Block {
	public BlueprintCraftingBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.GRAVEL).strength(1f, 10f));
		setRegistryName("blueprint_crafting");
<<<<<<< Updated upstream
=======
>>>>>>> Stashed changes:MCMOD/src/main/java/net/mcreator/morestuff/block/BlueprintCraftingBlock.java
>>>>>>> Stashed changes
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:MCMOD/src/main/java/net/mcreator/morestuff/block/NecrodermisBlockBlock.java
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.BLOCK;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 4;
		return false;
	}

	@Override
=======
>>>>>>> Stashed changes:MCMOD/src/main/java/net/mcreator/morestuff/block/BlueprintCraftingBlock.java
>>>>>>> Stashed changes
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
