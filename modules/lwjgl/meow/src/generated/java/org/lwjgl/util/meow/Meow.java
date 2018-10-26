/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meow;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to <a target="_blank" href="https://github.com/cmuratori/meow_hash">Meow hash</a>, an extremely fast non-cryptographic hash.
 * 
 * <p>Q: What is it?<br>
 * A: Meow is a 128-bit non-cryptographic hash that operates at high speeds on x64 processors.  It is designed to be truncatable to 256, 128, 64, and
 * 32-bit hash values and still retain good collision resistance.</p>
 * 
 * <p>Q: What is it GOOD for?<br>
 * A: Quickly hashing large amounts of data for comparison purposes such as block deduplication or file verification.  As of its publication in October of
 * 2018, it was the fastest hash in the smhasher suite by a factor of 3, but it still passes all smhasher tests and has not yet produced any spurious
 * collisions in practical deployment as compared to a baseline of SHA-1.  It is also designed to get faster with age: it already contains 256-wide and
 * 512-wide hash-equivalent versions that can be enabled for potentially 4x faster performance on future VAES x64 chips when they are available.</p>
 * 
 * <p>Q: What is it BAD for?<br>
 * A: Anything security-related.  It is not designed for security and has not be analyzed for security.  It should be assumed that it offers no security
 * whatsoever.  It is also not designed for small input sizes, so although it _can_ hash 1 byte, 4 bytes, 32 bytes, etc., it will end up wasting a lot of
 * time on padding since its minimum block size is 256 bytes.  Generally speaking, if you're not usually hashing a kilobyte or more, this is probably not
 * the hash you're looking for.</p>
 * 
 * <p>Q: Who wrote it and why?<br>
 * A: It was written by <a href="https://caseymuratori.com">Casey Muratori</a> for use in processing large-footprint assets for the game
 * <a href="https://molly1935.com">1935</a>.  The original system used an SHA-1 hash (which is not designed for speed), and so to eliminate hashing
 * bottlenecks in the pipeline, the Meow hash was designed to produce equivalent quality 256-bit hash values as a drop-in replacement that would take a
 * fraction of the CPU time.</p>
 * 
 * <p>Q: Why is it called the "Meow hash"?<br>
 * A: It was created while <a href="https://meowtheinfinite.com">Meow the Infinite</a> was in development at Molly Rocket, so there were lots of Meow the
 * Infinite drawings happening at that time.</p>
 * 
 * <p>Q: How does it work?<br>
 * A: It was designed to be the fastest possible hash that produces collision-free hash values in practice and passes standard hash quality checks.  It
 * uses the built-in AES acceleration provided by modern CPUs and computes sixteen hash streams in parallel to avoid serial dependency stalls.  The
 * sixteen separate hash results are then hashed themselves to produce the final hash value.  While only four hash streams would suffice for maximum
 * performance on today's machines, hypothetical future chips will likely want sixteen. Meow was designed to be future-proof by using sixteen streams up
 * front, so in the 2020 time frame when such chips start appearing, wider execution of Meow can be enabled without needing to change any persistent hash
 * values stored in codebases, databases, etc.</p>
 */
public class Meow {

    public static final int MEOW_HASH_VERSION = 2;

    public static final String MEOW_HASH_VERSION_NAME = "0.2/Ragdoll";

    public static final int
        MEOW_HASH_ALIGNMENT        = 128,
        MEOW_HASH_MACROBLOCK_COUNT = 4096,
        MEOW_HASH_BLOCK_SIZE_SHIFT = 8,
        MEOW_HASH_MACROBLOCK_SIZE  = (MEOW_HASH_MACROBLOCK_COUNT << MEOW_HASH_BLOCK_SIZE_SHIFT);

    static { Library.loadSystem(System::load, System::loadLibrary, Meow.class, Platform.mapLibraryNameBundled("lwjgl_meow")); }

    protected Meow() {
        throw new UnsupportedOperationException();
    }

    // --- [ MeowHash1 ] ---

    public static native void nMeowHash1(long Seed, long TotalLengthInBytes, long SourceInit, long __result);

