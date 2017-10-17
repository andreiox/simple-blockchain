package init;

import java.security.DigestException;
import java.security.NoSuchAlgorithmException;

import chain.Blockchain;
import miner.Miner;
import block.Block;
import block.BlockData;

public class Init {

	public static void main(String[] args) throws NoSuchAlgorithmException, DigestException {
		for (int i = 0; i < 100; i++) {
			BlockData data = new BlockData("Andre", i);
			Block block = Miner.generateNewBlock(data);
			if (Miner.isNewBlockValid(block))
				Blockchain.pushNewBlock(block);

			System.out.println(block.getHash());
		}
	}
}
