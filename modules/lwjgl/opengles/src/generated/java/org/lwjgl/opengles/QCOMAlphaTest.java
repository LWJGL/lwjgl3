/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class QCOMAlphaTest {

    static { GLES.initialize(); }

    public static final int GL_ALPHA_TEST_QCOM = 0xBC0;

    public static final int
        GL_ALPHA_TEST_FUNC_QCOM = 0xBC1,
        GL_ALPHA_TEST_REF_QCOM  = 0xBC2;

    protected QCOMAlphaTest() {
        throw new UnsupportedOperationException();
    }

    // --- [ glAlphaFuncQCOM ] ---

    /** {@code void glAlphaFuncQCOM(GLenum func, GLfloat ref)} */
    public static native void glAlphaFuncQCOM(@NativeType("GLenum") int func, @NativeType("GLfloat") float ref);

}