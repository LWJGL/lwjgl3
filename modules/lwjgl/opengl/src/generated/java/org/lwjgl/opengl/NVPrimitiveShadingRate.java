/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_primitive_shading_rate.txt">NV_primitive_shading_rate</a> extension.
 * 
 * <p>This extension builds on top of the {@code NV_shading_rate_image} extension to provide OpenGL API support for using a per-primitive shading rate value
 * to control the computation of the rate used to process each fragment.</p>
 * 
 * <p>In the {@code NV_shading_rate_image} extension, the shading rate for each fragment produced by a primitive is determined by looking up a texel in the
 * bound shading rate image and using that value as an index into a shading rate palette. That extension provides a separate shading rate image lookup
 * enable and palette for each viewport. When a primitive is rasterized, the implementation uses the enable and palette associated with the primitive's
 * viewport to determine the shading rate.</p>
 * 
 * <p>This extension decouples the shading rate image enables and palettes from viewports. The number of enables/palettes now comes from the
 * implementation-dependent constant {@link #GL_SHADING_RATE_IMAGE_PALETTE_COUNT_NV SHADING_RATE_IMAGE_PALETTE_COUNT_NV}. When {@code SHADING_RATE_IMAGE_PER_PRIMITIVE_NV} (added here) is enabled, the
 * value of the new {@code gl_ShadingRateNV} built-in output is used to select an enable and palette to determine the shading rate. Otherwise, the
 * viewport number for the primitive is used, as in {@code NV_shading_rate_image}.</p>
 * 
 * <p>Requires {@link GL45 OpenGL 4.5} and {@link NVShadingRateImage NV_shading_rate_image}.</p>
 */
public final class NVPrimitiveShadingRate {

    /**
     * Accepted by the {@code cap} parameter of {@link CGL#CGLEnable Enable}, {@link CGL#CGLDisable Disable}, and {@link CGL#CGLIsEnabled IsEnabled} and by the {@code pname} parameter of {@link GL11C#glGetBooleanv GetBooleanv}, {@link GL11C#glGetIntegerv GetIntegerv},
     * {@link GL32C#glGetInteger64v GetInteger64v}, {@link GL11C#glGetFloatv GetFloatv}, {@link GL11C#glGetDoublev GetDoublev}.
     */
    public static final int GL_SHADING_RATE_IMAGE_PER_PRIMITIVE_NV = 0x95B1;

    /** Accepted by the {@code pname} parameter of {@link GL11C#glGetBooleanv GetBooleanv}, {@link GL11C#glGetDoublev GetDoublev}, {@link GL11C#glGetIntegerv GetIntegerv}, and {@link GL11C#glGetFloatv GetFloatv}. */
    public static final int GL_SHADING_RATE_IMAGE_PALETTE_COUNT_NV = 0x95B2;

    private NVPrimitiveShadingRate() {}

}