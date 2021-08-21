/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

val int32_tb = PrimitiveType("int32_t", PrimitiveMapping.BOOLEAN4)
val ViewId = typedef(uint16_t, "bgfx_view_id_t")
val TextureHandle = typedef(uint16_t, "bgfx_texture_handle_t")
val AllocatorI = "bgfx_allocator_interface_t".opaque.p

val NVGLUframebufferBGFX = struct(Module.NANOVG, "NVGLUFramebufferBGFX", nativeName = "NVGLUframebuffer", mutable = false) {
    documentation = "A framebuffer object."

    NVGcontext.p("ctx", "")
    typedef(uint16_t, "bgfx_frame_buffer_handle_t")("handle", "")
    int("image", "")
    ViewId("viewId", "")
}