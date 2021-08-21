/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg.templates

import org.lwjgl.generator.*
import nanovg.*
import java.io.*

val nanovg_bgfx = "NanoVGBGFX".dependsOn(Module.BGFX)?.nativeClass(Module.NANOVG, prefix = "NVG", binding = object : SimpleBinding(Module.NANOVG, "BGFX.getLibrary()") {
    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        generateFunctionsClass(nativeClass, "\n$t/** Contains the function pointers loaded from bgfx. */")
    }
}) {
    documentation = "Implementation of the NanoVG API using bgfx."

    javaImport("static org.lwjgl.nanovg.NanoVG.*")

    NVGcontext.p(
        "Create",
        "",

        int32_tb("_edgeaa", ""),
        MapToInt..ViewId("_viewId", ""),
        nullable..AllocatorI("_allocator", "")
    )

    void(
        "Delete",
        "",

        NVGcontext.p("_ctx", "")
    )

    void(
        "SetViewId",
        "",

        NVGcontext.p("_ctx", ""),
        MapToInt..ViewId("_viewId", "")
    )

    uint16_t(
        "GetViewId",
        "",

        NVGcontext.p("_ctx", "")
    )

    NVGLUframebufferBGFX.p(
        "luCreateFramebuffer",
        "",

        NVGcontext.p("_ctx", ""),
        int32_t("_width", ""),
        int32_t("_height", ""),
        int32_t("imageFlags", "")
    )

    void(
        "luBindFramebuffer",
        "",

        Input..nullable..NVGLUframebufferBGFX.p("_framebuffer", "")
    )

    void(
        "luDeleteFramebuffer",
        "",

        Input..NVGLUframebufferBGFX.p("_framebuffer", "")
    )

    void(
        "luSetViewFramebuffer",
        "",

        MapToInt..ViewId("_view_id", ""),
        Input..NVGLUframebufferBGFX.p("_framebuffer", "")
    )

    void(
        "CreateBgfxTexture",
        "",

        NVGcontext.p("_ctx", ""),
        TextureHandle("_id", ""),
        int("_width", ""),
        int("_height", ""),
        int("flags", "")
    )

    // BGFX/NanoVG integration
    // 1. Make the bgfx back-end use LWJGL's allocation functions, which are also internally used by NanoVG.
    // 2. Pass NanoVG's internal functions to the bgfx back-end.

    private..void(
        "org_lwjgl_nanovg_setup",
        "",

        opaque_p("realloc", ""),
        opaque_p("free", ""),
        opaque_p("nvgCreateInternal", ""),
        opaque_p("nvgInternalParams", ""),
        opaque_p("nvgDeleteInternal", ""),

        noPrefix = true
    )

    customMethod("""
    static {
        MemoryAllocator allocator = getAllocator(Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.get(true));
        org_lwjgl_nanovg_setup(
            allocator.getRealloc(),
            allocator.getFree(),
            nvgCreateInternal,
            nvgInternalParams,
            nvgDeleteInternal
        );
    }""")

    customMethod("""
    private static class BGFX {
        private static final SharedLibrary library;

        static {
            try {
                library = (SharedLibrary)Class.forName("org.lwjgl.bgfx.BGFX").getMethod("getLibrary").invoke(null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        static SharedLibrary getLibrary() {
            return library;
        }
    }
    """)
}