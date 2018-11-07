/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package meow

import org.lwjgl.generator.*

const val MEOW_LIBRARY = "LibMeow.initialize();"

fun config() {
    packageInfo(Module.MEOW, "Contains bindings to ${url("https://github.com/cmuratori/meow_hash", "Meow hash")}, an extremely fast non-cryptographic hash.")

    Generator.registerLibraryInit(Module.MEOW, "LibMeow", "meow")
}

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
    static(MEOW_LIBRARY)
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
        "meow_hash.h"
    )
    static(MEOW_LIBRARY)
}