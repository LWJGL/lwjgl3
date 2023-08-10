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

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The OpenGL functionality up to version 4.5. Includes only Core Profile symbols.
 * 
 * <p>OpenGL 4.5 implementations support revision 4.50 of the OpenGL Shading Language.</p>
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_clip_control.txt">ARB_clip_control</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_cull_distance.txt">ARB_cull_distance</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_ES3_1_compatibility.txt">ARB_ES3_1_compatibility</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_conditional_render_inverted.txt">ARB_conditional_render_inverted</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_context_flush_control.txt">KHR_context_flush_control</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_derivative_control.txt">ARB_derivative_control</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_direct_state_access.txt">ARB_direct_state_access</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_get_texture_sub_image.txt">ARB_get_texture_sub_image</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_robustness.txt">KHR_robustness</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_texture_image_samples.txt">ARB_shader_texture_image_samples</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_barrier.txt">ARB_texture_barrier</a></li>
 * </ul>
 */
public class GL45C extends GL44C {

    static { GL.initialize(); }

    /** Accepted by the {@code depth} parameter of {@link #glClipControl ClipControl}. */
    public static final int
        GL_NEGATIVE_ONE_TO_ONE = 0x935E,
        GL_ZERO_TO_ONE         = 0x935F;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_CLIP_ORIGIN     = 0x935C,
        GL_CLIP_DEPTH_MODE = 0x935D;

    /** Accepted by the {@code mode} parameter of {@link GL30C#glBeginConditionalRender BeginConditionalRender}. */
    public static final int
        GL_QUERY_WAIT_INVERTED              = 0x8E17,
        GL_QUERY_NO_WAIT_INVERTED           = 0x8E18,
        GL_QUERY_BY_REGION_WAIT_INVERTED    = 0x8E19,
        GL_QUERY_BY_REGION_NO_WAIT_INVERTED = 0x8E1A;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v. */
    public static final int
        GL_MAX_CULL_DISTANCES                   = 0x82F9,
        GL_MAX_COMBINED_CLIP_AND_CULL_DISTANCES = 0x82FA;

    /** Accepted by the {@code pname} parameter of GetTextureParameter{if}v and GetTextureParameterI{i ui}v. */
    public static final int GL_TEXTURE_TARGET = 0x1006;

    /** Accepted by the {@code pname} parameter of GetQueryObjectiv. */
    public static final int GL_QUERY_TARGET = 0x82EA;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v. */
    public static final int GL_CONTEXT_RELEASE_BEHAVIOR = 0x82FB;

    /** Returned in {@code data} by GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v when {@code pname} is {@link #GL_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}. */
    public static final int GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x82FC;

    /** Returned by {@link #glGetGraphicsResetStatus GetGraphicsResetStatus}. */
    public static final int
        GL_GUILTY_CONTEXT_RESET   = 0x8253,
        GL_INNOCENT_CONTEXT_RESET = 0x8254,
        GL_UNKNOWN_CONTEXT_RESET  = 0x8255;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
    public static final int GL_RESET_NOTIFICATION_STRATEGY = 0x8256;

    /** Returned by GetIntegerv and related simple queries when {@code value} is {@link #GL_RESET_NOTIFICATION_STRATEGY RESET_NOTIFICATION_STRATEGY}. */
    public static final int
        GL_LOSE_CONTEXT_ON_RESET = 0x8252,
        GL_NO_RESET_NOTIFICATION = 0x8261;

    /** Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS. */
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT = 0x4;

    /** Returned by {@link GL11C#glGetError GetError}. */
    public static final int GL_CONTEXT_LOST = 0x507;

