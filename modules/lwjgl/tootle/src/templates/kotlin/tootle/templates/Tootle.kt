/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tootle.templates

import org.lwjgl.generator.*
import tootle.*

val Tootle = "Tootle".nativeClass(Module.TOOTLE, prefix = "TOOTLE", prefixMethod = "Tootle") {
    nativeImport("tootlelib.h")

    cpp = true

    IntConstant("DEFAULT_VCACHE_SIZE".."16")
    IntConstant("MAX_FACES"..0x7fffffff)
    IntConstant("MAX_VERTICES"..0x7fffffff)

    FloatConstant(
        "DEFAULT_ALPHA"..0.75f
    )

    EnumConstant(
        "OK".enum("1"),
        "INVALID_ARGS".enum,
        "OUT_OF_MEMORY".enum,
        "3D_API_ERROR".enum,
        "INTERNAL_ERROR".enum,
        "NOT_INITIALIZED".enum
    )

    EnumConstant(
        "CCW".enum("1"),
        "CW".enum
    )

    EnumConstant(
        "VCACHE_AUTO".enum("1"),
        "VCACHE_DIRECT3D".enum,
        "VCACHE_LSTRIPS".enum,
        "VCACHE_TIPSY".enum
    )

    EnumConstant(
        "OVERDRAW_AUTO".enum("1"),
        "OVERDRAW_DIRECT3D".enum,
        "OVERDRAW_RAYTRACE".enum,
        "OVERDRAW_FAST".enum
    )

    TootleResult(
        "Init",
        void()
    )

    TootleResult(
        "OptimizeVCache",

        unsigned_int.const.p("pnIB"),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces"),
        unsigned_int("nVertices"),
        unsigned_int("nCacheSize"),
        nullable..unsigned_int.p("pnIBOut"),
        Check("nFaces")..nullable..unsigned_int.p("pnFaceRemapOut"),
        TootleVCacheOptimizer("eVCacheOptimizer")
    )

    TootleResult(
        "ClusterMesh",

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p("pVB"),
        unsigned_int.const.p("pnIB"),
        AutoSizeDiv("nVBStride", "pVB")..unsigned_int("nVertices"),
        UseVariable..AutoSize(3, "pnIB", "pnClusteredIBOut")..unsigned_int("nFaces"),
        unsigned_int("nVBStride"),
        unsigned_int("nTargetClusters"),
        unsigned_int.p("pnClusteredIBOut"),
        Check("nFaces + 1")..unsigned_int.p("pnFaceClustersOut"),
        Check("nFaces")..nullable..unsigned_int.p("pnFaceRemapOut")
    )

    TootleResult(
        "FastOptimizeVCacheAndClusterMesh",

        unsigned_int.const.p("pnIB"),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces"),
        unsigned_int("nVertices"),
        unsigned_int("nCacheSize"),
        unsigned_int.p("pnIBOut"),
        Check("nFaces + 1")..unsigned_int.p("pnClustersOut"),
        Check(1)..unsigned_int.p("pnNumClustersOut"),
        float("fAlpha")
    )

    TootleResult(
        "OptimizeOverdraw",

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p("pVB"),
        unsigned_int.const.p("pnIB"),
        AutoSizeDiv("nVBStride", "pVB")..unsigned_int("nVertices"),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces"),
        unsigned_int("nVBStride"),
        nullable..float.const.p("pfViewpoint"),
        AutoSize(3, "pfViewpoint")..unsigned_int("nViewpoints"),
        TootleFaceWinding("eFrontWinding"),
        Check("nFaces + 1")..unsigned_int.const.p("pnFaceClusters"),
        nullable..unsigned_int.p("pnIBOut"),
        Check("pnFaceClusters.get(nFaces)")..nullable..unsigned_int.p("pnClusterRemapOut"),
        TootleOverdrawOptimizer("eOverdrawOptimizer")
    )

    void("Cleanup")

    TootleResult(
        "Optimize",

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p("pVB"),
        unsigned_int.const.p("pnIB"),
        AutoSizeDiv("nVBStride", "pVB")..unsigned_int("nVertices"),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces"),
        unsigned_int("nVBStride"),
        unsigned_int("nCacheSize"),
        nullable..float.const.p("pViewpoints"),
        AutoSize(3, "pViewpoints")..unsigned_int("nViewpoints"),
        TootleFaceWinding("eFrontWinding"),
        unsigned_int.p("pnIBOut"),
        Check(1)..nullable..unsigned_int.p("pnNumClustersOut"),
        TootleVCacheOptimizer("eVCacheOptimizer"),
        TootleOverdrawOptimizer("eOverdrawOptimizer")
    )

    TootleResult(
        "FastOptimize",

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p("pVB"),
        unsigned_int.const.p("pnIB"),
        AutoSizeDiv("nVBStride", "pVB")..unsigned_int("nVertices"),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces"),
        unsigned_int("nVBStride"),
        unsigned_int("nCacheSize"),
        TootleFaceWinding("eFrontWinding"),
        unsigned_int.p("pnIBOut"),
        Check(1)..nullable..unsigned_int.p("pnNumClustersOut"),
        float("fAlpha")
    )

    TootleResult(
        "VCacheClusters",

        unsigned_int.const.p("pnIB"),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces"),
        unsigned_int("nVertices"),
        unsigned_int("nCacheSize"),
        Check("nFaces + 1")..unsigned_int.const.p("pnFaceClusters"),
        nullable..unsigned_int.p("pnIBOut"),
        Check("nFaces")..nullable..unsigned_int.p("pnFaceRemapOut"),
        TootleVCacheOptimizer("eVCacheOptimizer")
    )

    TootleResult(
        "MeasureCacheEfficiency",

        unsigned_int.const.p("pnIB"),
        AutoSize(3, "pnIB")..unsigned_int("nFaces"),
        unsigned_int("nCacheSize"),
        Check(1)..float.p("pfEfficiencyOut")
    )

    TootleResult(
        "MeasureOverdraw",

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p("pVB"),
        unsigned_int.const.p("pnIB"),
        AutoSizeDiv("nVBStride", "pVB")..unsigned_int("nVertices"),
        AutoSize(3, "pnIB")..unsigned_int("nFaces"),
        unsigned_int("nVBStride"),
        nullable..float.const.p("pfViewpoint"),
        AutoSize(3, "pfViewpoint")..unsigned_int("nViewpoints"),
        TootleFaceWinding("eFrontWinding"),
        Check(1)..nullable..float.p("pfAvgODOut"),
        Check(1)..nullable..float.p("pfMaxODOut"),
        TootleOverdrawOptimizer("eOverdrawOptimizer")
    )

    TootleResult(
        "OptimizeVertexMemory",

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p("pVB"),
        unsigned_int.const.p("pnIB"),
        UseVariable..AutoSizeDiv("nVBStride", "pVB", "pVBOut")..unsigned_int("nVertices"),
        AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces"),
        unsigned_int("nVBStride"),
        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.p("pVBOut"),
        unsigned_int.p("pnIBOut"),
        Check("nVertices")..nullable..unsigned_int.p("pnVertexRemapOut")
    )
}