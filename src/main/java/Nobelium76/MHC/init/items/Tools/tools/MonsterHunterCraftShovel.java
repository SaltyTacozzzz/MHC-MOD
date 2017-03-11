package Nobelium76.MHC.init.items.Tools.tools;

import Nobelium76.MHC.init.MonsterHunterCraftTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class MonsterHunterCraftShovel extends ItemSpade
{

	public MonsterHunterCraftShovel(ToolMaterial material)
	{
		super(material);
		setCreativeTab(MonsterHunterCraftTabs.tabMHCTools);
	}
	
}
