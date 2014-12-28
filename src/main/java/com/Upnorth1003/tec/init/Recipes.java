package com.Upnorth1003.tec.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        //Ac Coolant *Shaped Recipe
        GameRegistry.addRecipe
                (
                        new ItemStack(ModItems.acCoolant), " I ", "IiI", "IiI", 'I', new ItemStack(Items.iron_ingot), 'i', new ItemStack(ModItems.iceWater)
                );
        //Ice Water *Shapeless Recipe
        GameRegistry.addShapelessRecipe
                (
                        new ItemStack(ModItems.iceWater), new ItemStack(Items.potionitem), Blocks.ice
                );
        //Pipe *Shaped
        GameRegistry.addRecipe
                (
                        new ShapedOreRecipe(new ItemStack(ModItems.pipe), "iii", "ggg", "iii", 'i', new ItemStack(Items.iron_ingot), 'g', "blockGlass")
                );
        //Water Proof Pipe *Shaped
        GameRegistry.addRecipe
                (
                        new ItemStack(ModItems.waterProofPipe), " s ", "sps", " s ", 's', new ItemStack(Items.string), 'p', new ItemStack(ModItems.pipe)
                );
        //SmallAc *Shaped

        /*GameRegistry.addRecipe
                (
                        new ItemStack(ModBlocks.smallAc)
                );
        */

    }
}
