/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btHeightfieldTerrainShape = "BTHeightfieldTerrainShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "HeightfieldTerrainShape_new",
        "",

        int("heightStickWidth", ""),
        int("heightStickLength", ""),
        opaque_p("heightfieldData", ""),
        btScalar("heightScale", ""),
        btScalar("minHeight", ""),
        btScalar("maxHeight", ""),
        int("upAxis", ""),
        int("heightDataType", ""),
        bool("flipQuadEdges", "")
    )

    opaque_p(
        "HeightfieldTerrainShape_new2",
        "",

        int("heightStickWidth", ""),
        int("heightStickLength", ""),
        opaque_p("heightfieldData", ""),
        btScalar("maxHeight", ""),
        int("upAxis", ""),
        bool("useFloatData", ""),
        bool("flipQuadEdges", "")
    )

    void(
        "HeightfieldTerrainShape_performRaycast",
        "",

        opaque_p("obj", ""),
        opaque_p("callback", ""),
        btVector3.const.p("raySource", ""),
        btVector3.const.p("rayTarget", "")
    )

    void(
        "HeightfieldTerrainShape_buildAccelerator",
        "",

        opaque_p("obj", ""),
        int("chunkSize", "")
    )

    void(
        "HeightfieldTerrainShape_clearAccelerator",
        "",

        opaque_p("obj", "")
    )

    int(
        "HeightfieldTerrainShape_getUpAxis",
        "",

        opaque_p("obj", "")
    )

    void(
        "HeightfieldTerrainShape_setFlipTriangleWinding",
        "",

        opaque_p("obj", ""),
        bool("flipTriangleWinding", "")
    )

    void(
        "HeightfieldTerrainShape_setUseDiamondSubdivision",
        "",

        opaque_p("obj", "")
    )

    void(
        "HeightfieldTerrainShape_setUseDiamondSubdivision2",
        "",

        opaque_p("obj", ""),
        bool("useDiamondSubdivision", "")
    )

    void(
        "HeightfieldTerrainShape_setUseZigzagSubdivision",
        "",

        opaque_p("obj", "")
    )

    void(
        "HeightfieldTerrainShape_setUseZigzagSubdivision2",
        "",

        opaque_p("obj", ""),
        bool("useZigzagSubdivision", "")
    )

}