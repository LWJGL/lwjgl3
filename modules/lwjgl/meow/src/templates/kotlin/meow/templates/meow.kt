/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package meow.templates

import meow.*
import org.lwjgl.generator.*

val meow = "Meow".nativeClass(Module.MEOW, prefix = "MEOW", prefixMethod = "Meow", library = MEOW_LIBRARY) {
    nativeImport(
        "meow_intrinsics.h",
        "meow_hash.h"
    )

    documentation =
        """
        Native bindings to ${url("https://github.com/cmuratori/meow_hash", "Meow hash")}, an extremely fast non-cryptographic hash.

        Q: What is it?<br>
        A: Meow is a 128-bit non-cryptographic hash that operates at high speeds on x64 and ARM processors that provide AES instructions.  It is designed to be
        truncatable to 256, 128, 64, and 32-bit hash values and still retain good collision resistance.

        Q: What is it GOOD for?<br>
        A: Quickly hashing large amounts of data for comparison purposes such as block deduplication or or change detection.

        Q: What is it BAD for?<br>
        A: Anything security-related.  It should be assumed that it provides no protection from adversaries whatsoever.

        Q: Why is it called the "Meow hash"?<br>
        A: It is named after a character in <a href="https://meowtheinfinite.com">Meow the Infinite</a>.
        """

    IntConstant("", "HASH_VERSION".."3")

    StringConstant("", "HASH_VERSION_NAME".."0.3/snowshoe")

    IntConstant(
        "",

        "HASH_BLOCK_SIZE_SHIFT".."8"
    )

    meow_u64(
        "U64From",
        "",

        meow_u128("Hash", "")
    )

    meow_u32(
        "U32From",
        "",

        meow_u128("Hash", "")
    )

    intb(
        "HashesAreEqual",
        "",

        meow_u128("A", ""),
        meow_u128("B", "")
    )

    meow_u128(
        "Hash1",
        "",

        meow_u64("Seed", ""),
        AutoSize("SourceInit")..meow_u64("TotalLengthInBytes", ""),
        MultiTypeAll..void.p("SourceInit", "")
    )

    void(
        "HashBegin",
        "",

        meow_hash_state.p("State", "")
    )

    void(
        "HashAbsorb1",
        "",

        meow_hash_state.p("State", ""),
        AutoSize("SourceInit")..meow_u64("Len", ""),
        void.p("SourceInit", "")
    )

    meow_u128(
        "HashEnd",
        "",

        meow_hash_state.p("State", ""),
        meow_u64("Seed", "")
    )
}