package miner;

import java.security.DigestException;
import java.security.NoSuchAlgorithmException;

import chain.Blockchain;
import block.Block;
import block.BlockData;

public class Miner {

	public static Block generateNewBlock(BlockData data) throws NoSuchAlgorithmException, DigestException {

		Block previous_block = Blockchain.getLatestBlock();
		int index = previous_block.getIndex() + 1;
		long timestamp = System.currentTimeMillis();
		String previous_hash = previous_block.getHash();
		String hash = PoW.generateHash(index, previous_hash, timestamp, data);

		return new Block(index, previous_hash, timestamp, hash, data);
	}

	public static boolean isNewBlockValid(Block new_block) throws NoSuchAlgorithmException, DigestException {

		boolean is_valid = true;
		Block previous_block = Blockchain.getLatestBlock();

		if (previous_block.getIndex() != new_block.getIndex() - 1)
			is_valid = false;

		else if (!previous_block.getHash().equals(new_block.getPrevious_hash()))
			is_valid = false;

		else
			is_valid = PoW.validate(new_block.getHash());

		return is_valid;
	}
}
