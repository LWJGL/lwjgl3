/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_space_warp">XR_FB_space_warp</a> extension.
 * 
 * <p>This extension provides support to enable space warp technology on application. By feeding application generated motion vector and depth buffer images, the runtime can do high quality frame extrapolation and reprojection, allow applications to run at half fps but still providing smooth experience to users.</p>
 * 
 * <p>In order to enable the functionality of this extension, the application <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This extension is independent of {@link KHRCompositionLayerDepth XR_KHR_composition_layer_depth}, and both may be enabled and used at the same time, for different purposes. The {@link XrCompositionLayerSpaceWarpInfoFB}{@code ::depthSubImage} depth data is dedicated for space warp, and its resolution is usually lower than {@link XrCompositionLayerDepthInfoKHR}{@code ::subImage}. See {@link XrSystemSpaceWarpPropertiesFB} for suggested resolution of {@code depthSubImage}.</p>
 * </div>
 */
public final class FBSpaceWarp {

    /** The extension specification version. */
    public static final int XR_FB_space_warp_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_FB_SPACE_WARP_EXTENSION_NAME = "XR_FB_space_warp";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB}</li>
     * <li>{@link #XR_TYPE_SYSTEM_SPACE_WARP_PROPERTIES_FB TYPE_SYSTEM_SPACE_WARP_PROPERTIES_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB = 1000171000,
        XR_TYPE_SYSTEM_SPACE_WARP_PROPERTIES_FB      = 1000171001;

    /**
     * XrCompositionLayerSpaceWarpInfoFlagBitsFB - XrCompositionLayerSpaceWarpInfoFlagBitsFB
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_COMPOSITION_LAYER_SPACE_WARP_INFO_FRAME_SKIP_BIT_FB COMPOSITION_LAYER_SPACE_WARP_INFO_FRAME_SKIP_BIT_FB} requests that the runtime skips space warp frame extrapolation for a particular frame. This can be used when the application has better knowledge the particular frame will be not a good fit for space warp frame extrapolation.</li>
     * </ul>
     */
    public static final int XR_COMPOSITION_LAYER_SPACE_WARP_INFO_FRAME_SKIP_BIT_FB = 0x1;

    private FBSpaceWarp() {}

}