package chain;

import java.util.Stack;

import block.Block;
import block.BlockUtil;

public class Blockchain {

	private static Stack<Block> blockchain;

	static {
		initBlockchain();
	}

	public static Block getLatestBlock() {
		return blockchain.peek();
	}

	public static void pushNewBlock(Block new_block) {
		blockchain.push(new_block);
	}

	private static void initBlockchain() {
		blockchain = new Stack<Block>();
		blockchain.push(BlockUtil.generateGenesisBlock());
	}

}
