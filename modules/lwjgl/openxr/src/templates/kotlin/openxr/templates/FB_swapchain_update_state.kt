/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_swapchain_update_state = "FBSwapchainUpdateState".nativeClassXR("FB_swapchain_update_state", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_swapchain_update_state_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "FB_SWAPCHAIN_UPDATE_STATE_EXTENSION_NAME".."XR_FB_swapchain_update_state"
    )

    XrResult(
        "UpdateSwapchainFB",
        """
        Updates state for the corresponding swapchain.

        <h5>C Specification</h5>
        The #UpdateSwapchainFB() function is defined as:

        <pre><code>
￿XrResult xrUpdateSwapchainFB(
￿    XrSwapchain                                 swapchain,
￿    const XrSwapchainStateBaseHeaderFB*         state);</code></pre>

        <h5>Description</h5>
        #UpdateSwapchainFB() provides support for an application to update specific mutable state associated with an {@code XrSwapchain}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSwapchainUpdateState XR_FB_swapchain_update_state} extension <b>must</b> be enabled prior to calling #UpdateSwapchainFB()</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
            <li>{@code state} <b>must</b> be a pointer to a valid ##XrSwapchainStateBaseHeaderFB-based structure. See also: ##XrSwapchainStateFoveationFB, ##XrSwapchainStateSamplerOpenGLESFB, ##XrSwapchainStateSamplerVulkanFB</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSwapchainStateBaseHeaderFB, #CreateSwapchain()
        """,

        XrSwapchain("swapchain", "the {@code XrSwapchain} to update state for."),
        XrSwapchainStateBaseHeaderFB.const.p("state", "a pointer to a {@code XrSwapchainState} structure based off of ##XrSwapchainStateBaseHeaderFB.")
    )

    XrResult(
        "GetSwapchainStateFB",
        """
        Query state for the corresponding swapchain.

        <h5>C Specification</h5>
        The #GetSwapchainStateFB() function is defined as:

        <pre><code>
￿XrResult xrGetSwapchainStateFB(
￿    XrSwapchain                                 swapchain,
￿    XrSwapchainStateBaseHeaderFB*               state);</code></pre>

        <h5>Description</h5>
        #GetSwapchainStateFB() provides support for an application to query specific mutable state associated with an {@code XrSwapchain}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSwapchainUpdateState XR_FB_swapchain_update_state} extension <b>must</b> be enabled prior to calling #GetSwapchainStateFB()</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
            <li>{@code state} <b>must</b> be a pointer to an ##XrSwapchainStateBaseHeaderFB-based structure. See also: ##XrSwapchainStateFoveationFB, ##XrSwapchainStateSamplerOpenGLESFB, ##XrSwapchainStateSamplerVulkanFB</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSwapchainStateBaseHeaderFB, #CreateSwapchain(), #UpdateSwapchainFB()
        """,

        XrSwapchain("swapchain", "the {@code XrSwapchain} to update state for."),
        XrSwapchainStateBaseHeaderFB.p("state", "a pointer to a {@code XrSwapchainState} structure based off of ##XrSwapchainStateBaseHeaderFB.")
    )
}