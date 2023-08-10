/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/WGL_ARB_render_texture.txt">WGL_ARB_render_texture</a> extension.
 * 
 * <p>This extension allows a color buffer to be used for both rendering and texturing. When a color buffer is bound to a texture target it cannot be
 * rendered to. Once it has been released from the texture it can be  rendered to once again.</p>
 * 
 * <p>This extension may provide a performance boost and reduce memory requirements on architectures that support rendering to the same memory where textures
 * reside and in the same memory format and layout required by texturing. The functionality is similar to CopyTexImage1D and CopyTexImage2D. However, some
 * changes were made to make it easier to avoid copying data:</p>
 * 
 * <ul>
 * <li>Only color buffers of a pbuffer can be bound as a texture. It is not possible to use the color buffer of a window as a texture.</li>
 * <li>The texture internal format is determined when the color buffer is associated with the texture, guaranteeing that the color buffer format is
 * equivalent to the texture internal format.</li>
 * <li>When a color buffer of a pbuffer is being used as a texture, the pbuffer can not be used for rendering; this makes it easier for implementations to
 * avoid a copy of the image since the semantics of the pointer swap are clear.</li>
 * <li>The application must release the color buffer from the texture before it can render to the pbuffer again. When the color buffer is bound as a
 * texture, draw and read operations on the pbuffer are undefined.</li>
 * <li>A mipmap attribute can be set, in which case memory will be allocated up front for mipmaps. The application can render the mipmap images or, if
 * <a href="https://www.khronos.org/registry/OpenGL/extensions/SGIS/SGIS_generate_mipmap.txt">SGIS_generate_mipmap</a> is supported, they can be automatically generated when the color buffer is bound as a texture.</li>
 * <li>A texture target is associated with the pbuffer, so that cubemap images can be rendered into a single color buffer.</li>
 * </ul>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string}, {@link WGLARBPixelFormat WGL_ARB_pixel_format}, {@link WGLARBPbuffer WGL_ARB_pbuffer}.</p>
 */
public class WGLARBRenderTexture {

    /**
     * Accepted by the {@code attributes} parameter of {@link WGLARBPixelFormat#wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB}, and the {@code attribIList} parameters of
     * {@link WGLARBPixelFormat#wglChoosePixelFormatARB ChoosePixelFormatARB}.
     */
    public static final int
        WGL_BIND_TO_TEXTURE_RGB_ARB  = 0x2070,
        WGL_BIND_TO_TEXTURE_RGBA_ARB = 0x2071;

    /** Accepted by the {@code attribList} parameter of {@link WGLARBPbuffer#wglCreatePbufferARB CreatePbufferARB} and by the {@code attribute} parameter of {@link WGLARBPbuffer#wglQueryPbufferARB QueryPbufferARB}. */
    public static final int
        WGL_TEXTURE_FORMAT_ARB = 0x2072,
        WGL_TEXTURE_TARGET_ARB = 0x2073,
        WGL_MIPMAP_TEXTURE_ARB = 0x2074;

    /**
     * Accepted as a value in the {@code attribList} parameter of {@link WGLARBPbuffer#wglCreatePbufferARB CreatePbufferARB} and returned in the value parameter of {@link WGLARBPbuffer#wglQueryPbufferARB QueryPbufferARB} when
     * {@code attribute} is {@link #WGL_TEXTURE_FORMAT_ARB TEXTURE_FORMAT_ARB}.
     */
    public static final int
        WGL_TEXTURE_RGB_ARB  = 0x2075,
        WGL_TEXTURE_RGBA_ARB = 0x2076,
        WGL_NO_TEXTURE_ARB   = 0x2077;

    /**
     * Accepted as a value in the {@code attribList} parameter of {@link WGLARBPbuffer#wglCreatePbufferARB CreatePbufferARB} and returned in the value parameter of {@link WGLARBPbuffer#wglQueryPbufferARB QueryPbufferARB} when
     * {@code attribute} is {@link #WGL_TEXTURE_TARGET_ARB TEXTURE_TARGET_ARB}.
     */
    public static final int
        WGL_TEXTURE_CUBE_MAP_ARB = 0x2078,
        WGL_TEXTURE_1D_ARB       = 0x2079,
        WGL_TEXTURE_2D_ARB       = 0x207A;

    /** Accepted by the {@code attribList} parameter of {@link #wglSetPbufferAttribARB SetPbufferAttribARB} and by the {@code attribute} parameter of {@link WGLARBPbuffer#wglQueryPbufferARB QueryPbufferARB}. */
    public static final int
        WGL_MIPMAP_LEVEL_ARB  = 0x207B,
        WGL_CUBE_MAP_FACE_ARB = 0x207C;

    /**
     * Accepted as a value in the {@code attribList} parameter of {@link #wglSetPbufferAttribARB SetPbufferAttribARB} and returned in the value parameter of {@link WGLARBPbuffer#wglQueryPbufferARB QueryPbufferARB} when
     * {@code attribute} is {@link #WGL_CUBE_MAP_FACE_ARB CUBE_MAP_FACE_ARB}.
     */
    public static final int
        WGL_TEXTURE_CUBE_MAP_POSITIVE_X_ARB = 0x207D,
        WGL_TEXTURE_CUBE_MAP_NEGATIVE_X_ARB = 0x207E,
        WGL_TEXTURE_CUBE_MAP_POSITIVE_Y_ARB = 0x207F,
        WGL_TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB = 0x2080,
        WGL_TEXTURE_CUBE_MAP_POSITIVE_Z_ARB = 0x2081,
        WGL_TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB = 0x2082;

