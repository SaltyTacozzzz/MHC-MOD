package Nobelium76.MHC.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import Nobelium76.MHC.init.items.Tools.tools.MonsterHunterCraftAxe;
import Nobelium76.MHC.init.items.Tools.weapons.MonsterHunterCraftSwords;
import Nobelium76.MHC.main.Reference;

public class MonsterHunterCraftWeapons
{
	public static Item PETRIFIED_SWORD;
	

	public static void init()
	{
		PETRIFIED_SWORD = registerItem(new MonsterHunterCraftSwords(MonsterHunterCraftMaterials.PETRIFIED), "petrified_sword").setUnlocalizedName("petrified_sword").setCreativeTab(MonsterHunterCraftTabs.tabMHCWeapons);
	}
	public static void registerRenders()
	{
		registerRender(PETRIFIED_SWORD);
	}





public static void registerRender(Item item)
{
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
}


//registerItem Start\\
	public static Item registerItem(Item item, String name)
	{
		return registerItem(item, name, null);
	}
	
	public static Item registerItem(Item item, String name, CreativeTabs Tab)
	{
		GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
		return item;
	}
	//registerItem End\\
}

