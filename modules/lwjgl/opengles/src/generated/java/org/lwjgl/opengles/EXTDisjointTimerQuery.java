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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_disjoint_timer_query.txt">EXT_disjoint_timer_query</a> extension.
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
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class EXTDisjointTimerQuery {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of GetQueryivEXT. */
    public static final int
        GL_QUERY_COUNTER_BITS_EXT = 0x8864,
        GL_CURRENT_QUERY_EXT      = 0x8865;

    /** Accepted by the {@code pname} parameter of GetQueryObjectivEXT, GetQueryObjectuivEXT, GetQueryObjecti64vEXT, and GetQueryObjectui64vEXT. */
    public static final int
        GL_QUERY_RESULT_EXT           = 0x8866,
        GL_QUERY_RESULT_AVAILABLE_EXT = 0x8867;

    /** Accepted by the {@code target} parameter of BeginQueryEXT, EndQueryEXT, and GetQueryivEXT. */
    public static final int GL_TIME_ELAPSED_EXT = 0x88BF;

    /**
     * Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
     * GetInteger64v, GetFloatv, and GetDoublev.
     */
    public static final int GL_TIMESTAMP_EXT = 0x8E28;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int GL_GPU_DISJOINT_EXT = 0x8FBB;

    protected EXTDisjointTimerQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGenQueriesEXT ] ---

    public static void nglGenQueriesEXT(int n, long ids) {
        EXTOcclusionQueryBoolean.nglGenQueriesEXT(n, ids);
    }

    public static void glGenQueriesEXT(@NativeType("GLuint *") IntBuffer ids) {
        EXTOcclusionQueryBoolean.glGenQueriesEXT(ids);
    }

    @NativeType("void")
    public static int glGenQueriesEXT() {
        return EXTOcclusionQueryBoolean.glGenQueriesEXT();
    }

    // --- [ glDeleteQueriesEXT ] ---

    public static void nglDeleteQueriesEXT(int n, long ids) {
        EXTOcclusionQueryBoolean.nglDeleteQueriesEXT(n, ids);
    }

    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") IntBuffer ids) {
        EXTOcclusionQueryBoolean.glDeleteQueriesEXT(ids);
    }

    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") int id) {
        EXTOcclusionQueryBoolean.glDeleteQueriesEXT(id);
    }

    // --- [ glIsQueryEXT ] ---

    @NativeType("GLboolean")
    public static boolean glIsQueryEXT(@NativeType("GLuint") int id) {
        return EXTOcclusionQueryBoolean.glIsQueryEXT(id);
    }

    // --- [ glBeginQueryEXT ] ---

    public static void glBeginQueryEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        EXTOcclusionQueryBoolean.glBeginQueryEXT(target, id);
    }

    // --- [ glEndQueryEXT ] ---

    public static void glEndQueryEXT(@NativeType("GLenum") int target) {
        EXTOcclusionQueryBoolean.glEndQueryEXT(target);
    }

    // --- [ glGetQueryivEXT ] ---

    public static void nglGetQueryivEXT(int target, int pname, long params) {
        EXTOcclusionQueryBoolean.nglGetQueryivEXT(target, pname, params);
    }

    public static void glGetQueryivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        EXTOcclusionQueryBoolean.glGetQueryivEXT(target, pname, params);
    }

    @NativeType("void")
    public static int glGetQueryiEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return EXTOcclusionQueryBoolean.glGetQueryiEXT(target, pname);
    }

    // --- [ glGetQueryObjectuivEXT ] ---

    public static void nglGetQueryObjectuivEXT(int id, int pname, long params) {
        EXTOcclusionQueryBoolean.nglGetQueryObjectuivEXT(id, pname, params);
    }

    public static void glGetQueryObjectuivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        EXTOcclusionQueryBoolean.glGetQueryObjectuivEXT(id, pname, params);
    }

    @NativeType("void")
    public static int glGetQueryObjectuiEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return EXTOcclusionQueryBoolean.glGetQueryObjectuiEXT(id, pname);
    }

    // --- [ glQueryCounterEXT ] ---

    public static native void glQueryCounterEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int target);

    // --- [ glGetQueryObjectivEXT ] ---

    public static native void nglGetQueryObjectivEXT(int id, int pname, long params);

    public static void glGetQueryObjectivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectivEXT(id, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetQueryObjectiEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectivEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjecti64vEXT ] ---

    public static native void nglGetQueryObjecti64vEXT(int id, int pname, long params);

    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
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

    // --- [ glGetInteger64vEXT ] ---

    public static native void nglGetInteger64vEXT(int pname, long data);

    public static void glGetInteger64vEXT(@NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetInteger64vEXT(pname, memAddress(data));
    }

    @NativeType("void")
    public static long glGetInteger64EXT(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer data = stack.callocLong(1);
            nglGetInteger64vEXT(pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glGenQueriesEXT GenQueriesEXT} */
    public static void glGenQueriesEXT(@NativeType("GLuint *") int[] ids) {
        EXTOcclusionQueryBoolean.glGenQueriesEXT(ids);
    }

    /** Array version of: {@link #glDeleteQueriesEXT DeleteQueriesEXT} */
    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") int[] ids) {
        EXTOcclusionQueryBoolean.glDeleteQueriesEXT(ids);
    }

    /** Array version of: {@link #glGetQueryivEXT GetQueryivEXT} */
    public static void glGetQueryivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        EXTOcclusionQueryBoolean.glGetQueryivEXT(target, pname, params);
    }

    /** Array version of: {@link #glGetQueryObjectuivEXT GetQueryObjectuivEXT} */
    public static void glGetQueryObjectuivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        EXTOcclusionQueryBoolean.glGetQueryObjectuivEXT(id, pname, params);
    }

    /** Array version of: {@link #glGetQueryObjectivEXT GetQueryObjectivEXT} */
    public static void glGetQueryObjectivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjectivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetQueryObjecti64vEXT GetQueryObjecti64vEXT} */
    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjecti64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetQueryObjectui64vEXT GetQueryObjectui64vEXT} */
    public static void glGetQueryObjectui64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjectui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetInteger64vEXT GetInteger64vEXT} */
    public static void glGetInteger64vEXT(@NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] data) {
        long __functionAddress = GLES.getICD().glGetInteger64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(pname, data, __functionAddress);
    }

}