/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_transform_feedback_overflow_query.txt">ARB_transform_feedback_overflow_query</a> extension.
 * 
 * <p>This extension adds new query types which can be used to detect overflow of transform feedback buffers. The new query types are also accepted by
 * conditional rendering commands.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public final class ARBTransformFeedbackOverflowQuery {

    /**
     * Accepted by the {@code target} parameter of {@link GL15#glBeginQuery BeginQuery}, {@link GL15#glEndQuery EndQuery}, {@link GL15#glGetQueryiv GetQueryiv},
     * {@link GL40#glBeginQueryIndexed BeginQueryIndexed}, {@link GL40#glEndQueryIndexed EndQueryIndexed} and {@link GL40#glGetQueryIndexediv GetQueryIndexediv}.
     */
    public static final int
        GL_TRANSFORM_FEEDBACK_OVERFLOW_ARB        = 0x82EC,
        GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW_ARB = 0x82ED;

    private ARBTransformFeedbackOverflowQuery() {}

}