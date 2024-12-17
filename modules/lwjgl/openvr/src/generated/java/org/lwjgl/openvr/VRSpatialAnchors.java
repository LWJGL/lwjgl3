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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRSpatialAnchors {

    protected VRSpatialAnchors() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRSpatialAnchors_CreateSpatialAnchorFromDescriptor ] ---

    /** {@code EVRSpatialAnchorError VRSpatialAnchors_CreateSpatialAnchorFromDescriptor(char const * pchDescriptor, SpatialAnchorHandle_t * pHandleOut)} */
    public static int nVRSpatialAnchors_CreateSpatialAnchorFromDescriptor(long pchDescriptor, long pHandleOut) {
        long __functionAddress = OpenVR.VRSpatialAnchors.CreateSpatialAnchorFromDescriptor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchDescriptor, pHandleOut, __functionAddress);
    }

    /** {@code EVRSpatialAnchorError VRSpatialAnchors_CreateSpatialAnchorFromDescriptor(char const * pchDescriptor, SpatialAnchorHandle_t * pHandleOut)} */
    @NativeType("EVRSpatialAnchorError")
    public static int VRSpatialAnchors_CreateSpatialAnchorFromDescriptor(@NativeType("char const *") ByteBuffer pchDescriptor, @NativeType("SpatialAnchorHandle_t *") IntBuffer pHandleOut) {
        if (CHECKS) {
            checkNT1(pchDescriptor);
            check(pHandleOut, 1);
        }
        return nVRSpatialAnchors_CreateSpatialAnchorFromDescriptor(memAddress(pchDescriptor), memAddress(pHandleOut));
    }

    /** {@code EVRSpatialAnchorError VRSpatialAnchors_CreateSpatialAnchorFromDescriptor(char const * pchDescriptor, SpatialAnchorHandle_t * pHandleOut)} */
    @NativeType("EVRSpatialAnchorError")
    public static int VRSpatialAnchors_CreateSpatialAnchorFromDescriptor(@NativeType("char const *") CharSequence pchDescriptor, @NativeType("SpatialAnchorHandle_t *") IntBuffer pHandleOut) {
        if (CHECKS) {
            check(pHandleOut, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchDescriptor, true);
            long pchDescriptorEncoded = stack.getPointerAddress();
            return nVRSpatialAnchors_CreateSpatialAnchorFromDescriptor(pchDescriptorEncoded, memAddress(pHandleOut));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSpatialAnchors_CreateSpatialAnchorFromPose ] ---

    /** {@code EVRSpatialAnchorError VRSpatialAnchors_CreateSpatialAnchorFromPose(TrackedDeviceIndex_t unDeviceIndex, ETrackingUniverseOrigin eOrigin, SpatialAnchorPose_t * pPose, SpatialAnchorHandle_t * pHandleOut)} */
    public static int nVRSpatialAnchors_CreateSpatialAnchorFromPose(int unDeviceIndex, int eOrigin, long pPose, long pHandleOut) {
        long __functionAddress = OpenVR.VRSpatialAnchors.CreateSpatialAnchorFromPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unDeviceIndex, eOrigin, pPose, pHandleOut, __functionAddress);
    }

    /** {@code EVRSpatialAnchorError VRSpatialAnchors_CreateSpatialAnchorFromPose(TrackedDeviceIndex_t unDeviceIndex, ETrackingUniverseOrigin eOrigin, SpatialAnchorPose_t * pPose, SpatialAnchorHandle_t * pHandleOut)} */
    @NativeType("EVRSpatialAnchorError")
    public static int VRSpatialAnchors_CreateSpatialAnchorFromPose(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("SpatialAnchorPose_t *") SpatialAnchorPose pPose, @NativeType("SpatialAnchorHandle_t *") IntBuffer pHandleOut) {
        if (CHECKS) {
            check(pHandleOut, 1);
        }
        return nVRSpatialAnchors_CreateSpatialAnchorFromPose(unDeviceIndex, eOrigin, pPose.address(), memAddress(pHandleOut));
    }

    // --- [ VRSpatialAnchors_GetSpatialAnchorPose ] ---

    /** {@code EVRSpatialAnchorError VRSpatialAnchors_GetSpatialAnchorPose(SpatialAnchorHandle_t unHandle, ETrackingUniverseOrigin eOrigin, SpatialAnchorPose_t * pPoseOut)} */
    public static int nVRSpatialAnchors_GetSpatialAnchorPose(int unHandle, int eOrigin, long pPoseOut) {
        long __functionAddress = OpenVR.VRSpatialAnchors.GetSpatialAnchorPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unHandle, eOrigin, pPoseOut, __functionAddress);
    }

    /** {@code EVRSpatialAnchorError VRSpatialAnchors_GetSpatialAnchorPose(SpatialAnchorHandle_t unHandle, ETrackingUniverseOrigin eOrigin, SpatialAnchorPose_t * pPoseOut)} */
    @NativeType("EVRSpatialAnchorError")
    public static int VRSpatialAnchors_GetSpatialAnchorPose(@NativeType("SpatialAnchorHandle_t") int unHandle, @NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("SpatialAnchorPose_t *") SpatialAnchorPose pPoseOut) {
        return nVRSpatialAnchors_GetSpatialAnchorPose(unHandle, eOrigin, pPoseOut.address());
    }

    // --- [ VRSpatialAnchors_GetSpatialAnchorDescriptor ] ---

    /** {@code EVRSpatialAnchorError VRSpatialAnchors_GetSpatialAnchorDescriptor(SpatialAnchorHandle_t unHandle, char * pchDescriptorOut, uint32_t * punDescriptorBufferLenInOut)} */
    public static int nVRSpatialAnchors_GetSpatialAnchorDescriptor(int unHandle, long pchDescriptorOut, long punDescriptorBufferLenInOut) {
        long __functionAddress = OpenVR.VRSpatialAnchors.GetSpatialAnchorDescriptor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unHandle, pchDescriptorOut, punDescriptorBufferLenInOut, __functionAddress);
    }

    /** {@code EVRSpatialAnchorError VRSpatialAnchors_GetSpatialAnchorDescriptor(SpatialAnchorHandle_t unHandle, char * pchDescriptorOut, uint32_t * punDescriptorBufferLenInOut)} */
    @NativeType("EVRSpatialAnchorError")
    public static int VRSpatialAnchors_GetSpatialAnchorDescriptor(@NativeType("SpatialAnchorHandle_t") int unHandle, @NativeType("char *") ByteBuffer pchDescriptorOut, @NativeType("uint32_t *") IntBuffer punDescriptorBufferLenInOut) {
        if (CHECKS) {
            check(punDescriptorBufferLenInOut, 1);
            check(pchDescriptorOut, punDescriptorBufferLenInOut.get(punDescriptorBufferLenInOut.position()));
        }
        return nVRSpatialAnchors_GetSpatialAnchorDescriptor(unHandle, memAddress(pchDescriptorOut), memAddress(punDescriptorBufferLenInOut));
    }

}