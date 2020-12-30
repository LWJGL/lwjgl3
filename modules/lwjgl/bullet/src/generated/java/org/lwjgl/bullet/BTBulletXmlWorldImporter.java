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

public class BTBulletXmlWorldImporter {

    protected BTBulletXmlWorldImporter() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            BulletXmlWorldImporter_new      = apiGetFunctionAddress(LibBullet.getLibrary(), "btBulletXmlWorldImporter_new"),
            BulletXmlWorldImporter_loadFile = apiGetFunctionAddress(LibBullet.getLibrary(), "btBulletXmlWorldImporter_loadFile");

    }

    // --- [ btBulletXmlWorldImporter_new ] ---

    @NativeType("void *")
    public static long btBulletXmlWorldImporter_new(@NativeType("void *") long world) {
        long __functionAddress = Functions.BulletXmlWorldImporter_new;
        if (CHECKS) {
            check(world);
        }
        return invokePP(world, __functionAddress);
    }

    // --- [ btBulletXmlWorldImporter_loadFile ] ---

    public static boolean nbtBulletXmlWorldImporter_loadFile(long obj, long fileName) {
        long __functionAddress = Functions.BulletXmlWorldImporter_loadFile;
        if (CHECKS) {
            check(obj);
        }
        return invokePPZ(obj, fileName, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btBulletXmlWorldImporter_loadFile(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer fileName) {
        if (CHECKS) {
            checkNT1(fileName);
        }
        return nbtBulletXmlWorldImporter_loadFile(obj, memAddress(fileName));
    }

    @NativeType("bool")
    public static boolean btBulletXmlWorldImporter_loadFile(@NativeType("void *") long obj, @NativeType("char const *") CharSequence fileName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nbtBulletXmlWorldImporter_loadFile(obj, fileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}