/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_gpu_shader4.txt">EXT_gpu_shader4</a> extension.
 * 
 * <p>This extension provides a set of new features to the OpenGL Shading Language and related APIs to support capabilities of new hardware. In particular,
 * this extension provides the following functionality:</p>
 * 
 * <ul>
 * <li>New texture lookup functions are provided that allow shaders to access individual texels using integer coordinates referring to the texel location
 * and level of detail. No filtering is performed. These functions allow applications to use textures as one-, two-, and three-dimensional arrays.</li>
 * <li>New texture lookup functions are provided that allow shaders to query the dimensions of a specific level-of-detail image of a texture object.</li>
 * <li>New texture lookup functions variants are provided that allow shaders to pass a constant integer vector used to offset the texel locations used
 * during the lookup to assist in custom texture filtering operations.</li>
 * <li>New texture lookup functions are provided that allow shaders to access one- and two-dimensional array textures. The second, or third, coordinate is
 * used to select the layer of the array to access.</li>
 * <li>New "Grad" texture lookup functions are provided that allow shaders to explicitely pass in derivative values which are used by the GL to compute the
 * level-of-detail when performing a texture lookup.</li>
 * <li>A new texture lookup function is provided to access a buffer texture.</li>
 * <li>The existing absolute LOD texture lookup functions are no longer restricted to the vertex shader only.</li>
 * <li>The ability to specify and use cubemap textures with a DEPTH_COMPONENT internal format. This also enables shadow mapping on cubemaps. The 'q'
 * coordinate is used as the reference value for comparisons. A set of new texture lookup functions is provided to lookup into shadow cubemaps.</li>
 * <li>The ability to specify if varying variables are interpolated in a non-perspective correct manner, if they are flat shaded or, if multi-sampling, if
 * centroid sampling should be performed.</li>
 * <li>Full signed integer and unsigned integer support in the OpenGL Shading Language:
 * 
 * <ul>
 * <li>Integers are defined as 32 bit values using two's complement.</li>
 * <li>Unsigned integers and vectors thereof are added.</li>
 * <li>New texture lookup functions are provided that return integer values. These functions are to be used in conjunction with new texture formats
 * whose components are actual integers, rather than integers that encode a floating-point value. To support these lookup functions, new integer
 * and unsigned-integer sampler types are introduced.</li>
 * <li>Integer bitwise operators are now enabled.</li>
 * <li>Several built-in functions and operators now operate on integers or vectors of integers.</li>
 * <li>New vertex attribute functions are added that load integer attribute data and can be referenced in a vertex shader as integer data.</li>
 * <li>New uniform loading commands are added to load unsigned integer data.</li>
 * <li>Varying variables can now be (unsigned) integers. If declared as such, they have to be flat shaded.</li>
 * <li>Fragment shaders can define their own output variables, and declare them to be of type floating-point, integer or unsigned integer. These
 * variables are bound to a fragment color index with the new API command BindFragDataLocationEXT(), and directed to buffers using the existing
 * DrawBuffer or DrawBuffers API commands.</li>
 * </ul></li>
 * <li>Added new built-in functions truncate() and round() to the shading language.</li>
 * <li>A new built-in variable accessible from within vertex shaders that holds the index {@code i} implicitly passed to ArrayElement to specify the
 * vertex. This is called the vertex ID.</li>
 * <li>A new built-in variable accessible from within fragment and geometry shaders that hold the index of the currently processed primitive. This is
 * called the primitive ID.</li>
 * </ul>
 * 
 * <p>This extension also briefly mentions a new shader type, called a geometry shader. A geometry shader is run after vertices are transformed, but before
 * clipping. A geometry shader begins with a single primitive (point, line, triangle. It can read the attributes of any of the vertices in the primitive
 * and use them to generate new primitives. A geometry shader has a fixed output primitive type (point, line strip, or triangle strip) and emits vertices
 * to define a new primitive. Geometry shaders are discussed in detail in the GL_EXT_geometry_shader4 specification.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public class EXTGPUShader4 {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, GetVertexAttribiv, GetVertexAttribIuivEXT and GetVertexAttribIivEXT. */
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 0x88FD;

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int
        GL_SAMPLER_1D_ARRAY_EXT              = 0x8DC0,
        GL_SAMPLER_2D_ARRAY_EXT              = 0x8DC1,
        GL_SAMPLER_BUFFER_EXT                = 0x8DC2,
        GL_SAMPLER_1D_ARRAY_SHADOW_EXT       = 0x8DC3,
        GL_SAMPLER_2D_ARRAY_SHADOW_EXT       = 0x8DC4,
        GL_SAMPLER_CUBE_SHADOW_EXT           = 0x8DC5,
        GL_UNSIGNED_INT_VEC2_EXT             = 0x8DC6,
        GL_UNSIGNED_INT_VEC3_EXT             = 0x8DC7,
        GL_UNSIGNED_INT_VEC4_EXT             = 0x8DC8,
        GL_INT_SAMPLER_1D_EXT                = 0x8DC9,
        GL_INT_SAMPLER_2D_EXT                = 0x8DCA,
        GL_INT_SAMPLER_3D_EXT                = 0x8DCB,
        GL_INT_SAMPLER_CUBE_EXT              = 0x8DCC,
        GL_INT_SAMPLER_2D_RECT_EXT           = 0x8DCD,
        GL_INT_SAMPLER_1D_ARRAY_EXT          = 0x8DCE,
        GL_INT_SAMPLER_2D_ARRAY_EXT          = 0x8DCF,
        GL_INT_SAMPLER_BUFFER_EXT            = 0x8DD0,
        GL_UNSIGNED_INT_SAMPLER_1D_EXT       = 0x8DD1,
        GL_UNSIGNED_INT_SAMPLER_2D_EXT       = 0x8DD2,
        GL_UNSIGNED_INT_SAMPLER_3D_EXT       = 0x8DD3,
        GL_UNSIGNED_INT_SAMPLER_CUBE_EXT     = 0x8DD4,
        GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT  = 0x8DD5,
        GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 0x8DD6,
        GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 0x8DD7,
        GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT   = 0x8DD8;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MIN_PROGRAM_TEXEL_OFFSET_EXT = 0x8904,
        GL_MAX_PROGRAM_TEXEL_OFFSET_EXT = 0x8905;

    protected EXTGPUShader4() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttribI1iEXT ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     */
    public static native void glVertexAttribI1iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x);

    // --- [ glVertexAttribI2iEXT ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     */
    public static native void glVertexAttribI2iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y);

    // --- [ glVertexAttribI3iEXT ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute. The w component is implicitly set to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     */
    public static native void glVertexAttribI3iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glVertexAttribI4iEXT ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * @param w     the vertex attribute w component
     */
    public static native void glVertexAttribI4iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glVertexAttribI1uiEXT ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     */
    public static native void glVertexAttribI1uiEXT(@NativeType("GLuint") int index, @NativeType("GLuint") int x);

    // --- [ glVertexAttribI2uiEXT ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     */
    public static native void glVertexAttribI2uiEXT(@NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y);

    // --- [ glVertexAttribI3uiEXT ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute. The w component is implicitly set to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     */
    public static native void glVertexAttribI3uiEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glVertexAttribI4uiEXT ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * @param w     the vertex attribute w component
     */
    public static native void glVertexAttribI4uiEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glVertexAttribI1ivEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI1ivEXT VertexAttribI1ivEXT} */
    public static native void nglVertexAttribI1ivEXT(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI1iEXT VertexAttribI1iEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI1ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribI1ivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI2ivEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI2ivEXT VertexAttribI2ivEXT} */
    public static native void nglVertexAttribI2ivEXT(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI2iEXT VertexAttribI2iEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI2ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribI2ivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI3ivEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI3ivEXT VertexAttribI3ivEXT} */
    public static native void nglVertexAttribI3ivEXT(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI3iEXT VertexAttribI3iEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI3ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribI3ivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4ivEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT} */
    public static native void nglVertexAttribI4ivEXT(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI4iEXT VertexAttribI4iEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI4ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4ivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI1uivEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI1uivEXT VertexAttribI1uivEXT} */
    public static native void nglVertexAttribI1uivEXT(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI1uiEXT VertexAttribI1uiEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI1uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribI1uivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI2uivEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI2uivEXT VertexAttribI2uivEXT} */
    public static native void nglVertexAttribI2uivEXT(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI2uiEXT VertexAttribI2uiEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI2uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribI2uivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI3uivEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI3uivEXT VertexAttribI3uivEXT} */
    public static native void nglVertexAttribI3uivEXT(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI3uiEXT VertexAttribI3uiEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI3uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribI3uivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4uivEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT} */
    public static native void nglVertexAttribI4uivEXT(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI4uiEXT VertexAttribI4uiEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI4uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4uivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4bvEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI4bvEXT VertexAttribI4bvEXT} */
    public static native void nglVertexAttribI4bvEXT(int index, long v);

    /**
     * Byte version of {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI4bvEXT(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4bvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4svEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI4svEXT VertexAttribI4svEXT} */
    public static native void nglVertexAttribI4svEXT(int index, long v);

    /**
     * Short version of {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI4svEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4svEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4ubvEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI4ubvEXT VertexAttribI4ubvEXT} */
    public static native void nglVertexAttribI4ubvEXT(int index, long v);

    /**
     * Byte version of {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI4ubvEXT(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4ubvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4usvEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribI4usvEXT VertexAttribI4usvEXT} */
    public static native void nglVertexAttribI4usvEXT(int index, long v);

    /**
     * Short version of {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     */
    public static void glVertexAttribI4usvEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4usvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribIPointerEXT ] ---

    /** Unsafe version of: {@link #glVertexAttribIPointerEXT VertexAttribIPointerEXT} */
    public static native void nglVertexAttribIPointerEXT(int index, int size, int type, int stride, long pointer);

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, pointer);
    }

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
    }

    // --- [ glGetVertexAttribIivEXT ] ---

    /** Unsafe version of: {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT} */
    public static native void nglGetVertexAttribIivEXT(int index, int pname, long params);

    /**
     * Returns the value of a pure integer generic vertex attribute parameter.
     *
     * @param index  the index of the pure integer generic vertex attribute to be modified
     * @param pname  the symbolic name of the vertex attribute parameter to be queried
     * @param params returns the requested data
     */
    public static void glGetVertexAttribIivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribIivEXT(index, pname, memAddress(params));
    }

    /**
     * Returns the value of a pure integer generic vertex attribute parameter.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param pname the symbolic name of the vertex attribute parameter to be queried
     */
    @NativeType("void")
    public static int glGetVertexAttribIiEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribIivEXT(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribIuivEXT ] ---

    /** Unsafe version of: {@link #glGetVertexAttribIuivEXT GetVertexAttribIuivEXT} */
    public static native void nglGetVertexAttribIuivEXT(int index, int pname, long params);

    /**
     * Unsigned version of {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT}.
     *
     * @param index  the index of the pure integer generic vertex attribute to be modified
     * @param pname  the symbolic name of the vertex attribute parameter to be queried
     * @param params returns the requested data
     */
    public static void glGetVertexAttribIuivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribIuivEXT(index, pname, memAddress(params));
    }

    /**
     * Unsigned version of {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param pname the symbolic name of the vertex attribute parameter to be queried
     */
    @NativeType("void")
    public static int glGetVertexAttribIuiEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribIuivEXT(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformuivEXT ] ---

    public static native void nglGetUniformuivEXT(int program, int location, long params);

    public static void glGetUniformuivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformuivEXT(program, location, memAddress(params));
    }

    @NativeType("void")
    public static int glGetUniformuiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformuivEXT(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBindFragDataLocationEXT ] ---

    public static native void nglBindFragDataLocationEXT(int program, int color, long name);

    public static void glBindFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int color, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindFragDataLocationEXT(program, color, memAddress(name));
    }

    public static void glBindFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int color, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindFragDataLocationEXT(program, color, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFragDataLocationEXT ] ---

    public static native int nglGetFragDataLocationEXT(int program, long name);

    @NativeType("GLint")
    public static int glGetFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetFragDataLocationEXT(program, memAddress(name));
    }

    @NativeType("GLint")
    public static int glGetFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetFragDataLocationEXT(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glUniform1uiEXT ] ---

    public static native void glUniform1uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0);

    // --- [ glUniform2uiEXT ] ---

    public static native void glUniform2uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1);

    // --- [ glUniform3uiEXT ] ---

    public static native void glUniform3uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2);

    // --- [ glUniform4uiEXT ] ---

    public static native void glUniform4uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3);

    // --- [ glUniform1uivEXT ] ---

    public static native void nglUniform1uivEXT(int location, int count, long value);

    public static void glUniform1uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform1uivEXT(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2uivEXT ] ---

    public static native void nglUniform2uivEXT(int location, int count, long value);

    public static void glUniform2uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform2uivEXT(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3uivEXT ] ---

    public static native void nglUniform3uivEXT(int location, int count, long value);

    public static void glUniform3uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform3uivEXT(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4uivEXT ] ---

    public static native void nglUniform4uivEXT(int location, int count, long value);

    public static void glUniform4uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform4uivEXT(location, value.remaining() >> 2, memAddress(value));
    }

    /** Array version of: {@link #glVertexAttribI1ivEXT VertexAttribI1ivEXT} */
    public static void glVertexAttribI1ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI1ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribI2ivEXT VertexAttribI2ivEXT} */
    public static void glVertexAttribI2ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI2ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribI3ivEXT VertexAttribI3ivEXT} */
    public static void glVertexAttribI3ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT} */
    public static void glVertexAttribI4ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribI1uivEXT VertexAttribI1uivEXT} */
    public static void glVertexAttribI1uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribI2uivEXT VertexAttribI2uivEXT} */
    public static void glVertexAttribI2uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribI3uivEXT VertexAttribI3uivEXT} */
    public static void glVertexAttribI3uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT} */
    public static void glVertexAttribI4uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribI4svEXT VertexAttribI4svEXT} */
    public static void glVertexAttribI4svEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4svEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribI4usvEXT VertexAttribI4usvEXT} */
    public static void glVertexAttribI4usvEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4usvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribIPointerEXT VertexAttribIPointerEXT} */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        long __functionAddress = GL.getICD().glVertexAttribIPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, stride, pointer, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribIPointerEXT VertexAttribIPointerEXT} */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        long __functionAddress = GL.getICD().glVertexAttribIPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, stride, pointer, __functionAddress);
    }

    /** Array version of: {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT} */
    public static void glGetVertexAttribIivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetVertexAttribIuivEXT GetVertexAttribIuivEXT} */
    public static void glGetVertexAttribIuivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetUniformuivEXT GetUniformuivEXT} */
    public static void glGetUniformuivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetUniformuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** Array version of: {@link #glUniform1uivEXT Uniform1uivEXT} */
    public static void glUniform1uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glUniform2uivEXT Uniform2uivEXT} */
    public static void glUniform2uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** Array version of: {@link #glUniform3uivEXT Uniform3uivEXT} */
    public static void glUniform3uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** Array version of: {@link #glUniform4uivEXT Uniform4uivEXT} */
    public static void glUniform4uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

}