/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EXTX_overlay">XR_EXTX_overlay</a> extension.
 * 
 * <p>Application developers may desire to implement an OpenXR application that renders content on top of another OpenXR application. These additional applications will execute in a separate process, create a separate session, generate separate content, but want the OpenXR runtime to composite their content on top of the main OpenXR application. Examples of these applications might include:</p>
 * 
 * <ul>
 * <li>A debug environment outputting additional content</li>
 * <li>A Store application that hovers to one side of the user’s view</li>
 * <li>A interactive HUD designed to expose additional chat features</li>
 * </ul>
 * 
 * <p>This extension introduces the concept of "Overlay Sessions" in order to expose this usage model.</p>
 * 
 * <p>This extension allows:</p>
 * 
 * <ul>
 * <li>An application to identify when the current sessions composition layers will be applied during composition</li>
 * <li>The ability for an overlay session to get information about what is going on with the main application</li>
 * </ul>
 * 
 * <p>To enable the functionality of this extension, an application <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 * 
 * <p>To create an overlay session, an application <b>must</b> pass an {@link XrSessionCreateInfoOverlayEXTX} structure to {@link XR10#xrCreateSession CreateSession} via the {@link XrSessionCreateInfo} structure’s {@code next} parameter.</p>
 * 
 * <p>An overlay application should not assume that the values returned to it by {@link XR10#xrWaitFrame WaitFrame} in {@code predictedDisplayTime} in {@link XrFrameState} will be the same as the values returned to the main application or even correlated.</p>
 */
public final class EXTXOverlay {

    /** The extension specification version. */
    public static final int XR_EXTX_overlay_SPEC_VERSION = 5;

    /** The extension name. */
    public static final String XR_EXTX_OVERLAY_EXTENSION_NAME = "XR_EXTX_overlay";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX                = 1000033000,
        XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX = 1000033003;

    /** XrOverlayMainSessionFlagBitsEXTX - XrOverlayMainSessionFlagBitsEXTX */
    public static final int XR_OVERLAY_MAIN_SESSION_ENABLED_COMPOSITION_LAYER_INFO_DEPTH_BIT_EXTX = 0x1;

    private EXTXOverlay() {}

}