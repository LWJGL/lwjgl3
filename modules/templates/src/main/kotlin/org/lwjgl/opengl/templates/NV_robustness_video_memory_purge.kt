/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_robustness_video_memory_purge = "NVRobustnessVideoMemoryPurge".nativeClassGL("NV_robustness_video_memory_purge", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows applications to be notified when video memory has been purged.

        The NVIDIA OpenGL driver architecture on Linux has a limitation: resources located in video memory are not persistent across certain events. VT
        switches, suspend/resume events, and mode switching events may erase the contents of video memory. Any resource that is located exclusively in video
        memory, such as framebuffer objects (FBOs), will be lost. As the OpenGL specification makes no mention of events where the video memory is allowed to
        be cleared, the driver attempts to hide this fact from the application, but cannot do it for all resources.

        This extension provides a way for applications to discover when video memory content has been lost, so that the application can re-populate the video
        memory content as necessary.

        This extension will have a limited lifespan, as planned architectural evolutions in the NVIDIA Linux driver stack will allow video memory to be
        persistent. Any driver that exposes this extension is a driver that considers video memory to be volatile. Once the driver stack has been improved, the
        extension will no longer be exposed.
        """

    IntConstant(
        "Returned by GetGraphicsResetStatusARB, in addition to other tokens defined in ARB_robustness.",

        "PURGED_CONTEXT_RESET_NV"..0x92BB
    )
}

val GLX_NV_robustness_video_memory_purge = "GLXNVRobustnessVideoMemoryPurge".nativeClassGLX("GLX_NV_robustness_video_memory_purge", postfix = NV) {
    documentation =
        """
        Native bindings to the ${registryLinkTo("NV", "robustness_video_memory_purge", "GLX_NV_robustness_video_memory_purge")} extension.

        GLX functionality for ${NV_robustness_video_memory_purge.link}.
        """

    IntConstant(
        "Accepted as an attribute name in the {@code *attrib_list} argument of glXCreateContextAttribsARB.",

        "GENERATE_RESET_ON_VIDEO_MEMORY_PURGE_NV"..0x20F7
    )
}