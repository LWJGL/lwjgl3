/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val HACD = "HACD".nativeClass(Module.BULLET, prefixMethod = "HACD_", binding = BULLET_BINDING_DELEGATE) {
    HACD_HACD.p(
        "HACD_new",
        "",

        void()
    )

    bool(
        "HACD_Compute",
        "",

        HACD_HACD.p("obj", "")
    )

    bool(
        "HACD_Compute2",
        "",

        HACD_HACD.p("obj", ""),
        bool("fullCH", "")
    )

    bool(
        "HACD_Compute3",
        "",

        HACD_HACD.p("obj", ""),
        bool("fullCH", ""),
        bool("exportDistPoints", "")
    )

    void(
        "HACD_DenormalizeData",
        "",

        HACD_HACD.p("obj", "")
    )

    bool(
        "HACD_GetAddExtraDistPoints",
        "",

        HACD_HACD.p("obj", "")
    )

    bool(
        "HACD_GetAddFacesPoints",
        "",

        HACD_HACD.p("obj", "")
    )

    bool(
        "HACD_GetAddNeighboursDistPoints",
        "",

        HACD_HACD.p("obj", "")
    )

    NativeName("HACD_HACD_GetCallBack")..HACD_CallBackFunction.const(
        "HACD_GetCallBack",
        "",

        HACD_HACD.p("obj", "")
    )

    bool(
        "HACD_GetCH",
        "",

        HACD_HACD.p("obj", ""),
        int("numCH", ""),
        Unsafe..HACD_Vec3_Real.p("points", ""),
        Unsafe..HACD_Vec3_long.p("triangles", "")
    )

    double(
        "HACD_GetCompacityWeight",
        "",

        HACD_HACD.p("obj", "")
    )

    double(
        "HACD_GetConcavity",
        "",

        HACD_HACD.p("obj", "")
    )

    double(
        "HACD_GetConnectDist",
        "",

        HACD_HACD.p("obj", "")
    )

    size_t(
        "HACD_GetNClusters",
        "",

        HACD_HACD.p("obj", "")
    )

    size_t(
        "HACD_GetNPoints",
        "",

        HACD_HACD.p("obj", "")
    )

    size_t(
        "HACD_GetNPointsCH",
        "",

        HACD_HACD.p("obj", ""),
        int("numCH", "")
    )

    size_t(
        "HACD_GetNTriangles",
        "",

        HACD_HACD.p("obj", "")
    )

    size_t(
        "HACD_GetNTrianglesCH",
        "",

        HACD_HACD.p("obj", ""),
        int("numCH", "")
    )

    size_t(
        "HACD_GetNVerticesPerCH",
        "",

        HACD_HACD.p("obj", "")
    )

    MapPointer("HACD_HACD_GetNTriangles(obj)")..long.const.p(
        "HACD_GetPartition",
        "",

        HACD_HACD.p("obj", "")
    )

    HACD_Vec3_Real.p(
        "HACD_GetPoints",
        "",

        HACD_HACD.p("obj", "")
    )

    double(
        "HACD_GetScaleFactor",
        "",

        HACD_HACD.p("obj", "")
    )

    HACD_Vec3_long.const.p(
        "HACD_GetTriangles",
        "",

        HACD_HACD.p("obj", "")
    )

    double(
        "HACD_GetVolumeWeight",
        "",

        HACD_HACD.p("obj", "")
    )

    void(
        "HACD_NormalizeData",
        "",

        HACD_HACD.p("obj", "")
    )

    bool(
        "HACD_Save",
        "",

        HACD_HACD.p("obj", ""),
        charUTF8.const.p("fileName", ""),
        bool("uniColor", "")
    )

    bool(
        "HACD_Save2",
        "",

        HACD_HACD.p("obj", ""),
        charUTF8.const.p("fileName", ""),
        bool("uniColor", ""),
        long("numCluster", "")
    )

    void(
        "HACD_SetAddExtraDistPoints",
        "",

        HACD_HACD.p("obj", ""),
        bool("addExtraDistPoints", "")
    )

    void(
        "HACD_SetAddFacesPoints",
        "",

        HACD_HACD.p("obj", ""),
        bool("addFacesPoints", "")
    )

    void(
        "HACD_SetAddNeighboursDistPoints",
        "",

        HACD_HACD.p("obj", ""),
        bool("addNeighboursDistPoints", "")
    )

    void(
        "HACD_SetCallBack",
        "",

        HACD_HACD.p("obj", ""),
        HACD_CallBackFunction("callBack", "")
    )

    void(
        "HACD_SetCompacityWeight",
        "",

        HACD_HACD.p("obj", ""),
        double("alpha", "")
    )

    void(
        "HACD_SetConcavity",
        "",

        HACD_HACD.p("obj", ""),
        double("concavity", "")
    )

    void(
        "HACD_SetConnectDist",
        "",

        HACD_HACD.p("obj", ""),
        double("ccConnectDist", "")
    )

    void(
        "HACD_SetNClusters",
        "",

        HACD_HACD.p("obj", ""),
        int("nClusters", "")
    )

    void(
        "HACD_SetNPoints",
        "",

        HACD_HACD.p("obj", ""),
        int("nPoints", "")
    )

    void(
        "HACD_SetNTriangles",
        "",

        HACD_HACD.p("obj", ""),
        int("nTriangles", "")
    )

    void(
        "HACD_SetNVerticesPerCH",
        "",

        HACD_HACD.p("obj", ""),
        int("nVerticesPerCH", "")
    )

    void(
        "HACD_SetPoints",
        "",

        HACD_HACD.p("obj", ""),
        Unsafe..HACD_Vec3_Real.p("points", "")
    )

    void(
        "HACD_SetScaleFactor",
        "",

        HACD_HACD.p("obj", ""),
        double("scale", "")
    )

    void(
        "HACD_SetTriangles",
        "",

        HACD_HACD.p("obj", ""),
        Unsafe..HACD_Vec3_long.p("triangles", "")
    )

    void(
        "HACD_SetVolumeWeight",
        "",

        HACD_HACD.p("obj", ""),
        double("beta", "")
    )

    void(
        "HACD_delete",
        "",

        HACD_HACD.p("obj", "")
    )
}