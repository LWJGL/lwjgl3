/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * The OpenGL functionality up to version 4.2. Includes the deprecated symbols of the Compatibility Profile.
 * 
 * <p>OpenGL 4.2 implementations support revision 4.20 of the OpenGL Shading Language.</p>
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_compression_bptc.txt">ARB_texture_compression_bptc</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_compressed_texture_pixel_storage.txt">ARB_compressed_texture_pixel_storage</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_atomic_counters.txt">ARB_shader_atomic_counters</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_storage.txt">ARB_texture_storage</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_transform_feedback_instanced.txt">ARB_transform_feedback_instanced</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_base_instance.txt">ARB_base_instance</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_image_load_store.txt">ARB_shader_image_load_store</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_conservative_depth.txt">ARB_conservative_depth</a> and <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shading_language_420pack.txt">ARB_shading_language_420pack</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_internalformat_query.txt">ARB_internalformat_query</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_map_buffer_alignment.txt">ARB_map_buffer_alignment</a></li>
 * </ul>
 */
public class GL42 extends GL41 {

    static { GL.initialize(); }

    /** Renamed tokens. */
    public static final int
        GL_COPY_READ_BUFFER_BINDING  = GL31.GL_COPY_READ_BUFFER,
        GL_COPY_WRITE_BUFFER_BINDING = GL31.GL_COPY_WRITE_BUFFER,
        GL_TRANSFORM_FEEDBACK_ACTIVE = GL40.GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE,
        GL_TRANSFORM_FEEDBACK_PAUSED = GL40.GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED;

    /**
     * Accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CopyTexImage2D, CopyTexImage3D, CompressedTexImage2D, and
     * CompressedTexImage3D and the {@code format} parameter of CompressedTexSubImage2D and CompressedTexSubImage3D.
     */
    public static final int
        GL_COMPRESSED_RGBA_BPTC_UNORM         = 0x8E8C,
        GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM   = 0x8E8D,
        GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT   = 0x8E8E,
        GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 0x8E8F;

    /** Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int
        GL_UNPACK_COMPRESSED_BLOCK_WIDTH  = 0x9127,
        GL_UNPACK_COMPRESSED_BLOCK_HEIGHT = 0x9128,
        GL_UNPACK_COMPRESSED_BLOCK_DEPTH  = 0x9129,
        GL_UNPACK_COMPRESSED_BLOCK_SIZE   = 0x912A,
        GL_PACK_COMPRESSED_BLOCK_WIDTH    = 0x912B,
        GL_PACK_COMPRESSED_BLOCK_HEIGHT   = 0x912C,
        GL_PACK_COMPRESSED_BLOCK_DEPTH    = 0x912D,
        GL_PACK_COMPRESSED_BLOCK_SIZE     = 0x912E;

    /** Accepted by the {@code target} parameter of BindBufferBase and BindBufferRange. */
    public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;

    /**
     * Accepted by the {@code pname} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, GetInteger64i_v, GetBooleanv, GetIntegerv,
     * GetInteger64v, GetFloatv, GetDoublev, and GetActiveAtomicCounterBufferiv.
     */
    public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;

    /** Accepted by the {@code pname} parameter of GetIntegeri_64v. */
    public static final int
        GL_ATOMIC_COUNTER_BUFFER_START = 0x92C2,
        GL_ATOMIC_COUNTER_BUFFER_SIZE  = 0x92C3;

    /** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv. */
    public static final int
        GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE                            = 0x92C4,
        GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS               = 0x92C5,
        GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES        = 0x92C6,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER          = 0x92C7,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x92C8,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER        = 0x92CA,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER        = 0x92CB;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int
        GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS          = 0x92CC,
        GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS    = 0x92CD,
        GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE,
        GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS        = 0x92CF,
        GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS        = 0x92D0,
        GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS        = 0x92D1,
        GL_MAX_VERTEX_ATOMIC_COUNTERS                 = 0x92D2,
        GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS           = 0x92D3,
        GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS        = 0x92D4,
        GL_MAX_GEOMETRY_ATOMIC_COUNTERS               = 0x92D5,
        GL_MAX_FRAGMENT_ATOMIC_COUNTERS               = 0x92D6,
        GL_MAX_COMBINED_ATOMIC_COUNTERS               = 0x92D7,
        GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE             = 0x92D8,
        GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS         = 0x92DC;

