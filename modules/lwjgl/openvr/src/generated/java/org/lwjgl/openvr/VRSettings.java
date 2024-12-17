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

public class VRSettings {

    protected VRSettings() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRSettings_GetSettingsErrorNameFromEnum ] ---

    /** {@code char const * VRSettings_GetSettingsErrorNameFromEnum(EVRSettingsError eError)} */
    public static long nVRSettings_GetSettingsErrorNameFromEnum(int eError) {
        long __functionAddress = OpenVR.VRSettings.GetSettingsErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(eError, __functionAddress);
    }

    /** {@code char const * VRSettings_GetSettingsErrorNameFromEnum(EVRSettingsError eError)} */
    @NativeType("char const *")
    public static @Nullable String VRSettings_GetSettingsErrorNameFromEnum(@NativeType("EVRSettingsError") int eError) {
        long __result = nVRSettings_GetSettingsErrorNameFromEnum(eError);
        return memASCIISafe(__result);
    }

    // --- [ VRSettings_SetBool ] ---

    /** {@code void VRSettings_SetBool(char const * pchSection, char const * pchSettingsKey, bool bValue, EVRSettingsError * peError)} */
    public static void nVRSettings_SetBool(long pchSection, long pchSettingsKey, boolean bValue, long peError) {
        long __functionAddress = OpenVR.VRSettings.SetBool;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(pchSection, pchSettingsKey, bValue, peError, __functionAddress);
    }

    /** {@code void VRSettings_SetBool(char const * pchSection, char const * pchSettingsKey, bool bValue, EVRSettingsError * peError)} */
    public static void VRSettings_SetBool(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("bool") boolean bValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        nVRSettings_SetBool(memAddress(pchSection), memAddress(pchSettingsKey), bValue, memAddress(peError));
    }

    /** {@code void VRSettings_SetBool(char const * pchSection, char const * pchSettingsKey, bool bValue, EVRSettingsError * peError)} */
    public static void VRSettings_SetBool(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("bool") boolean bValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSection, true);
            long pchSectionEncoded = stack.getPointerAddress();
            stack.nASCII(pchSettingsKey, true);
            long pchSettingsKeyEncoded = stack.getPointerAddress();
            nVRSettings_SetBool(pchSectionEncoded, pchSettingsKeyEncoded, bValue, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_SetInt32 ] ---

    /** {@code void VRSettings_SetInt32(char const * pchSection, char const * pchSettingsKey, int32_t nValue, EVRSettingsError * peError)} */
    public static void nVRSettings_SetInt32(long pchSection, long pchSettingsKey, int nValue, long peError) {
        long __functionAddress = OpenVR.VRSettings.SetInt32;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(pchSection, pchSettingsKey, nValue, peError, __functionAddress);
    }

    /** {@code void VRSettings_SetInt32(char const * pchSection, char const * pchSettingsKey, int32_t nValue, EVRSettingsError * peError)} */
    public static void VRSettings_SetInt32(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("int32_t") int nValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        nVRSettings_SetInt32(memAddress(pchSection), memAddress(pchSettingsKey), nValue, memAddress(peError));
    }

    /** {@code void VRSettings_SetInt32(char const * pchSection, char const * pchSettingsKey, int32_t nValue, EVRSettingsError * peError)} */
    public static void VRSettings_SetInt32(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("int32_t") int nValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSection, true);
            long pchSectionEncoded = stack.getPointerAddress();
            stack.nASCII(pchSettingsKey, true);
            long pchSettingsKeyEncoded = stack.getPointerAddress();
            nVRSettings_SetInt32(pchSectionEncoded, pchSettingsKeyEncoded, nValue, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_SetFloat ] ---

    /** {@code void VRSettings_SetFloat(char const * pchSection, char const * pchSettingsKey, float flValue, EVRSettingsError * peError)} */
    public static void nVRSettings_SetFloat(long pchSection, long pchSettingsKey, float flValue, long peError) {
        long __functionAddress = OpenVR.VRSettings.SetFloat;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(pchSection, pchSettingsKey, flValue, peError, __functionAddress);
    }

    /** {@code void VRSettings_SetFloat(char const * pchSection, char const * pchSettingsKey, float flValue, EVRSettingsError * peError)} */
    public static void VRSettings_SetFloat(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, float flValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        nVRSettings_SetFloat(memAddress(pchSection), memAddress(pchSettingsKey), flValue, memAddress(peError));
    }

    /** {@code void VRSettings_SetFloat(char const * pchSection, char const * pchSettingsKey, float flValue, EVRSettingsError * peError)} */
    public static void VRSettings_SetFloat(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, float flValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSection, true);
            long pchSectionEncoded = stack.getPointerAddress();
            stack.nASCII(pchSettingsKey, true);
            long pchSettingsKeyEncoded = stack.getPointerAddress();
            nVRSettings_SetFloat(pchSectionEncoded, pchSettingsKeyEncoded, flValue, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_SetString ] ---

    /** {@code void VRSettings_SetString(char const * pchSection, char const * pchSettingsKey, char const * pchValue, EVRSettingsError * peError)} */
    public static void nVRSettings_SetString(long pchSection, long pchSettingsKey, long pchValue, long peError) {
        long __functionAddress = OpenVR.VRSettings.SetString;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(pchSection, pchSettingsKey, pchValue, peError, __functionAddress);
    }

    /** {@code void VRSettings_SetString(char const * pchSection, char const * pchSettingsKey, char const * pchValue, EVRSettingsError * peError)} */
    public static void VRSettings_SetString(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("char const *") ByteBuffer pchValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            checkNT1(pchValue);
            check(peError, 1);
        }
        nVRSettings_SetString(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(pchValue), memAddress(peError));
    }

    /** {@code void VRSettings_SetString(char const * pchSection, char const * pchSettingsKey, char const * pchValue, EVRSettingsError * peError)} */
    public static void VRSettings_SetString(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("char const *") CharSequence pchValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSection, true);
            long pchSectionEncoded = stack.getPointerAddress();
            stack.nASCII(pchSettingsKey, true);
            long pchSettingsKeyEncoded = stack.getPointerAddress();
            stack.nASCII(pchValue, true);
            long pchValueEncoded = stack.getPointerAddress();
            nVRSettings_SetString(pchSectionEncoded, pchSettingsKeyEncoded, pchValueEncoded, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_GetBool ] ---

    /** {@code bool VRSettings_GetBool(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    public static boolean nVRSettings_GetBool(long pchSection, long pchSettingsKey, long peError) {
        long __functionAddress = OpenVR.VRSettings.GetBool;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPZ(pchSection, pchSettingsKey, peError, __functionAddress);
    }

    /** {@code bool VRSettings_GetBool(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    @NativeType("bool")
    public static boolean VRSettings_GetBool(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        return nVRSettings_GetBool(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(peError));
    }

    /** {@code bool VRSettings_GetBool(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    @NativeType("bool")
    public static boolean VRSettings_GetBool(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSection, true);
            long pchSectionEncoded = stack.getPointerAddress();
            stack.nASCII(pchSettingsKey, true);
            long pchSettingsKeyEncoded = stack.getPointerAddress();
            return nVRSettings_GetBool(pchSectionEncoded, pchSettingsKeyEncoded, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_GetInt32 ] ---

    /** {@code int32_t VRSettings_GetInt32(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    public static int nVRSettings_GetInt32(long pchSection, long pchSettingsKey, long peError) {
        long __functionAddress = OpenVR.VRSettings.GetInt32;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchSection, pchSettingsKey, peError, __functionAddress);
    }

    /** {@code int32_t VRSettings_GetInt32(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    @NativeType("int32_t")
    public static int VRSettings_GetInt32(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        return nVRSettings_GetInt32(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(peError));
    }

    /** {@code int32_t VRSettings_GetInt32(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    @NativeType("int32_t")
    public static int VRSettings_GetInt32(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSection, true);
            long pchSectionEncoded = stack.getPointerAddress();
            stack.nASCII(pchSettingsKey, true);
            long pchSettingsKeyEncoded = stack.getPointerAddress();
            return nVRSettings_GetInt32(pchSectionEncoded, pchSettingsKeyEncoded, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_GetFloat ] ---

    /** {@code float VRSettings_GetFloat(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    public static float nVRSettings_GetFloat(long pchSection, long pchSettingsKey, long peError) {
        long __functionAddress = OpenVR.VRSettings.GetFloat;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPF(pchSection, pchSettingsKey, peError, __functionAddress);
    }

    /** {@code float VRSettings_GetFloat(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    public static float VRSettings_GetFloat(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        return nVRSettings_GetFloat(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(peError));
    }

    /** {@code float VRSettings_GetFloat(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    public static float VRSettings_GetFloat(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSection, true);
            long pchSectionEncoded = stack.getPointerAddress();
            stack.nASCII(pchSettingsKey, true);
            long pchSettingsKeyEncoded = stack.getPointerAddress();
            return nVRSettings_GetFloat(pchSectionEncoded, pchSettingsKeyEncoded, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_GetString ] ---

    /** {@code void VRSettings_GetString(char const * pchSection, char const * pchSettingsKey, char * pchValue, uint32_t unValueLen, EVRSettingsError * peError)} */
    public static void nVRSettings_GetString(long pchSection, long pchSettingsKey, long pchValue, int unValueLen, long peError) {
        long __functionAddress = OpenVR.VRSettings.GetString;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(pchSection, pchSettingsKey, pchValue, unValueLen, peError, __functionAddress);
    }

    /** {@code void VRSettings_GetString(char const * pchSection, char const * pchSettingsKey, char * pchValue, uint32_t unValueLen, EVRSettingsError * peError)} */
    public static void VRSettings_GetString(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("char *") ByteBuffer pchValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        nVRSettings_GetString(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(pchValue), pchValue.remaining(), memAddress(peError));
    }

    /** {@code void VRSettings_GetString(char const * pchSection, char const * pchSettingsKey, char * pchValue, uint32_t unValueLen, EVRSettingsError * peError)} */
    public static void VRSettings_GetString(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("char *") ByteBuffer pchValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSection, true);
            long pchSectionEncoded = stack.getPointerAddress();
            stack.nASCII(pchSettingsKey, true);
            long pchSettingsKeyEncoded = stack.getPointerAddress();
            nVRSettings_GetString(pchSectionEncoded, pchSettingsKeyEncoded, memAddress(pchValue), pchValue.remaining(), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_RemoveSection ] ---

    /** {@code void VRSettings_RemoveSection(char const * pchSection, EVRSettingsError * peError)} */
    public static void nVRSettings_RemoveSection(long pchSection, long peError) {
        long __functionAddress = OpenVR.VRSettings.RemoveSection;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pchSection, peError, __functionAddress);
    }

    /** {@code void VRSettings_RemoveSection(char const * pchSection, EVRSettingsError * peError)} */
    public static void VRSettings_RemoveSection(@NativeType("char const *") ByteBuffer pchSection, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            check(peError, 1);
        }
        nVRSettings_RemoveSection(memAddress(pchSection), memAddress(peError));
    }

    /** {@code void VRSettings_RemoveSection(char const * pchSection, EVRSettingsError * peError)} */
    public static void VRSettings_RemoveSection(@NativeType("char const *") CharSequence pchSection, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSection, true);
            long pchSectionEncoded = stack.getPointerAddress();
            nVRSettings_RemoveSection(pchSectionEncoded, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_RemoveKeyInSection ] ---

    /** {@code void VRSettings_RemoveKeyInSection(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    public static void nVRSettings_RemoveKeyInSection(long pchSection, long pchSettingsKey, long peError) {
        long __functionAddress = OpenVR.VRSettings.RemoveKeyInSection;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(pchSection, pchSettingsKey, peError, __functionAddress);
    }

    /** {@code void VRSettings_RemoveKeyInSection(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    public static void VRSettings_RemoveKeyInSection(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        nVRSettings_RemoveKeyInSection(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(peError));
    }

    /** {@code void VRSettings_RemoveKeyInSection(char const * pchSection, char const * pchSettingsKey, EVRSettingsError * peError)} */
    public static void VRSettings_RemoveKeyInSection(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSection, true);
            long pchSectionEncoded = stack.getPointerAddress();
            stack.nASCII(pchSettingsKey, true);
            long pchSettingsKeyEncoded = stack.getPointerAddress();
            nVRSettings_RemoveKeyInSection(pchSectionEncoded, pchSettingsKeyEncoded, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}