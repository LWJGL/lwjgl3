/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_image_load_store.txt">ARB_shader_image_load_store</a> extension.
 * 
 * <p>This extension provides GLSL built-in functions allowing shaders to load from, store to, and perform atomic read-modify-write operations to a single
 * level of a texture object from any shader stage. These built-in functions are named imageLoad(), imageStore(), and imageAtomic*(), respectively, and
 * accept integer texel coordinates to identify the texel accessed. The extension adds the notion of "image units" to the OpenGL API, to which texture
 * levels are bound for access by the GLSL built-in functions. To allow shaders to specify the image unit to access, GLSL provides a new set of data types
 * ("image*") similar to samplers. Each image variable is assigned an integer value to identify an image unit to access, which is specified using
 * Uniform*() APIs in a manner similar to samplers.</p>
 * 
 * <p>This extension also provides the capability to explicitly enable "early" per-fragment tests, where operations like depth and stencil testing are
 * performed prior to fragment shader execution. In unextended OpenGL, fragment shaders never have any side effects and implementations can sometimes
 * perform per-fragment tests and discard some fragments prior to executing the fragment shader. Since this extension allows fragment shaders to write to
 * texture and buffer object memory using the built-in image functions, such optimizations could lead to non-deterministic results. To avoid this,
 * implementations supporting this extension may not perform such optimizations on shaders having such side effects. However, enabling early per-fragment
 * tests guarantees that such tests will be performed prior to fragment shader execution, and ensures that image stores and atomics will not be performed
 * by fragment shader invocations where these per-fragment tests fail.</p>
 * 
 * <p>Finally, this extension provides both a GLSL built-in function and an OpenGL API function allowing applications some control over the ordering of image
 * loads, stores, and atomics relative to other OpenGL pipeline operations accessing the same memory. Because the extension provides the ability to perform
 * random accesses to texture or buffer object memory, such accesses are not easily tracked by the OpenGL driver. To avoid the need for heavy-handed
 * synchronization at the driver level, this extension requires manual synchronization. The MemoryBarrier() OpenGL API function allows applications to
 * specify a bitfield indicating the set of OpenGL API operations to synchronize relative to shader memory access. The memoryBarrier() GLSL built-in
 * function provides a synchronization point within a given shader invocation to ensure that all memory accesses performed prior to the synchronization
 * point complete prior to any started after the synchronization point.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0} and GLSL 1.30. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
 */
public class ARBShaderImageLoadStore {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v. */
    public static final int
        GL_MAX_IMAGE_UNITS                               = 0x8F38,
        GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 0x8F39,
        GL_MAX_IMAGE_SAMPLES                             = 0x906D,
        GL_MAX_VERTEX_IMAGE_UNIFORMS                     = 0x90CA,
        GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS               = 0x90CB,
        GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS            = 0x90CC,
        GL_MAX_GEOMETRY_IMAGE_UNIFORMS                   = 0x90CD,
        GL_MAX_FRAGMENT_IMAGE_UNIFORMS                   = 0x90CE,
        GL_MAX_COMBINED_IMAGE_UNIFORMS                   = 0x90CF;

    /** Accepted by the {@code target} parameter of GetIntegeri_v and GetBooleani_v. */
    public static final int
        GL_IMAGE_BINDING_NAME    = 0x8F3A,
        GL_IMAGE_BINDING_LEVEL   = 0x8F3B,
        GL_IMAGE_BINDING_LAYERED = 0x8F3C,
        GL_IMAGE_BINDING_LAYER   = 0x8F3D,
        GL_IMAGE_BINDING_ACCESS  = 0x8F3E,
        GL_IMAGE_BINDING_FORMAT  = 0x906E;

