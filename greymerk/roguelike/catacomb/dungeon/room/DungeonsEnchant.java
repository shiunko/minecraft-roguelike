package greymerk.roguelike.catacomb.dungeon.room;

import greymerk.roguelike.catacomb.dungeon.IDungeon;
import greymerk.roguelike.worldgen.MetaBlock;
import greymerk.roguelike.worldgen.WorldGenPrimitive;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.World;

public class DungeonsEnchant implements IDungeon{

	@Override
	public boolean generate(World inWorld, Random inRandom, int inOriginX, int inOriginY, int inOriginZ) {
		
		
		// clear space
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 5, inOriginY, inOriginZ - 5, inOriginX + 5, inOriginY + 4, inOriginZ + 5, 0);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 3, inOriginY + 5, inOriginZ - 3, inOriginX + 3, inOriginY + 5, inOriginZ + 3, 0);
		
		
		// doors
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 6, inOriginY - 1, inOriginZ - 2, inOriginX - 6, inOriginY + 3, inOriginZ - 2, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 6, inOriginY - 1, inOriginZ + 2, inOriginX - 6, inOriginY + 3, inOriginZ + 2, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 6, inOriginY - 1, inOriginZ - 2, inOriginX + 6, inOriginY + 3, inOriginZ - 2, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 6, inOriginY - 1, inOriginZ + 2, inOriginX + 6, inOriginY + 3, inOriginZ + 2, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 2, inOriginY - 1, inOriginZ - 6, inOriginX - 2, inOriginY + 3, inOriginZ - 6, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 2, inOriginY - 1, inOriginZ - 6, inOriginX + 2, inOriginY + 3, inOriginZ - 6, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 2, inOriginY - 1, inOriginZ + 6, inOriginX - 2, inOriginY + 3, inOriginZ + 6, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 2, inOriginY - 1, inOriginZ + 6, inOriginX + 2, inOriginY + 3, inOriginZ + 6, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 6, inOriginY - 1, inOriginZ - 1, inOriginX - 6, inOriginY + 3, inOriginZ + 1, Block.blockNetherQuartz.blockID, 1, 2, false, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 6, inOriginY - 1, inOriginZ - 1, inOriginX + 6, inOriginY + 3, inOriginZ + 1, Block.blockNetherQuartz.blockID, 1, 2, false, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 1, inOriginY - 1, inOriginZ - 6, inOriginX + 1, inOriginY + 3, inOriginZ - 6, Block.blockNetherQuartz.blockID, 1, 2, false, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 1, inOriginY - 1, inOriginZ + 6, inOriginX + 1, inOriginY + 3, inOriginZ + 6, Block.blockNetherQuartz.blockID, 1, 2, false, true);
		
		// pillars
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 4, inOriginY, inOriginZ - 4, inOriginX - 4, inOriginY + 4, inOriginZ - 4, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 4, inOriginY, inOriginZ + 4, inOriginX - 4, inOriginY + 4, inOriginZ + 4, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 4, inOriginY, inOriginZ - 4, inOriginX + 4, inOriginY + 4, inOriginZ - 4, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 4, inOriginY, inOriginZ + 4, inOriginX + 4, inOriginY + 4, inOriginZ + 4, Block.blockNetherQuartz.blockID, 2, 2, true, true);
		
		MetaBlock decor = new MetaBlock(Block.stainedClay.blockID, inRandom.nextInt(16));
		MetaBlock lining = new MetaBlock(Block.stainedClay.blockID, inRandom.nextInt(16));
		
		//lapis shell
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 5, inOriginY, inOriginZ - 3, inOriginX - 5, inOriginY + 4, inOriginZ - 3, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 5, inOriginY, inOriginZ + 3, inOriginX - 5, inOriginY + 4, inOriginZ + 3, decor, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 5, inOriginY, inOriginZ - 3, inOriginX + 5, inOriginY + 4, inOriginZ - 3, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 5, inOriginY, inOriginZ + 3, inOriginX + 5, inOriginY + 4, inOriginZ + 3, decor, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 3, inOriginY, inOriginZ - 5, inOriginX - 3, inOriginY + 4, inOriginZ - 5, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 3, inOriginY, inOriginZ - 5, inOriginX + 3, inOriginY + 4, inOriginZ - 5, decor, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 3, inOriginY, inOriginZ + 5, inOriginX - 3, inOriginY + 4, inOriginZ + 5, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 3, inOriginY, inOriginZ + 5, inOriginX + 3, inOriginY + 4, inOriginZ + 5, decor, true, true);
		
		// tops & bottoms
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 5, inOriginY - 1, inOriginZ - 5, inOriginX - 3, inOriginY - 1, inOriginZ - 3, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 5, inOriginY + 4, inOriginZ - 5, inOriginX - 3, inOriginY + 4, inOriginZ - 3, decor, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 5, inOriginY - 1, inOriginZ + 3, inOriginX - 3, inOriginY - 1, inOriginZ + 5, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 5, inOriginY + 4, inOriginZ + 3, inOriginX - 3, inOriginY + 4, inOriginZ + 5, decor, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 3, inOriginY - 1, inOriginZ + 3, inOriginX + 5, inOriginY - 1, inOriginZ + 5, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 3, inOriginY + 4, inOriginZ + 3, inOriginX + 5, inOriginY + 4, inOriginZ + 5, decor, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 3, inOriginY - 1, inOriginZ - 5, inOriginX + 5, inOriginY - 1, inOriginZ - 3, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 3, inOriginY + 4, inOriginZ - 5, inOriginX + 5, inOriginY + 4, inOriginZ - 3, decor, true, true);
		
		// arch beams
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 4, inOriginY + 4, inOriginZ - 2, inOriginX - 4, inOriginY + 4, inOriginZ + 2, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 5, inOriginY + 3, inOriginZ - 2, inOriginX - 5, inOriginY + 3, inOriginZ + 2, decor, true, true);

		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 4, inOriginY + 4, inOriginZ - 2, inOriginX + 4, inOriginY + 4, inOriginZ + 2, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 5, inOriginY + 3, inOriginZ - 2, inOriginX + 5, inOriginY + 3, inOriginZ + 2, decor, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 2, inOriginY + 4, inOriginZ - 4, inOriginX + 2, inOriginY + 4, inOriginZ - 4, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 2, inOriginY + 3, inOriginZ - 5, inOriginX + 2, inOriginY + 3, inOriginZ - 5, decor, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 2, inOriginY + 4, inOriginZ + 4, inOriginX + 2, inOriginY + 4, inOriginZ + 4, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 2, inOriginY + 3, inOriginZ + 5, inOriginX + 2, inOriginY + 3, inOriginZ + 5, decor, true, true);
		
		// roof
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 3, inOriginY + 5, inOriginZ - 3, inOriginX + 3, inOriginY + 5, inOriginZ + 3, lining, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 2, inOriginY + 5, inOriginZ - 1, inOriginX + 2, inOriginY + 5, inOriginZ + 1, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 1, inOriginY + 5, inOriginZ - 2, inOriginX + 1, inOriginY + 5, inOriginZ - 2, decor, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 1, inOriginY + 5, inOriginZ + 2, inOriginX + 1, inOriginY + 5, inOriginZ + 2, decor, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 1, inOriginY + 5, inOriginZ, inOriginX + 1, inOriginY + 5, inOriginZ, Block.glowStone.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX, inOriginY + 5, inOriginZ - 1, Block.glowStone.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX, inOriginY + 5, inOriginZ + 1, Block.glowStone.blockID);
		
		// enchanting floor
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 5, inOriginY - 1, inOriginZ - 1, inOriginX - 3, inOriginY - 1, inOriginZ + 1, lining, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 3, inOriginY - 1, inOriginZ - 1, inOriginX + 5, inOriginY - 1, inOriginZ + 1, lining, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 1, inOriginY - 1, inOriginZ - 5, inOriginX + 1, inOriginY - 1, inOriginZ - 3, lining, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 1, inOriginY - 1, inOriginZ + 3, inOriginX + 1, inOriginY - 1, inOriginZ + 5, lining, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 5, inOriginY - 1, inOriginZ + 2, inOriginX - 3, inOriginY - 1, inOriginZ + 2, Block.blockNetherQuartz.blockID, 1, 2, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 5, inOriginY - 1, inOriginZ - 2, inOriginX - 3, inOriginY - 1, inOriginZ - 2, Block.blockNetherQuartz.blockID, 1, 2, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 3, inOriginY - 1, inOriginZ + 2, inOriginX + 5, inOriginY - 1, inOriginZ + 2, Block.blockNetherQuartz.blockID, 1, 2, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 3, inOriginY - 1, inOriginZ - 2, inOriginX + 5, inOriginY - 1, inOriginZ - 2, Block.blockNetherQuartz.blockID, 1, 2, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 2, inOriginY - 1, inOriginZ - 5, inOriginX - 2, inOriginY - 1, inOriginZ - 3, Block.blockNetherQuartz.blockID, 1, 2, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 2, inOriginY - 1, inOriginZ - 5, inOriginX + 2, inOriginY - 1, inOriginZ - 3, Block.blockNetherQuartz.blockID, 1, 2, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 2, inOriginY - 1, inOriginZ + 3, inOriginX - 2, inOriginY - 1, inOriginZ + 5, Block.blockNetherQuartz.blockID, 1, 2, true, true);
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX + 2, inOriginY - 1, inOriginZ + 3, inOriginX + 2, inOriginY - 1, inOriginZ + 5, Block.blockNetherQuartz.blockID, 1, 2, true, true);
		
		WorldGenPrimitive.fillRectSolid(inWorld, inOriginX - 2, inOriginY - 1, inOriginZ - 2, inOriginX + 2, inOriginY - 1, inOriginZ + 2, decor, true, true);
		
		/*
		WorldGenPrimitive.setBlock(inWorld, inOriginX - 2, inOriginY, inOriginZ - 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX - 2, inOriginY + 1, inOriginZ - 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX - 1, inOriginY, inOriginZ - 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX - 2, inOriginY, inOriginZ - 1, Block.bookShelf.blockID);
		
		WorldGenPrimitive.setBlock(inWorld, inOriginX - 2, inOriginY, inOriginZ + 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX - 2, inOriginY + 1, inOriginZ + 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX - 1, inOriginY, inOriginZ + 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX - 2, inOriginY, inOriginZ + 1, Block.bookShelf.blockID);
		
		WorldGenPrimitive.setBlock(inWorld, inOriginX + 2, inOriginY, inOriginZ - 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX + 2, inOriginY + 1, inOriginZ - 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX + 1, inOriginY, inOriginZ - 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX + 2, inOriginY, inOriginZ - 1, Block.bookShelf.blockID);
		
		WorldGenPrimitive.setBlock(inWorld, inOriginX + 2, inOriginY, inOriginZ + 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX + 2, inOriginY + 1, inOriginZ + 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX + 1, inOriginY, inOriginZ + 2, Block.bookShelf.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX + 2, inOriginY, inOriginZ + 1, Block.bookShelf.blockID);
		*/
		
		WorldGenPrimitive.setBlock(inWorld, inOriginX, inOriginY - 1, inOriginZ, Block.glowStone.blockID);
		WorldGenPrimitive.setBlock(inWorld, inOriginX, inOriginY, inOriginZ, Block.enchantmentTable.blockID);
		
		return false;
	}	
	
}