/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_barrier.txt">ARB_texture_barrier</a> extension.
 * 
 * <p>This extension relaxes the restrictions on rendering to a currently bound texture and provides a mechanism to avoid read-after-write hazards.</p>
 * 
 * <p>Promoted to core in {@link GL45 OpenGL 4.5}.</p>
 */
public class ARBTextureBarrier {

    static { GL.initialize(); }

    protected ARBTextureBarrier() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTextureBarrier ] ---

    /** Guarantees that writes have completed and caches have been invalidated before subsequent Draws are executed. */
    public static void glTextureBarrier() {
        GL45C.glTextureBarrier();
    }

}