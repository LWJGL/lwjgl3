/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSoftBodyHelpers = "BTSoftBodyHelpers".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "SoftBodyHelpers_CreateFromConvexHull",
        "",

        opaque_p("worldInfo", ""),
        btScalar.const.p("vertices", ""),
        AutoSize(3, "vertices")..int("nvertices", ""),
        bool("randomizeConstraints", "")
    )

    opaque_p(
        "SoftBodyHelpers_CreatePatchUV",
        "",

        opaque_p("worldInfo", ""),
        btVector3.const.p("corner00", ""),
        btVector3.const.p("corner10", ""),
        btVector3.const.p("corner01", ""),
        btVector3.const.p("corner11", ""),
        int("resx", ""),
        int("resy", ""),
        int("fixeds", ""),
        bool("gendiags", ""),
        Unsafe..float.p("tex_coords", "size   (resx-1)*(resy-1)*12")
    )

    void(
        "SoftBodyHelpers_Draw",
        "",

        opaque_p("psb", ""),
        opaque_p("idraw", ""),
        int("drawflags", "")
    )

    void(
        "SoftBodyHelpers_DrawClusterTree",
        "",

        opaque_p("psb", ""),
        opaque_p("idraw", ""),
        int("mindepth", ""),
        int("maxdepth", "")
    )

    void(
        "SoftBodyHelpers_DrawFaceTree",
        "",

        opaque_p("psb", ""),
        opaque_p("idraw", ""),
        int("mindepth", ""),
        int("maxdepth", "")
    )

    void(
        "SoftBodyHelpers_DrawFrame",
        "",

        opaque_p("psb", ""),
        opaque_p("idraw", "")
    )

    void(
        "SoftBodyHelpers_DrawNodeTree",
        "",

        opaque_p("psb", ""),
        opaque_p("idraw", ""),
        int("mindepth", ""),
        int("maxdepth", "")
    )

}