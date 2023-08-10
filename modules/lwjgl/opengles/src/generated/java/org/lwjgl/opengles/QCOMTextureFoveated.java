/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_texture_foveated.txt">QCOM_texture_foveated</a> extension.
 * 
 * <p>Foveated rendering is a technique that aims to reduce fragment processing workload and bandwidth by reducing the average resolution of a render target.
 * Perceived image quality is kept high by leaving the focal point of rendering at full resolution.</p>
 * 
 * <p>It exists in two major forms:</p>
 * 
 * <ul>
 * <li>Static foveated (lens matched) rendering: where the gaze point is fixed with a large fovea region and designed to match up with the lens
 * characteristics.</li>
 * <li>Eye-tracked foveated rendering: where the gaze point is continuously tracked by a sensor to allow a smaller fovea region (further reducing average
 * resolution)</li>
 * </ul>
 * 
 * <p>Traditionally foveated rendering involves breaking a render target's area into smaller regions such as bins, tiles, viewports, or layers which are
 * rendered to individually. Each of these regions has the geometry projected or scaled differently so that the net resolution of these layers is less
 * than the original render target's resolution. When these regions are mapped back to the original render target, they create a rendered result with
 * decreased quality as pixels get further from the focal point.</p>
 * 
 * <p>Foveated rendering is currently achieved by large modifications to an applications render pipelines to manually implement the required geometry
 * amplifications, blits, and projection changes. This presents a large implementation cost to an application developer and is generally inefficient as it
 * can not make use of a platforms unique hardware features or optimized software paths. This extension aims to address these problems by exposing
 * foveated rendering in an explicit and vendor neutral way, and by providing an interface with minimal changes to how an application specifies its render
 * targets.</p>
 */
public class QCOMTextureFoveated {

    static { GLES.initialize(); }

    /**
     * Accepted as a value for {@code pname} for the TexParameter{if} and TexParameter{if}v commands and for the {@code pname} parameter of
     * GetTexParameter{if}v.
     */
    public static final int
        GL_TEXTURE_FOVEATED_FEATURE_BITS_QCOM      = 0x8BFB,
        GL_TEXTURE_FOVEATED_MIN_PIXEL_DENSITY_QCOM = 0x8BFC;

    /** Accepted as the {@code pname} parameter of GetTexParameter{if}v. */
    public static final int
        GL_TEXTURE_FOVEATED_FEATURE_QUERY_QCOM          = 0x8BFD,
        GL_TEXTURE_FOVEATED_NUM_FOCAL_POINTS_QUERY_QCOM = 0x8BFE;

    /**
     * Accepted as a value to {@code param} for the TexParameter{if} and to {@code params} for the TexParameter{if}v commands with a {@code pname} of
     * {@link #GL_TEXTURE_FOVEATED_FEATURE_BITS_QCOM TEXTURE_FOVEATED_FEATURE_BITS_QCOM}; returned as possible values for {@code params} when GetTexParameter{if}v is queried with a {@code pname} of
     * {@link #GL_TEXTURE_FOVEATED_FEATURE_BITS_QCOM TEXTURE_FOVEATED_FEATURE_BITS_QCOM}.
     */
    public static final int
        GL_FOVEATION_ENABLE_BIT_QCOM            = 0x1,
        GL_FOVEATION_SCALED_BIN_METHOD_BIT_QCOM = 0x2;

    /** Returned by {@link GLES20#glCheckFramebufferStatus CheckFramebufferStatus}. */
    public static final int GL_FRAMEBUFFER_INCOMPLETE_FOVEATION_QCOM = 0x8BFF;

    protected QCOMTextureFoveated() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTextureFoveationParametersQCOM ] ---

    public static native void glTextureFoveationParametersQCOM(@NativeType("GLuint") int texture, @NativeType("GLuint") int layer, @NativeType("GLuint") int focalPoint, float focalX, float focalY, float gainX, float gainY, float foveaArea);

}