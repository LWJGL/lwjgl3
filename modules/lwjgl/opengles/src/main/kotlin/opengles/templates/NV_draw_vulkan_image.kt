/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_draw_vulkan_image = "NVDrawVulkanImage".nativeClassGLES("NV_draw_vulkan_image", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a new function, #DrawVkImageNV(), allowing applications to draw a screen-aligned rectangle displaying some or all of the
        contents of a two-dimensional Vulkan VkImage. Callers specify a Vulkan {@code VkImage} handle, an optional OpenGL sampler object, window coordinates of
        the rectangle to draw, and texture coordinates corresponding to the corners of the rectangle. For each fragment produced by the rectangle,
        {@code DrawVkImageNV} interpolates the texture coordinates, performs a texture lookup, and uses the texture result as the fragment color.

        No shaders are used by {@code DrawVkImageNV}; the results of the texture lookup are used in lieu of a fragment shader output. The fragments generated
        are processed by all per-fragment operations. In particular, {@code DrawVkImageNV()} fully supports blending and multisampling.

        In order to synchronize between Vulkan and OpenGL there are three other functions provided; #WaitVkSemaphoreNV(), #SignalVkSemaphoreNV() and
        #SignalVkFenceNV(). These allow OpenGL to wait for Vulkan to complete work and also Vulkan to wait for OpenGL to complete work. Together OpenGL and
        Vulkan can synchronize on the server without application interation.

        Finally the function {@code GetVkProcAddrNV()} is provided to allow the OpenGL context to query the Vulkan entry points directly and avoid having to
        load them through the typical Vulkan loader.
        """

    void(
        "DrawVkImageNV",
        "Draws a screen-aligned rectangle displaying a portion of the contents of the Vulkan {@code VkImage}.",

        GLuint64.IN("vkImage", "the Vulkan image handle"),
        GLuint.IN("sampler", "an optional sampler object"),
        GLfloat.IN("x0", "the rectangle left window coordinate"),
        GLfloat.IN("y0", "the rectangle bottom window coordinate"),
        GLfloat.IN("x1", "the rectangle right window coordinate"),
        GLfloat.IN("y1", "the rectangle top window coordinate"),
        GLfloat.IN("z", "the Z window coordinate"),
        GLfloat.IN("s0", "the left texture coordinate"),
        GLfloat.IN("t0", "the bottom texture coordinate"),
        GLfloat.IN("s1", "the right texture coordinate"),
        GLfloat.IN("t1", "the top texture coordinate")
    )

    VULKANPROCNV(
        "GetVkProcAddrNV",
        "Queries the Vulkan function entry points from within an OpenGL context.",

        const..GLcharASCII_p.IN("name", "name of the Vulkan function")
    )

    void(
        "WaitVkSemaphoreNV",
        """
        Causes the GL server to block until the Vulkan {@code VkSemaphore} is signalled. No GL commands after this command are executed by the server until the
        semaphore is signaled.
        """,

        GLuint64.IN("vkSemaphore", "a valid Vulkan {@code VkSemaphore} non-dispatchable handle otherwise the operation is undefined")
    )

    void(
        "SignalVkSemaphoreNV",
        """
        Causes the GL server to signal the Vulkan {@code VkSemaphore} when it executes this command. The semaphore is not signalled by GL until all commands
        issued before this have completed execution on the GL server.
        """,

        GLuint64.IN("vkSemaphore", "a valid Vulkan {@code VkSemaphore} non-dispatchable handle otherwise the operation is undefined")
    )

    void(
        "SignalVkFenceNV",
        """
        Causes the GL server to signal the Vulkan {@code VkFence} object when it executes this command. The fence is not signalled by the GL until all commands
        issued before this have completed execution on the GL server.
        """,

        GLuint64.IN("vkFence", "a valid Vulkan VkFence non-dispatcable handle otherwise the operation is undefined")
    )
}