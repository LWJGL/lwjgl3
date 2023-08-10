/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_blend_func_extended.txt">EXT_blend_func_extended</a> extension.
 * 
 * <p>This extension provides an ES version of the ARB_blend_func_extended functionality.</p>
 * 
 * <p>Traditional OpenGL includes fixed-function blending that combines source colors with the existing content of a render buffer in a variety of ways. A
 * number of extensions have enhanced this functionality by adding further sources of blending weights and methods to combine them. However, the inputs to
 * the fixed-function blending units are constrained to a source color (as output from fragment shading), destination color (as the current content of the
 * frame buffer) or constants that may be used in their place.</p>
 * 
 * <p>This extension adds new blending functions whereby a fragment shader may output two colors, one of which is treated as the source color, and the other
 * used as a blending factor for either source or destination colors. Furthermore, this extension increases orthogonality by allowing the
 * SRC_ALPHA_SATURATE function to be used as the destination weight.</p>
 * 
 * <p>Because of the limitations of the OpenGL ES 2.0 shading language, new built-in variables (gl_SecondaryFragColorEXT, gl_SecondaryFragDataEXT) are added
 * to the ES 1.00 shading language rather than introduce more complex features for user-defined fragment outputs. Because such built-in variable are
 * deprecated in ES 3.0, these variables are NOT available in the OpenGL ES 3.xx shading language verisons.</p>
 */
public class EXTBlendFuncExtended {

    static { GLES.initialize(); }

    /**
     * Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunciEXT, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and
     * {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparateiEXT.
     */
    public static final int
        GL_SRC1_COLOR_EXT           = 0x88F9,
        GL_SRC1_ALPHA_EXT           = 0x8589,
        GL_ONE_MINUS_SRC1_COLOR_EXT = 0x88FA,
        GL_ONE_MINUS_SRC1_ALPHA_EXT = 0x88FB,
        GL_SRC_ALPHA_SATURATE_EXT   = 0x308;

    /** Accepted in the {@code props} array of GetProgramResourceiv. */
    public static final int GL_LOCATION_INDEX_EXT = 0x930F;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT = 0x88FC;

    protected EXTBlendFuncExtended() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindFragDataLocationIndexedEXT ] ---

    public static native void nglBindFragDataLocationIndexedEXT(int program, int colorNumber, int index, long name);

    public static void glBindFragDataLocationIndexedEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindFragDataLocationIndexedEXT(program, colorNumber, index, memAddress(name));
    }

    public static void glBindFragDataLocationIndexedEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindFragDataLocationIndexedEXT(program, colorNumber, index, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFragDataIndexEXT ] ---

    public static native int nglGetFragDataIndexEXT(int program, long name);

    @NativeType("GLint")
    public static int glGetFragDataIndexEXT(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetFragDataIndexEXT(program, memAddress(name));
    }

    @NativeType("GLint")
    public static int glGetFragDataIndexEXT(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetFragDataIndexEXT(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBindFragDataLocationEXT ] ---

    public static native void nglBindFragDataLocationEXT(int program, int colorNumber, long name);

    public static void glBindFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindFragDataLocationEXT(program, colorNumber, memAddress(name));
    }

    public static void glBindFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindFragDataLocationEXT(program, colorNumber, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramResourceLocationIndexEXT ] ---

    public static native int nglGetProgramResourceLocationIndexEXT(int program, int programInterface, long name);

    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndexEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetProgramResourceLocationIndexEXT(program, programInterface, memAddress(name));
    }

    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndexEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetProgramResourceLocationIndexEXT(program, programInterface, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}