package Nobelium76.MHC.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MonsterHunterCraftTabs
{
	public static final CreativeTabs tabMHCWeapons = new CreativeTabs("tabMHCWeapons")
	{
		
		@Override
		public Item getTabIconItem()
		
		{
			return MonsterHunterCraftWeapons.PETRIFIED_SWORD;		
		}
	};
	
	
	public static final CreativeTabs tabMHCTools = new CreativeTabs("tabMHCTools")
	{
		
		@Override
		public Item getTabIconItem()
		{
			return MonsterHunterTools.MEGA_PICKAXE;
		}
	};
	
	
	
	public static final CreativeTabs tabMHCItems = new CreativeTabs("tabMHCItems")
	{
		
		@Override
		public Item getTabIconItem()
		{
			return MonsterHunterCraftItems.petrified_stone;
		}
	};
	
	public static final CreativeTabs tabMHCBlocks = new CreativeTabs("tabMHCBlocks")
	{
		
		@Override
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(MonsterHunterCraftBlocks.petrified_stone_block);
		}
	};
	
	
	public static final CreativeTabs tabMHCFood = new CreativeTabs("tabMHCFood")
	{
		
		@Override
		public Item getTabIconItem()
		{
			return MonsterHunterCraftFood.lagniapple;
		}
	}; }
	
	
	