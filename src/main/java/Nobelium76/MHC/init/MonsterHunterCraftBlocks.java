package Nobelium76.MHC.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import Nobelium76.MHC.init.blocks.PetrifiedStoneBlock;
import Nobelium76.MHC.init.blocks.ores.MegastoneOre;
import Nobelium76.MHC.main.Reference;

public class MonsterHunterCraftBlocks
{
	


	public static Block petrified_stone_block;
	
	
	public static Block MEGA_STONE_ORE;
	
	public static void init()
	{
		petrified_stone_block = new PetrifiedStoneBlock();
		petrified_stone_block.setUnlocalizedName("petrified_stone_block");
		petrified_stone_block.setCreativeTab(MonsterHunterCraftTabs.tabMHCBlocks);
		

		
		MEGA_STONE_ORE = (Block) new MegastoneOre();
		MEGA_STONE_ORE.setUnlocalizedName("mega_stone_ore");
		MEGA_STONE_ORE.setCreativeTab(MonsterHunterCraftTabs.tabMHCBlocks);
	}
	
	@SideOnly (Side.CLIENT)
	public static void registerRenders()
	{
		registerRender(petrified_stone_block);
		registerRender(MEGA_STONE_ORE);
	}
	
	public static void registerRender(Block block)
	{
		
		Item item = Item.getItemFromBlock(block);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		

	}
}

