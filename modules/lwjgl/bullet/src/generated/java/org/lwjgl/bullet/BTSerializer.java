/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTSerializer {

    protected BTSerializer() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Chunk_new                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_new"),
            Chunk_getChunkCode              = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_getChunkCode"),
            Chunk_getDna_nr                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_getDna_nr"),
            Chunk_getLength                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_getLength"),
            Chunk_getNumber                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_getNumber"),
            Chunk_getOldPtr                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_getOldPtr"),
            Chunk_setChunkCode              = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_setChunkCode"),
            Chunk_setDna_nr                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_setDna_nr"),
            Chunk_setLength                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_setLength"),
            Chunk_setNumber                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_setNumber"),
            Chunk_setOldPtr                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_setOldPtr"),
            Chunk_delete                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btChunk_delete"),
            SerializerWrapper_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSerializerWrapper_new"),
            Serializer_delete               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSerializer_delete"),
            DefaultSerializer_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultSerializer_new"),
            DefaultSerializer_new2          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultSerializer_new2"),
            DefaultSerializer_internalAlloc = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultSerializer_internalAlloc"),
            DefaultSerializer_writeHeader   = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultSerializer_writeHeader"),
            getBulletDNAstr                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btgetBulletDNAstr"),
            getBulletDNAlen                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btgetBulletDNAlen"),
            getBulletDNAstr64               = apiGetFunctionAddress(LibBullet.getLibrary(), "btgetBulletDNAstr64"),
            getBulletDNAlen64               = apiGetFunctionAddress(LibBullet.getLibrary(), "btgetBulletDNAlen64");

    }

    // --- [ btChunk_new ] ---

    @NativeType("void *")
    public static long btChunk_new() {
        long __functionAddress = Functions.Chunk_new;
        return invokeP(__functionAddress);
    }

    // --- [ btChunk_getChunkCode ] ---

    public static int btChunk_getChunkCode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Chunk_getChunkCode;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btChunk_getDna_nr ] ---

    public static int btChunk_getDna_nr(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Chunk_getDna_nr;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btChunk_getLength ] ---

    public static int btChunk_getLength(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Chunk_getLength;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btChunk_getNumber ] ---

    public static int btChunk_getNumber(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Chunk_getNumber;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btChunk_getOldPtr ] ---

    @NativeType("void *")
    public static long btChunk_getOldPtr(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Chunk_getOldPtr;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btChunk_setChunkCode ] ---

    public static void btChunk_setChunkCode(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Chunk_setChunkCode;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btChunk_setDna_nr ] ---

    public static void btChunk_setDna_nr(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Chunk_setDna_nr;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btChunk_setLength ] ---

    public static void btChunk_setLength(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Chunk_setLength;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btChunk_setNumber ] ---

    public static void btChunk_setNumber(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Chunk_setNumber;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btChunk_setOldPtr ] ---

    public static void btChunk_setOldPtr(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.Chunk_setOldPtr;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btChunk_delete ] ---

    public static void btChunk_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Chunk_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSerializerWrapper_new ] ---

    @NativeType("void *")
    public static long btSerializerWrapper_new(@NativeType("void *") long allocateCallback, @NativeType("void *") long finalizeChunkCallback, @NativeType("void *") long findNameForPointerCallback, @NativeType("void *") long findPointerCallback, @NativeType("void *") long finishSerializationCallback, @NativeType("void *") long getBufferPointerCallback, @NativeType("void *") long getChunkCallback, @NativeType("void *") long getCurrentBufferSizeCallback, @NativeType("void *") long getNumChunksCallback, @NativeType("void *") long getSerializationFlagsCallback, @NativeType("void *") long getUniquePointerCallback, @NativeType("void *") long registerNameForPointerCallback, @NativeType("void *") long serializeNameCallback, @NativeType("void *") long setSerializationFlagsCallback, @NativeType("void *") long startSerializationCallback) {
        long __functionAddress = Functions.SerializerWrapper_new;
        if (CHECKS) {
            check(allocateCallback);
            check(finalizeChunkCallback);
            check(findNameForPointerCallback);
            check(findPointerCallback);
            check(finishSerializationCallback);
            check(getBufferPointerCallback);
            check(getChunkCallback);
            check(getCurrentBufferSizeCallback);
            check(getNumChunksCallback);
            check(getSerializationFlagsCallback);
            check(getUniquePointerCallback);
            check(registerNameForPointerCallback);
            check(serializeNameCallback);
            check(setSerializationFlagsCallback);
            check(startSerializationCallback);
        }
        return invokePPPPPPPPPPPPPPPP(allocateCallback, finalizeChunkCallback, findNameForPointerCallback, findPointerCallback, finishSerializationCallback, getBufferPointerCallback, getChunkCallback, getCurrentBufferSizeCallback, getNumChunksCallback, getSerializationFlagsCallback, getUniquePointerCallback, registerNameForPointerCallback, serializeNameCallback, setSerializationFlagsCallback, startSerializationCallback, __functionAddress);
    }

    // --- [ btSerializer_delete ] ---

    public static void btSerializer_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Serializer_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDefaultSerializer_new ] ---

    @NativeType("void *")
    public static long btDefaultSerializer_new() {
        long __functionAddress = Functions.DefaultSerializer_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDefaultSerializer_new2 ] ---

    @NativeType("void *")
    public static long btDefaultSerializer_new2(int totalSize) {
        long __functionAddress = Functions.DefaultSerializer_new2;
        return invokeP(totalSize, __functionAddress);
    }

    // --- [ btDefaultSerializer_internalAlloc ] ---

    public static long nbtDefaultSerializer_internalAlloc(long obj, long size) {
        long __functionAddress = Functions.DefaultSerializer_internalAlloc;
        if (CHECKS) {
            check(obj);
        }
        return invokePPP(obj, size, __functionAddress);
    }

    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer btDefaultSerializer_internalAlloc(@NativeType("void *") long obj, @NativeType("size_t") long size) {
        long __result = nbtDefaultSerializer_internalAlloc(obj, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ btDefaultSerializer_writeHeader ] ---

    public static void nbtDefaultSerializer_writeHeader(long obj, long buffer) {
        long __functionAddress = Functions.DefaultSerializer_writeHeader;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, buffer, __functionAddress);
    }

    public static void btDefaultSerializer_writeHeader(@NativeType("void *") long obj, @NativeType("unsigned char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, 12);
        }
        nbtDefaultSerializer_writeHeader(obj, memAddress(buffer));
    }

    // --- [ btgetBulletDNAstr ] ---

    @NativeType("void *")
    public static long btgetBulletDNAstr() {
        long __functionAddress = Functions.getBulletDNAstr;
        return invokeP(__functionAddress);
    }

    // --- [ btgetBulletDNAlen ] ---

    public static int btgetBulletDNAlen() {
        long __functionAddress = Functions.getBulletDNAlen;
        return invokeI(__functionAddress);
    }

    // --- [ btgetBulletDNAstr64 ] ---

    @NativeType("void *")
    public static long btgetBulletDNAstr64() {
        long __functionAddress = Functions.getBulletDNAstr64;
        return invokeP(__functionAddress);
    }

    // --- [ btgetBulletDNAlen64 ] ---

    public static int btgetBulletDNAlen64() {
        long __functionAddress = Functions.getBulletDNAlen64;
        return invokeI(__functionAddress);
    }

}