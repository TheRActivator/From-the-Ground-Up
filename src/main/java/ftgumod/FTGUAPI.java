package ftgumod;

import ftgumod.block.BlockIdeaTable;
import ftgumod.block.BlockResearchTable;
import ftgumod.item.ItemLookingGlass;
import ftgumod.item.ItemParchmentEmpty;
import ftgumod.item.ItemParchmentIdea;
import ftgumod.item.ItemParchmentResearch;
import ftgumod.item.ItemResearchBook;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public final class FTGUAPI {

	public static final String n_ideaTable = "idea_table";
	public static final String n_researchTable = "research_table";

	public static final String n_parchmentEmpty = "parchment_empty";
	public static final String n_parchmentIdea = "parchment_idea";
	public static final String n_parchmentResearch = "parchment_research";
	public static final String n_researchBook = "research_book";
	public static final String n_lookingGlass = "looking_glass";

	public static final Block b_ideaTable = new BlockIdeaTable(n_ideaTable);
	public static final Block b_researchTable = new BlockResearchTable(n_researchTable);

	public static final ItemBlock i_ideaTable = new ItemBlock(b_ideaTable);
	public static final ItemBlock i_researchTable = new ItemBlock(b_researchTable);

	public static final Item i_parchmentEmpty = new ItemParchmentEmpty(n_parchmentEmpty);
	public static final Item i_parchmentIdea = new ItemParchmentIdea(n_parchmentIdea);
	public static final Item i_parchmentResearch = new ItemParchmentResearch(n_parchmentResearch);
	public static final Item i_researchBook = new ItemResearchBook(n_researchBook);
	public static final Item i_lookingGlass = new ItemLookingGlass(n_lookingGlass);

}
