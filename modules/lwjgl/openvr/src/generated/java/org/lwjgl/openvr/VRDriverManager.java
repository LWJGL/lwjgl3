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

public class VRDriverManager {

    protected VRDriverManager() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRDriverManager_GetDriverCount ] ---

    /** {@code uint32_t VRDriverManager_GetDriverCount(void)} */
    @NativeType("uint32_t")
    public static int VRDriverManager_GetDriverCount() {
        long __functionAddress = OpenVR.VRDriverManager.GetDriverCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRDriverManager_GetDriverName ] ---

    /** {@code uint32_t VRDriverManager_GetDriverName(DriverId_t nDriver, char * pchValue, uint32_t unBufferSize)} */
    public static int nVRDriverManager_GetDriverName(int nDriver, long pchValue, int unBufferSize) {
        long __functionAddress = OpenVR.VRDriverManager.GetDriverName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(nDriver, pchValue, unBufferSize, __functionAddress);
    }

    /** {@code uint32_t VRDriverManager_GetDriverName(DriverId_t nDriver, char * pchValue, uint32_t unBufferSize)} */
    @NativeType("uint32_t")
    public static int VRDriverManager_GetDriverName(@NativeType("DriverId_t") int nDriver, @NativeType("char *") @Nullable ByteBuffer pchValue) {
        return nVRDriverManager_GetDriverName(nDriver, memAddressSafe(pchValue), remainingSafe(pchValue));
    }

    /** {@code uint32_t VRDriverManager_GetDriverName(DriverId_t nDriver, char * pchValue, uint32_t unBufferSize)} */
    @NativeType("uint32_t")
    public static String VRDriverManager_GetDriverName(@NativeType("DriverId_t") int nDriver, @NativeType("uint32_t") int unBufferSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchValue = stack.malloc(unBufferSize);
            int __result = nVRDriverManager_GetDriverName(nDriver, memAddress(pchValue), unBufferSize);
            return memASCII(pchValue, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRDriverManager_GetDriverHandle ] ---

    /** {@code DriverHandle_t VRDriverManager_GetDriverHandle(char const * pchDriverName)} */
    public static long nVRDriverManager_GetDriverHandle(long pchDriverName) {
        long __functionAddress = OpenVR.VRDriverManager.GetDriverHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJ(pchDriverName, __functionAddress);
    }

    /** {@code DriverHandle_t VRDriverManager_GetDriverHandle(char const * pchDriverName)} */
    @NativeType("DriverHandle_t")
    public static long VRDriverManager_GetDriverHandle(@NativeType("char const *") ByteBuffer pchDriverName) {
        if (CHECKS) {
            checkNT1(pchDriverName);
        }
        return nVRDriverManager_GetDriverHandle(memAddress(pchDriverName));
    }

    /** {@code DriverHandle_t VRDriverManager_GetDriverHandle(char const * pchDriverName)} */
    @NativeType("DriverHandle_t")
    public static long VRDriverManager_GetDriverHandle(@NativeType("char const *") CharSequence pchDriverName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchDriverName, true);
            long pchDriverNameEncoded = stack.getPointerAddress();
            return nVRDriverManager_GetDriverHandle(pchDriverNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRDriverManager_IsEnabled ] ---

    /** {@code bool VRDriverManager_IsEnabled(DriverId_t nDriver)} */
    @NativeType("bool")
    public static boolean VRDriverManager_IsEnabled(@NativeType("DriverId_t") int nDriver) {
        long __functionAddress = OpenVR.VRDriverManager.IsEnabled;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(nDriver, __functionAddress);
    }

}