    /** Accepted by the {@code pname} parameter of GetProgramiv. */
    public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;

    /** Accepted by the {@code pname} parameter of GetActiveUniformsiv. */
    public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;

    /** Returned in {@code params} by GetActiveUniform and GetActiveUniformsiv. */
    public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;

    /** Accepted by the {@code value} parameter of GetTexParameter{if}v. */
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;

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

    /** Accepted by the {@code pname} parameter of GetInternalformativ. */
    public static final int GL_NUM_SAMPLE_COUNTS = 0x9380;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int GL_MIN_MAP_BUFFER_ALIGNMENT = 0x90BC;

    protected GL42() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetActiveAtomicCounterBufferiv ] ---

    /** Unsafe version of: {@link #glGetActiveAtomicCounterBufferiv GetActiveAtomicCounterBufferiv} */
    public static void nglGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, long params) {
        GL42C.nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    /**
     * Obtains information about the set of active atomic counter buffers for a program.
     *
     * @param program     the name of a program object for which the command {@link GL20C#glLinkProgram LinkProgram} has been issued in the past
     * @param bufferIndex the index of an active atomic counter buffer
     * @param pname       the parameter to query. One of:<br><table><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE ATOMIC_COUNTER_BUFFER_DATA_SIZE}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>
     * @param params      a buffer in which to place the returned value
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveAtomicCounterBuffer">Reference Page</a>
     */
    public static void glGetActiveAtomicCounterBufferiv(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL42C.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    /**
     * Obtains information about the set of active atomic counter buffers for a program.
     *
     * @param program     the name of a program object for which the command {@link GL20C#glLinkProgram LinkProgram} has been issued in the past
     * @param bufferIndex the index of an active atomic counter buffer
     * @param pname       the parameter to query. One of:<br><table><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE ATOMIC_COUNTER_BUFFER_DATA_SIZE}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveAtomicCounterBuffer">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetActiveAtomicCounterBufferi(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname) {
        return GL42C.glGetActiveAtomicCounterBufferi(program, bufferIndex, pname);
    }

    // --- [ glTexStorage1D ] ---

    /**
     * Simultaneously specifies storage for all levels of a one-dimensional texture.
     *
     * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     * 
     * @see <a href="https://docs.gl/gl4/glTexStorage1D">Reference Page</a>
     */
    public static void glTexStorage1D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width) {
        GL42C.glTexStorage1D(target, levels, internalformat, width);
    }

    // --- [ glTexStorage2D ] ---

    /**
     * Simultaneously specifies storage for all levels of a two-dimensional or one-dimensional array texture.
     *
     * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     * @param height         the height of the texture, in texels
     * 
     * @see <a href="https://docs.gl/gl4/glTexStorage2D">Reference Page</a>
     */
    public static void glTexStorage2D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL42C.glTexStorage2D(target, levels, internalformat, width, height);
    }

    // --- [ glTexStorage3D ] ---

    /**
     * Simultaneously specifies storage for all levels of a three-dimensional, two-dimensional array or cube-map array texture.
     *
     * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     * @param height         the height of the texture, in texels
     * @param depth          the depth of the texture, in texels
     * 
     * @see <a href="https://docs.gl/gl4/glTexStorage3D">Reference Page</a>
     */
    public static void glTexStorage3D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        GL42C.glTexStorage3D(target, levels, internalformat, width, height, depth);
    }

    // --- [ glDrawTransformFeedbackInstanced ] ---

    /**
     * Renders multiple instances of primitives using a count derived from a transform feedback object.
     *
     * @param mode      what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param id        the name of a transform feedback object from which to retrieve a primitive count
     * @param primcount the number of instances of the geometry to render
     * 
     * @see <a href="https://docs.gl/gl4/glDrawTransformFeedbackInstanced">Reference Page</a>
     */
    public static void glDrawTransformFeedbackInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLsizei") int primcount) {
        GL42C.glDrawTransformFeedbackInstanced(mode, id, primcount);
    }

    // --- [ glDrawTransformFeedbackStreamInstanced ] ---

    /**
     * Renders multiple instances of primitives using a count derived from a specifed stream of a transform feedback object.
     *
     * @param mode      what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param id        the name of a transform feedback object from which to retrieve a primitive count
     * @param stream    the index of the transform feedback stream from which to retrieve a primitive count
     * @param primcount the number of instances of the geometry to render
     * 
     * @see <a href="https://docs.gl/gl4/glDrawTransformFeedbackStreamInstanced">Reference Page</a>
     */
    public static void glDrawTransformFeedbackStreamInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream, @NativeType("GLsizei") int primcount) {
        GL42C.glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
    }

    // --- [ glDrawArraysInstancedBaseInstance ] ---

    /**
     * Draws multiple instances of a range of elements with an offset applied to instanced attributes.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param first        the starting index in the enabled arrays
     * @param count        the number of indices to be rendered
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     * 
     * @see <a href="https://docs.gl/gl4/glDrawArraysInstancedBaseInstance">Reference Page</a>
     */
    public static void glDrawArraysInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
    }

    // --- [ glDrawElementsInstancedBaseInstance ] ---

    /**
     * Unsafe version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance}
     *
     * @param count the number of elements to be rendered
     * @param type  the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     */
    public static void nglDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
        GL42C.nglDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    /**
     * Draws multiple instances of a set of elements with an offset applied to instanced attributes
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param count        the number of elements to be rendered
     * @param type         the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseInstance">Reference Page</a>
     */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    /**
     * Draws multiple instances of a set of elements with an offset applied to instanced attributes
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type         the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseInstance">Reference Page</a>
     */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, type, indices, primcount, baseinstance);
    }

    /**
     * Draws multiple instances of a set of elements with an offset applied to instanced attributes
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseInstance">Reference Page</a>
     */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    /**
     * Draws multiple instances of a set of elements with an offset applied to instanced attributes
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseInstance">Reference Page</a>
     */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    /**
     * Draws multiple instances of a set of elements with an offset applied to instanced attributes
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseInstance">Reference Page</a>
     */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    // --- [ glDrawElementsInstancedBaseVertexBaseInstance ] ---

    /**
     * Unsafe version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}
     *
     * @param count the number of elements to be rendered
     * @param type  the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     */
    public static void nglDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
        GL42C.nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    /**
     * Renders multiple instances of a set of primitives from array data with a per-element offset.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param count        the number of elements to be rendered
     * @param type         the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the indexed geometry that should be drawn
     * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertexBaseInstance">Reference Page</a>
     */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    /**
     * Renders multiple instances of a set of primitives from array data with a per-element offset.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type         the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the indexed geometry that should be drawn
     * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertexBaseInstance">Reference Page</a>
     */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, type, indices, primcount, basevertex, baseinstance);
    }

    /**
     * Renders multiple instances of a set of primitives from array data with a per-element offset.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the indexed geometry that should be drawn
     * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertexBaseInstance">Reference Page</a>
     */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    /**
     * Renders multiple instances of a set of primitives from array data with a per-element offset.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the indexed geometry that should be drawn
     * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertexBaseInstance">Reference Page</a>
     */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    /**
     * Renders multiple instances of a set of primitives from array data with a per-element offset.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the indexed geometry that should be drawn
     * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstancedBaseVertexBaseInstance">Reference Page</a>
     */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
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
     * 
     * @see <a href="https://docs.gl/gl4/glBindImageTexture">Reference Page</a>
     */
    public static void glBindImageTexture(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int access, @NativeType("GLenum") int format) {
        GL42C.glBindImageTexture(unit, texture, level, layered, layer, access, format);
    }

    // --- [ glMemoryBarrier ] ---

    /**
     * Defines a barrier ordering memory transactions.
     *
     * @param barriers the barriers to insert (bitwise combination). One or more of:<br><table><tr><td>{@link GL42C#GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT VERTEX_ATTRIB_ARRAY_BARRIER_BIT}</td><td>{@link GL42C#GL_ELEMENT_ARRAY_BARRIER_BIT ELEMENT_ARRAY_BARRIER_BIT}</td><td>{@link GL42C#GL_UNIFORM_BARRIER_BIT UNIFORM_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_TEXTURE_FETCH_BARRIER_BIT TEXTURE_FETCH_BARRIER_BIT}</td><td>{@link GL42C#GL_SHADER_IMAGE_ACCESS_BARRIER_BIT SHADER_IMAGE_ACCESS_BARRIER_BIT}</td><td>{@link GL42C#GL_COMMAND_BARRIER_BIT COMMAND_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_PIXEL_BUFFER_BARRIER_BIT PIXEL_BUFFER_BARRIER_BIT}</td><td>{@link GL42C#GL_TEXTURE_UPDATE_BARRIER_BIT TEXTURE_UPDATE_BARRIER_BIT}</td><td>{@link GL42C#GL_BUFFER_UPDATE_BARRIER_BIT BUFFER_UPDATE_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_FRAMEBUFFER_BARRIER_BIT FRAMEBUFFER_BARRIER_BIT}</td><td>{@link GL42C#GL_TRANSFORM_FEEDBACK_BARRIER_BIT TRANSFORM_FEEDBACK_BARRIER_BIT}</td><td>{@link GL42C#GL_ATOMIC_COUNTER_BARRIER_BIT ATOMIC_COUNTER_BARRIER_BIT}</td></tr><tr><td>{@link GL42C#GL_ALL_BARRIER_BITS ALL_BARRIER_BITS}</td><td>{@link GL43#GL_SHADER_STORAGE_BARRIER_BIT SHADER_STORAGE_BARRIER_BIT}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glMemoryBarrier">Reference Page</a>
     */
    public static void glMemoryBarrier(@NativeType("GLbitfield") int barriers) {
        GL42C.glMemoryBarrier(barriers);
    }

    // --- [ glGetInternalformativ ] ---

    /**
     * Unsafe version of: {@link #glGetInternalformativ GetInternalformativ}
     *
     * @param bufSize the maximum number of values that may be written to params by the function
     */
    public static void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
        GL42C.nglGetInternalformativ(target, internalformat, pname, bufSize, params);
    }

    /**
     * Retrieves information about implementation-dependent support for internal formats.
     *
     * @param target         the usage of the internal format. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
     * @param internalformat the internal format about which to retrieve information
     * @param pname          the type of information to query
     * @param params         a variable into which to write the retrieved information
     * 
     * @see <a href="https://docs.gl/gl4/glGetInternalformat">Reference Page</a>
     */
    public static void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL42C.glGetInternalformativ(target, internalformat, pname, params);
    }

    /**
     * Retrieves information about implementation-dependent support for internal formats.
     *
     * @param target         the usage of the internal format. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
     * @param internalformat the internal format about which to retrieve information
     * @param pname          the type of information to query
     * 
     * @see <a href="https://docs.gl/gl4/glGetInternalformat">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetInternalformati(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname) {
        return GL42C.glGetInternalformati(target, internalformat, pname);
    }

    /**
     * Array version of: {@link #glGetActiveAtomicCounterBufferiv GetActiveAtomicCounterBufferiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveAtomicCounterBuffer">Reference Page</a>
     */
    public static void glGetActiveAtomicCounterBufferiv(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL42C.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    /**
     * Array version of: {@link #glGetInternalformativ GetInternalformativ}
     * 
     * @see <a href="https://docs.gl/gl4/glGetInternalformat">Reference Page</a>
     */
    public static void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL42C.glGetInternalformativ(target, internalformat, pname, params);
    }

}