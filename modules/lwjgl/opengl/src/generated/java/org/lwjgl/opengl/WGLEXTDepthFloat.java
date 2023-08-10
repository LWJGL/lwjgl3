/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/WGL_EXT_depth_float.txt">WGL_EXT_depth_float</a> extension.
 * 
 * <p>For perspective scenes, the density of objects (vertices) increases as the distance from the eye increases. For a linear depth buffer, this means that
 * objects (vertices) are sparse for a large portion of the depth range and are dense for a small portion of the depth buffer.</p>
 * 
 * <p>This behavior is obvious if you consider standing in a boat looking at the shore. The near objects include only the boat while the far objects include
 * the entire shoreline which may include an entire city.</p>
 * 
 * <p>A non-linear (floating-point) depth buffer helps this problem. If the near clipping plane is set to 1.0, and the far clipping plane is set to 0.0, a
 * much greater resolution of objects can occur.</p>
 */
public final class WGLEXTDepthFloat {

    /** Accepted by the {@code attribute} parameter of wglGetPixelFormatAttribivEXT, wglGetPixelFormatAttribfvEXT, and wglChoosePixelFormatExEXT. */
    public static final int WGL_DEPTH_FLOAT_EXT = 0x2040;

    private WGLEXTDepthFloat() {}

}