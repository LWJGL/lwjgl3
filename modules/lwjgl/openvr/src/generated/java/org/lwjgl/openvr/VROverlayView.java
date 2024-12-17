/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class VROverlayView {

    protected VROverlayView() {
        throw new UnsupportedOperationException();
    }

    // --- [ VROverlayView_AcquireOverlayView ] ---

    /** {@code EVROverlayError VROverlayView_AcquireOverlayView(VROverlayHandle_t ulOverlayHandle, VRNativeDevice_t * pNativeDevice, VROverlayView_t * pOverlayView, uint32_t unOverlayViewSize)} */
    public static int nVROverlayView_AcquireOverlayView(long ulOverlayHandle, long pNativeDevice, long pOverlayView, int unOverlayViewSize) {
        long __functionAddress = OpenVR.VROverlayView.AcquireOverlayView;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, pNativeDevice, pOverlayView, unOverlayViewSize, __functionAddress);
    }

    /** {@code EVROverlayError VROverlayView_AcquireOverlayView(VROverlayHandle_t ulOverlayHandle, VRNativeDevice_t * pNativeDevice, VROverlayView_t * pOverlayView, uint32_t unOverlayViewSize)} */
    @NativeType("EVROverlayError")
    public static int VROverlayView_AcquireOverlayView(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VRNativeDevice_t *") VRNativeDevice pNativeDevice, @NativeType("VROverlayView_t *") VROverlayView_t pOverlayView, @NativeType("uint32_t") int unOverlayViewSize) {
        return nVROverlayView_AcquireOverlayView(ulOverlayHandle, pNativeDevice.address(), pOverlayView.address(), unOverlayViewSize);
    }

    // --- [ VROverlayView_ReleaseOverlayView ] ---

    /** {@code EVROverlayError VROverlayView_ReleaseOverlayView(VROverlayView_t * pOverlayView)} */
    public static int nVROverlayView_ReleaseOverlayView(long pOverlayView) {
        long __functionAddress = OpenVR.VROverlayView.ReleaseOverlayView;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pOverlayView, __functionAddress);
    }

    /** {@code EVROverlayError VROverlayView_ReleaseOverlayView(VROverlayView_t * pOverlayView)} */
    @NativeType("EVROverlayError")
    public static int VROverlayView_ReleaseOverlayView(@NativeType("VROverlayView_t *") VROverlayView_t pOverlayView) {
        return nVROverlayView_ReleaseOverlayView(pOverlayView.address());
    }

    // --- [ VROverlayView_PostOverlayEvent ] ---

    /** {@code void VROverlayView_PostOverlayEvent(VROverlayHandle_t ulOverlayHandle, VREvent_t * pvrEvent)} */
    public static void nVROverlayView_PostOverlayEvent(long ulOverlayHandle, long pvrEvent) {
        long __functionAddress = OpenVR.VROverlayView.PostOverlayEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJPV(ulOverlayHandle, pvrEvent, __functionAddress);
    }

    /** {@code void VROverlayView_PostOverlayEvent(VROverlayHandle_t ulOverlayHandle, VREvent_t * pvrEvent)} */
    public static void VROverlayView_PostOverlayEvent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VREvent_t *") VREvent pvrEvent) {
        nVROverlayView_PostOverlayEvent(ulOverlayHandle, pvrEvent.address());
    }

    // --- [ VROverlayView_IsViewingPermitted ] ---

    /** {@code bool VROverlayView_IsViewingPermitted(VROverlayHandle_t ulOverlayHandle)} */
    @NativeType("bool")
    public static boolean VROverlayView_IsViewingPermitted(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlayView.IsViewingPermitted;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(ulOverlayHandle, __functionAddress);
    }

}