/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/WGL_ARB_buffer_region.txt">WGL_ARB_buffer_region</a> extension.
 * 
 * <p>The buffer region extension is a mechanism that allows an area of an OpenGL window to be saved in off-screen memory for quick restores. The off-screen
 * memory can either be frame buffer memory or system memory, although frame buffer memory might offer optimal performance.</p>
 * 
 * <p>A buffer region can be created for the front color, back color, depth, and/or stencil buffer.  Multiple buffer regions for the same buffer type can
 * exist.</p>
 */
public class WGLARBBufferRegion {

    /** Accepted by the {@code type} parameter of {@link #wglCreateBufferRegionARB CreateBufferRegionARB}. */
    public static final int
        WGL_FRONT_COLOR_BUFFER_BIT_ARB = 0x1,
        WGL_BACK_COLOR_BUFFER_BIT_ARB  = 0x2,
        WGL_DEPTH_BUFFER_BIT_ARB       = 0x4,
        WGL_STENCIL_BUFFER_BIT_ARB     = 0x8;

    protected WGLARBBufferRegion() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglCreateBufferRegionARB ] ---

    /**
     * Creates a buffer region and returns a handle associated with it.
     *
     * @param hdc        the device context for the device on which the buffer region is created
     * @param layerPlane the layer plane. Positive values identify overlay planes, negative values identify underlay planes. A value of 0 identifies the main plane.
     * @param type       a bitwise OR of any of the following values indicating which buffers can be saved or restored.  Multiple bits can be set and may result in better
     *                   performance if multiple buffers are saved or restored. One of:<br><table><tr><td>{@link #WGL_FRONT_COLOR_BUFFER_BIT_ARB FRONT_COLOR_BUFFER_BIT_ARB}</td><td>{@link #WGL_BACK_COLOR_BUFFER_BIT_ARB BACK_COLOR_BUFFER_BIT_ARB}</td><td>{@link #WGL_DEPTH_BUFFER_BIT_ARB DEPTH_BUFFER_BIT_ARB}</td></tr><tr><td>{@link #WGL_STENCIL_BUFFER_BIT_ARB STENCIL_BUFFER_BIT_ARB}</td></tr></table>
     */
    @NativeType("HANDLE")
    public static long wglCreateBufferRegionARB(@NativeType("HDC") long hdc, int layerPlane, @NativeType("UINT") int type) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateBufferRegionARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
        }
        return callPP(hdc, layerPlane, type, __functionAddress);
    }

    // --- [ wglDeleteBufferRegionARB ] ---

    /**
     * Deletes a buffer region.
     *
     * @param region a handle to a buffer region previously created with {@link #wglCreateBufferRegionARB CreateBufferRegionARB}.
     */
    @NativeType("VOID")
    public static void wglDeleteBufferRegionARB(@NativeType("HANDLE") long region) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDeleteBufferRegionARB;
        if (CHECKS) {
            check(__functionAddress);
            check(region);
        }
        callPV(region, __functionAddress);
    }

    // --- [ wglSaveBufferRegionARB ] ---

    /**
     * Saves image, depth, and stencil data into the buffer region.
     * 
     * <p>Data outside the window for the specified rectangle is undefined. The OpenGL coordinate system is used for specifying the rectangle ({@code x} and
     * {@code y} specify the lower-left corner of the rectangle).</p>
     * 
     * <p>If an RC is current to the calling thread, a flush will occur before the save operation.</p>
     * 
     * <p>The saved buffer region area can be freed by calling {@code wglSaveBufferRegionARB} with {@code width} or {@code height} set to a value of 0.</p>
     *
     * @param region a handle to a buffer region previously created with {@link #wglCreateBufferRegionARB CreateBufferRegionARB}.
     * @param x      the window x-coordinate for the source rectangle
     * @param y      the window y-coordinate for the source rectangle
     * @param width  the source rectangle width
     * @param height the source rectangle height
     */
    @NativeType("BOOL")
    public static boolean wglSaveBufferRegionARB(@NativeType("HANDLE") long region, int x, int y, int width, int height) {
        long __functionAddress = GL.getCapabilitiesWGL().wglSaveBufferRegionARB;
        if (CHECKS) {
            check(__functionAddress);
            check(region);
        }
        return callPI(region, x, y, width, height, __functionAddress) != 0;
    }

    // --- [ wglRestoreBufferRegionARB ] ---

    /**
     * Restores a previously saved buffer region.
     *
     * @param region a handle to a buffer region previously created with {@link #wglCreateBufferRegionARB CreateBufferRegionARB}.
     * @param x      the window x-coordinate for the destination rectangle
     * @param y      the window y-coordinate for the destination rectangle
     * @param width  the destination rectangle width
     * @param height the destination rectangle height
     * @param xSrc   the buffer region x-coordinate for the source of the data
     * @param ySrc   the buffer region y-coordinate for the source of the data
     */
    @NativeType("BOOL")
    public static boolean wglRestoreBufferRegionARB(@NativeType("HANDLE") long region, int x, int y, int width, int height, int xSrc, int ySrc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglRestoreBufferRegionARB;
        if (CHECKS) {
            check(__functionAddress);
            check(region);
        }
        return callPI(region, x, y, width, height, xSrc, ySrc, __functionAddress) != 0;
    }

}