package Nobelium76.MHC.init;

import net.minecraft.util.ResourceLocation;
import Nobelium76.MHC.init.items.Tools.tools.MonsterHunterCraftAxe;
import Nobelium76.MHC.init.items.Tools.tools.MonsterHunterCraftPickaxe;
import Nobelium76.MHC.init.items.Tools.tools.MonsterHunterCraftShovel;
import Nobelium76.MHC.main.MonsterHunterCraft;
import Nobelium76.MHC.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MonsterHunterTools
{
	public static Item MEGA_PICKAXE;
	public static Item PETRIFIED_PICKAXE;
	
	public static Item MEGA_AXE;
	public static Item PETRIFIED_AXE;
	
	public static Item MEGA_SHOVEL;
	public static Item PETRIFIED_SHOVEL;
	
	
	public static void init()
	{
		MEGA_PICKAXE = registerItem(new MonsterHunterCraftPickaxe(MonsterHunterCraftMaterials.MEGASTONE), "mega_pickaxe").setUnlocalizedName("mega_pickaxe").setCreativeTab(MonsterHunterCraftTabs.tabMHCTools);
		PETRIFIED_PICKAXE = registerItem(new MonsterHunterCraftPickaxe(MonsterHunterCraftMaterials.PETRIFIED), "petrified_pickaxe").setUnlocalizedName("petrified_pickaxe").setCreativeTab(MonsterHunterCraftTabs.tabMHCTools);
		
		MEGA_AXE = registerItem(new MonsterHunterCraftAxe(MonsterHunterCraftMaterials.MEGASTONE), "mega_axe").setUnlocalizedName("mega_axe").setCreativeTab(MonsterHunterCraftTabs.tabMHCTools);
		PETRIFIED_AXE = registerItem(new MonsterHunterCraftAxe(MonsterHunterCraftMaterials.PETRIFIED), "petrified_axe").setUnlocalizedName("petrified_axe").setCreativeTab(MonsterHunterCraftTabs.tabMHCTools);
		
		MEGA_SHOVEL = registerItem(new MonsterHunterCraftShovel(MonsterHunterCraftMaterials.MEGASTONE), "mega_shovel").setUnlocalizedName("mega_shovel").setCreativeTab(MonsterHunterCraftTabs.tabMHCTools);
		PETRIFIED_SHOVEL = registerItem(new MonsterHunterCraftShovel(MonsterHunterCraftMaterials.PETRIFIED), "petrified_shovel").setUnlocalizedName("petrified_shovel").setCreativeTab(MonsterHunterCraftTabs.tabMHCTools);
		}
		public static void registerRenders()		
		{
			registerRender(MEGA_PICKAXE);
			registerRender(PETRIFIED_PICKAXE);
			
			registerRender(MEGA_AXE);
			registerRender(PETRIFIED_AXE);
			
			registerRender(MEGA_SHOVEL);
			registerRender(PETRIFIED_SHOVEL);
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
		} }
		//registerItem End\\	