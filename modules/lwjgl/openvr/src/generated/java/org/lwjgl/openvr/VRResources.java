/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRResources {

    protected VRResources() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRResources_LoadSharedResource ] ---

    /** {@code uint32_t VRResources_LoadSharedResource(char const * pchResourceName, char * pchBuffer, uint32_t unBufferLen)} */
    public static int nVRResources_LoadSharedResource(long pchResourceName, long pchBuffer, int unBufferLen) {
        long __functionAddress = OpenVR.VRResources.LoadSharedResource;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchResourceName, pchBuffer, unBufferLen, __functionAddress);
    }

    /** {@code uint32_t VRResources_LoadSharedResource(char const * pchResourceName, char * pchBuffer, uint32_t unBufferLen)} */
    @NativeType("uint32_t")
    public static int VRResources_LoadSharedResource(@NativeType("char const *") ByteBuffer pchResourceName, @NativeType("char *") @Nullable ByteBuffer pchBuffer) {
        if (CHECKS) {
            checkNT1(pchResourceName);
        }
        return nVRResources_LoadSharedResource(memAddress(pchResourceName), memAddressSafe(pchBuffer), remainingSafe(pchBuffer));
    }

    /** {@code uint32_t VRResources_LoadSharedResource(char const * pchResourceName, char * pchBuffer, uint32_t unBufferLen)} */
    @NativeType("uint32_t")
    public static int VRResources_LoadSharedResource(@NativeType("char const *") CharSequence pchResourceName, @NativeType("char *") @Nullable ByteBuffer pchBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchResourceName, true);
            long pchResourceNameEncoded = stack.getPointerAddress();
            return nVRResources_LoadSharedResource(pchResourceNameEncoded, memAddressSafe(pchBuffer), remainingSafe(pchBuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code uint32_t VRResources_LoadSharedResource(char const * pchResourceName, char * pchBuffer, uint32_t unBufferLen)} */
    @NativeType("uint32_t")
    public static String VRResources_LoadSharedResource(@NativeType("char const *") CharSequence pchResourceName, @NativeType("uint32_t") int unBufferLen) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchResourceName, true);
            long pchResourceNameEncoded = stack.getPointerAddress();
            ByteBuffer pchBuffer = stack.malloc(unBufferLen);
            int __result = nVRResources_LoadSharedResource(pchResourceNameEncoded, memAddress(pchBuffer), unBufferLen);
            return memASCII(pchBuffer, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRResources_GetResourceFullPath ] ---

    /** {@code uint32_t VRResources_GetResourceFullPath(char const * pchResourceName, char const * pchResourceTypeDirectory, char * pchPathBuffer, uint32_t unBufferLen)} */
    public static int nVRResources_GetResourceFullPath(long pchResourceName, long pchResourceTypeDirectory, long pchPathBuffer, int unBufferLen) {
        long __functionAddress = OpenVR.VRResources.GetResourceFullPath;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchResourceName, pchResourceTypeDirectory, pchPathBuffer, unBufferLen, __functionAddress);
    }

    /** {@code uint32_t VRResources_GetResourceFullPath(char const * pchResourceName, char const * pchResourceTypeDirectory, char * pchPathBuffer, uint32_t unBufferLen)} */
    @NativeType("uint32_t")
    public static int VRResources_GetResourceFullPath(@NativeType("char const *") ByteBuffer pchResourceName, @NativeType("char const *") ByteBuffer pchResourceTypeDirectory, @NativeType("char *") @Nullable ByteBuffer pchPathBuffer) {
        if (CHECKS) {
            checkNT1(pchResourceName);
            checkNT1(pchResourceTypeDirectory);
        }
        return nVRResources_GetResourceFullPath(memAddress(pchResourceName), memAddress(pchResourceTypeDirectory), memAddressSafe(pchPathBuffer), remainingSafe(pchPathBuffer));
    }

    /** {@code uint32_t VRResources_GetResourceFullPath(char const * pchResourceName, char const * pchResourceTypeDirectory, char * pchPathBuffer, uint32_t unBufferLen)} */
    @NativeType("uint32_t")
    public static int VRResources_GetResourceFullPath(@NativeType("char const *") CharSequence pchResourceName, @NativeType("char const *") CharSequence pchResourceTypeDirectory, @NativeType("char *") @Nullable ByteBuffer pchPathBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchResourceName, true);
            long pchResourceNameEncoded = stack.getPointerAddress();
            stack.nASCII(pchResourceTypeDirectory, true);
            long pchResourceTypeDirectoryEncoded = stack.getPointerAddress();
            return nVRResources_GetResourceFullPath(pchResourceNameEncoded, pchResourceTypeDirectoryEncoded, memAddressSafe(pchPathBuffer), remainingSafe(pchPathBuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code uint32_t VRResources_GetResourceFullPath(char const * pchResourceName, char const * pchResourceTypeDirectory, char * pchPathBuffer, uint32_t unBufferLen)} */
    @NativeType("uint32_t")
    public static String VRResources_GetResourceFullPath(@NativeType("char const *") CharSequence pchResourceName, @NativeType("char const *") CharSequence pchResourceTypeDirectory, @NativeType("uint32_t") int unBufferLen) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchResourceName, true);
            long pchResourceNameEncoded = stack.getPointerAddress();
            stack.nASCII(pchResourceTypeDirectory, true);
            long pchResourceTypeDirectoryEncoded = stack.getPointerAddress();
            ByteBuffer pchPathBuffer = stack.malloc(unBufferLen);
            int __result = nVRResources_GetResourceFullPath(pchResourceNameEncoded, pchResourceTypeDirectoryEncoded, memAddress(pchPathBuffer), unBufferLen);
            return memASCII(pchPathBuffer, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}