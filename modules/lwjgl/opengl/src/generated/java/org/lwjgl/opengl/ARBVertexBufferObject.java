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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_vertex_buffer_object.txt">ARB_vertex_buffer_object</a> extension.
 * 
 * <p>This extension defines an interface that allows various types of data (especially vertex array data) to be cached in high-performance graphics memory on
 * the server, thereby increasing the rate of data transfers.</p>
 * 
 * <p>Chunks of data are encapsulated within "buffer objects", which conceptually are nothing more than arrays of bytes, just like any chunk of memory. An API
 * is provided whereby applications can read from or write to buffers, either via the GL itself ({@link #glBufferDataARB BufferDataARB}, {@link #glBufferSubDataARB BufferSubDataARB},
 * {@link #glGetBufferSubDataARB GetBufferSubDataARB}) or via a pointer to the memory.</p>
 * 
 * <p>The latter technique is known as "mapping" a buffer.  When an application maps a buffer, it is given a pointer to the memory. When the application
 * finishes reading from or writing to the memory, it is required to "unmap" the buffer before it is once again permitted to use that buffer as a GL data
 * source or sink. Mapping often allows applications to eliminate an extra data copy otherwise required to access the buffer, thereby enhancing
 * performance. In addition, requiring that applications unmap the buffer to use it as a data source or sink ensures that certain classes of latent
 * synchronization bugs cannot occur.</p>
 * 
 * <p>Although this extension only defines hooks for buffer objects to be used with OpenGL's vertex array APIs, the API defined in this extension permits
 * buffer objects to be used as either data sources or sinks for any GL command that takes a pointer as an argument. Normally, in the absence of this
 * extension, a pointer passed into the GL is simply a pointer to the user's data. This extension defines a mechanism whereby this pointer is used not as a
 * pointer to the data itself, but as an offset into a currently bound buffer object. The buffer object ID zero is reserved, and when buffer object zero is
 * bound to a given target, the commands affected by that buffer binding behave normally. When a nonzero buffer ID is bound, then the pointer represents an
 * offset.</p>
 * 
 * <p>In the case of vertex arrays, this extension defines not merely one binding for all attributes, but a separate binding for each individual attribute. As
 * a result, applications can source their attributes from multiple buffers. An application might, for example, have a model with constant texture
 * coordinates and variable geometry. The texture coordinates might be retrieved from a buffer object with the usage mode "STATIC_DRAW", indicating to the
 * GL that the application does not expect to update the contents of the buffer frequently or even at all, while the vertices might be retrieved from a
 * buffer object with the usage mode "STREAM_DRAW", indicating that the vertices will be updated on a regular basis.</p>
 * 
 * <p>In addition, a binding is defined by which applications can source index data (as used by {@link GL11C#glDrawElements DrawElements}, {@link GL12C#glDrawRangeElements DrawRangeElements}, and
 * {@link GL14C#glMultiDrawElements MultiDrawElements}) from a buffer object. On some platforms, this enables very large models to be rendered with no more than a few small commands
 * to the graphics device.</p>
 * 
 * <p>It is expected that a future extension will allow sourcing pixel data from and writing pixel data to a buffer object.</p>
 * 
 * <p>Promoted to core in {@link GL15 OpenGL 1.5}.</p>
 */
public class ARBVertexBufferObject {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code target} parameters of BindBufferARB, BufferDataARB, BufferSubDataARB, MapBufferARB, UnmapBufferARB, GetBufferSubDataARB,
     * GetBufferParameterivARB, and GetBufferPointervARB.
     */
    public static final int
        GL_ARRAY_BUFFER_ARB         = 0x8892,
        GL_ELEMENT_ARRAY_BUFFER_ARB = 0x8893;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_ARRAY_BUFFER_BINDING_ARB                 = 0x8894,
        GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB         = 0x8895,
        GL_VERTEX_ARRAY_BUFFER_BINDING_ARB          = 0x8896,
        GL_NORMAL_ARRAY_BUFFER_BINDING_ARB          = 0x8897,
        GL_COLOR_ARRAY_BUFFER_BINDING_ARB           = 0x8898,
        GL_INDEX_ARRAY_BUFFER_BINDING_ARB           = 0x8899,
        GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB   = 0x889A,
        GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB       = 0x889B,
        GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB = 0x889C,
        GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB  = 0x889D,
        GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB          = 0x889E;

    /** Accepted by the {@code pname} parameter of GetVertexAttribivARB. */
    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB = 0x889F;

    /** Accepted by the {@code usage} parameter of BufferDataARB. */
    public static final int
        GL_STREAM_DRAW_ARB  = 0x88E0,
        GL_STREAM_READ_ARB  = 0x88E1,
        GL_STREAM_COPY_ARB  = 0x88E2,
        GL_STATIC_DRAW_ARB  = 0x88E4,
        GL_STATIC_READ_ARB  = 0x88E5,
        GL_STATIC_COPY_ARB  = 0x88E6,
        GL_DYNAMIC_DRAW_ARB = 0x88E8,
        GL_DYNAMIC_READ_ARB = 0x88E9,
        GL_DYNAMIC_COPY_ARB = 0x88EA;

    /** Accepted by the {@code access} parameter of MapBufferARB. */
    public static final int
        GL_READ_ONLY_ARB  = 0x88B8,
        GL_WRITE_ONLY_ARB = 0x88B9,
        GL_READ_WRITE_ARB = 0x88BA;

    /** Accepted by the {@code pname} parameter of GetBufferParameterivARB. */
    public static final int
        GL_BUFFER_SIZE_ARB   = 0x8764,
        GL_BUFFER_USAGE_ARB  = 0x8765,
        GL_BUFFER_ACCESS_ARB = 0x88BB,
        GL_BUFFER_MAPPED_ARB = 0x88BC;

    /** Accepted by the {@code pname} parameter of GetBufferPointervARB. */
    public static final int GL_BUFFER_MAP_POINTER_ARB = 0x88BD;

    protected ARBVertexBufferObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindBufferARB ] ---

    /**
     * Binds a named buffer object.
     *
     * @param target the target to which the buffer object is bound. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param buffer the name of a buffer object
     */
    public static native void glBindBufferARB(@NativeType("GLenum") int target, @NativeType("GLuint") int buffer);

    // --- [ glDeleteBuffersARB ] ---

    /**
     * Unsafe version of: {@link #glDeleteBuffersARB DeleteBuffersARB}
     *
     * @param n the number of buffer objects to be deleted
     */
    public static native void nglDeleteBuffersARB(int n, long buffers);

    /**
     * Deletes named buffer objects.
     *
     * @param buffers an array of buffer objects to be deleted
     */
    public static void glDeleteBuffersARB(@NativeType("GLuint const *") IntBuffer buffers) {
        nglDeleteBuffersARB(buffers.remaining(), memAddress(buffers));
    }

    /** Deletes named buffer objects. */
    public static void glDeleteBuffersARB(@NativeType("GLuint const *") int buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.ints(buffer);
            nglDeleteBuffersARB(1, memAddress(buffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenBuffersARB ] ---

    /**
     * Unsafe version of: {@link #glGenBuffersARB GenBuffersARB}
     *
     * @param n the number of buffer object names to be generated
     */
    public static native void nglGenBuffersARB(int n, long buffers);

    /**
     * Generates buffer object names.
     *
     * @param buffers a buffer in which the generated buffer object names are stored
     */
    public static void glGenBuffersARB(@NativeType("GLuint *") IntBuffer buffers) {
        nglGenBuffersARB(buffers.remaining(), memAddress(buffers));
    }

    /** Generates buffer object names. */
    @NativeType("void")
    public static int glGenBuffersARB() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.callocInt(1);
            nglGenBuffersARB(1, memAddress(buffers));
            return buffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsBufferARB ] ---

    /**
     * Determines if a name corresponds to a buffer object.
     *
     * @param buffer a value that may be the name of a buffer object
     */
    @NativeType("GLboolean")
    public static native boolean glIsBufferARB(@NativeType("GLuint") int buffer);

    // --- [ glBufferDataARB ] ---

    /**
     * Unsafe version of: {@link #glBufferDataARB BufferDataARB}
     *
     * @param size the size in bytes of the buffer object's new data store
     */
    public static native void nglBufferDataARB(int target, long size, long data, int usage);

    /**
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param size   the size in bytes of the buffer object's new data store
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW_ARB STREAM_DRAW_ARB}</td><td>{@link #GL_STREAM_READ_ARB STREAM_READ_ARB}</td><td>{@link #GL_STREAM_COPY_ARB STREAM_COPY_ARB}</td><td>{@link #GL_STATIC_DRAW_ARB STATIC_DRAW_ARB}</td><td>{@link #GL_STATIC_READ_ARB STATIC_READ_ARB}</td></tr><tr><td>{@link #GL_STATIC_COPY_ARB STATIC_COPY_ARB}</td><td>{@link #GL_DYNAMIC_DRAW_ARB DYNAMIC_DRAW_ARB}</td><td>{@link #GL_DYNAMIC_READ_ARB DYNAMIC_READ_ARB}</td><td>{@link #GL_DYNAMIC_COPY_ARB DYNAMIC_COPY_ARB}</td></tr></table>
     */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("GLsizeiptrARB") long size, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, size, NULL, usage);
    }

    /**
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW_ARB STREAM_DRAW_ARB}</td><td>{@link #GL_STREAM_READ_ARB STREAM_READ_ARB}</td><td>{@link #GL_STREAM_COPY_ARB STREAM_COPY_ARB}</td><td>{@link #GL_STATIC_DRAW_ARB STATIC_DRAW_ARB}</td><td>{@link #GL_STATIC_READ_ARB STATIC_READ_ARB}</td></tr><tr><td>{@link #GL_STATIC_COPY_ARB STATIC_COPY_ARB}</td><td>{@link #GL_DYNAMIC_DRAW_ARB DYNAMIC_DRAW_ARB}</td><td>{@link #GL_DYNAMIC_READ_ARB DYNAMIC_READ_ARB}</td><td>{@link #GL_DYNAMIC_COPY_ARB DYNAMIC_COPY_ARB}</td></tr></table>
     */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, data.remaining(), memAddress(data), usage);
    }

    /**
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW_ARB STREAM_DRAW_ARB}</td><td>{@link #GL_STREAM_READ_ARB STREAM_READ_ARB}</td><td>{@link #GL_STREAM_COPY_ARB STREAM_COPY_ARB}</td><td>{@link #GL_STATIC_DRAW_ARB STATIC_DRAW_ARB}</td><td>{@link #GL_STATIC_READ_ARB STATIC_READ_ARB}</td></tr><tr><td>{@link #GL_STATIC_COPY_ARB STATIC_COPY_ARB}</td><td>{@link #GL_DYNAMIC_DRAW_ARB DYNAMIC_DRAW_ARB}</td><td>{@link #GL_DYNAMIC_READ_ARB DYNAMIC_READ_ARB}</td><td>{@link #GL_DYNAMIC_COPY_ARB DYNAMIC_COPY_ARB}</td></tr></table>
     */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), usage);
    }

    /**
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW_ARB STREAM_DRAW_ARB}</td><td>{@link #GL_STREAM_READ_ARB STREAM_READ_ARB}</td><td>{@link #GL_STREAM_COPY_ARB STREAM_COPY_ARB}</td><td>{@link #GL_STATIC_DRAW_ARB STATIC_DRAW_ARB}</td><td>{@link #GL_STATIC_READ_ARB STATIC_READ_ARB}</td></tr><tr><td>{@link #GL_STATIC_COPY_ARB STATIC_COPY_ARB}</td><td>{@link #GL_DYNAMIC_DRAW_ARB DYNAMIC_DRAW_ARB}</td><td>{@link #GL_DYNAMIC_READ_ARB DYNAMIC_READ_ARB}</td><td>{@link #GL_DYNAMIC_COPY_ARB DYNAMIC_COPY_ARB}</td></tr></table>
     */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /**
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW_ARB STREAM_DRAW_ARB}</td><td>{@link #GL_STREAM_READ_ARB STREAM_READ_ARB}</td><td>{@link #GL_STREAM_COPY_ARB STREAM_COPY_ARB}</td><td>{@link #GL_STATIC_DRAW_ARB STATIC_DRAW_ARB}</td><td>{@link #GL_STATIC_READ_ARB STATIC_READ_ARB}</td></tr><tr><td>{@link #GL_STATIC_COPY_ARB STATIC_COPY_ARB}</td><td>{@link #GL_DYNAMIC_DRAW_ARB DYNAMIC_DRAW_ARB}</td><td>{@link #GL_DYNAMIC_READ_ARB DYNAMIC_READ_ARB}</td><td>{@link #GL_DYNAMIC_COPY_ARB DYNAMIC_COPY_ARB}</td></tr></table>
     */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /**
     * Creates and initializes a buffer object's data store.
     * 
     * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
     * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
     * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
     * frequency of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
     * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
     * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
     * </ul>
     * 
     * <p>The nature of access may be one of these:</p>
     * 
     * <ul>
     * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
     * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
     * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
     * </ul>
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
     * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link #GL_STREAM_DRAW_ARB STREAM_DRAW_ARB}</td><td>{@link #GL_STREAM_READ_ARB STREAM_READ_ARB}</td><td>{@link #GL_STREAM_COPY_ARB STREAM_COPY_ARB}</td><td>{@link #GL_STATIC_DRAW_ARB STATIC_DRAW_ARB}</td><td>{@link #GL_STATIC_READ_ARB STATIC_READ_ARB}</td></tr><tr><td>{@link #GL_STATIC_COPY_ARB STATIC_COPY_ARB}</td><td>{@link #GL_DYNAMIC_DRAW_ARB DYNAMIC_DRAW_ARB}</td><td>{@link #GL_DYNAMIC_READ_ARB DYNAMIC_READ_ARB}</td><td>{@link #GL_DYNAMIC_COPY_ARB DYNAMIC_COPY_ARB}</td></tr></table>
     */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        nglBufferDataARB(target, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), usage);
    }

    // --- [ glBufferSubDataARB ] ---

    /**
     * Unsafe version of: {@link #glBufferSubDataARB BufferSubDataARB}
     *
     * @param size the size in bytes of the data store region being replaced
     */
    public static native void nglBufferSubDataARB(int target, long offset, long size, long data);

    /**
     * Updates a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") ByteBuffer data) {
        nglBufferSubDataARB(target, offset, data.remaining(), memAddress(data));
    }

    /**
     * Updates a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") ShortBuffer data) {
        nglBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /**
     * Updates a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") IntBuffer data) {
        nglBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /**
     * Updates a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") FloatBuffer data) {
        nglBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /**
     * Updates a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
     * @param data   a pointer to the new data that will be copied into the data store
     */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") DoubleBuffer data) {
        nglBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glGetBufferSubDataARB ] ---

    /**
     * Unsafe version of: {@link #glGetBufferSubDataARB GetBufferSubDataARB}
     *
     * @param size the size in bytes of the data store region being returned
     */
    public static native void nglGetBufferSubDataARB(int target, long offset, long size, long data);

    /**
     * Returns a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") ByteBuffer data) {
        nglGetBufferSubDataARB(target, offset, data.remaining(), memAddress(data));
    }

    /**
     * Returns a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") ShortBuffer data) {
        nglGetBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /**
     * Returns a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") IntBuffer data) {
        nglGetBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /**
     * Returns a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") FloatBuffer data) {
        nglGetBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /**
     * Returns a subset of a buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
     * @param data   a pointer to the location where buffer object data is returned
     */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") DoubleBuffer data) {
        nglGetBufferSubDataARB(target, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glMapBufferARB ] ---

    /** Unsafe version of: {@link #glMapBufferARB MapBufferARB} */
    public static native long nglMapBufferARB(int target, int access);

    /**
     * Maps a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 3 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBufferARB(int, int)} - Calls {@link #glGetBufferParameterivARB GetBufferParameterivARB} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li>
     * <li>{@link #glMapBufferARB(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameterivARB GetBufferParameterivARB} to retrieve the buffer size and the {@code old_buffer} parameter is reused if not null.</li>
     * <li>{@link #glMapBufferARB(int, int, long, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if not null. This is the most efficient method.</li>
     * </ol>
     *
     * @param target the target buffer object being mapped. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link #GL_READ_ONLY_ARB READ_ONLY_ARB}</td><td>{@link #GL_WRITE_ONLY_ARB WRITE_ONLY_ARB}</td><td>{@link #GL_READ_WRITE_ARB READ_WRITE_ARB}</td></tr></table>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferARB(@NativeType("GLenum") int target, @NativeType("GLenum") int access) {
        long __result = nglMapBufferARB(target, access);
        return memByteBufferSafe(__result, glGetBufferParameteriARB(target, GL_BUFFER_SIZE_ARB));
    }

    /**
     * Maps a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 3 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBufferARB(int, int)} - Calls {@link #glGetBufferParameterivARB GetBufferParameterivARB} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li>
     * <li>{@link #glMapBufferARB(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameterivARB GetBufferParameterivARB} to retrieve the buffer size and the {@code old_buffer} parameter is reused if not null.</li>
     * <li>{@link #glMapBufferARB(int, int, long, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if not null. This is the most efficient method.</li>
     * </ol>
     *
     * @param target the target buffer object being mapped. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link #GL_READ_ONLY_ARB READ_ONLY_ARB}</td><td>{@link #GL_WRITE_ONLY_ARB WRITE_ONLY_ARB}</td><td>{@link #GL_READ_WRITE_ARB READ_WRITE_ARB}</td></tr></table>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferARB(@NativeType("GLenum") int target, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferARB(target, access);
        int length = glGetBufferParameteriARB(target, GL_BUFFER_SIZE_ARB);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /**
     * Maps a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 3 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBufferARB(int, int)} - Calls {@link #glGetBufferParameterivARB GetBufferParameterivARB} to retrieve the buffer size and a new ByteBuffer instance is always returned.</li>
     * <li>{@link #glMapBufferARB(int, int, ByteBuffer)} - Calls {@link #glGetBufferParameterivARB GetBufferParameterivARB} to retrieve the buffer size and the {@code old_buffer} parameter is reused if not null.</li>
     * <li>{@link #glMapBufferARB(int, int, long, ByteBuffer)} - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if not null. This is the most efficient method.</li>
     * </ol>
     *
     * @param target the target buffer object being mapped. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link #GL_READ_ONLY_ARB READ_ONLY_ARB}</td><td>{@link #GL_WRITE_ONLY_ARB WRITE_ONLY_ARB}</td><td>{@link #GL_READ_WRITE_ARB READ_WRITE_ARB}</td></tr></table>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferARB(@NativeType("GLenum") int target, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferARB(target, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glUnmapBufferARB ] ---

    /**
     * Relinquishes the mapping of a buffer object and invalidates the pointer to its data store.
     * 
     * <p>Returns TRUE unless data values in the buffer’s data store have become corrupted during the period that the buffer was mapped. Such corruption can be
     * the result of a screen resolution change or other window system-dependent event that causes system heaps such as those for high-performance graphics
     * memory to be discarded. GL implementations must guarantee that such corruption can occur only during the periods that a buffer’s data store is mapped.
     * If such corruption has occurred, UnmapBuffer returns FALSE, and the contents of the buffer’s data store become undefined.</p>
     *
     * @param target the target buffer object being unmapped. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     */
    @NativeType("GLboolean")
    public static native boolean glUnmapBufferARB(@NativeType("GLenum") int target);

    // --- [ glGetBufferParameterivARB ] ---

    /** Unsafe version of: {@link #glGetBufferParameterivARB GetBufferParameterivARB} */
    public static native void nglGetBufferParameterivARB(int target, int pname, long params);

    /**
     * Returns the value of a buffer object parameter.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     * @param params the requested parameter
     */
    public static void glGetBufferParameterivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferParameterivARB(target, pname, memAddress(params));
    }

    /**
     * Returns the value of a buffer object parameter.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetBufferParameteriARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetBufferParameterivARB(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetBufferPointervARB ] ---

    /** Unsafe version of: {@link #glGetBufferPointervARB GetBufferPointervARB} */
    public static native void nglGetBufferPointervARB(int target, int pname, long params);

    /**
     * Returns the pointer to a mapped buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link #GL_BUFFER_MAP_POINTER_ARB BUFFER_MAP_POINTER_ARB}</td></tr></table>
     * @param params the pointer value specified by {@code pname}
     */
    public static void glGetBufferPointervARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferPointervARB(target, pname, memAddress(params));
    }

    /**
     * Returns the pointer to a mapped buffer object's data store.
     *
     * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link #GL_BUFFER_MAP_POINTER_ARB BUFFER_MAP_POINTER_ARB}</td></tr></table>
     */
    @NativeType("void")
    public static long glGetBufferPointerARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetBufferPointervARB(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glDeleteBuffersARB DeleteBuffersARB} */
    public static void glDeleteBuffersARB(@NativeType("GLuint const *") int[] buffers) {
        long __functionAddress = GL.getICD().glDeleteBuffersARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffers.length, buffers, __functionAddress);
    }

    /** Array version of: {@link #glGenBuffersARB GenBuffersARB} */
    public static void glGenBuffersARB(@NativeType("GLuint *") int[] buffers) {
        long __functionAddress = GL.getICD().glGenBuffersARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffers.length, buffers, __functionAddress);
    }

    /** Array version of: {@link #glBufferDataARB BufferDataARB} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 1, data, usage, __functionAddress);
    }

    /** Array version of: {@link #glBufferDataARB BufferDataARB} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** Array version of: {@link #glBufferDataARB BufferDataARB} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** Array version of: {@link #glBufferDataARB BufferDataARB} */
    public static void glBufferDataARB(@NativeType("GLenum") int target, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glBufferDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 3, data, usage, __functionAddress);
    }

    /** Array version of: {@link #glBufferSubDataARB BufferSubDataARB} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** Array version of: {@link #glBufferSubDataARB BufferSubDataARB} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glBufferSubDataARB BufferSubDataARB} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glBufferSubDataARB BufferSubDataARB} */
    public static void glBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void const *") double[] data) {
        long __functionAddress = GL.getICD().glBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** Array version of: {@link #glGetBufferSubDataARB GetBufferSubDataARB} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") short[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** Array version of: {@link #glGetBufferSubDataARB GetBufferSubDataARB} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glGetBufferSubDataARB GetBufferSubDataARB} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glGetBufferSubDataARB GetBufferSubDataARB} */
    public static void glGetBufferSubDataARB(@NativeType("GLenum") int target, @NativeType("GLintptrARB") long offset, @NativeType("void *") double[] data) {
        long __functionAddress = GL.getICD().glGetBufferSubDataARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** Array version of: {@link #glGetBufferParameterivARB GetBufferParameterivARB} */
    public static void glGetBufferParameterivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetBufferParameterivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

}