/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTriangleInfoMap = "BTTriangleInfoMap".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "TriangleInfo_new",
        "",

        void()
    )

    btScalar(
        "TriangleInfo_getEdgeV0V1Angle",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TriangleInfo_getEdgeV1V2Angle",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TriangleInfo_getEdgeV2V0Angle",
        "",

        opaque_p("obj", "")
    )

    int(
        "TriangleInfo_getFlags",
        "",

        opaque_p("obj", "")
    )

    void(
        "TriangleInfo_setEdgeV0V1Angle",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TriangleInfo_setEdgeV1V2Angle",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TriangleInfo_setEdgeV2V0Angle",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TriangleInfo_setFlags",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "TriangleInfo_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TriangleInfoMap_new",
        "",

        void()
    )

    int(
        "TriangleInfoMap_calculateSerializeBufferSize",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TriangleInfoMap_getConvexEpsilon",
        "EXPORT void btTriangleInfoMap_deSerialize(btTriangleInfoMap* obj, btTriangleInfoMapData* data);",

        opaque_p("obj", "")
    )

    btScalar(
        "TriangleInfoMap_getEdgeDistanceThreshold",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TriangleInfoMap_getEqualVertexThreshold",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TriangleInfoMap_getMaxEdgeAngleThreshold",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TriangleInfoMap_getPlanarEpsilon",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "TriangleInfoMap_getZeroAreaThreshold",
        "",

        opaque_p("obj", "")
    )

    charUTF8.const.p(
        "TriangleInfoMap_serialize",
        "",

        opaque_p("obj", ""),
        opaque_p("dataBuffer", ""),
        opaque_p("serializer", "")
    )

    void(
        "TriangleInfoMap_setConvexEpsilon",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TriangleInfoMap_setEdgeDistanceThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TriangleInfoMap_setEqualVertexThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TriangleInfoMap_setMaxEdgeAngleThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TriangleInfoMap_setPlanarEpsilon",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TriangleInfoMap_setZeroAreaThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "TriangleInfoMap_delete",
        "",

        opaque_p("obj", "")
    )

}