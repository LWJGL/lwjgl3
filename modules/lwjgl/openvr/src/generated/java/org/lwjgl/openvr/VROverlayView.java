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

    /** Unsafe version of: {@link #VROverlayView_AcquireOverlayView AcquireOverlayView} */
    public static int nVROverlayView_AcquireOverlayView(long ulOverlayHandle, long pNativeDevice, long pOverlayView, int unOverlayViewSize) {
        long __functionAddress = OpenVR.VROverlayView.AcquireOverlayView;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, pNativeDevice, pOverlayView, unOverlayViewSize, __functionAddress);
    }

    /**
     * Acquires an {@code OverlayView_t} from an overlay handle
     * 
     * <p>The overlay view can be used to sample the contents directly by a native API. The contents of the {@code OverlayView_t} will remain unchanged through
     * the lifetime of the {@code OverlayView_t}.</p>
     * 
     * <p>The caller acquires read privileges over the {@code OverlayView_t}, but should not write to it.</p>
     * 
     * <p>{@code AcquireOverlayView()} may be called on the same {@code ulOverlayHandle} multiple times to refresh the image contents. In this case the caller is
     * strongly encouraged to re-use the same {@code pOverlayView} for all re-acquisition calls.</p>
     * 
     * <p>If the producer has not yet queued an image, {@code AcquireOverlayView} will return success, and the {@code Texture_t} will have the expected
     * {@code ETextureType}. However, the {@code Texture_t->handle} will be {@code nullptr}. Once the producer generates the first overlay frame,
     * {@code Texture_t->handle} will become a valid handle.</p>
     */
    @NativeType("EVROverlayError")
    public static int VROverlayView_AcquireOverlayView(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VRNativeDevice_t *") VRNativeDevice pNativeDevice, @NativeType("VROverlayView_t *") VROverlayView_t pOverlayView, @NativeType("uint32_t") int unOverlayViewSize) {
        return nVROverlayView_AcquireOverlayView(ulOverlayHandle, pNativeDevice.address(), pOverlayView.address(), unOverlayViewSize);
    }

    // --- [ VROverlayView_ReleaseOverlayView ] ---

    /** Unsafe version of: {@link #VROverlayView_ReleaseOverlayView ReleaseOverlayView} */
    public static int nVROverlayView_ReleaseOverlayView(long pOverlayView) {
        long __functionAddress = OpenVR.VROverlayView.ReleaseOverlayView;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pOverlayView, __functionAddress);
    }

    /**
     * Releases an acquired {@code OverlayView_t}.
     * 
     * <p>Denotes that {@code pOverlayView} will no longer require access to the resources it acquired in all previous calls to {@code AcquireOverlayView()}.</p>
     * 
     * <p>All {@code OverlayView_t*}'s provided to {@code AcquireOverlayView()} as {@code pOverlayViews} must be passed into {@code ReleaseOverlayView()} in
     * order for the underlying GPU resources to be freed.</p>
     */
    @NativeType("EVROverlayError")
    public static int VROverlayView_ReleaseOverlayView(@NativeType("VROverlayView_t *") VROverlayView_t pOverlayView) {
        return nVROverlayView_ReleaseOverlayView(pOverlayView.address());
    }

    // --- [ VROverlayView_PostOverlayEvent ] ---

    /** Unsafe version of: {@link #VROverlayView_PostOverlayEvent PostOverlayEvent} */
    public static void nVROverlayView_PostOverlayEvent(long ulOverlayHandle, long pvrEvent) {
        long __functionAddress = OpenVR.VROverlayView.PostOverlayEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJPV(ulOverlayHandle, pvrEvent, __functionAddress);
    }

    /** Posts an overlay event. */
    public static void VROverlayView_PostOverlayEvent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VREvent_t *") VREvent pvrEvent) {
        nVROverlayView_PostOverlayEvent(ulOverlayHandle, pvrEvent.address());
    }

    // --- [ VROverlayView_IsViewingPermitted ] ---

    /** Determines whether this process is permitted to view an overlay's content. */
    @NativeType("bool")
    public static boolean VROverlayView_IsViewingPermitted(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlayView.IsViewingPermitted;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(ulOverlayHandle, __functionAddress);
    }

}