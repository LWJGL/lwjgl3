/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXTX_overlay = "EXTXOverlay".nativeClassXR("EXTX_overlay", type = "instance", postfix = "EXTX") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EXTX_overlay">XR_EXTX_overlay</a> extension.

        Application developers may desire to implement an OpenXR application that renders content on top of another OpenXR application. These additional applications will execute in a separate process, create a separate session, generate separate content, but want the OpenXR runtime to composite their content on top of the main OpenXR application. Examples of these applications might include:

        <ul>
            <li>A debug environment outputting additional content</li>
            <li>A Store application that hovers to one side of the user’s view</li>
            <li>A interactive HUD designed to expose additional chat features</li>
        </ul>

        This extension introduces the concept of "Overlay Sessions" in order to expose this usage model.

        This extension allows:

        <ul>
            <li>An application to identify when the current sessions composition layers will be applied during composition</li>
            <li>The ability for an overlay session to get information about what is going on with the main application</li>
        </ul>

        To enable the functionality of this extension, an application <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.

        To create an overlay session, an application <b>must</b> pass an ##XrSessionCreateInfoOverlayEXTX structure to #CreateSession() via the ##XrSessionCreateInfo structure’s {@code next} parameter.

        An overlay application should not assume that the values returned to it by #WaitFrame() in {@code predictedDisplayTime} in ##XrFrameState will be the same as the values returned to the main application or even correlated.
        """

    IntConstant(
        "The extension specification version.",

        "EXTX_overlay_SPEC_VERSION".."5"
    )

    StringConstant(
        "The extension name.",

        "EXTX_OVERLAY_EXTENSION_NAME".."XR_EXTX_overlay"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX".."1000033000",
        "TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX".."1000033003"
    )

    EnumConstant(
        """
        XrOverlayMainSessionFlagBitsEXTX - XrOverlayMainSessionFlagBitsEXTX
        """,

        "OVERLAY_MAIN_SESSION_ENABLED_COMPOSITION_LAYER_INFO_DEPTH_BIT_EXTX".enum(0x00000001)
    )
}