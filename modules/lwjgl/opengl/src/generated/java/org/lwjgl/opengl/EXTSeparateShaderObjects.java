/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_separate_shader_objects.gl.txt">EXT_separate_shader_objects</a> extension.
 * 
 * <p>rior to this extension, GLSL requires multiple shader domains (vertex, fragment, geometry) to be linked into a single monolithic program object to
 * specify a GLSL shader for each domain.</p>
 * 
 * <p>While GLSL's monolithic approach has some advantages for optimizing shaders as a unit that span multiple domains, all existing GPU hardware supports
 * the more flexible mix-and-match approach.</p>
 * 
 * <p>HLSL9, Cg, the prior OpenGL assembly program extensions, and game console programmers favor a more flexible "mix-and-match" approach to specifying
 * shaders independently for these different shader domains. Many developers build their shader content around the mix-and-match approach where they can
 * use a single vertex shader with multiple fragment shaders (or vice versa).</p>
 * 
 * <p>This keep-it-simple extension adapts the "mix-and-match" shader domain model for GLSL so different GLSL program objects can be bound to different
 * shader domains.</p>
 * 
 * <p>This extension redefines the operation of glUseProgram(GLenum program) to be equivalent to:</p>
 * 
 * <pre><code>
 *  glUseShaderProgramEXT(GL_VERTEX_SHADER, program);
 * glUseShaderProgramEXT(GL_GEOMETRY_SHADER_EXT, program);
 * glUseShaderProgramEXT(GL_FRAGMENT_SHADER, program);
 * glActiveProgramEXT(program);</code></pre>
 * 
 * <p>You can also call these commands separately to bind each respective domain. The GL_VERTEX_SHADER, GL_GEOMETRY_SHADER_EXT, and GL_FRAGMENT_SHADER tokens
 * refer to the conventional vertex, geometry, and fragment domains respectively. glActiveProgramEXT specifies the program that glUniform* commands will
 * update.</p>
 * 
 * <p>Separate linking creates the possibility that certain output varyings of a shader may go unread by the subsequent shader inputting varyings. In this
 * case, the output varyings are simply ignored. It is also possible input varyings from a shader may not be written as output varyings of a preceding
 * shader. In this case, the unwritten input varying values are undefined. Implementations are encouraged to zero these undefined input varying values.</p>
 * 
 * <p>This extension is a proof-of-concept that separate shader objects can work for GLSL and a response to repeated requests for this functionality. There
 * are various loose ends, particularly when dealing with user-defined varyings. The hope is a future extension will improve this situation.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} or {@link ARBShaderObjects ARB_shader_objects}.</p>
 */
public class EXTSeparateShaderObjects {

    static { GL.initialize(); }

    /** Accepted by {@code type} parameter to GetIntegerv and GetFloatv. */
    public static final int GL_ACTIVE_PROGRAM_EXT = 0x8B8D;

    protected EXTSeparateShaderObjects() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUseShaderProgramEXT ] ---

    public static native void glUseShaderProgramEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int program);

    // --- [ glActiveProgramEXT ] ---

    public static native void glActiveProgramEXT(@NativeType("GLuint") int program);

    // --- [ glCreateShaderProgramEXT ] ---

    public static native int nglCreateShaderProgramEXT(int type, long string);

    @NativeType("GLuint")
    public static int glCreateShaderProgramEXT(@NativeType("GLenum") int type, @NativeType("GLchar const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        return nglCreateShaderProgramEXT(type, memAddress(string));
    }

    @NativeType("GLuint")
    public static int glCreateShaderProgramEXT(@NativeType("GLenum") int type, @NativeType("GLchar const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(string, true);
            long stringEncoded = stack.getPointerAddress();
            return nglCreateShaderProgramEXT(type, stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}