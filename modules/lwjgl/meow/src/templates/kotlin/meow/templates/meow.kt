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

    documentation =
        """
        Native bindings to ${url("https://github.com/cmuratori/meow_hash", "Meow hash")}, an extremely fast non-cryptographic hash.

        Q: What is it?<br>
        A: Meow is a 128-bit non-cryptographic hash that operates at high speeds on x64 and ARM processors that provide AES instructions.  It is designed to be
        truncatable to 256, 128, 64, and 32-bit hash values and still retain good collision resistance.

        Q: What is it GOOD for?<br>
        A: Quickly hashing any amount of data for comparison purposes such as block deduplication or change detection.  It is extremely fast on all buffer
        sizes, from one byte to one gigabyte and up.

        Q: What is it BAD for?<br>
        A: Anything security-related.  It should be assumed that it provides no protection from adversaries whatsoever.  It is also not particularly fast on
        processors that don't support AES instructions (eg., non-x64/ARM processors).

        Q: Why is it called the "Meow hash"?<br>
        A: It is named after a character in <a href="https://meowtheinfinite.com">Meow the Infinite</a>.
        """

    IntConstant("", "HASH_VERSION".."4")

    StringConstant("", "HASH_VERSION_NAME".."0.4/himalayan")

    // meow_intrinsics.h

    Code(
        nativeCall = "${t}return (jlong)MeowU64From(*Hash, 0);"
    )..meow_u64(
        "U64From",
        "",

        meow_hash("Hash", "")
    )

    Code(
        nativeCall = "${t}return (jlong)MeowU32From(*Hash, 0);"
    )..meow_u32(
        "U32From",
        "",

        meow_hash("Hash", "")
    )

    intb(
        "HashesAreEqual",
        "",

        meow_hash("A", ""),
        meow_hash("B", "")
    )

    // meow_hash.h

    meow_hash(
        "Hash_Accelerated",
        "",

        meow_u64("Seed", ""),
        AutoSize("SourceInit")..meow_u64("TotalLengthInBytes", ""),
        MultiTypeAll..void.p("SourceInit", "")
    )

    // meow_more.h

    void(
        "HashBegin",
        "",

        meow_hash_state.p("State", "")
    )

    void(
        "HashAbsorb",
        "",

        meow_hash_state.p("State", ""),
        AutoSize("SourceInit")..meow_u64("Len", ""),
        void.p("SourceInit", "")
    )

    meow_hash(
        "HashEnd",
        "",

        meow_hash_state.p("State", ""),
        meow_u64("Seed", "")
    )
}

val meow_C = "MeowC".nativeClass(Module.MEOW, prefix = "MEOW", prefixMethod = "Meow") {
    nativeDirective("#define MEOW_INCLUDE_C 1", beforeIncludes = true)
    nativeImport(
        "meow_intrinsics.h",
        "meow_hash.h",
        "meow_more.h"
    )

    documentation = "Pure C implementation of Meow hash."

    meow_hash(
        "Hash_C",
        "",

        meow_u64("Seed", ""),
        AutoSize("SourceInit")..meow_u64("TotalLengthInBytes", ""),
        MultiTypeAll..void.p("SourceInit", "")
    )
}