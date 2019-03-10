package com.alexvasilkov.telegram.chart.utils


object ChartMath {

    // This is a pre-computed zero-bits lookup table (maps a bit value mod 37 to its position)
    private val trailingZeroLookup = intArrayOf(
        32, 0, 1, 26, 2, 23, 27, 0, 3, 16, 24, 30, 28, 11, 0, 13, 4,
        7, 17, 0, 25, 22, 31, 15, 29, 10, 12, 6, 0, 21, 14, 9, 5,
        20, 8, 19, 18
    )

    /**
     * Counts trailing zeros at O(1).
     *
     * See https://graphics.stanford.edu/~seander/bithacks.html#ZerosOnRightModLookup
     */
    fun countTrailingZeroBits(x: Int): Int {
        return trailingZeroLookup[(-x and x) % 37]
    }

}
