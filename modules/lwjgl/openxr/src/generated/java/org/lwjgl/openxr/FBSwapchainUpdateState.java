/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class FBSwapchainUpdateState {

    public static final int XR_FB_swapchain_update_state_SPEC_VERSION = 3;

    public static final String XR_FB_SWAPCHAIN_UPDATE_STATE_EXTENSION_NAME = "XR_FB_swapchain_update_state";

    protected FBSwapchainUpdateState() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrUpdateSwapchainFB ] ---

    /** {@code XrResult xrUpdateSwapchainFB(XrSwapchain swapchain, XrSwapchainStateBaseHeaderFB const * state)} */
    public static int nxrUpdateSwapchainFB(XrSwapchain swapchain, long state) {
        long __functionAddress = swapchain.getCapabilities().xrUpdateSwapchainFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(swapchain.address(), state, __functionAddress);
    }

    /** {@code XrResult xrUpdateSwapchainFB(XrSwapchain swapchain, XrSwapchainStateBaseHeaderFB const * state)} */
    @NativeType("XrResult")
    public static int xrUpdateSwapchainFB(XrSwapchain swapchain, @NativeType("XrSwapchainStateBaseHeaderFB const *") XrSwapchainStateBaseHeaderFB state) {
        return nxrUpdateSwapchainFB(swapchain, state.address());
    }

    // --- [ xrGetSwapchainStateFB ] ---

    /** {@code XrResult xrGetSwapchainStateFB(XrSwapchain swapchain, XrSwapchainStateBaseHeaderFB * state)} */
    public static int nxrGetSwapchainStateFB(XrSwapchain swapchain, long state) {
        long __functionAddress = swapchain.getCapabilities().xrGetSwapchainStateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(swapchain.address(), state, __functionAddress);
    }

    /** {@code XrResult xrGetSwapchainStateFB(XrSwapchain swapchain, XrSwapchainStateBaseHeaderFB * state)} */
    @NativeType("XrResult")
    public static int xrGetSwapchainStateFB(XrSwapchain swapchain, @NativeType("XrSwapchainStateBaseHeaderFB *") XrSwapchainStateBaseHeaderFB state) {
        return nxrGetSwapchainStateFB(swapchain, state.address());
    }

}