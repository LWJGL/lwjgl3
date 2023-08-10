/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_robustness_video_memory_purge.txt">NV_robustness_video_memory_purge</a> extension.
 * 
 * <p>This extension allows applications to be notified when video memory has been purged.</p>
 * 
 * <p>The NVIDIA OpenGL driver architecture on Linux has a limitation: resources located in video memory are not persistent across certain events. VT
 * switches, suspend/resume events, and mode switching events may erase the contents of video memory. Any resource that is located exclusively in video
 * memory, such as framebuffer objects (FBOs), will be lost. As the OpenGL specification makes no mention of events where the video memory is allowed to
 * be cleared, the driver attempts to hide this fact from the application, but cannot do it for all resources.</p>
 * 
 * <p>This extension provides a way for applications to discover when video memory content has been lost, so that the application can re-populate the video
 * memory content as necessary.</p>
 * 
 * <p>This extension will have a limited lifespan, as planned architectural evolutions in the NVIDIA Linux driver stack will allow video memory to be
 * persistent. Any driver that exposes this extension is a driver that considers video memory to be volatile. Once the driver stack has been improved, the
 * extension will no longer be exposed.</p>
 */
public final class NVRobustnessVideoMemoryPurge {

    /** Returned by GetGraphicsResetStatusARB, in addition to other tokens defined in ARB_robustness. */
    public static final int GL_PURGED_CONTEXT_RESET_NV = 0x92BB;

    private NVRobustnessVideoMemoryPurge() {}

}