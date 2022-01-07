/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The FB_swapchain_update_state extension. */
public class FBSwapchainUpdateState {

    /** The extension specification version. */
    public static final int XR_FB_swapchain_update_state_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String XR_FB_SWAPCHAIN_UPDATE_STATE_EXTENSION_NAME = "XR_FB_swapchain_update_state";

    protected FBSwapchainUpdateState() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrUpdateSwapchainFB ] ---

    /** Unsafe version of: {@link #xrUpdateSwapchainFB UpdateSwapchainFB} */
    public static int nxrUpdateSwapchainFB(XrSwapchain swapchain, long state) {
        long __functionAddress = swapchain.getCapabilities().xrUpdateSwapchainFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(swapchain.address(), state, __functionAddress);
    }

    /**
     * Updates state for the corresponding swapchain.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrUpdateSwapchainFB UpdateSwapchainFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrUpdateSwapchainFB(
     *     XrSwapchain                                 swapchain,
     *     const XrSwapchainStateBaseHeaderFB*         state);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrUpdateSwapchainFB UpdateSwapchainFB} provides support for an application to update specific mutable state associated with an {@code XrSwapchain}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSwapchainUpdateState XR_FB_swapchain_update_state} extension <b>must</b> be enabled prior to calling {@link #xrUpdateSwapchainFB UpdateSwapchainFB}</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
     * <li>{@code state} <b>must</b> be a pointer to a valid {@link XrSwapchainStateBaseHeaderFB}-based structure. See also: {@link XrSwapchainStateFoveationFB}, {@link XrSwapchainStateSamplerOpenGLESFB}, {@link XrSwapchainStateSamplerVulkanFB}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSwapchainStateBaseHeaderFB}, {@link XR10#xrCreateSwapchain CreateSwapchain}</p>
     *
     * @param swapchain the {@code XrSwapchain} to update state for.
     * @param state     a pointer to a {@code XrSwapchainState} structure based off of {@link XrSwapchainStateBaseHeaderFB}.
     */
    @NativeType("XrResult")
    public static int xrUpdateSwapchainFB(XrSwapchain swapchain, @NativeType("XrSwapchainStateBaseHeaderFB const *") XrSwapchainStateBaseHeaderFB state) {
        return nxrUpdateSwapchainFB(swapchain, state.address());
    }

    // --- [ xrGetSwapchainStateFB ] ---

    /** Unsafe version of: {@link #xrGetSwapchainStateFB GetSwapchainStateFB} */
    public static int nxrGetSwapchainStateFB(XrSwapchain swapchain, long state) {
        long __functionAddress = swapchain.getCapabilities().xrGetSwapchainStateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(swapchain.address(), state, __functionAddress);
    }

    /**
     * Query state for the corresponding swapchain.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSwapchainStateFB GetSwapchainStateFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSwapchainStateFB(
     *     XrSwapchain                                 swapchain,
     *     XrSwapchainStateBaseHeaderFB*               state);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetSwapchainStateFB GetSwapchainStateFB} provides support for an application to query specific mutable state associated with an {@code XrSwapchain}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSwapchainUpdateState XR_FB_swapchain_update_state} extension <b>must</b> be enabled prior to calling {@link #xrGetSwapchainStateFB GetSwapchainStateFB}</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
     * <li>{@code state} <b>must</b> be a pointer to an {@link XrSwapchainStateBaseHeaderFB}-based structure. See also: {@link XrSwapchainStateFoveationFB}, {@link XrSwapchainStateSamplerOpenGLESFB}, {@link XrSwapchainStateSamplerVulkanFB}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSwapchainStateBaseHeaderFB}, {@link XR10#xrCreateSwapchain CreateSwapchain}, {@link #xrUpdateSwapchainFB UpdateSwapchainFB}</p>
     *
     * @param swapchain the {@code XrSwapchain} to update state for.
     * @param state     a pointer to a {@code XrSwapchainState} structure based off of {@link XrSwapchainStateBaseHeaderFB}.
     */
    @NativeType("XrResult")
    public static int xrGetSwapchainStateFB(XrSwapchain swapchain, @NativeType("XrSwapchainStateBaseHeaderFB *") XrSwapchainStateBaseHeaderFB state) {
        return nxrGetSwapchainStateFB(swapchain, state.address());
    }

}