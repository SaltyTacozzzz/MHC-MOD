package Nobelium76.MHC.init.blocks.ores;

import Nobelium76.MHC.init.MonsterHunterCraftBlocks;
import Nobelium76.MHC.init.MonsterHunterCraftItems;
import Nobelium76.MHC.init.MonsterHunterCraftTabs;
import Nobelium76.MHC.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class MonsterHunterCraftOres extends Block
{

	public MonsterHunterCraftOres(Material rock)
	{
		super(Material.ROCK);
		this.setCreativeTab(MonsterHunterCraftTabs.tabMHCBlocks);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return this == MonsterHunterCraftBlocks.MEGA_STONE_ORE ? MonsterHunterCraftItems.mega_stone : this == MonsterHunterCraftBlocks.MEGA_STONE_ORE ? MonsterHunterCraftItems.petrified_stone : (Item.getItemFromBlock(this));	
	}
	
	public int quantityDroppedWithBonus(int fortune, Random rand)
	{
	  if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), rand, fortune))
	  {
		  int i = rand.nextInt(fortune + 2) - 1;
		  if (i < 0)
		  {
			  i = 0;
		  }
		  return this.quantityDropped(rand) * (i + 1);
	  }
	  else
	  {
		  return this.quantityDropped(rand);
	  }
	}
	
	   public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
	    {
	        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
	    }
	   
	   @Override
	    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
	    {
	        Random rand = world instanceof World ? ((World)world).rand : new Random();
	        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
	        {
	            int i = 0;

	            if (this == MonsterHunterCraftBlocks.MEGA_STONE_ORE)
	            {
	                i = MathHelper.getRandomIntegerInRange(rand, 0, 2);
	            }
	            //else if (this == Blocks.DIAMOND_ORE)
	           // {
	               // i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
	           // }

	            return i;
	        }
         return 0;
	    }
	   
	   public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	   {
		   return new ItemStack(this);
	   }

	public static void init() {
		
	}

	public static void registerRenders() {

	}
}
