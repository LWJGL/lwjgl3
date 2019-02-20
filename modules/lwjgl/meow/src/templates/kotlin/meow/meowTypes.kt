/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package meow

import org.lwjgl.generator.*

val meow_u8 = typedef(unsigned_char, "meow_u8")
val meow_u32 = typedef(unsigned_int, "meow_u32")
val meow_u64 = typedef(unsigned_long_long, "meow_u64")

val meow_u128 = struct(
    Module.MEOW,
    "MeowU128",
    nativeName = "meow_u128",
    mutable = false,
    nativeLayout = true
) {
    nativeImport("meow_intrinsics.h")
    alignas(16)
}

val meow_hash = union(Module.MEOW, "MeowHash", nativeName = "meow_hash", mutable = false) {
    meow_u128("u128", "")
    meow_u64("u64", "")[2]
    meow_u32("u32", "")[4]
}

val meow_hash_state = struct(
    Module.MEOW,
    "MeowHashState",
    nativeName = "meow_hash_state",
    mutable = false,
    nativeLayout = true
) {
    nativeImport(
        "meow_intrinsics.h",
        "meow_hash.h",
        "meow_more.h"
    )
}