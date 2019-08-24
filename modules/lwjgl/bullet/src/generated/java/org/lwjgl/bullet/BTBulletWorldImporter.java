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

public class BTBulletWorldImporter {

    protected BTBulletWorldImporter() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            BulletWorldImporter_new                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBulletWorldImporter_new"),
            BulletWorldImporter_new2                = apiGetFunctionAddress(LibBullet.getLibrary(), "btBulletWorldImporter_new2"),
            BulletWorldImporter_convertAllObjects   = apiGetFunctionAddress(LibBullet.getLibrary(), "btBulletWorldImporter_convertAllObjects"),
            BulletWorldImporter_loadFile            = apiGetFunctionAddress(LibBullet.getLibrary(), "btBulletWorldImporter_loadFile"),
            BulletWorldImporter_loadFile2           = apiGetFunctionAddress(LibBullet.getLibrary(), "btBulletWorldImporter_loadFile2"),
            BulletWorldImporter_loadFileFromMemory  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBulletWorldImporter_loadFileFromMemory"),
            BulletWorldImporter_loadFileFromMemory2 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBulletWorldImporter_loadFileFromMemory2");

    }

    // --- [ btBulletWorldImporter_new ] ---

    @NativeType("void *")
    public static long btBulletWorldImporter_new() {
        long __functionAddress = Functions.BulletWorldImporter_new;
        return invokeP(__functionAddress);
    }

    // --- [ btBulletWorldImporter_new2 ] ---

    @NativeType("void *")
    public static long btBulletWorldImporter_new2(@NativeType("void *") long world) {
        long __functionAddress = Functions.BulletWorldImporter_new2;
        if (CHECKS) {
            check(world);
        }
        return invokePP(world, __functionAddress);
    }

    // --- [ btBulletWorldImporter_convertAllObjects ] ---

    @NativeType("bool")
    public static boolean btBulletWorldImporter_convertAllObjects(@NativeType("void *") long obj, @NativeType("void *") long file) {
        long __functionAddress = Functions.BulletWorldImporter_convertAllObjects;
        if (CHECKS) {
            check(obj);
            check(file);
        }
        return invokePPZ(obj, file, __functionAddress);
    }

    // --- [ btBulletWorldImporter_loadFile ] ---

    public static boolean nbtBulletWorldImporter_loadFile(long obj, long fileName) {
        long __functionAddress = Functions.BulletWorldImporter_loadFile;
        if (CHECKS) {
            check(obj);
        }
        return invokePPZ(obj, fileName, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btBulletWorldImporter_loadFile(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer fileName) {
        if (CHECKS) {
            checkNT1(fileName);
        }
        return nbtBulletWorldImporter_loadFile(obj, memAddress(fileName));
    }

    @NativeType("bool")
    public static boolean btBulletWorldImporter_loadFile(@NativeType("void *") long obj, @NativeType("char const *") CharSequence fileName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nbtBulletWorldImporter_loadFile(obj, fileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btBulletWorldImporter_loadFile2 ] ---

    public static boolean nbtBulletWorldImporter_loadFile2(long obj, long fileName, long preSwapFilenameOut) {
        long __functionAddress = Functions.BulletWorldImporter_loadFile2;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPZ(obj, fileName, preSwapFilenameOut, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btBulletWorldImporter_loadFile2(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer fileName, @NativeType("char const *") ByteBuffer preSwapFilenameOut) {
        if (CHECKS) {
            checkNT1(fileName);
            checkNT1(preSwapFilenameOut);
        }
        return nbtBulletWorldImporter_loadFile2(obj, memAddress(fileName), memAddress(preSwapFilenameOut));
    }

    @NativeType("bool")
    public static boolean btBulletWorldImporter_loadFile2(@NativeType("void *") long obj, @NativeType("char const *") CharSequence fileName, @NativeType("char const *") CharSequence preSwapFilenameOut) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            stack.nUTF8(preSwapFilenameOut, true);
            long preSwapFilenameOutEncoded = stack.getPointerAddress();
            return nbtBulletWorldImporter_loadFile2(obj, fileNameEncoded, preSwapFilenameOutEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btBulletWorldImporter_loadFileFromMemory ] ---

    public static boolean nbtBulletWorldImporter_loadFileFromMemory(long obj, long memoryBuffer, int len) {
        long __functionAddress = Functions.BulletWorldImporter_loadFileFromMemory;
        if (CHECKS) {
            check(obj);
        }
        return invokePPZ(obj, memoryBuffer, len, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btBulletWorldImporter_loadFileFromMemory(@NativeType("void *") long obj, @NativeType("char *") ByteBuffer memoryBuffer) {
        return nbtBulletWorldImporter_loadFileFromMemory(obj, memAddress(memoryBuffer), memoryBuffer.remaining());
    }

    // --- [ btBulletWorldImporter_loadFileFromMemory2 ] ---

    @NativeType("bool")
    public static boolean btBulletWorldImporter_loadFileFromMemory2(@NativeType("void *") long obj, @NativeType("void *") long file) {
        long __functionAddress = Functions.BulletWorldImporter_loadFileFromMemory2;
        if (CHECKS) {
            check(obj);
            check(file);
        }
        return invokePPZ(obj, file, __functionAddress);
    }

}