/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package par

import org.lwjgl.generator.*

// par_octasphere

val par_octasphere_uv_mode = "par_octasphere_uv_mode".enumType
val par_octasphere_normals_mode = "par_octasphere_normals_mode".enumType

val par_octasphere_config = struct(Module.PAR, "ParOctasphereConfig", nativeName = "par_octasphere_config") {
    float("corner_radius")
    float("width")
    float("height")
    float("depth")
    int("num_subdivisions")
    par_octasphere_uv_mode("uv_mode")
    par_octasphere_normals_mode("normals_mode")
}

val par_octasphere_mesh = struct(Module.PAR, "ParOctasphereMesh", nativeName = "par_octasphere_mesh", mutable = false) {
    float.p("positions").mutable()
    nullable..float.p("normals").mutable()
    nullable..float.p("texcoords").mutable()
    uint16_t.p("indices").mutable()
    uint32_t("num_indices")
    uint32_t("num_vertices")
}

// par_shapes

val PAR_SHAPES_T = typedef(uint32_t, "PAR_SHAPES_T")

val par_shapes_mesh = struct(Module.PAR, "ParShapesMesh", nativeName = "par_shapes_mesh", mutable = false) {
    float.p("points")
    int("npoints")
    PAR_SHAPES_T.p("triangles")
    int("ntriangles")
    nullable..float.p("normals")
    nullable..float.p("tcoords")
}

val par_shapes_rand_fn = Module.PAR.callback {
    float(
        "ParShapesRandFn",

        nullable..opaque_p("context"),

        nativeType = "par_shapes_rand_fn"
    ) {
    }
}

// par_streamlines

val parsl_annotation = struct(Module.PAR, "ParSLAnnotation", nativeName = "parsl_annotation", mutable = false) {
    float("u_along_curve")
    float("v_across_curve")
    float("spine_to_edge_x")
    float("spine_to_edge_y")
}

val parsl_position = struct(Module.PAR, "ParSLPosition", nativeName = "parsl_position") {
    float("x")
    float("y")
}

val parsl_mesh = struct(Module.PAR, "ParSLMesh", nativeName = "parsl_mesh", mutable = false) {
    AutoSize(
        "positions",
        "annotations",
        "spine_lengths",
        "random_offsets"
    )..uint32_t("num_vertices")
    uint32_t("num_triangles")
    uint32_t.p("triangle_indices")
    parsl_position.p("positions")
    nullable..parsl_annotation.p("annotations")
    nullable..float.p("spine_lengths")
    nullable..float.p("random_offsets")
}

val parsl_viewport = struct(Module.PAR, "ParSLViewport", nativeName = "parsl_viewport") {
    float("left")
    float("top")
    float("right")
    float("bottom")
}

val parsl_config = struct(Module.PAR, "ParSLConfig", nativeName = "parsl_config") {
    float("thickness")
    uint32_t("flags")
    int("u_mode")
    float("curves_max_flatness")
    float("streamlines_seed_spacing")
    parsl_viewport("streamlines_seed_viewport")
    float("miter_limit")
}

val parsl_spine_list = struct(Module.PAR, "ParSLSpineList", nativeName = "parsl_spine_list") {
    AutoSize("vertices")..uint32_t("num_vertices")
    AutoSize("spine_lengths")..uint16_t("num_spines")
    parsl_position.p("vertices")
    uint16_t.p("spine_lengths")
    bool("closed")
}

val parsl_context = "parsl_context".opaque

val parsl_advection_callback = Module.PAR.callback {
    void(
        "ParSLAdvectionCallback",

        parsl_position.p("point"),
        opaque_p("userdata"),

        nativeType = "parsl_advection_callback"
    ) {
    }
}