/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_vertex_buffer_object.txt">GLX_ARB_vertex_buffer_object</a> extension.
 * 
 * <p>It is the client's responsibility to convert buffer data to and from the server's byte order. Since only the client knows the correct format of the
 * data, and there may be multiple clients with different byte orderings sharing a single buffer object, it is unreasonable to ask the GL to handle buffer
 * object byte-swapping. To avoid errors caused by naive clients attempting to use buffer objects without performing the appropriate byte swapping, clients
 * must opt in to buffer object support at context creation time using the {@link #GLX_CONTEXT_ALLOW_BUFFER_BYTE_ORDER_MISMATCH_ARB CONTEXT_ALLOW_BUFFER_BYTE_ORDER_MISMATCH_ARB} context attrib. If this attribute
 * is not specified and the byte ordering of the client and server differ, the VBO extension must not be exposed and the maximum context version that can
 * be reported is 1.4.</p>
 * 
 * <p>Requires {@link GLXARBCreateContext GLX_ARB_create_context} and {@link ARBVertexBufferObject ARB_vertex_buffer_object}.</p>
 */
public final class GLXARBVertexBufferObject {

    /** Accepted as an attribute name in the {@code attrib_list} parameter of {@link GLXARBCreateContext#glXCreateContextAttribsARB CreateContextAttribsARB}. */
    public static final int GLX_CONTEXT_ALLOW_BUFFER_BYTE_ORDER_MISMATCH_ARB = 0x2095;

    private GLXARBVertexBufferObject() {}

}