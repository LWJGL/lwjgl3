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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The OpenGL functionality up to version 4.4. Includes only Core Profile symbols.
 * 
 * <p>OpenGL 4.4 implementations support revision 4.40 of the OpenGL Shading Language.</p>
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_buffer_storage.txt">ARB_buffer_storage</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_clear_texture.txt">ARB_clear_texture</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_enhanced_layouts.txt">ARB_enhanced_layouts</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_multi_bind.txt">ARB_multi_bind</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_query_buffer_object.txt">ARB_query_buffer_object</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_mirror_clamp_to_edge.txt">ARB_texture_mirror_clamp_to_edge</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_stencil8.txt">ARB_texture_stencil8</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_vertex_type_10f_11f_11f_rev.txt">ARB_vertex_type_10f_11f_11f_rev</a></li>
 * </ul>
 */
public class GL44C extends GL43C {

    static { GL.initialize(); }

    /** Implementation-dependent state which constrains the maximum value of stride parameters to vertex array pointer-setting commands. */
    public static final int GL_MAX_VERTEX_ATTRIB_STRIDE = 0x82E5;

    /**
     * Implementations are not required to support primitive restart for separate patch primitives (primitive type PATCHES). Support can be queried by calling
     * GetBooleanv with the symbolic constant PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED. A value of FALSE indicates that primitive restart is treated as
     * disabled when drawing patches, no matter the value of the enables. A value of TRUE indicates that primitive restart behaves normally for patches.
     */
    public static final int GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = 0x8221;

    /** Equivalent to {@link ARBTextureBufferObject#GL_TEXTURE_BUFFER_ARB TEXTURE_BUFFER_ARB} query, but named more consistently. */
    public static final int GL_TEXTURE_BUFFER_BINDING = 0x8C2A;

    /** Accepted in the {@code flags} parameter of {@link #glBufferStorage BufferStorage} and {@link ARBBufferStorage#glNamedBufferStorageEXT NamedBufferStorageEXT}. */
    public static final int
        GL_MAP_PERSISTENT_BIT  = 0x40,
        GL_MAP_COHERENT_BIT    = 0x80,
        GL_DYNAMIC_STORAGE_BIT = 0x100,
        GL_CLIENT_STORAGE_BIT  = 0x200;

    /** Accepted by the {@code pname} parameter of {@code GetBufferParameter&#123;i|i64&#125;v}. */
    public static final int
        GL_BUFFER_IMMUTABLE_STORAGE = 0x821F,
        GL_BUFFER_STORAGE_FLAGS     = 0x8220;

    /** Accepted by the {@code barriers} parameter of {@link GL42C#glMemoryBarrier MemoryBarrier}. */
    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT = 0x4000;

    /** Accepted by the {@code pname} parameter for {@link GL42C#glGetInternalformativ GetInternalformativ} and {@link GL43C#glGetInternalformati64v GetInternalformati64v}. */
    public static final int GL_CLEAR_TEXTURE = 0x9365;

    /** Accepted in the {@code props} array of {@link GL43C#glGetProgramResourceiv GetProgramResourceiv}. */
    public static final int
        GL_LOCATION_COMPONENT               = 0x934A,
        GL_TRANSFORM_FEEDBACK_BUFFER_INDEX  = 0x934B,
        GL_TRANSFORM_FEEDBACK_BUFFER_STRIDE = 0x934C;

    /** Accepted by the {@code pname} parameter of {@link GL15C#glGetQueryObjectiv GetQueryObjectiv}, {@link GL15C#glGetQueryObjectuiv GetQueryObjectuiv}, {@link GL33C#glGetQueryObjecti64v GetQueryObjecti64v} and {@link GL33C#glGetQueryObjectui64v GetQueryObjectui64v}. */
    public static final int GL_QUERY_RESULT_NO_WAIT = 0x9194;

    /**
     * Accepted by the {@code target} parameter of {@link GL15C#glBindBuffer BindBuffer}, {@link GL15C#glBufferData BufferData}, {@link GL15C#glBufferSubData BufferSubData},
     * {@link GL15C#glMapBuffer MapBuffer}, {@link GL15C#glUnmapBuffer UnmapBuffer}, {@link GL30C#glMapBufferRange MapBufferRange}, {@link GL15C#glGetBufferSubData GetBufferSubData},
     * {@link GL15C#glGetBufferParameteriv GetBufferParameteriv}, {@link GL32C#glGetBufferParameteri64v GetBufferParameteri64v}, {@link GL15C#glGetBufferPointerv GetBufferPointerv},
     * {@link GL43C#glClearBufferSubData ClearBufferSubData}, and the {@code readtarget} and {@code writetarget} parameters of {@link GL31C#glCopyBufferSubData CopyBufferSubData}.
     */
    public static final int GL_QUERY_BUFFER = 0x9192;

    /**
     * Accepted by the {@code pname} parameter of {@link GL11C#glGetBooleanv GetBooleanv}, {@link GL11C#glGetIntegerv GetIntegerv}, {@link GL11C#glGetFloatv GetFloatv},
     * and {@link GL11C#glGetDoublev GetDoublev}.
     */
    public static final int GL_QUERY_BUFFER_BINDING = 0x9193;

