/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.bgfx.templates

import org.lwjgl.bgfx.*
import org.lwjgl.generator.*

val BGFXPlatform = "BGFXPlatform".nativeClass(packageName = BGFX_PACKAGE, prefix = "BGFX", prefixMethod = "bgfx_", binding = BGFX_BINDING_DELEGATE) {
    documentation =
        """
        Native bindings to the C platform API of the ${url("https://github.com/bkaradzic/bgfx", "bgfx")} library.
        """

    EnumConstant(
        "Render frame. ({@code bgfx_renderer_frame_t})",

        "RENDER_FRAME_NO_CONTEXT".enum,
        "RENDER_FRAME_RENDER".enum,
        "RENDER_FRAME_TIMEOUT".enum,
        "RENDER_FRAME_EXITING".enum,

        "RENDER_FRAME_COUNT".enum
    )

    bgfx_renderer_frame_t(
        "render_frame",
        """
        Render frame.

        This call should be only used on platforms that don't allow creating separate rendering thread. If it is called before to #init(), render thread won't
        be created by #init() call.
        """,

        returnDoc = "current renderer state"
    )

    void(
        "set_platform_data",
        """
        Sets platform data.

        Must be called before #init().
        """,

        const..bgfx_platform_data_t_p.IN("_data", "the platform data to set")
    )

    const..bgfx_internal_data_t_p(
        "get_internal_data",
        "Gets internal data for interop."
    )

    uintptr_t(
        "override_internal_texture_ptr",
        """
        Overrides internal texture with externally created texture. Previously created internal texture will released.

        It's expected you understand some bgfx internals before you use this call.

        Must be called only on render thread.
        """,

        bgfx_texture_handle_t.IN("_handle", "texture handle"),
        uintptr_t.IN("_ptr", "native API pointer to texture"),

        returnDoc = "native API pointer to texture. If result is 0, texture is not created yet from the main thread."
    )

    uintptr_t(
        "override_internal_texture",
        """
        Overrides internal texture by creating new texture. Previously created internal texture will released.

        It's expected you understand some bgfx internals before you use this call.

        Must be called only on render thread.
        """,

        bgfx_texture_handle_t.IN("_handle", "texture handle"),
        MapToInt..uint16_t.IN("_width", "width"),
        MapToInt..uint16_t.IN("_height", "height"),
        MapToInt..uint8_t.IN("_numMips", "number of mip-maps"),
        bgfx_texture_format_t.IN("_format", "texture format"),
        uint32_t.IN("_flags", "default texture sampling mode is linear, and wrap mode is repeat"),

        returnDoc = "native API pointer to texture. If result is 0, texture is not created yet from the main thread."
    )
}