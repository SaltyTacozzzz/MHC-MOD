package Nobelium76.MHC.init.items.Tools.tools;

import Nobelium76.MHC.init.MonsterHunterCraftTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class MonsterHunterCraftPickaxe extends ItemPickaxe
{

	public MonsterHunterCraftPickaxe(ToolMaterial material)
	{
		super(material);
		setCreativeTab(MonsterHunterCraftTabs.tabMHCTools);
	}
	
}