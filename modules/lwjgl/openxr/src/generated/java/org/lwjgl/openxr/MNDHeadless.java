/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_MND_headless">XR_MND_headless</a> extension.
 * 
 * <p>Some applications may wish to access XR interaction devices without presenting any image content on the display(s). This extension provides a mechanism for writing such an application using the OpenXR API. It modifies the specification in the following ways, without adding any new named entities.</p>
 * 
 * <ul>
 * <li>When this extension is enabled, an application <b>may</b> call {@link XR10#xrCreateSession CreateSession} without an stext:XrGraphicsBinding* structure in its {@code next} chain. In this case, the runtime <b>must</b> create a "headless" session that does not interact with the display.</li>
 * <li>In a headless session, the session state <b>should</b> proceed to {@link XR10#XR_SESSION_STATE_READY SESSION_STATE_READY} directly from {@link XR10#XR_SESSION_STATE_IDLE SESSION_STATE_IDLE}.</li>
 * <li>In a headless session, the {@link XrSessionBeginInfo}{@code ::primaryViewConfigurationType} <b>must</b> be ignored and <b>may</b> be 0.</li>
 * <li>In a headless session, the session state proceeds to {@link XR10#XR_SESSION_STATE_SYNCHRONIZED SESSION_STATE_SYNCHRONIZED}, then {@link XR10#XR_SESSION_STATE_VISIBLE SESSION_STATE_VISIBLE} and {@link XR10#XR_SESSION_STATE_FOCUSED SESSION_STATE_FOCUSED}, after the call to {@link XR10#xrBeginSession BeginSession}. The application does not need to call {@link XR10#xrWaitFrame WaitFrame}, {@link XR10#xrBeginFrame BeginFrame}, or {@link XR10#xrEndFrame EndFrame}, unlike with non-headless sessions.</li>
 * <li>In a headless session, {@link XR10#xrEnumerateSwapchainFormats EnumerateSwapchainFormats} <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS} but enumerate 0 formats.</li>
 * <li>{@link XR10#xrWaitFrame WaitFrame} <b>must</b> set {@link XrFrameState}{@code ::shouldRender} to {@link XR10#XR_FALSE FALSE} in a headless session. The VISIBLE and FOCUSED states are only used for their input-related semantics, not their rendering-related semantics, and these functions are permitted to allow minimal change between headless and non-headless code if desired.</li>
 * </ul>
 * 
 * <p>Because {@link XR10#xrWaitFrame WaitFrame} is not required, an application using a headless session <b>should</b> sleep periodically to avoid consuming all available system resources in a busy-wait loop.</p>
 */
public final class MNDHeadless {

    /** The extension specification version. */
    public static final int XR_MND_headless_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_MND_HEADLESS_EXTENSION_NAME = "XR_MND_headless";

    private MNDHeadless() {}

}