/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_barrier.txt">NV_texture_barrier</a> extension.
 * 
 * <p>This extension relaxes the restrictions on rendering to a currently bound texture and provides a mechanism to avoid read-after-write hazards.</p>
 */
public class NVTextureBarrier {

    static { GL.initialize(); }

    protected NVTextureBarrier() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTextureBarrierNV ] ---

    /** Guarantees that writes have completed and caches have been invalidated before subsequent Draws are executed. */
    public static native void glTextureBarrierNV();

}