/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_timer_query.txt">ARB_timer_query</a> extension.
 * 
 * <p>Applications can benefit from accurate timing information in a number of different ways. During application development, timing information can help
 * identify application or driver bottlenecks. At run time, applications can use timing information to dynamically adjust the amount of detail in a scene
 * to achieve constant frame rates. OpenGL implementations have historically provided little to no useful timing information. Applications can get some
 * idea of timing by reading timers on the CPU, but these timers are not synchronized with the graphics rendering pipeline. Reading a CPU timer does not
 * guarantee the completion of a potentially large amount of graphics work accumulated before the timer is read, and will thus produce wildly inaccurate
 * results. {@link GL11C#glFinish Finish} can be used to determine when previous rendering commands have been completed, but will idle the graphics pipeline and adversely
 * affect application performance.</p>
 * 
 * <p>This extension provides a query mechanism that can be used to determine the amount of time it takes to fully complete a set of GL commands, and without
 * stalling the rendering pipeline. It uses the query object mechanisms first introduced in the occlusion query extension, which allow time intervals to be
 * polled asynchronously by the application.</p>
 * 
 * <p>Promoted to core in {@link GL33 OpenGL 3.3}.</p>
 */
public class ARBTimerQuery {

    static { GL.initialize(); }

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
    public static final int GL_TIME_ELAPSED = 0x88BF;

    /**
     * Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
     * GetInteger64v, GetFloatv, and GetDoublev.
     */
    public static final int GL_TIMESTAMP = 0x8E28;

    protected ARBTimerQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glQueryCounter ] ---

    /**
     * Records the GL time into a query object after all previous commands have reached the GL server but have not yet necessarily executed.
     *
     * @param id     the name of a query object into which to record the GL time
     * @param target the counter to query. Must be:<br><table><tr><td>{@link GL33C#GL_TIMESTAMP TIMESTAMP}</td></tr></table>
     */
    public static void glQueryCounter(@NativeType("GLuint") int id, @NativeType("GLenum") int target) {
        GL33C.glQueryCounter(id, target);
    }

    // --- [ glGetQueryObjecti64v ] ---

    /** Unsafe version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
    public static void nglGetQueryObjecti64v(int id, int pname, long params) {
        GL33C.nglGetQueryObjecti64v(id, pname, params);
    }

    /**
     * Returns the 64bit integer value of query object parameter.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     * @param params the requested data
     */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        GL33C.glGetQueryObjecti64v(id, pname, params);
    }

    /**
     * Returns the 64bit integer value of query object parameter.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     * @param params the requested data
     */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long params) {
        GL33C.glGetQueryObjecti64v(id, pname, params);
    }

    /**
     * Returns the 64bit integer value of query object parameter.
     *
     * @param id    the name of a query object
     * @param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     */
    @NativeType("void")
    public static long glGetQueryObjecti64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return GL33C.glGetQueryObjecti64(id, pname);
    }

    // --- [ glGetQueryObjectui64v ] ---

    /** Unsafe version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
    public static void nglGetQueryObjectui64v(int id, int pname, long params) {
        GL33C.nglGetQueryObjectui64v(id, pname, params);
    }

    /**
     * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter
     * @param params the requested data
     */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        GL33C.glGetQueryObjectui64v(id, pname, params);
    }

    /**
     * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter
     * @param params the requested data
     */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long params) {
        GL33C.glGetQueryObjectui64v(id, pname, params);
    }

    /**
     * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
     *
     * @param id    the name of a query object
     * @param pname the symbolic name of a query object parameter
     */
    @NativeType("void")
    public static long glGetQueryObjectui64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return GL33C.glGetQueryObjectui64(id, pname);
    }

    /** Array version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        GL33C.glGetQueryObjecti64v(id, pname, params);
    }

    /** Array version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        GL33C.glGetQueryObjectui64v(id, pname, params);
    }

}