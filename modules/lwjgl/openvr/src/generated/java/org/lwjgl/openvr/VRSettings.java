/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

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

    public static long nVRSettings_GetSettingsErrorNameFromEnum(int eError) {
        long __functionAddress = OpenVR.VRSettings.GetSettingsErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress, eError);
    }

    @Nullable
    @NativeType("char const *")
    public static String VRSettings_GetSettingsErrorNameFromEnum(@NativeType("EVRSettingsError") int eError) {
        long __result = nVRSettings_GetSettingsErrorNameFromEnum(eError);
        return memASCIISafe(__result);
    }

    // --- [ VRSettings_Sync ] ---

    /** Unsafe version of: {@link #VRSettings_Sync Sync} */
    public static boolean nVRSettings_Sync(boolean bForce, long peError) {
        long __functionAddress = OpenVR.VRSettings.Sync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(__functionAddress, bForce, peError);
    }

    /**
     * Returns true if file sync occurred (force or settings dirty).
     *
     * @param bForce  
     * @param peError 
     */
    @NativeType("bool")
    public static boolean VRSettings_Sync(@NativeType("bool") boolean bForce, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        return nVRSettings_Sync(bForce, memAddress(peError));
    }

    // --- [ VRSettings_SetBool ] ---

    public static void nVRSettings_SetBool(long pchSection, long pchSettingsKey, boolean bValue, long peError) {
        long __functionAddress = OpenVR.VRSettings.SetBool;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, pchSection, pchSettingsKey, bValue, peError);
    }

    public static void VRSettings_SetBool(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("bool") boolean bValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        nVRSettings_SetBool(memAddress(pchSection), memAddress(pchSettingsKey), bValue, memAddress(peError));
    }

    public static void VRSettings_SetBool(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("bool") boolean bValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchSectionEncoded = stack.ASCII(pchSection);
            ByteBuffer pchSettingsKeyEncoded = stack.ASCII(pchSettingsKey);
            nVRSettings_SetBool(memAddress(pchSectionEncoded), memAddress(pchSettingsKeyEncoded), bValue, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_SetInt32 ] ---

    public static void nVRSettings_SetInt32(long pchSection, long pchSettingsKey, int nValue, long peError) {
        long __functionAddress = OpenVR.VRSettings.SetInt32;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, pchSection, pchSettingsKey, nValue, peError);
    }

    public static void VRSettings_SetInt32(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("int32_t") int nValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        nVRSettings_SetInt32(memAddress(pchSection), memAddress(pchSettingsKey), nValue, memAddress(peError));
    }

    public static void VRSettings_SetInt32(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("int32_t") int nValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchSectionEncoded = stack.ASCII(pchSection);
            ByteBuffer pchSettingsKeyEncoded = stack.ASCII(pchSettingsKey);
            nVRSettings_SetInt32(memAddress(pchSectionEncoded), memAddress(pchSettingsKeyEncoded), nValue, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_SetFloat ] ---

    public static void nVRSettings_SetFloat(long pchSection, long pchSettingsKey, float flValue, long peError) {
        long __functionAddress = OpenVR.VRSettings.SetFloat;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, pchSection, pchSettingsKey, flValue, peError);
    }

    public static void VRSettings_SetFloat(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, float flValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        nVRSettings_SetFloat(memAddress(pchSection), memAddress(pchSettingsKey), flValue, memAddress(peError));
    }

    public static void VRSettings_SetFloat(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, float flValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchSectionEncoded = stack.ASCII(pchSection);
            ByteBuffer pchSettingsKeyEncoded = stack.ASCII(pchSettingsKey);
            nVRSettings_SetFloat(memAddress(pchSectionEncoded), memAddress(pchSettingsKeyEncoded), flValue, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_SetString ] ---

    public static void nVRSettings_SetString(long pchSection, long pchSettingsKey, long pchValue, long peError) {
        long __functionAddress = OpenVR.VRSettings.SetString;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(__functionAddress, pchSection, pchSettingsKey, pchValue, peError);
    }

    public static void VRSettings_SetString(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("char const *") ByteBuffer pchValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            checkNT1(pchValue);
            check(peError, 1);
        }
        nVRSettings_SetString(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(pchValue), memAddress(peError));
    }

    public static void VRSettings_SetString(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("char const *") CharSequence pchValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchSectionEncoded = stack.ASCII(pchSection);
            ByteBuffer pchSettingsKeyEncoded = stack.ASCII(pchSettingsKey);
            ByteBuffer pchValueEncoded = stack.ASCII(pchValue);
            nVRSettings_SetString(memAddress(pchSectionEncoded), memAddress(pchSettingsKeyEncoded), memAddress(pchValueEncoded), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_GetBool ] ---

    public static boolean nVRSettings_GetBool(long pchSection, long pchSettingsKey, long peError) {
        long __functionAddress = OpenVR.VRSettings.GetBool;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPZ(__functionAddress, pchSection, pchSettingsKey, peError);
    }

    @NativeType("bool")
    public static boolean VRSettings_GetBool(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        return nVRSettings_GetBool(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(peError));
    }

    @NativeType("bool")
    public static boolean VRSettings_GetBool(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchSectionEncoded = stack.ASCII(pchSection);
            ByteBuffer pchSettingsKeyEncoded = stack.ASCII(pchSettingsKey);
            return nVRSettings_GetBool(memAddress(pchSectionEncoded), memAddress(pchSettingsKeyEncoded), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_GetInt32 ] ---

    public static int nVRSettings_GetInt32(long pchSection, long pchSettingsKey, long peError) {
        long __functionAddress = OpenVR.VRSettings.GetInt32;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, pchSection, pchSettingsKey, peError);
    }

    @NativeType("int32_t")
    public static int VRSettings_GetInt32(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        return nVRSettings_GetInt32(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(peError));
    }

    @NativeType("int32_t")
    public static int VRSettings_GetInt32(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchSectionEncoded = stack.ASCII(pchSection);
            ByteBuffer pchSettingsKeyEncoded = stack.ASCII(pchSettingsKey);
            return nVRSettings_GetInt32(memAddress(pchSectionEncoded), memAddress(pchSettingsKeyEncoded), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_GetFloat ] ---

    public static float nVRSettings_GetFloat(long pchSection, long pchSettingsKey, long peError) {
        long __functionAddress = OpenVR.VRSettings.GetFloat;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPF(__functionAddress, pchSection, pchSettingsKey, peError);
    }

    public static float VRSettings_GetFloat(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        return nVRSettings_GetFloat(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(peError));
    }

    public static float VRSettings_GetFloat(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchSectionEncoded = stack.ASCII(pchSection);
            ByteBuffer pchSettingsKeyEncoded = stack.ASCII(pchSettingsKey);
            return nVRSettings_GetFloat(memAddress(pchSectionEncoded), memAddress(pchSettingsKeyEncoded), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_GetString ] ---

    public static void nVRSettings_GetString(long pchSection, long pchSettingsKey, long pchValue, int unValueLen, long peError) {
        long __functionAddress = OpenVR.VRSettings.GetString;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(__functionAddress, pchSection, pchSettingsKey, pchValue, unValueLen, peError);
    }

    public static void VRSettings_GetString(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("char *") ByteBuffer pchValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        nVRSettings_GetString(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(pchValue), pchValue.remaining(), memAddress(peError));
    }

    public static void VRSettings_GetString(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("char *") ByteBuffer pchValue, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchSectionEncoded = stack.ASCII(pchSection);
            ByteBuffer pchSettingsKeyEncoded = stack.ASCII(pchSettingsKey);
            nVRSettings_GetString(memAddress(pchSectionEncoded), memAddress(pchSettingsKeyEncoded), memAddress(pchValue), pchValue.remaining(), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_RemoveSection ] ---

    public static void nVRSettings_RemoveSection(long pchSection, long peError) {
        long __functionAddress = OpenVR.VRSettings.RemoveSection;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, pchSection, peError);
    }

    public static void VRSettings_RemoveSection(@NativeType("char const *") ByteBuffer pchSection, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            check(peError, 1);
        }
        nVRSettings_RemoveSection(memAddress(pchSection), memAddress(peError));
    }

    public static void VRSettings_RemoveSection(@NativeType("char const *") CharSequence pchSection, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchSectionEncoded = stack.ASCII(pchSection);
            nVRSettings_RemoveSection(memAddress(pchSectionEncoded), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSettings_RemoveKeyInSection ] ---

    public static void nVRSettings_RemoveKeyInSection(long pchSection, long pchSettingsKey, long peError) {
        long __functionAddress = OpenVR.VRSettings.RemoveKeyInSection;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, pchSection, pchSettingsKey, peError);
    }

    public static void VRSettings_RemoveKeyInSection(@NativeType("char const *") ByteBuffer pchSection, @NativeType("char const *") ByteBuffer pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchSection);
            checkNT1(pchSettingsKey);
            check(peError, 1);
        }
        nVRSettings_RemoveKeyInSection(memAddress(pchSection), memAddress(pchSettingsKey), memAddress(peError));
    }

    public static void VRSettings_RemoveKeyInSection(@NativeType("char const *") CharSequence pchSection, @NativeType("char const *") CharSequence pchSettingsKey, @NativeType("EVRSettingsError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchSectionEncoded = stack.ASCII(pchSection);
            ByteBuffer pchSettingsKeyEncoded = stack.ASCII(pchSettingsKey);
            nVRSettings_RemoveKeyInSection(memAddress(pchSectionEncoded), memAddress(pchSettingsKeyEncoded), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}