/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_occlusion_query_event.txt">AMD_occlusion_query_event</a> extension.
 * 
 * <p>This extension introduces the concept of occlusion query events and changes the concept of an occlusion query from counting passed fragments to counting
 * fragments that generate any of a user-selectable set of events. Provided events include passing the depth test, and passing or failing the stencil test.
 * For a given occlusion query object, counting of these events may be enabled or disabled, allowing any combination to be counted.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5}.</p>
 */
public class AMDOcclusionQueryEvent {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code pname} argument to {@link #glQueryObjectParameteruiAMD QueryObjectParameteruiAMD}, {@link GL15C#glGetQueryObjectiv GetQueryObjectiv}, {@link GL15C#glGetQueryObjectuiv GetQueryObjectuiv},
     * {@link GL33C#glGetQueryObjecti64v GetQueryObjecti64v}, and {@link GL33C#glGetQueryObjectui64v GetQueryObjectui64v}.
     */
    public static final int GL_OCCLUSION_QUERY_EVENT_MASK_AMD = 0x874F;

    /** Accepted by the {@code param} argument to {@link #glQueryObjectParameteruiAMD QueryObjectParameteruiAMD}. */
    public static final int
        GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD        = 0x1,
        GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD        = 0x2,
        GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD      = 0x4,
        GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD = 0x8,
        GL_QUERY_ALL_EVENT_BITS_AMD              = 0xFFFFFFFF;

    protected AMDOcclusionQueryEvent() {
        throw new UnsupportedOperationException();
    }

    // --- [ glQueryObjectParameteruiAMD ] ---

    /**
     * Changes the value of a query object parameter.
     *
     * @param target a valid query target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     * @param id     a value returned from a previous call to {@link GL15C#glGenQueries GenQueries}
     * @param pname  the parameter to modify. Must be:<br><table><tr><td>{@link #GL_OCCLUSION_QUERY_EVENT_MASK_AMD OCCLUSION_QUERY_EVENT_MASK_AMD}</td></tr></table>
     * @param param  the new value. One of:<br><table><tr><td>{@link #GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD QUERY_DEPTH_PASS_EVENT_BIT_AMD}</td><td>{@link #GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD QUERY_DEPTH_FAIL_EVENT_BIT_AMD}</td></tr><tr><td>{@link #GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD QUERY_STENCIL_FAIL_EVENT_BIT_AMD}</td><td>{@link #GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD}</td></tr><tr><td>{@link #GL_QUERY_ALL_EVENT_BITS_AMD QUERY_ALL_EVENT_BITS_AMD}</td></tr></table>
     */
    public static native void glQueryObjectParameteruiAMD(@NativeType("GLenum") int target, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint") int param);

}