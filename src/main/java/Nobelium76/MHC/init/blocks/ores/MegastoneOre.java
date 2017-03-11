package Nobelium76.MHC.init.blocks.ores;

import net.minecraftforge.fml.common.registry.GameRegistry;
import Nobelium76.MHC.init.MonsterHunterCraftBlocks;
import Nobelium76.MHC.init.MonsterHunterCraftTabs;
import Nobelium76.MHC.main.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class MegastoneOre extends MonsterHunterCraftOres
{
	
	public MegastoneOre()
	{
		super(Material.ROCK);
		this.setCreativeTab(MonsterHunterCraftTabs.tabMHCBlocks);
		setRegistryName("mega_stone_ore");
		setResistance(4F);
		setHardness(4F);
		setHarvestLevel("pickaxe", 2);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
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