    /** Accepted in the {@code barriers} bitfield in {@link GL42C#glMemoryBarrier MemoryBarrier}. */
    public static final int GL_QUERY_BUFFER_BARRIER_BIT = 0x8000;

    /**
     * Accepted by the {@code param} parameter of TexParameter{if}, SamplerParameter{if} and SamplerParameter{if}v, and by the {@code params} parameter of
     * TexParameter{if}v, TexParameterI{i ui}v and SamplerParameterI{i ui}v when their {@code pname} parameter is {@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}, {@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}, or
     * {@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R},
     */
    public static final int GL_MIRROR_CLAMP_TO_EDGE = 0x8743;

    protected GL44C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferStorage ] ---

    /**
     * Unsafe version of: {@link #glBufferStorage BufferStorage}
     *
     * @param size the size of the data store in basic machine units
     */
    public static native void nglBufferStorage(int target, long size, long data, int flags);

    /**
     * Creates the data store of a buffer object.
     * 
     * <p>The data store of the buffer object bound to {@code target} is allocated as a result of a call to this function and cannot be de-allocated until the
     * buffer is deleted with a call to {@link GL15C#glDeleteBuffers DeleteBuffers}. Such a store may not be re-allocated through further calls to {@code BufferStorage}
     * or {@link GL15C#glBufferData BufferData}.</p>
     * 
     * <p>{@code BufferStorage} deletes any existing data store. If any portion of the buffer object is mapped in the current context or any context current to
     * another thread, it is as though {@link GL15C#glUnmapBuffer UnmapBuffer} is executed in each such context prior to deleting the existing data store.</p>
     *
     * @param target the buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param size   the size of the data store in basic machine units
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link #GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, size, NULL, flags);
    }

    /**
     * Creates the data store of a buffer object.
     * 
     * <p>The data store of the buffer object bound to {@code target} is allocated as a result of a call to this function and cannot be de-allocated until the
     * buffer is deleted with a call to {@link GL15C#glDeleteBuffers DeleteBuffers}. Such a store may not be re-allocated through further calls to {@code BufferStorage}
     * or {@link GL15C#glBufferData BufferData}.</p>
     * 
     * <p>{@code BufferStorage} deletes any existing data store. If any portion of the buffer object is mapped in the current context or any context current to
     * another thread, it is as though {@link GL15C#glUnmapBuffer UnmapBuffer} is executed in each such context prior to deleting the existing data store.</p>
     *
     * @param target the buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
     *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link #GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, data.remaining(), memAddress(data), flags);
    }

    /**
     * Creates the data store of a buffer object.
     * 
     * <p>The data store of the buffer object bound to {@code target} is allocated as a result of a call to this function and cannot be de-allocated until the
     * buffer is deleted with a call to {@link GL15C#glDeleteBuffers DeleteBuffers}. Such a store may not be re-allocated through further calls to {@code BufferStorage}
     * or {@link GL15C#glBufferData BufferData}.</p>
     * 
     * <p>{@code BufferStorage} deletes any existing data store. If any portion of the buffer object is mapped in the current context or any context current to
     * another thread, it is as though {@link GL15C#glUnmapBuffer UnmapBuffer} is executed in each such context prior to deleting the existing data store.</p>
     *
     * @param target the buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
     *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link #GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), flags);
    }

    /**
     * Creates the data store of a buffer object.
     * 
     * <p>The data store of the buffer object bound to {@code target} is allocated as a result of a call to this function and cannot be de-allocated until the
     * buffer is deleted with a call to {@link GL15C#glDeleteBuffers DeleteBuffers}. Such a store may not be re-allocated through further calls to {@code BufferStorage}
     * or {@link GL15C#glBufferData BufferData}.</p>
     * 
     * <p>{@code BufferStorage} deletes any existing data store. If any portion of the buffer object is mapped in the current context or any context current to
     * another thread, it is as though {@link GL15C#glUnmapBuffer UnmapBuffer} is executed in each such context prior to deleting the existing data store.</p>
     *
     * @param target the buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
     *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link #GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    /**
     * Creates the data store of a buffer object.
     * 
     * <p>The data store of the buffer object bound to {@code target} is allocated as a result of a call to this function and cannot be de-allocated until the
     * buffer is deleted with a call to {@link GL15C#glDeleteBuffers DeleteBuffers}. Such a store may not be re-allocated through further calls to {@code BufferStorage}
     * or {@link GL15C#glBufferData BufferData}.</p>
     * 
     * <p>{@code BufferStorage} deletes any existing data store. If any portion of the buffer object is mapped in the current context or any context current to
     * another thread, it is as though {@link GL15C#glUnmapBuffer UnmapBuffer} is executed in each such context prior to deleting the existing data store.</p>
     *
     * @param target the buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
     *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link #GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    /**
     * Creates the data store of a buffer object.
     * 
     * <p>The data store of the buffer object bound to {@code target} is allocated as a result of a call to this function and cannot be de-allocated until the
     * buffer is deleted with a call to {@link GL15C#glDeleteBuffers DeleteBuffers}. Such a store may not be re-allocated through further calls to {@code BufferStorage}
     * or {@link GL15C#glBufferData BufferData}.</p>
     * 
     * <p>{@code BufferStorage} deletes any existing data store. If any portion of the buffer object is mapped in the current context or any context current to
     * another thread, it is as though {@link GL15C#glUnmapBuffer UnmapBuffer} is executed in each such context prior to deleting the existing data store.</p>
     *
     * @param target the buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
     *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
     * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
     *               are as follows:
     *               
     *               <ul>
     *               <li>{@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
     *               {@link GL15C#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
     *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
     *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31C#glCopyBufferSubData CopyBufferSubData} and
     *               {@link GL43C#glClearBufferSubData ClearBufferSubData}.</li>
     *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
     *               obtained that may be read from.</li>
     *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
     *               space obtained that may be written to.</li>
     *               <li>{@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
     *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
     *               <li>{@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
     *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
     *               immediately visible to the other with no further action taken by the application. In particular:
     *               
     *               <ul>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42C#glMemoryBarrier MemoryBarrier} command with
     *               the {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42C#glMemoryBarrier MemoryBarrier} with the
     *               {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32C#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
     *               {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32C#glFenceSync FenceSync} with
     *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11C#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
     *               </ul></li>
     *               <li>{@link #GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
     *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
     *               </ul>
     *               
     *               <p>If {@code flags} contains {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
     *               
     *               <p>It is an error to specify {@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") DoubleBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), flags);
    }

    // --- [ glClearTexSubImage ] ---

    /** Unsafe version of: {@link #glClearTexSubImage ClearTexSubImage} */
    public static native void nglClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long data);

    /**
     * Fills all or part of a texture image with a constant value.
     * 
     * <p>Arguments {@code xoffset}, {@code yoffset}, and {@code zoffset} specify the lower left texel coordinates of a {@code width}-wide by {@code height}-high
     * by {@code depth}-deep rectangular subregion of the texel array and are interpreted as they are in {@link GL12C#glTexSubImage3D TexSubImage3D}.</p>
     * 
     * <p>For 1D array textures, {@code yoffset} is interpreted as the first layer to be cleared and {@code height} is the number of layers to clear. For 2D array
     * textures, {@code zoffset} is interpreted as the first layer to be cleared and {@code depth} is the number of layers to clear. Cube map textures are
     * treated as an array of six slices in the z-dimension, where the value of {@code zoffset} is interpreted as specifying the cube map face for the
     * corresponding {@code layer} and {@code depth} is the number of faces to clear. For cube map array textures, {@code zoffset} is the first layer-face to
     * clear, and {@code depth} is the number of layer-faces to clear. Each layer-face is translated into an array layer and a cube map face.</p>
     * 
     * <p>Negative values of {@code xoffset}, {@code yoffset}, and {@code zoffset} correspond to the coordinates of border texels.</p>
     *
     * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
     *                the texture image has a compressed internal format
     * @param level   the texture level to clear
     * @param xoffset the x coordinate of the texel subregion
     * @param yoffset the y coordinate of the texel subregion
     * @param zoffset the z coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the format of the source data. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the type of the source data. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
     *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexSubImage">Reference Page</a>
     */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /**
     * Fills all or part of a texture image with a constant value.
     * 
     * <p>Arguments {@code xoffset}, {@code yoffset}, and {@code zoffset} specify the lower left texel coordinates of a {@code width}-wide by {@code height}-high
     * by {@code depth}-deep rectangular subregion of the texel array and are interpreted as they are in {@link GL12C#glTexSubImage3D TexSubImage3D}.</p>
     * 
     * <p>For 1D array textures, {@code yoffset} is interpreted as the first layer to be cleared and {@code height} is the number of layers to clear. For 2D array
     * textures, {@code zoffset} is interpreted as the first layer to be cleared and {@code depth} is the number of layers to clear. Cube map textures are
     * treated as an array of six slices in the z-dimension, where the value of {@code zoffset} is interpreted as specifying the cube map face for the
     * corresponding {@code layer} and {@code depth} is the number of faces to clear. For cube map array textures, {@code zoffset} is the first layer-face to
     * clear, and {@code depth} is the number of layer-faces to clear. Each layer-face is translated into an array layer and a cube map face.</p>
     * 
     * <p>Negative values of {@code xoffset}, {@code yoffset}, and {@code zoffset} correspond to the coordinates of border texels.</p>
     *
     * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
     *                the texture image has a compressed internal format
     * @param level   the texture level to clear
     * @param xoffset the x coordinate of the texel subregion
     * @param yoffset the y coordinate of the texel subregion
     * @param zoffset the z coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the format of the source data. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the type of the source data. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
     *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexSubImage">Reference Page</a>
     */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /**
     * Fills all or part of a texture image with a constant value.
     * 
     * <p>Arguments {@code xoffset}, {@code yoffset}, and {@code zoffset} specify the lower left texel coordinates of a {@code width}-wide by {@code height}-high
     * by {@code depth}-deep rectangular subregion of the texel array and are interpreted as they are in {@link GL12C#glTexSubImage3D TexSubImage3D}.</p>
     * 
     * <p>For 1D array textures, {@code yoffset} is interpreted as the first layer to be cleared and {@code height} is the number of layers to clear. For 2D array
     * textures, {@code zoffset} is interpreted as the first layer to be cleared and {@code depth} is the number of layers to clear. Cube map textures are
     * treated as an array of six slices in the z-dimension, where the value of {@code zoffset} is interpreted as specifying the cube map face for the
     * corresponding {@code layer} and {@code depth} is the number of faces to clear. For cube map array textures, {@code zoffset} is the first layer-face to
     * clear, and {@code depth} is the number of layer-faces to clear. Each layer-face is translated into an array layer and a cube map face.</p>
     * 
     * <p>Negative values of {@code xoffset}, {@code yoffset}, and {@code zoffset} correspond to the coordinates of border texels.</p>
     *
     * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
     *                the texture image has a compressed internal format
     * @param level   the texture level to clear
     * @param xoffset the x coordinate of the texel subregion
     * @param yoffset the y coordinate of the texel subregion
     * @param zoffset the z coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the format of the source data. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the type of the source data. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
     *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexSubImage">Reference Page</a>
     */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /**
     * Fills all or part of a texture image with a constant value.
     * 
     * <p>Arguments {@code xoffset}, {@code yoffset}, and {@code zoffset} specify the lower left texel coordinates of a {@code width}-wide by {@code height}-high
     * by {@code depth}-deep rectangular subregion of the texel array and are interpreted as they are in {@link GL12C#glTexSubImage3D TexSubImage3D}.</p>
     * 
     * <p>For 1D array textures, {@code yoffset} is interpreted as the first layer to be cleared and {@code height} is the number of layers to clear. For 2D array
     * textures, {@code zoffset} is interpreted as the first layer to be cleared and {@code depth} is the number of layers to clear. Cube map textures are
     * treated as an array of six slices in the z-dimension, where the value of {@code zoffset} is interpreted as specifying the cube map face for the
     * corresponding {@code layer} and {@code depth} is the number of faces to clear. For cube map array textures, {@code zoffset} is the first layer-face to
     * clear, and {@code depth} is the number of layer-faces to clear. Each layer-face is translated into an array layer and a cube map face.</p>
     * 
     * <p>Negative values of {@code xoffset}, {@code yoffset}, and {@code zoffset} correspond to the coordinates of border texels.</p>
     *
     * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
     *                the texture image has a compressed internal format
     * @param level   the texture level to clear
     * @param xoffset the x coordinate of the texel subregion
     * @param yoffset the y coordinate of the texel subregion
     * @param zoffset the z coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the format of the source data. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the type of the source data. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
     *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexSubImage">Reference Page</a>
     */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /**
     * Fills all or part of a texture image with a constant value.
     * 
     * <p>Arguments {@code xoffset}, {@code yoffset}, and {@code zoffset} specify the lower left texel coordinates of a {@code width}-wide by {@code height}-high
     * by {@code depth}-deep rectangular subregion of the texel array and are interpreted as they are in {@link GL12C#glTexSubImage3D TexSubImage3D}.</p>
     * 
     * <p>For 1D array textures, {@code yoffset} is interpreted as the first layer to be cleared and {@code height} is the number of layers to clear. For 2D array
     * textures, {@code zoffset} is interpreted as the first layer to be cleared and {@code depth} is the number of layers to clear. Cube map textures are
     * treated as an array of six slices in the z-dimension, where the value of {@code zoffset} is interpreted as specifying the cube map face for the
     * corresponding {@code layer} and {@code depth} is the number of faces to clear. For cube map array textures, {@code zoffset} is the first layer-face to
     * clear, and {@code depth} is the number of layer-faces to clear. Each layer-face is translated into an array layer and a cube map face.</p>
     * 
     * <p>Negative values of {@code xoffset}, {@code yoffset}, and {@code zoffset} correspond to the coordinates of border texels.</p>
     *
     * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
     *                the texture image has a compressed internal format
     * @param level   the texture level to clear
     * @param xoffset the x coordinate of the texel subregion
     * @param yoffset the y coordinate of the texel subregion
     * @param zoffset the z coordinate of the texel subregion
     * @param width   the subregion width
     * @param height  the subregion height
     * @param depth   the subregion depth
     * @param format  the format of the source data. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the type of the source data. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
     *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexSubImage">Reference Page</a>
     */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer data) {
        nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    // --- [ glClearTexImage ] ---

    /** Unsafe version of: {@link #glClearTexImage ClearTexImage} */
    public static native void nglClearTexImage(int texture, int level, int format, int type, long data);

    /**
     * Is equivalent to calling {@link #glClearTexSubImage ClearTexSubImage} with {@code xoffset}, {@code yoffset}, and {@code zoffset} equal to -{@code b} and {@code width},
     * {@code height}, and {@code depth} equal to the dimensions of the texture image plus {@code 2xb} (or zero and one for dimensions the texture doesn't
     * have).
     *
     * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
     *                the texture image has a compressed internal format
     * @param level   the texture level to clear
     * @param format  the format of the source data. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the type of the source data. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
     *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexImage">Reference Page</a>
     */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        nglClearTexImage(texture, level, format, type, memAddressSafe(data));
    }

    /**
     * Is equivalent to calling {@link #glClearTexSubImage ClearTexSubImage} with {@code xoffset}, {@code yoffset}, and {@code zoffset} equal to -{@code b} and {@code width},
     * {@code height}, and {@code depth} equal to the dimensions of the texture image plus {@code 2xb} (or zero and one for dimensions the texture doesn't
     * have).
     *
     * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
     *                the texture image has a compressed internal format
     * @param level   the texture level to clear
     * @param format  the format of the source data. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the type of the source data. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
     *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexImage">Reference Page</a>
     */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        nglClearTexImage(texture, level, format, type, memAddressSafe(data));
    }

    /**
     * Is equivalent to calling {@link #glClearTexSubImage ClearTexSubImage} with {@code xoffset}, {@code yoffset}, and {@code zoffset} equal to -{@code b} and {@code width},
     * {@code height}, and {@code depth} equal to the dimensions of the texture image plus {@code 2xb} (or zero and one for dimensions the texture doesn't
     * have).
     *
     * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
     *                the texture image has a compressed internal format
     * @param level   the texture level to clear
     * @param format  the format of the source data. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the type of the source data. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
     *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexImage">Reference Page</a>
     */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        nglClearTexImage(texture, level, format, type, memAddressSafe(data));
    }

    /**
     * Is equivalent to calling {@link #glClearTexSubImage ClearTexSubImage} with {@code xoffset}, {@code yoffset}, and {@code zoffset} equal to -{@code b} and {@code width},
     * {@code height}, and {@code depth} equal to the dimensions of the texture image plus {@code 2xb} (or zero and one for dimensions the texture doesn't
     * have).
     *
     * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
     *                the texture image has a compressed internal format
     * @param level   the texture level to clear
     * @param format  the format of the source data. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the type of the source data. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
     *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexImage">Reference Page</a>
     */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        nglClearTexImage(texture, level, format, type, memAddressSafe(data));
    }

    /**
     * Is equivalent to calling {@link #glClearTexSubImage ClearTexSubImage} with {@code xoffset}, {@code yoffset}, and {@code zoffset} equal to -{@code b} and {@code width},
     * {@code height}, and {@code depth} equal to the dimensions of the texture image plus {@code 2xb} (or zero and one for dimensions the texture doesn't
     * have).
     *
     * @param texture the texture to clear. It is an error if {@code texture} is zero or not the name of a texture object, if {@code texture} is a buffer texture, or if
     *                the texture image has a compressed internal format
     * @param level   the texture level to clear
     * @param format  the format of the source data. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the type of the source data. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
     * @param data    an array of between one and four components of texel data that will be used as the source for the constant fill value. If {@code data} is {@code NULL},
     *                then the pointer is ignored and the sub-range of the texture image is filled with zeros.
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexImage">Reference Page</a>
     */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer data) {
        nglClearTexImage(texture, level, format, type, memAddressSafe(data));
    }

    // --- [ glBindBuffersBase ] ---

    /**
     * Unsafe version of: {@link #glBindBuffersBase BindBuffersBase}
     *
     * @param count the number of bindings
     */
    public static native void nglBindBuffersBase(int target, int first, int count, long buffers);

    /**
     * Binds {@code count} existing buffer objects to bindings numbered {@code first} through {@code first+count-1} in the array of buffer binding points
     * corresponding to {@code target}. If {@code buffers} is not {@code NULL}, it specifies an array of {@code count} values, each of which must be zero or the name
     * of an existing buffer object. It is equivalent to:
     * 
     * <pre><code>
     * for ( i = 0; i &lt; count; i++ ) {
     *     if ( buffers == NULL ) {
     *         glBindBufferBase(target, first + i, 0);
     *     } else {
     *         glBindBufferBase(target, first + i, buffers[i]);
     *     }
     * }</code></pre>
     * 
     * <p>except that the single general buffer binding corresponding to {@code target} is unmodified, and that buffers will not be created if they do not exist.</p>
     *
     * @param target  the buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param first   the first binding
     * @param buffers an array of zeros or names of existing buffers objects
     * 
     * @see <a href="https://docs.gl/gl4/glBindBuffersBase">Reference Page</a>
     */
    public static void glBindBuffersBase(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer buffers) {
        nglBindBuffersBase(target, first, remainingSafe(buffers), memAddressSafe(buffers));
    }

    // --- [ glBindBuffersRange ] ---

    /**
     * Unsafe version of: {@link #glBindBuffersRange BindBuffersRange}
     *
     * @param count the number of bindings
     */
    public static native void nglBindBuffersRange(int target, int first, int count, long buffers, long offsets, long sizes);

    /**
     * Binds {@code count} existing buffer objects to bindings numbered {@code first} through {@code first+count-1} in the array of buffer binding points
     * corresponding to {@code target}. {@code offsets} and {@code sizes} specify arrays of {@code count} values indicating the range of each buffer to bind.
     * If {@code buffers} is {@code NULL}, all bindings from {@code first} through {@code first+count-1} are reset to their unbound (zero) state. In this
     * case, the offsets and sizes associated with the binding points are set to default values, ignoring {@code offsets} and {@code sizes}. It is equivalent
     * to:
     * 
     * <pre><code>
     * for ( i = 0; i &lt; count; i++ ) {
     *     if ( buffers == NULL ) {
     *         glBindBufferRange(target, first + i, 0, 0, 0);
     *     } else {
     *         glBindBufferRange(target, first + i, buffers[i], offsets[i], sizes[i]);
     *     }
     * }</code></pre>
     * 
     * <p>except that the single general buffer binding corresponding to {@code target} is unmodified, and that buffers will not be created if they do not exist.</p>
     * 
     * <p>The values specified in {@code buffers}, {@code offsets}, and {@code sizes} will be checked separately for each binding point. When values for a
     * specific binding point are invalid, the state for that binding point will be unchanged and an error will be generated. However, state for other binding
     * points will still be changed if their corresponding values are valid.</p>
     *
     * @param target  the buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param first   the first binding
     * @param buffers an array of names of existing buffers objects
     * @param offsets an array of offsets
     * @param sizes   an array of sizes
     * 
     * @see <a href="https://docs.gl/gl4/glBindBuffersRange">Reference Page</a>
     */
    public static void glBindBuffersRange(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizeiptr const *") PointerBuffer sizes) {
        if (CHECKS) {
            checkSafe(offsets, remainingSafe(buffers));
            checkSafe(sizes, remainingSafe(buffers));
        }
        nglBindBuffersRange(target, first, remainingSafe(buffers), memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(sizes));
    }

    // --- [ glBindTextures ] ---

    /**
     * Unsafe version of: {@link #glBindTextures BindTextures}
     *
     * @param count the number of texture objects
     */
    public static native void nglBindTextures(int first, int count, long textures);

    /**
     * Binds {@code count} existing texture objects to texture image units numbered {@code first} through {@code first+count-1}. If {@code textures} is not
     * {@code NULL}, it specifies an array of {@code count} values, each of which must be zero or the name of an existing texture object. When an entry in
     * {@code textures} is the name of an existing texture object, that object is bound to corresponding texture unit for the target specified when the texture
     * object was created. When an entry in {@code textures} is zero, each of the targets enumerated at the beginning of this section is reset to its default
     * texture for the corresponding texture image unit. If {@code textures} is {@code NULL}, each target of each affected texture image unit from {@code first}
     * through {@code first+count-1} is reset to its default texture.
     * 
     * <p>{@code BindTextures} is equivalent to:</p>
     * 
     * <pre><code>
     * for ( i = 0; i &lt; count; i++ ) {
     *     uint texture;
     *     if ( textures == NULL ) {
     *         texture = 0;
     *     } else {
     *         texture = textures[i];
     *     }
     *     ActiveTexture(TEXTURE0 + first + i);
     *     if ( texture != 0 ) {
     *         enum target; // target of texture object textures[i]
     *         BindTexture(target, textures[i]);
     *     } else {
     *         for ( target in all supported targets ) {
     *             BindTexture(target, 0);
     *         }
     *     }
     * }</code></pre>
     * 
     * <p>except that the active texture selector retains its original value upon completion of the command, and that textures will not be created if they do not
     * exist.</p>
     * 
     * <p>The values specified in {@code textures} will be checked separately for each texture image unit. When a value for a specific texture image unit is
     * invalid, the state for that texture image unit will be unchanged and an error will be generated. However, state for other texture image units will still
     * be changed if their corresponding values are valid.</p>
     *
     * @param first    the first texture objects
     * @param textures an array of zeros or names of existing texture objects
     * 
     * @see <a href="https://docs.gl/gl4/glBindTextures">Reference Page</a>
     */
    public static void glBindTextures(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer textures) {
        nglBindTextures(first, remainingSafe(textures), memAddressSafe(textures));
    }

    // --- [ glBindSamplers ] ---

    /**
     * Unsafe version of: {@link #glBindSamplers BindSamplers}
     *
     * @param count the number of sampler objects
     */
    public static native void nglBindSamplers(int first, int count, long samplers);

    /**
     * Binds {@code count} existing sampler objects to texture image units numbered {@code first} through {@code first+count-1}. If {@code samplers} is not
     * {@code NULL}, it specifies an array of {@code count} values, each of which must be zero or the name of an existing sampler object. If {@code samplers} is {@code NULL},
     * each affected texture image unit from {@code first} through {@code first+count-1} will be reset to have no bound sampler object.
     * 
     * <p>{@code BindSamplers} is equivalent to:</p>
     * 
     * <pre><code>
     * for ( i = 0; i &lt; count; i++ ) {
     *     if ( samplers == NULL ) {
     *         glBindSampler(first + i, 0);
     *     } else {
     *         glBindSampler(first + i, samplers[i]);
     *     }
     * }</code></pre>
     * 
     * <p>The values specified in {@code samplers} will be checked separately for each texture image unit. When a value for a specific texture image unit is
     * invalid, the state for that texture image unit will be unchanged and an error will be generated. However, state for other texture image units will still
     * be changed if their corresponding values are valid.</p>
     *
     * @param first    the first sampler object
     * @param samplers an array of zeros or names of existing sampler objects
     * 
     * @see <a href="https://docs.gl/gl4/glBindSamplers">Reference Page</a>
     */
    public static void glBindSamplers(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer samplers) {
        nglBindSamplers(first, remainingSafe(samplers), memAddressSafe(samplers));
    }

    // --- [ glBindImageTextures ] ---

    /**
     * Unsafe version of: {@link #glBindImageTextures BindImageTextures}
     *
     * @param count the number of image units
     */
    public static native void nglBindImageTextures(int first, int count, long textures);

    /**
     * Binds {@code count} existing texture objects to image units numbered {@code first} through {@code first+count-1}. If {@code textures} is not {@code NULL}, it
     * specifies an array of {@code count} values, each of which must be zero or the name of an existing texture object. If {@code textures} is {@code NULL}, each
     * affected image unit from {@code first} through {@code first+count-1} will be reset to have no bound texture object.
     * 
     * <p>When binding a non-zero texture object to an image unit, the image unit {@code level}, {@code layered}, {@code layer}, and {@code access} parameters are
     * set to zero, {@link GL11#GL_TRUE TRUE}, zero, and {@link GL15#GL_READ_WRITE READ_WRITE}, respectively. The image unit {@code format} parameter is taken from the internal
     * format of the texture image at level zero of the texture object identified by {@code textures}. For cube map textures, the internal format of the
     * {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X} image of level zero is used. For multisample, multisample array, buffer, and rectangle textures, the internal
     * format of the single texture level is used.</p>
     * 
     * <p>When unbinding a texture object from an image unit, the image unit parameters {@code level}, {@code layered}, {@code layer}, and {@code format} will be
     * reset to their default values of zero, {@link GL11#GL_FALSE FALSE}, 0, and {@link GL30#GL_R8 R8}, respectively.</p>
     * 
     * <p>{@code BindImageTextures} is equivalent to:</p>
     * 
     * <pre><code>
     * for ( i = 0; i &lt; count; i++ ) {
     *     if ( textures == NULL || textures[i] = 0 ) {
     *         glBindImageTexture(first + i, 0, 0, FALSE, 0, READ_ONLY, R8);
     *     } else {
     *         glBindImageTexture(first + i, textures[i], 0, TRUE, 0, READ_WRITE, lookupInternalFormat(textures[i]));
     *     }
     * }</code></pre>
     * 
     * <p>where {@code lookupInternalFormat} returns the internal format of the specified texture object.</p>
     * 
     * <p>The values specified in {@code textures} will be checked separately for each image unit. When a value for a specific image unit is invalid, the state
     * for that image unit will be unchanged and an error will be generated. However, state for other image units will still be changed if their corresponding
     * values are valid.</p>
     *
     * @param first    the first image unit
     * @param textures an array of zeros or names of existing texture objects
     * 
     * @see <a href="https://docs.gl/gl4/glBindImageTextures">Reference Page</a>
     */
    public static void glBindImageTextures(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer textures) {
        nglBindImageTextures(first, remainingSafe(textures), memAddressSafe(textures));
    }

    // --- [ glBindVertexBuffers ] ---

    /**
     * Unsafe version of: {@link #glBindVertexBuffers BindVertexBuffers}
     *
     * @param count the number of vertex buffer binding points
     */
    public static native void nglBindVertexBuffers(int first, int count, long buffers, long offsets, long strides);

    /**
     * Binds {@code count} existing buffer objects to vertex buffer binding points numbered {@code first} through {@code first+count-1}. If {@code buffers} is
     * not {@code NULL}, it specifies an array of {@code count} values, each of which must be zero or the name of an existing buffer object. {@code offsets} and
     * {@code strides} specify arrays of {@code count} values indicating the offset of the first element and stride between elements in each buffer,
     * respectively. If {@code buffers} is {@code NULL}, each affected vertex buffer binding point from {@code first} through {@code first+count-1} will be reset to
     * have no bound buffer object. In this case, the offsets and strides associated with the binding points are set to default values, ignoring
     * {@code offsets} and {@code strides}.
     * 
     * <p>{@code BindVertexBuffers} is equivalent to:</p>
     * 
     * <pre><code>
     * for ( i = 0; i &lt; count; i++ ) {
     *     if ( buffers == NULL ) {
     *         glBindVertexBuffer(first + i, 0, 0, 16);
     *     } else {
     *         glBindVertexBuffer(first + i, buffers[i], offsets[i], strides[i]);
     *     }
     * }</code></pre>
     * 
     * <p>except that buffers will not be created if they do not exist.</p>
     * 
     * <p>The values specified in {@code buffers}, {@code offsets}, and {@code strides} will be checked separately for each vertex buffer binding point. When a
     * value for a specific binding point is invalid, the state for that binding point will be unchanged and an error will be generated. However, state for
     * other binding points will still be changed if their corresponding values are valid.</p>
     *
     * @param first   the first vertex buffer binding point
     * @param buffers an array of zeros or names of existing buffers objects
     * @param offsets an array of offses
     * @param strides an array of stride values
     * 
     * @see <a href="https://docs.gl/gl4/glBindVertexBuffers">Reference Page</a>
     */
    public static void glBindVertexBuffers(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizei const *") IntBuffer strides) {
        if (CHECKS) {
            checkSafe(offsets, remainingSafe(buffers));
            checkSafe(strides, remainingSafe(buffers));
        }
        nglBindVertexBuffers(first, remainingSafe(buffers), memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(strides));
    }

    /**
     * Array version of: {@link #glBufferStorage BufferStorage}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 1, data, flags, __functionAddress);
    }

    /**
     * Array version of: {@link #glBufferStorage BufferStorage}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /**
     * Array version of: {@link #glBufferStorage BufferStorage}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /**
     * Array version of: {@link #glBufferStorage BufferStorage}
     * 
     * @see <a href="https://docs.gl/gl4/glBufferStorage">Reference Page</a>
     */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") double[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 3, data, flags, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearTexSubImage ClearTexSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexSubImage">Reference Page</a>
     */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glClearTexSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearTexSubImage ClearTexSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexSubImage">Reference Page</a>
     */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glClearTexSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearTexSubImage ClearTexSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexSubImage">Reference Page</a>
     */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glClearTexSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearTexSubImage ClearTexSubImage}
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexSubImage">Reference Page</a>
     */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] data) {
        long __functionAddress = GL.getICD().glClearTexSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearTexImage ClearTexImage}
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexImage">Reference Page</a>
     */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glClearTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearTexImage ClearTexImage}
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexImage">Reference Page</a>
     */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glClearTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearTexImage ClearTexImage}
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexImage">Reference Page</a>
     */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glClearTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearTexImage ClearTexImage}
     * 
     * @see <a href="https://docs.gl/gl4/glClearTexImage">Reference Page</a>
     */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] data) {
        long __functionAddress = GL.getICD().glClearTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glBindBuffersBase BindBuffersBase}
     * 
     * @see <a href="https://docs.gl/gl4/glBindBuffersBase">Reference Page</a>
     */
    public static void glBindBuffersBase(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] buffers) {
        long __functionAddress = GL.getICD().glBindBuffersBase;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, first, lengthSafe(buffers), buffers, __functionAddress);
    }

    /**
     * Array version of: {@link #glBindBuffersRange BindBuffersRange}
     * 
     * @see <a href="https://docs.gl/gl4/glBindBuffersRange">Reference Page</a>
     */
    public static void glBindBuffersRange(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizeiptr const *") PointerBuffer sizes) {
        long __functionAddress = GL.getICD().glBindBuffersRange;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(offsets, lengthSafe(buffers));
            checkSafe(sizes, lengthSafe(buffers));
        }
        callPPPV(target, first, lengthSafe(buffers), buffers, memAddressSafe(offsets), memAddressSafe(sizes), __functionAddress);
    }

    /**
     * Array version of: {@link #glBindTextures BindTextures}
     * 
     * @see <a href="https://docs.gl/gl4/glBindTextures">Reference Page</a>
     */
    public static void glBindTextures(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] textures) {
        long __functionAddress = GL.getICD().glBindTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, lengthSafe(textures), textures, __functionAddress);
    }

    /**
     * Array version of: {@link #glBindSamplers BindSamplers}
     * 
     * @see <a href="https://docs.gl/gl4/glBindSamplers">Reference Page</a>
     */
    public static void glBindSamplers(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] samplers) {
        long __functionAddress = GL.getICD().glBindSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, lengthSafe(samplers), samplers, __functionAddress);
    }

    /**
     * Array version of: {@link #glBindImageTextures BindImageTextures}
     * 
     * @see <a href="https://docs.gl/gl4/glBindImageTextures">Reference Page</a>
     */
    public static void glBindImageTextures(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] textures) {
        long __functionAddress = GL.getICD().glBindImageTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, lengthSafe(textures), textures, __functionAddress);
    }

    /**
     * Array version of: {@link #glBindVertexBuffers BindVertexBuffers}
     * 
     * @see <a href="https://docs.gl/gl4/glBindVertexBuffers">Reference Page</a>
     */
    public static void glBindVertexBuffers(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizei const *") int[] strides) {
        long __functionAddress = GL.getICD().glBindVertexBuffers;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(offsets, lengthSafe(buffers));
            checkSafe(strides, lengthSafe(buffers));
        }
        callPPPV(first, lengthSafe(buffers), buffers, memAddressSafe(offsets), strides, __functionAddress);
    }

}