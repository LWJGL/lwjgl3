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

    /** Unsafe version of: {@link #VRSpatialAnchors_CreateSpatialAnchorFromDescriptor CreateSpatialAnchorFromDescriptor} */
    public static int nVRSpatialAnchors_CreateSpatialAnchorFromDescriptor(long pchDescriptor, long pHandleOut) {
        long __functionAddress = OpenVR.VRSpatialAnchors.CreateSpatialAnchorFromDescriptor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchDescriptor, pHandleOut, __functionAddress);
    }

    /**
     * Returns a handle for an spatial anchor described by "descriptor".  On success, {@code pHandle} will contain a handle valid for this session. Caller can
     * wait for an event or occasionally poll {@link #VRSpatialAnchors_GetSpatialAnchorPose GetSpatialAnchorPose} to find the virtual coordinate associated with this anchor.
     */
    @NativeType("EVRSpatialAnchorError")
    public static int VRSpatialAnchors_CreateSpatialAnchorFromDescriptor(@NativeType("char const *") ByteBuffer pchDescriptor, @NativeType("SpatialAnchorHandle_t *") IntBuffer pHandleOut) {
        if (CHECKS) {
            checkNT1(pchDescriptor);
            check(pHandleOut, 1);
        }
        return nVRSpatialAnchors_CreateSpatialAnchorFromDescriptor(memAddress(pchDescriptor), memAddress(pHandleOut));
    }

    /**
     * Returns a handle for an spatial anchor described by "descriptor".  On success, {@code pHandle} will contain a handle valid for this session. Caller can
     * wait for an event or occasionally poll {@link #VRSpatialAnchors_GetSpatialAnchorPose GetSpatialAnchorPose} to find the virtual coordinate associated with this anchor.
     */
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

    /** Unsafe version of: {@link #VRSpatialAnchors_CreateSpatialAnchorFromPose CreateSpatialAnchorFromPose} */
    public static int nVRSpatialAnchors_CreateSpatialAnchorFromPose(int unDeviceIndex, int eOrigin, long pPose, long pHandleOut) {
        long __functionAddress = OpenVR.VRSpatialAnchors.CreateSpatialAnchorFromPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unDeviceIndex, eOrigin, pPose, pHandleOut, __functionAddress);
    }

    /**
     * Returns a handle for an new spatial anchor at {@code pPose}.
     * 
     * <p>On success, {@code pHandle} will contain a handle valid for this session. Caller can wait for an event or occasionally poll
     * {@link #VRSpatialAnchors_GetSpatialAnchorDescriptor GetSpatialAnchorDescriptor} to find the permanent descriptor for this pose. The result of {@link #VRSpatialAnchors_GetSpatialAnchorPose GetSpatialAnchorPose} may evolve from this initial
     * position if the driver chooses to update it. The anchor will be associated with the driver that provides {@code unDeviceIndex}, and the driver may use
     * that specific device as a hint for how to best create the anchor. The {@code eOrigin} must match whatever tracking origin you are working in
     * (seated/standing/raw).</p>
     * 
     * <p>This should be called when the user is close to (and ideally looking at/interacting with) the target physical location. At that moment, the driver will
     * have the most information about how to recover that physical point in the future, and the quality of the anchor (when the descriptor is re-used) will
     * be highest. The caller may decide to apply offsets from this initial pose, but is advised to stay relatively close to the original pose location for
     * highest fidelity.</p>
     */
    @NativeType("EVRSpatialAnchorError")
    public static int VRSpatialAnchors_CreateSpatialAnchorFromPose(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("SpatialAnchorPose_t *") SpatialAnchorPose pPose, @NativeType("SpatialAnchorHandle_t *") IntBuffer pHandleOut) {
        if (CHECKS) {
            check(pHandleOut, 1);
        }
        return nVRSpatialAnchors_CreateSpatialAnchorFromPose(unDeviceIndex, eOrigin, pPose.address(), memAddress(pHandleOut));
    }

    // --- [ VRSpatialAnchors_GetSpatialAnchorPose ] ---

    /** Unsafe version of: {@link #VRSpatialAnchors_GetSpatialAnchorPose GetSpatialAnchorPose} */
    public static int nVRSpatialAnchors_GetSpatialAnchorPose(int unHandle, int eOrigin, long pPoseOut) {
        long __functionAddress = OpenVR.VRSpatialAnchors.GetSpatialAnchorPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unHandle, eOrigin, pPoseOut, __functionAddress);
    }

    /**
     * Get the pose for a given handle.
     * 
     * <p>This is intended to be cheap enough to call every frame (or fairly often) so that the driver can refine this position when it has more information
     * available.</p>
     */
    @NativeType("EVRSpatialAnchorError")
    public static int VRSpatialAnchors_GetSpatialAnchorPose(@NativeType("SpatialAnchorHandle_t") int unHandle, @NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("SpatialAnchorPose_t *") SpatialAnchorPose pPoseOut) {
        return nVRSpatialAnchors_GetSpatialAnchorPose(unHandle, eOrigin, pPoseOut.address());
    }

    // --- [ VRSpatialAnchors_GetSpatialAnchorDescriptor ] ---

    /** Unsafe version of: {@link #VRSpatialAnchors_GetSpatialAnchorDescriptor GetSpatialAnchorDescriptor} */
    public static int nVRSpatialAnchors_GetSpatialAnchorDescriptor(int unHandle, long pchDescriptorOut, long punDescriptorBufferLenInOut) {
        long __functionAddress = OpenVR.VRSpatialAnchors.GetSpatialAnchorDescriptor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unHandle, pchDescriptorOut, punDescriptorBufferLenInOut, __functionAddress);
    }

    /**
     * Get the descriptor for a given handle.
     * 
     * <p>This will be empty for handles where the driver has not yet built a descriptor. It will be the application-supplied descriptor for previously saved
     * anchors that the application is requesting poses for.  If the driver has called {@code UpdateSpatialAnchorDescriptor()} already in this session, it
     * will be the descriptor provided by the driver.</p>
     *
     * @return true if the descriptor fits into the buffer, else false. Buffer size should be at least {@code k_unMaxSpatialAnchorDescriptorSize}
     */
    @NativeType("EVRSpatialAnchorError")
    public static int VRSpatialAnchors_GetSpatialAnchorDescriptor(@NativeType("SpatialAnchorHandle_t") int unHandle, @NativeType("char *") ByteBuffer pchDescriptorOut, @NativeType("uint32_t *") IntBuffer punDescriptorBufferLenInOut) {
        if (CHECKS) {
            check(punDescriptorBufferLenInOut, 1);
            check(pchDescriptorOut, punDescriptorBufferLenInOut.get(punDescriptorBufferLenInOut.position()));
        }
        return nVRSpatialAnchors_GetSpatialAnchorDescriptor(unHandle, memAddress(pchDescriptorOut), memAddress(punDescriptorBufferLenInOut));
    }

}