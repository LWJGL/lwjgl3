/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package meow.templates

import meow.*
import org.lwjgl.generator.*

val meow = "Meow".nativeClass(Module.MEOW, prefix = "MEOW", prefixMethod = "Meow") {
    nativeImport(
        "meow_intrinsics.h",
        "meow_hash.h",
        "meow_more.h"
    )

    IntConstant("HASH_VERSION".."4")

    StringConstant("HASH_VERSION_NAME".."0.4/himalayan")

    // meow_intrinsics.h

    Code(
        nativeCall = "${t}return (jlong)MeowU64From(*Hash, 0);"
    )..meow_u64(
        "U64From",

        meow_hash("Hash")
    )

    Code(
        nativeCall = "${t}return (jlong)MeowU32From(*Hash, 0);"
    )..meow_u32(
        "U32From",

        meow_hash("Hash")
    )

    intb(
        "HashesAreEqual",

        meow_hash("A"),
        meow_hash("B")
    )

    // meow_hash.h

    meow_hash(
        "Hash_Accelerated",

        meow_u64("Seed"),
        AutoSize("SourceInit")..meow_u64("TotalLengthInBytes"),
        MultiTypeAll..void.p("SourceInit")
    )

    // meow_more.h

    void(
        "HashBegin",

        meow_hash_state.p("State")
    )

    void(
        "HashAbsorb",

        meow_hash_state.p("State"),
        AutoSize("SourceInit")..meow_u64("Len"),
        void.p("SourceInit")
    )

    meow_hash(
        "HashEnd",

        meow_hash_state.p("State"),
        meow_u64("Seed")
    )
}

val meow_C = "MeowC".nativeClass(Module.MEOW, prefix = "MEOW", prefixMethod = "Meow") {
    nativeDirective("#define MEOW_INCLUDE_C 1", beforeIncludes = true)
    nativeImport(
        "meow_intrinsics.h",
        "meow_hash.h",
        "meow_more.h"
    )

    meow_hash(
        "Hash_C",

        meow_u64("Seed"),
        AutoSize("SourceInit")..meow_u64("TotalLengthInBytes"),
        MultiTypeAll..void.p("SourceInit")
    )
}