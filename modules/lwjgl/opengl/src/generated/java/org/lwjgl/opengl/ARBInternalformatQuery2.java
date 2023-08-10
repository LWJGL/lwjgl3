/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_internalformat_query2.txt">ARB_internalformat_query2</a> extension.
 * 
 * <p>This extension extends the {@link ARBInternalformatQuery#glGetInternalformativ GetInternalformativ} query that was added in the {@link ARBInternalformatQuery ARB_internalformat_query} extension to
 * provide applications with more granular per-format capability information.</p>
 * 
 * <p>This extension allows the remainder of the texture-style targets to be specified along with any possible internal format. We add queries for additional
 * properties supported for an internal format in addition to the multisample-related information that was added in ARB_internalformat_query.</p>
 * 
 * <p>The goals of this extension are to:</p>
 * 
 * <ol type=a>
 * <li>provide a mechanism for implementations to declare support *above* the minimum required by the specification</li>
 * <li>provide API to allow universally constant information to be queried</li>
 * <li>provide a user-friendly way of finding out about version- or implementation-specific limitations.</li>
 * </ol>
 * 
 * <p>While much of this information can be determined for a single GL version by careful examination of the specification, support for many of these
 * properties has been gradually introduced over a number of API revisions. This can observed when considering the range in functionality between the
 * various versions of GL 2, 3, and 4, as well as GL ES 2 and 3.</p>
 * 
 * <p>In the case of an application which wishes to be scalable and able to run on a variety of possible GL or GL ES versions without being specifically
 * tailored for each version, it must either have knowledge of the specifications built up into either the code or tables, or it must do a number of tests
 * on startup to determine which capabilities are present.</p>
 * 
 * <p>In OpenGL, other than the course-grained extension mechanism, many limitations of, or limited support for, an internalformat can only be signaled by
 * failing an operation or by operating at reduced performance. Thus, such tests often involve attempts to create resources, using them in specific ways
 * and benchmarking the operations to find out if it is supported in the desired form, and at a required performance level. The extension provides a way
 * for these properties and caveats to be directly queried from the implementation.</p>
 * 
 * <p>This extension is NOT intended to allow implementations to only support a subset of features that are required by a specific GL version, nor is it
 * intended to replace the proper use of extension checks for optional functionality.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} and {@link ARBInternalformatQuery ARB_internalformat_query}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public class ARBInternalformatQuery2 {

    static { GL.initialize(); }

    /** Accepted by the {@code target} parameter of GetInternalformativ and GetInternalformati64v. */
    public static final int
        GL_TEXTURE_1D                   = 0xDE0,
        GL_TEXTURE_1D_ARRAY             = 0x8C18,
        GL_TEXTURE_2D                   = 0xDE1,
        GL_TEXTURE_2D_ARRAY             = 0x8C1A,
        GL_TEXTURE_3D                   = 0x806F,
        GL_TEXTURE_CUBE_MAP             = 0x8513,
        GL_TEXTURE_CUBE_MAP_ARRAY       = 0x9009,
        GL_TEXTURE_RECTANGLE            = 0x84F5,
        GL_TEXTURE_BUFFER               = 0x8C2A,
        GL_RENDERBUFFER                 = 0x8D41,
        GL_TEXTURE_2D_MULTISAMPLE       = 0x9100,
        GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;

    /** Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v. */
    public static final int
        GL_SAMPLES                                = 0x80A9,
        GL_NUM_SAMPLE_COUNTS                      = 0x9380,
        GL_INTERNALFORMAT_SUPPORTED               = 0x826F,
        GL_INTERNALFORMAT_PREFERRED               = 0x8270,
        GL_INTERNALFORMAT_RED_SIZE                = 0x8271,
        GL_INTERNALFORMAT_GREEN_SIZE              = 0x8272,
        GL_INTERNALFORMAT_BLUE_SIZE               = 0x8273,
        GL_INTERNALFORMAT_ALPHA_SIZE              = 0x8274,
        GL_INTERNALFORMAT_DEPTH_SIZE              = 0x8275,
        GL_INTERNALFORMAT_STENCIL_SIZE            = 0x8276,
        GL_INTERNALFORMAT_SHARED_SIZE             = 0x8277,
        GL_INTERNALFORMAT_RED_TYPE                = 0x8278,
        GL_INTERNALFORMAT_GREEN_TYPE              = 0x8279,
        GL_INTERNALFORMAT_BLUE_TYPE               = 0x827A,
        GL_INTERNALFORMAT_ALPHA_TYPE              = 0x827B,
        GL_INTERNALFORMAT_DEPTH_TYPE              = 0x827C,
        GL_INTERNALFORMAT_STENCIL_TYPE            = 0x827D,
        GL_MAX_WIDTH                              = 0x827E,
        GL_MAX_HEIGHT                             = 0x827F,
        GL_MAX_DEPTH                              = 0x8280,
        GL_MAX_LAYERS                             = 0x8281,
        GL_MAX_COMBINED_DIMENSIONS                = 0x8282,
        GL_COLOR_COMPONENTS                       = 0x8283,
        GL_DEPTH_COMPONENTS                       = 0x8284,
        GL_STENCIL_COMPONENTS                     = 0x8285,
        GL_COLOR_RENDERABLE                       = 0x8286,
        GL_DEPTH_RENDERABLE                       = 0x8287,
        GL_STENCIL_RENDERABLE                     = 0x8288,
        GL_FRAMEBUFFER_RENDERABLE                 = 0x8289,
        GL_FRAMEBUFFER_RENDERABLE_LAYERED         = 0x828A,
        GL_FRAMEBUFFER_BLEND                      = 0x828B,
        GL_READ_PIXELS                            = 0x828C,
        GL_READ_PIXELS_FORMAT                     = 0x828D,
        GL_READ_PIXELS_TYPE                       = 0x828E,
        GL_TEXTURE_IMAGE_FORMAT                   = 0x828F,
        GL_TEXTURE_IMAGE_TYPE                     = 0x8290,
        GL_GET_TEXTURE_IMAGE_FORMAT               = 0x8291,
        GL_GET_TEXTURE_IMAGE_TYPE                 = 0x8292,
        GL_MIPMAP                                 = 0x8293,
        GL_MANUAL_GENERATE_MIPMAP                 = 0x8294,
        GL_AUTO_GENERATE_MIPMAP                   = 0x8295,
        GL_COLOR_ENCODING                         = 0x8296,
        GL_SRGB_READ                              = 0x8297,
        GL_SRGB_WRITE                             = 0x8298,
        GL_SRGB_DECODE_ARB                        = 0x8299,
        GL_FILTER                                 = 0x829A,
        GL_VERTEX_TEXTURE                         = 0x829B,
        GL_TESS_CONTROL_TEXTURE                   = 0x829C,
        GL_TESS_EVALUATION_TEXTURE                = 0x829D,
        GL_GEOMETRY_TEXTURE                       = 0x829E,
        GL_FRAGMENT_TEXTURE                       = 0x829F,
        GL_COMPUTE_TEXTURE                        = 0x82A0,
        GL_TEXTURE_SHADOW                         = 0x82A1,
        GL_TEXTURE_GATHER                         = 0x82A2,
        GL_TEXTURE_GATHER_SHADOW                  = 0x82A3,
        GL_SHADER_IMAGE_LOAD                      = 0x82A4,
        GL_SHADER_IMAGE_STORE                     = 0x82A5,
        GL_SHADER_IMAGE_ATOMIC                    = 0x82A6,
        GL_IMAGE_TEXEL_SIZE                       = 0x82A7,
        GL_IMAGE_COMPATIBILITY_CLASS              = 0x82A8,
        GL_IMAGE_PIXEL_FORMAT                     = 0x82A9,
        GL_IMAGE_PIXEL_TYPE                       = 0x82AA,
        GL_IMAGE_FORMAT_COMPATIBILITY_TYPE        = 0x90C7,
        GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST    = 0x82AC,
        GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST  = 0x82AD,
        GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE   = 0x82AE,
        GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 0x82AF,
        GL_TEXTURE_COMPRESSED                     = 0x86A1,
        GL_TEXTURE_COMPRESSED_BLOCK_WIDTH         = 0x82B1,
        GL_TEXTURE_COMPRESSED_BLOCK_HEIGHT        = 0x82B2,
        GL_TEXTURE_COMPRESSED_BLOCK_SIZE          = 0x82B3,
        GL_CLEAR_BUFFER                           = 0x82B4,
        GL_TEXTURE_VIEW                           = 0x82B5,
        GL_VIEW_COMPATIBILITY_CLASS               = 0x82B6;

    /** Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v. */
    public static final int
        GL_FULL_SUPPORT              = 0x82B7,
        GL_CAVEAT_SUPPORT            = 0x82B8,
        GL_IMAGE_CLASS_4_X_32        = 0x82B9,
        GL_IMAGE_CLASS_2_X_32        = 0x82BA,
        GL_IMAGE_CLASS_1_X_32        = 0x82BB,
        GL_IMAGE_CLASS_4_X_16        = 0x82BC,
        GL_IMAGE_CLASS_2_X_16        = 0x82BD,
        GL_IMAGE_CLASS_1_X_16        = 0x82BE,
        GL_IMAGE_CLASS_4_X_8         = 0x82BF,
        GL_IMAGE_CLASS_2_X_8         = 0x82C0,
        GL_IMAGE_CLASS_1_X_8         = 0x82C1,
        GL_IMAGE_CLASS_11_11_10      = 0x82C2,
        GL_IMAGE_CLASS_10_10_10_2    = 0x82C3,
        GL_VIEW_CLASS_128_BITS       = 0x82C4,
        GL_VIEW_CLASS_96_BITS        = 0x82C5,
        GL_VIEW_CLASS_64_BITS        = 0x82C6,
        GL_VIEW_CLASS_48_BITS        = 0x82C7,
        GL_VIEW_CLASS_32_BITS        = 0x82C8,
        GL_VIEW_CLASS_24_BITS        = 0x82C9,
        GL_VIEW_CLASS_16_BITS        = 0x82CA,
        GL_VIEW_CLASS_8_BITS         = 0x82CB,
        GL_VIEW_CLASS_S3TC_DXT1_RGB  = 0x82CC,
        GL_VIEW_CLASS_S3TC_DXT1_RGBA = 0x82CD,
        GL_VIEW_CLASS_S3TC_DXT3_RGBA = 0x82CE,
        GL_VIEW_CLASS_S3TC_DXT5_RGBA = 0x82CF,
        GL_VIEW_CLASS_RGTC1_RED      = 0x82D0,
        GL_VIEW_CLASS_RGTC2_RG       = 0x82D1,
        GL_VIEW_CLASS_BPTC_UNORM     = 0x82D2,
        GL_VIEW_CLASS_BPTC_FLOAT     = 0x82D3;

    protected ARBInternalformatQuery2() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetInternalformati64v ] ---

    /**
     * Unsafe version of: {@link #glGetInternalformati64v GetInternalformati64v}
     *
     * @param bufSize the maximum number of values that may be written to params by the function
     */
    public static void nglGetInternalformati64v(int target, int internalformat, int pname, int bufSize, long params) {
        GL43C.nglGetInternalformati64v(target, internalformat, pname, bufSize, params);
    }

    /**
     * Retrieves information about implementation-dependent support for internal formats.
     *
     * @param target         the usage of the internal format. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
     * @param internalformat the internal format about which to retrieve information
     * @param pname          the type of information to query
     * @param params         a variable into which to write the retrieved information
     */
    public static void glGetInternalformati64v(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        GL43C.glGetInternalformati64v(target, internalformat, pname, params);
    }

    /**
     * Retrieves information about implementation-dependent support for internal formats.
     *
     * @param target         the usage of the internal format. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
     * @param internalformat the internal format about which to retrieve information
     * @param pname          the type of information to query
     */
    @NativeType("void")
    public static long glGetInternalformati64(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname) {
        return GL43C.glGetInternalformati64(target, internalformat, pname);
    }

    /** Array version of: {@link #glGetInternalformati64v GetInternalformati64v} */
    public static void glGetInternalformati64v(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        GL43C.glGetInternalformati64v(target, internalformat, pname, params);
    }

}