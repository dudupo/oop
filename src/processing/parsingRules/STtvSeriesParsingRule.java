package processing.parsingRules;

import processing.textStructure.Block;
import processing.textStructure.WordResult;

import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.List;

public class STtvSeriesParsingRule implements IparsingRule, Serializable {
	public static final long serialVersionUID = 1L;


	public STtvSeriesParsingRule() {
    }



	@Override
	public Block parseRawBlock(RandomAccessFile inputFile, long startPos, long endPos) {
		return null;
	}

	@Override
	public List<Block> parseFile(RandomAccessFile inputFile) {
		return null;
	}

	@Override
	public void printResult(WordResult wordResult) {
		System.out.println( this.getClass().getName() );
	}
}
