/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_MSFT_holographic_window_attachment">XR_MSFT_holographic_window_attachment</a> extension.
 * 
 * <p>This extension enables the runtime to attach to app-provided HolographicSpace and CoreWindow WinRT objects when an {@code XrSession} is created. Applications may use this extension to create and control the CoreWindow/App View objects, allowing the app to subscribe to keyboard input events and react to activation event arguments. These events and data would otherwise be inaccessible if the application simply managed the app state and lifetime exclusively through the OpenXR API. This extension is only valid to use where an application can create a CoreWindow, such as UWP applications on the HoloLens.</p>
 */
public final class MSFTHolographicWindowAttachment {

    /** The extension specification version. */
    public static final int XR_MSFT_holographic_window_attachment_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_MSFT_HOLOGRAPHIC_WINDOW_ATTACHMENT_EXTENSION_NAME = "XR_MSFT_holographic_window_attachment";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT = 1000063000;

    private MSFTHolographicWindowAttachment() {}

}