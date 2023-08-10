/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_direct_state_access.txt">ARB_direct_state_access</a> extension.
 * 
 * <p>In unextended OpenGL, most mutation of state contained in objects is through an indirection known as a binding. Objects are attached to a context
 * (either directly or indirectly via a container) and then commands to modify or query their state are issued on that context, indirecting through its
 * attachments and into the underlying object. This is known as `bind-to-edit'.</p>
 * 
 * <p>This extension derives from the GL_EXT_direct_state_access extension, which added accessors for most state on most objects, allowing it to be queried
 * and modified without the object needing to be bound to a context. In cases where a single property of an object is to be modified, directly accessing
 * its state can be more efficient than binding the object to the context and then indirecting through it. Further, directly accessing the state of objects
 * through their names rather than by bind-to-edit does not disturb the bindings of the current context, which is useful for tools, middleware and other
 * applications that are unaware of the outer state but it can also avoid cases of redundant state changes.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}. Promoted to core in {@link GL45C OpenGL 4.5}.</p>
 */
public class ARBDirectStateAccess {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetTextureParameter{if}v and GetTextureParameterI{i ui}v. */
    public static final int GL_TEXTURE_TARGET = 0x1006;

    /** Accepted by the {@code pname} parameter of GetQueryObjectiv. */
    public static final int GL_QUERY_TARGET = 0x82EA;

    protected ARBDirectStateAccess() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateTransformFeedbacks ] ---

    /**
     * Unsafe version of: {@link #glCreateTransformFeedbacks CreateTransformFeedbacks}
     *
     * @param n the number of transform feedback object names to create
     */
    public static void nglCreateTransformFeedbacks(int n, long ids) {
        GL45C.nglCreateTransformFeedbacks(n, ids);
    }

    /**
     * Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.
     *
     * @param ids the buffer in which to return the names
     */
    public static void glCreateTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        GL45C.glCreateTransformFeedbacks(ids);
    }

    /** Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector. */
    @NativeType("void")
    public static int glCreateTransformFeedbacks() {
        return GL45C.glCreateTransformFeedbacks();
    }

    // --- [ glTransformFeedbackBufferBase ] ---

    /**
     * Binds a buffer object to a transform feedback object.
     *
     * @param xfb    zero or the name of an existing transform feedback object
     * @param index  the transform feedback stream index
     * @param buffer the name of an existing buffer object
     */
    public static void glTransformFeedbackBufferBase(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer) {
        GL45C.glTransformFeedbackBufferBase(xfb, index, buffer);
    }

    // --- [ glTransformFeedbackBufferRange ] ---

    /**
     * Binds a region of a buffer object to a transform feedback object.
     *
     * @param xfb    zero or the name of an existing transform feedback object
     * @param index  the transform feedback stream index
     * @param buffer the name of an existing buffer object
     * @param offset the starting offset in basic machine units into the buffer object
     * @param size   the amount of data in machine units
     */
    public static void glTransformFeedbackBufferRange(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        GL45C.glTransformFeedbackBufferRange(xfb, index, buffer, offset, size);
    }

    // --- [ glGetTransformFeedbackiv ] ---

    /** Unsafe version of: {@link #glGetTransformFeedbackiv GetTransformFeedbackiv} */
    public static void nglGetTransformFeedbackiv(int xfb, int pname, long param) {
        GL45C.nglGetTransformFeedbackiv(xfb, pname, param);
    }

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL42#GL_TRANSFORM_FEEDBACK_PAUSED TRANSFORM_FEEDBACK_PAUSED}</td><td>{@link GL42#GL_TRANSFORM_FEEDBACK_ACTIVE TRANSFORM_FEEDBACK_ACTIVE}</td></tr></table>
     * @param param the buffer in which to return the parameter value
     */
    public static void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        GL45C.glGetTransformFeedbackiv(xfb, pname, param);
    }

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL42#GL_TRANSFORM_FEEDBACK_PAUSED TRANSFORM_FEEDBACK_PAUSED}</td><td>{@link GL42#GL_TRANSFORM_FEEDBACK_ACTIVE TRANSFORM_FEEDBACK_ACTIVE}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetTransformFeedbacki(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname) {
        return GL45C.glGetTransformFeedbacki(xfb, pname);
    }

    // --- [ glGetTransformFeedbacki_v ] ---

    /** Unsafe version of: {@link #glGetTransformFeedbacki_v GetTransformFeedbacki_v} */
    public static void nglGetTransformFeedbacki_v(int xfb, int pname, int index, long param) {
        GL45C.nglGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_BINDING TRANSFORM_FEEDBACK_BUFFER_BINDING}</td></tr></table>
     * @param index the transform feedback stream index
     * @param param the buffer in which to return the parameter value
     */
    public static void glGetTransformFeedbacki_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer param) {
        GL45C.glGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_BINDING TRANSFORM_FEEDBACK_BUFFER_BINDING}</td></tr></table>
     * @param index the transform feedback stream index
     */
    @NativeType("void")
    public static int glGetTransformFeedbacki(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return GL45C.glGetTransformFeedbacki(xfb, pname, index);
    }

    // --- [ glGetTransformFeedbacki64_v ] ---

    /** Unsafe version of: {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v} */
    public static void nglGetTransformFeedbacki64_v(int xfb, int pname, int index, long param) {
        GL45C.nglGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_START TRANSFORM_FEEDBACK_BUFFER_START}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_SIZE TRANSFORM_FEEDBACK_BUFFER_SIZE}</td></tr></table>
     * @param index the transform feedback stream index
     * @param param the buffer in which to return the parameter value
     */
    public static void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer param) {
        GL45C.glGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_START TRANSFORM_FEEDBACK_BUFFER_START}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_SIZE TRANSFORM_FEEDBACK_BUFFER_SIZE}</td></tr></table>
     * @param index the transform feedback stream index
     */
    @NativeType("void")
    public static long glGetTransformFeedbacki64(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return GL45C.glGetTransformFeedbacki64(xfb, pname, index);
    }

    // --- [ glCreateBuffers ] ---

    /**
     * Unsafe version of: {@link #glCreateBuffers CreateBuffers}
     *
     * @param n the number of buffer names to create
     */
    public static void nglCreateBuffers(int n, long buffers) {
        GL45C.nglCreateBuffers(n, buffers);
    }

    /**
     * Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
     * unspecified target.
     *
     * @param buffers the buffer in which to return the names
     */
    public static void glCreateBuffers(@NativeType("GLuint *") IntBuffer buffers) {
        GL45C.glCreateBuffers(buffers);
    }

    /**
     * Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
     * unspecified target.
     */
    @NativeType("void")
    public static int glCreateBuffers() {
        return GL45C.glCreateBuffers();
    }

    // --- [ glNamedBufferStorage ] ---

    /**
     * Unsafe version of: {@link #glNamedBufferStorage NamedBufferStorage}
     *
     * @param size the size of the data store in basic machine units
     */
    public static void nglNamedBufferStorage(int buffer, long size, long data, int flags) {
        GL45C.nglNamedBufferStorage(buffer, size, data, flags);
    }

    /**
     * DSA version of {@link GL44C#glBufferStorage BufferStorage}.
     *
     * @param buffer the buffer object name
     * @param size   the size of the data store in basic machine units
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link GL44#GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, size, flags);
    }

    /**
     * DSA version of {@link GL44C#glBufferStorage BufferStorage}.
     *
     * @param buffer the buffer object name
     * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
     *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link GL44#GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /**
     * DSA version of {@link GL44C#glBufferStorage BufferStorage}.
     *
     * @param buffer the buffer object name
     * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
     *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link GL44#GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /**
     * DSA version of {@link GL44C#glBufferStorage BufferStorage}.
     *
     * @param buffer the buffer object name
     * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
     *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link GL44#GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /**
     * DSA version of {@link GL44C#glBufferStorage BufferStorage}.
     *
     * @param buffer the buffer object name
     * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
     *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link GL44#GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /**
     * DSA version of {@link GL44C#glBufferStorage BufferStorage}.
     *
     * @param buffer the buffer object name
     * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
     *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link GL44#GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    // --- [ glNamedBufferData ] ---

    /**
     * Unsafe version of: {@link #glNamedBufferData NamedBufferData}
     *
     * @param size the size in bytes of the buffer object's new data store
     */
    public static void nglNamedBufferData(int buffer, long size, long data, int usage) {
        GL45C.nglNamedBufferData(buffer, size, data, usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param size  the size in bytes of the buffer object's new data store
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, size, usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") LongBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    // --- [ glNamedBufferSubData ] ---

    /**
     * Unsafe version of: {@link #glNamedBufferSubData NamedBufferSubData}
     *
     * @param size the size in bytes of the data store region being replaced
     */
    public static void nglNamedBufferSubData(int buffer, long offset, long size, long data) {
        GL45C.nglNamedBufferSubData(buffer, offset, size, data);
    }

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") LongBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    // --- [ glCopyNamedBufferSubData ] ---

    /**
     * DSA version of {@link GL31C#glCopyBufferSubData CopyBufferSubData}.
     *
     * @param readBuffer  the source buffer object name
     * @param writeBuffer the destination buffer object name
     * @param readOffset  the source buffer object offset, in bytes
     * @param writeOffset the destination buffer object offset, in bytes
     * @param size        the number of bytes to copy
     */
    public static void glCopyNamedBufferSubData(@NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        GL45C.glCopyNamedBufferSubData(readBuffer, writeBuffer, readOffset, writeOffset, size);
    }

    // --- [ glClearNamedBufferData ] ---

    /** Unsafe version of: {@link #glClearNamedBufferData ClearNamedBufferData} */
    public static void nglClearNamedBufferData(int buffer, int internalformat, int format, int type, long data) {
        GL45C.nglClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /**
     * DSA version of {@link GL43C#glClearBufferData ClearBufferData}.
     *
     * @param buffer         the buffer object name
     * @param internalformat the internal format with which the data will be stored in the buffer object
     * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
     *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
     *                       sub-range of the buffer is filled with zeros.
     */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /**
     * DSA version of {@link GL43C#glClearBufferData ClearBufferData}.
     *
     * @param buffer         the buffer object name
     * @param internalformat the internal format with which the data will be stored in the buffer object
     * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
     *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
     *                       sub-range of the buffer is filled with zeros.
     */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /**
     * DSA version of {@link GL43C#glClearBufferData ClearBufferData}.
     *
     * @param buffer         the buffer object name
     * @param internalformat the internal format with which the data will be stored in the buffer object
     * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
     *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
     *                       sub-range of the buffer is filled with zeros.
     */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /**
     * DSA version of {@link GL43C#glClearBufferData ClearBufferData}.
     *
     * @param buffer         the buffer object name
     * @param internalformat the internal format with which the data will be stored in the buffer object
     * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
     *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
     *                       sub-range of the buffer is filled with zeros.
     */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    // --- [ glClearNamedBufferSubData ] ---

    /** Unsafe version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
    public static void nglClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, long data) {
        GL45C.nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /**
     * DSA version of {@link GL43C#glClearBufferSubData ClearBufferSubData}.
     *
     * @param buffer         the buffer object name
     * @param internalformat the internal format with which the data will be stored in the buffer object
     * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
     * @param size           the size, in basic machine units of the range of the data store to fill
     * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
     *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
     *                       sub-range of the buffer is filled with zeros.
     */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /**
     * DSA version of {@link GL43C#glClearBufferSubData ClearBufferSubData}.
     *
     * @param buffer         the buffer object name
     * @param internalformat the internal format with which the data will be stored in the buffer object
     * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
     * @param size           the size, in basic machine units of the range of the data store to fill
     * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
     *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
     *                       sub-range of the buffer is filled with zeros.
     */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /**
     * DSA version of {@link GL43C#glClearBufferSubData ClearBufferSubData}.
     *
     * @param buffer         the buffer object name
     * @param internalformat the internal format with which the data will be stored in the buffer object
     * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
     * @param size           the size, in basic machine units of the range of the data store to fill
     * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
     *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
     *                       sub-range of the buffer is filled with zeros.
     */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /**
     * DSA version of {@link GL43C#glClearBufferSubData ClearBufferSubData}.
     *
     * @param buffer         the buffer object name
     * @param internalformat the internal format with which the data will be stored in the buffer object
     * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
     * @param size           the size, in basic machine units of the range of the data store to fill
     * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
     *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
     *                       sub-range of the buffer is filled with zeros.
     */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    // --- [ glMapNamedBuffer ] ---

    /** Unsafe version of: {@link #glMapNamedBuffer MapNamedBuffer} */
    public static long nglMapNamedBuffer(int buffer, int access) {
        return GL45C.nglMapNamedBuffer(buffer, access);
    }

    /**
     * DSA version of {@link GL15C#glMapBuffer MapBuffer}.
     *
     * @param buffer the buffer object name
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access) {
        return GL45C.glMapNamedBuffer(buffer, access);
    }

    /**
     * DSA version of {@link GL15C#glMapBuffer MapBuffer}.
     *
     * @param buffer the buffer object name
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        return GL45C.glMapNamedBuffer(buffer, access, old_buffer);
    }

    /**
     * DSA version of {@link GL15C#glMapBuffer MapBuffer}.
     *
     * @param buffer the buffer object name
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        return GL45C.glMapNamedBuffer(buffer, access, length, old_buffer);
    }

    // --- [ glMapNamedBufferRange ] ---

    /** Unsafe version of: {@link #glMapNamedBufferRange MapNamedBufferRange} */
    public static long nglMapNamedBufferRange(int buffer, long offset, long length, int access) {
        return GL45C.nglMapNamedBufferRange(buffer, offset, length, access);
    }

    /**
     * DSA version of {@link GL30C#glMapBufferRange MapBufferRange}.
     *
     * @param buffer the buffer object name
     * @param offset the starting offset within the buffer of the range to be mapped
     * @param length the length of the range to be mapped
     * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        return GL45C.glMapNamedBufferRange(buffer, offset, length, access);
    }

    /**
     * DSA version of {@link GL30C#glMapBufferRange MapBufferRange}.
     *
     * @param buffer the buffer object name
     * @param offset the starting offset within the buffer of the range to be mapped
     * @param length the length of the range to be mapped
     * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        return GL45C.glMapNamedBufferRange(buffer, offset, length, access, old_buffer);
    }

    // --- [ glUnmapNamedBuffer ] ---

    /**
     * DSA version of {@link GL15C#glUnmapBuffer UnmapBuffer}.
     *
     * @param buffer the buffer object name
     */
    @NativeType("GLboolean")
    public static boolean glUnmapNamedBuffer(@NativeType("GLuint") int buffer) {
        return GL45C.glUnmapNamedBuffer(buffer);
    }

    // --- [ glFlushMappedNamedBufferRange ] ---

    /**
     * DSA version of {@link GL30C#glFlushMappedBufferRange FlushMappedBufferRange}.
     *
     * @param buffer the buffer object name
     * @param offset the start of the buffer subrange, in basic machine units
     * @param length the length of the buffer subrange, in basic machine units
     */
    public static void glFlushMappedNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        GL45C.glFlushMappedNamedBufferRange(buffer, offset, length);
    }

    // --- [ glGetNamedBufferParameteriv ] ---

    /** Unsafe version of: {@link #glGetNamedBufferParameteriv GetNamedBufferParameteriv} */
    public static void nglGetNamedBufferParameteriv(int buffer, int pname, long params) {
        GL45C.nglGetNamedBufferParameteriv(buffer, pname, params);
    }

    /**
     * DSA version of {@link GL15C#glGetBufferParameteriv GetBufferParameteriv}.
     *
     * @param buffer the buffer object name
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     * @param params the requested parameter
     */
    public static void glGetNamedBufferParameteriv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetNamedBufferParameteriv(buffer, pname, params);
    }

    /**
     * DSA version of {@link GL15C#glGetBufferParameteriv GetBufferParameteriv}.
     *
     * @param buffer the buffer object name
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetNamedBufferParameteri(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedBufferParameteri(buffer, pname);
    }

    // --- [ glGetNamedBufferParameteri64v ] ---

    /** Unsafe version of: {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v} */
    public static void nglGetNamedBufferParameteri64v(int buffer, int pname, long params) {
        GL45C.nglGetNamedBufferParameteri64v(buffer, pname, params);
    }

    /**
     * DSA version of {@link GL32C#glGetBufferParameteri64v GetBufferParameteri64v}.
     *
     * @param buffer the buffer object name
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     * @param params the requested parameter
     */
    public static void glGetNamedBufferParameteri64v(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        GL45C.glGetNamedBufferParameteri64v(buffer, pname, params);
    }

    /**
     * DSA version of {@link GL32C#glGetBufferParameteri64v GetBufferParameteri64v}.
     *
     * @param buffer the buffer object name
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     */
    @NativeType("void")
    public static long glGetNamedBufferParameteri64(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedBufferParameteri64(buffer, pname);
    }

    // --- [ glGetNamedBufferPointerv ] ---

    /** Unsafe version of: {@link #glGetNamedBufferPointerv GetNamedBufferPointerv} */
    public static void nglGetNamedBufferPointerv(int buffer, int pname, long params) {
        GL45C.nglGetNamedBufferPointerv(buffer, pname, params);
    }

    /**
     * DSA version of {@link GL15C#glGetBufferPointerv GetBufferPointerv}.
     *
     * @param buffer the buffer object name
     * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link GL15#GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>
     * @param params the pointer value specified by {@code pname}
     */
    public static void glGetNamedBufferPointerv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        GL45C.glGetNamedBufferPointerv(buffer, pname, params);
    }

    /**
     * DSA version of {@link GL15C#glGetBufferPointerv GetBufferPointerv}.
     *
     * @param buffer the buffer object name
     * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link GL15#GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>
     */
    @NativeType("void")
    public static long glGetNamedBufferPointer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedBufferPointer(buffer, pname);
    }

    // --- [ glGetNamedBufferSubData ] ---

    /**
     * Unsafe version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
     *
     * @param size the size in bytes of the data store region being returned
     */
    public static void nglGetNamedBufferSubData(int buffer, long offset, long size, long data) {
        GL45C.nglGetNamedBufferSubData(buffer, offset, size, data);
    }

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ByteBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ShortBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") IntBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") LongBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") FloatBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") DoubleBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    // --- [ glCreateFramebuffers ] ---

    /**
     * Unsafe version of: {@link #glCreateFramebuffers CreateFramebuffers}
     *
     * @param n the number of framebuffer names to create
     */
    public static void nglCreateFramebuffers(int n, long framebuffers) {
        GL45C.nglCreateFramebuffers(n, framebuffers);
    }

    /**
     * Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.
     *
     * @param framebuffers the buffer in which to store the framebuffer names
     */
    public static void glCreateFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        GL45C.glCreateFramebuffers(framebuffers);
    }

    /** Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object. */
    @NativeType("void")
    public static int glCreateFramebuffers() {
        return GL45C.glCreateFramebuffers();
    }

    // --- [ glNamedFramebufferRenderbuffer ] ---

    /**
     * DSA version of {@link GL30C#glFramebufferRenderbuffer FramebufferRenderbuffer}.
     *
     * @param framebuffer        the framebuffer name
     * @param attachment         the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param renderbuffertarget the renderbuffer target. Must be:<br><table><tr><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param renderbuffer       the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach
     */
    public static void glNamedFramebufferRenderbuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        GL45C.glNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer);
    }

    // --- [ glNamedFramebufferParameteri ] ---

    /**
     * DSA version of {@link GL43C#glFramebufferParameteri FramebufferParameteri}.
     *
     * @param framebuffer the framebuffer name
     * @param pname       a token indicating the parameter to be modified. One of:<br><table><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     * @param param       the new value for the parameter named {@code pname}
     */
    public static void glNamedFramebufferParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL45C.glNamedFramebufferParameteri(framebuffer, pname, param);
    }

    // --- [ glNamedFramebufferTexture ] ---

    /**
     * DSA version of {@link GL32C#glFramebufferTexture FramebufferTexture}.
     *
     * @param framebuffer the framebuffer name
     * @param attachment  the attachment point of the framebuffer
     * @param texture     the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level       the mipmap level of {@code texture} to attach
     */
    public static void glNamedFramebufferTexture(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL45C.glNamedFramebufferTexture(framebuffer, attachment, texture, level);
    }

    // --- [ glNamedFramebufferTextureLayer ] ---

    /**
     * DSA version of {@link GL30C#glFramebufferTextureLayer FramebufferTextureLayer}.
     *
     * @param framebuffer the framebuffer name
     * @param attachment  the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param texture     the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level       the mipmap level of {@code texture} to attach
     * @param layer       the layer of {@code texture} to attach.
     */
    public static void glNamedFramebufferTextureLayer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        GL45C.glNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer);
    }

    // --- [ glNamedFramebufferDrawBuffer ] ---

    /**
     * DSA version of {@link GL11C#glDrawBuffer DrawBuffer}.
     *
     * @param framebuffer the framebuffer name
     * @param buf         the color buffer to draw to. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_LEFT LEFT}</td></tr><tr><td>{@link GL11#GL_RIGHT RIGHT}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
     */
    public static void glNamedFramebufferDrawBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buf) {
        GL45C.glNamedFramebufferDrawBuffer(framebuffer, buf);
    }

    // --- [ glNamedFramebufferDrawBuffers ] ---

    /**
     * Unsafe version of: {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers}
     *
     * @param n the number of buffers in {@code bufs}
     */
    public static void nglNamedFramebufferDrawBuffers(int framebuffer, int n, long bufs) {
        GL45C.nglNamedFramebufferDrawBuffers(framebuffer, n, bufs);
    }

    /**
     * DSA version of {@link GL20C#glDrawBuffers DrawBuffers}.
     *
     * @param framebuffer the framebuffer name
     * @param bufs        an array of symbolic constants specifying the buffers into which fragment colors or data values will be written. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td></tr><tr><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
     */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer bufs) {
        GL45C.glNamedFramebufferDrawBuffers(framebuffer, bufs);
    }

    /**
     * DSA version of {@link GL20C#glDrawBuffers DrawBuffers}.
     *
     * @param framebuffer the framebuffer name
     */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int buf) {
        GL45C.glNamedFramebufferDrawBuffers(framebuffer, buf);
    }

    // --- [ glNamedFramebufferReadBuffer ] ---

    /**
     * DSA version of {@link GL11C#glReadBuffer ReadBuffer}.
     *
     * @param framebuffer the framebuffer name
     * @param src         the color buffer to read from. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_LEFT LEFT}</td></tr><tr><td>{@link GL11#GL_RIGHT RIGHT}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
     */
    public static void glNamedFramebufferReadBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int src) {
        GL45C.glNamedFramebufferReadBuffer(framebuffer, src);
    }

    // --- [ glInvalidateNamedFramebufferData ] ---

    /**
     * Unsafe version of: {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData}
     *
     * @param numAttachments the number of entries in the {@code attachments} array
     */
    public static void nglInvalidateNamedFramebufferData(int framebuffer, int numAttachments, long attachments) {
        GL45C.nglInvalidateNamedFramebufferData(framebuffer, numAttachments, attachments);
    }

    /**
     * DSA version of {@link GL43C#glInvalidateFramebuffer InvalidateFramebuffer}.
     *
     * @param framebuffer the framebuffer name
     * @param attachments the address of an array identifying the attachments to be invalidated
     */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer attachments) {
        GL45C.glInvalidateNamedFramebufferData(framebuffer, attachments);
    }

    /**
     * DSA version of {@link GL43C#glInvalidateFramebuffer InvalidateFramebuffer}.
     *
     * @param framebuffer the framebuffer name
     */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int attachment) {
        GL45C.glInvalidateNamedFramebufferData(framebuffer, attachment);
    }

    // --- [ glInvalidateNamedFramebufferSubData ] ---

    /**
     * Unsafe version of: {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData}
     *
     * @param numAttachments the number of entries in the {@code attachments} array
     */
    public static void nglInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, long attachments, int x, int y, int width, int height) {
        GL45C.nglInvalidateNamedFramebufferSubData(framebuffer, numAttachments, attachments, x, y, width, height);
    }

    /**
     * DSA version of {@link GL43C#glInvalidateSubFramebuffer InvalidateSubFramebuffer}.
     *
     * @param framebuffer the framebuffer name
     * @param attachments an array identifying the attachments to be invalidated
     * @param x           the X offset of the region to be invalidated
     * @param y           the Y offset of the region to be invalidated
     * @param width       the width of the region to be invalidated
     * @param height      the height of the region to be invalidated
     */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glInvalidateNamedFramebufferSubData(framebuffer, attachments, x, y, width, height);
    }

    /**
     * DSA version of {@link GL43C#glInvalidateSubFramebuffer InvalidateSubFramebuffer}.
     *
     * @param framebuffer the framebuffer name
     * @param x           the X offset of the region to be invalidated
     * @param y           the Y offset of the region to be invalidated
     * @param width       the width of the region to be invalidated
     * @param height      the height of the region to be invalidated
     */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int attachment, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glInvalidateNamedFramebufferSubData(framebuffer, attachment, x, y, width, height);
    }

    // --- [ glClearNamedFramebufferiv ] ---

    /** Unsafe version of: {@link #glClearNamedFramebufferiv ClearNamedFramebufferiv} */
    public static void nglClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, long value) {
        GL45C.nglClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    /**
     * DSA version of {@link GL30C#glClearBufferiv ClearBufferiv}.
     *
     * @param framebuffer the framebuffer name
     * @param buffer      the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_STENCIL STENCIL}</td></tr></table>
     * @param drawbuffer  the draw buffer to clear
     * @param value       for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For stencil buffers, a pointer to a
     *                    single stencil value to clear the buffer to.
     */
    public static void glClearNamedFramebufferiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        GL45C.glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    // --- [ glClearNamedFramebufferuiv ] ---

    /** Unsafe version of: {@link #glClearNamedFramebufferuiv ClearNamedFramebufferuiv} */
    public static void nglClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, long value) {
        GL45C.nglClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    /**
     * DSA version of {@link GL30C#glClearBufferuiv ClearBufferuiv}.
     *
     * @param framebuffer the framebuffer name
     * @param buffer      the buffer to clear. Must be:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td></tr></table>
     * @param drawbuffer  the draw buffer to clear
     * @param value       a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to
     */
    public static void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        GL45C.glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    // --- [ glClearNamedFramebufferfv ] ---

    /** Unsafe version of: {@link #glClearNamedFramebufferfv ClearNamedFramebufferfv} */
    public static void nglClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, long value) {
        GL45C.nglClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    /**
     * DSA version of {@link GL30C#glClearBufferfv ClearBufferfv}.
     *
     * @param framebuffer the framebuffer name
     * @param buffer      the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_DEPTH DEPTH}</td></tr></table>
     * @param drawbuffer  the draw buffer to clear
     * @param value       for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For depth buffers, a pointer to a
     *                    single depth value to clear the buffer to.
     */
    public static void glClearNamedFramebufferfv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") FloatBuffer value) {
        GL45C.glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    // --- [ glClearNamedFramebufferfi ] ---

    /**
     * DSA version of {@link GL30C#glClearBufferfi ClearBufferfi}.
     *
     * @param framebuffer the framebuffer name
     * @param buffer      the buffer to clear. Must be:<br><table><tr><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param drawbuffer  the draw buffer to clear
     * @param depth       the depth value to clear the buffer to
     * @param stencil     the stencil value to clear the buffer to
     */
    public static void glClearNamedFramebufferfi(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil) {
        GL45C.glClearNamedFramebufferfi(framebuffer, buffer, drawbuffer, depth, stencil);
    }

    // --- [ glBlitNamedFramebuffer ] ---

    /**
     * DSA version of {@link GL30C#glBlitFramebuffer BlitFramebuffer}.
     *
     * @param readFramebuffer the source framebuffer name
     * @param drawFramebuffer the destination framebuffer name
     * @param srcX0           the lower-left coordinate of the source rectangle within the read buffer
     * @param srcY0           the upper-left coordinate of the source rectangle within the read buffer
     * @param srcX1           the lower-right coordinate of the source rectangle within the read buffer
     * @param srcY1           the upper-right coordinate of the source rectangle within the read buffer
     * @param dstX0           the lower-left coordinate of the destination rectangle within the write buffer
     * @param dstY0           the upper-left coordinate of the destination rectangle within the write buffer
     * @param dstX1           the lower-right coordinate of the destination rectangle within the write buffer
     * @param dstY1           the upper-right coordinate of the destination rectangle within the write buffer
     * @param mask            the bitwise OR of the flags indicating which buffers are to be copied. One of:<br><table><tr><td>{@link GL11#GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link GL11#GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link GL11#GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr></table>
     * @param filter          the interpolation to be applied if the image is stretched. One of:<br><table><tr><td>{@link GL11#GL_NEAREST NEAREST}</td><td>{@link GL11#GL_LINEAR LINEAR}</td></tr></table>
     */
    public static void glBlitNamedFramebuffer(@NativeType("GLuint") int readFramebuffer, @NativeType("GLuint") int drawFramebuffer, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        GL45C.glBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    // --- [ glCheckNamedFramebufferStatus ] ---

    /**
     * DSA version of {@link GL30C#glCheckFramebufferStatus CheckFramebufferStatus}.
     *
     * @param framebuffer the framebuffer name
     * @param target      the target of the framebuffer completeness check. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     */
    @NativeType("GLenum")
    public static int glCheckNamedFramebufferStatus(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int target) {
        return GL45C.glCheckNamedFramebufferStatus(framebuffer, target);
    }

    // --- [ glGetNamedFramebufferParameteriv ] ---

    /** Unsafe version of: {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv} */
    public static void nglGetNamedFramebufferParameteriv(int framebuffer, int pname, long params) {
        GL45C.nglGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    /**
     * DSA version of {@link GL43C#glGetFramebufferParameteriv GetFramebufferParameteriv}.
     *
     * @param framebuffer the framebuffer name
     * @param pname       a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     * @param params      a variable to receive the value of the parameter named {@code pname}
     */
    public static void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    /**
     * DSA version of {@link GL43C#glGetFramebufferParameteriv GetFramebufferParameteriv}.
     *
     * @param framebuffer the framebuffer name
     * @param pname       a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetNamedFramebufferParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedFramebufferParameteri(framebuffer, pname);
    }

    // --- [ glGetNamedFramebufferAttachmentParameteriv ] ---

    /** Unsafe version of: {@link #glGetNamedFramebufferAttachmentParameteriv GetNamedFramebufferAttachmentParameteriv} */
    public static void nglGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, long params) {
        GL45C.nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}.
     *
     * @param framebuffer the framebuffer name
     * @param attachment  the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param pname       the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
     * @param params      an array to receive the value of the queried parameter
     */
    public static void glGetNamedFramebufferAttachmentParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}.
     *
     * @param framebuffer the framebuffer name
     * @param attachment  the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param pname       the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetNamedFramebufferAttachmentParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedFramebufferAttachmentParameteri(framebuffer, attachment, pname);
    }

    // --- [ glCreateRenderbuffers ] ---

    /**
     * Unsafe version of: {@link #glCreateRenderbuffers CreateRenderbuffers}
     *
     * @param n the number of renderbuffer names to create
     */
    public static void nglCreateRenderbuffers(int n, long renderbuffers) {
        GL45C.nglCreateRenderbuffers(n, renderbuffers);
    }

    /**
     * Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.
     *
     * @param renderbuffers the buffer in which to store the created renderbuffer names
     */
    public static void glCreateRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        GL45C.glCreateRenderbuffers(renderbuffers);
    }

    /** Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object. */
    @NativeType("void")
    public static int glCreateRenderbuffers() {
        return GL45C.glCreateRenderbuffers();
    }

    // --- [ glNamedRenderbufferStorage ] ---

    /**
     * DSA version of {@link GL30C#glRenderbufferStorage RenderbufferStorage}.
     *
     * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
     * @param width          the width of the renderbuffer, in pixels
     * @param height         the height of the renderbuffer, in pixels
     */
    public static void glNamedRenderbufferStorage(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glNamedRenderbufferStorage(renderbuffer, internalformat, width, height);
    }

    // --- [ glNamedRenderbufferStorageMultisample ] ---

    /**
     * DSA version of {@link GL30C#glRenderbufferStorageMultisample RenderbufferStorageMultisample}.
     *
     * @param samples        the number of samples to be used for the renderbuffer object's storage
     * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
     * @param width          the width of the renderbuffer, in pixels
     * @param height         the height of the renderbuffer, in pixels
     */
    public static void glNamedRenderbufferStorageMultisample(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height);
    }

    // --- [ glGetNamedRenderbufferParameteriv ] ---

    /** Unsafe version of: {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv} */
    public static void nglGetNamedRenderbufferParameteriv(int renderbuffer, int pname, long params) {
        GL45C.nglGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glGetRenderbufferParameteriv GetRenderbufferParameteriv}.
     *
     * @param pname  the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
     * @param params an array to receive the value of the queried parameter
     */
    public static void glGetNamedRenderbufferParameteriv(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glGetRenderbufferParameteriv GetRenderbufferParameteriv}.
     *
     * @param pname the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetNamedRenderbufferParameteri(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedRenderbufferParameteri(renderbuffer, pname);
    }

    // --- [ glCreateTextures ] ---

    /**
     * Unsafe version of: {@link #glCreateTextures CreateTextures}
     *
     * @param n the number of texture names to create
     */
    public static void nglCreateTextures(int target, int n, long textures) {
        GL45C.nglCreateTextures(target, n, textures);
    }

    /**
     * Returns {@code n} previously unused texture names in {@code textures}, each representing a new texture object.
     *
     * @param target   the texture target. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
     * @param textures the buffer in which to store the created texture names
     */
    public static void glCreateTextures(@NativeType("GLenum") int target, @NativeType("GLuint *") IntBuffer textures) {
        GL45C.glCreateTextures(target, textures);
    }

    /**
     * Returns {@code n} previously unused texture names in {@code textures}, each representing a new texture object.
     *
     * @param target the texture target. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
     */
    @NativeType("void")
    public static int glCreateTextures(@NativeType("GLenum") int target) {
        return GL45C.glCreateTextures(target);
    }

    // --- [ glTextureBuffer ] ---

    /**
     * DSA version of {@link GL31C#glTexBuffer TexBuffer}.
     *
     * @param texture        the texture name
     * @param internalformat the sized internal format of the data in the store belonging to {@code buffer}
     * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
     */
    public static void glTextureBuffer(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        GL45C.glTextureBuffer(texture, internalformat, buffer);
    }

    // --- [ glTextureBufferRange ] ---

    /**
     * DSA version of {@link GL43C#glTexBufferRange TexBufferRange}.
     *
     * @param texture        the texture name
     * @param internalformat the internal format of the data in the store belonging to {@code buffer}
     * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
     * @param offset         the offset of the start of the range of the buffer's data store to attach
     * @param size           the size of the range of the buffer's data store to attach
     */
    public static void glTextureBufferRange(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        GL45C.glTextureBufferRange(texture, internalformat, buffer, offset, size);
    }

    // --- [ glTextureStorage1D ] ---

    /**
     * DSA version of {@link GL42C#glTexStorage1D TexStorage1D}.
     *
     * @param texture        the texture name
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     */
    public static void glTextureStorage1D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width) {
        GL45C.glTextureStorage1D(texture, levels, internalformat, width);
    }

    // --- [ glTextureStorage2D ] ---

    /**
     * DSA version of {@link GL42C#glTexStorage2D TexStorage2D}.
     *
     * @param texture        the texture name
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     * @param height         the height of the texture, in texels
     */
    public static void glTextureStorage2D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glTextureStorage2D(texture, levels, internalformat, width, height);
    }

    // --- [ glTextureStorage3D ] ---

    /**
     * DSA version of {@link GL42C#glTexStorage3D TexStorage3D}.
     *
     * @param texture        the texture name
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     * @param height         the height of the texture, in texels
     * @param depth          the depth of the texture, in texels
     */
    public static void glTextureStorage3D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        GL45C.glTextureStorage3D(texture, levels, internalformat, width, height, depth);
    }

    // --- [ glTextureStorage2DMultisample ] ---

    /**
     * DSA version of {@link GL43C#glTexStorage2DMultisample TexStorage2DMultisample}.
     *
     * @param texture              the texture name
     * @param samples              the number of samples in the texture
     * @param internalformat       the sized internal format to be used to store texture image data
     * @param width                the width of the texture, in texels
     * @param height               the height of the texture, in texels
     * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
     *                             depend on the internal format or size of the image
     */
    public static void glTextureStorage2DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL45C.glTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations);
    }

    // --- [ glTextureStorage3DMultisample ] ---

    /**
     * DSA version of {@link GL43C#glTexStorage3DMultisample TexStorage3DMultisample}.
     *
     * @param texture              the texture name
     * @param samples              the number of samples in the texture
     * @param internalformat       the sized internal format to be used to store texture image data
     * @param width                the width of the texture, in texels
     * @param height               the height of the texture, in texels
     * @param depth                the depth of the texture, in texels
     * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
     *                             depend on the internal format or size of the image
     */
    public static void glTextureStorage3DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL45C.glTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    // --- [ glTextureSubImage1D ] ---

    /** Unsafe version of: {@link #glTextureSubImage1D TextureSubImage1D} */
    public static void nglTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels) {
        GL45C.nglTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage1D TexSubImage1D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param width   the subregion width
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage1D TexSubImage1D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param width   the subregion width
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage1D TexSubImage1D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param width   the subregion width
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage1D TexSubImage1D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param width   the subregion width
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage1D TexSubImage1D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param width   the subregion width
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage1D TexSubImage1D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param width   the subregion width
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    // --- [ glTextureSubImage2D ] ---

    /** Unsafe version of: {@link #glTextureSubImage2D TextureSubImage2D} */
    public static void nglTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        GL45C.nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage2D TexSubImage2D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param yoffset the bottom coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage2D TexSubImage2D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param yoffset the bottom coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage2D TexSubImage2D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param yoffset the bottom coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage2D TexSubImage2D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param yoffset the bottom coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage2D TexSubImage2D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param yoffset the bottom coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glTexSubImage2D TexSubImage2D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the left coordinate of the texel subregion
     * @param yoffset the bottom coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    // --- [ glTextureSubImage3D ] ---

    /** Unsafe version of: {@link #glTextureSubImage3D TextureSubImage3D} */
    public static void nglTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        GL45C.nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /**
     * DSA version of {@link GL12C#glTexSubImage3D TexSubImage3D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the x coordinate of the texel subregion
     * @param yoffset the y coordinate of the texel subregion
     * @param zoffset the z coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /**
     * DSA version of {@link GL12C#glTexSubImage3D TexSubImage3D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the x coordinate of the texel subregion
     * @param yoffset the y coordinate of the texel subregion
     * @param zoffset the z coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /**
     * DSA version of {@link GL12C#glTexSubImage3D TexSubImage3D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the x coordinate of the texel subregion
     * @param yoffset the y coordinate of the texel subregion
     * @param zoffset the z coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /**
     * DSA version of {@link GL12C#glTexSubImage3D TexSubImage3D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the x coordinate of the texel subregion
     * @param yoffset the y coordinate of the texel subregion
     * @param zoffset the z coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /**
     * DSA version of {@link GL12C#glTexSubImage3D TexSubImage3D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the x coordinate of the texel subregion
     * @param yoffset the y coordinate of the texel subregion
     * @param zoffset the z coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /**
     * DSA version of {@link GL12C#glTexSubImage3D TexSubImage3D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail-number
     * @param xoffset the x coordinate of the texel subregion
     * @param yoffset the y coordinate of the texel subregion
     * @param zoffset the z coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the pixel data
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    // --- [ glCompressedTextureSubImage1D ] ---

    /**
     * Unsafe version of: {@link #glCompressedTextureSubImage1D CompressedTextureSubImage1D}
     *
     * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
     */
    public static void nglCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data) {
        GL45C.nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
    }

    /**
     * DSA version of {@link GL13C#glCompressedTexSubImage1D CompressedTexSubImage1D}.
     *
     * @param texture   the texture name
     * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param xoffset   a texel offset in the x direction within the texture array
     * @param width     the width of the texture subimage
     * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
     * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
     * @param data      a pointer to the compressed image data
     */
    public static void glCompressedTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL45C.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
    }

    /**
     * DSA version of {@link GL13C#glCompressedTexSubImage1D CompressedTexSubImage1D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param xoffset a texel offset in the x direction within the texture array
     * @param width   the width of the texture subimage
     * @param format  the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
     * @param data    a pointer to the compressed image data
     */
    public static void glCompressedTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        GL45C.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, data);
    }

    // --- [ glCompressedTextureSubImage2D ] ---

    /**
     * Unsafe version of: {@link #glCompressedTextureSubImage2D CompressedTextureSubImage2D}
     *
     * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
     */
    public static void nglCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        GL45C.nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /**
     * DSA version of {@link GL13C#glCompressedTexSubImage2D CompressedTexSubImage2D}.
     *
     * @param texture   the texture name
     * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param xoffset   a texel offset in the x direction within the texture array
     * @param yoffset   a texel offset in the y direction within the texture array
     * @param width     the width of the texture subimage
     * @param height    the height of the texture subimage
     * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
     * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
     * @param data      a pointer to the compressed image data
     */
    public static void glCompressedTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL45C.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /**
     * DSA version of {@link GL13C#glCompressedTexSubImage2D CompressedTexSubImage2D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param xoffset a texel offset in the x direction within the texture array
     * @param yoffset a texel offset in the y direction within the texture array
     * @param width   the width of the texture subimage
     * @param height  the height of the texture subimage
     * @param format  the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
     * @param data    a pointer to the compressed image data
     */
    public static void glCompressedTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        GL45C.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, data);
    }

    // --- [ glCompressedTextureSubImage3D ] ---

    /**
     * Unsafe version of: {@link #glCompressedTextureSubImage3D CompressedTextureSubImage3D}
     *
     * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
     */
    public static void nglCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        GL45C.nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /**
     * DSA version of {@link GL13C#glCompressedTexSubImage3D CompressedTexSubImage3D}.
     *
     * @param texture   the texture name
     * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param xoffset   a texel offset in the x direction within the texture array
     * @param yoffset   a texel offset in the y direction within the texture array
     * @param zoffset   a texel offset in the z direction within the texture array
     * @param width     the width of the texture subimage
     * @param height    the height of the texture subimage
     * @param depth     the depth of the texture subimage
     * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
     * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
     * @param data      a pointer to the compressed image data
     */
    public static void glCompressedTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL45C.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /**
     * DSA version of {@link GL13C#glCompressedTexSubImage3D CompressedTexSubImage3D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param xoffset a texel offset in the x direction within the texture array
     * @param yoffset a texel offset in the y direction within the texture array
     * @param zoffset a texel offset in the z direction within the texture array
     * @param width   the width of the texture subimage
     * @param height  the height of the texture subimage
     * @param depth   the depth of the texture subimage
     * @param format  the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
     * @param data    a pointer to the compressed image data
     */
    public static void glCompressedTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        GL45C.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    // --- [ glCopyTextureSubImage1D ] ---

    /**
     * DSA version of {@link GL11C#glCopyTexSubImage1D CopyTexSubImage1D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param xoffset the left texel coordinate of the texture subregion to update
     * @param x       the left framebuffer pixel coordinate
     * @param y       the lower framebuffer pixel coordinate
     * @param width   the texture subregion width
     */
    public static void glCopyTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        GL45C.glCopyTextureSubImage1D(texture, level, xoffset, x, y, width);
    }

    // --- [ glCopyTextureSubImage2D ] ---

    /**
     * DSA version of {@link GL11C#glCopyTexSubImage2D CopyTexSubImage2D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param xoffset the left texel coordinate of the texture subregion to update
     * @param yoffset the lower texel coordinate of the texture subregion to update
     * @param x       the left framebuffer pixel coordinate
     * @param y       the lower framebuffer pixel coordinate
     * @param width   the texture subregion width
     * @param height  the texture subregion height
     */
    public static void glCopyTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height);
    }

    // --- [ glCopyTextureSubImage3D ] ---

    /**
     * DSA version of {@link GL12C#glCopyTexSubImage3D CopyTexSubImage3D}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param xoffset the x coordinate of the texture subregion to update
     * @param yoffset the y coordinate of the texture subregion to update
     * @param zoffset the z coordinate of the texture subregion to update
     * @param x       the left framebuffer pixel coordinate
     * @param y       the lower framebuffer pixel coordinate
     * @param width   the texture subregion width
     * @param height  the texture subregion height
     */
    public static void glCopyTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    // --- [ glTextureParameterf ] ---

    /**
     * DSA version of {@link GL11C#glTexParameterf TexParameterf}.
     *
     * @param texture the texture name
     * @param pname   the parameter to set
     * @param param   the parameter value
     */
    public static void glTextureParameterf(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        GL45C.glTextureParameterf(texture, pname, param);
    }

    // --- [ glTextureParameterfv ] ---

    /** Unsafe version of: {@link #glTextureParameterfv TextureParameterfv} */
    public static void nglTextureParameterfv(int texture, int pname, long params) {
        GL45C.nglTextureParameterfv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL11C#glTexParameterfv TexParameterfv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to set
     * @param params  the parameter value
     */
    public static void glTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        GL45C.glTextureParameterfv(texture, pname, params);
    }

    // --- [ glTextureParameteri ] ---

    /**
     * DSA version of {@link GL11C#glTexParameteri TexParameteri}.
     *
     * @param texture the texture name
     * @param pname   the parameter to set. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td></tr><tr><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td></tr></table>
     * @param param   the parameter value
     */
    public static void glTextureParameteri(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL45C.glTextureParameteri(texture, pname, param);
    }

    // --- [ glTextureParameterIiv ] ---

    /** Unsafe version of: {@link #glTextureParameterIiv TextureParameterIiv} */
    public static void nglTextureParameterIiv(int texture, int pname, long params) {
        GL45C.nglTextureParameterIiv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glTexParameterIiv TexParameterIiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a single-valued texture parameter
     * @param params  the value of {@code pname}
     */
    public static void glTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL45C.glTextureParameterIiv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glTexParameterIiv TexParameterIiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a single-valued texture parameter
     */
    public static void glTextureParameterIi(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        GL45C.glTextureParameterIi(texture, pname, param);
    }

    // --- [ glTextureParameterIuiv ] ---

    /** Unsafe version of: {@link #glTextureParameterIuiv TextureParameterIuiv} */
    public static void nglTextureParameterIuiv(int texture, int pname, long params) {
        GL45C.nglTextureParameterIuiv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glTexParameterIuiv TexParameterIuiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a single-valued texture parameter
     * @param params  the value of {@code pname}
     */
    public static void glTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        GL45C.glTextureParameterIuiv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glTexParameterIuiv TexParameterIuiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a single-valued texture parameter
     */
    public static void glTextureParameterIui(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        GL45C.glTextureParameterIui(texture, pname, param);
    }

    // --- [ glTextureParameteriv ] ---

    /** Unsafe version of: {@link #glTextureParameteriv TextureParameteriv} */
    public static void nglTextureParameteriv(int texture, int pname, long params) {
        GL45C.nglTextureParameteriv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL11C#glTexParameteriv TexParameteriv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to set
     * @param params  the parameter value
     */
    public static void glTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL45C.glTextureParameteriv(texture, pname, params);
    }

    // --- [ glGenerateTextureMipmap ] ---

    /**
     * DSA version of {@link GL30C#glGenerateMipmap GenerateMipmap}.
     *
     * @param texture the texture name
     */
    public static void glGenerateTextureMipmap(@NativeType("GLuint") int texture) {
        GL45C.glGenerateTextureMipmap(texture);
    }

    // --- [ glBindTextureUnit ] ---

    /**
     * Binds an existing texture object to the texture unit numbered {@code unit}.
     * 
     * <p>{@code texture} must be zero or the name of an existing texture object. When {@code texture} is the name of an existing texture object, that object is
     * bound to the target, in the corresponding texture unit, that was specified when the object was created. When {@code texture} is zero, each of the targets
     * enumerated at the beginning of this section is reset to its default texture for the corresponding texture image unit.</p>
     *
     * @param unit    the texture unit number
     * @param texture the texture name
     */
    public static void glBindTextureUnit(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture) {
        GL45C.glBindTextureUnit(unit, texture);
    }

    // --- [ glGetTextureImage ] ---

    /**
     * Unsafe version of: {@link #glGetTextureImage GetTextureImage}
     *
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     */
    public static void nglGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels) {
        GL45C.nglGetTextureImage(texture, level, format, type, bufSize, pixels);
    }

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     * @param pixels  the buffer in which to place the returned data
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, bufSize, pixels);
    }

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    // --- [ glGetCompressedTextureImage ] ---

    /**
     * Unsafe version of: {@link #glGetCompressedTextureImage GetCompressedTextureImage}
     *
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     */
    public static void nglGetCompressedTextureImage(int texture, int level, int bufSize, long pixels) {
        GL45C.nglGetCompressedTextureImage(texture, level, bufSize, pixels);
    }

    /**
     * DSA version of {@link GL13C#glGetCompressedTexImage GetCompressedTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     * @param pixels  a buffer in which to return the compressed texture image
     */
    public static void glGetCompressedTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        GL45C.glGetCompressedTextureImage(texture, level, bufSize, pixels);
    }

    /**
     * DSA version of {@link GL13C#glGetCompressedTexImage GetCompressedTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param pixels  a buffer in which to return the compressed texture image
     */
    public static void glGetCompressedTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer pixels) {
        GL45C.glGetCompressedTextureImage(texture, level, pixels);
    }

    // --- [ glGetTextureLevelParameterfv ] ---

    /** Unsafe version of: {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv} */
    public static void nglGetTextureLevelParameterfv(int texture, int level, int pname, long params) {
        GL45C.nglGetTextureLevelParameterfv(texture, level, pname, params);
    }

    /**
     * DSA version of {@link GL11C#glGetTexLevelParameterfv GetTexLevelParameterfv}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param pname   the parameter to query
     * @param params  a scalar or buffer in which to place the returned data
     */
    public static void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        GL45C.glGetTextureLevelParameterfv(texture, level, pname, params);
    }

    /**
     * DSA version of {@link GL11C#glGetTexLevelParameterfv GetTexLevelParameterfv}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param pname   the parameter to query
     */
    @NativeType("void")
    public static float glGetTextureLevelParameterf(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureLevelParameterf(texture, level, pname);
    }

    // --- [ glGetTextureLevelParameteriv ] ---

    /** Unsafe version of: {@link #glGetTextureLevelParameteriv GetTextureLevelParameteriv} */
    public static void nglGetTextureLevelParameteriv(int texture, int level, int pname, long params) {
        GL45C.nglGetTextureLevelParameteriv(texture, level, pname, params);
    }

    /**
     * DSA version of {@link GL11C#glGetTexLevelParameteriv GetTexLevelParameteriv}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WIDTH TEXTURE_WIDTH}</td><td>{@link GL11#GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}</td><td>{@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}</td><td>{@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}</td></tr><tr><td>{@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}</td><td>{@link GL11#GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}</td><td>{@link GL11#GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}</td><td>{@link GL11#GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}</td></tr><tr><td>{@link GL11#GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}</td><td>{@link GL11#GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}</td><td>{@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}</td><td>{@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}</td><td>{@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}</td><td>{@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}</td><td>{@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}</td></tr><tr><td>{@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}</td><td>{@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}</td><td>{@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}</td><td>{@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}</td></tr></table>
     * @param params  a scalar or buffer in which to place the returned data
     */
    public static void glGetTextureLevelParameteriv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetTextureLevelParameteriv(texture, level, pname, params);
    }

    /**
     * DSA version of {@link GL11C#glGetTexLevelParameteriv GetTexLevelParameteriv}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WIDTH TEXTURE_WIDTH}</td><td>{@link GL11#GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}</td><td>{@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}</td><td>{@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}</td></tr><tr><td>{@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}</td><td>{@link GL11#GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}</td><td>{@link GL11#GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}</td><td>{@link GL11#GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}</td></tr><tr><td>{@link GL11#GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}</td><td>{@link GL11#GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}</td><td>{@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}</td><td>{@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}</td><td>{@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}</td><td>{@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}</td><td>{@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}</td></tr><tr><td>{@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}</td><td>{@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}</td><td>{@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}</td><td>{@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetTextureLevelParameteri(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureLevelParameteri(texture, level, pname);
    }

    // --- [ glGetTextureParameterfv ] ---

    /** Unsafe version of: {@link #glGetTextureParameterfv GetTextureParameterfv} */
    public static void nglGetTextureParameterfv(int texture, int pname, long params) {
        GL45C.nglGetTextureParameterfv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL11C#glGetTexParameterfv GetTexParameterfv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to query
     * @param params  a scalar or buffer in which to place the returned data
     */
    public static void glGetTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        GL45C.glGetTextureParameterfv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL11C#glGetTexParameterfv GetTexParameterfv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to query
     */
    @NativeType("void")
    public static float glGetTextureParameterf(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureParameterf(texture, pname);
    }

    // --- [ glGetTextureParameterIiv ] ---

    /** Unsafe version of: {@link #glGetTextureParameterIiv GetTextureParameterIiv} */
    public static void nglGetTextureParameterIiv(int texture, int pname, long params) {
        GL45C.nglGetTextureParameterIiv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glGetTexParameterIiv GetTexParameterIiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a texture parameter
     * @param params  returns the texture parameter value
     */
    public static void glGetTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetTextureParameterIiv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glGetTexParameterIiv GetTexParameterIiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a texture parameter
     */
    @NativeType("void")
    public static int glGetTextureParameterIi(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureParameterIi(texture, pname);
    }

    // --- [ glGetTextureParameterIuiv ] ---

    /** Unsafe version of: {@link #glGetTextureParameterIuiv GetTextureParameterIuiv} */
    public static void nglGetTextureParameterIuiv(int texture, int pname, long params) {
        GL45C.nglGetTextureParameterIuiv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glGetTexParameterIuiv GetTexParameterIuiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a texture parameter
     * @param params  returns the texture parameter value
     */
    public static void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        GL45C.glGetTextureParameterIuiv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL30C#glGetTexParameterIuiv GetTexParameterIuiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a texture parameter
     */
    @NativeType("void")
    public static int glGetTextureParameterIui(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureParameterIui(texture, pname);
    }

    // --- [ glGetTextureParameteriv ] ---

    /** Unsafe version of: {@link #glGetTextureParameteriv GetTextureParameteriv} */
    public static void nglGetTextureParameteriv(int texture, int pname, long params) {
        GL45C.nglGetTextureParameteriv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL11C#glGetTexParameteriv GetTexParameteriv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td></tr><tr><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td></tr><tr><td>{@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}</td><td>{@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}</td><td>{@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}</td></tr><tr><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}</td></tr></table>
     * @param params  a scalar or buffer in which to place the returned data
     */
    public static void glGetTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetTextureParameteriv(texture, pname, params);
    }

    /**
     * DSA version of {@link GL11C#glGetTexParameteriv GetTexParameteriv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td></tr><tr><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td></tr><tr><td>{@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}</td><td>{@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}</td><td>{@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}</td></tr><tr><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetTextureParameteri(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureParameteri(texture, pname);
    }

    // --- [ glCreateVertexArrays ] ---

    /**
     * Unsafe version of: {@link #glCreateVertexArrays CreateVertexArrays}
     *
     * @param n the number of vertex array object names to create
     */
    public static void nglCreateVertexArrays(int n, long arrays) {
        GL45C.nglCreateVertexArrays(n, arrays);
    }

    /**
     * Returns {@code n} previously unused vertex array object names in {@code arrays}.
     *
     * @param arrays the buffer in which to return the created vertex array object names
     */
    public static void glCreateVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        GL45C.glCreateVertexArrays(arrays);
    }

    /** Returns {@code n} previously unused vertex array object names in {@code arrays}. */
    @NativeType("void")
    public static int glCreateVertexArrays() {
        return GL45C.glCreateVertexArrays();
    }

    // --- [ glDisableVertexArrayAttrib ] ---

    /**
     * DSA version of {@link GL20C#glDisableVertexAttribArray DisableVertexAttribArray}.
     *
     * @param vaobj the vertex array object name
     * @param index the index of the generic vertex attribute to be disabled
     */
    public static void glDisableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index) {
        GL45C.glDisableVertexArrayAttrib(vaobj, index);
    }

    // --- [ glEnableVertexArrayAttrib ] ---

    /**
     * DSA version of {@link GL20C#glEnableVertexAttribArray EnableVertexAttribArray}.
     *
     * @param vaobj the vertex array object name
     * @param index the index of the generic vertex attribute to be enabled
     */
    public static void glEnableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index) {
        GL45C.glEnableVertexArrayAttrib(vaobj, index);
    }

    // --- [ glVertexArrayElementBuffer ] ---

    /**
     * Binds a buffer object to the element array buffer bind point of a vertex array object.
     *
     * @param vaobj  the vertex array object name
     * @param buffer the buffer object name. If {@code buffer} is zero, any existing element array buffer binding to {@code vaobj} is removed.
     */
    public static void glVertexArrayElementBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer) {
        GL45C.glVertexArrayElementBuffer(vaobj, buffer);
    }

    // --- [ glVertexArrayVertexBuffer ] ---

    /**
     * DSA version of {@link GL43C#glBindVertexBuffer BindVertexBuffer}.
     *
     * @param vaobj        the vertex array object name
     * @param bindingindex the index of the vertex buffer binding point to which to bind the buffer
     * @param buffer       the name of an existing buffer to bind to the vertex buffer binding point
     * @param offset       the offset of the first element of the buffer
     * @param stride       the distance between elements within the buffer
     */
    public static void glVertexArrayVertexBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride) {
        GL45C.glVertexArrayVertexBuffer(vaobj, bindingindex, buffer, offset, stride);
    }

    // --- [ glVertexArrayVertexBuffers ] ---

    /**
     * Unsafe version of: {@link #glVertexArrayVertexBuffers VertexArrayVertexBuffers}
     *
     * @param count the number of vertex buffer binding points
     */
    public static void nglVertexArrayVertexBuffers(int vaobj, int first, int count, long buffers, long offsets, long strides) {
        GL45C.nglVertexArrayVertexBuffers(vaobj, first, count, buffers, offsets, strides);
    }

    /**
     * DSA version of {@link GL44C#glBindVertexBuffers BindVertexBuffers}.
     *
     * @param vaobj   the vertex array object name
     * @param first   the first vertex buffer binding point
     * @param buffers an array of zeros or names of existing buffers objects
     * @param offsets an array of offses
     * @param strides an array of stride values
     */
    public static void glVertexArrayVertexBuffers(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizei const *") IntBuffer strides) {
        GL45C.glVertexArrayVertexBuffers(vaobj, first, buffers, offsets, strides);
    }

    // --- [ glVertexArrayAttribFormat ] ---

    /**
     * DSA version of {@link GL43C#glVertexAttribFormat VertexAttribFormat}.
     *
     * @param vaobj          the vertex array object name
     * @param attribindex    the generic vertex attribute array being described
     * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type           the type of the data stored in the array
     * @param normalized     if true then integer data is normalized to the range [-1, 1] or [0, 1] if it is signed or unsigned, respectively. If false then integer data is
     *                       directly converted to floating point.
     * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
     */
    public static void glVertexArrayAttribFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset) {
        GL45C.glVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset);
    }

    // --- [ glVertexArrayAttribIFormat ] ---

    /**
     * DSA version of {@link GL43C#glVertexAttribIFormat VertexAttribIFormat}.
     *
     * @param vaobj          the vertex array object name
     * @param attribindex    the generic vertex attribute array being described
     * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type           the type of the data stored in the array
     * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
     */
    public static void glVertexArrayAttribIFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        GL45C.glVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset);
    }

    // --- [ glVertexArrayAttribLFormat ] ---

    /**
     * DSA version of {@link GL43C#glVertexAttribLFormat VertexAttribLFormat}.
     *
     * @param vaobj          the vertex array object name
     * @param attribindex    the generic vertex attribute array being described
     * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type           the type of the data stored in the array
     * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
     */
    public static void glVertexArrayAttribLFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        GL45C.glVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset);
    }

    // --- [ glVertexArrayAttribBinding ] ---

    /**
     * DSA version of {@link GL43C#glVertexAttribBinding VertexAttribBinding}.
     *
     * @param vaobj        the vertex array object name
     * @param attribindex  the index of the attribute to associate with a vertex buffer binding
     * @param bindingindex the index of the vertex buffer binding with which to associate the generic vertex attribute
     */
    public static void glVertexArrayAttribBinding(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex) {
        GL45C.glVertexArrayAttribBinding(vaobj, attribindex, bindingindex);
    }

    // --- [ glVertexArrayBindingDivisor ] ---

    /**
     * DSA version of {@link GL43C#glVertexBindingDivisor VertexBindingDivisor}.
     *
     * @param vaobj        the vertex array object name
     * @param bindingindex the index of the generic vertex attribute
     * @param divisor      the number of instances that will pass between updates of the generic attribute at slot {@code index}
     */
    public static void glVertexArrayBindingDivisor(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor) {
        GL45C.glVertexArrayBindingDivisor(vaobj, bindingindex, divisor);
    }

    // --- [ glGetVertexArrayiv ] ---

    /** Unsafe version of: {@link #glGetVertexArrayiv GetVertexArrayiv} */
    public static void nglGetVertexArrayiv(int vaobj, int pname, long param) {
        GL45C.nglGetVertexArrayiv(vaobj, pname, param);
    }

    /**
     * Queries parameters of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER_BINDING ELEMENT_ARRAY_BUFFER_BINDING}</td></tr></table>
     * @param param the buffer in which to return the parameter values
     */
    public static void glGetVertexArrayiv(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        GL45C.glGetVertexArrayiv(vaobj, pname, param);
    }

    /**
     * Queries parameters of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER_BINDING ELEMENT_ARRAY_BUFFER_BINDING}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetVertexArrayi(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname) {
        return GL45C.glGetVertexArrayi(vaobj, pname);
    }

    // --- [ glGetVertexArrayIndexediv ] ---

    /** Unsafe version of: {@link #glGetVertexArrayIndexediv GetVertexArrayIndexediv} */
    public static void nglGetVertexArrayIndexediv(int vaobj, int index, int pname, long param) {
        GL45C.nglGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    /**
     * Queries parameters of an attribute of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param index the attribute to query
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE},</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td><td>{@link GL43#GL_VERTEX_ATTRIB_ARRAY_LONG VERTEX_ATTRIB_ARRAY_LONG}</td></tr><tr><td>{@link GL43#GL_VERTEX_ATTRIB_RELATIVE_OFFSET VERTEX_ATTRIB_RELATIVE_OFFSET}</td></tr></table>
     * @param param the buffer in which to return the parameter values
     */
    public static void glGetVertexArrayIndexediv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        GL45C.glGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    /**
     * Queries parameters of an attribute of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param index the attribute to query
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE},</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td><td>{@link GL43#GL_VERTEX_ATTRIB_ARRAY_LONG VERTEX_ATTRIB_ARRAY_LONG}</td></tr><tr><td>{@link GL43#GL_VERTEX_ATTRIB_RELATIVE_OFFSET VERTEX_ATTRIB_RELATIVE_OFFSET}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetVertexArrayIndexedi(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL45C.glGetVertexArrayIndexedi(vaobj, index, pname);
    }

    // --- [ glGetVertexArrayIndexed64iv ] ---

    /** Unsafe version of: {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv} */
    public static void nglGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long param) {
        GL45C.nglGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    /**
     * Queries parameters of an attribute of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param index the attribute to query
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL43#GL_VERTEX_BINDING_OFFSET VERTEX_BINDING_OFFSET}</td></tr></table>
     * @param param the buffer in which to return the parameter values
     */
    public static void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer param) {
        GL45C.glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    /**
     * Queries parameters of an attribute of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param index the attribute to query
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL43#GL_VERTEX_BINDING_OFFSET VERTEX_BINDING_OFFSET}</td></tr></table>
     */
    @NativeType("void")
    public static long glGetVertexArrayIndexed64i(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL45C.glGetVertexArrayIndexed64i(vaobj, index, pname);
    }

    // --- [ glCreateSamplers ] ---

    /**
     * Unsafe version of: {@link #glCreateSamplers CreateSamplers}
     *
     * @param n the number of sampler object names to create
     */
    public static void nglCreateSamplers(int n, long samplers) {
        GL45C.nglCreateSamplers(n, samplers);
    }

    /**
     * Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.
     *
     * @param samplers the buffer in which to return the created sampler object names
     */
    public static void glCreateSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        GL45C.glCreateSamplers(samplers);
    }

    /** Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object. */
    @NativeType("void")
    public static int glCreateSamplers() {
        return GL45C.glCreateSamplers();
    }

    // --- [ glCreateProgramPipelines ] ---

    /**
     * Unsafe version of: {@link #glCreateProgramPipelines CreateProgramPipelines}
     *
     * @param n the number of program pipeline names to create
     */
    public static void nglCreateProgramPipelines(int n, long pipelines) {
        GL45C.nglCreateProgramPipelines(n, pipelines);
    }

    /**
     * Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.
     *
     * @param pipelines the buffer in which to return the created program pipeline names
     */
    public static void glCreateProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        GL45C.glCreateProgramPipelines(pipelines);
    }

    /** Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object. */
    @NativeType("void")
    public static int glCreateProgramPipelines() {
        return GL45C.glCreateProgramPipelines();
    }

    // --- [ glCreateQueries ] ---

    /**
     * Unsafe version of: {@link #glCreateQueries CreateQueries}
     *
     * @param n the number of query object names to create
     */
    public static void nglCreateQueries(int target, int n, long ids) {
        GL45C.nglCreateQueries(target, n, ids);
    }

    /**
     * Returns {@code n} previously unused query object names in {@code ids}, each representing a new query object with the specified {@code target}.
     *
     * @param target the query target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     * @param ids    the buffer in which to return the created query object names
     */
    public static void glCreateQueries(@NativeType("GLenum") int target, @NativeType("GLuint *") IntBuffer ids) {
        GL45C.glCreateQueries(target, ids);
    }

    /**
     * Returns {@code n} previously unused query object names in {@code ids}, each representing a new query object with the specified {@code target}.
     *
     * @param target the query target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     */
    @NativeType("void")
    public static int glCreateQueries(@NativeType("GLenum") int target) {
        return GL45C.glCreateQueries(target);
    }

    // --- [ glGetQueryBufferObjecti64v ] ---

    /**
     * 64bit version of {@link #glGetQueryBufferObjectiv GetQueryBufferObjectiv}.
     *
     * @param id     the name of a query object
     * @param buffer the name of a buffer object
     * @param pname  the state to query
     * @param offset the offset into {@code buffer} at which the queried value is written
     */
    public static void glGetQueryBufferObjecti64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        GL45C.glGetQueryBufferObjecti64v(id, buffer, pname, offset);
    }

    // --- [ glGetQueryBufferObjectiv ] ---

    /**
     * Queries the state of a query object.
     *
     * @param id     the name of a query object
     * @param buffer the name of a buffer object
     * @param pname  the state to query
     * @param offset the offset into {@code buffer} at which the queried value is written
     */
    public static void glGetQueryBufferObjectiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        GL45C.glGetQueryBufferObjectiv(id, buffer, pname, offset);
    }

    // --- [ glGetQueryBufferObjectui64v ] ---

    /**
     * 64bit version of {@link #glGetQueryBufferObjectuiv GetQueryBufferObjectuiv}.
     *
     * @param id     the name of a query object
     * @param buffer the name of a buffer object
     * @param pname  the state to query
     * @param offset the offset into {@code buffer} at which the queried value is written
     */
    public static void glGetQueryBufferObjectui64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        GL45C.glGetQueryBufferObjectui64v(id, buffer, pname, offset);
    }

    // --- [ glGetQueryBufferObjectuiv ] ---

    /**
     * Unsigned version of {@link #glGetQueryBufferObjectiv GetQueryBufferObjectiv}.
     *
     * @param id     the name of a query object
     * @param buffer the name of a buffer object
     * @param pname  the state to query
     * @param offset the offset into {@code buffer} at which the queried value is written
     */
    public static void glGetQueryBufferObjectuiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        GL45C.glGetQueryBufferObjectuiv(id, buffer, pname, offset);
    }

    /** Array version of: {@link #glCreateTransformFeedbacks CreateTransformFeedbacks} */
    public static void glCreateTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        GL45C.glCreateTransformFeedbacks(ids);
    }

    /** Array version of: {@link #glGetTransformFeedbackiv GetTransformFeedbackiv} */
    public static void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        GL45C.glGetTransformFeedbackiv(xfb, pname, param);
    }

    /** Array version of: {@link #glGetTransformFeedbacki_v GetTransformFeedbacki_v} */
    public static void glGetTransformFeedbacki_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint *") int[] param) {
        GL45C.glGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    /** Array version of: {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v} */
    public static void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] param) {
        GL45C.glGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    /** Array version of: {@link #glCreateBuffers CreateBuffers} */
    public static void glCreateBuffers(@NativeType("GLuint *") int[] buffers) {
        GL45C.glCreateBuffers(buffers);
    }

    /** Array version of: {@link #glNamedBufferStorage NamedBufferStorage} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** Array version of: {@link #glNamedBufferStorage NamedBufferStorage} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** Array version of: {@link #glNamedBufferStorage NamedBufferStorage} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** Array version of: {@link #glNamedBufferStorage NamedBufferStorage} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** Array version of: {@link #glNamedBufferData NamedBufferData} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** Array version of: {@link #glNamedBufferData NamedBufferData} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** Array version of: {@link #glNamedBufferData NamedBufferData} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") long[] data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** Array version of: {@link #glNamedBufferData NamedBufferData} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** Array version of: {@link #glNamedBufferData NamedBufferData} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** Array version of: {@link #glNamedBufferSubData NamedBufferSubData} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** Array version of: {@link #glNamedBufferSubData NamedBufferSubData} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** Array version of: {@link #glNamedBufferSubData NamedBufferSubData} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") long[] data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** Array version of: {@link #glNamedBufferSubData NamedBufferSubData} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** Array version of: {@link #glNamedBufferSubData NamedBufferSubData} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** Array version of: {@link #glClearNamedBufferData ClearNamedBufferData} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /** Array version of: {@link #glClearNamedBufferData ClearNamedBufferData} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /** Array version of: {@link #glClearNamedBufferData ClearNamedBufferData} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /** Array version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /** Array version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /** Array version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /** Array version of: {@link #glGetNamedBufferParameteriv GetNamedBufferParameteriv} */
    public static void glGetNamedBufferParameteriv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetNamedBufferParameteriv(buffer, pname, params);
    }

    /** Array version of: {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v} */
    public static void glGetNamedBufferParameteri64v(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        GL45C.glGetNamedBufferParameteri64v(buffer, pname, params);
    }

    /** Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") short[] data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") int[] data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") long[] data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") float[] data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") double[] data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** Array version of: {@link #glCreateFramebuffers CreateFramebuffers} */
    public static void glCreateFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        GL45C.glCreateFramebuffers(framebuffers);
    }

    /** Array version of: {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers} */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] bufs) {
        GL45C.glNamedFramebufferDrawBuffers(framebuffer, bufs);
    }

    /** Array version of: {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData} */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] attachments) {
        GL45C.glInvalidateNamedFramebufferData(framebuffer, attachments);
    }

    /** Array version of: {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData} */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glInvalidateNamedFramebufferSubData(framebuffer, attachments, x, y, width, height);
    }

    /** Array version of: {@link #glClearNamedFramebufferiv ClearNamedFramebufferiv} */
    public static void glClearNamedFramebufferiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        GL45C.glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    /** Array version of: {@link #glClearNamedFramebufferuiv ClearNamedFramebufferuiv} */
    public static void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        GL45C.glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    /** Array version of: {@link #glClearNamedFramebufferfv ClearNamedFramebufferfv} */
    public static void glClearNamedFramebufferfv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") float[] value) {
        GL45C.glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    /** Array version of: {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv} */
    public static void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    /** Array version of: {@link #glGetNamedFramebufferAttachmentParameteriv GetNamedFramebufferAttachmentParameteriv} */
    public static void glGetNamedFramebufferAttachmentParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    /** Array version of: {@link #glCreateRenderbuffers CreateRenderbuffers} */
    public static void glCreateRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        GL45C.glCreateRenderbuffers(renderbuffers);
    }

    /** Array version of: {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv} */
    public static void glGetNamedRenderbufferParameteriv(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    /** Array version of: {@link #glCreateTextures CreateTextures} */
    public static void glCreateTextures(@NativeType("GLenum") int target, @NativeType("GLuint *") int[] textures) {
        GL45C.glCreateTextures(target, textures);
    }

    /** Array version of: {@link #glTextureSubImage1D TextureSubImage1D} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage1D TextureSubImage1D} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage1D TextureSubImage1D} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage1D TextureSubImage1D} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage2D TextureSubImage2D} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage2D TextureSubImage2D} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage2D TextureSubImage2D} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage2D TextureSubImage2D} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage3D TextureSubImage3D} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage3D TextureSubImage3D} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage3D TextureSubImage3D} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glTextureSubImage3D TextureSubImage3D} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glTextureParameterfv TextureParameterfv} */
    public static void glTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        GL45C.glTextureParameterfv(texture, pname, params);
    }

    /** Array version of: {@link #glTextureParameterIiv TextureParameterIiv} */
    public static void glTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL45C.glTextureParameterIiv(texture, pname, params);
    }

    /** Array version of: {@link #glTextureParameterIuiv TextureParameterIuiv} */
    public static void glTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        GL45C.glTextureParameterIuiv(texture, pname, params);
    }

    /** Array version of: {@link #glTextureParameteriv TextureParameteriv} */
    public static void glTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL45C.glTextureParameteriv(texture, pname, params);
    }

    /** Array version of: {@link #glGetTextureImage GetTextureImage} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetTextureImage GetTextureImage} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetTextureImage GetTextureImage} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetTextureImage GetTextureImage} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** Array version of: {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv} */
    public static void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        GL45C.glGetTextureLevelParameterfv(texture, level, pname, params);
    }

    /** Array version of: {@link #glGetTextureLevelParameteriv GetTextureLevelParameteriv} */
    public static void glGetTextureLevelParameteriv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetTextureLevelParameteriv(texture, level, pname, params);
    }

    /** Array version of: {@link #glGetTextureParameterfv GetTextureParameterfv} */
    public static void glGetTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        GL45C.glGetTextureParameterfv(texture, pname, params);
    }

    /** Array version of: {@link #glGetTextureParameterIiv GetTextureParameterIiv} */
    public static void glGetTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetTextureParameterIiv(texture, pname, params);
    }

    /** Array version of: {@link #glGetTextureParameterIuiv GetTextureParameterIuiv} */
    public static void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        GL45C.glGetTextureParameterIuiv(texture, pname, params);
    }

    /** Array version of: {@link #glGetTextureParameteriv GetTextureParameteriv} */
    public static void glGetTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetTextureParameteriv(texture, pname, params);
    }

    /** Array version of: {@link #glCreateVertexArrays CreateVertexArrays} */
    public static void glCreateVertexArrays(@NativeType("GLuint *") int[] arrays) {
        GL45C.glCreateVertexArrays(arrays);
    }

    /** Array version of: {@link #glVertexArrayVertexBuffers VertexArrayVertexBuffers} */
    public static void glVertexArrayVertexBuffers(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizei const *") int[] strides) {
        GL45C.glVertexArrayVertexBuffers(vaobj, first, buffers, offsets, strides);
    }

    /** Array version of: {@link #glGetVertexArrayiv GetVertexArrayiv} */
    public static void glGetVertexArrayiv(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        GL45C.glGetVertexArrayiv(vaobj, pname, param);
    }

    /** Array version of: {@link #glGetVertexArrayIndexediv GetVertexArrayIndexediv} */
    public static void glGetVertexArrayIndexediv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        GL45C.glGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    /** Array version of: {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv} */
    public static void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] param) {
        GL45C.glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    /** Array version of: {@link #glCreateSamplers CreateSamplers} */
    public static void glCreateSamplers(@NativeType("GLuint *") int[] samplers) {
        GL45C.glCreateSamplers(samplers);
    }

    /** Array version of: {@link #glCreateProgramPipelines CreateProgramPipelines} */
    public static void glCreateProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        GL45C.glCreateProgramPipelines(pipelines);
    }

    /** Array version of: {@link #glCreateQueries CreateQueries} */
    public static void glCreateQueries(@NativeType("GLenum") int target, @NativeType("GLuint *") int[] ids) {
        GL45C.glCreateQueries(target, ids);
    }

}