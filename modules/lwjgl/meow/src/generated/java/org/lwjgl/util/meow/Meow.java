/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meow;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to <a target="_blank" href="https://github.com/cmuratori/meow_hash">Meow hash</a>, an extremely fast non-cryptographic hash.
 * 
 * <p>Q: What is it?<br>
 * A: Meow is a 128-bit non-cryptographic hash that operates at high speeds on x64 and ARM processors that provide AES instructions.  It is designed to be
 * truncatable to 256, 128, 64, and 32-bit hash values and still retain good collision resistance.</p>
 * 
 * <p>Q: What is it GOOD for?<br>
 * A: Quickly hashing any amount of data for comparison purposes such as block deduplication or change detection.  It is extremely fast on all buffer
 * sizes, from one byte to one gigabyte and up.</p>
 * 
 * <p>Q: What is it BAD for?<br>
 * A: Anything security-related.  It should be assumed that it provides no protection from adversaries whatsoever.  It is also not particularly fast on
 * processors that don't support AES instructions (eg., non-x64/ARM processors).</p>
 * 
 * <p>Q: Why is it called the "Meow hash"?<br>
 * A: It is named after a character in <a href="https://meowtheinfinite.com">Meow the Infinite</a>.</p>
 */
public class Meow {

    static { LibMeow.initialize(); }

    public static final int MEOW_HASH_VERSION = 4;

    public static final String MEOW_HASH_VERSION_NAME = "0.4/himalayan";

    protected Meow() {
        throw new UnsupportedOperationException();
    }

    // --- [ MeowU64From ] ---

    public static native long nMeowU64From(long Hash);

    @NativeType("meow_u64")
    public static long MeowU64From(@NativeType("meow_hash") MeowHash Hash) {
        return nMeowU64From(Hash.address());
    }

    // --- [ MeowU32From ] ---

    public static native int nMeowU32From(long Hash);

    @NativeType("meow_u32")
    public static int MeowU32From(@NativeType("meow_hash") MeowHash Hash) {
        return nMeowU32From(Hash.address());
    }

    // --- [ MeowHashesAreEqual ] ---

    public static native int nMeowHashesAreEqual(long A, long B);

    @NativeType("int")
    public static boolean MeowHashesAreEqual(@NativeType("meow_hash") MeowHash A, @NativeType("meow_hash") MeowHash B) {
        return nMeowHashesAreEqual(A.address(), B.address()) != 0;
    }

    // --- [ MeowHash_Accelerated ] ---

    public static native void nMeowHash_Accelerated(long Seed, long TotalLengthInBytes, long SourceInit, long __result);

    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") ByteBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, SourceInit.remaining(), memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") ShortBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 1, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") IntBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 2, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") LongBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 3, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") FloatBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 2, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") DoubleBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 3, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") PointerBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << POINTER_SHIFT, memAddress(SourceInit), __result.address());
        return __result;
    }

    // --- [ MeowHashBegin ] ---

    public static native void nMeowHashBegin(long State);

    public static void MeowHashBegin(@NativeType("meow_hash_state *") MeowHashState State) {
        nMeowHashBegin(State.address());
    }

    // --- [ MeowHashAbsorb ] ---

    public static native void nMeowHashAbsorb(long State, long Len, long SourceInit);

    public static void MeowHashAbsorb(@NativeType("meow_hash_state *") MeowHashState State, @NativeType("void *") ByteBuffer SourceInit) {
        nMeowHashAbsorb(State.address(), SourceInit.remaining(), memAddress(SourceInit));
    }

    // --- [ MeowHashEnd ] ---

    public static native void nMeowHashEnd(long State, long Seed, long __result);

    @NativeType("meow_hash")
    public static MeowHash MeowHashEnd(@NativeType("meow_hash_state *") MeowHashState State, @NativeType("meow_u64") long Seed, @NativeType("meow_hash") MeowHash __result) {
        nMeowHashEnd(State.address(), Seed, __result.address());
        return __result;
    }

}