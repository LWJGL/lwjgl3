/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*

val ARB_get_texture_sub_image = "ARBGetTextureSubImage".nativeClassGL("ARB_get_texture_sub_image") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a new function to get sub-regions of texture images.

        Requires ${GL20.core}. ${GL45.promoted}
        """

    GL45C reuse "GetTextureSubImage"
    GL45C reuse "GetCompressedTextureSubImage"
}