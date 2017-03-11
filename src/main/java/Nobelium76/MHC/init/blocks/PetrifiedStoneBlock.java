package Nobelium76.MHC.init.blocks;

import Nobelium76.MHC.main.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PetrifiedStoneBlock extends Block	
{

	public PetrifiedStoneBlock()
	{
		super(Material.ROCK);
		setRegistryName("petrified_stone_block");
		setResistance(3F);
		setHardness(3F);
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