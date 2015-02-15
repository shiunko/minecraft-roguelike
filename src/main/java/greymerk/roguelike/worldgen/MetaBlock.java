package greymerk.roguelike.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class MetaBlock extends BlockFactoryBase {

	private Block block;
	private int meta;
	private int flag;
	
	public MetaBlock(Block block){
		this(block, 0, 2);		
	}
	
	public MetaBlock(Block block, int meta){
		this(block, meta, 2);
	}
	
	public MetaBlock(Block block, int meta, int flag){
		this.block = block;
		this.meta = meta;
		this.flag = flag;
	}
	
	public MetaBlock(JsonElement data){
		JsonObject json = (JsonObject)data;
		String name = json.get("name").getAsString();
		this.block = (Block) Block.blockRegistry.getObject(name);
		meta = json.has("meta") ? json.get("meta").getAsInt() : 0;
		flag = json.has("flag") ? json.get("flag").getAsInt() : 2;
		
	}
	
	public MetaBlock(MetaBlock toCopy){
		this.block = toCopy.block;
		this.meta = toCopy.meta;
		this.flag = toCopy.flag;
	}
	
	public Block getBlockID(){
		return block;
	}
	
	public int getMeta(){
		return meta;
	}
	
	public int getFlag(){
		return flag;
	}
	
	public void setBlockID(Block in){
		block = in;
	}
	
	public void setMeta(int in){
		meta = in;
	}
	
	public void setFlag(int in){
		flag = in;
	}

	public boolean setBlock(World world, Coord pos){
		return WorldGenPrimitive.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), this.block, this.meta, this.flag, true, true);
	}
	
	@Override
	public boolean setBlock(World world, Random rand, Coord pos, boolean fillAir, boolean replaceSolid) {
		return WorldGenPrimitive.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), this.block, this.meta, this.flag, fillAir, replaceSolid);
	}

	
}
