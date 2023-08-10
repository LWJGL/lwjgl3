/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_shader_multisample_interpolation.txt">OES_shader_multisample_interpolation</a> extension.
 * 
 * <p>In standard multisample rendering, an implementation is allowed to assign the same sets of fragment shader input values to each sample. This can cause
 * aliasing where the fragment shader input values are used to generate a result that doesn't antialias itself, for example with alpha-tested
 * transparency.</p>
 * 
 * <p>This extension adds the "sample" qualifier that can be used on vertex outputs and fragment inputs. When the "sample" qualifier is used, the fragment
 * shader is invoked separately for each covered sample and all such qualified interpolants must be evaluated at the corresponding sample point.</p>
 * 
 * <p>This extension provides built-in fragment shader functions to provide fine-grained control over interpolation, including interpolating a fragment
 * shader input at a programmable offset relative to the pixel center, a specific sample number, or at the centroid.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public final class OESShaderMultisampleInterpolation {

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v. */
    public static final int
        GL_MIN_FRAGMENT_INTERPOLATION_OFFSET_OES  = 0x8E5B,
        GL_MAX_FRAGMENT_INTERPOLATION_OFFSET_OES  = 0x8E5C,
        GL_FRAGMENT_INTERPOLATION_OFFSET_BITS_OES = 0x8E5D;

    private OESShaderMultisampleInterpolation() {}

}