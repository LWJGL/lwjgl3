/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_shading_rate.txt">QCOM_shading_rate</a> extension.
 * 
 * <p>By default, OpenGL runs a fragment shader once for each pixel covered by a primitive being rasterized. When using multisampling, the outputs of that
 * fragment shader are broadcast to each covered sample of the fragment's pixel. When using multisampling, applications can optionally request that the
 * fragment shader be run once per color sample (e.g., by using the "sample" qualifier on one or more active fragment shader inputs), or run a minimum
 * number of times per pixel using SAMPLE_SHADING enable and the MinSampleShading frequency value.</p>
 * 
 * <p>This extension allows applications to specify fragment shading rates of less than 1 invocation per pixel. Instead of invoking the fragment shader once
 * for each covered pixel, the fragment shader can be run once for a group of adjacent pixels in the framebuffer. The outputs of that fragment shader
 * invocation are broadcast to each covered samples for all of the pixels in the group.  The initial version of this extension allows for groups of 1, 2,
 * 4, 8, and 16 pixels.</p>
 * 
 * <p>This can be useful for effects like motion volumetric rendering where a portion of scene is processed at full shading rate and a portion can be
 * processed at a reduced shading rate, saving power and processing resources. The requested rate can vary from (finest and default) 1 fragment shader
 * invocation per pixel to (coarsest) one fragment shader invocation for each 4x4 block of pixels. Implementations are given wide latitude to rasterize at
 * the requested rate or any other rate that is less coarse.</p>
 */
public final class QCOMShadingRate {

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetInterger64v and GetFloatv. */
    public static final int GL_SHADING_RATE_QCOM = 0x96A4;

    /** Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled. */
    public static final int GL_SHADING_RATE_PRESERVE_ASPECT_RATIO_QCOM = 0x96A5;

    /** Allowed in the {@code rate} parameter in ShadingRateQCOM. */
    public static final int
        GL_SHADING_RATE_1X1_PIXELS_QCOM = 0x96A6,
        GL_SHADING_RATE_1X2_PIXELS_QCOM = 0x96A7,
        GL_SHADING_RATE_2X1_PIXELS_QCOM = 0x96A8,
        GL_SHADING_RATE_2X2_PIXELS_QCOM = 0x96A9,
        GL_SHADING_RATE_4X2_PIXELS_QCOM = 0x96AC,
        GL_SHADING_RATE_4X4_PIXELS_QCOM = 0x96AE;

    private QCOMShadingRate() {}

}