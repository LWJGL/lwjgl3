/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTBulletFile {

    protected BTBulletFile() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            bParse_btBulletFile_new                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_new"),
            bParse_btBulletFile_new2                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_new2"),
            bParse_btBulletFile_new3                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_new3"),
            bParse_btBulletFile_addDataBlock         = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_addDataBlock"),
            bParse_btBulletFile_addStruct            = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_addStruct"),
            bParse_btBulletFile_getBvhs              = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_getBvhs"),
            bParse_btBulletFile_getCollisionObjects  = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_getCollisionObjects"),
            bParse_btBulletFile_getCollisionShapes   = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_getCollisionShapes"),
            bParse_btBulletFile_getConstraints       = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_getConstraints"),
            bParse_btBulletFile_getDataBlocks        = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_getDataBlocks"),
            bParse_btBulletFile_getDynamicsWorldInfo = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_getDynamicsWorldInfo"),
            bParse_btBulletFile_getMultiBodies       = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_getMultiBodies"),
            bParse_btBulletFile_getRigidBodies       = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_getRigidBodies"),
            bParse_btBulletFile_getSoftBodies        = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_getSoftBodies"),
            bParse_btBulletFile_getTriangleInfoMaps  = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_getTriangleInfoMaps"),
            bParse_btBulletFile_parse                = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_parse"),
            bParse_btBulletFile_parseData            = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_parseData"),
            bParse_btBulletFile_write                = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_write"),
            bParse_btBulletFile_write2               = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_write2"),
            bParse_btBulletFile_delete               = apiGetFunctionAddress(LibBullet.getLibrary(), "btbParse_btBulletFile_delete");

    }

    // --- [ btbParse_btBulletFile_new ] ---

    @NativeType("void *")
    public static long btbParse_btBulletFile_new() {
        long __functionAddress = Functions.bParse_btBulletFile_new;
        return invokeP(__functionAddress);
    }

    // --- [ btbParse_btBulletFile_new2 ] ---

    public static long nbtbParse_btBulletFile_new2(long fileName) {
        long __functionAddress = Functions.bParse_btBulletFile_new2;
        return invokePP(fileName, __functionAddress);
    }

    @NativeType("void *")
    public static long btbParse_btBulletFile_new2(@NativeType("char const *") ByteBuffer fileName) {
        if (CHECKS) {
            checkNT1(fileName);
        }
        return nbtbParse_btBulletFile_new2(memAddress(fileName));
    }

    @NativeType("void *")
    public static long btbParse_btBulletFile_new2(@NativeType("char const *") CharSequence fileName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nbtbParse_btBulletFile_new2(fileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btbParse_btBulletFile_new3 ] ---

    public static long nbtbParse_btBulletFile_new3(long memoryBuffer, int len) {
        long __functionAddress = Functions.bParse_btBulletFile_new3;
        return invokePP(memoryBuffer, len, __functionAddress);
    }

    @NativeType("void *")
    public static long btbParse_btBulletFile_new3(@NativeType("char *") ByteBuffer memoryBuffer) {
        return nbtbParse_btBulletFile_new3(memAddress(memoryBuffer), memoryBuffer.remaining());
    }

    // --- [ btbParse_btBulletFile_addDataBlock ] ---

    public static void nbtbParse_btBulletFile_addDataBlock(long obj, long dataBlock) {
        long __functionAddress = Functions.bParse_btBulletFile_addDataBlock;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, dataBlock, __functionAddress);
    }

    public static void btbParse_btBulletFile_addDataBlock(@NativeType("void *") long obj, @NativeType("char *") ByteBuffer dataBlock) {
        nbtbParse_btBulletFile_addDataBlock(obj, memAddress(dataBlock));
    }

    // --- [ btbParse_btBulletFile_addStruct ] ---

    public static void nbtbParse_btBulletFile_addStruct(long obj, long structType, long data, int len, long oldPtr, int code) {
        long __functionAddress = Functions.bParse_btBulletFile_addStruct;
        if (CHECKS) {
            check(obj);
            check(data);
            check(oldPtr);
        }
        invokePPPPV(obj, structType, data, len, oldPtr, code, __functionAddress);
    }

    public static void btbParse_btBulletFile_addStruct(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer structType, @NativeType("void *") long data, int len, @NativeType("void *") long oldPtr, int code) {
        if (CHECKS) {
            checkNT1(structType);
        }
        nbtbParse_btBulletFile_addStruct(obj, memAddress(structType), data, len, oldPtr, code);
    }

    public static void btbParse_btBulletFile_addStruct(@NativeType("void *") long obj, @NativeType("char const *") CharSequence structType, @NativeType("void *") long data, int len, @NativeType("void *") long oldPtr, int code) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(structType, true);
            long structTypeEncoded = stack.getPointerAddress();
            nbtbParse_btBulletFile_addStruct(obj, structTypeEncoded, data, len, oldPtr, code);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btbParse_btBulletFile_getBvhs ] ---

    @NativeType("void *")
    public static long btbParse_btBulletFile_getBvhs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_getBvhs;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_getCollisionObjects ] ---

    @NativeType("void *")
    public static long btbParse_btBulletFile_getCollisionObjects(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_getCollisionObjects;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_getCollisionShapes ] ---

    @NativeType("void *")
    public static long btbParse_btBulletFile_getCollisionShapes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_getCollisionShapes;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_getConstraints ] ---

    @NativeType("void *")
    public static long btbParse_btBulletFile_getConstraints(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_getConstraints;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_getDataBlocks ] ---

    @NativeType("void *")
    public static long btbParse_btBulletFile_getDataBlocks(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_getDataBlocks;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_getDynamicsWorldInfo ] ---

    @NativeType("void *")
    public static long btbParse_btBulletFile_getDynamicsWorldInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_getDynamicsWorldInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_getMultiBodies ] ---

    @NativeType("void *")
    public static long btbParse_btBulletFile_getMultiBodies(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_getMultiBodies;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_getRigidBodies ] ---

    @NativeType("void *")
    public static long btbParse_btBulletFile_getRigidBodies(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_getRigidBodies;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_getSoftBodies ] ---

    @NativeType("void *")
    public static long btbParse_btBulletFile_getSoftBodies(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_getSoftBodies;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_getTriangleInfoMaps ] ---

    @NativeType("void *")
    public static long btbParse_btBulletFile_getTriangleInfoMaps(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_getTriangleInfoMaps;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_parse ] ---

    public static void btbParse_btBulletFile_parse(@NativeType("void *") long obj, int verboseMode) {
        long __functionAddress = Functions.bParse_btBulletFile_parse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, verboseMode, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_parseData ] ---

    public static void btbParse_btBulletFile_parseData(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_parseData;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btbParse_btBulletFile_write ] ---

    public static int nbtbParse_btBulletFile_write(long obj, long fileName) {
        long __functionAddress = Functions.bParse_btBulletFile_write;
        if (CHECKS) {
            check(obj);
        }
        return invokePPI(obj, fileName, __functionAddress);
    }

    public static int btbParse_btBulletFile_write(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer fileName) {
        if (CHECKS) {
            checkNT1(fileName);
        }
        return nbtbParse_btBulletFile_write(obj, memAddress(fileName));
    }

    public static int btbParse_btBulletFile_write(@NativeType("void *") long obj, @NativeType("char const *") CharSequence fileName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nbtbParse_btBulletFile_write(obj, fileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btbParse_btBulletFile_write2 ] ---

    public static int nbtbParse_btBulletFile_write2(long obj, long fileName, boolean fixupPointers) {
        long __functionAddress = Functions.bParse_btBulletFile_write2;
        if (CHECKS) {
            check(obj);
        }
        return invokePPI(obj, fileName, fixupPointers, __functionAddress);
    }

    public static int btbParse_btBulletFile_write2(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer fileName, @NativeType("bool") boolean fixupPointers) {
        if (CHECKS) {
            checkNT1(fileName);
        }
        return nbtbParse_btBulletFile_write2(obj, memAddress(fileName), fixupPointers);
    }

    public static int btbParse_btBulletFile_write2(@NativeType("void *") long obj, @NativeType("char const *") CharSequence fileName, @NativeType("bool") boolean fixupPointers) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nbtbParse_btBulletFile_write2(obj, fileNameEncoded, fixupPointers);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btbParse_btBulletFile_delete ] ---

    public static void btbParse_btBulletFile_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bParse_btBulletFile_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}