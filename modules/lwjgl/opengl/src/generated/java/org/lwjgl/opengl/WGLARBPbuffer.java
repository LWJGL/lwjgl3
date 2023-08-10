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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/WGL_ARB_pbuffer.txt">WGL_ARB_pbuffer</a> extension.
 * 
 * <p>This extension defines pixel buffers (pbuffer for short). Pbuffers are additional non-visible rendering buffers for an OpenGL renderer. Pbuffers are
 * equivalent to a window that has the same pixel format descriptor with the following exceptions:</p>
 * 
 * <ol>
 * <li>There is no rendering to a pbuffer by GDI.</li>
 * <li>The pixel format descriptors used for a pbuffer can only be those that are supported by the ICD.  Generic formats are not valid.</li>
 * <li>The allocation of a pbuffer can fail if there are insufficient resources (i.e., all the pbuffer memory has been allocated).</li>
 * <li>The pixel buffer might be lost if a display mode change occurs. A query is provided that can be called after a display mode change to determine the
 * state of the pixel buffer.</li>
 * </ol>
 * 
 * <p>The intent of the pbuffer semantics is to enable implementations to allocate pbuffers in non-visible frame buffer memory. These pbuffers are intended to
 * be "static" resources in that a program will typically allocate them only once rather than as a part of its rendering loop.  (Pbuffers should be
 * deallocated when the program is no longer using them -- for example, if the program is iconified.)</p>
 * 
 * <p>The frame buffer resources that are associated with a pbuffer are also static and are deallocated when the pbuffer is destroyed or possibly when a
 * display mode change occurs.</p>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string} and {@link WGLARBPixelFormat WGL_ARB_pixel_format}.</p>
 */
public class WGLARBPbuffer {

    /**
     * Accepted by the {@code attribIList} parameter of {@link WGLARBPixelFormat#wglChoosePixelFormatARB ChoosePixelFormatARB} and the {@code attributes} parameter of
     * {@link WGLARBPixelFormat#wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB}.
     */
    public static final int WGL_DRAW_TO_PBUFFER_ARB = 0x202D;

    /** Accepted by the {@code attributes} parameter of {@link WGLARBPixelFormat#wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB}. */
    public static final int
        WGL_MAX_PBUFFER_PIXELS_ARB = 0x202E,
        WGL_MAX_PBUFFER_WIDTH_ARB  = 0x202F,
        WGL_MAX_PBUFFER_HEIGHT_ARB = 0x2030;

    /** Accepted by the {@code attribList} parameter of {@link #wglCreatePbufferARB CreatePbufferARB}. */
    public static final int WGL_PBUFFER_LARGEST_ARB = 0x2033;

    /** Accepted by the {@code attribute} parameter of {@link #wglQueryPbufferARB QueryPbufferARB}. */
    public static final int
        WGL_PBUFFER_WIDTH_ARB  = 0x2034,
        WGL_PBUFFER_HEIGHT_ARB = 0x2035,
        WGL_PBUFFER_LOST_ARB   = 0x2036;

