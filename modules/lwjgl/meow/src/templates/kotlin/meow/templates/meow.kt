/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package meow.templates

import meow.*
import org.lwjgl.generator.*

val meow = "Meow".nativeClass(Module.MEOW, library = "lwjgl_meow") {
    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    #include <intrin.h>
#else
    #include <x86intrin.h>
#endif
#include "meow_hash.h""""
    )

    documentation =
        """
        Native bindings to ${url("https://github.com/cmuratori/meow_hash", "Meow hash")}, an extremely fast non-cryptographic hash.

        Q: What is it?<br>
        A: Meow is a 128-bit non-cryptographic hash that operates at high speeds on x64 processors.  It is designed to be truncatable to 256, 128, 64, and
        32-bit hash values and still retain good collision resistance.

        Q: What is it GOOD for?<br>
        A: Quickly hashing large amounts of data for comparison purposes such as block deduplication or file verification.  As of its publication in October of
        2018, it was the fastest hash in the smhasher suite by a factor of 3, but it still passes all smhasher tests and has not yet produced any spurious
        collisions in practical deployment as compared to a baseline of SHA-1.  It is also designed to get faster with age: it already contains 256-wide and
        512-wide hash-equivalent versions that can be enabled for potentially 4x faster performance on future VAES x64 chips when they are available.

        Q: What is it BAD for?<br>
        A: Anything security-related.  It is not designed for security and has not be analyzed for security.  It should be assumed that it offers no security
        whatsoever.  It is also not designed for small input sizes, so although it _can_ hash 1 byte, 4 bytes, 32 bytes, etc., it will end up wasting a lot of
        time on padding since its minimum block size is 256 bytes.  Generally speaking, if you're not usually hashing a kilobyte or more, this is probably not
        the hash you're looking for.

        Q: Who wrote it and why?<br>
        A: It was written by <a href="https://caseymuratori.com">Casey Muratori</a> for use in processing large-footprint assets for the game
        <a href="https://molly1935.com">1935</a>.  The original system used an SHA-1 hash (which is not designed for speed), and so to eliminate hashing
        bottlenecks in the pipeline, the Meow hash was designed to produce equivalent quality 256-bit hash values as a drop-in replacement that would take a
        fraction of the CPU time.

        Q: Why is it called the "Meow hash"?<br>
        A: It was created while <a href="https://meowtheinfinite.com">Meow the Infinite</a> was in development at Molly Rocket, so there were lots of Meow the
        Infinite drawings happening at that time.

        Q: How does it work?<br>
        A: It was designed to be the fastest possible hash that produces collision-free hash values in practice and passes standard hash quality checks.  It
        uses the built-in AES acceleration provided by modern CPUs and computes sixteen hash streams in parallel to avoid serial dependency stalls.  The
        sixteen separate hash results are then hashed themselves to produce the final hash value.  While only four hash streams would suffice for maximum
        performance on today's machines, hypothetical future chips will likely want sixteen. Meow was designed to be future-proof by using sixteen streams up
        front, so in the 2020 time frame when such chips start appearing, wider execution of Meow can be enabled without needing to change any persistent hash
        values stored in codebases, databases, etc.
        """

    IntConstant("", "MEOW_HASH_VERSION".."2")

    StringConstant("", "MEOW_HASH_VERSION_NAME".."0.2/Ragdoll")

    IntConstant(
        "",

        "MEOW_HASH_ALIGNMENT".."128",
        "MEOW_HASH_MACROBLOCK_COUNT".."4096",
        "MEOW_HASH_BLOCK_SIZE_SHIFT".."8",
        "MEOW_HASH_MACROBLOCK_SIZE".."(MEOW_HASH_MACROBLOCK_COUNT << MEOW_HASH_BLOCK_SIZE_SHIFT)"
    )

    meow_hash(
        "MeowHash1",
        "",

        meow_u64.IN("Seed", ""),
        AutoSize("SourceInit")..meow_u64.IN("TotalLengthInBytes", ""),
        MultiTypeAll..void.p.IN("SourceInit", "")
    )

    intb(
        "MeowHashesAreEqual",
        "",

        meow_hash.IN("A", ""),
        meow_hash.IN("B", "")
    )

    meow_source_blocks(
        "MeowSourceBlocksFor",
        "",

        AutoSize("Source")..meow_u64.IN("TotalLengthInBytes", ""),
        MultiTypeAll..void.p.IN("Source", "")
    )

    meow_macroblock(
        "MeowGetMacroblock",
        "",

        meow_source_blocks/*.volatile*/.p.IN("Blocks", ""),
        meow_u64.IN("Index", "")
    )

    void(
        "MeowHashMerge",
        "",

        meow_macroblock_result.p.IN("A", ""),
        meow_macroblock_result.p.IN("B", "")
    )

    meow_hash(
        "MeowHashFinish",
        "",

        meow_macroblock_result.p.IN("State", ""),
        meow_u64.IN("Seed", ""),
        meow_u64.IN("TotalLengthInBytes", ""),
        int.IN("Overhang", ""),
        meow_u8_opaque.IN("OverhangStart", "")
    )

    meow_macroblock_result(
        "MeowHashMergeArray",
        "",

        AutoSize("MacroBlockHashes")..meow_u64.IN("MacroBlockCount", ""),
        meow_macroblock_result.p.IN("MacroBlockHashes", "")
    )

    meow_macroblock_result(
        "MeowHash1Op",
        "",

        int.IN("BlockCount", ""),
        meow_u8_opaque.IN("Source", "")
    )
}