    /** Accepted by the {@code buffer} parameter of {@link #wglBindTexImageARB BindTexImageARB} and {@link #wglReleaseTexImageARB ReleaseTexImageARB}. */
    public static final int
        WGL_FRONT_LEFT_ARB  = 0x2083,
        WGL_FRONT_RIGHT_ARB = 0x2084,
        WGL_BACK_LEFT_ARB   = 0x2085,
        WGL_BACK_RIGHT_ARB  = 0x2086,
        WGL_AUX0_ARB        = 0x2087,
        WGL_AUX1_ARB        = 0x2088,
        WGL_AUX2_ARB        = 0x2089,
        WGL_AUX3_ARB        = 0x208A,
        WGL_AUX4_ARB        = 0x208B,
        WGL_AUX5_ARB        = 0x208C,
        WGL_AUX6_ARB        = 0x208D,
        WGL_AUX7_ARB        = 0x208E,
        WGL_AUX8_ARB        = 0x208F,
        WGL_AUX9_ARB        = 0x2090;

    protected WGLARBRenderTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglBindTexImageARB ] ---

    /**
     * Defines a one-dimensional texture image or two-dimensional texture image or a set of two-dimensional cube map texture images. The texture image or
     * images consist of the image data in {@code buffer} for the specified {@code pbuffer} and need not be copied. The texture target, the texture format and
     * the size of the  texture components are derived from attributes of pbuffer  specified by {@code pbuffer}.
     *
     * @param pbuffer a pbuffer handle
     * @param buffer  the target buffer. One of:<br><table><tr><td>{@link #WGL_FRONT_LEFT_ARB FRONT_LEFT_ARB}</td><td>{@link #WGL_FRONT_RIGHT_ARB FRONT_RIGHT_ARB}</td><td>{@link #WGL_BACK_LEFT_ARB BACK_LEFT_ARB}</td><td>{@link #WGL_BACK_RIGHT_ARB BACK_RIGHT_ARB}</td><td>{@link #WGL_AUX0_ARB AUX0_ARB}</td><td>WGL_AUX[1-9]_ARB</td></tr></table>
     */
    @NativeType("BOOL")
    public static boolean wglBindTexImageARB(@NativeType("HPBUFFERARB") long pbuffer, int buffer) {
        long __functionAddress = GL.getCapabilitiesWGL().wglBindTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPI(pbuffer, buffer, __functionAddress) != 0;
    }

    // --- [ wglReleaseTexImageARB ] ---

    /**
     * Releases the specified color buffer back to the pbuffer. The pbuffer is made available for reading and writing when it no longer has any color buffers
     * bound as textures.
     *
     * @param pbuffer a pbuffer handle
     * @param buffer  the target buffer. One of:<br><table><tr><td>{@link #WGL_FRONT_LEFT_ARB FRONT_LEFT_ARB}</td><td>{@link #WGL_FRONT_RIGHT_ARB FRONT_RIGHT_ARB}</td><td>{@link #WGL_BACK_LEFT_ARB BACK_LEFT_ARB}</td><td>{@link #WGL_BACK_RIGHT_ARB BACK_RIGHT_ARB}</td><td>{@link #WGL_AUX0_ARB AUX0_ARB}</td><td>WGL_AUX[1-9]_ARB</td></tr></table>
     */
    @NativeType("BOOL")
    public static boolean wglReleaseTexImageARB(@NativeType("HPBUFFERARB") long pbuffer, int buffer) {
        long __functionAddress = GL.getCapabilitiesWGL().wglReleaseTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPI(pbuffer, buffer, __functionAddress) != 0;
    }

    // --- [ wglSetPbufferAttribARB ] ---

    /** Unsafe version of: {@link #wglSetPbufferAttribARB SetPbufferAttribARB} */
    public static int nwglSetPbufferAttribARB(long pbuffer, long attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglSetPbufferAttribARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPPI(pbuffer, attribList, __functionAddress);
    }

    /**
     * Sets an attribute to the specified pbuffer.
     *
     * @param pbuffer    a pbuffer handle
     * @param attribList a 0-terminated list of attribute {type, value} pairs containing integer values
     */
    @NativeType("BOOL")
    public static boolean wglSetPbufferAttribARB(@NativeType("HPBUFFERARB") long pbuffer, @Nullable @NativeType("int const *") IntBuffer attribList) {
        if (CHECKS) {
            checkNTSafe(attribList);
        }
        return nwglSetPbufferAttribARB(pbuffer, memAddressSafe(attribList)) != 0;
    }

    /** Array version of: {@link #wglSetPbufferAttribARB SetPbufferAttribARB} */
    @NativeType("BOOL")
    public static boolean wglSetPbufferAttribARB(@NativeType("HPBUFFERARB") long pbuffer, @Nullable @NativeType("int const *") int[] attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglSetPbufferAttribARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
            checkNTSafe(attribList);
        }
        return callPPI(pbuffer, attribList, __functionAddress) != 0;
    }

}