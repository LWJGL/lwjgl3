/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class QCOMTextureFoveated {

    static { GLES.initialize(); }

    public static final int
        GL_TEXTURE_FOVEATED_FEATURE_BITS_QCOM      = 0x8BFB,
        GL_TEXTURE_FOVEATED_MIN_PIXEL_DENSITY_QCOM = 0x8BFC;

    public static final int
        GL_TEXTURE_FOVEATED_FEATURE_QUERY_QCOM          = 0x8BFD,
        GL_TEXTURE_FOVEATED_NUM_FOCAL_POINTS_QUERY_QCOM = 0x8BFE;

    public static final int
        GL_FOVEATION_ENABLE_BIT_QCOM            = 0x1,
        GL_FOVEATION_SCALED_BIN_METHOD_BIT_QCOM = 0x2;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_FOVEATION_QCOM = 0x8BFF;

    protected QCOMTextureFoveated() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTextureFoveationParametersQCOM ] ---

    /** {@code void glTextureFoveationParametersQCOM(GLuint texture, GLuint layer, GLuint focalPoint, float focalX, float focalY, float gainX, float gainY, float foveaArea)} */
    public static native void glTextureFoveationParametersQCOM(@NativeType("GLuint") int texture, @NativeType("GLuint") int layer, @NativeType("GLuint") int focalPoint, float focalX, float focalY, float gainX, float gainY, float foveaArea);

}