/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_draw_vulkan_image.txt">NV_draw_vulkan_image</a> extension.
 * 
 * <p>This extension provides a new function, {@link #glDrawVkImageNV DrawVkImageNV}, allowing applications to draw a screen-aligned rectangle displaying some or all of the
 * contents of a two-dimensional Vulkan VkImage. Callers specify a Vulkan {@code VkImage} handle, an optional OpenGL sampler object, window coordinates of
 * the rectangle to draw, and texture coordinates corresponding to the corners of the rectangle. For each fragment produced by the rectangle,
 * {@code DrawVkImageNV} interpolates the texture coordinates, performs a texture lookup, and uses the texture result as the fragment color.</p>
 * 
 * <p>No shaders are used by {@code DrawVkImageNV}; the results of the texture lookup are used in lieu of a fragment shader output. The fragments generated
 * are processed by all per-fragment operations. In particular, {@code DrawVkImageNV()} fully supports blending and multisampling.</p>
 * 
 * <p>In order to synchronize between Vulkan and OpenGL there are three other functions provided; {@link #glWaitVkSemaphoreNV WaitVkSemaphoreNV}, {@link #glSignalVkSemaphoreNV SignalVkSemaphoreNV} and
 * {@link #glSignalVkFenceNV SignalVkFenceNV}. These allow OpenGL to wait for Vulkan to complete work and also Vulkan to wait for OpenGL to complete work. Together OpenGL and
 * Vulkan can synchronize on the server without application interation.</p>
 * 
 * <p>Finally the function {@code GetVkProcAddrNV()} is provided to allow the OpenGL context to query the Vulkan entry points directly and avoid having to
 * load them through the typical Vulkan loader.</p>
 */
public class NVDrawVulkanImage {

    static { GL.initialize(); }

    protected NVDrawVulkanImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawVkImageNV ] ---

    /**
     * Draws a screen-aligned rectangle displaying a portion of the contents of the Vulkan {@code VkImage}.
     *
     * @param vkImage the Vulkan image handle
     * @param sampler an optional sampler object
     * @param x0      the rectangle left window coordinate
     * @param y0      the rectangle bottom window coordinate
     * @param x1      the rectangle right window coordinate
     * @param y1      the rectangle top window coordinate
     * @param z       the Z window coordinate
     * @param s0      the left texture coordinate
     * @param t0      the bottom texture coordinate
     * @param s1      the right texture coordinate
     * @param t1      the top texture coordinate
     */
    public static native void glDrawVkImageNV(@NativeType("GLuint64") long vkImage, @NativeType("GLuint") int sampler, @NativeType("GLfloat") float x0, @NativeType("GLfloat") float y0, @NativeType("GLfloat") float x1, @NativeType("GLfloat") float y1, @NativeType("GLfloat") float z, @NativeType("GLfloat") float s0, @NativeType("GLfloat") float t0, @NativeType("GLfloat") float s1, @NativeType("GLfloat") float t1);

    // --- [ glGetVkProcAddrNV ] ---

    /** Unsafe version of: {@link #glGetVkProcAddrNV GetVkProcAddrNV} */
    public static native long nglGetVkProcAddrNV(long name);

    /**
     * Queries the Vulkan function entry points from within an OpenGL context.
     *
     * @param name name of the Vulkan function
     */
    @NativeType("VULKANPROCNV")
    public static long glGetVkProcAddrNV(@NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetVkProcAddrNV(memAddress(name));
    }

    /**
     * Queries the Vulkan function entry points from within an OpenGL context.
     *
     * @param name name of the Vulkan function
     */
    @NativeType("VULKANPROCNV")
    public static long glGetVkProcAddrNV(@NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetVkProcAddrNV(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glWaitVkSemaphoreNV ] ---

    /**
     * Causes the GL server to block until the Vulkan {@code VkSemaphore} is signalled. No GL commands after this command are executed by the server until the
     * semaphore is signaled.
     *
     * @param vkSemaphore a valid Vulkan {@code VkSemaphore} non-dispatchable handle otherwise the operation is undefined
     */
    public static native void glWaitVkSemaphoreNV(@NativeType("GLuint64") long vkSemaphore);

    // --- [ glSignalVkSemaphoreNV ] ---

    /**
     * Causes the GL server to signal the Vulkan {@code VkSemaphore} when it executes this command. The semaphore is not signalled by GL until all commands
     * issued before this have completed execution on the GL server.
     *
     * @param vkSemaphore a valid Vulkan {@code VkSemaphore} non-dispatchable handle otherwise the operation is undefined
     */
    public static native void glSignalVkSemaphoreNV(@NativeType("GLuint64") long vkSemaphore);

    // --- [ glSignalVkFenceNV ] ---

    /**
     * Causes the GL server to signal the Vulkan {@code VkFence} object when it executes this command. The fence is not signalled by the GL until all commands
     * issued before this have completed execution on the GL server.
     *
     * @param vkFence a valid Vulkan VkFence non-dispatcable handle otherwise the operation is undefined
     */
    public static native void glSignalVkFenceNV(@NativeType("GLuint64") long vkFence);

}