    protected WGLARBPbuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglCreatePbufferARB ] ---

    /** Unsafe version of: {@link #wglCreatePbufferARB CreatePbufferARB} */
    public static long nwglCreatePbufferARB(long hdc, int pixelFormat, int width, int height, long attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreatePbufferARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
        }
        return callPPP(hdc, pixelFormat, width, height, attribList, __functionAddress);
    }

    /**
     * Creates a pixel buffer (pbuffer) and returns a handle to it.
     * 
     * <p>Support for pbuffers may be restricted to specific pixel formats. Use {@link WGLARBPixelFormat#wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB} to query the {@link #WGL_DRAW_TO_PBUFFER_ARB DRAW_TO_PBUFFER_ARB}
     * attribute to determine which pixel formats support the creation of pbuffers.</p>
     *
     * @param hdc         a device context for the device on which the pbuffer is created
     * @param pixelFormat a non-generic pixel format descriptor index
     * @param width       the pixel width of the rectangular pbuffer
     * @param height      the pixel height of the rectangular pbuffer
     * @param attribList  a 0-terminated list of attributes {type, value} pairs containing integer attribute values
     */
    @NativeType("HPBUFFERARB")
    public static long wglCreatePbufferARB(@NativeType("HDC") long hdc, int pixelFormat, int width, int height, @Nullable @NativeType("int const *") IntBuffer attribList) {
        if (CHECKS) {
            checkNTSafe(attribList);
        }
        return nwglCreatePbufferARB(hdc, pixelFormat, width, height, memAddressSafe(attribList));
    }

    // --- [ wglGetPbufferDCARB ] ---

    /**
     * Creates a device context for the pbuffer.
     *
     * @param pbuffer a pbuffer handle returned from a previous call to {@link #wglCreatePbufferARB CreatePbufferARB}
     */
    @NativeType("HDC")
    public static long wglGetPbufferDCARB(@NativeType("HPBUFFERARB") long pbuffer) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetPbufferDCARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPP(pbuffer, __functionAddress);
    }

    // --- [ wglReleasePbufferDCARB ] ---

    /**
     * Releases a device context obtained from a previous call to {@link #wglGetPbufferDCARB GetPbufferDCARB}.
     *
     * @param pbuffer a pbuffer handle
     * @param hdc     a device context handle
     */
    public static int wglReleasePbufferDCARB(@NativeType("HPBUFFERARB") long pbuffer, @NativeType("HDC") long hdc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglReleasePbufferDCARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
            check(hdc);
        }
        return callPPI(pbuffer, hdc, __functionAddress);
    }

    // --- [ wglDestroyPbufferARB ] ---

    /**
     * Destroys a pbuffer.
     * 
     * <p>The pbuffer is destroyed once it is no longer current to any rendering context.  When a pbuffer is destroyed, any memory resources that are attached to
     * it are freed and its handle is no longer valid.</p>
     *
     * @param pbuffer a pbuffer handle
     */
    @NativeType("BOOL")
    public static boolean wglDestroyPbufferARB(@NativeType("HPBUFFERARB") long pbuffer) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDestroyPbufferARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPI(pbuffer, __functionAddress) != 0;
    }

    // --- [ wglQueryPbufferARB ] ---

    /** Unsafe version of: {@link #wglQueryPbufferARB QueryPbufferARB} */
    public static int nwglQueryPbufferARB(long pbuffer, int attribute, long value) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQueryPbufferARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPPI(pbuffer, attribute, value, __functionAddress);
    }

    /**
     * Queries an attribute associated with a specific pbuffer.
     *
     * @param pbuffer   a pbuffer handle
     * @param attribute the attribute to query. One of:<br><table><tr><td>{@link #WGL_PBUFFER_WIDTH_ARB PBUFFER_WIDTH_ARB}</td><td>{@link #WGL_PBUFFER_HEIGHT_ARB PBUFFER_HEIGHT_ARB}</td><td>{@link #WGL_PBUFFER_LOST_ARB PBUFFER_LOST_ARB}</td></tr></table>
     * @param value     the attribute value
     */
    @NativeType("BOOL")
    public static boolean wglQueryPbufferARB(@NativeType("HPBUFFERARB") long pbuffer, int attribute, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nwglQueryPbufferARB(pbuffer, attribute, memAddress(value)) != 0;
    }

    /** Array version of: {@link #wglCreatePbufferARB CreatePbufferARB} */
    @NativeType("HPBUFFERARB")
    public static long wglCreatePbufferARB(@NativeType("HDC") long hdc, int pixelFormat, int width, int height, @Nullable @NativeType("int const *") int[] attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreatePbufferARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
            checkNTSafe(attribList);
        }
        return callPPP(hdc, pixelFormat, width, height, attribList, __functionAddress);
    }

    /** Array version of: {@link #wglQueryPbufferARB QueryPbufferARB} */
    @NativeType("BOOL")
    public static boolean wglQueryPbufferARB(@NativeType("HPBUFFERARB") long pbuffer, int attribute, @NativeType("int *") int[] value) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQueryPbufferARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
            check(value, 1);
        }
        return callPPI(pbuffer, attribute, value, __functionAddress) != 0;
    }

}