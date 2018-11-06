/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package meow

import org.lwjgl.generator.*

fun config() {
    packageInfo(Module.MEOW, "Contains bindings to ${url("https://github.com/cmuratori/meow_hash", "Meow hash")}, an extremely fast non-cryptographic hash.")
}

val meow_u8 = typedef(unsigned_char, "meow_u8")
val meow_u8_opaque = "meow_u8".opaque.p

val meow_u32 = typedef(unsigned_int, "meow_u32")
val meow_u64 = typedef(unsigned_long_long, "meow_u64")
val meow_u128 = struct(Module.MEOW, "MeowU128", nativeName = "meow_u128", mutable = false) {
    alignas(16)

    meow_u64("hi", "").private()
    meow_u64("lo", "").private()
}

val meow_hash = union(Module.MEOW, "MeowHash", nativeName = "meow_hash", mutable = false) {
    meow_u128("u128", "").private()
    meow_u64("u64", "")[2]
    meow_u32("u32", "")[4]
}

val meow_source_blocks = struct(Module.MEOW, "MeowSourceBlocks", nativeName = "meow_source_blocks", mutable = false) {
    AutoSize("Source")..meow_u64("TotalLengthInBytes", "")
    meow_u64("BlockCount", "")
    meow_u64("MacroblockCount", "")
    meow_u8.p("Source", "")
    meow_u8_opaque("OverhangStart", "")
    int("Overhang", "")
}

val meow_macroblock = struct(Module.MEOW, "MeowMacroblock", nativeName = "meow_macroblock", mutable = false) {
    meow_u8_opaque("Source", "")
    int("BlockCount", "")
}

val meow_macroblock_result = struct(Module.MEOW, "MeowMacroblockResult", nativeName = "meow_macroblock_result", mutable = false) {
    meow_u128("S0", "").private()
    meow_u128("S1", "").private()
    meow_u128("S2", "").private()
    meow_u128("S3", "").private()
    meow_u128("S4", "").private()
    meow_u128("S5", "").private()
    meow_u128("S6", "").private()
    meow_u128("S7", "").private()
    meow_u128("S8", "").private()
    meow_u128("S9", "").private()
    meow_u128("SA", "").private()
    meow_u128("SB", "").private()
    meow_u128("SC", "").private()
    meow_u128("SD", "").private()
    meow_u128("SE", "").private()
    meow_u128("SF", "").private()
}