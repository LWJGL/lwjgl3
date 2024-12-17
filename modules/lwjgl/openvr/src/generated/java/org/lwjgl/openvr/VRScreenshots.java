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

public class VRScreenshots {

    protected VRScreenshots() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRScreenshots_RequestScreenshot ] ---

    /** {@code EVRScreenshotError VRScreenshots_RequestScreenshot(ScreenshotHandle_t * pOutScreenshotHandle, EVRScreenshotType type, char const * pchPreviewFilename, char const * pchVRFilename)} */
    public static int nVRScreenshots_RequestScreenshot(long pOutScreenshotHandle, int type, long pchPreviewFilename, long pchVRFilename) {
        long __functionAddress = OpenVR.VRScreenshots.RequestScreenshot;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pOutScreenshotHandle, type, pchPreviewFilename, pchVRFilename, __functionAddress);
    }

    /** {@code EVRScreenshotError VRScreenshots_RequestScreenshot(ScreenshotHandle_t * pOutScreenshotHandle, EVRScreenshotType type, char const * pchPreviewFilename, char const * pchVRFilename)} */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_RequestScreenshot(@NativeType("ScreenshotHandle_t *") IntBuffer pOutScreenshotHandle, @NativeType("EVRScreenshotType") int type, @NativeType("char const *") ByteBuffer pchPreviewFilename, @NativeType("char const *") ByteBuffer pchVRFilename) {
        if (CHECKS) {
            check(pOutScreenshotHandle, 1);
            checkNT1(pchPreviewFilename);
            checkNT1(pchVRFilename);
        }
        return nVRScreenshots_RequestScreenshot(memAddress(pOutScreenshotHandle), type, memAddress(pchPreviewFilename), memAddress(pchVRFilename));
    }

    /** {@code EVRScreenshotError VRScreenshots_RequestScreenshot(ScreenshotHandle_t * pOutScreenshotHandle, EVRScreenshotType type, char const * pchPreviewFilename, char const * pchVRFilename)} */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_RequestScreenshot(@NativeType("ScreenshotHandle_t *") IntBuffer pOutScreenshotHandle, @NativeType("EVRScreenshotType") int type, @NativeType("char const *") CharSequence pchPreviewFilename, @NativeType("char const *") CharSequence pchVRFilename) {
        if (CHECKS) {
            check(pOutScreenshotHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchPreviewFilename, true);
            long pchPreviewFilenameEncoded = stack.getPointerAddress();
            stack.nASCII(pchVRFilename, true);
            long pchVRFilenameEncoded = stack.getPointerAddress();
            return nVRScreenshots_RequestScreenshot(memAddress(pOutScreenshotHandle), type, pchPreviewFilenameEncoded, pchVRFilenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRScreenshots_HookScreenshot ] ---

    /** {@code EVRScreenshotError VRScreenshots_HookScreenshot(EVRScreenshotType const * pSupportedTypes, int numTypes)} */
    public static int nVRScreenshots_HookScreenshot(long pSupportedTypes, int numTypes) {
        long __functionAddress = OpenVR.VRScreenshots.HookScreenshot;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pSupportedTypes, numTypes, __functionAddress);
    }

    /** {@code EVRScreenshotError VRScreenshots_HookScreenshot(EVRScreenshotType const * pSupportedTypes, int numTypes)} */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_HookScreenshot(@NativeType("EVRScreenshotType const *") IntBuffer pSupportedTypes) {
        return nVRScreenshots_HookScreenshot(memAddress(pSupportedTypes), pSupportedTypes.remaining());
    }

    // --- [ VRScreenshots_GetScreenshotPropertyType ] ---

    /** {@code EVRScreenshotType VRScreenshots_GetScreenshotPropertyType(ScreenshotHandle_t screenshotHandle, EVRScreenshotError * pError)} */
    public static int nVRScreenshots_GetScreenshotPropertyType(int screenshotHandle, long pError) {
        long __functionAddress = OpenVR.VRScreenshots.GetScreenshotPropertyType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(screenshotHandle, pError, __functionAddress);
    }

    /** {@code EVRScreenshotType VRScreenshots_GetScreenshotPropertyType(ScreenshotHandle_t screenshotHandle, EVRScreenshotError * pError)} */
    @NativeType("EVRScreenshotType")
    public static int VRScreenshots_GetScreenshotPropertyType(@NativeType("ScreenshotHandle_t") int screenshotHandle, @NativeType("EVRScreenshotError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        return nVRScreenshots_GetScreenshotPropertyType(screenshotHandle, memAddress(pError));
    }

    // --- [ VRScreenshots_GetScreenshotPropertyFilename ] ---

    /** {@code uint32_t VRScreenshots_GetScreenshotPropertyFilename(ScreenshotHandle_t screenshotHandle, EVRScreenshotPropertyFilenames filenameType, char * pchFilename, uint32_t cchFilename, EVRScreenshotError * pError)} */
    public static int nVRScreenshots_GetScreenshotPropertyFilename(int screenshotHandle, int filenameType, long pchFilename, int cchFilename, long pError) {
        long __functionAddress = OpenVR.VRScreenshots.GetScreenshotPropertyFilename;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(screenshotHandle, filenameType, pchFilename, cchFilename, pError, __functionAddress);
    }

    /** {@code uint32_t VRScreenshots_GetScreenshotPropertyFilename(ScreenshotHandle_t screenshotHandle, EVRScreenshotPropertyFilenames filenameType, char * pchFilename, uint32_t cchFilename, EVRScreenshotError * pError)} */
    @NativeType("uint32_t")
    public static int VRScreenshots_GetScreenshotPropertyFilename(@NativeType("ScreenshotHandle_t") int screenshotHandle, @NativeType("EVRScreenshotPropertyFilenames") int filenameType, @NativeType("char *") @Nullable ByteBuffer pchFilename, @NativeType("EVRScreenshotError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        return nVRScreenshots_GetScreenshotPropertyFilename(screenshotHandle, filenameType, memAddressSafe(pchFilename), remainingSafe(pchFilename), memAddress(pError));
    }

    /** {@code uint32_t VRScreenshots_GetScreenshotPropertyFilename(ScreenshotHandle_t screenshotHandle, EVRScreenshotPropertyFilenames filenameType, char * pchFilename, uint32_t cchFilename, EVRScreenshotError * pError)} */
    @NativeType("uint32_t")
    public static String VRScreenshots_GetScreenshotPropertyFilename(@NativeType("ScreenshotHandle_t") int screenshotHandle, @NativeType("EVRScreenshotPropertyFilenames") int filenameType, @NativeType("uint32_t") int cchFilename, @NativeType("EVRScreenshotError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchFilename = stack.malloc(cchFilename);
            int __result = nVRScreenshots_GetScreenshotPropertyFilename(screenshotHandle, filenameType, memAddress(pchFilename), cchFilename, memAddress(pError));
            return memASCII(pchFilename, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRScreenshots_UpdateScreenshotProgress ] ---

    /** {@code EVRScreenshotError VRScreenshots_UpdateScreenshotProgress(ScreenshotHandle_t screenshotHandle, float flProgress)} */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_UpdateScreenshotProgress(@NativeType("ScreenshotHandle_t") int screenshotHandle, float flProgress) {
        long __functionAddress = OpenVR.VRScreenshots.UpdateScreenshotProgress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(screenshotHandle, flProgress, __functionAddress);
    }

    // --- [ VRScreenshots_TakeStereoScreenshot ] ---

    /** {@code EVRScreenshotError VRScreenshots_TakeStereoScreenshot(ScreenshotHandle_t * pOutScreenshotHandle, char const * pchPreviewFilename, char const * pchVRFilename)} */
    public static int nVRScreenshots_TakeStereoScreenshot(long pOutScreenshotHandle, long pchPreviewFilename, long pchVRFilename) {
        long __functionAddress = OpenVR.VRScreenshots.TakeStereoScreenshot;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pOutScreenshotHandle, pchPreviewFilename, pchVRFilename, __functionAddress);
    }

    /** {@code EVRScreenshotError VRScreenshots_TakeStereoScreenshot(ScreenshotHandle_t * pOutScreenshotHandle, char const * pchPreviewFilename, char const * pchVRFilename)} */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_TakeStereoScreenshot(@NativeType("ScreenshotHandle_t *") IntBuffer pOutScreenshotHandle, @NativeType("char const *") ByteBuffer pchPreviewFilename, @NativeType("char const *") ByteBuffer pchVRFilename) {
        if (CHECKS) {
            check(pOutScreenshotHandle, 1);
            checkNT1(pchPreviewFilename);
            checkNT1(pchVRFilename);
        }
        return nVRScreenshots_TakeStereoScreenshot(memAddress(pOutScreenshotHandle), memAddress(pchPreviewFilename), memAddress(pchVRFilename));
    }

    /** {@code EVRScreenshotError VRScreenshots_TakeStereoScreenshot(ScreenshotHandle_t * pOutScreenshotHandle, char const * pchPreviewFilename, char const * pchVRFilename)} */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_TakeStereoScreenshot(@NativeType("ScreenshotHandle_t *") IntBuffer pOutScreenshotHandle, @NativeType("char const *") CharSequence pchPreviewFilename, @NativeType("char const *") CharSequence pchVRFilename) {
        if (CHECKS) {
            check(pOutScreenshotHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchPreviewFilename, true);
            long pchPreviewFilenameEncoded = stack.getPointerAddress();
            stack.nASCII(pchVRFilename, true);
            long pchVRFilenameEncoded = stack.getPointerAddress();
            return nVRScreenshots_TakeStereoScreenshot(memAddress(pOutScreenshotHandle), pchPreviewFilenameEncoded, pchVRFilenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRScreenshots_SubmitScreenshot ] ---

    /** {@code EVRScreenshotError VRScreenshots_SubmitScreenshot(ScreenshotHandle_t screenshotHandle, EVRScreenshotType type, char const * pchSourcePreviewFilename, char const * pchSourceVRFilename)} */
    public static int nVRScreenshots_SubmitScreenshot(int screenshotHandle, int type, long pchSourcePreviewFilename, long pchSourceVRFilename) {
        long __functionAddress = OpenVR.VRScreenshots.SubmitScreenshot;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(screenshotHandle, type, pchSourcePreviewFilename, pchSourceVRFilename, __functionAddress);
    }

    /** {@code EVRScreenshotError VRScreenshots_SubmitScreenshot(ScreenshotHandle_t screenshotHandle, EVRScreenshotType type, char const * pchSourcePreviewFilename, char const * pchSourceVRFilename)} */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_SubmitScreenshot(@NativeType("ScreenshotHandle_t") int screenshotHandle, @NativeType("EVRScreenshotType") int type, @NativeType("char const *") ByteBuffer pchSourcePreviewFilename, @NativeType("char const *") ByteBuffer pchSourceVRFilename) {
        if (CHECKS) {
            checkNT1(pchSourcePreviewFilename);
            checkNT1(pchSourceVRFilename);
        }
        return nVRScreenshots_SubmitScreenshot(screenshotHandle, type, memAddress(pchSourcePreviewFilename), memAddress(pchSourceVRFilename));
    }

    /** {@code EVRScreenshotError VRScreenshots_SubmitScreenshot(ScreenshotHandle_t screenshotHandle, EVRScreenshotType type, char const * pchSourcePreviewFilename, char const * pchSourceVRFilename)} */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_SubmitScreenshot(@NativeType("ScreenshotHandle_t") int screenshotHandle, @NativeType("EVRScreenshotType") int type, @NativeType("char const *") CharSequence pchSourcePreviewFilename, @NativeType("char const *") CharSequence pchSourceVRFilename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSourcePreviewFilename, true);
            long pchSourcePreviewFilenameEncoded = stack.getPointerAddress();
            stack.nASCII(pchSourceVRFilename, true);
            long pchSourceVRFilenameEncoded = stack.getPointerAddress();
            return nVRScreenshots_SubmitScreenshot(screenshotHandle, type, pchSourcePreviewFilenameEncoded, pchSourceVRFilenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}