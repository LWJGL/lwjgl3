/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_barrier.txt">NV_texture_barrier</a> extension.
 * 
 * <p>This extension relaxes the restrictions on rendering to a currently bound texture and provides a mechanism to avoid read-after-write hazards.</p>
 */
public class NVTextureBarrier {

    static { GLES.initialize(); }

    protected NVTextureBarrier() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLESCapabilities caps) {
        return checkFunctions(
            caps.glTextureBarrierNV
        );
    }

    // --- [ glTextureBarrierNV ] ---

    /** Guarantees that writes have completed and caches have been invalidated before subsequent Draws are executed. */
    public static native void glTextureBarrierNV();

}