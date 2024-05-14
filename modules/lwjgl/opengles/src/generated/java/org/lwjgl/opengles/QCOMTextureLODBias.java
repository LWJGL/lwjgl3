/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_texture_lod_bias.txt">QCOM_texture_lod_bias</a> extension.
 * 
 * <p>This extension reintroduces the texture LOD bias operation from {@code EXT_texture_lod_bias} which is written based on OpenGL ES 1.1. It provides a
 * mean to bias the lambda computation by a constant (signed) value. This bias can provide a way to blur or pseudo-sharpen OpenGL ES's standard texture
 * filtering.</p>
 * 
 * <p>This blurring or pseudo-sharpening may be useful for special effects (such as depth-of-field effects) or image processing techniques (where the mipmap
 * levels act as pre-downsampled image versions). On some implementations, increasing the texture LOD bias may improve texture filtering performance (at
 * the cost of texture blurriness).</p>
 */
public final class QCOMTextureLODBias {

    /** Accepted by the {@code pname} parameter of {@link GLES20#glTexParameterf TexParameterf}, {@link GLES30#glSamplerParameterf SamplerParameterf}, {@link GLES20#glGetTexParameterfv GetTexParameterfv} and {@link GLES30#glGetSamplerParameterfv GetSamplerParameterfv}. */
    public static final int GL_TEXTURE_LOD_BIAS_QCOM = 0x8C96;

    private QCOMTextureLODBias() {}

}