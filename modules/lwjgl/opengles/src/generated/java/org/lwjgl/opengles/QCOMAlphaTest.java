/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_alpha_test.txt">QCOM_alpha_test</a> extension.
 * 
 * <p>This extension reintroduces the alpha test per-fragment operation from OpenGL ES 1.x. Some hardware has a dedicated unit capable of performing this
 * operation, and it can save ALU operations in the fragment shader by avoiding the conditional discard.</p>
 */
public class QCOMAlphaTest {

    static { GLES.initialize(); }

    /**
     * Accepted by the {@code cap} parameter of Enable and Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, and
     * GetFloatv.
     */
    public static final int GL_ALPHA_TEST_QCOM = 0xBC0;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
    public static final int
        GL_ALPHA_TEST_FUNC_QCOM = 0xBC1,
        GL_ALPHA_TEST_REF_QCOM  = 0xBC2;

    protected QCOMAlphaTest() {
        throw new UnsupportedOperationException();
    }

    // --- [ glAlphaFuncQCOM ] ---

    public static native void glAlphaFuncQCOM(@NativeType("GLenum") int func, @NativeType("GLfloat") float ref);

}