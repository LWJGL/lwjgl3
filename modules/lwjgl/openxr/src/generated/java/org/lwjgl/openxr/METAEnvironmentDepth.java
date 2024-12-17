/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class METAEnvironmentDepth {

    public static final int XR_META_environment_depth_SPEC_VERSION = 1;

    public static final String XR_META_ENVIRONMENT_DEPTH_EXTENSION_NAME = "XR_META_environment_depth";

    public static final int
        XR_OBJECT_TYPE_ENVIRONMENT_DEPTH_PROVIDER_META  = 1000291000,
        XR_OBJECT_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_META = 1000291001;

    public static final int
        XR_TYPE_ENVIRONMENT_DEPTH_PROVIDER_CREATE_INFO_META  = 1000291000,
        XR_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_CREATE_INFO_META = 1000291001,
        XR_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_STATE_META       = 1000291002,
        XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_ACQUIRE_INFO_META    = 1000291003,
        XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_VIEW_META            = 1000291004,
        XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_META                 = 1000291005,
        XR_TYPE_ENVIRONMENT_DEPTH_HAND_REMOVAL_SET_INFO_META = 1000291006,
        XR_TYPE_SYSTEM_ENVIRONMENT_DEPTH_PROPERTIES_META     = 1000291007;

    public static final int XR_ENVIRONMENT_DEPTH_NOT_AVAILABLE_META = 1000291000;

    protected METAEnvironmentDepth() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateEnvironmentDepthProviderMETA ] ---

    /** {@code XrResult xrCreateEnvironmentDepthProviderMETA(XrSession session, XrEnvironmentDepthProviderCreateInfoMETA const * createInfo, XrEnvironmentDepthProviderMETA * environmentDepthProvider)} */
    public static int nxrCreateEnvironmentDepthProviderMETA(XrSession session, long createInfo, long environmentDepthProvider) {
        long __functionAddress = session.getCapabilities().xrCreateEnvironmentDepthProviderMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, environmentDepthProvider, __functionAddress);
    }

    /** {@code XrResult xrCreateEnvironmentDepthProviderMETA(XrSession session, XrEnvironmentDepthProviderCreateInfoMETA const * createInfo, XrEnvironmentDepthProviderMETA * environmentDepthProvider)} */
    @NativeType("XrResult")
    public static int xrCreateEnvironmentDepthProviderMETA(XrSession session, @NativeType("XrEnvironmentDepthProviderCreateInfoMETA const *") XrEnvironmentDepthProviderCreateInfoMETA createInfo, @NativeType("XrEnvironmentDepthProviderMETA *") PointerBuffer environmentDepthProvider) {
        if (CHECKS) {
            check(environmentDepthProvider, 1);
        }
        return nxrCreateEnvironmentDepthProviderMETA(session, createInfo.address(), memAddress(environmentDepthProvider));
    }

    // --- [ xrDestroyEnvironmentDepthProviderMETA ] ---

    /** {@code XrResult xrDestroyEnvironmentDepthProviderMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider)} */
    @NativeType("XrResult")
    public static int xrDestroyEnvironmentDepthProviderMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider) {
        long __functionAddress = environmentDepthProvider.getCapabilities().xrDestroyEnvironmentDepthProviderMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(environmentDepthProvider.address(), __functionAddress);
    }

    // --- [ xrStartEnvironmentDepthProviderMETA ] ---

    /** {@code XrResult xrStartEnvironmentDepthProviderMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider)} */
    @NativeType("XrResult")
    public static int xrStartEnvironmentDepthProviderMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider) {
        long __functionAddress = environmentDepthProvider.getCapabilities().xrStartEnvironmentDepthProviderMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(environmentDepthProvider.address(), __functionAddress);
    }

    // --- [ xrStopEnvironmentDepthProviderMETA ] ---

    /** {@code XrResult xrStopEnvironmentDepthProviderMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider)} */
    @NativeType("XrResult")
    public static int xrStopEnvironmentDepthProviderMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider) {
        long __functionAddress = environmentDepthProvider.getCapabilities().xrStopEnvironmentDepthProviderMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(environmentDepthProvider.address(), __functionAddress);
    }

    // --- [ xrCreateEnvironmentDepthSwapchainMETA ] ---

    /** {@code XrResult xrCreateEnvironmentDepthSwapchainMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, XrEnvironmentDepthSwapchainCreateInfoMETA const * createInfo, XrEnvironmentDepthSwapchainMETA * swapchain)} */
    public static int nxrCreateEnvironmentDepthSwapchainMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, long createInfo, long swapchain) {
        long __functionAddress = environmentDepthProvider.getCapabilities().xrCreateEnvironmentDepthSwapchainMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(environmentDepthProvider.address(), createInfo, swapchain, __functionAddress);
    }

    /** {@code XrResult xrCreateEnvironmentDepthSwapchainMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, XrEnvironmentDepthSwapchainCreateInfoMETA const * createInfo, XrEnvironmentDepthSwapchainMETA * swapchain)} */
    @NativeType("XrResult")
    public static int xrCreateEnvironmentDepthSwapchainMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, @NativeType("XrEnvironmentDepthSwapchainCreateInfoMETA const *") XrEnvironmentDepthSwapchainCreateInfoMETA createInfo, @NativeType("XrEnvironmentDepthSwapchainMETA *") PointerBuffer swapchain) {
        if (CHECKS) {
            check(swapchain, 1);
        }
        return nxrCreateEnvironmentDepthSwapchainMETA(environmentDepthProvider, createInfo.address(), memAddress(swapchain));
    }

    // --- [ xrDestroyEnvironmentDepthSwapchainMETA ] ---

    /** {@code XrResult xrDestroyEnvironmentDepthSwapchainMETA(XrEnvironmentDepthSwapchainMETA swapchain)} */
    @NativeType("XrResult")
    public static int xrDestroyEnvironmentDepthSwapchainMETA(XrEnvironmentDepthSwapchainMETA swapchain) {
        long __functionAddress = swapchain.getCapabilities().xrDestroyEnvironmentDepthSwapchainMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(swapchain.address(), __functionAddress);
    }

    // --- [ xrEnumerateEnvironmentDepthSwapchainImagesMETA ] ---

    /** {@code XrResult xrEnumerateEnvironmentDepthSwapchainImagesMETA(XrEnvironmentDepthSwapchainMETA swapchain, uint32_t imageCapacityInput, uint32_t * imageCountOutput, XrSwapchainImageBaseHeader * images)} */
    public static int nxrEnumerateEnvironmentDepthSwapchainImagesMETA(XrEnvironmentDepthSwapchainMETA swapchain, int imageCapacityInput, long imageCountOutput, long images) {
        long __functionAddress = swapchain.getCapabilities().xrEnumerateEnvironmentDepthSwapchainImagesMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(swapchain.address(), imageCapacityInput, imageCountOutput, images, __functionAddress);
    }

    /** {@code XrResult xrEnumerateEnvironmentDepthSwapchainImagesMETA(XrEnvironmentDepthSwapchainMETA swapchain, uint32_t imageCapacityInput, uint32_t * imageCountOutput, XrSwapchainImageBaseHeader * images)} */
    @NativeType("XrResult")
    public static int xrEnumerateEnvironmentDepthSwapchainImagesMETA(XrEnvironmentDepthSwapchainMETA swapchain, @NativeType("uint32_t *") IntBuffer imageCountOutput, @NativeType("XrSwapchainImageBaseHeader *") XrSwapchainImageBaseHeader.@Nullable Buffer images) {
        if (CHECKS) {
            check(imageCountOutput, 1);
        }
        return nxrEnumerateEnvironmentDepthSwapchainImagesMETA(swapchain, remainingSafe(images), memAddress(imageCountOutput), memAddressSafe(images));
    }

    // --- [ xrGetEnvironmentDepthSwapchainStateMETA ] ---

    /** {@code XrResult xrGetEnvironmentDepthSwapchainStateMETA(XrEnvironmentDepthSwapchainMETA swapchain, XrEnvironmentDepthSwapchainStateMETA * state)} */
    public static int nxrGetEnvironmentDepthSwapchainStateMETA(XrEnvironmentDepthSwapchainMETA swapchain, long state) {
        long __functionAddress = swapchain.getCapabilities().xrGetEnvironmentDepthSwapchainStateMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(swapchain.address(), state, __functionAddress);
    }

    /** {@code XrResult xrGetEnvironmentDepthSwapchainStateMETA(XrEnvironmentDepthSwapchainMETA swapchain, XrEnvironmentDepthSwapchainStateMETA * state)} */
    @NativeType("XrResult")
    public static int xrGetEnvironmentDepthSwapchainStateMETA(XrEnvironmentDepthSwapchainMETA swapchain, @NativeType("XrEnvironmentDepthSwapchainStateMETA *") XrEnvironmentDepthSwapchainStateMETA state) {
        return nxrGetEnvironmentDepthSwapchainStateMETA(swapchain, state.address());
    }

    // --- [ xrAcquireEnvironmentDepthImageMETA ] ---

    /** {@code XrResult xrAcquireEnvironmentDepthImageMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, XrEnvironmentDepthImageAcquireInfoMETA const * acquireInfo, XrEnvironmentDepthImageMETA * environmentDepthImage)} */
    public static int nxrAcquireEnvironmentDepthImageMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, long acquireInfo, long environmentDepthImage) {
        long __functionAddress = environmentDepthProvider.getCapabilities().xrAcquireEnvironmentDepthImageMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrEnvironmentDepthImageAcquireInfoMETA.validate(acquireInfo);
        }
        return callPPPI(environmentDepthProvider.address(), acquireInfo, environmentDepthImage, __functionAddress);
    }

    /** {@code XrResult xrAcquireEnvironmentDepthImageMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, XrEnvironmentDepthImageAcquireInfoMETA const * acquireInfo, XrEnvironmentDepthImageMETA * environmentDepthImage)} */
    @NativeType("XrResult")
    public static int xrAcquireEnvironmentDepthImageMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, @NativeType("XrEnvironmentDepthImageAcquireInfoMETA const *") XrEnvironmentDepthImageAcquireInfoMETA acquireInfo, @NativeType("XrEnvironmentDepthImageMETA *") XrEnvironmentDepthImageMETA environmentDepthImage) {
        return nxrAcquireEnvironmentDepthImageMETA(environmentDepthProvider, acquireInfo.address(), environmentDepthImage.address());
    }

    // --- [ xrSetEnvironmentDepthHandRemovalMETA ] ---

    /** {@code XrResult xrSetEnvironmentDepthHandRemovalMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, XrEnvironmentDepthHandRemovalSetInfoMETA const * setInfo)} */
    public static int nxrSetEnvironmentDepthHandRemovalMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, long setInfo) {
        long __functionAddress = environmentDepthProvider.getCapabilities().xrSetEnvironmentDepthHandRemovalMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(environmentDepthProvider.address(), setInfo, __functionAddress);
    }

    /** {@code XrResult xrSetEnvironmentDepthHandRemovalMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, XrEnvironmentDepthHandRemovalSetInfoMETA const * setInfo)} */
    @NativeType("XrResult")
    public static int xrSetEnvironmentDepthHandRemovalMETA(XrEnvironmentDepthProviderMETA environmentDepthProvider, @NativeType("XrEnvironmentDepthHandRemovalSetInfoMETA const *") XrEnvironmentDepthHandRemovalSetInfoMETA setInfo) {
        return nxrSetEnvironmentDepthHandRemovalMETA(environmentDepthProvider, setInfo.address());
    }

}