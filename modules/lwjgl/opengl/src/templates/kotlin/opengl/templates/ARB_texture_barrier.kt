/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*

val ARB_texture_barrier = "ARBTextureBarrier".nativeClassGL("ARB_texture_barrier") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension relaxes the restrictions on rendering to a currently bound texture and provides a mechanism to avoid read-after-write hazards.

        ${GL45.promoted}
        """

    GL45C reuse "TextureBarrier"
}