/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bgfx.templates

import bgfx.*
import org.lwjgl.generator.*

val BGFXPlatform = "BGFXPlatform".nativeClass(Module.BGFX, prefix = "BGFX", prefixMethod = "bgfx_", binding = BGFX_BINDING_DELEGATE) {
    documentation =
        """
        Native bindings to the C platform API of the ${url("https://github.com/bkaradzic/bgfx", "bgfx")} library.
        """

    val RenderFrame = EnumConstant(
        "Render frame. ({@code bgfx_renderer_frame_t})",

        "RENDER_FRAME_NO_CONTEXT".enum,
        "RENDER_FRAME_RENDER".enum,
        "RENDER_FRAME_TIMEOUT".enum,
        "RENDER_FRAME_EXITING".enum,

        "RENDER_FRAME_COUNT".enum
    ).javaDocLinks

    bgfx_renderer_frame_t(
        "render_frame",
        """
        Render frame.

        {@code bgfx_render_frame} is blocking call. It waits for #frame() to be called from API thread to process frame. If timeout value is passed call will
        timeout and return even if {@code bgfx_frame} is not called.

        This call should be only used on platforms that don't allow creating separate rendering thread. If it is called before to #init(), render thread won't
        be created by #init() call.
        """,

        int32_t.IN("_msecs", "timeout in milliseconds"),

        returnDoc = "current renderer state. One of: $RenderFrame"
    )

    void(
        "set_platform_data",
        """
        Sets platform data.

        Must be called before #init().
        """,

        bgfx_platform_data_t.const.p.IN("_data", "the platform data to set")
    )

    bgfx_internal_data_t.const.p(
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