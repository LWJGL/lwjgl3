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

/** Pure C implementation of Meow hash. */
public class MeowC {

    static { LibMeow.initialize(); }

    protected MeowC() {
        throw new UnsupportedOperationException();
    }

    // --- [ MeowHash_C ] ---

    public static native void nMeowHash_C(long Seed, long TotalLengthInBytes, long SourceInit, long __result);

    @NativeType("meow_hash")
    public static MeowHash MeowHash_C(@NativeType("meow_u64") long Seed, @NativeType("void *") ByteBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_C(Seed, SourceInit.remaining(), memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_C(@NativeType("meow_u64") long Seed, @NativeType("void *") ShortBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_C(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 1, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_C(@NativeType("meow_u64") long Seed, @NativeType("void *") IntBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_C(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 2, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_C(@NativeType("meow_u64") long Seed, @NativeType("void *") LongBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_C(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 3, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_C(@NativeType("meow_u64") long Seed, @NativeType("void *") FloatBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_C(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 2, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_C(@NativeType("meow_u64") long Seed, @NativeType("void *") DoubleBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_C(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << 3, memAddress(SourceInit), __result.address());
        return __result;
    }

    @NativeType("meow_hash")
    public static MeowHash MeowHash_C(@NativeType("meow_u64") long Seed, @NativeType("void *") PointerBuffer SourceInit, @NativeType("meow_hash") MeowHash __result) {
        nMeowHash_C(Seed, Integer.toUnsignedLong(SourceInit.remaining()) << POINTER_SHIFT, memAddress(SourceInit), __result.address());
        return __result;
    }

}