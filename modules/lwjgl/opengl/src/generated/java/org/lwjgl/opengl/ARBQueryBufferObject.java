/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_query_buffer_object.txt">ARB_query_buffer_object</a> extension.
 * 
 * <p>Statistics about the operation of the OpenGL pipeline, such as the number of samples that passed the depth test, the elapsed time between two events or
 * the number of vertices written by transform feedback can be retrieved from the GL through query objects. The result of a query object is acquired by the
 * application through the OpenGL API into a client provided memory location. Should the result returned by the API be required for use in a shader, it
 * must be passed back to the GL via a program uniform or some other mechanism. This requires a round-trip from the GPU to the CPU and back.</p>
 * 
 * <p>This extension introduces a mechanism whereby the result of a query object may be retrieved into a buffer object instead of client memory. This allows
 * the query rsult to be made available to a shader without a round-trip to the CPU for example by subsequently using the buffer object as a uniform
 * buffer, texture buffer or other data store visible to the shader. This functionality may also be used to place the results of many query objects into a
 * single, large buffer and then map or otherwise read back the entire buffer at a later point in time, avoiding a per-query object CPU-GPU synchronization
 * event.</p>
 * 
 * <p>The extension allows acquiring the result of any query object type supported by the GL implementation into a buffer object. The implementation will
 * determine the most efficient method of copying the query result to the buffer.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5}.</p>
 */
public final class ARBQueryBufferObject {

    /** Accepted by the {@code pname} parameter of {@link GL15C#glGetQueryObjectiv GetQueryObjectiv}, {@link GL15C#glGetQueryObjectuiv GetQueryObjectuiv}, {@link GL33C#glGetQueryObjecti64v GetQueryObjecti64v} and {@link GL33C#glGetQueryObjectui64v GetQueryObjectui64v}. */
    public static final int GL_QUERY_RESULT_NO_WAIT = 0x9194;

    /**
     * Accepted by the {@code target} parameter of {@link GL15C#glBindBuffer BindBuffer}, {@link GL15C#glBufferData BufferData}, {@link GL15C#glBufferSubData BufferSubData}, {@link GL15C#glMapBuffer MapBuffer}, {@link GL15C#glUnmapBuffer UnmapBuffer}, {@link GL30C#glMapBufferRange MapBufferRange},
     * {@link GL15C#glGetBufferSubData GetBufferSubData}, {@link GL15C#glGetBufferParameteriv GetBufferParameteriv}, {@link GL32C#glGetBufferParameteri64v GetBufferParameteri64v}, {@link GL15C#glGetBufferPointerv GetBufferPointerv}, {@link GL43C#glClearBufferSubData ClearBufferSubData}, and the {@code readtarget} and
     * {@code writetarget} parameters of {@link GL31C#glCopyBufferSubData CopyBufferSubData}.
     */
    public static final int GL_QUERY_BUFFER = 0x9192;

    /** Accepted by the {@code pname} parameter of {@link GL11C#glGetBooleanv GetBooleanv}, {@link GL11C#glGetIntegerv GetIntegerv}, {@link GL11C#glGetFloatv GetFloatv}, and {@link GL11C#glGetDoublev GetDoublev}. */
    public static final int GL_QUERY_BUFFER_BINDING = 0x9193;

    /** Accepted in the {@code barriers} bitfield in {@link GL42C#glMemoryBarrier MemoryBarrier}. */
    public static final int GL_QUERY_BUFFER_BARRIER_BIT = 0x8000;

    private ARBQueryBufferObject() {}

}