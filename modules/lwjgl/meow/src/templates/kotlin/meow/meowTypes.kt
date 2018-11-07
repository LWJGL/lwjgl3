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

    meow_u64.member("hi", "").private()
    meow_u64.member("lo", "").private()
}

val meow_hash = union(Module.MEOW, "MeowHash", nativeName = "meow_hash", mutable = false) {
    meow_u128.member("u128", "").private()
    meow_u64.member("u64", "")[2]
    meow_u32.member("u32", "")[4]
}

val meow_source_blocks = struct(Module.MEOW, "MeowSourceBlocks", nativeName = "meow_source_blocks", mutable = false) {
    AutoSize("Source")..meow_u64.member("TotalLengthInBytes", "")
    meow_u64.member("BlockCount", "")
    meow_u64.member("MacroblockCount", "")
    meow_u8.p.member("Source", "")
    meow_u8_opaque.member("OverhangStart", "")
    int.member("Overhang", "")
}

val meow_macroblock = struct(Module.MEOW, "MeowMacroblock", nativeName = "meow_macroblock", mutable = false) {
    meow_u8_opaque.member("Source", "")
    int.member("BlockCount", "")
}

val meow_macroblock_result = struct(Module.MEOW, "MeowMacroblockResult", nativeName = "meow_macroblock_result", mutable = false) {
    meow_u128.member("S0", "").private()
    meow_u128.member("S1", "").private()
    meow_u128.member("S2", "").private()
    meow_u128.member("S3", "").private()
    meow_u128.member("S4", "").private()
    meow_u128.member("S5", "").private()
    meow_u128.member("S6", "").private()
    meow_u128.member("S7", "").private()
    meow_u128.member("S8", "").private()
    meow_u128.member("S9", "").private()
    meow_u128.member("SA", "").private()
    meow_u128.member("SB", "").private()
    meow_u128.member("SC", "").private()
    meow_u128.member("SD", "").private()
    meow_u128.member("SE", "").private()
    meow_u128.member("SF", "").private()
}