/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_pixel_local_storage.txt">EXT_shader_pixel_local_storage</a> extension.
 * 
 * <p>Techniques such as deferred shading and deferred lighting are often implemented by attaching multiple color render targets to a framebuffer object,
 * rendering the required intermediate data, and then sampling from this data as textures. While flexible, this approach consumes a large amount of
 * external memory bandwidth, which is at a premium on mobile devices.</p>
 * 
 * <p>Observing that the intermediate or "G-buffer" data is often only written to and read by shaders executing for the same pixel position, tile-based
 * renderers can offer a more efficient alternative by keeping the data on-GPU. This allows large amounts of data to be kept per-pixel, with zero external
 * memory bandwidth impact.</p>
 * 
 * <p>This extension provides a way for applications to pass information between fragment shader invocations covering the same pixel by introducing the
 * concept of pixel local storage. Pixel local storage is an on-chip memory storage that can be efficiently accessed by fragments being processed by the
 * GL. The format of data stored in the pixel local storage is independent of the format of the currently attached framebuffer. The data in pixel local
 * storage is not written back to main memory. Access to pixel local storage is controlled via glEnable and glDisable. If commands that implicitly or
 * explicitly flush the GL command stream are issued when pixel local storage is enabled then the contents of the pixel local storage becomes undefined
 * for subsequent commands.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public final class EXTShaderPixelLocalStorage {

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetInteger64v, or GetFloatv. */
    public static final int
        GL_MAX_SHADER_PIXEL_LOCAL_STORAGE_FAST_SIZE_EXT = 0x8F63,
        GL_MAX_SHADER_PIXEL_LOCAL_STORAGE_SIZE_EXT      = 0x8F67;

    /** Accepted by the {@code pname} parameters of IsEnabled, GetBooleanv, GetIntegerv, GetInteger64v, or GetFloatv. */
    public static final int GL_SHADER_PIXEL_LOCAL_STORAGE_EXT = 0x8F64;

    private EXTShaderPixelLocalStorage() {}

}