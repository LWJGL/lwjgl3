/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package msdfgen

import org.lwjgl.generator.*

val msdf_shape_handle = "msdf_shape_handle".handle
val msdf_shape_const_handle = "msdf_shape_const_handle".handle

val msdf_contour_handle = "msdf_contour_handle".handle
val msdf_contour_const_handle = "msdf_contour_const_handle".handle

val msdf_segment_handle = "msdf_segment_handle".handle
val msdf_segment_const_handle = "msdf_segment_const_handle".handle

val msdf_ft_handle = "msdf_ft_handle".handle
val msdf_ft_font_handle = "msdf_ft_font_handle".handle

val msdf_range = struct(Module.MSDFGEN, "MSDFGenRange", nativeName = "struct msdf_range") {
    documentation = ""

    double("lower", "the lower bound of this range")
    double("upper", "the upper bound of this range")
}

val msdf_vector2 = struct(Module.MSDFGEN, "MSDFGenVector2", nativeName = "struct msdf_vector2") {
    documentation = ""

    double("x", "the x-coordinate of this vector")
    double("y", "the y-coordinate of this vector")
}

val msdf_bounds = struct(Module.MSDFGEN, "MSDFGenBounds", nativeName = "struct msdf_bounds") {
    documentation = ""

    double("l", "the horizontal starting position of this bounding box")
    double("b", "the vertical starting position of this bounding box")
    double("r", "the horizontal ending position of this bounding box")
    double("t", "the vertical ending position of this bounding box")
}

val msdf_transform = struct(Module.MSDFGEN, "MSDFGenTransform", nativeName = "struct msdf_transform") {
    documentation = ""

    msdf_vector2("scale", "the scale vector of this transform")
    msdf_vector2("translation", "the translation vector of this transform")
    msdf_range("distance_mapping", "the distance mapping of this transform")
}

val msdf_bitmap = struct(Module.MSDFGEN, "MSDFGenBitmap", nativeName = "struct msdf_bitmap") {
    documentation = ""

    int("type", "the type of this bitmap").links("BITMAP_TYPE_\\w+")
    int("width", "the width of this bitmap in pixels")
    int("height", "the height of this bitmap in pixels")
    opaque_p("handle", "the handle of the associated bitmap C++ object")
}

val msdf_config = struct(Module.MSDFGEN, "MSDFGenConfig", nativeName = "struct msdf_config") {
    documentation = ""

    int("overlap_support", "")
}

val msdf_multichannel_config = struct(Module.MSDFGEN, "MSDFGenMultichannelConfig", nativeName = "struct msdf_multichannel_config") {
    documentation = ""

    int("overlap_support", "")
    int("mode", "").links("ERROR_CORRECTION_MODE_\\w+")
    int("distance_check_mode", "").links("DISTANCE_CHECK_MODE_\\w+")
    double("min_deviation_ratio", "")
    double("min_improve_ratio", "")
}

val msdf_ft_load_callback = Module.MSDFGEN.callback {
    opaque_p(
        "MSDFGenFTLoadCallback",
        "",

        charASCII.const.p("name", "")
    ) {
        documentation = "A callback invoked for resolving FreeTypee functions at runtime."
    }
}