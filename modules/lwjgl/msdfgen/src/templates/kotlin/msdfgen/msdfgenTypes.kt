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
    double("lower")
    double("upper")
}

val msdf_vector2 = struct(Module.MSDFGEN, "MSDFGenVector2", nativeName = "struct msdf_vector2") {
    double("x")
    double("y")
}

val msdf_bounds = struct(Module.MSDFGEN, "MSDFGenBounds", nativeName = "struct msdf_bounds") {
    double("l")
    double("b")
    double("r")
    double("t")
}

val msdf_transform = struct(Module.MSDFGEN, "MSDFGenTransform", nativeName = "struct msdf_transform") {
    msdf_vector2("scale")
    msdf_vector2("translation")
    msdf_range("distance_mapping")
}

val msdf_bitmap = struct(Module.MSDFGEN, "MSDFGenBitmap", nativeName = "struct msdf_bitmap") {
    int("type")
    int("width")
    int("height")
    opaque_p("handle")
}

val msdf_config = struct(Module.MSDFGEN, "MSDFGenConfig", nativeName = "struct msdf_config") {
    int("overlap_support")
}

val msdf_multichannel_config = struct(Module.MSDFGEN, "MSDFGenMultichannelConfig", nativeName = "struct msdf_multichannel_config") {
    int("overlap_support")
    int("mode")
    int("distance_check_mode")
    double("min_deviation_ratio")
    double("min_improve_ratio")
}

val msdf_ft_load_callback = Module.MSDFGEN.callback {
    opaque_p(
        "MSDFGenFTLoadCallback",

        charASCII.const.p("name")
    ) {
    }
}