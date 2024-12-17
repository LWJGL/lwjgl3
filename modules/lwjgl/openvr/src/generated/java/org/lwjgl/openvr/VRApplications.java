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

public class VRApplications {

    protected VRApplications() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRApplications_AddApplicationManifest ] ---

    /** {@code EVRApplicationError VRApplications_AddApplicationManifest(char const * pchApplicationManifestFullPath, bool bTemporary)} */
    public static int nVRApplications_AddApplicationManifest(long pchApplicationManifestFullPath, boolean bTemporary) {
        long __functionAddress = OpenVR.VRApplications.AddApplicationManifest;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchApplicationManifestFullPath, bTemporary, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_AddApplicationManifest(char const * pchApplicationManifestFullPath, bool bTemporary)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_AddApplicationManifest(@NativeType("char const *") ByteBuffer pchApplicationManifestFullPath, @NativeType("bool") boolean bTemporary) {
        if (CHECKS) {
            checkNT1(pchApplicationManifestFullPath);
        }
        return nVRApplications_AddApplicationManifest(memAddress(pchApplicationManifestFullPath), bTemporary);
    }

    /** {@code EVRApplicationError VRApplications_AddApplicationManifest(char const * pchApplicationManifestFullPath, bool bTemporary)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_AddApplicationManifest(@NativeType("char const *") CharSequence pchApplicationManifestFullPath, @NativeType("bool") boolean bTemporary) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchApplicationManifestFullPath, true);
            long pchApplicationManifestFullPathEncoded = stack.getPointerAddress();
            return nVRApplications_AddApplicationManifest(pchApplicationManifestFullPathEncoded, bTemporary);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_RemoveApplicationManifest ] ---

    /** {@code EVRApplicationError VRApplications_RemoveApplicationManifest(char const * pchApplicationManifestFullPath)} */
    public static int nVRApplications_RemoveApplicationManifest(long pchApplicationManifestFullPath) {
        long __functionAddress = OpenVR.VRApplications.RemoveApplicationManifest;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchApplicationManifestFullPath, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_RemoveApplicationManifest(char const * pchApplicationManifestFullPath)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_RemoveApplicationManifest(@NativeType("char const *") ByteBuffer pchApplicationManifestFullPath) {
        if (CHECKS) {
            checkNT1(pchApplicationManifestFullPath);
        }
        return nVRApplications_RemoveApplicationManifest(memAddress(pchApplicationManifestFullPath));
    }

    /** {@code EVRApplicationError VRApplications_RemoveApplicationManifest(char const * pchApplicationManifestFullPath)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_RemoveApplicationManifest(@NativeType("char const *") CharSequence pchApplicationManifestFullPath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchApplicationManifestFullPath, true);
            long pchApplicationManifestFullPathEncoded = stack.getPointerAddress();
            return nVRApplications_RemoveApplicationManifest(pchApplicationManifestFullPathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_IsApplicationInstalled ] ---

    /** {@code bool VRApplications_IsApplicationInstalled(char const * pchAppKey)} */
    public static boolean nVRApplications_IsApplicationInstalled(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.IsApplicationInstalled;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pchAppKey, __functionAddress);
    }

    /** {@code bool VRApplications_IsApplicationInstalled(char const * pchAppKey)} */
    @NativeType("bool")
    public static boolean VRApplications_IsApplicationInstalled(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_IsApplicationInstalled(memAddress(pchAppKey));
    }

    /** {@code bool VRApplications_IsApplicationInstalled(char const * pchAppKey)} */
    @NativeType("bool")
    public static boolean VRApplications_IsApplicationInstalled(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_IsApplicationInstalled(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationCount ] ---

    /** {@code uint32_t VRApplications_GetApplicationCount(void)} */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationCount() {
        long __functionAddress = OpenVR.VRApplications.GetApplicationCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRApplications_GetApplicationKeyByIndex ] ---

    /** {@code EVRApplicationError VRApplications_GetApplicationKeyByIndex(uint32_t unApplicationIndex, char * pchAppKeyBuffer, uint32_t unAppKeyBufferLen)} */
    public static int nVRApplications_GetApplicationKeyByIndex(int unApplicationIndex, long pchAppKeyBuffer, int unAppKeyBufferLen) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationKeyByIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unApplicationIndex, pchAppKeyBuffer, unAppKeyBufferLen, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_GetApplicationKeyByIndex(uint32_t unApplicationIndex, char * pchAppKeyBuffer, uint32_t unAppKeyBufferLen)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_GetApplicationKeyByIndex(@NativeType("uint32_t") int unApplicationIndex, @NativeType("char *") @Nullable ByteBuffer pchAppKeyBuffer) {
        return nVRApplications_GetApplicationKeyByIndex(unApplicationIndex, memAddressSafe(pchAppKeyBuffer), remainingSafe(pchAppKeyBuffer));
    }

    // --- [ VRApplications_GetApplicationKeyByProcessId ] ---

    /** {@code EVRApplicationError VRApplications_GetApplicationKeyByProcessId(uint32_t unProcessId, char * pchAppKeyBuffer, uint32_t unAppKeyBufferLen)} */
    public static int nVRApplications_GetApplicationKeyByProcessId(int unProcessId, long pchAppKeyBuffer, int unAppKeyBufferLen) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationKeyByProcessId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unProcessId, pchAppKeyBuffer, unAppKeyBufferLen, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_GetApplicationKeyByProcessId(uint32_t unProcessId, char * pchAppKeyBuffer, uint32_t unAppKeyBufferLen)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_GetApplicationKeyByProcessId(@NativeType("uint32_t") int unProcessId, @NativeType("char *") @Nullable ByteBuffer pchAppKeyBuffer) {
        return nVRApplications_GetApplicationKeyByProcessId(unProcessId, memAddressSafe(pchAppKeyBuffer), remainingSafe(pchAppKeyBuffer));
    }

    // --- [ VRApplications_LaunchApplication ] ---

    /** {@code EVRApplicationError VRApplications_LaunchApplication(char const * pchAppKey)} */
    public static int nVRApplications_LaunchApplication(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.LaunchApplication;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKey, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_LaunchApplication(char const * pchAppKey)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchApplication(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_LaunchApplication(memAddress(pchAppKey));
    }

    /** {@code EVRApplicationError VRApplications_LaunchApplication(char const * pchAppKey)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchApplication(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_LaunchApplication(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_LaunchTemplateApplication ] ---

    /** {@code EVRApplicationError VRApplications_LaunchTemplateApplication(char const * pchTemplateAppKey, char const * pchNewAppKey, AppOverrideKeys_t const * pKeys, uint32_t unKeys)} */
    public static int nVRApplications_LaunchTemplateApplication(long pchTemplateAppKey, long pchNewAppKey, long pKeys, int unKeys) {
        long __functionAddress = OpenVR.VRApplications.LaunchTemplateApplication;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pKeys, unKeys, AppOverrideKeys.SIZEOF, AppOverrideKeys::validate);
        }
        return callPPPI(pchTemplateAppKey, pchNewAppKey, pKeys, unKeys, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_LaunchTemplateApplication(char const * pchTemplateAppKey, char const * pchNewAppKey, AppOverrideKeys_t const * pKeys, uint32_t unKeys)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchTemplateApplication(@NativeType("char const *") ByteBuffer pchTemplateAppKey, @NativeType("char const *") ByteBuffer pchNewAppKey, @NativeType("AppOverrideKeys_t const *") AppOverrideKeys.Buffer pKeys) {
        if (CHECKS) {
            checkNT1(pchTemplateAppKey);
            checkNT1(pchNewAppKey);
        }
        return nVRApplications_LaunchTemplateApplication(memAddress(pchTemplateAppKey), memAddress(pchNewAppKey), pKeys.address(), pKeys.remaining());
    }

    /** {@code EVRApplicationError VRApplications_LaunchTemplateApplication(char const * pchTemplateAppKey, char const * pchNewAppKey, AppOverrideKeys_t const * pKeys, uint32_t unKeys)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchTemplateApplication(@NativeType("char const *") CharSequence pchTemplateAppKey, @NativeType("char const *") CharSequence pchNewAppKey, @NativeType("AppOverrideKeys_t const *") AppOverrideKeys.Buffer pKeys) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchTemplateAppKey, true);
            long pchTemplateAppKeyEncoded = stack.getPointerAddress();
            stack.nASCII(pchNewAppKey, true);
            long pchNewAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_LaunchTemplateApplication(pchTemplateAppKeyEncoded, pchNewAppKeyEncoded, pKeys.address(), pKeys.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_LaunchApplicationFromMimeType ] ---

    /** {@code EVRApplicationError VRApplications_LaunchApplicationFromMimeType(char const * pchMimeType, char const * pchArgs)} */
    public static int nVRApplications_LaunchApplicationFromMimeType(long pchMimeType, long pchArgs) {
        long __functionAddress = OpenVR.VRApplications.LaunchApplicationFromMimeType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchMimeType, pchArgs, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_LaunchApplicationFromMimeType(char const * pchMimeType, char const * pchArgs)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchApplicationFromMimeType(@NativeType("char const *") ByteBuffer pchMimeType, @NativeType("char const *") ByteBuffer pchArgs) {
        if (CHECKS) {
            checkNT1(pchMimeType);
            checkNT1(pchArgs);
        }
        return nVRApplications_LaunchApplicationFromMimeType(memAddress(pchMimeType), memAddress(pchArgs));
    }

    /** {@code EVRApplicationError VRApplications_LaunchApplicationFromMimeType(char const * pchMimeType, char const * pchArgs)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchApplicationFromMimeType(@NativeType("char const *") CharSequence pchMimeType, @NativeType("char const *") CharSequence pchArgs) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchMimeType, true);
            long pchMimeTypeEncoded = stack.getPointerAddress();
            stack.nASCII(pchArgs, true);
            long pchArgsEncoded = stack.getPointerAddress();
            return nVRApplications_LaunchApplicationFromMimeType(pchMimeTypeEncoded, pchArgsEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_LaunchDashboardOverlay ] ---

    /** {@code EVRApplicationError VRApplications_LaunchDashboardOverlay(char const * pchAppKey)} */
    public static int nVRApplications_LaunchDashboardOverlay(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.LaunchDashboardOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKey, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_LaunchDashboardOverlay(char const * pchAppKey)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchDashboardOverlay(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_LaunchDashboardOverlay(memAddress(pchAppKey));
    }

    /** {@code EVRApplicationError VRApplications_LaunchDashboardOverlay(char const * pchAppKey)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchDashboardOverlay(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_LaunchDashboardOverlay(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_CancelApplicationLaunch ] ---

    /** {@code bool VRApplications_CancelApplicationLaunch(char const * pchAppKey)} */
    public static boolean nVRApplications_CancelApplicationLaunch(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.CancelApplicationLaunch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pchAppKey, __functionAddress);
    }

    /** {@code bool VRApplications_CancelApplicationLaunch(char const * pchAppKey)} */
    @NativeType("bool")
    public static boolean VRApplications_CancelApplicationLaunch(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_CancelApplicationLaunch(memAddress(pchAppKey));
    }

    /** {@code bool VRApplications_CancelApplicationLaunch(char const * pchAppKey)} */
    @NativeType("bool")
    public static boolean VRApplications_CancelApplicationLaunch(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_CancelApplicationLaunch(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_IdentifyApplication ] ---

    /** {@code EVRApplicationError VRApplications_IdentifyApplication(uint32_t unProcessId, char const * pchAppKey)} */
    public static int nVRApplications_IdentifyApplication(int unProcessId, long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.IdentifyApplication;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unProcessId, pchAppKey, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_IdentifyApplication(uint32_t unProcessId, char const * pchAppKey)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_IdentifyApplication(@NativeType("uint32_t") int unProcessId, @NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_IdentifyApplication(unProcessId, memAddress(pchAppKey));
    }

    /** {@code EVRApplicationError VRApplications_IdentifyApplication(uint32_t unProcessId, char const * pchAppKey)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_IdentifyApplication(@NativeType("uint32_t") int unProcessId, @NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_IdentifyApplication(unProcessId, pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationProcessId ] ---

    /** {@code uint32_t VRApplications_GetApplicationProcessId(char const * pchAppKey)} */
    public static int nVRApplications_GetApplicationProcessId(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationProcessId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKey, __functionAddress);
    }

    /** {@code uint32_t VRApplications_GetApplicationProcessId(char const * pchAppKey)} */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationProcessId(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_GetApplicationProcessId(memAddress(pchAppKey));
    }

    /** {@code uint32_t VRApplications_GetApplicationProcessId(char const * pchAppKey)} */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationProcessId(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationProcessId(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationsErrorNameFromEnum ] ---

    /** {@code char const * VRApplications_GetApplicationsErrorNameFromEnum(EVRApplicationError error)} */
    public static long nVRApplications_GetApplicationsErrorNameFromEnum(int error) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationsErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(error, __functionAddress);
    }

    /** {@code char const * VRApplications_GetApplicationsErrorNameFromEnum(EVRApplicationError error)} */
    @NativeType("char const *")
    public static @Nullable String VRApplications_GetApplicationsErrorNameFromEnum(@NativeType("EVRApplicationError") int error) {
        long __result = nVRApplications_GetApplicationsErrorNameFromEnum(error);
        return memASCIISafe(__result);
    }

    // --- [ VRApplications_GetApplicationPropertyString ] ---

    /** {@code uint32_t VRApplications_GetApplicationPropertyString(char const * pchAppKey, EVRApplicationProperty eProperty, char * pchPropertyValueBuffer, uint32_t unPropertyValueBufferLen, EVRApplicationError * peError)} */
    public static int nVRApplications_GetApplicationPropertyString(long pchAppKey, int eProperty, long pchPropertyValueBuffer, int unPropertyValueBufferLen, long peError) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationPropertyString;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchAppKey, eProperty, pchPropertyValueBuffer, unPropertyValueBufferLen, peError, __functionAddress);
    }

    /** {@code uint32_t VRApplications_GetApplicationPropertyString(char const * pchAppKey, EVRApplicationProperty eProperty, char * pchPropertyValueBuffer, uint32_t unPropertyValueBufferLen, EVRApplicationError * peError)} */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationPropertyString(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("char *") @Nullable ByteBuffer pchPropertyValueBuffer, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchAppKey);
            check(peError, 1);
        }
        return nVRApplications_GetApplicationPropertyString(memAddress(pchAppKey), eProperty, memAddressSafe(pchPropertyValueBuffer), remainingSafe(pchPropertyValueBuffer), memAddress(peError));
    }

    /** {@code uint32_t VRApplications_GetApplicationPropertyString(char const * pchAppKey, EVRApplicationProperty eProperty, char * pchPropertyValueBuffer, uint32_t unPropertyValueBufferLen, EVRApplicationError * peError)} */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationPropertyString(@NativeType("char const *") CharSequence pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("char *") @Nullable ByteBuffer pchPropertyValueBuffer, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationPropertyString(pchAppKeyEncoded, eProperty, memAddressSafe(pchPropertyValueBuffer), remainingSafe(pchPropertyValueBuffer), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code uint32_t VRApplications_GetApplicationPropertyString(char const * pchAppKey, EVRApplicationProperty eProperty, char * pchPropertyValueBuffer, uint32_t unPropertyValueBufferLen, EVRApplicationError * peError)} */
    @NativeType("uint32_t")
    public static String VRApplications_GetApplicationPropertyString(@NativeType("char const *") CharSequence pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("uint32_t") int unPropertyValueBufferLen, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            ByteBuffer pchPropertyValueBuffer = stack.malloc(unPropertyValueBufferLen);
            int __result = nVRApplications_GetApplicationPropertyString(pchAppKeyEncoded, eProperty, memAddress(pchPropertyValueBuffer), unPropertyValueBufferLen, memAddress(peError));
            return memASCII(pchPropertyValueBuffer, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code uint32_t VRApplications_GetApplicationPropertyString(char const * pchAppKey, EVRApplicationProperty eProperty, char * pchPropertyValueBuffer, uint32_t unPropertyValueBufferLen, EVRApplicationError * peError)} */
    @NativeType("uint32_t")
    public static String VRApplications_GetApplicationPropertyString(@NativeType("char const *") CharSequence pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("EVRApplicationError *") IntBuffer peError) {
        return VRApplications_GetApplicationPropertyString(pchAppKey, eProperty, VR.k_unMaxPropertyStringSize, peError);
    }

    // --- [ VRApplications_GetApplicationPropertyBool ] ---

    /** {@code bool VRApplications_GetApplicationPropertyBool(char const * pchAppKey, EVRApplicationProperty eProperty, EVRApplicationError * peError)} */
    public static boolean nVRApplications_GetApplicationPropertyBool(long pchAppKey, int eProperty, long peError) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationPropertyBool;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pchAppKey, eProperty, peError, __functionAddress);
    }

    /** {@code bool VRApplications_GetApplicationPropertyBool(char const * pchAppKey, EVRApplicationProperty eProperty, EVRApplicationError * peError)} */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationPropertyBool(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchAppKey);
            check(peError, 1);
        }
        return nVRApplications_GetApplicationPropertyBool(memAddress(pchAppKey), eProperty, memAddress(peError));
    }

    /** {@code bool VRApplications_GetApplicationPropertyBool(char const * pchAppKey, EVRApplicationProperty eProperty, EVRApplicationError * peError)} */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationPropertyBool(@NativeType("char const *") CharSequence pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationPropertyBool(pchAppKeyEncoded, eProperty, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationPropertyUint64 ] ---

    /** {@code uint64_t VRApplications_GetApplicationPropertyUint64(char const * pchAppKey, EVRApplicationProperty eProperty, EVRApplicationError * peError)} */
    public static long nVRApplications_GetApplicationPropertyUint64(long pchAppKey, int eProperty, long peError) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationPropertyUint64;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(pchAppKey, eProperty, peError, __functionAddress);
    }

    /** {@code uint64_t VRApplications_GetApplicationPropertyUint64(char const * pchAppKey, EVRApplicationProperty eProperty, EVRApplicationError * peError)} */
    @NativeType("uint64_t")
    public static long VRApplications_GetApplicationPropertyUint64(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchAppKey);
            check(peError, 1);
        }
        return nVRApplications_GetApplicationPropertyUint64(memAddress(pchAppKey), eProperty, memAddress(peError));
    }

    /** {@code uint64_t VRApplications_GetApplicationPropertyUint64(char const * pchAppKey, EVRApplicationProperty eProperty, EVRApplicationError * peError)} */
    @NativeType("uint64_t")
    public static long VRApplications_GetApplicationPropertyUint64(@NativeType("char const *") CharSequence pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationPropertyUint64(pchAppKeyEncoded, eProperty, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_SetApplicationAutoLaunch ] ---

    /** {@code EVRApplicationError VRApplications_SetApplicationAutoLaunch(char const * pchAppKey, bool bAutoLaunch)} */
    public static int nVRApplications_SetApplicationAutoLaunch(long pchAppKey, boolean bAutoLaunch) {
        long __functionAddress = OpenVR.VRApplications.SetApplicationAutoLaunch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKey, bAutoLaunch, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_SetApplicationAutoLaunch(char const * pchAppKey, bool bAutoLaunch)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_SetApplicationAutoLaunch(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("bool") boolean bAutoLaunch) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_SetApplicationAutoLaunch(memAddress(pchAppKey), bAutoLaunch);
    }

    /** {@code EVRApplicationError VRApplications_SetApplicationAutoLaunch(char const * pchAppKey, bool bAutoLaunch)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_SetApplicationAutoLaunch(@NativeType("char const *") CharSequence pchAppKey, @NativeType("bool") boolean bAutoLaunch) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_SetApplicationAutoLaunch(pchAppKeyEncoded, bAutoLaunch);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationAutoLaunch ] ---

    /** {@code bool VRApplications_GetApplicationAutoLaunch(char const * pchAppKey)} */
    public static boolean nVRApplications_GetApplicationAutoLaunch(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationAutoLaunch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pchAppKey, __functionAddress);
    }

    /** {@code bool VRApplications_GetApplicationAutoLaunch(char const * pchAppKey)} */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationAutoLaunch(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_GetApplicationAutoLaunch(memAddress(pchAppKey));
    }

    /** {@code bool VRApplications_GetApplicationAutoLaunch(char const * pchAppKey)} */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationAutoLaunch(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationAutoLaunch(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_SetDefaultApplicationForMimeType ] ---

    /** {@code EVRApplicationError VRApplications_SetDefaultApplicationForMimeType(char const * pchAppKey, char const * pchMimeType)} */
    public static int nVRApplications_SetDefaultApplicationForMimeType(long pchAppKey, long pchMimeType) {
        long __functionAddress = OpenVR.VRApplications.SetDefaultApplicationForMimeType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchAppKey, pchMimeType, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_SetDefaultApplicationForMimeType(char const * pchAppKey, char const * pchMimeType)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_SetDefaultApplicationForMimeType(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("char const *") ByteBuffer pchMimeType) {
        if (CHECKS) {
            checkNT1(pchAppKey);
            checkNT1(pchMimeType);
        }
        return nVRApplications_SetDefaultApplicationForMimeType(memAddress(pchAppKey), memAddress(pchMimeType));
    }

    /** {@code EVRApplicationError VRApplications_SetDefaultApplicationForMimeType(char const * pchAppKey, char const * pchMimeType)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_SetDefaultApplicationForMimeType(@NativeType("char const *") CharSequence pchAppKey, @NativeType("char const *") CharSequence pchMimeType) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            stack.nASCII(pchMimeType, true);
            long pchMimeTypeEncoded = stack.getPointerAddress();
            return nVRApplications_SetDefaultApplicationForMimeType(pchAppKeyEncoded, pchMimeTypeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetDefaultApplicationForMimeType ] ---

    /** {@code bool VRApplications_GetDefaultApplicationForMimeType(char const * pchMimeType, char * pchAppKeyBuffer, uint32_t unAppKeyBufferLen)} */
    public static boolean nVRApplications_GetDefaultApplicationForMimeType(long pchMimeType, long pchAppKeyBuffer, int unAppKeyBufferLen) {
        long __functionAddress = OpenVR.VRApplications.GetDefaultApplicationForMimeType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pchMimeType, pchAppKeyBuffer, unAppKeyBufferLen, __functionAddress);
    }

    /** {@code bool VRApplications_GetDefaultApplicationForMimeType(char const * pchMimeType, char * pchAppKeyBuffer, uint32_t unAppKeyBufferLen)} */
    @NativeType("bool")
    public static boolean VRApplications_GetDefaultApplicationForMimeType(@NativeType("char const *") ByteBuffer pchMimeType, @NativeType("char *") @Nullable ByteBuffer pchAppKeyBuffer) {
        if (CHECKS) {
            checkNT1(pchMimeType);
        }
        return nVRApplications_GetDefaultApplicationForMimeType(memAddress(pchMimeType), memAddressSafe(pchAppKeyBuffer), remainingSafe(pchAppKeyBuffer));
    }

    /** {@code bool VRApplications_GetDefaultApplicationForMimeType(char const * pchMimeType, char * pchAppKeyBuffer, uint32_t unAppKeyBufferLen)} */
    @NativeType("bool")
    public static boolean VRApplications_GetDefaultApplicationForMimeType(@NativeType("char const *") CharSequence pchMimeType, @NativeType("char *") @Nullable ByteBuffer pchAppKeyBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchMimeType, true);
            long pchMimeTypeEncoded = stack.getPointerAddress();
            return nVRApplications_GetDefaultApplicationForMimeType(pchMimeTypeEncoded, memAddressSafe(pchAppKeyBuffer), remainingSafe(pchAppKeyBuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationSupportedMimeTypes ] ---

    /** {@code bool VRApplications_GetApplicationSupportedMimeTypes(char const * pchAppKey, char * pchMimeTypesBuffer, uint32_t unMimeTypesBuffer)} */
    public static boolean nVRApplications_GetApplicationSupportedMimeTypes(long pchAppKey, long pchMimeTypesBuffer, int unMimeTypesBuffer) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationSupportedMimeTypes;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pchAppKey, pchMimeTypesBuffer, unMimeTypesBuffer, __functionAddress);
    }

    /** {@code bool VRApplications_GetApplicationSupportedMimeTypes(char const * pchAppKey, char * pchMimeTypesBuffer, uint32_t unMimeTypesBuffer)} */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationSupportedMimeTypes(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("char *") @Nullable ByteBuffer pchMimeTypesBuffer) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_GetApplicationSupportedMimeTypes(memAddress(pchAppKey), memAddressSafe(pchMimeTypesBuffer), remainingSafe(pchMimeTypesBuffer));
    }

    /** {@code bool VRApplications_GetApplicationSupportedMimeTypes(char const * pchAppKey, char * pchMimeTypesBuffer, uint32_t unMimeTypesBuffer)} */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationSupportedMimeTypes(@NativeType("char const *") CharSequence pchAppKey, @NativeType("char *") @Nullable ByteBuffer pchMimeTypesBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationSupportedMimeTypes(pchAppKeyEncoded, memAddressSafe(pchMimeTypesBuffer), remainingSafe(pchMimeTypesBuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationsThatSupportMimeType ] ---

    /** {@code uint32_t VRApplications_GetApplicationsThatSupportMimeType(char const * pchMimeType, char * pchAppKeysThatSupportBuffer, uint32_t unAppKeysThatSupportBuffer)} */
    public static int nVRApplications_GetApplicationsThatSupportMimeType(long pchMimeType, long pchAppKeysThatSupportBuffer, int unAppKeysThatSupportBuffer) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationsThatSupportMimeType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchMimeType, pchAppKeysThatSupportBuffer, unAppKeysThatSupportBuffer, __functionAddress);
    }

    /** {@code uint32_t VRApplications_GetApplicationsThatSupportMimeType(char const * pchMimeType, char * pchAppKeysThatSupportBuffer, uint32_t unAppKeysThatSupportBuffer)} */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationsThatSupportMimeType(@NativeType("char const *") ByteBuffer pchMimeType, @NativeType("char *") @Nullable ByteBuffer pchAppKeysThatSupportBuffer) {
        if (CHECKS) {
            checkNT1(pchMimeType);
        }
        return nVRApplications_GetApplicationsThatSupportMimeType(memAddress(pchMimeType), memAddressSafe(pchAppKeysThatSupportBuffer), remainingSafe(pchAppKeysThatSupportBuffer));
    }

    /** {@code uint32_t VRApplications_GetApplicationsThatSupportMimeType(char const * pchMimeType, char * pchAppKeysThatSupportBuffer, uint32_t unAppKeysThatSupportBuffer)} */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationsThatSupportMimeType(@NativeType("char const *") CharSequence pchMimeType, @NativeType("char *") @Nullable ByteBuffer pchAppKeysThatSupportBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchMimeType, true);
            long pchMimeTypeEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationsThatSupportMimeType(pchMimeTypeEncoded, memAddressSafe(pchAppKeysThatSupportBuffer), remainingSafe(pchAppKeysThatSupportBuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code uint32_t VRApplications_GetApplicationsThatSupportMimeType(char const * pchMimeType, char * pchAppKeysThatSupportBuffer, uint32_t unAppKeysThatSupportBuffer)} */
    @NativeType("uint32_t")
    public static String VRApplications_GetApplicationsThatSupportMimeType(@NativeType("char const *") CharSequence pchMimeType, @NativeType("uint32_t") int unAppKeysThatSupportBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchMimeType, true);
            long pchMimeTypeEncoded = stack.getPointerAddress();
            ByteBuffer pchAppKeysThatSupportBuffer = stack.malloc(unAppKeysThatSupportBuffer);
            int __result = nVRApplications_GetApplicationsThatSupportMimeType(pchMimeTypeEncoded, memAddress(pchAppKeysThatSupportBuffer), unAppKeysThatSupportBuffer);
            return memASCII(pchAppKeysThatSupportBuffer, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationLaunchArguments ] ---

    /** {@code uint32_t VRApplications_GetApplicationLaunchArguments(uint32_t unHandle, char * pchArgs, uint32_t unArgs)} */
    public static int nVRApplications_GetApplicationLaunchArguments(int unHandle, long pchArgs, int unArgs) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationLaunchArguments;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unHandle, pchArgs, unArgs, __functionAddress);
    }

    /** {@code uint32_t VRApplications_GetApplicationLaunchArguments(uint32_t unHandle, char * pchArgs, uint32_t unArgs)} */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationLaunchArguments(@NativeType("uint32_t") int unHandle, @NativeType("char *") @Nullable ByteBuffer pchArgs) {
        return nVRApplications_GetApplicationLaunchArguments(unHandle, memAddressSafe(pchArgs), remainingSafe(pchArgs));
    }

    /** {@code uint32_t VRApplications_GetApplicationLaunchArguments(uint32_t unHandle, char * pchArgs, uint32_t unArgs)} */
    @NativeType("uint32_t")
    public static String VRApplications_GetApplicationLaunchArguments(@NativeType("uint32_t") int unHandle, @NativeType("uint32_t") int unArgs) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchArgs = stack.malloc(unArgs);
            int __result = nVRApplications_GetApplicationLaunchArguments(unHandle, memAddress(pchArgs), unArgs);
            return memASCII(pchArgs, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetStartingApplication ] ---

    /** {@code EVRApplicationError VRApplications_GetStartingApplication(char * pchAppKeyBuffer, uint32_t unAppKeyBufferLen)} */
    public static int nVRApplications_GetStartingApplication(long pchAppKeyBuffer, int unAppKeyBufferLen) {
        long __functionAddress = OpenVR.VRApplications.GetStartingApplication;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKeyBuffer, unAppKeyBufferLen, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_GetStartingApplication(char * pchAppKeyBuffer, uint32_t unAppKeyBufferLen)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_GetStartingApplication(@NativeType("char *") ByteBuffer pchAppKeyBuffer) {
        return nVRApplications_GetStartingApplication(memAddress(pchAppKeyBuffer), pchAppKeyBuffer.remaining());
    }

    // --- [ VRApplications_GetSceneApplicationState ] ---

    /** {@code EVRSceneApplicationState VRApplications_GetSceneApplicationState(void)} */
    @NativeType("EVRSceneApplicationState")
    public static int VRApplications_GetSceneApplicationState() {
        long __functionAddress = OpenVR.VRApplications.GetSceneApplicationState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRApplications_PerformApplicationPrelaunchCheck ] ---

    /** {@code EVRApplicationError VRApplications_PerformApplicationPrelaunchCheck(char const * pchAppKey)} */
    public static int nVRApplications_PerformApplicationPrelaunchCheck(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.PerformApplicationPrelaunchCheck;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKey, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_PerformApplicationPrelaunchCheck(char const * pchAppKey)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_PerformApplicationPrelaunchCheck(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_PerformApplicationPrelaunchCheck(memAddress(pchAppKey));
    }

    /** {@code EVRApplicationError VRApplications_PerformApplicationPrelaunchCheck(char const * pchAppKey)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_PerformApplicationPrelaunchCheck(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_PerformApplicationPrelaunchCheck(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetSceneApplicationStateNameFromEnum ] ---

    /** {@code char const * VRApplications_GetSceneApplicationStateNameFromEnum(EVRSceneApplicationState state)} */
    public static long nVRApplications_GetSceneApplicationStateNameFromEnum(int state) {
        long __functionAddress = OpenVR.VRApplications.GetSceneApplicationStateNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(state, __functionAddress);
    }

    /** {@code char const * VRApplications_GetSceneApplicationStateNameFromEnum(EVRSceneApplicationState state)} */
    @NativeType("char const *")
    public static @Nullable String VRApplications_GetSceneApplicationStateNameFromEnum(@NativeType("EVRSceneApplicationState") int state) {
        long __result = nVRApplications_GetSceneApplicationStateNameFromEnum(state);
        return memASCIISafe(__result);
    }

    // --- [ VRApplications_LaunchInternalProcess ] ---

    /** {@code EVRApplicationError VRApplications_LaunchInternalProcess(char const * pchBinaryPath, char const * pchArguments, char const * pchWorkingDirectory)} */
    public static int nVRApplications_LaunchInternalProcess(long pchBinaryPath, long pchArguments, long pchWorkingDirectory) {
        long __functionAddress = OpenVR.VRApplications.LaunchInternalProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchBinaryPath, pchArguments, pchWorkingDirectory, __functionAddress);
    }

    /** {@code EVRApplicationError VRApplications_LaunchInternalProcess(char const * pchBinaryPath, char const * pchArguments, char const * pchWorkingDirectory)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchInternalProcess(@NativeType("char const *") ByteBuffer pchBinaryPath, @NativeType("char const *") ByteBuffer pchArguments, @NativeType("char const *") ByteBuffer pchWorkingDirectory) {
        if (CHECKS) {
            checkNT1(pchBinaryPath);
            checkNT1(pchArguments);
            checkNT1(pchWorkingDirectory);
        }
        return nVRApplications_LaunchInternalProcess(memAddress(pchBinaryPath), memAddress(pchArguments), memAddress(pchWorkingDirectory));
    }

    /** {@code EVRApplicationError VRApplications_LaunchInternalProcess(char const * pchBinaryPath, char const * pchArguments, char const * pchWorkingDirectory)} */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchInternalProcess(@NativeType("char const *") CharSequence pchBinaryPath, @NativeType("char const *") CharSequence pchArguments, @NativeType("char const *") CharSequence pchWorkingDirectory) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchBinaryPath, true);
            long pchBinaryPathEncoded = stack.getPointerAddress();
            stack.nASCII(pchArguments, true);
            long pchArgumentsEncoded = stack.getPointerAddress();
            stack.nASCII(pchWorkingDirectory, true);
            long pchWorkingDirectoryEncoded = stack.getPointerAddress();
            return nVRApplications_LaunchInternalProcess(pchBinaryPathEncoded, pchArgumentsEncoded, pchWorkingDirectoryEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetCurrentSceneProcessId ] ---

    /** {@code uint32_t VRApplications_GetCurrentSceneProcessId(void)} */
    @NativeType("uint32_t")
    public static int VRApplications_GetCurrentSceneProcessId() {
        long __functionAddress = OpenVR.VRApplications.GetCurrentSceneProcessId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

}