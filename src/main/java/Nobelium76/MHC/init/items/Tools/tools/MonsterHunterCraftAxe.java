package Nobelium76.MHC.init.items.Tools.tools;

import Nobelium76.MHC.init.MonsterHunterCraftTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class MonsterHunterCraftAxe extends ItemAxe
{

	public MonsterHunterCraftAxe(ToolMaterial material)
	{
		super(material, 0.9F, -1.0F);
		setCreativeTab(CreativeTabs.TOOLS);
	    }

}
