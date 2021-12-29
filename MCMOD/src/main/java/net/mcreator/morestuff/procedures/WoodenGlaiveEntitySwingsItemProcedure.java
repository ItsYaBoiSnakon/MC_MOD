package net.mcreator.morestuff.procedures;

import net.minecraft.world.level.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.*;
import net.minecraft.world.phys.*;
import net.minecraft.util.*;
import net.minecraft.world.item.*;
import net.minecraft.core.*;
import net.minecraft.world.level.block.state.*;

public class WoodenGlaiveEntitySwingsItemProcedure
{
	public static void execute(ItemStack itemstack, LivingEntity entity, Level level)
	{
	    if (entity == null){
	    	return;
	    }
	    if (!(entity instanceof Player))
	    {
	    	return;
	    }
	    if(!level.isClientSide())
	    {
	    		Player player = (Player)entity;
	        	Vec3 position = player.getEyePosition();
	        	float xRot = Mth.DEG_TO_RAD*-player.getViewXRot(1);
	    		float yRot = Mth.DEG_TO_RAD*-player.getViewYRot(1);
	    		Vec3 direction = new Vec3(Mth.sin(yRot)*Mth.cos(xRot), Mth.sin(xRot), Mth.cos(yRot) * Mth.cos(xRot));
				for(float t = 0f; t <= 5; t+=0.1)
				{
					Vec3 pos = position.add(direction.scale(t));
					BlockPos blockPos = new BlockPos((int)pos.x, (int)pos.y, (int)pos.z);
					
					BlockState blockState = level.getBlockState(blockPos);
					if(blockState.canOcclude()){
						System.out.println(level);
						System.out.println(blockState);
						System.out.println(blockPos);
						System.out.println(player);
						itemstack.mineBlock(level, blockState, blockPos, player); 
						break;
					}
					AABB aabb = AABB.ofSize(pos, 0.1, 0.1, 0.1);
				}
	    }
	}
}