    /** Accepted by the {@code barriers} parameter of MemoryBarrier. */
    public static final int
        GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 0x1,
        GL_ELEMENT_ARRAY_BARRIER_BIT       = 0x2,
        GL_UNIFORM_BARRIER_BIT             = 0x4,
        GL_TEXTURE_FETCH_BARRIER_BIT       = 0x8,
        GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = 0x20,
        GL_COMMAND_BARRIER_BIT             = 0x40,
        GL_PIXEL_BUFFER_BARRIER_BIT        = 0x80,
        GL_TEXTURE_UPDATE_BARRIER_BIT      = 0x100,
        GL_BUFFER_UPDATE_BARRIER_BIT       = 0x200,
        GL_FRAMEBUFFER_BARRIER_BIT         = 0x400,
        GL_TRANSFORM_FEEDBACK_BARRIER_BIT  = 0x800,
        GL_ATOMIC_COUNTER_BARRIER_BIT      = 0x1000,
        GL_ALL_BARRIER_BITS                = 0xFFFFFFFF;

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int
        GL_IMAGE_1D                                = 0x904C,
        GL_IMAGE_2D                                = 0x904D,
        GL_IMAGE_3D                                = 0x904E,
        GL_IMAGE_2D_RECT                           = 0x904F,
        GL_IMAGE_CUBE                              = 0x9050,
        GL_IMAGE_BUFFER                            = 0x9051,
        GL_IMAGE_1D_ARRAY                          = 0x9052,
        GL_IMAGE_2D_ARRAY                          = 0x9053,
        GL_IMAGE_CUBE_MAP_ARRAY                    = 0x9054,
        GL_IMAGE_2D_MULTISAMPLE                    = 0x9055,
        GL_IMAGE_2D_MULTISAMPLE_ARRAY              = 0x9056,
        GL_INT_IMAGE_1D                            = 0x9057,
        GL_INT_IMAGE_2D                            = 0x9058,
        GL_INT_IMAGE_3D                            = 0x9059,
        GL_INT_IMAGE_2D_RECT                       = 0x905A,
        GL_INT_IMAGE_CUBE                          = 0x905B,
        GL_INT_IMAGE_BUFFER                        = 0x905C,
        GL_INT_IMAGE_1D_ARRAY                      = 0x905D,
        GL_INT_IMAGE_2D_ARRAY                      = 0x905E,
        GL_INT_IMAGE_CUBE_MAP_ARRAY                = 0x905F,
        GL_INT_IMAGE_2D_MULTISAMPLE                = 0x9060,
        GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY          = 0x9061,
        GL_UNSIGNED_INT_IMAGE_1D                   = 0x9062,
        GL_UNSIGNED_INT_IMAGE_2D                   = 0x9063,
        GL_UNSIGNED_INT_IMAGE_3D                   = 0x9064,
        GL_UNSIGNED_INT_IMAGE_2D_RECT              = 0x9065,
        GL_UNSIGNED_INT_IMAGE_CUBE                 = 0x9066,
        GL_UNSIGNED_INT_IMAGE_BUFFER               = 0x9067,
        GL_UNSIGNED_INT_IMAGE_1D_ARRAY             = 0x9068,
        GL_UNSIGNED_INT_IMAGE_2D_ARRAY             = 0x9069,
        GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY       = 0x906A,
        GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE       = 0x906B,
        GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x906C;

    /** Accepted by the {@code value} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv, and GetTexParameterIuiv. */
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = 0x90C7;

    /**
     * Returned in the {@code data} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv, and GetTexParameterIuiv when {@code value} is
     * IMAGE_FORMAT_COMPATIBILITY_TYPE.
     */
    public static final int
        GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE  = 0x90C8,
        GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 0x90C9;

    protected ARBShaderImageLoadStore() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindImageTexture ] ---

    /**
     * Binds a level of a texture to an image unit.
     *
     * @param unit    the index of the image unit to which to bind the texture
     * @param texture the name of the texture to bind to the image unit
     * @param level   the level of the texture that is to be bound
     * @param layered whether a layered texture binding is to be established
     * @param layer   if {@code layered} is false, specifies the layer of texture to be bound to the image unit. Ignored otherwise.
     * @param access  a token indicating the type of access that will be performed on the image
     * @param format  the format that the elements of the image will be treated as for the purposes of formatted stores
     */
    public static void glBindImageTexture(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int access, @NativeType("GLenum") int format) {
        GL42C.glBindImageTexture(unit, texture, level, layered, layer, access, format);
    }

    // --- [ glMemoryBarrier ] ---

    /**
     * Defines a barrier ordering memory transactions.
     *
     * @param barriers the barriers to insert (bitwise combination). One or more of:<br><table><tr><td>{@link GL42C#GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT VERTEX_ATTRIB_ARRAY_BARRIER_BIT}</td><td>{@link GL42C#GL_ELEMENT_ARRAY_BARRIER_BIT ELEMENT_ARRAY_BARRIER_BIT}</td><td>{@link GL42C#GL_UNIFORM_BARRIER_BIT UNIFORM_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_TEXTURE_FETCH_BARRIER_BIT TEXTURE_FETCH_BARRIER_BIT}</td><td>{@link GL42C#GL_SHADER_IMAGE_ACCESS_BARRIER_BIT SHADER_IMAGE_ACCESS_BARRIER_BIT}</td><td>{@link GL42C#GL_COMMAND_BARRIER_BIT COMMAND_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_PIXEL_BUFFER_BARRIER_BIT PIXEL_BUFFER_BARRIER_BIT}</td><td>{@link GL42C#GL_TEXTURE_UPDATE_BARRIER_BIT TEXTURE_UPDATE_BARRIER_BIT}</td><td>{@link GL42C#GL_BUFFER_UPDATE_BARRIER_BIT BUFFER_UPDATE_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_FRAMEBUFFER_BARRIER_BIT FRAMEBUFFER_BARRIER_BIT}</td><td>{@link GL42C#GL_TRANSFORM_FEEDBACK_BARRIER_BIT TRANSFORM_FEEDBACK_BARRIER_BIT}</td><td>{@link GL42C#GL_ATOMIC_COUNTER_BARRIER_BIT ATOMIC_COUNTER_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_ALL_BARRIER_BITS ALL_BARRIER_BITS}</td><td>{@link GL43#GL_SHADER_STORAGE_BARRIER_BIT SHADER_STORAGE_BARRIER_BIT}</td></tr></table>
     */
    public static void glMemoryBarrier(@NativeType("GLbitfield") int barriers) {
        GL42C.glMemoryBarrier(barriers);
    }

}