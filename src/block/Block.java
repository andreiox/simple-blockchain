package block;

public class Block {

	private int index;
	private long timestamp;
	private String previous_hash;
	private String hash;
	private BlockData data;

	public Block(int index, String previous_hash, long timestamp, String hash, BlockData data) {
		this.index = index;
		this.timestamp = timestamp;
		this.previous_hash = previous_hash;
		this.hash = hash;
		this.data = data;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getPrevious_hash() {
		return previous_hash;
	}

	public void setPrevious_hash(String previous_hash) {
		this.previous_hash = previous_hash;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public BlockData getData() {
		return data;
	}

	public void setData(BlockData data) {
		this.data = data;
	}

}
