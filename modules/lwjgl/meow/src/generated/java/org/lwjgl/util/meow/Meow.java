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

public class Meow {

    static { LibMeow.initialize(); }

    public static final int MEOW_HASH_VERSION = 4;

    public static final String MEOW_HASH_VERSION_NAME = "0.4/himalayan";

    protected Meow() {
        throw new UnsupportedOperationException();
    }

    // --- [ MeowU64From ] ---

    /** {@code meow_u64 MeowU64From(meow_hash Hash)} */
    public static native long nMeowU64From(long Hash);

    /** {@code meow_u64 MeowU64From(meow_hash Hash)} */
    @NativeType("meow_u64")
    public static long MeowU64From(@NativeType("meow_hash") MeowHash Hash) {
        return nMeowU64From(Hash.address());
    }

    // --- [ MeowU32From ] ---

    /** {@code meow_u32 MeowU32From(meow_hash Hash)} */
    public static native int nMeowU32From(long Hash);

    /** {@code meow_u32 MeowU32From(meow_hash Hash)} */
    @NativeType("meow_u32")
    public static int MeowU32From(@NativeType("meow_hash") MeowHash Hash) {
        return nMeowU32From(Hash.address());
    }

    // --- [ MeowHashesAreEqual ] ---

    /** {@code int MeowHashesAreEqual(meow_hash A, meow_hash B)} */
    public static native int nMeowHashesAreEqual(long A, long B);

    /** {@code int MeowHashesAreEqual(meow_hash A, meow_hash B)} */
    @NativeType("int")
    public static boolean MeowHashesAreEqual(@NativeType("meow_hash") MeowHash A, @NativeType("meow_hash") MeowHash B) {
        return nMeowHashesAreEqual(A.address(), B.address()) != 0;
    }

    // --- [ MeowHash_Accelerated ] ---

    /** {@code meow_hash MeowHash_Accelerated(meow_u64 Seed, meow_u64 TotalLengthInBytes, void * SourceInit)} */
    public static native void nMeowHash_Accelerated(long Seed, long TotalLengthInBytes, long SourceInit, long __result);

    /** {@code meow_hash MeowHash_Accelerated(meow_u64 Seed, meow_u64 TotalLengthInBytes, void * SourceInit)} */
    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") ByteBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, SourceInit.remaining(), memAddress(SourceInit), __result.address());
        return __result;
    }

    /** {@code meow_hash MeowHash_Accelerated(meow_u64 Seed, meow_u64 TotalLengthInBytes, void * SourceInit)} */
    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") ShortBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 1, memAddress(SourceInit), __result.address());
        return __result;
    }

    /** {@code meow_hash MeowHash_Accelerated(meow_u64 Seed, meow_u64 TotalLengthInBytes, void * SourceInit)} */
    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") IntBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 2, memAddress(SourceInit), __result.address());
        return __result;
    }

    /** {@code meow_hash MeowHash_Accelerated(meow_u64 Seed, meow_u64 TotalLengthInBytes, void * SourceInit)} */
    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") LongBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 3, memAddress(SourceInit), __result.address());
        return __result;
    }

    /** {@code meow_hash MeowHash_Accelerated(meow_u64 Seed, meow_u64 TotalLengthInBytes, void * SourceInit)} */
    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") FloatBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 2, memAddress(SourceInit), __result.address());
        return __result;
    }

    /** {@code meow_hash MeowHash_Accelerated(meow_u64 Seed, meow_u64 TotalLengthInBytes, void * SourceInit)} */
    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") DoubleBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 3, memAddress(SourceInit), __result.address());
        return __result;
    }

    /** {@code meow_hash MeowHash_Accelerated(meow_u64 Seed, meow_u64 TotalLengthInBytes, void * SourceInit)} */
    @NativeType("meow_hash")
    public static MeowHash MeowHash_Accelerated(@NativeType("meow_u64") long Seed, @NativeType("void *") PointerBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_Accelerated(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << POINTER_SHIFT, memAddress(SourceInit), __result.address());
        return __result;
    }

    // --- [ MeowHashBegin ] ---

    /** {@code void MeowHashBegin(meow_hash_state * State)} */
    public static native void nMeowHashBegin(long State);

    /** {@code void MeowHashBegin(meow_hash_state * State)} */
    public static void MeowHashBegin(@NativeType("meow_hash_state *") MeowHashState State) {
        nMeowHashBegin(State.address());
    }

    // --- [ MeowHashAbsorb ] ---

    /** {@code void MeowHashAbsorb(meow_hash_state * State, meow_u64 Len, void * SourceInit)} */
    public static native void nMeowHashAbsorb(long State, long Len, long SourceInit);

    /** {@code void MeowHashAbsorb(meow_hash_state * State, meow_u64 Len, void * SourceInit)} */
    public static void MeowHashAbsorb(@NativeType("meow_hash_state *") MeowHashState State, @NativeType("void *") ByteBuffer SourceInit) {
        nMeowHashAbsorb(State.address(), SourceInit.remaining(), memAddress(SourceInit));
    }

    // --- [ MeowHashEnd ] ---

    /** {@code meow_hash MeowHashEnd(meow_hash_state * State, meow_u64 Seed)} */
    public static native void nMeowHashEnd(long State, long Seed, long __result);

    /** {@code meow_hash MeowHashEnd(meow_hash_state * State, meow_u64 Seed)} */
    @NativeType("meow_hash")
    public static MeowHash MeowHashEnd(@NativeType("meow_hash_state *") MeowHashState State, @NativeType("meow_u64") long Seed, @NativeType("meow_hash") MeowHash __result) {
        nMeowHashEnd(State.address(), Seed, __result.address());
        return __result;
    }

}