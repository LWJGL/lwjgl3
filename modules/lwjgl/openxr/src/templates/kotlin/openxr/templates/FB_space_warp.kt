/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_space_warp = "FBSpaceWarp".nativeClassXR("FB_space_warp", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_space_warp">XR_FB_space_warp</a> extension.

        This extension provides support to enable space warp technology on application. By feeding application generated motion vector and depth buffer images, the runtime can do high quality frame extrapolation and reprojection, allow applications to run at half fps but still providing smooth experience to users.

        In order to enable the functionality of this extension, the application <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This extension is independent of {@link KHRCompositionLayerDepth XR_KHR_composition_layer_depth}, and both may be enabled and used at the same time, for different purposes. The ##XrCompositionLayerSpaceWarpInfoFB{@code ::depthSubImage} depth data is dedicated for space warp, and its resolution is usually lower than ##XrCompositionLayerDepthInfoKHR{@code ::subImage}. See ##XrSystemSpaceWarpPropertiesFB for suggested resolution of {@code depthSubImage}.
        </div>
        """

    IntConstant(
        "The extension specification version.",

        "FB_space_warp_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "FB_SPACE_WARP_EXTENSION_NAME".."XR_FB_space_warp"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB".."1000171000",
        "TYPE_SYSTEM_SPACE_WARP_PROPERTIES_FB".."1000171001"
    )

    EnumConstant(
        """
        XrCompositionLayerSpaceWarpInfoFlagBitsFB - XrCompositionLayerSpaceWarpInfoFlagBitsFB

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#COMPOSITION_LAYER_SPACE_WARP_INFO_FRAME_SKIP_BIT_FB requests that the runtime skips space warp frame extrapolation for a particular frame. This can be used when the application has better knowledge the particular frame will be not a good fit for space warp frame extrapolation.</li>
        </ul>
        """,

        "COMPOSITION_LAYER_SPACE_WARP_INFO_FRAME_SKIP_BIT_FB".enum(0x00000001)
    )
}