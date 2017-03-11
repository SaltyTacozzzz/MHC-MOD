package Nobelium76.MHC.init;

import Nobelium76.MHC.main.MonsterHunterCraft;
import Nobelium76.MHC.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MonsterHunterCraftItems
{
	public static Item petrified_stone;
	
	public static Item mega_stone;
	
	public static void init()
	{
		     mega_stone = registerItem(new Item(), "mega_stone").setUnlocalizedName("mega_stone").setCreativeTab(MonsterHunterCraftTabs.tabMHCItems);
		petrified_stone = registerItem(new Item(), "petrified_stone").setUnlocalizedName("petrified_stone").setCreativeTab(MonsterHunterCraftTabs.tabMHCItems);
	}
	
	
	public static void registerRenders()
	{
		registerRender(petrified_stone);
		registerRender(mega_stone);
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