    @NativeType("meow_hash")
    public static MeowHash MeowHash1(@NativeType("meow_u64") long Seed, @NativeType("void *") ByteBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash1(Seed, SourceInit.remaining(), memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash1(@NativeType("meow_u64") long Seed, @NativeType("void *") ShortBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash1(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 1, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash1(@NativeType("meow_u64") long Seed, @NativeType("void *") IntBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash1(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 2, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash1(@NativeType("meow_u64") long Seed, @NativeType("void *") LongBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash1(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 3, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash1(@NativeType("meow_u64") long Seed, @NativeType("void *") FloatBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash1(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 2, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash1(@NativeType("meow_u64") long Seed, @NativeType("void *") DoubleBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash1(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 3, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash1(@NativeType("meow_u64") long Seed, @NativeType("void *") PointerBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash1(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << POINTER_SHIFT, memAddress(SourceInit), __result.address());
        return __result;
    }

    // --- [ MeowHashesAreEqual ] ---

    public static native int nMeowHashesAreEqual(long A, long B);

    @NativeType("int")
    public static boolean MeowHashesAreEqual(@NativeType("meow_hash") MeowHash A, @NativeType("meow_hash") MeowHash B) {
        return nMeowHashesAreEqual(A.address(), B.address()) != 0;
    }

    // --- [ MeowSourceBlocksFor ] ---

    public static native void nMeowSourceBlocksFor(long TotalLengthInBytes, long Source, long __result);

    @NativeType("meow_source_blocks")
    public static MeowSourceBlocks MeowSourceBlocksFor(@NativeType("void *") ByteBuffer Source, @NativeType("meow_source_blocks") MeowSourceBlocks __result) {
        nMeowSourceBlocksFor(Source.remaining(), memAddress(Source), __result.address());
        return __result;
    }

    @NativeType("meow_source_blocks")
    public static MeowSourceBlocks MeowSourceBlocksFor(@NativeType("void *") ShortBuffer Source, @NativeType("meow_source_blocks") MeowSourceBlocks __result) {
        nMeowSourceBlocksFor(Integer.toUnsignedLong(Source.remaining()) << 1, memAddress(Source), __result.address());
        return __result;
    }

    @NativeType("meow_source_blocks")
    public static MeowSourceBlocks MeowSourceBlocksFor(@NativeType("void *") IntBuffer Source, @NativeType("meow_source_blocks") MeowSourceBlocks __result) {
        nMeowSourceBlocksFor(Integer.toUnsignedLong(Source.remaining()) << 2, memAddress(Source), __result.address());
        return __result;
    }

    @NativeType("meow_source_blocks")
    public static MeowSourceBlocks MeowSourceBlocksFor(@NativeType("void *") LongBuffer Source, @NativeType("meow_source_blocks") MeowSourceBlocks __result) {
        nMeowSourceBlocksFor(Integer.toUnsignedLong(Source.remaining()) << 3, memAddress(Source), __result.address());
        return __result;
    }

    @NativeType("meow_source_blocks")
    public static MeowSourceBlocks MeowSourceBlocksFor(@NativeType("void *") FloatBuffer Source, @NativeType("meow_source_blocks") MeowSourceBlocks __result) {
        nMeowSourceBlocksFor(Integer.toUnsignedLong(Source.remaining()) << 2, memAddress(Source), __result.address());
        return __result;
    }

    @NativeType("meow_source_blocks")
    public static MeowSourceBlocks MeowSourceBlocksFor(@NativeType("void *") DoubleBuffer Source, @NativeType("meow_source_blocks") MeowSourceBlocks __result) {
        nMeowSourceBlocksFor(Integer.toUnsignedLong(Source.remaining()) << 3, memAddress(Source), __result.address());
        return __result;
    }

    @NativeType("meow_source_blocks")
    public static MeowSourceBlocks MeowSourceBlocksFor(@NativeType("void *") PointerBuffer Source, @NativeType("meow_source_blocks") MeowSourceBlocks __result) {
        nMeowSourceBlocksFor(Integer.toUnsignedLong(Source.remaining()) << POINTER_SHIFT, memAddress(Source), __result.address());
        return __result;
    }

    // --- [ MeowGetMacroblock ] ---

    public static native void nMeowGetMacroblock(long Blocks, long Index, long __result);

    @NativeType("meow_macroblock")
    public static MeowMacroblock MeowGetMacroblock(@NativeType("meow_source_blocks *") MeowSourceBlocks Blocks, @NativeType("meow_u64") long Index, @NativeType("meow_macroblock") MeowMacroblock __result) {
        nMeowGetMacroblock(Blocks.address(), Index, __result.address());
        return __result;
    }

    // --- [ MeowHashMerge ] ---

    public static native void nMeowHashMerge(long A, long B);

    public static void MeowHashMerge(@NativeType("meow_macroblock_result *") MeowMacroblockResult A, @NativeType("meow_macroblock_result *") MeowMacroblockResult B) {
        nMeowHashMerge(A.address(), B.address());
    }

    // --- [ MeowHashFinish ] ---

    public static native void nMeowHashFinish(long State, long Seed, long TotalLengthInBytes, int Overhang, long OverhangStart, long __result);

    @NativeType("meow_hash")
    public static MeowHash MeowHashFinish(@NativeType("meow_macroblock_result *") MeowMacroblockResult State, @NativeType("meow_u64") long Seed, @NativeType("meow_u64") long TotalLengthInBytes, int Overhang, @NativeType("meow_u8 *") long OverhangStart, @NativeType("meow_hash") MeowHash __result) {
        if (CHECKS) {
            check(OverhangStart);
        }
        nMeowHashFinish(State.address(), Seed, TotalLengthInBytes, Overhang, OverhangStart, __result.address());
        return __result;
    }

    // --- [ MeowHashMergeArray ] ---

    public static native void nMeowHashMergeArray(long MacroBlockCount, long MacroBlockHashes, long __result);

    @NativeType("meow_macroblock_result")
    public static MeowMacroblockResult MeowHashMergeArray(@NativeType("meow_macroblock_result *") MeowMacroblockResult.Buffer MacroBlockHashes, @NativeType("meow_macroblock_result") MeowMacroblockResult __result) {
        nMeowHashMergeArray(MacroBlockHashes.remaining(), MacroBlockHashes.address(), __result.address());
        return __result;
    }

    // --- [ MeowHash1Op ] ---

    public static native void nMeowHash1Op(int BlockCount, long Source, long __result);

    @NativeType("meow_macroblock_result")
    public static MeowMacroblockResult MeowHash1Op(int BlockCount, @NativeType("meow_u8 *") long Source, @NativeType("meow_macroblock_result") MeowMacroblockResult __result) {
        if (CHECKS) {
            check(Source);
        }
        nMeowHash1Op(BlockCount, Source, __result.address());
        return __result;
    }

}