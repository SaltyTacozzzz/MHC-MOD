package Nobelium76.MHC.proxy;

import Nobelium76.MHC.init.MonsterHunterCraftBlocks;
import Nobelium76.MHC.init.MonsterHunterCraftFood;
import Nobelium76.MHC.init.MonsterHunterCraftItems;
import Nobelium76.MHC.init.MonsterHunterCraftMaterials;
import Nobelium76.MHC.init.MonsterHunterCraftWeapons;
import Nobelium76.MHC.init.MonsterHunterTools;
import Nobelium76.MHC.init.blocks.ores.MegastoneOre;
import Nobelium76.MHC.init.blocks.ores.MonsterHunterCraftOres;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends COMMONPROXY
{
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		MonsterHunterCraftItems.init();
		MonsterHunterCraftBlocks.init();
		MonsterHunterCraftFood.init();
		MonsterHunterCraftWeapons.init();
		MonsterHunterTools.init();
		MonsterHunterCraftOres.init();
	}
	
	@Override
	public void Init(FMLInitializationEvent event)
	{
		super.Init(event);
		MonsterHunterCraftItems.registerRenders();
		MonsterHunterCraftBlocks.registerRenders();
		MonsterHunterCraftFood.registerRenders();
		MonsterHunterCraftWeapons.registerRenders();
		MonsterHunterTools.registerRenders();
		MonsterHunterCraftOres.registerRenders();
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
	}
}


