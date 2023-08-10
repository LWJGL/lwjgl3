/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_robustness.txt">EXT_robustness</a> extension.
 * 
 * <p>Several recent trends in how OpenGL integrates into modern computer systems have created new requirements for robustness and security for OpenGL
 * rendering contexts.</p>
 * 
 * <p>Additionally GPU architectures now support hardware fault detection; for example, video memory supporting ECC (error correcting codes) and error
 * detection. OpenGL contexts should be capable of recovering from hardware faults such as uncorrectable memory errors. Along with recovery from such
 * hardware faults, the recovery mechanism can also allow recovery from video memory access exceptions and system software failures. System software
 * failures can be due to device changes or driver failures.</p>
 * 
 * <p>OpenGL queries that that return (write) some number of bytes to a buffer indicated by a pointer parameter introduce risk of buffer overflows that might
 * be exploitable by malware. To address this, queries with return value sizes that are not expressed directly by the parameters to the query itself are
 * given additional API functions with an additional parameter that specifies the number of bytes in the buffer and never writing bytes beyond that limit.
 * This is particularly useful for multi-threaded usage of OpenGL contexts in a "share group" where one context can change objects in ways that can cause
 * buffer overflows for another context's OpenGL queries.</p>
 * 
 * <p>The original ARB_vertex_buffer_object extension includes an issue that explicitly states program termination is allowed when out-of-bounds vertex
 * buffer object fetches occur. Modern graphics hardware is capable well-defined behavior in the case of out-of- bounds vertex buffer object fetches.
 * Older hardware may require extra checks to enforce well-defined (and termination free) behavior, but this expense is warranted when processing
 * potentially untrusted content.</p>
 * 
 * <p>The intent of this extension is to address some specific robustness goals:</p>
 * 
 * <ul>
 * <li>For all existing OpenGL queries, provide additional "safe" APIs that limit data written to user pointers to a buffer size in bytes that is an
 * explicit additional parameter of the query.</li>
 * <li>Provide a mechanism for an OpenGL application to learn about graphics resets that affect the context. When a graphics reset occurs, the OpenGL
 * context becomes unusable and the application must create a new context to continue operation. Detecting a graphics reset happens through an
 * inexpensive query.</li>
 * <li>Provide an enable to guarantee that out-of-bounds buffer object accesses by the GPU will have deterministic behavior and preclude application
 * instability or termination due to an incorrect buffer access. Such accesses include vertex buffer fetches of attributes and indices, and indexed
 * reads of uniforms or parameters from buffers.</li>
 * </ul>
 */
public class EXTRobustness {

    static { GLES.initialize(); }

    /** Returned by GetGraphicsResetStatusEXT. */
    public static final int
        GL_GUILTY_CONTEXT_RESET_EXT   = 0x8253,
        GL_INNOCENT_CONTEXT_RESET_EXT = 0x8254,
        GL_UNKNOWN_CONTEXT_RESET_EXT  = 0x8255;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
    public static final int
        GL_CONTEXT_ROBUST_ACCESS_EXT       = 0x90F3,
        GL_RESET_NOTIFICATION_STRATEGY_EXT = 0x8256;

    /** Returned by GetIntegerv and related simple queries when {@code value} is RESET_NOTIFICATION_STRATEGY_EXT . */
    public static final int
        GL_LOSE_CONTEXT_ON_RESET_EXT = 0x8252,
        GL_NO_RESET_NOTIFICATION_EXT = 0x8261;

    protected EXTRobustness() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetGraphicsResetStatusEXT ] ---

    @NativeType("GLenum")
    public static native int glGetGraphicsResetStatusEXT();

    // --- [ glReadnPixelsEXT ] ---

    public static native void nglReadnPixelsEXT(int x, int y, int width, int height, int format, int type, int bufSize, long data);

    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long data) {
        nglReadnPixelsEXT(x, y, width, height, format, type, bufSize, data);
    }

    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer data) {
        nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining(), memAddress(data));
    }

    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer data) {
        nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining() << 1, memAddress(data));
    }

    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer data) {
        nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
    }

    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer data) {
        nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
    }

    // --- [ glGetnUniformfvEXT ] ---

    public static native void nglGetnUniformfvEXT(int program, int location, int bufSize, long params);

    public static void glGetnUniformfvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformfvEXT(program, location, params.remaining(), memAddress(params));
    }

    @NativeType("void")
    public static float glGetnUniformfEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformfvEXT(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformivEXT ] ---

    public static native void nglGetnUniformivEXT(int program, int location, int bufSize, long params);

    public static void glGetnUniformivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        nglGetnUniformivEXT(program, location, params.remaining(), memAddress(params));
    }

    @NativeType("void")
    public static int glGetnUniformiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformivEXT(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glReadnPixelsEXT ReadnPixelsEXT} */
    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] data) {
        long __functionAddress = GLES.getICD().glReadnPixelsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 1, data, __functionAddress);
    }

    /** Array version of: {@link #glReadnPixelsEXT ReadnPixelsEXT} */
    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] data) {
        long __functionAddress = GLES.getICD().glReadnPixelsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glReadnPixelsEXT ReadnPixelsEXT} */
    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] data) {
        long __functionAddress = GLES.getICD().glReadnPixelsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glGetnUniformfvEXT GetnUniformfvEXT} */
    public static void glGetnUniformfvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** Array version of: {@link #glGetnUniformivEXT GetnUniformivEXT} */
    public static void glGetnUniformivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

}