    protected GL45C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClipControl ] ---

    /**
     * Controls the clipping volume behavior.
     * 
     * <p>These parameters update the clip control origin and depth mode respectively. The initial value of the clip control origin is {@link GL20#GL_LOWER_LEFT LOWER_LEFT} and the
     * initial value of the depth mode is {@link #GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}.</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if ClipControl is executed between the execution of {@link GL11#glBegin Begin} and the corresponding
     * execution of {@link GL11#glEnd End}.</p>
     *
     * @param origin the clip origin. One of:<br><table><tr><td>{@link GL20#GL_LOWER_LEFT LOWER_LEFT}</td><td>{@link GL20#GL_UPPER_LEFT UPPER_LEFT}</td></tr></table>
     * @param depth  the clip depth mode. One of:<br><table><tr><td>{@link #GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}</td><td>{@link #GL_ZERO_TO_ONE ZERO_TO_ONE}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glClipControl">Reference Page</a>
     */
    public static native void glClipControl(@NativeType("GLenum") int origin, @NativeType("GLenum") int depth);

    // --- [ glCreateTransformFeedbacks ] ---

    /**
     * Unsafe version of: {@link #glCreateTransformFeedbacks CreateTransformFeedbacks}
     *
     * @param n the number of transform feedback object names to create
     */
    public static native void nglCreateTransformFeedbacks(int n, long ids);

    /**
     * Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.
     *
     * @param ids the buffer in which to return the names
     * 
     * @see <a href="https://docs.gl/gl4/glCreateTransformFeedbacks">Reference Page</a>
     */
    public static void glCreateTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        nglCreateTransformFeedbacks(ids.remaining(), memAddress(ids));
    }

    /**
     * Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.
     * 
     * @see <a href="https://docs.gl/gl4/glCreateTransformFeedbacks">Reference Page</a>
     */
    @NativeType("void")
    public static int glCreateTransformFeedbacks() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglCreateTransformFeedbacks(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTransformFeedbackBufferBase ] ---

    /**
     * Binds a buffer object to a transform feedback object.
     *
     * @param xfb    zero or the name of an existing transform feedback object
     * @param index  the transform feedback stream index
     * @param buffer the name of an existing buffer object
     * 
     * @see <a href="https://docs.gl/gl4/glTransformFeedbackBufferBase">Reference Page</a>
     */
    public static native void glTransformFeedbackBufferBase(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer);

    // --- [ glTransformFeedbackBufferRange ] ---

    /**
     * Binds a region of a buffer object to a transform feedback object.
     *
     * @param xfb    zero or the name of an existing transform feedback object
     * @param index  the transform feedback stream index
     * @param buffer the name of an existing buffer object
     * @param offset the starting offset in basic machine units into the buffer object
     * @param size   the amount of data in machine units
     * 
     * @see <a href="https://docs.gl/gl4/glTransformFeedbackBufferRange">Reference Page</a>
     */
    public static native void glTransformFeedbackBufferRange(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glGetTransformFeedbackiv ] ---

    /** Unsafe version of: {@link #glGetTransformFeedbackiv GetTransformFeedbackiv} */
    public static native void nglGetTransformFeedbackiv(int xfb, int pname, long param);

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL42#GL_TRANSFORM_FEEDBACK_PAUSED TRANSFORM_FEEDBACK_PAUSED}</td><td>{@link GL42#GL_TRANSFORM_FEEDBACK_ACTIVE TRANSFORM_FEEDBACK_ACTIVE}</td></tr></table>
     * @param param the buffer in which to return the parameter value
     * 
     * @see <a href="https://docs.gl/gl4/glGetTransformFeedback">Reference Page</a>
     */
    public static void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetTransformFeedbackiv(xfb, pname, memAddress(param));
    }

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL42#GL_TRANSFORM_FEEDBACK_PAUSED TRANSFORM_FEEDBACK_PAUSED}</td><td>{@link GL42#GL_TRANSFORM_FEEDBACK_ACTIVE TRANSFORM_FEEDBACK_ACTIVE}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetTransformFeedback">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetTransformFeedbacki(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetTransformFeedbackiv(xfb, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTransformFeedbacki_v ] ---

    /** Unsafe version of: {@link #glGetTransformFeedbacki_v GetTransformFeedbacki_v} */
    public static native void nglGetTransformFeedbacki_v(int xfb, int pname, int index, long param);

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_BINDING TRANSFORM_FEEDBACK_BUFFER_BINDING}</td></tr></table>
     * @param index the transform feedback stream index
     * @param param the buffer in which to return the parameter value
     * 
     * @see <a href="https://docs.gl/gl4/glGetTransformFeedbacki_v">Reference Page</a>
     */
    public static void glGetTransformFeedbacki_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetTransformFeedbacki_v(xfb, pname, index, memAddress(param));
    }

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_BINDING TRANSFORM_FEEDBACK_BUFFER_BINDING}</td></tr></table>
     * @param index the transform feedback stream index
     * 
     * @see <a href="https://docs.gl/gl4/glGetTransformFeedbacki_v">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetTransformFeedbacki(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetTransformFeedbacki_v(xfb, pname, index, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTransformFeedbacki64_v ] ---

    /** Unsafe version of: {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v} */
    public static native void nglGetTransformFeedbacki64_v(int xfb, int pname, int index, long param);

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_START TRANSFORM_FEEDBACK_BUFFER_START}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_SIZE TRANSFORM_FEEDBACK_BUFFER_SIZE}</td></tr></table>
     * @param index the transform feedback stream index
     * @param param the buffer in which to return the parameter value
     * 
     * @see <a href="https://docs.gl/gl4/glGetTransformFeedbacki64_v">Reference Page</a>
     */
    public static void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetTransformFeedbacki64_v(xfb, pname, index, memAddress(param));
    }

    /**
     * Returns information about a transform feedback object.
     *
     * @param xfb   zero or the name of an existing transform feedback object
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_START TRANSFORM_FEEDBACK_BUFFER_START}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_SIZE TRANSFORM_FEEDBACK_BUFFER_SIZE}</td></tr></table>
     * @param index the transform feedback stream index
     * 
     * @see <a href="https://docs.gl/gl4/glGetTransformFeedbacki64_v">Reference Page</a>
     */
    @NativeType("void")
    public static long glGetTransformFeedbacki64(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer param = stack.callocLong(1);
            nglGetTransformFeedbacki64_v(xfb, pname, index, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateBuffers ] ---

    /**
     * Unsafe version of: {@link #glCreateBuffers CreateBuffers}
     *
     * @param n the number of buffer names to create
     */
    public static native void nglCreateBuffers(int n, long buffers);

    /**
     * Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
     * unspecified target.
     *
     * @param buffers the buffer in which to return the names
     * 
     * @see <a href="https://docs.gl/gl4/glCreateBuffers">Reference Page</a>
     */
    public static void glCreateBuffers(@NativeType("GLuint *") IntBuffer buffers) {
        nglCreateBuffers(buffers.remaining(), memAddress(buffers));
    }

    /**
     * Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
     * unspecified target.
     * 
     * @see <a href="https://docs.gl/gl4/glCreateBuffers">Reference Page</a>
     */
    @NativeType("void")
    public static int glCreateBuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.callocInt(1);
            nglCreateBuffers(1, memAddress(buffers));
            return buffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedBufferStorage ] ---

    /**
     * Unsafe version of: {@link #glNamedBufferStorage NamedBufferStorage}
     *
     * @param size the size of the data store in basic machine units
     */
    public static native void nglNamedBufferStorage(int buffer, long size, long data, int flags);

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
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, size, NULL, flags);
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
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, data.remaining(), memAddress(data), flags);
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
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), flags);
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
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
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
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
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
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), flags);
    }

    // --- [ glNamedBufferData ] ---

    /**
     * Unsafe version of: {@link #glNamedBufferData NamedBufferData}
     *
     * @param size the size in bytes of the buffer object's new data store
     */
    public static native void nglNamedBufferData(int buffer, long size, long data, int usage);

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param size  the size in bytes of the buffer object's new data store
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, size, NULL, usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, data.remaining(), memAddress(data), usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") LongBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /**
     * DSA version of {@link GL15C#glBufferData BufferData}.
     *
     * @param data  a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), usage);
    }

    // --- [ glNamedBufferSubData ] ---

    /**
     * Unsafe version of: {@link #glNamedBufferSubData NamedBufferSubData}
     *
     * @param size the size in bytes of the data store region being replaced
     */
    public static native void nglNamedBufferSubData(int buffer, long offset, long size, long data);

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     * 
     * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        nglNamedBufferSubData(buffer, offset, data.remaining(), memAddress(data));
    }

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     * 
     * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        nglNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     * 
     * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        nglNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     * 
     * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") LongBuffer data) {
        nglNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     * 
     * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        nglNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /**
     * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
     *
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     * 
     * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        nglNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
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
     * 
     * @see <a href="https://docs.gl/gl4/glCopyBufferSubData">Reference Page</a>
     */
    public static native void glCopyNamedBufferSubData(@NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size);

    // --- [ glClearNamedBufferData ] ---

    /** Unsafe version of: {@link #glClearNamedBufferData ClearNamedBufferData} */
    public static native void nglClearNamedBufferData(int buffer, int internalformat, int format, int type, long data);

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
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>
     */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
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
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>
     */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
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
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>
     */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
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
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>
     */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
    }

    // --- [ glClearNamedBufferSubData ] ---

    /** Unsafe version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
    public static native void nglClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, long data);

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
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>
     */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
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
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>
     */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
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
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>
     */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
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
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>
     */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    // --- [ glMapNamedBuffer ] ---

    /** Unsafe version of: {@link #glMapNamedBuffer MapNamedBuffer} */
    public static native long nglMapNamedBuffer(int buffer, int access);

    /**
     * DSA version of {@link GL15C#glMapBuffer MapBuffer}.
     *
     * @param buffer the buffer object name
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glMapBuffer">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access) {
        long __result = nglMapNamedBuffer(buffer, access);
        return memByteBufferSafe(__result, glGetNamedBufferParameteri(buffer, GL15.GL_BUFFER_SIZE));
    }

    /**
     * DSA version of {@link GL15C#glMapBuffer MapBuffer}.
     *
     * @param buffer the buffer object name
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glMapBuffer">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBuffer(buffer, access);
        int length = glGetNamedBufferParameteri(buffer, GL15.GL_BUFFER_SIZE);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /**
     * DSA version of {@link GL15C#glMapBuffer MapBuffer}.
     *
     * @param buffer the buffer object name
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glMapBuffer">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBuffer(buffer, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glMapNamedBufferRange ] ---

    /** Unsafe version of: {@link #glMapNamedBufferRange MapNamedBufferRange} */
    public static native long nglMapNamedBufferRange(int buffer, long offset, long length, int access);

    /**
     * DSA version of {@link GL30C#glMapBufferRange MapBufferRange}.
     *
     * @param buffer the buffer object name
     * @param offset the starting offset within the buffer of the range to be mapped
     * @param length the length of the range to be mapped
     * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glMapBufferRange">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        long __result = nglMapNamedBufferRange(buffer, offset, length, access);
        return memByteBufferSafe(__result, (int)length);
    }

    /**
     * DSA version of {@link GL30C#glMapBufferRange MapBufferRange}.
     *
     * @param buffer the buffer object name
     * @param offset the starting offset within the buffer of the range to be mapped
     * @param length the length of the range to be mapped
     * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glMapBufferRange">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBufferRange(buffer, offset, length, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glUnmapNamedBuffer ] ---

    /**
     * DSA version of {@link GL15C#glUnmapBuffer UnmapBuffer}.
     *
     * @param buffer the buffer object name
     * 
     * @see <a href="https://docs.gl/gl4/glUnmapBuffer">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static native boolean glUnmapNamedBuffer(@NativeType("GLuint") int buffer);

    // --- [ glFlushMappedNamedBufferRange ] ---

    /**
     * DSA version of {@link GL30C#glFlushMappedBufferRange FlushMappedBufferRange}.
     *
     * @param buffer the buffer object name
     * @param offset the start of the buffer subrange, in basic machine units
     * @param length the length of the buffer subrange, in basic machine units
     * 
     * @see <a href="https://docs.gl/gl4/glFlushMappedBufferRange">Reference Page</a>
     */
    public static native void glFlushMappedNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length);

    // --- [ glGetNamedBufferParameteriv ] ---

    /** Unsafe version of: {@link #glGetNamedBufferParameteriv GetNamedBufferParameteriv} */
    public static native void nglGetNamedBufferParameteriv(int buffer, int pname, long params);

    /**
     * DSA version of {@link GL15C#glGetBufferParameteriv GetBufferParameteriv}.
     *
     * @param buffer the buffer object name
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     * @param params the requested parameter
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>
     */
    public static void glGetNamedBufferParameteriv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedBufferParameteriv(buffer, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL15C#glGetBufferParameteriv GetBufferParameteriv}.
     *
     * @param buffer the buffer object name
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetNamedBufferParameteri(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedBufferParameteriv(buffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedBufferParameteri64v ] ---

    /** Unsafe version of: {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v} */
    public static native void nglGetNamedBufferParameteri64v(int buffer, int pname, long params);

    /**
     * DSA version of {@link GL32C#glGetBufferParameteri64v GetBufferParameteri64v}.
     *
     * @param buffer the buffer object name
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     * @param params the requested parameter
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>
     */
    public static void glGetNamedBufferParameteri64v(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedBufferParameteri64v(buffer, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL32C#glGetBufferParameteri64v GetBufferParameteri64v}.
     *
     * @param buffer the buffer object name
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>
     */
    @NativeType("void")
    public static long glGetNamedBufferParameteri64(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetNamedBufferParameteri64v(buffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedBufferPointerv ] ---

    /** Unsafe version of: {@link #glGetNamedBufferPointerv GetNamedBufferPointerv} */
    public static native void nglGetNamedBufferPointerv(int buffer, int pname, long params);

    /**
     * DSA version of {@link GL15C#glGetBufferPointerv GetBufferPointerv}.
     *
     * @param buffer the buffer object name
     * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link GL15#GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>
     * @param params the pointer value specified by {@code pname}
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferPointerv">Reference Page</a>
     */
    public static void glGetNamedBufferPointerv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedBufferPointerv(buffer, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL15C#glGetBufferPointerv GetBufferPointerv}.
     *
     * @param buffer the buffer object name
     * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link GL15#GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferPointerv">Reference Page</a>
     */
    @NativeType("void")
    public static long glGetNamedBufferPointer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetNamedBufferPointerv(buffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedBufferSubData ] ---

    /**
     * Unsafe version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
     *
     * @param size the size in bytes of the data store region being returned
     */
    public static native void nglGetNamedBufferSubData(int buffer, long offset, long size, long data);

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ByteBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, data.remaining(), memAddress(data));
    }

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ShortBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") IntBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") LongBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") FloatBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /**
     * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
     *
     * @param buffer the buffer object name
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") DoubleBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glCreateFramebuffers ] ---

    /**
     * Unsafe version of: {@link #glCreateFramebuffers CreateFramebuffers}
     *
     * @param n the number of framebuffer names to create
     */
    public static native void nglCreateFramebuffers(int n, long framebuffers);

    /**
     * Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.
     *
     * @param framebuffers the buffer in which to store the framebuffer names
     * 
     * @see <a href="https://docs.gl/gl4/glCreateFramebuffers">Reference Page</a>
     */
    public static void glCreateFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        nglCreateFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
    }

    /**
     * Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.
     * 
     * @see <a href="https://docs.gl/gl4/glCreateFramebuffers">Reference Page</a>
     */
    @NativeType("void")
    public static int glCreateFramebuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer framebuffers = stack.callocInt(1);
            nglCreateFramebuffers(1, memAddress(framebuffers));
            return framebuffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedFramebufferRenderbuffer ] ---

    /**
     * DSA version of {@link GL30C#glFramebufferRenderbuffer FramebufferRenderbuffer}.
     *
     * @param framebuffer        the framebuffer name
     * @param attachment         the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param renderbuffertarget the renderbuffer target. Must be:<br><table><tr><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param renderbuffer       the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach
     * 
     * @see <a href="https://docs.gl/gl4/glFramebufferRenderbuffer">Reference Page</a>
     */
    public static native void glNamedFramebufferRenderbuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer);

    // --- [ glNamedFramebufferParameteri ] ---

    /**
     * DSA version of {@link GL43C#glFramebufferParameteri FramebufferParameteri}.
     *
     * @param framebuffer the framebuffer name
     * @param pname       a token indicating the parameter to be modified. One of:<br><table><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     * @param param       the new value for the parameter named {@code pname}
     * 
     * @see <a href="https://docs.gl/gl4/glFramebufferParameteri">Reference Page</a>
     */
    public static native void glNamedFramebufferParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glNamedFramebufferTexture ] ---

    /**
     * DSA version of {@link GL32C#glFramebufferTexture FramebufferTexture}.
     *
     * @param framebuffer the framebuffer name
     * @param attachment  the attachment point of the framebuffer
     * @param texture     the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level       the mipmap level of {@code texture} to attach
     * 
     * @see <a href="https://docs.gl/gl4/glFramebufferTexture">Reference Page</a>
     */
    public static native void glNamedFramebufferTexture(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glNamedFramebufferTextureLayer ] ---

    /**
     * DSA version of {@link GL30C#glFramebufferTextureLayer FramebufferTextureLayer}.
     *
     * @param framebuffer the framebuffer name
     * @param attachment  the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param texture     the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level       the mipmap level of {@code texture} to attach
     * @param layer       the layer of {@code texture} to attach.
     * 
     * @see <a href="https://docs.gl/gl4/glFramebufferTextureLayer">Reference Page</a>
     */
    public static native void glNamedFramebufferTextureLayer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

    // --- [ glNamedFramebufferDrawBuffer ] ---

    /**
     * DSA version of {@link GL11C#glDrawBuffer DrawBuffer}.
     *
     * @param framebuffer the framebuffer name
     * @param buf         the color buffer to draw to. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_LEFT LEFT}</td></tr><tr><td>{@link GL11#GL_RIGHT RIGHT}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glFramebufferDrawBuffer">Reference Page</a>
     */
    public static native void glNamedFramebufferDrawBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buf);

    // --- [ glNamedFramebufferDrawBuffers ] ---

    /**
     * Unsafe version of: {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers}
     *
     * @param n the number of buffers in {@code bufs}
     */
    public static native void nglNamedFramebufferDrawBuffers(int framebuffer, int n, long bufs);

    /**
     * DSA version of {@link GL20C#glDrawBuffers DrawBuffers}.
     *
     * @param framebuffer the framebuffer name
     * @param bufs        an array of symbolic constants specifying the buffers into which fragment colors or data values will be written. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td></tr><tr><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glFramebufferDrawBuffers">Reference Page</a>
     */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer bufs) {
        nglNamedFramebufferDrawBuffers(framebuffer, bufs.remaining(), memAddress(bufs));
    }

    /**
     * DSA version of {@link GL20C#glDrawBuffers DrawBuffers}.
     *
     * @param framebuffer the framebuffer name
     * 
     * @see <a href="https://docs.gl/gl4/glFramebufferDrawBuffers">Reference Page</a>
     */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int buf) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufs = stack.ints(buf);
            nglNamedFramebufferDrawBuffers(framebuffer, 1, memAddress(bufs));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedFramebufferReadBuffer ] ---

    /**
     * DSA version of {@link GL11C#glReadBuffer ReadBuffer}.
     *
     * @param framebuffer the framebuffer name
     * @param src         the color buffer to read from. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_LEFT LEFT}</td></tr><tr><td>{@link GL11#GL_RIGHT RIGHT}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glFramebufferReadBuffer">Reference Page</a>
     */
    public static native void glNamedFramebufferReadBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int src);

    // --- [ glInvalidateNamedFramebufferData ] ---

    /**
     * Unsafe version of: {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData}
     *
     * @param numAttachments the number of entries in the {@code attachments} array
     */
    public static native void nglInvalidateNamedFramebufferData(int framebuffer, int numAttachments, long attachments);

    /**
     * DSA version of {@link GL43C#glInvalidateFramebuffer InvalidateFramebuffer}.
     *
     * @param framebuffer the framebuffer name
     * @param attachments the address of an array identifying the attachments to be invalidated
     * 
     * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferData">Reference Page</a>
     */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer attachments) {
        nglInvalidateNamedFramebufferData(framebuffer, attachments.remaining(), memAddress(attachments));
    }

    /**
     * DSA version of {@link GL43C#glInvalidateFramebuffer InvalidateFramebuffer}.
     *
     * @param framebuffer the framebuffer name
     * 
     * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferData">Reference Page</a>
     */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int attachment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer attachments = stack.ints(attachment);
            nglInvalidateNamedFramebufferData(framebuffer, 1, memAddress(attachments));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glInvalidateNamedFramebufferSubData ] ---

    /**
     * Unsafe version of: {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData}
     *
     * @param numAttachments the number of entries in the {@code attachments} array
     */
    public static native void nglInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, long attachments, int x, int y, int width, int height);

    /**
     * DSA version of {@link GL43C#glInvalidateSubFramebuffer InvalidateSubFramebuffer}.
     *
     * @param framebuffer the framebuffer name
     * @param attachments an array identifying the attachments to be invalidated
     * @param x           the X offset of the region to be invalidated
     * @param y           the Y offset of the region to be invalidated
     * @param width       the width of the region to be invalidated
     * @param height      the height of the region to be invalidated
     * 
     * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferSubData">Reference Page</a>
     */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        nglInvalidateNamedFramebufferSubData(framebuffer, attachments.remaining(), memAddress(attachments), x, y, width, height);
    }

    /**
     * DSA version of {@link GL43C#glInvalidateSubFramebuffer InvalidateSubFramebuffer}.
     *
     * @param framebuffer the framebuffer name
     * @param x           the X offset of the region to be invalidated
     * @param y           the Y offset of the region to be invalidated
     * @param width       the width of the region to be invalidated
     * @param height      the height of the region to be invalidated
     * 
     * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferSubData">Reference Page</a>
     */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int attachment, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer attachments = stack.ints(attachment);
            nglInvalidateNamedFramebufferSubData(framebuffer, 1, memAddress(attachments), x, y, width, height);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glClearNamedFramebufferiv ] ---

    /** Unsafe version of: {@link #glClearNamedFramebufferiv ClearNamedFramebufferiv} */
    public static native void nglClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, long value);

    /**
     * DSA version of {@link GL30C#glClearBufferiv ClearBufferiv}.
     *
     * @param framebuffer the framebuffer name
     * @param buffer      the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_STENCIL STENCIL}</td></tr></table>
     * @param drawbuffer  the draw buffer to clear
     * @param value       for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For stencil buffers, a pointer to a
     *                    single stencil value to clear the buffer to.
     * 
     * @see <a href="https://docs.gl/gl4/glClearFramebuffer">Reference Page</a>
     */
    public static void glClearNamedFramebufferiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, memAddress(value));
    }

    // --- [ glClearNamedFramebufferuiv ] ---

    /** Unsafe version of: {@link #glClearNamedFramebufferuiv ClearNamedFramebufferuiv} */
    public static native void nglClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, long value);

    /**
     * DSA version of {@link GL30C#glClearBufferuiv ClearBufferuiv}.
     *
     * @param framebuffer the framebuffer name
     * @param buffer      the buffer to clear. Must be:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td></tr></table>
     * @param drawbuffer  the draw buffer to clear
     * @param value       a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to
     * 
     * @see <a href="https://docs.gl/gl4/glClearFramebuffer">Reference Page</a>
     */
    public static void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 4);
        }
        nglClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, memAddress(value));
    }

    // --- [ glClearNamedFramebufferfv ] ---

    /** Unsafe version of: {@link #glClearNamedFramebufferfv ClearNamedFramebufferfv} */
    public static native void nglClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, long value);

    /**
     * DSA version of {@link GL30C#glClearBufferfv ClearBufferfv}.
     *
     * @param framebuffer the framebuffer name
     * @param buffer      the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_DEPTH DEPTH}</td></tr></table>
     * @param drawbuffer  the draw buffer to clear
     * @param value       for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For depth buffers, a pointer to a
     *                    single depth value to clear the buffer to.
     * 
     * @see <a href="https://docs.gl/gl4/glClearFramebuffer">Reference Page</a>
     */
    public static void glClearNamedFramebufferfv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, memAddress(value));
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
     * 
     * @see <a href="https://docs.gl/gl4/glClearFramebufferfi">Reference Page</a>
     */
    public static native void glClearNamedFramebufferfi(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil);

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
     * 
     * @see <a href="https://docs.gl/gl4/glBlitFramebuffer">Reference Page</a>
     */
    public static native void glBlitNamedFramebuffer(@NativeType("GLuint") int readFramebuffer, @NativeType("GLuint") int drawFramebuffer, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

    // --- [ glCheckNamedFramebufferStatus ] ---

    /**
     * DSA version of {@link GL30C#glCheckFramebufferStatus CheckFramebufferStatus}.
     *
     * @param framebuffer the framebuffer name
     * @param target      the target of the framebuffer completeness check. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glCheckFramebufferStatus">Reference Page</a>
     */
    @NativeType("GLenum")
    public static native int glCheckNamedFramebufferStatus(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int target);

    // --- [ glGetNamedFramebufferParameteriv ] ---

    /** Unsafe version of: {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv} */
    public static native void nglGetNamedFramebufferParameteriv(int framebuffer, int pname, long params);

    /**
     * DSA version of {@link GL43C#glGetFramebufferParameteriv GetFramebufferParameteriv}.
     *
     * @param framebuffer the framebuffer name
     * @param pname       a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     * @param params      a variable to receive the value of the parameter named {@code pname}
     * 
     * @see <a href="https://docs.gl/gl4/glGetFramebufferParameter">Reference Page</a>
     */
    public static void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedFramebufferParameteriv(framebuffer, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL43C#glGetFramebufferParameteriv GetFramebufferParameteriv}.
     *
     * @param framebuffer the framebuffer name
     * @param pname       a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetFramebufferParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetNamedFramebufferParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedFramebufferParameteriv(framebuffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedFramebufferAttachmentParameteriv ] ---

    /** Unsafe version of: {@link #glGetNamedFramebufferAttachmentParameteriv GetNamedFramebufferAttachmentParameteriv} */
    public static native void nglGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, long params);

    /**
     * DSA version of {@link GL30C#glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}.
     *
     * @param framebuffer the framebuffer name
     * @param attachment  the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param pname       the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
     * @param params      an array to receive the value of the queried parameter
     * 
     * @see <a href="https://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>
     */
    public static void glGetNamedFramebufferAttachmentParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL30C#glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}.
     *
     * @param framebuffer the framebuffer name
     * @param attachment  the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param pname       the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetNamedFramebufferAttachmentParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateRenderbuffers ] ---

    /**
     * Unsafe version of: {@link #glCreateRenderbuffers CreateRenderbuffers}
     *
     * @param n the number of renderbuffer names to create
     */
    public static native void nglCreateRenderbuffers(int n, long renderbuffers);

    /**
     * Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.
     *
     * @param renderbuffers the buffer in which to store the created renderbuffer names
     * 
     * @see <a href="https://docs.gl/gl4/glCreateRenderbuffers">Reference Page</a>
     */
    public static void glCreateRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        nglCreateRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
    }

    /**
     * Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.
     * 
     * @see <a href="https://docs.gl/gl4/glCreateRenderbuffers">Reference Page</a>
     */
    @NativeType("void")
    public static int glCreateRenderbuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer renderbuffers = stack.callocInt(1);
            nglCreateRenderbuffers(1, memAddress(renderbuffers));
            return renderbuffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedRenderbufferStorage ] ---

    /**
     * DSA version of {@link GL30C#glRenderbufferStorage RenderbufferStorage}.
     *
     * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
     * @param width          the width of the renderbuffer, in pixels
     * @param height         the height of the renderbuffer, in pixels
     * 
     * @see <a href="https://docs.gl/gl4/glRenderbufferStorage">Reference Page</a>
     */
    public static native void glNamedRenderbufferStorage(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glNamedRenderbufferStorageMultisample ] ---

    /**
     * DSA version of {@link GL30C#glRenderbufferStorageMultisample RenderbufferStorageMultisample}.
     *
     * @param samples        the number of samples to be used for the renderbuffer object's storage
     * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
     * @param width          the width of the renderbuffer, in pixels
     * @param height         the height of the renderbuffer, in pixels
     * 
     * @see <a href="https://docs.gl/gl4/glRenderbufferStorageMultisample">Reference Page</a>
     */
    public static native void glNamedRenderbufferStorageMultisample(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetNamedRenderbufferParameteriv ] ---

    /** Unsafe version of: {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv} */
    public static native void nglGetNamedRenderbufferParameteriv(int renderbuffer, int pname, long params);

    /**
     * DSA version of {@link GL30C#glGetRenderbufferParameteriv GetRenderbufferParameteriv}.
     *
     * @param pname  the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
     * @param params an array to receive the value of the queried parameter
     * 
     * @see <a href="https://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>
     */
    public static void glGetNamedRenderbufferParameteriv(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedRenderbufferParameteriv(renderbuffer, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL30C#glGetRenderbufferParameteriv GetRenderbufferParameteriv}.
     *
     * @param pname the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetNamedRenderbufferParameteri(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedRenderbufferParameteriv(renderbuffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateTextures ] ---

    /**
     * Unsafe version of: {@link #glCreateTextures CreateTextures}
     *
     * @param n the number of texture names to create
     */
    public static native void nglCreateTextures(int target, int n, long textures);

    /**
     * Returns {@code n} previously unused texture names in {@code textures}, each representing a new texture object.
     *
     * @param target   the texture target. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
     * @param textures the buffer in which to store the created texture names
     * 
     * @see <a href="https://docs.gl/gl4/glCreateTextures">Reference Page</a>
     */
    public static void glCreateTextures(@NativeType("GLenum") int target, @NativeType("GLuint *") IntBuffer textures) {
        nglCreateTextures(target, textures.remaining(), memAddress(textures));
    }

    /**
     * Returns {@code n} previously unused texture names in {@code textures}, each representing a new texture object.
     *
     * @param target the texture target. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glCreateTextures">Reference Page</a>
     */
    @NativeType("void")
    public static int glCreateTextures(@NativeType("GLenum") int target) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer textures = stack.callocInt(1);
            nglCreateTextures(target, 1, memAddress(textures));
            return textures.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTextureBuffer ] ---

    /**
     * DSA version of {@link GL31C#glTexBuffer TexBuffer}.
     *
     * @param texture        the texture name
     * @param internalformat the sized internal format of the data in the store belonging to {@code buffer}
     * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
     * 
     * @see <a href="https://docs.gl/gl4/glTextureBuffer">Reference Page</a>
     */
    public static native void glTextureBuffer(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

    // --- [ glTextureBufferRange ] ---

    /**
     * DSA version of {@link GL43C#glTexBufferRange TexBufferRange}.
     *
     * @param texture        the texture name
     * @param internalformat the internal format of the data in the store belonging to {@code buffer}
     * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
     * @param offset         the offset of the start of the range of the buffer's data store to attach
     * @param size           the size of the range of the buffer's data store to attach
     * 
     * @see <a href="https://docs.gl/gl4/glTextureBufferRange">Reference Page</a>
     */
    public static native void glTextureBufferRange(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glTextureStorage1D ] ---

    /**
     * DSA version of {@link GL42C#glTexStorage1D TexStorage1D}.
     *
     * @param texture        the texture name
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     * 
     * @see <a href="https://docs.gl/gl4/glTextureStorage1D">Reference Page</a>
     */
    public static native void glTextureStorage1D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width);

    // --- [ glTextureStorage2D ] ---

    /**
     * DSA version of {@link GL42C#glTexStorage2D TexStorage2D}.
     *
     * @param texture        the texture name
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     * @param height         the height of the texture, in texels
     * 
     * @see <a href="https://docs.gl/gl4/glTextureStorage2D">Reference Page</a>
     */
    public static native void glTextureStorage2D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureStorage3D">Reference Page</a>
     */
    public static native void glTextureStorage3D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth);

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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureStorage2DMultisample">Reference Page</a>
     */
    public static native void glTextureStorage2DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations);

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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureStorage3DMultisample">Reference Page</a>
     */
    public static native void glTextureStorage3DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations);

    // --- [ glTextureSubImage1D ] ---

    /** Unsafe version of: {@link #glTextureSubImage1D TextureSubImage1D} */
    public static native void nglTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels);

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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage1D">Reference Page</a>
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage1D">Reference Page</a>
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage1D">Reference Page</a>
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage1D">Reference Page</a>
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage1D">Reference Page</a>
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage1D">Reference Page</a>
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
    }

    // --- [ glTextureSubImage2D ] ---

    /** Unsafe version of: {@link #glTextureSubImage2D TextureSubImage2D} */
    public static native void nglTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage2D">Reference Page</a>
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage2D">Reference Page</a>
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage2D">Reference Page</a>
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage2D">Reference Page</a>
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage2D">Reference Page</a>
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage2D">Reference Page</a>
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    // --- [ glTextureSubImage3D ] ---

    /** Unsafe version of: {@link #glTextureSubImage3D TextureSubImage3D} */
    public static native void nglTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage3D">Reference Page</a>
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage3D">Reference Page</a>
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage3D">Reference Page</a>
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage3D">Reference Page</a>
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage3D">Reference Page</a>
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
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
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage3D">Reference Page</a>
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCompressedTextureSubImage1D ] ---

    /**
     * Unsafe version of: {@link #glCompressedTextureSubImage1D CompressedTextureSubImage1D}
     *
     * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
     */
    public static native void nglCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data);

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
     * 
     * @see <a href="https://docs.gl/gl4/glCompressedTextureSubImage1D">Reference Page</a>
     */
    public static void glCompressedTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
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
     * 
     * @see <a href="https://docs.gl/gl4/glCompressedTextureSubImage1D">Reference Page</a>
     */
    public static void glCompressedTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTextureSubImage2D ] ---

    /**
     * Unsafe version of: {@link #glCompressedTextureSubImage2D CompressedTextureSubImage2D}
     *
     * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
     */
    public static native void nglCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

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
     * 
     * @see <a href="https://docs.gl/gl4/glCompressedTextureSubImage2D">Reference Page</a>
     */
    public static void glCompressedTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
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
     * 
     * @see <a href="https://docs.gl/gl4/glCompressedTextureSubImage2D">Reference Page</a>
     */
    public static void glCompressedTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTextureSubImage3D ] ---

    /**
     * Unsafe version of: {@link #glCompressedTextureSubImage3D CompressedTextureSubImage3D}
     *
     * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
     */
    public static native void nglCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

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
     * 
     * @see <a href="https://docs.gl/gl4/glCompressedTextureSubImage3D">Reference Page</a>
     */
    public static void glCompressedTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
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
     * 
     * @see <a href="https://docs.gl/gl4/glCompressedTextureSubImage3D">Reference Page</a>
     */
    public static void glCompressedTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
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
     * 
     * @see <a href="https://docs.gl/gl4/glCopyTextureSubImage1D">Reference Page</a>
     */
    public static native void glCopyTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

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
     * 
     * @see <a href="https://docs.gl/gl4/glCopyTextureSubImage2D">Reference Page</a>
     */
    public static native void glCopyTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

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
     * 
     * @see <a href="https://docs.gl/gl4/glCopyTextureSubImage3D">Reference Page</a>
     */
    public static native void glCopyTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glTextureParameterf ] ---

    /**
     * DSA version of {@link GL11C#glTexParameterf TexParameterf}.
     *
     * @param texture the texture name
     * @param pname   the parameter to set
     * @param param   the parameter value
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameterf">Reference Page</a>
     */
    public static native void glTextureParameterf(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glTextureParameterfv ] ---

    /** Unsafe version of: {@link #glTextureParameterfv TextureParameterfv} */
    public static native void nglTextureParameterfv(int texture, int pname, long params);

    /**
     * DSA version of {@link GL11C#glTexParameterfv TexParameterfv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to set
     * @param params  the parameter value
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
     */
    public static void glTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTextureParameterfv(texture, pname, memAddress(params));
    }

    // --- [ glTextureParameteri ] ---

    /**
     * DSA version of {@link GL11C#glTexParameteri TexParameteri}.
     *
     * @param texture the texture name
     * @param pname   the parameter to set. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td></tr><tr><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td></tr></table>
     * @param param   the parameter value
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameteri">Reference Page</a>
     */
    public static native void glTextureParameteri(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glTextureParameterIiv ] ---

    /** Unsafe version of: {@link #glTextureParameterIiv TextureParameterIiv} */
    public static native void nglTextureParameterIiv(int texture, int pname, long params);

    /**
     * DSA version of {@link GL30C#glTexParameterIiv TexParameterIiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a single-valued texture parameter
     * @param params  the value of {@code pname}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
     */
    public static void glTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTextureParameterIiv(texture, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL30C#glTexParameterIiv TexParameterIiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a single-valued texture parameter
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
     */
    public static void glTextureParameterIi(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTextureParameterIiv(texture, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTextureParameterIuiv ] ---

    /** Unsafe version of: {@link #glTextureParameterIuiv TextureParameterIuiv} */
    public static native void nglTextureParameterIuiv(int texture, int pname, long params);

    /**
     * DSA version of {@link GL30C#glTexParameterIuiv TexParameterIuiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a single-valued texture parameter
     * @param params  the value of {@code pname}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
     */
    public static void glTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTextureParameterIuiv(texture, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL30C#glTexParameterIuiv TexParameterIuiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a single-valued texture parameter
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
     */
    public static void glTextureParameterIui(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTextureParameterIuiv(texture, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTextureParameteriv ] ---

    /** Unsafe version of: {@link #glTextureParameteriv TextureParameteriv} */
    public static native void nglTextureParameteriv(int texture, int pname, long params);

    /**
     * DSA version of {@link GL11C#glTexParameteriv TexParameteriv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to set
     * @param params  the parameter value
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
     */
    public static void glTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTextureParameteriv(texture, pname, memAddress(params));
    }

    // --- [ glGenerateTextureMipmap ] ---

    /**
     * DSA version of {@link GL30C#glGenerateMipmap GenerateMipmap}.
     *
     * @param texture the texture name
     * 
     * @see <a href="https://docs.gl/gl4/glGenerateTextureMipmap">Reference Page</a>
     */
    public static native void glGenerateTextureMipmap(@NativeType("GLuint") int texture);

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
     * 
     * @see <a href="https://docs.gl/gl4/glBindTextureUnit">Reference Page</a>
     */
    public static native void glBindTextureUnit(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture);

    // --- [ glGetTextureImage ] ---

    /**
     * Unsafe version of: {@link #glGetTextureImage GetTextureImage}
     *
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     */
    public static native void nglGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels);

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureImage">Reference Page</a>
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglGetTextureImage(texture, level, format, type, bufSize, pixels);
    }

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureImage">Reference Page</a>
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglGetTextureImage(texture, level, format, type, pixels.remaining(), memAddress(pixels));
    }

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureImage">Reference Page</a>
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglGetTextureImage(texture, level, format, type, pixels.remaining() << 1, memAddress(pixels));
    }

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureImage">Reference Page</a>
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureImage">Reference Page</a>
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /**
     * DSA version of {@link GL11C#glGetTexImage GetTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureImage">Reference Page</a>
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        nglGetTextureImage(texture, level, format, type, pixels.remaining() << 3, memAddress(pixels));
    }

    // --- [ glGetCompressedTextureImage ] ---

    /**
     * Unsafe version of: {@link #glGetCompressedTextureImage GetCompressedTextureImage}
     *
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     */
    public static native void nglGetCompressedTextureImage(int texture, int level, int bufSize, long pixels);

    /**
     * DSA version of {@link GL13C#glGetCompressedTexImage GetCompressedTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     * @param pixels  a buffer in which to return the compressed texture image
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureImage">Reference Page</a>
     */
    public static void glGetCompressedTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglGetCompressedTextureImage(texture, level, bufSize, pixels);
    }

    /**
     * DSA version of {@link GL13C#glGetCompressedTexImage GetCompressedTexImage}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param pixels  a buffer in which to return the compressed texture image
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureImage">Reference Page</a>
     */
    public static void glGetCompressedTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer pixels) {
        if (CHECKS) {
            if (DEBUG) {
                check(pixels, glGetTextureLevelParameteri(texture, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetCompressedTextureImage(texture, level, pixels.remaining(), memAddress(pixels));
    }

    // --- [ glGetTextureLevelParameterfv ] ---

    /** Unsafe version of: {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv} */
    public static native void nglGetTextureLevelParameterfv(int texture, int level, int pname, long params);

    /**
     * DSA version of {@link GL11C#glGetTexLevelParameterfv GetTexLevelParameterfv}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param pname   the parameter to query
     * @param params  a scalar or buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureLevelParameter">Reference Page</a>
     */
    public static void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureLevelParameterfv(texture, level, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL11C#glGetTexLevelParameterfv GetTexLevelParameterfv}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param pname   the parameter to query
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureLevelParameter">Reference Page</a>
     */
    @NativeType("void")
    public static float glGetTextureLevelParameterf(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTextureLevelParameterfv(texture, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureLevelParameteriv ] ---

    /** Unsafe version of: {@link #glGetTextureLevelParameteriv GetTextureLevelParameteriv} */
    public static native void nglGetTextureLevelParameteriv(int texture, int level, int pname, long params);

    /**
     * DSA version of {@link GL11C#glGetTexLevelParameteriv GetTexLevelParameteriv}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WIDTH TEXTURE_WIDTH}</td><td>{@link GL11#GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}</td><td>{@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}</td><td>{@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}</td></tr><tr><td>{@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}</td><td>{@link GL11#GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}</td><td>{@link GL11#GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}</td><td>{@link GL11#GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}</td></tr><tr><td>{@link GL11#GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}</td><td>{@link GL11#GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}</td><td>{@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}</td><td>{@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}</td><td>{@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}</td><td>{@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}</td><td>{@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}</td></tr><tr><td>{@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}</td><td>{@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}</td><td>{@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}</td><td>{@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}</td></tr></table>
     * @param params  a scalar or buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureLevelParameter">Reference Page</a>
     */
    public static void glGetTextureLevelParameteriv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureLevelParameteriv(texture, level, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL11C#glGetTexLevelParameteriv GetTexLevelParameteriv}.
     *
     * @param texture the texture name
     * @param level   the level-of-detail number
     * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WIDTH TEXTURE_WIDTH}</td><td>{@link GL11#GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}</td><td>{@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}</td><td>{@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}</td></tr><tr><td>{@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}</td><td>{@link GL11#GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}</td><td>{@link GL11#GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}</td><td>{@link GL11#GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}</td></tr><tr><td>{@link GL11#GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}</td><td>{@link GL11#GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}</td><td>{@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}</td><td>{@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}</td><td>{@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}</td><td>{@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}</td><td>{@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}</td></tr><tr><td>{@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}</td><td>{@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}</td><td>{@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}</td><td>{@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureLevelParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetTextureLevelParameteri(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureLevelParameteriv(texture, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterfv ] ---

    /** Unsafe version of: {@link #glGetTextureParameterfv GetTextureParameterfv} */
    public static native void nglGetTextureParameterfv(int texture, int pname, long params);

    /**
     * DSA version of {@link GL11C#glGetTexParameterfv GetTexParameterfv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to query
     * @param params  a scalar or buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    public static void glGetTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterfv(texture, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL11C#glGetTexParameterfv GetTexParameterfv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to query
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    @NativeType("void")
    public static float glGetTextureParameterf(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTextureParameterfv(texture, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterIiv ] ---

    /** Unsafe version of: {@link #glGetTextureParameterIiv GetTextureParameterIiv} */
    public static native void nglGetTextureParameterIiv(int texture, int pname, long params);

    /**
     * DSA version of {@link GL30C#glGetTexParameterIiv GetTexParameterIiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a texture parameter
     * @param params  returns the texture parameter value
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    public static void glGetTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterIiv(texture, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL30C#glGetTexParameterIiv GetTexParameterIiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a texture parameter
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetTextureParameterIi(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterIiv(texture, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterIuiv ] ---

    /** Unsafe version of: {@link #glGetTextureParameterIuiv GetTextureParameterIuiv} */
    public static native void nglGetTextureParameterIuiv(int texture, int pname, long params);

    /**
     * DSA version of {@link GL30C#glGetTexParameterIuiv GetTexParameterIuiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a texture parameter
     * @param params  returns the texture parameter value
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    public static void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterIuiv(texture, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL30C#glGetTexParameterIuiv GetTexParameterIuiv}.
     *
     * @param texture the texture name
     * @param pname   the symbolic name of a texture parameter
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetTextureParameterIui(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterIuiv(texture, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameteriv ] ---

    /** Unsafe version of: {@link #glGetTextureParameteriv GetTextureParameteriv} */
    public static native void nglGetTextureParameteriv(int texture, int pname, long params);

    /**
     * DSA version of {@link GL11C#glGetTexParameteriv GetTexParameteriv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td></tr><tr><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td></tr><tr><td>{@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}</td><td>{@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}</td><td>{@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}</td></tr><tr><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}</td></tr></table>
     * @param params  a scalar or buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    public static void glGetTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameteriv(texture, pname, memAddress(params));
    }

    /**
     * DSA version of {@link GL11C#glGetTexParameteriv GetTexParameteriv}.
     *
     * @param texture the texture name
     * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td></tr><tr><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td></tr><tr><td>{@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}</td><td>{@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}</td><td>{@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}</td></tr><tr><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetTextureParameteri(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameteriv(texture, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateVertexArrays ] ---

    /**
     * Unsafe version of: {@link #glCreateVertexArrays CreateVertexArrays}
     *
     * @param n the number of vertex array object names to create
     */
    public static native void nglCreateVertexArrays(int n, long arrays);

    /**
     * Returns {@code n} previously unused vertex array object names in {@code arrays}.
     *
     * @param arrays the buffer in which to return the created vertex array object names
     * 
     * @see <a href="https://docs.gl/gl4/glCreateVertexArrays">Reference Page</a>
     */
    public static void glCreateVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        nglCreateVertexArrays(arrays.remaining(), memAddress(arrays));
    }

    /**
     * Returns {@code n} previously unused vertex array object names in {@code arrays}.
     * 
     * @see <a href="https://docs.gl/gl4/glCreateVertexArrays">Reference Page</a>
     */
    @NativeType("void")
    public static int glCreateVertexArrays() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arrays = stack.callocInt(1);
            nglCreateVertexArrays(1, memAddress(arrays));
            return arrays.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDisableVertexArrayAttrib ] ---

    /**
     * DSA version of {@link GL20C#glDisableVertexAttribArray DisableVertexAttribArray}.
     *
     * @param vaobj the vertex array object name
     * @param index the index of the generic vertex attribute to be disabled
     * 
     * @see <a href="https://docs.gl/gl4/glDisableVertexArrayAttrib">Reference Page</a>
     */
    public static native void glDisableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index);

    // --- [ glEnableVertexArrayAttrib ] ---

    /**
     * DSA version of {@link GL20C#glEnableVertexAttribArray EnableVertexAttribArray}.
     *
     * @param vaobj the vertex array object name
     * @param index the index of the generic vertex attribute to be enabled
     * 
     * @see <a href="https://docs.gl/gl4/glEnableVertexArrayAttrib">Reference Page</a>
     */
    public static native void glEnableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index);

    // --- [ glVertexArrayElementBuffer ] ---

    /**
     * Binds a buffer object to the element array buffer bind point of a vertex array object.
     *
     * @param vaobj  the vertex array object name
     * @param buffer the buffer object name. If {@code buffer} is zero, any existing element array buffer binding to {@code vaobj} is removed.
     * 
     * @see <a href="https://docs.gl/gl4/glVertexArrayElementBuffer">Reference Page</a>
     */
    public static native void glVertexArrayElementBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer);

    // --- [ glVertexArrayVertexBuffer ] ---

    /**
     * DSA version of {@link GL43C#glBindVertexBuffer BindVertexBuffer}.
     *
     * @param vaobj        the vertex array object name
     * @param bindingindex the index of the vertex buffer binding point to which to bind the buffer
     * @param buffer       the name of an existing buffer to bind to the vertex buffer binding point
     * @param offset       the offset of the first element of the buffer
     * @param stride       the distance between elements within the buffer
     * 
     * @see <a href="https://docs.gl/gl4/glVertexArrayVertexBuffer">Reference Page</a>
     */
    public static native void glVertexArrayVertexBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride);

    // --- [ glVertexArrayVertexBuffers ] ---

    /**
     * Unsafe version of: {@link #glVertexArrayVertexBuffers VertexArrayVertexBuffers}
     *
     * @param count the number of vertex buffer binding points
     */
    public static native void nglVertexArrayVertexBuffers(int vaobj, int first, int count, long buffers, long offsets, long strides);

    /**
     * DSA version of {@link GL44C#glBindVertexBuffers BindVertexBuffers}.
     *
     * @param vaobj   the vertex array object name
     * @param first   the first vertex buffer binding point
     * @param buffers an array of zeros or names of existing buffers objects
     * @param offsets an array of offses
     * @param strides an array of stride values
     * 
     * @see <a href="https://docs.gl/gl4/glVertexArrayVertexBuffers">Reference Page</a>
     */
    public static void glVertexArrayVertexBuffers(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizei const *") IntBuffer strides) {
        if (CHECKS) {
            checkSafe(offsets, remainingSafe(buffers));
            checkSafe(strides, remainingSafe(buffers));
        }
        nglVertexArrayVertexBuffers(vaobj, first, remainingSafe(buffers), memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(strides));
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
     * 
     * @see <a href="https://docs.gl/gl4/glVertexArrayAttribFormat">Reference Page</a>
     */
    public static native void glVertexArrayAttribFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexArrayAttribIFormat ] ---

    /**
     * DSA version of {@link GL43C#glVertexAttribIFormat VertexAttribIFormat}.
     *
     * @param vaobj          the vertex array object name
     * @param attribindex    the generic vertex attribute array being described
     * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type           the type of the data stored in the array
     * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
     * 
     * @see <a href="https://docs.gl/gl4/glVertexArrayAttribIFormat">Reference Page</a>
     */
    public static native void glVertexArrayAttribIFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexArrayAttribLFormat ] ---

    /**
     * DSA version of {@link GL43C#glVertexAttribLFormat VertexAttribLFormat}.
     *
     * @param vaobj          the vertex array object name
     * @param attribindex    the generic vertex attribute array being described
     * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type           the type of the data stored in the array
     * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
     * 
     * @see <a href="https://docs.gl/gl4/glVertexArrayAttribLFormat">Reference Page</a>
     */
    public static native void glVertexArrayAttribLFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexArrayAttribBinding ] ---

    /**
     * DSA version of {@link GL43C#glVertexAttribBinding VertexAttribBinding}.
     *
     * @param vaobj        the vertex array object name
     * @param attribindex  the index of the attribute to associate with a vertex buffer binding
     * @param bindingindex the index of the vertex buffer binding with which to associate the generic vertex attribute
     * 
     * @see <a href="https://docs.gl/gl4/glVertexArrayAttribBinding">Reference Page</a>
     */
    public static native void glVertexArrayAttribBinding(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex);

    // --- [ glVertexArrayBindingDivisor ] ---

    /**
     * DSA version of {@link GL43C#glVertexBindingDivisor VertexBindingDivisor}.
     *
     * @param vaobj        the vertex array object name
     * @param bindingindex the index of the generic vertex attribute
     * @param divisor      the number of instances that will pass between updates of the generic attribute at slot {@code index}
     * 
     * @see <a href="https://docs.gl/gl4/glVertexArrayBindingDivisor">Reference Page</a>
     */
    public static native void glVertexArrayBindingDivisor(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor);

    // --- [ glGetVertexArrayiv ] ---

    /** Unsafe version of: {@link #glGetVertexArrayiv GetVertexArrayiv} */
    public static native void nglGetVertexArrayiv(int vaobj, int pname, long param);

    /**
     * Queries parameters of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER_BINDING ELEMENT_ARRAY_BUFFER_BINDING}</td></tr></table>
     * @param param the buffer in which to return the parameter values
     * 
     * @see <a href="https://docs.gl/gl4/glGetVertexArray">Reference Page</a>
     */
    public static void glGetVertexArrayiv(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayiv(vaobj, pname, memAddress(param));
    }

    /**
     * Queries parameters of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER_BINDING ELEMENT_ARRAY_BUFFER_BINDING}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetVertexArray">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetVertexArrayi(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetVertexArrayiv(vaobj, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayIndexediv ] ---

    /** Unsafe version of: {@link #glGetVertexArrayIndexediv GetVertexArrayIndexediv} */
    public static native void nglGetVertexArrayIndexediv(int vaobj, int index, int pname, long param);

    /**
     * Queries parameters of an attribute of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param index the attribute to query
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE},</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td><td>{@link GL43#GL_VERTEX_ATTRIB_ARRAY_LONG VERTEX_ATTRIB_ARRAY_LONG}</td></tr><tr><td>{@link GL43#GL_VERTEX_ATTRIB_RELATIVE_OFFSET VERTEX_ATTRIB_RELATIVE_OFFSET}</td></tr></table>
     * @param param the buffer in which to return the parameter values
     * 
     * @see <a href="https://docs.gl/gl4/glGetVertexArrayIndexed">Reference Page</a>
     */
    public static void glGetVertexArrayIndexediv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayIndexediv(vaobj, index, pname, memAddress(param));
    }

    /**
     * Queries parameters of an attribute of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param index the attribute to query
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE},</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td><td>{@link GL43#GL_VERTEX_ATTRIB_ARRAY_LONG VERTEX_ATTRIB_ARRAY_LONG}</td></tr><tr><td>{@link GL43#GL_VERTEX_ATTRIB_RELATIVE_OFFSET VERTEX_ATTRIB_RELATIVE_OFFSET}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetVertexArrayIndexed">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetVertexArrayIndexedi(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetVertexArrayIndexediv(vaobj, index, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayIndexed64iv ] ---

    /** Unsafe version of: {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv} */
    public static native void nglGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long param);

    /**
     * Queries parameters of an attribute of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param index the attribute to query
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL43#GL_VERTEX_BINDING_OFFSET VERTEX_BINDING_OFFSET}</td></tr></table>
     * @param param the buffer in which to return the parameter values
     * 
     * @see <a href="https://docs.gl/gl4/glGetVertexArrayIndexed">Reference Page</a>
     */
    public static void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayIndexed64iv(vaobj, index, pname, memAddress(param));
    }

    /**
     * Queries parameters of an attribute of a vertex array object.
     *
     * @param vaobj the vertex array object name
     * @param index the attribute to query
     * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL43#GL_VERTEX_BINDING_OFFSET VERTEX_BINDING_OFFSET}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetVertexArrayIndexed">Reference Page</a>
     */
    @NativeType("void")
    public static long glGetVertexArrayIndexed64i(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer param = stack.callocLong(1);
            nglGetVertexArrayIndexed64iv(vaobj, index, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateSamplers ] ---

    /**
     * Unsafe version of: {@link #glCreateSamplers CreateSamplers}
     *
     * @param n the number of sampler object names to create
     */
    public static native void nglCreateSamplers(int n, long samplers);

    /**
     * Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.
     *
     * @param samplers the buffer in which to return the created sampler object names
     * 
     * @see <a href="https://docs.gl/gl4/glCreateSamplers">Reference Page</a>
     */
    public static void glCreateSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        nglCreateSamplers(samplers.remaining(), memAddress(samplers));
    }

    /**
     * Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.
     * 
     * @see <a href="https://docs.gl/gl4/glCreateSamplers">Reference Page</a>
     */
    @NativeType("void")
    public static int glCreateSamplers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer samplers = stack.callocInt(1);
            nglCreateSamplers(1, memAddress(samplers));
            return samplers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateProgramPipelines ] ---

    /**
     * Unsafe version of: {@link #glCreateProgramPipelines CreateProgramPipelines}
     *
     * @param n the number of program pipeline names to create
     */
    public static native void nglCreateProgramPipelines(int n, long pipelines);

    /**
     * Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.
     *
     * @param pipelines the buffer in which to return the created program pipeline names
     * 
     * @see <a href="https://docs.gl/gl4/glCreateProgramPipelines">Reference Page</a>
     */
    public static void glCreateProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        nglCreateProgramPipelines(pipelines.remaining(), memAddress(pipelines));
    }

    /**
     * Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.
     * 
     * @see <a href="https://docs.gl/gl4/glCreateProgramPipelines">Reference Page</a>
     */
    @NativeType("void")
    public static int glCreateProgramPipelines() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer pipelines = stack.callocInt(1);
            nglCreateProgramPipelines(1, memAddress(pipelines));
            return pipelines.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateQueries ] ---

    /**
     * Unsafe version of: {@link #glCreateQueries CreateQueries}
     *
     * @param n the number of query object names to create
     */
    public static native void nglCreateQueries(int target, int n, long ids);

    /**
     * Returns {@code n} previously unused query object names in {@code ids}, each representing a new query object with the specified {@code target}.
     *
     * @param target the query target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     * @param ids    the buffer in which to return the created query object names
     * 
     * @see <a href="https://docs.gl/gl4/glCreateQueries">Reference Page</a>
     */
    public static void glCreateQueries(@NativeType("GLenum") int target, @NativeType("GLuint *") IntBuffer ids) {
        nglCreateQueries(target, ids.remaining(), memAddress(ids));
    }

    /**
     * Returns {@code n} previously unused query object names in {@code ids}, each representing a new query object with the specified {@code target}.
     *
     * @param target the query target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glCreateQueries">Reference Page</a>
     */
    @NativeType("void")
    public static int glCreateQueries(@NativeType("GLenum") int target) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglCreateQueries(target, 1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryBufferObjectiv ] ---

    /**
     * Queries the state of a query object.
     *
     * @param id     the name of a query object
     * @param buffer the name of a buffer object
     * @param pname  the state to query
     * @param offset the offset into {@code buffer} at which the queried value is written
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryBufferObject">Reference Page</a>
     */
    public static native void glGetQueryBufferObjectiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset);

    // --- [ glGetQueryBufferObjectuiv ] ---

    /**
     * Unsigned version of {@link #glGetQueryBufferObjectiv GetQueryBufferObjectiv}.
     *
     * @param id     the name of a query object
     * @param buffer the name of a buffer object
     * @param pname  the state to query
     * @param offset the offset into {@code buffer} at which the queried value is written
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryBufferObject">Reference Page</a>
     */
    public static native void glGetQueryBufferObjectuiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset);

    // --- [ glGetQueryBufferObjecti64v ] ---

    /**
     * 64bit version of {@link #glGetQueryBufferObjectiv GetQueryBufferObjectiv}.
     *
     * @param id     the name of a query object
     * @param buffer the name of a buffer object
     * @param pname  the state to query
     * @param offset the offset into {@code buffer} at which the queried value is written
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryBufferObject">Reference Page</a>
     */
    public static native void glGetQueryBufferObjecti64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset);

    // --- [ glGetQueryBufferObjectui64v ] ---

    /**
     * 64bit version of {@link #glGetQueryBufferObjectuiv GetQueryBufferObjectuiv}.
     *
     * @param id     the name of a query object
     * @param buffer the name of a buffer object
     * @param pname  the state to query
     * @param offset the offset into {@code buffer} at which the queried value is written
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryBufferObject">Reference Page</a>
     */
    public static native void glGetQueryBufferObjectui64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset);

    // --- [ glMemoryBarrierByRegion ] ---

    /**
     * Behaves like {@link GL42C#glMemoryBarrier MemoryBarrier}, with two differences:
     * 
     * <p>First, it narrows the region under consideration so that only reads/writes of prior fragment shaders that are invoked for a smaller region of the
     * framebuffer will be completed/reflected prior to subsequent reads/write of following fragment shaders. The size of the region is implementation
     * dependent and may be as small as one framebuffer pixel.</p>
     * 
     * <p>Second, it only applies to memory transactions that may be read by or written by a fragment shader.</p>
     * 
     * <p>When barriers is {@link GL42#GL_ALL_BARRIER_BITS ALL_BARRIER_BITS}, shader memory accesses will be synchronized relative to all these barrier bits, but not to other
     * barrier bits specific to {@link GL42C#glMemoryBarrier MemoryBarrier}. This implies that reads/writes for scatter/gather-like algorithms may or may not be
     * completed/reflected after a MemoryBarrierByRegion command. However, for uses such as deferred shading, where a linked list of visible
     * surfaces with the head at a framebuffer address may be constructed, and the entirety of the list is only dependent on previous executions at that
     * framebuffer address, MemoryBarrierByRegion may be significantly more efficient than {@link GL42C#glMemoryBarrier MemoryBarrier}.</p>
     *
     * @param barriers the barriers to insert. One or more of:<br><table><tr><td>{@link GL42#GL_ATOMIC_COUNTER_BARRIER_BIT ATOMIC_COUNTER_BARRIER_BIT}</td><td>{@link GL42#GL_FRAMEBUFFER_BARRIER_BIT FRAMEBUFFER_BARRIER_BIT}</td><td>{@link GL42#GL_SHADER_IMAGE_ACCESS_BARRIER_BIT SHADER_IMAGE_ACCESS_BARRIER_BIT}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BARRIER_BIT SHADER_STORAGE_BARRIER_BIT}</td><td>{@link GL42#GL_TEXTURE_FETCH_BARRIER_BIT TEXTURE_FETCH_BARRIER_BIT}</td><td>{@link GL42#GL_UNIFORM_BARRIER_BIT UNIFORM_BARRIER_BIT}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glMemoryBarrierByRegion">Reference Page</a>
     */
    public static native void glMemoryBarrierByRegion(@NativeType("GLbitfield") int barriers);

    // --- [ glGetTextureSubImage ] ---

    /**
     * Unsafe version of: {@link #glGetTextureSubImage GetTextureSubImage}
     *
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     */
    public static native void nglGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels);

    /**
     * Obtains sub-regions of a texture image from a texture object.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureSubImage">Reference Page</a>
     */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
    }

    /**
     * Obtains sub-regions of a texture image from a texture object.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureSubImage">Reference Page</a>
     */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining(), memAddress(pixels));
    }

    /**
     * Obtains sub-regions of a texture image from a texture object.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureSubImage">Reference Page</a>
     */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 1, memAddress(pixels));
    }

    /**
     * Obtains sub-regions of a texture image from a texture object.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureSubImage">Reference Page</a>
     */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /**
     * Obtains sub-regions of a texture image from a texture object.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureSubImage">Reference Page</a>
     */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /**
     * Obtains sub-regions of a texture image from a texture object.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureSubImage">Reference Page</a>
     */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 3, memAddress(pixels));
    }

    // --- [ glGetCompressedTextureSubImage ] ---

    /**
     * Unsafe version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
     *
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     */
    public static native void nglGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels);

    /**
     * Obtains a sub-region of a compressed texture image.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param bufSize the size of the buffer to receive the retrieved pixel data
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
     */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
    }

    /**
     * Obtains a sub-region of a compressed texture image.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
     */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") ByteBuffer pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining(), memAddress(pixels));
    }

    /**
     * Obtains a sub-region of a compressed texture image.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
     */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") ShortBuffer pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 1, memAddress(pixels));
    }

    /**
     * Obtains a sub-region of a compressed texture image.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
     */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") IntBuffer pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, memAddress(pixels));
    }

    /**
     * Obtains a sub-region of a compressed texture image.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
     */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") FloatBuffer pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, memAddress(pixels));
    }

    /**
     * Obtains a sub-region of a compressed texture image.
     *
     * @param texture the source texture object name
     * @param level   the level-of-detail number
     * @param xoffset the x-position of the subregion
     * @param yoffset the y-position of the subregion
     * @param zoffset the z-position of the subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param pixels  the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
     */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") DoubleBuffer pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 3, memAddress(pixels));
    }

    // --- [ glTextureBarrier ] ---

    /**
     * Guarantees that writes have completed and caches have been invalidated before subsequent Draws are executed.
     * 
     * @see <a href="https://docs.gl/gl4/glTextureBarrier">Reference Page</a>
     */
    public static native void glTextureBarrier();

    // --- [ glGetGraphicsResetStatus ] ---

    /**
     * Indicates if the GL context has been in a reset state at any point since the last call to GetGraphicsResetStatus:
     * 
     * <ul>
     * <li>{@link GL11#GL_NO_ERROR NO_ERROR} indicates that the GL context has not been in a reset state since the last call.</li>
     * <li>{@link #GL_GUILTY_CONTEXT_RESET GUILTY_CONTEXT_RESET} indicates that a reset has been detected that is attributable to the current GL context.</li>
     * <li>{@link #GL_INNOCENT_CONTEXT_RESET INNOCENT_CONTEXT_RESET} indicates a reset has been detected that is not attributable to the current GL context.</li>
     * <li>{@link #GL_UNKNOWN_CONTEXT_RESET UNKNOWN_CONTEXT_RESET} indicates a detected graphics reset whose cause is unknown.</li>
     * </ul>
     * 
     * <p>If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
     * status is repeatedly returned, the context may be in the process of resetting.</p>
     * 
     * <p>Reset notification behavior is determined at context creation time, and may be queried by calling GetIntegerv with the symbolic constant
     * {@link #GL_RESET_NOTIFICATION_STRATEGY RESET_NOTIFICATION_STRATEGY}.</p>
     * 
     * <p>If the reset notification behavior is {@link #GL_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION}, then the implementation will never deliver notification of reset events, and
     * GetGraphicsResetStatus will always return NO_ERROR.</p>
     * 
     * <p>If the behavior is {@link #GL_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET}, a graphics reset will result in a lost context and require creating a new context as described
     * above. In this case GetGraphicsResetStatus will return an appropriate value from those described above.</p>
     * 
     * <p>If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.</p>
     * 
     * <p>After a graphics reset has occurred on a context, subsequent GL commands on that context (or any context which shares with that context) will generate a
     * {@link #GL_CONTEXT_LOST CONTEXT_LOST} error. Such commands will not have side effects (in particular, they will not modify memory passed by pointer for query results,
     * and may not block indefinitely or cause termination of the application. Exceptions to this behavior include:</p>
     * 
     * <ul>
     * <li>{@link GL11C#glGetError GetError} and GetGraphicsResetStatus behave normally following a graphics reset, so that the application can determine a reset has
     * occurred, and when it is safe to destroy and recreate the context.</li>
     * <li>Any commands which might cause a polling application to block indefinitely will generate a CONTEXT_LOST error, but will also return a value
     * indicating completion to the application.</li>
     * </ul>
     * 
     * @see <a href="https://docs.gl/gl4/glGetGraphicsResetStatus">Reference Page</a>
     */
    @NativeType("GLenum")
    public static native int glGetGraphicsResetStatus();

    // --- [ glGetnTexImage ] ---

    /**
     * Unsafe version of: {@link #glGetnTexImage GetnTexImage}
     *
     * @param bufSize the maximum number of bytes to write into {@code img}
     */
    public static native void nglGetnTexImage(int tex, int level, int format, int type, int bufSize, long img);

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex     the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param bufSize the maximum number of bytes to write into {@code img}
     * @param img     a buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetnTexImage">Reference Page</a>
     */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        nglGetnTexImage(tex, level, format, type, bufSize, img);
    }

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level  the level-of-detail number
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param img    a buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetnTexImage">Reference Page</a>
     */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer img) {
        nglGetnTexImage(tex, level, format, type, img.remaining(), memAddress(img));
    }

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level  the level-of-detail number
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param img    a buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetnTexImage">Reference Page</a>
     */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer img) {
        nglGetnTexImage(tex, level, format, type, img.remaining() << 1, memAddress(img));
    }

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level  the level-of-detail number
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param img    a buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetnTexImage">Reference Page</a>
     */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer img) {
        nglGetnTexImage(tex, level, format, type, img.remaining() << 2, memAddress(img));
    }

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level  the level-of-detail number
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param img    a buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetnTexImage">Reference Page</a>
     */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer img) {
        nglGetnTexImage(tex, level, format, type, img.remaining() << 2, memAddress(img));
    }

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level  the level-of-detail number
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param img    a buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetnTexImage">Reference Page</a>
     */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer img) {
        nglGetnTexImage(tex, level, format, type, img.remaining() << 3, memAddress(img));
    }

    // --- [ glReadnPixels ] ---

    /**
     * Unsafe version of: {@link #glReadnPixels ReadnPixels}
     *
     * @param bufSize the maximum number of bytes to write into {@code data}
     */
    public static native void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels);

    /**
     * Behaves identically to {@link GL11C#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
     *
     * @param x       the left pixel coordinate
     * @param y       the lower pixel coordinate
     * @param width   the number of pixels to read in the x-dimension
     * @param height  the number of pixels to read in the y-dimension
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param bufSize the maximum number of bytes to write into {@code data}
     * @param pixels  a buffer in which to place the returned pixel data
     * 
     * @see <a href="https://docs.gl/gl4/glReadnPixels">Reference Page</a>
     */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    /**
     * Behaves identically to {@link GL11C#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param pixels a buffer in which to place the returned pixel data
     * 
     * @see <a href="https://docs.gl/gl4/glReadnPixels">Reference Page</a>
     */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining(), memAddress(pixels));
    }

    /**
     * Behaves identically to {@link GL11C#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param pixels a buffer in which to place the returned pixel data
     * 
     * @see <a href="https://docs.gl/gl4/glReadnPixels">Reference Page</a>
     */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 1, memAddress(pixels));
    }

    /**
     * Behaves identically to {@link GL11C#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param pixels a buffer in which to place the returned pixel data
     * 
     * @see <a href="https://docs.gl/gl4/glReadnPixels">Reference Page</a>
     */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /**
     * Behaves identically to {@link GL11C#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param pixels a buffer in which to place the returned pixel data
     * 
     * @see <a href="https://docs.gl/gl4/glReadnPixels">Reference Page</a>
     */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    // --- [ glGetnCompressedTexImage ] ---

    /**
     * Unsafe version of: {@link #glGetnCompressedTexImage GetnCompressedTexImage}
     *
     * @param bufSize the maximum number of bytes to write into {@code img}
     */
    public static native void nglGetnCompressedTexImage(int target, int level, int bufSize, long img);

    /**
     * Robust version of {@link GL13C#glGetCompressedTexImage GetCompressedTexImage}
     *
     * @param target  the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
     * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param bufSize the maximum number of bytes to write into {@code img}
     * @param img     a buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetnCompressedTexImage">Reference Page</a>
     */
    public static void glGetnCompressedTexImage(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        nglGetnCompressedTexImage(target, level, bufSize, img);
    }

    /**
     * Robust version of {@link GL13C#glGetCompressedTexImage GetCompressedTexImage}
     *
     * @param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
     * @param level  the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param img    a buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetnCompressedTexImage">Reference Page</a>
     */
    public static void glGetnCompressedTexImage(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer img) {
        if (CHECKS) {
            if (DEBUG) {
                check(img, GL11.glGetTexLevelParameteri(target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetnCompressedTexImage(target, level, img.remaining(), memAddress(img));
    }

    // --- [ glGetnUniformfv ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformfv GetnUniformfv}
     *
     * @param bufSize the maximum number of bytes to write to {@code params}
     */
    public static native void nglGetnUniformfv(int program, int location, int bufSize, long params);

    /**
     * Returns the value or values of a uniform of the default uniform block.
     *
     * @param program  the program object
     * @param location the uniform location
     * @param params   the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformfv(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Returns the value or values of a uniform of the default uniform block.
     *
     * @param program  the program object
     * @param location the uniform location
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    @NativeType("void")
    public static float glGetnUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformfv(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformdv ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformdv GetnUniformdv}
     *
     * @param bufSize the maximum number of bytes to write to {@code params}
     */
    public static native void nglGetnUniformdv(int program, int location, int bufSize, long params);

    /**
     * Double version of {@link #glGetnUniformfv GetnUniformfv}.
     *
     * @param program  the program object
     * @param location the uniform location
     * @param params   the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetnUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        nglGetnUniformdv(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Double version of {@link #glGetnUniformfv GetnUniformfv}.
     *
     * @param program  the program object
     * @param location the uniform location
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    @NativeType("void")
    public static double glGetnUniformd(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetnUniformdv(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformiv ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformiv GetnUniformiv}
     *
     * @param bufSize the maximum number of bytes to write to {@code params}
     */
    public static native void nglGetnUniformiv(int program, int location, int bufSize, long params);

    /**
     * Integer version of {@link #glGetnUniformfv GetnUniformfv}.
     *
     * @param program  the program object
     * @param location the uniform location
     * @param params   the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        nglGetnUniformiv(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Integer version of {@link #glGetnUniformfv GetnUniformfv}.
     *
     * @param program  the program object
     * @param location the uniform location
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetnUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformiv(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformuiv ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformuiv GetnUniformuiv}
     *
     * @param bufSize the maximum number of bytes to write to {@code params}
     */
    public static native void nglGetnUniformuiv(int program, int location, int bufSize, long params);

    /**
     * Unsigned version of {@link #glGetnUniformiv GetnUniformiv}.
     *
     * @param program  the program object
     * @param location the uniform location
     * @param params   the buffer in which to place the returned data
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        nglGetnUniformuiv(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Unsigned version of {@link #glGetnUniformiv GetnUniformiv}.
     *
     * @param program  the program object
     * @param location the uniform location
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetnUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformuiv(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Array version of: {@link #glCreateTransformFeedbacks CreateTransformFeedbacks}
     * 
     * @see <a href="https://docs.gl/gl4/glCreateTransformFeedbacks">Reference Page</a>
     */
    public static void glCreateTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GL.getICD().glCreateTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTransformFeedbackiv GetTransformFeedbackiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTransformFeedback">Reference Page</a>
     */
    public static void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackiv;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(xfb, pname, param, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTransformFeedbacki_v GetTransformFeedbacki_v}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTransformFeedbacki_v">Reference Page</a>
     */
    public static void glGetTransformFeedbacki_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetTransformFeedbacki_v;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(xfb, pname, index, param, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTransformFeedbacki64_v">Reference Page</a>
     */
    public static void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] param) {
        long __functionAddress = GL.getICD().glGetTransformFeedbacki64_v;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(xfb, pname, index, param, __functionAddress);
    }

    /**
     * Array version of: {@link #glCreateBuffers CreateBuffers}
     * 
     * @see <a href="https://docs.gl/gl4/glCreateBuffers">Reference Page</a>
     */
    public static void glCreateBuffers(@NativeType("GLuint *") int[] buffers) {
        long __functionAddress = GL.getICD().glCreateBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffers.length, buffers, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferStorage NamedBufferStorage}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 1, data, flags, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferStorage NamedBufferStorage}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferStorage NamedBufferStorage}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferStorage NamedBufferStorage}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 3, data, flags, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferData NamedBufferData}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 1, data, usage, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferData NamedBufferData}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferData NamedBufferData}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") long[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 3, data, usage, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferData NamedBufferData}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferData NamedBufferData}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
     */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 3, data, usage, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferSubData NamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferSubData NamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferSubData NamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") long[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferSubData NamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedBufferSubData NamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
     */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearNamedBufferData ClearNamedBufferData}
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>
     */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearNamedBufferData ClearNamedBufferData}
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>
     */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearNamedBufferData ClearNamedBufferData}
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferData">Reference Page</a>
     */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>
     */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>
     */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glClearBufferSubData">Reference Page</a>
     */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetNamedBufferParameteriv GetNamedBufferParameteriv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>
     */
    public static void glGetNamedBufferParameteriv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(buffer, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v}
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>
     */
    public static void glGetNamedBufferParameteri64v(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameteri64v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(buffer, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") short[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") long[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
     */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") double[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glCreateFramebuffers CreateFramebuffers}
     * 
     * @see <a href="https://docs.gl/gl4/glCreateFramebuffers">Reference Page</a>
     */
    public static void glCreateFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        long __functionAddress = GL.getICD().glCreateFramebuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /**
     * Array version of: {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers}
     * 
     * @see <a href="https://docs.gl/gl4/glFramebufferDrawBuffers">Reference Page</a>
     */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] bufs) {
        long __functionAddress = GL.getICD().glNamedFramebufferDrawBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, bufs.length, bufs, __functionAddress);
    }

    /**
     * Array version of: {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData}
     * 
     * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferData">Reference Page</a>
     */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] attachments) {
        long __functionAddress = GL.getICD().glInvalidateNamedFramebufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, attachments.length, attachments, __functionAddress);
    }

    /**
     * Array version of: {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData}
     * 
     * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferSubData">Reference Page</a>
     */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glInvalidateNamedFramebufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, attachments.length, attachments, x, y, width, height, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearNamedFramebufferiv ClearNamedFramebufferiv}
     * 
     * @see <a href="https://docs.gl/gl4/glClearFramebuffer">Reference Page</a>
     */
    public static void glClearNamedFramebufferiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glClearNamedFramebufferiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(framebuffer, buffer, drawbuffer, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearNamedFramebufferuiv ClearNamedFramebufferuiv}
     * 
     * @see <a href="https://docs.gl/gl4/glClearFramebuffer">Reference Page</a>
     */
    public static void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glClearNamedFramebufferuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 4);
        }
        callPV(framebuffer, buffer, drawbuffer, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearNamedFramebufferfv ClearNamedFramebufferfv}
     * 
     * @see <a href="https://docs.gl/gl4/glClearFramebuffer">Reference Page</a>
     */
    public static void glClearNamedFramebufferfv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glClearNamedFramebufferfv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(framebuffer, buffer, drawbuffer, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetFramebufferParameter">Reference Page</a>
     */
    public static void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(framebuffer, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetNamedFramebufferAttachmentParameteriv GetNamedFramebufferAttachmentParameteriv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>
     */
    public static void glGetNamedFramebufferAttachmentParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferAttachmentParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(framebuffer, attachment, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glCreateRenderbuffers CreateRenderbuffers}
     * 
     * @see <a href="https://docs.gl/gl4/glCreateRenderbuffers">Reference Page</a>
     */
    public static void glCreateRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        long __functionAddress = GL.getICD().glCreateRenderbuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>
     */
    public static void glGetNamedRenderbufferParameteriv(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedRenderbufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(renderbuffer, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glCreateTextures CreateTextures}
     * 
     * @see <a href="https://docs.gl/gl4/glCreateTextures">Reference Page</a>
     */
    public static void glCreateTextures(@NativeType("GLenum") int target, @NativeType("GLuint *") int[] textures) {
        long __functionAddress = GL.getICD().glCreateTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, textures.length, textures, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage1D TextureSubImage1D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage1D">Reference Page</a>
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage1D TextureSubImage1D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage1D">Reference Page</a>
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage1D TextureSubImage1D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage1D">Reference Page</a>
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage1D TextureSubImage1D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage1D">Reference Page</a>
     */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage2D TextureSubImage2D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage2D">Reference Page</a>
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage2D TextureSubImage2D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage2D">Reference Page</a>
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage2D TextureSubImage2D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage2D">Reference Page</a>
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage2D TextureSubImage2D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage2D">Reference Page</a>
     */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage3D TextureSubImage3D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage3D">Reference Page</a>
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage3D TextureSubImage3D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage3D">Reference Page</a>
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage3D TextureSubImage3D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage3D">Reference Page</a>
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureSubImage3D TextureSubImage3D}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureSubImage3D">Reference Page</a>
     */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureParameterfv TextureParameterfv}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
     */
    public static void glTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glTextureParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureParameterIiv TextureParameterIiv}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
     */
    public static void glTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glTextureParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureParameterIuiv TextureParameterIuiv}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
     */
    public static void glTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glTextureParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glTextureParameteriv TextureParameteriv}
     * 
     * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
     */
    public static void glTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glTextureParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureImage GetTextureImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureImage">Reference Page</a>
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, pixels.length << 1, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureImage GetTextureImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureImage">Reference Page</a>
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureImage GetTextureImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureImage">Reference Page</a>
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureImage GetTextureImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureImage">Reference Page</a>
     */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, pixels.length << 3, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureLevelParameter">Reference Page</a>
     */
    public static void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, level, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureLevelParameteriv GetTextureLevelParameteriv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureLevelParameter">Reference Page</a>
     */
    public static void glGetTextureLevelParameteriv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, level, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureParameterfv GetTextureParameterfv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    public static void glGetTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureParameterIiv GetTextureParameterIiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    public static void glGetTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureParameterIuiv GetTextureParameterIuiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    public static void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureParameteriv GetTextureParameteriv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
     */
    public static void glGetTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glCreateVertexArrays CreateVertexArrays}
     * 
     * @see <a href="https://docs.gl/gl4/glCreateVertexArrays">Reference Page</a>
     */
    public static void glCreateVertexArrays(@NativeType("GLuint *") int[] arrays) {
        long __functionAddress = GL.getICD().glCreateVertexArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexArrayVertexBuffers VertexArrayVertexBuffers}
     * 
     * @see <a href="https://docs.gl/gl4/glVertexArrayVertexBuffers">Reference Page</a>
     */
    public static void glVertexArrayVertexBuffers(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizei const *") int[] strides) {
        long __functionAddress = GL.getICD().glVertexArrayVertexBuffers;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(offsets, lengthSafe(buffers));
            checkSafe(strides, lengthSafe(buffers));
        }
        callPPPV(vaobj, first, lengthSafe(buffers), buffers, memAddressSafe(offsets), strides, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetVertexArrayiv GetVertexArrayiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetVertexArray">Reference Page</a>
     */
    public static void glGetVertexArrayiv(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayiv;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(vaobj, pname, param, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetVertexArrayIndexediv GetVertexArrayIndexediv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetVertexArrayIndexed">Reference Page</a>
     */
    public static void glGetVertexArrayIndexediv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIndexediv;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(vaobj, index, pname, param, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetVertexArrayIndexed">Reference Page</a>
     */
    public static void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIndexed64iv;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(vaobj, index, pname, param, __functionAddress);
    }

    /**
     * Array version of: {@link #glCreateSamplers CreateSamplers}
     * 
     * @see <a href="https://docs.gl/gl4/glCreateSamplers">Reference Page</a>
     */
    public static void glCreateSamplers(@NativeType("GLuint *") int[] samplers) {
        long __functionAddress = GL.getICD().glCreateSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(samplers.length, samplers, __functionAddress);
    }

    /**
     * Array version of: {@link #glCreateProgramPipelines CreateProgramPipelines}
     * 
     * @see <a href="https://docs.gl/gl4/glCreateProgramPipelines">Reference Page</a>
     */
    public static void glCreateProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        long __functionAddress = GL.getICD().glCreateProgramPipelines;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pipelines.length, pipelines, __functionAddress);
    }

    /**
     * Array version of: {@link #glCreateQueries CreateQueries}
     * 
     * @see <a href="https://docs.gl/gl4/glCreateQueries">Reference Page</a>
     */
    public static void glCreateQueries(@NativeType("GLenum") int target, @NativeType("GLuint *") int[] ids) {
        long __functionAddress = GL.getICD().glCreateQueries;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, ids.length, ids, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureSubImage GetTextureSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureSubImage">Reference Page</a>
     */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 1, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureSubImage GetTextureSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureSubImage">Reference Page</a>
     */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureSubImage GetTextureSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureSubImage">Reference Page</a>
     */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTextureSubImage GetTextureSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetTextureSubImage">Reference Page</a>
     */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 3, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
     */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 1, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
     */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 2, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
     */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 2, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
     */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") double[] pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 3, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetnTexImage GetnTexImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetnTexImage">Reference Page</a>
     */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] img) {
        long __functionAddress = GL.getICD().glGetnTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 1, img, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetnTexImage GetnTexImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetnTexImage">Reference Page</a>
     */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] img) {
        long __functionAddress = GL.getICD().glGetnTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 2, img, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetnTexImage GetnTexImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetnTexImage">Reference Page</a>
     */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] img) {
        long __functionAddress = GL.getICD().glGetnTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 2, img, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetnTexImage GetnTexImage}
     * 
     * @see <a href="https://docs.gl/gl4/glGetnTexImage">Reference Page</a>
     */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] img) {
        long __functionAddress = GL.getICD().glGetnTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 3, img, __functionAddress);
    }

    /**
     * Array version of: {@link #glReadnPixels ReadnPixels}
     * 
     * @see <a href="https://docs.gl/gl4/glReadnPixels">Reference Page</a>
     */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glReadnPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 1, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glReadnPixels ReadnPixels}
     * 
     * @see <a href="https://docs.gl/gl4/glReadnPixels">Reference Page</a>
     */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glReadnPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glReadnPixels ReadnPixels}
     * 
     * @see <a href="https://docs.gl/gl4/glReadnPixels">Reference Page</a>
     */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glReadnPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetnUniformfv GetnUniformfv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetnUniformfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetnUniformdv GetnUniformdv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetnUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetnUniformdv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetnUniformiv GetnUniformiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetnUniformiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetnUniformuiv GetnUniformuiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetnUniformuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

}