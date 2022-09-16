/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRPaths {

    protected VRPaths() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRPaths_ReadPathBatch ] ---

    public static int nVRPaths_ReadPathBatch(long ulRootHandle, long pBatch, int unBatchEntryCount) {
        long __functionAddress = OpenVR.VRPaths.ReadPathBatch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulRootHandle, pBatch, unBatchEntryCount, __functionAddress);
    }

    @NativeType("ETrackedPropertyError")
    public static int VRPaths_ReadPathBatch(@NativeType("PropertyContainerHandle_t") long ulRootHandle, @NativeType("PathRead_t *") PathRead.Buffer pBatch) {
        return nVRPaths_ReadPathBatch(ulRootHandle, pBatch.address(), pBatch.remaining());
    }

    // --- [ VRPaths_WritePathBatch ] ---

    public static int nVRPaths_WritePathBatch(long ulRootHandle, long pBatch, int unBatchEntryCount) {
        long __functionAddress = OpenVR.VRPaths.WritePathBatch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulRootHandle, pBatch, unBatchEntryCount, __functionAddress);
    }

    @NativeType("ETrackedPropertyError")
    public static int VRPaths_WritePathBatch(@NativeType("PropertyContainerHandle_t") long ulRootHandle, @NativeType("PathWrite_t *") PathWrite.Buffer pBatch) {
        return nVRPaths_WritePathBatch(ulRootHandle, pBatch.address(), pBatch.remaining());
    }

    // --- [ VRPaths_StringToHandle ] ---

    public static int nVRPaths_StringToHandle(long pHandle, long pchPath) {
        long __functionAddress = OpenVR.VRPaths.StringToHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pHandle, pchPath, __functionAddress);
    }

    @NativeType("ETrackedPropertyError")
    public static int VRPaths_StringToHandle(@NativeType("PathHandle_t *") LongBuffer pHandle, @NativeType("char *") ByteBuffer pchPath) {
        if (CHECKS) {
            check(pHandle, 1);
            checkNT1(pchPath);
        }
        return nVRPaths_StringToHandle(memAddress(pHandle), memAddress(pchPath));
    }

    // --- [ VRPaths_HandleToString ] ---

    public static int nVRPaths_HandleToString(long pHandle, long pchBuffer, int unBufferSize, long punBufferSizeUsed) {
        long __functionAddress = OpenVR.VRPaths.HandleToString;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(pHandle, pchBuffer, unBufferSize, punBufferSizeUsed, __functionAddress);
    }

    @NativeType("ETrackedPropertyError")
    public static int VRPaths_HandleToString(@NativeType("PathHandle_t") long pHandle, @NativeType("char *") ByteBuffer pchBuffer, @NativeType("uint32_t *") IntBuffer punBufferSizeUsed) {
        if (CHECKS) {
            check(punBufferSizeUsed, 1);
        }
        return nVRPaths_HandleToString(pHandle, memAddress(pchBuffer), pchBuffer.remaining(), memAddress(punBufferSizeUsed));
    }

}