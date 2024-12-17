/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bgfx.templates

import bgfx.*
import org.lwjgl.generator.*

val BGFXPlatform = "BGFXPlatform".nativeClass(Module.BGFX, prefix = "BGFX", prefixMethod = "bgfx_", binding = BGFX_BINDING_DELEGATE) {
    EnumConstant(
        "RENDER_FRAME_NO_CONTEXT".enum,
        "RENDER_FRAME_RENDER".enum,
        "RENDER_FRAME_TIMEOUT".enum,
        "RENDER_FRAME_EXITING".enum,

        "RENDER_FRAME_COUNT".enum
    )

    bgfx_render_frame_t(
        "render_frame",

        int32_t("_msecs")
    )

    void(
        "set_platform_data",

        bgfx_platform_data_t.const.p("_data")
    )

    bgfx_internal_data_t.const.p(
        "get_internal_data",
        void()
    )

    uintptr_t(
        "override_internal_texture_ptr",

        bgfx_texture_handle_t("_handle"),
        uintptr_t("_ptr")
    )

    uintptr_t(
        "override_internal_texture",

        bgfx_texture_handle_t("_handle"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        MapToInt..uint8_t("_numMips"),
        bgfx_texture_format_t("_format"),
        uint64_t("_flags")
    )
}