/** 
 * Copyright (c) SpaceToad, 2011
 * http://www.mod-buildcraft.com
 * 
 * BuildCraft is distributed under the terms of the Minecraft Mod Public 
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */

package net.minecraft.src;

import java.util.Random;

import net.minecraft.src.buildcraft.energy.TileEngine;

public class mod_BuildCraftEnergy extends BaseModMp {

	public static mod_BuildCraftEnergy instance;
	
	public void ModsLoaded () {
		super.ModsLoaded();
		BuildCraftEnergy.initialize();	
		
		ModLoader.RegisterTileEntity(TileEngine.class,
				"net.minecraft.src.buildcraft.energy.Engine");
		
		instance = this;
	}
	
	@Override
	public String Version() {
		return "2.2.5";
	}
	
    public void GenerateSurface(World world, Random random, int i, int j) {
    	BuildCraftEnergy.generateSurface (world, random, i, j);
    }
}
