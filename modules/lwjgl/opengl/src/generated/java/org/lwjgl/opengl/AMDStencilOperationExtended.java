/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_stencil_operation_extended.txt">AMD_stencil_operation_extended</a> extension.
 * 
 * <p>Stencil buffers are special buffers that allow tests to be made against an incoming value and action taken based on that value. The stencil buffer is
 * updated during rasterization, and the operation used to update the stencil buffer is chosen based on whether the fragment passes the stencil test, and
 * if it does, whether it passes the depth test. Traditional OpenGL includes support for several primitive operations, such as incrementing, or clearing
 * the content of the stencil buffer, or replacing it with a specified reference value.</p>
 * 
 * <p>This extension adds support for an additional set of operations that may be performed on the stencil buffer under each circumstance. Additionally, this
 * extension separates the value used as the source for stencil operations from the reference value, allowing different values to be used in the stencil
 * test, and in the update of the stencil buffer.</p>
 */
public class AMDStencilOperationExtended {

    static { GL.initialize(); }

    /** Accepted by the {@code sfail}, {@code dpfail} and {@code dppass} parameters of StencilOp and StencilOpSeparate. */
    public static final int
        GL_SET_AMD           = 0x874A,
        GL_REPLACE_VALUE_AMD = 0x874B;

    /** Accepted by the {@code param} parameter of GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v. */
    public static final int
        GL_STENCIL_OP_VALUE_AMD      = 0x874C,
        GL_STENCIL_BACK_OP_VALUE_AMD = 0x874D;

    protected AMDStencilOperationExtended() {
        throw new UnsupportedOperationException();
    }

    // --- [ glStencilOpValueAMD ] ---

    public static native void glStencilOpValueAMD(@NativeType("GLenum") int face, @NativeType("GLuint") int value);

}