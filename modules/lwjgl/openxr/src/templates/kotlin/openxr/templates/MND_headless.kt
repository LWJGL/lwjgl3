/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MND_headless = "MNDHeadless".nativeClassXR("MND_headless", type = "instance", postfix = "MND") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_MND_headless">XR_MND_headless</a> extension.

        Some applications may wish to access XR interaction devices without presenting any image content on the display(s). This extension provides a mechanism for writing such an application using the OpenXR API. It modifies the specification in the following ways, without adding any new named entities.

        <ul>
            <li>When this extension is enabled, an application <b>may</b> call #CreateSession() without an stext:XrGraphicsBinding* structure in its {@code next} chain. In this case, the runtime <b>must</b> create a "headless" session that does not interact with the display.</li>
            <li>In a headless session, the session state <b>should</b> proceed to #SESSION_STATE_READY directly from #SESSION_STATE_IDLE.</li>
            <li>In a headless session, the ##XrSessionBeginInfo{@code ::primaryViewConfigurationType} <b>must</b> be ignored and <b>may</b> be 0.</li>
            <li>In a headless session, the session state proceeds to #SESSION_STATE_SYNCHRONIZED, then #SESSION_STATE_VISIBLE and #SESSION_STATE_FOCUSED, after the call to #BeginSession(). The application does not need to call #WaitFrame(), #BeginFrame(), or #EndFrame(), unlike with non-headless sessions.</li>
            <li>In a headless session, #EnumerateSwapchainFormats() <b>must</b> return #SUCCESS but enumerate 0 formats.</li>
            <li>#WaitFrame() <b>must</b> set ##XrFrameState{@code ::shouldRender} to #FALSE in a headless session. The VISIBLE and FOCUSED states are only used for their input-related semantics, not their rendering-related semantics, and these functions are permitted to allow minimal change between headless and non-headless code if desired.</li>
        </ul>

        Because #WaitFrame() is not required, an application using a headless session <b>should</b> sleep periodically to avoid consuming all available system resources in a busy-wait loop.
        """

    IntConstant(
        "The extension specification version.",

        "MND_headless_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "MND_HEADLESS_EXTENSION_NAME".."XR_MND_headless"
    )
}