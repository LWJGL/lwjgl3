/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_timer_query.txt">EXT_timer_query</a> extension.
 * 
 * <p>Applications can benefit from accurate timing information in a number of different ways. During application development, timing information can help
 * identify application or driver bottlenecks. At run time, applications can use timing information to dynamically adjust the amount of detail in a scene
 * to achieve constant frame rates. OpenGL implementations have historically provided little to no useful timing information. Applications can get some
 * idea of timing by reading timers on the CPU, but these timers are not synchronized with the graphics rendering pipeline. Reading a CPU timer does not
 * guarantee the completion of a potentially large amount of graphics work accumulated before the timer is read, and will thus produce wildly inaccurate
 * results. glFinish() can be used to determine when previous rendering commands have been completed, but will idle the graphics pipeline and adversely
 * affect application performance.</p>
 * 
 * <p>This extension provides a query mechanism that can be used to determine the amount of time it takes to fully complete a set of GL commands, and without
 * stalling the rendering pipeline. It uses the query object mechanisms first introduced in the occlusion query extension, which allow time intervals to
 * be polled asynchronously by the application.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5}.</p>
 */
public class EXTTimerQuery {

    static { GL.initialize(); }

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
    public static final int GL_TIME_ELAPSED_EXT = 0x88BF;

    protected EXTTimerQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetQueryObjecti64vEXT ] ---

    public static native void nglGetQueryObjecti64vEXT(int id, int pname, long params);

    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
    }

    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long params) {
        nglGetQueryObjecti64vEXT(id, pname, params);
    }

    @NativeType("void")
    public static long glGetQueryObjecti64EXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectui64vEXT ] ---

    public static native void nglGetQueryObjectui64vEXT(int id, int pname, long params);

    public static void glGetQueryObjectui64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
    }

    public static void glGetQueryObjectui64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long params) {
        nglGetQueryObjectui64vEXT(id, pname, params);
    }

    @NativeType("void")
    public static long glGetQueryObjectui64EXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glGetQueryObjecti64vEXT GetQueryObjecti64vEXT} */
    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjecti64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetQueryObjectui64vEXT GetQueryObjectui64vEXT} */
    public static void glGetQueryObjectui64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjectui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

}