package net.mcreator.morestuff.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;

public class BlueprintMadeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack stack = ((Slot) _slots.get(1)).getItem();
			if (stack != null) {
				if (stack.hurt(1, new Random(), null)) {
					stack.shrink(1);
					stack.setDamageValue(0);
				}
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			((Slot) _slots.get(2)).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
	}
}
