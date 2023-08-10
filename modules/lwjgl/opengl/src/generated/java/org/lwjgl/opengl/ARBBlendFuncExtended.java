/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_blend_func_extended.txt">ARB_blend_func_extended</a> extension.
 * 
 * <p>Traditional OpenGL includes fixed-function blending that combines source colors with the existing content of a render buffer in a variety of ways. A
 * number of extensions have enhanced this functionality by adding further sources of blending weights and methods to combine them. However, the inputs to
 * the fixed-function blending units are constrained to a source color (as output from fragment shading), destination color (as the current content of the
 * frame buffer) or constants that may be used in their place.</p>
 * 
 * <p>This extension adds new blending functions whereby a fragment shader may output two colors, one of which is treated as the source color, and the other
 * used as a blending factor for either source or destination colors. Furthermore, this extension increases orthogonality by allowing the
 * {@link GL11#GL_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE} function to be used as the destination weight.</p>
 * 
 * <p>Requires {@link ARBFragmentShader ARB_fragment_shader} and {@link EXTGPUShader4 EXT_gpu_shader4}. Promoted to core in {@link GL33 OpenGL 3.3}.</p>
 */
public class ARBBlendFuncExtended {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunci, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and
     * {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparatei.
     */
    public static final int
        GL_SRC1_COLOR           = 0x88F9,
        GL_ONE_MINUS_SRC1_COLOR = 0x88FA,
        GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev. */
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;

    protected ARBBlendFuncExtended() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindFragDataLocationIndexed ] ---

    /** Unsafe version of: {@link #glBindFragDataLocationIndexed BindFragDataLocationIndexed} */
    public static void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name) {
        GL33C.nglBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    /**
     * Binds a user-defined varying out variable to a fragment shader color number and index.
     *
     * @param program     the name of the program containing varying out variable whose binding to modify
     * @param colorNumber the color number to bind the user-defined varying out variable to
     * @param index       the index of the color input to bind the user-defined varying out variable to
     * @param name        the name of the user-defined varying out variable whose binding to modify
     */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        GL33C.glBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    /**
     * Binds a user-defined varying out variable to a fragment shader color number and index.
     *
     * @param program     the name of the program containing varying out variable whose binding to modify
     * @param colorNumber the color number to bind the user-defined varying out variable to
     * @param index       the index of the color input to bind the user-defined varying out variable to
     * @param name        the name of the user-defined varying out variable whose binding to modify
     */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        GL33C.glBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    // --- [ glGetFragDataIndex ] ---

    /** Unsafe version of: {@link #glGetFragDataIndex GetFragDataIndex} */
    public static int nglGetFragDataIndex(int program, long name) {
        return GL33C.nglGetFragDataIndex(program, name);
    }

    /**
     * Queries the bindings of color indices to user-defined varying out variables.
     *
     * @param program the name of the program containing varying out variable whose binding to query
     * @param name    the name of the user-defined varying out variable whose index to query
     */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return GL33C.glGetFragDataIndex(program, name);
    }

    /**
     * Queries the bindings of color indices to user-defined varying out variables.
     *
     * @param program the name of the program containing varying out variable whose binding to query
     * @param name    the name of the user-defined varying out variable whose index to query
     */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return GL33C.glGetFragDataIndex(program, name);
    }

}