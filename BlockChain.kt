class BlockChain {

    val blocks: List<Block>
        get() = _blocks

    private val _blocks = mutableListOf<Block>()

    fun add(block: Block) = _blocks.add(block)

    fun isValid(): Boolean {

        if (_blocks.isEmpty() || _blocks.size == 1) return true

        for (i in _blocks.size - 1 downTo 1) {
            if (_blocks[i].previousHash != _blocks[i - 1].hash) return false
        }

        return true
    }
}