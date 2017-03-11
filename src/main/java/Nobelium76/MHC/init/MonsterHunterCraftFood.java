package Nobelium76.MHC.init;

import Nobelium76.MHC.main.MonsterHunterCraft;
import Nobelium76.MHC.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MonsterHunterCraftFood
{
	public static Item lagniapple;
	
	public static void init()
	{
		lagniapple = registerItem(new ItemFood(7, 1F, false), "lagniapple").setUnlocalizedName("lagniapple").setCreativeTab(MonsterHunterCraftTabs.tabMHCFood);
	}
	
	
	public static void registerRenders()
	{
		registerRender(lagniapple);
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
