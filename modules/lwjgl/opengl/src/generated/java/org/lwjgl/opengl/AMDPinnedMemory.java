/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_pinned_memory.txt">AMD_pinned_memory</a> extension.
 * 
 * <p>This extension defines an interface that allows improved control of the physical memory used by the graphics device.</p>
 * 
 * <p>It allows an existing page of system memory allocated by the application to be used as memory directly accessible to the graphics processor. One
 * example application of this functionality would be to be able to avoid an explicit synchronous copy with sub-system of the application; for instance it
 * is possible to directly draw from a system memory copy of a video image.</p>
 */
public final class AMDPinnedMemory {

    public static final int GL_EXTERNAL_VIRTUAL_MEMORY_BUFFER_AMD = 0x9160;

    private AMDPinnedMemory() {}

}