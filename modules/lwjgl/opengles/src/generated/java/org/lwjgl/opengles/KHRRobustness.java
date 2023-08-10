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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_robustness.txt">KHR_robustness</a> extension.
 * 
 * <p>Several recent trends in how OpenGL ES integrates into modern computer systems have created new requirements for robustness and security for GL
 * rendering contexts.</p>
 * 
 * <p>Additionally GPU architectures now support hardware fault detection; for example, video memory supporting ECC (error correcting codes) and error
 * detection. GL contexts should be capable of recovering from hardware faults such as uncorrectable memory errors. Along with recovery from such hardware
 * faults, the recovery mechanism can also allow recovery from video memory access exceptions and system software failures. System software failures can
 * be due to device changes or driver failures.</p>
 * 
 * <p>GL queries that return (write) some number of bytes to a buffer indicated by a pointer parameter introduce risk of buffer overflows that might be
 * exploitable by malware. To address this, queries with return value sizes that are not expressed directly by the parameters to the query itself are
 * given additional API functions with an additional parameter that specifies the number of bytes in the buffer and never writing bytes beyond that limit.
 * This is particularly useful for multi-threaded usage of GL contexts in a "share group" where one context can change objects in ways that can cause
 * buffer overflows for another context's GL queries.</p>
 * 
 * <p>The original ARB_vertex_buffer_object extension includes an issue that explicitly states program termination is allowed when out-of-bounds vertex
 * buffer object fetches occur. Modern graphics hardware is capable of well-defined behavior in the case of out-of- bounds vertex buffer object fetches.
 * Older hardware may require extra checks to enforce well-defined (and termination free) behavior, but this expense is warranted when processing
 * potentially untrusted content.</p>
 * 
 * <p>The intent of this extension is to address some specific robustness goals:</p>
 * 
 * <ul>
 * <li>For all existing GL queries, provide additional "safe" APIs that limit data written to user pointers to a buffer size in bytes that is an explicit
 * additional parameter of the query.</li>
 * <li>Provide a mechanism for a GL application to learn about graphics resets that affect the context. When a graphics reset occurs, the GL context
 * becomes unusable and the application must create a new context to continue operation. Detecting a graphics reset happens through an inexpensive query.</li>
 * <li>Define behavior of OpenGL calls made after a graphics reset.</li>
 * <li>Provide an enable to guarantee that out-of-bounds buffer object accesses by the GPU will have deterministic behavior and preclude application
 * instability or termination due to an incorrect buffer access. Such accesses include vertex buffer fetches of attributes and indices, and indexed
 * reads of uniforms or parameters from buffers.</li>
 * </ul>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class KHRRobustness {

    static { GLES.initialize(); }

    /** Returned by {@link #glGetGraphicsResetStatusKHR GetGraphicsResetStatusKHR}. */
    public static final int
        GL_GUILTY_CONTEXT_RESET_KHR   = 0x8253,
        GL_INNOCENT_CONTEXT_RESET_KHR = 0x8254,
        GL_UNKNOWN_CONTEXT_RESET_KHR  = 0x8255;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
    public static final int
        GL_CONTEXT_ROBUST_ACCESS_KHR       = 0x90F3,
        GL_RESET_NOTIFICATION_STRATEGY_KHR = 0x8256;

    /** Returned by GetIntegerv and related simple queries when {@code value} is {@link #GL_RESET_NOTIFICATION_STRATEGY_KHR RESET_NOTIFICATION_STRATEGY_KHR}. */
    public static final int
        GL_LOSE_CONTEXT_ON_RESET_KHR = 0x8252,
        GL_NO_RESET_NOTIFICATION_KHR = 0x8261;

    /** Returned by {@link GLES20#glGetError GetError}. */
    public static final int GL_CONTEXT_LOST_KHR = 0x507;

    protected KHRRobustness() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetGraphicsResetStatusKHR ] ---

    /**
     * Indicates if the GL context has been in a reset state at any point since the last call to GetGraphicsResetStatus:
     * 
     * <ul>
     * <li>{@link GLES20#GL_NO_ERROR NO_ERROR} indicates that the GL context has not been in a reset state since the last call.</li>
     * <li>{@link #GL_GUILTY_CONTEXT_RESET_KHR GUILTY_CONTEXT_RESET_KHR} indicates that a reset has been detected that is attributable to the current GL context.</li>
     * <li>{@link #GL_INNOCENT_CONTEXT_RESET_KHR INNOCENT_CONTEXT_RESET_KHR} indicates a reset has been detected that is not attributable to the current GL context.</li>
     * <li>{@link #GL_UNKNOWN_CONTEXT_RESET_KHR UNKNOWN_CONTEXT_RESET_KHR} indicates a detected graphics reset whose cause is unknown.</li>
     * </ul>
     * 
     * <p>If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
     * status is repeatedly returned, the context may be in the process of resetting.</p>
     * 
     * <p>Reset notification behavior is determined at context creation time, and may be queried by calling GetIntegerv with the symbolic constant
     * {@link #GL_RESET_NOTIFICATION_STRATEGY_KHR RESET_NOTIFICATION_STRATEGY_KHR}.</p>
     * 
     * <p>If the reset notification behavior is {@link #GL_NO_RESET_NOTIFICATION_KHR NO_RESET_NOTIFICATION_KHR}, then the implementation will never deliver notification of reset events, and
     * GetGraphicsResetStatus will always return NO_ERROR.</p>
     * 
     * <p>If the behavior is {@link #GL_LOSE_CONTEXT_ON_RESET_KHR LOSE_CONTEXT_ON_RESET_KHR}, a graphics reset will result in a lost context and require creating a new context as described
     * above. In this case GetGraphicsResetStatus will return an appropriate value from those described above.</p>
     * 
     * <p>If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.</p>
     * 
     * <p>After a graphics reset has occurred on a context, subsequent GL commands on that context (or any context which shares with that context) will generate a
     * {@link #GL_CONTEXT_LOST_KHR CONTEXT_LOST_KHR} error. Such commands will not have side effects (in particular, they will not modify memory passed by pointer for query results,
     * and may not block indefinitely or cause termination of the application. Exceptions to this behavior include:</p>
     * 
     * <ul>
     * <li>{@link GLES20#glGetError GetError} and {@link #glGetGraphicsResetStatusKHR GetGraphicsResetStatusKHR} behave normally following a graphics reset, so that the application can determine a reset has
     * occurred, and when it is safe to destroy and recreate the context.</li>
     * <li>Any commands which might cause a polling application to block indefinitely will generate a {@link #GL_CONTEXT_LOST_KHR CONTEXT_LOST_KHR} error, but will also return a value
     * indicating completion to the application.</li>
     * </ul>
     */
    @NativeType("GLenum")
    public static native int glGetGraphicsResetStatusKHR();

    // --- [ glReadnPixelsKHR ] ---

    /**
     * Unsafe version of: {@link #glReadnPixelsKHR ReadnPixelsKHR}
     *
     * @param bufSize the maximum number of bytes to write into {@code data}
     */
    public static native void nglReadnPixelsKHR(int x, int y, int width, int height, int format, int type, int bufSize, long pixels);

    /**
     * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
     *
     * @param x       the left pixel coordinate
     * @param y       the lower pixel coordinate
     * @param width   the number of pixels to read in the x-dimension
     * @param height  the number of pixels to read in the y-dimension
     * @param format  the pixel format
     * @param type    the pixel type
     * @param bufSize the maximum number of bytes to write into {@code data}
     * @param pixels  a buffer in which to place the returned pixel data
     */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglReadnPixelsKHR(x, y, width, height, format, type, bufSize, pixels);
    }

    /**
     * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format
     * @param type   the pixel type
     * @param pixels a buffer in which to place the returned pixel data
     */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining(), memAddress(pixels));
    }

    /**
     * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format
     * @param type   the pixel type
     * @param pixels a buffer in which to place the returned pixel data
     */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining() << 1, memAddress(pixels));
    }

    /**
     * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format
     * @param type   the pixel type
     * @param pixels a buffer in which to place the returned pixel data
     */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /**
     * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format
     * @param type   the pixel type
     * @param pixels a buffer in which to place the returned pixel data
     */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    // --- [ glGetnUniformfvKHR ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformfvKHR GetnUniformfvKHR}
     *
     * @param bufSize the maximum number of bytes to write to {@code params}
     */
    public static native void nglGetnUniformfvKHR(int program, int location, int bufSize, long params);

    /**
     * Returns the value or values of a uniform of the default uniform block.
     *
     * @param program  the program object
     * @param location the uniform location
     * @param params   the buffer in which to place the returned data
     */
    public static void glGetnUniformfvKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformfvKHR(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Returns the value or values of a uniform of the default uniform block.
     *
     * @param program  the program object
     * @param location the uniform location
     */
    @NativeType("void")
    public static float glGetnUniformfKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformfvKHR(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformivKHR ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformivKHR GetnUniformivKHR}
     *
     * @param bufSize the maximum number of bytes to write to {@code params}
     */
    public static native void nglGetnUniformivKHR(int program, int location, int bufSize, long params);

    /**
     * Integer version of {@link #glGetnUniformfvKHR GetnUniformfvKHR}.
     *
     * @param program  the program object
     * @param location the uniform location
     * @param params   the buffer in which to place the returned data
     */
    public static void glGetnUniformivKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformivKHR(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Integer version of {@link #glGetnUniformfvKHR GetnUniformfvKHR}.
     *
     * @param program  the program object
     * @param location the uniform location
     */
    @NativeType("void")
    public static float glGetnUniformiKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformivKHR(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformuivKHR ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformuivKHR GetnUniformuivKHR}
     *
     * @param bufSize the maximum number of bytes to write to {@code params}
     */
    public static native void nglGetnUniformuivKHR(int program, int location, int bufSize, long params);

    /**
     * Unsigned version of {@link #glGetnUniformivKHR GetnUniformivKHR}.
     *
     * @param program  the program object
     * @param location the uniform location
     * @param params   the buffer in which to place the returned data
     */
    public static void glGetnUniformuivKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformuivKHR(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Unsigned version of {@link #glGetnUniformivKHR GetnUniformivKHR}.
     *
     * @param program  the program object
     * @param location the uniform location
     */
    @NativeType("void")
    public static float glGetnUniformuiKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformuivKHR(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glReadnPixelsKHR ReadnPixelsKHR} */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GLES.getICD().glReadnPixelsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 1, pixels, __functionAddress);
    }

    /** Array version of: {@link #glReadnPixelsKHR ReadnPixelsKHR} */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GLES.getICD().glReadnPixelsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** Array version of: {@link #glReadnPixelsKHR ReadnPixelsKHR} */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GLES.getICD().glReadnPixelsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** Array version of: {@link #glGetnUniformfvKHR GetnUniformfvKHR} */
    public static void glGetnUniformfvKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformfvKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** Array version of: {@link #glGetnUniformivKHR GetnUniformivKHR} */
    public static void glGetnUniformivKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformivKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** Array version of: {@link #glGetnUniformuivKHR GetnUniformuivKHR} */
    public static void glGetnUniformuivKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformuivKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

}