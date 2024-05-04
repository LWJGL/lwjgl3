/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package msdfgen

import org.lwjgl.generator.*

val msdf_allocator_alloc_callback = Module.MSDFGEN.callback {
    void.p(
        "MSDFGenAllocatorAllocCallback",
        "",
        size_t("size", "The size of the block of memory to allocate in bytes.")
    ) {
        documentation = "A pointer to a function used as allocation callback by the internal allocator."
    }
}

val msdf_allocator_realloc_callback = Module.MSDFGEN.callback {
    void.p(
        "MSDFGenAllocatorReallocCallback",
        "",
        void.p("memory", "The address of the block of memory to reallocate."),
        size_t("size", "The new size of the block of memory after reallocation in bytes.")
    ) {
        documentation = "Reallocates a given block of memory to fit at least the given number of bytes."
    }
}

val msdf_allocator_free_callback = Module.MSDFGEN.callback {
    void.p(
        "MSDFGenAllocatorFreeCallback",
        "",
        void.p("memory", "The address of the block of memory to free.")
    ) {
        documentation = "Frees the given block of memory."
    }
}

val msdf_allocator = struct(Module.MSDFGEN, "MSDFGenAllocator", nativeName = "struct msdf_allocator") {
    documentation = ""

    msdf_allocator_alloc_callback("alloc_callback", "")
    msdf_allocator_realloc_callback("realloc_callback", "")
    msdf_allocator_free_callback("free_callback", "")
}

val msdf_range = struct(Module.MSDFGEN, "MSDFGenRange", nativeName = "struct msdf_range") {
    documentation = ""

    double("lower", "The lower bound of this range.")
    double("upper", "The upper bound of this range.")
}

val msdf_vector2 = struct(Module.MSDFGEN, "MSDFGenVector2", nativeName = "struct msdf_vector2") {
    documentation = ""

    double("x", "The x-coordinate of this vector.")
    double("y", "The y-coordinate of this vector.")
}

val msdf_bounds = struct(Module.MSDFGEN, "MSDFGenBounds", nativeName = "struct msdf_bounds") {
    documentation = ""

    double("l", "The horizontal starting position of this bounding box.")
    double("b", "The vertical starting position of this bounding box.")
    double("r", "The horizontal ending position of this bounding box.")
    double("t", "The vertical ending position of this bounding box.")
}

val msdf_transform = struct(Module.MSDFGEN, "MSDFGenTransform", nativeName = "struct msdf_transform") {
    documentation = ""

    msdf_vector2("scale", "The scale vector of this transform.")
    msdf_vector2("translation", "The translation vector of this transform.")
    msdf_range("distance_mapping", "The distance mapping of this transform.")
}

val msdf_bitmap = struct(Module.MSDFGEN, "MSDFGenBitmap", nativeName = "struct msdf_bitmap") {
    documentation = ""

    int("type", "The type of this bitmap. Can be MSDF_BITMAP_TYPE_SDF, MSDF_BITMAP_TYPE_PSDF, MSDF_BITMAP_TYPE_MSDF or MSDF_BITMAP_TYPE_MTSDF.")
    int("width", "The width of this bitmap in pixels.")
    int("height", "The height of this bitmap in pixels.")
    void.p("handle", "The handle of the associated bitmap C++ object.")
}

val msdf_config = struct(Module.MSDFGEN, "MSDFGenConfig", nativeName = "struct msdf_config") {
    documentation = ""

    int("overlap_support", "")
}

val msdf_multichannel_config = struct(Module.MSDFGEN, "MSDFGenMultichannelConfig", nativeName = "struct msdf_multichannel_config") {
    documentation = ""

    int("overlap_support", "")
    int("mode", "")
    int("distance_check_mode", "")
    double("min_deviation_ratio", "")
    double("min_improve_ratio", "")
}

val msdf_shape_handle = typedef(void.p, "msdf_shape_handle")
val msdf_shape_const_handle = typedef(void.const.p, "msdf_shape_const_handle")

val msdf_contour_handle = typedef(void.p, "msdf_contour_handle")
val msdf_contour_const_handle = typedef(void.const.p, "msdf_contour_const_handle")

val msdf_segment_handle = typedef(void.p, "msdf_segment_handle")
val msdf_segment_const_handle = typedef(void.const.p, "msdf_segment_const_handle")