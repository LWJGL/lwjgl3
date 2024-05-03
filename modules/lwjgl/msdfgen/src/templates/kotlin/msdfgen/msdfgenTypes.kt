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
        size_t("size", "")
    ) {
        documentation = ""
    }
}

val msdf_allocator_realloc_callback = Module.MSDFGEN.callback {
    void.p(
        "MSDFGenAllocatorReallocCallback",
        "",
        void.p("memory", ""),
        size_t("size", "")
    ) {
        documentation = ""
    }
}

val msdf_allocator_free_callback = Module.MSDFGEN.callback {
    void.p(
        "MSDFGenAllocatorFreeCallback",
        "",
        void.p("memory", "")
    ) {
        documentation = ""
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

    double("lower", "")
    double("upper", "")
}

val msdf_vector2 = struct(Module.MSDFGEN, "MSDFGenVector2", nativeName = "struct msdf_vector2") {
    documentation = ""

    double("x", "")
    double("y", "")
}

val msdf_bounds = struct(Module.MSDFGEN, "MSDFGenBounds", nativeName = "struct msdf_bounds") {
    documentation = ""

    double("l", "")
    double("b", "")
    double("r", "")
    double("t", "")
}

val msdf_transform = struct(Module.MSDFGEN, "MSDFGenTransform", nativeName = "struct msdf_transform") {
    documentation = ""

    msdf_vector2("scale", "")
    msdf_vector2("translation", "")
    msdf_range("distance_mapping", "")
}

val msdf_bitmap = struct(Module.MSDFGEN, "MSDFGenBitmap", nativeName = "struct msdf_bitmap") {
    documentation = ""

    int("type", "")
    int("width", "")
    int("height", "")
    void.p("handle", "")
}

val msdf_segment = struct(Module.MSDFGEN, "MSDFGenSegment", nativeName = "struct msdf_segment") {
    documentation = ""

    int("type", "")
    void.p("handle", "")
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
val msdf_contour_handle = typedef(void.p, "msdf_contour_handle")
val msdf_edge_holder_handle = typedef(void.p, "msdf_edge_holder_handle")