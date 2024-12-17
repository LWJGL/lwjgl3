/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tootle;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Tootle {

    static { Library.loadSystem(System::load, System::loadLibrary, Tootle.class, "org.lwjgl.tootle", Platform.mapLibraryNameBundled("lwjgl_tootle")); }

    public static final int TOOTLE_DEFAULT_VCACHE_SIZE = 16;

    public static final int TOOTLE_MAX_FACES = 0x7FFFFFFF;

    public static final int TOOTLE_MAX_VERTICES = 0x7FFFFFFF;

    public static final float TOOTLE_DEFAULT_ALPHA = 0.75f;

    public static final int
        TOOTLE_OK              = 1,
        TOOTLE_INVALID_ARGS    = 2,
        TOOTLE_OUT_OF_MEMORY   = 3,
        TOOTLE_3D_API_ERROR    = 4,
        TOOTLE_INTERNAL_ERROR  = 5,
        TOOTLE_NOT_INITIALIZED = 6;

    public static final int
        TOOTLE_CCW = 1,
        TOOTLE_CW  = 2;

    public static final int
        TOOTLE_VCACHE_AUTO     = 1,
        TOOTLE_VCACHE_DIRECT3D = 2,
        TOOTLE_VCACHE_LSTRIPS  = 3,
        TOOTLE_VCACHE_TIPSY    = 4;

    public static final int
        TOOTLE_OVERDRAW_AUTO     = 1,
        TOOTLE_OVERDRAW_DIRECT3D = 2,
        TOOTLE_OVERDRAW_RAYTRACE = 3,
        TOOTLE_OVERDRAW_FAST     = 4;

    protected Tootle() {
        throw new UnsupportedOperationException();
    }

    // --- [ TootleInit ] ---

    /** {@code TootleResult TootleInit(void)} */
    @NativeType("TootleResult")
    public static native int TootleInit();

    // --- [ TootleOptimizeVCache ] ---

    /** {@code TootleResult TootleOptimizeVCache(unsigned int const * pnIB, unsigned int nFaces, unsigned int nVertices, unsigned int nCacheSize, unsigned int * pnIBOut, unsigned int * pnFaceRemapOut, TootleVCacheOptimizer eVCacheOptimizer)} */
    public static native int nTootleOptimizeVCache(long pnIB, int nFaces, int nVertices, int nCacheSize, long pnIBOut, long pnFaceRemapOut, int eVCacheOptimizer);

    /** {@code TootleResult TootleOptimizeVCache(unsigned int const * pnIB, unsigned int nFaces, unsigned int nVertices, unsigned int nCacheSize, unsigned int * pnIBOut, unsigned int * pnFaceRemapOut, TootleVCacheOptimizer eVCacheOptimizer)} */
    @NativeType("TootleResult")
    public static int TootleOptimizeVCache(@NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVertices, @NativeType("unsigned int") int nCacheSize, @NativeType("unsigned int *") @Nullable IntBuffer pnIBOut, @NativeType("unsigned int *") @Nullable IntBuffer pnFaceRemapOut, @NativeType("TootleVCacheOptimizer") int eVCacheOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            checkSafe(pnIBOut, pnIB.remaining());
            checkSafe(pnFaceRemapOut, nFaces);
        }
        return nTootleOptimizeVCache(memAddress(pnIB), nFaces, nVertices, nCacheSize, memAddressSafe(pnIBOut), memAddressSafe(pnFaceRemapOut), eVCacheOptimizer);
    }

    // --- [ TootleClusterMesh ] ---

    /** {@code TootleResult TootleClusterMesh(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, unsigned int nTargetClusters, unsigned int * pnClusteredIBOut, unsigned int * pnFaceClustersOut, unsigned int * pnFaceRemapOut)} */
    public static native int nTootleClusterMesh(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, int nTargetClusters, long pnClusteredIBOut, long pnFaceClustersOut, long pnFaceRemapOut);

    /** {@code TootleResult TootleClusterMesh(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, unsigned int nTargetClusters, unsigned int * pnClusteredIBOut, unsigned int * pnFaceClustersOut, unsigned int * pnFaceRemapOut)} */
    @NativeType("TootleResult")
    public static int TootleClusterMesh(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nTargetClusters, @NativeType("unsigned int *") IntBuffer pnClusteredIBOut, @NativeType("unsigned int *") IntBuffer pnFaceClustersOut, @NativeType("unsigned int *") @Nullable IntBuffer pnFaceRemapOut) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnClusteredIBOut, pnIB.remaining());
            check(pnFaceClustersOut, nFaces + 1);
            checkSafe(pnFaceRemapOut, nFaces);
        }
        return nTootleClusterMesh(memAddress(pVB), memAddress(pnIB), pVB.remaining() / nVBStride, nFaces, nVBStride, nTargetClusters, memAddress(pnClusteredIBOut), memAddress(pnFaceClustersOut), memAddressSafe(pnFaceRemapOut));
    }

    /** {@code TootleResult TootleClusterMesh(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, unsigned int nTargetClusters, unsigned int * pnClusteredIBOut, unsigned int * pnFaceClustersOut, unsigned int * pnFaceRemapOut)} */
    @NativeType("TootleResult")
    public static int TootleClusterMesh(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nTargetClusters, @NativeType("unsigned int *") IntBuffer pnClusteredIBOut, @NativeType("unsigned int *") IntBuffer pnFaceClustersOut, @NativeType("unsigned int *") @Nullable IntBuffer pnFaceRemapOut) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnClusteredIBOut, pnIB.remaining());
            check(pnFaceClustersOut, nFaces + 1);
            checkSafe(pnFaceRemapOut, nFaces);
        }
        return nTootleClusterMesh(memAddress(pVB), memAddress(pnIB), (int)(((long)pVB.remaining() << 2) / nVBStride), nFaces, nVBStride, nTargetClusters, memAddress(pnClusteredIBOut), memAddress(pnFaceClustersOut), memAddressSafe(pnFaceRemapOut));
    }

    // --- [ TootleFastOptimizeVCacheAndClusterMesh ] ---

    /** {@code TootleResult TootleFastOptimizeVCacheAndClusterMesh(unsigned int const * pnIB, unsigned int nFaces, unsigned int nVertices, unsigned int nCacheSize, unsigned int * pnIBOut, unsigned int * pnClustersOut, unsigned int * pnNumClustersOut, float fAlpha)} */
    public static native int nTootleFastOptimizeVCacheAndClusterMesh(long pnIB, int nFaces, int nVertices, int nCacheSize, long pnIBOut, long pnClustersOut, long pnNumClustersOut, float fAlpha);

    /** {@code TootleResult TootleFastOptimizeVCacheAndClusterMesh(unsigned int const * pnIB, unsigned int nFaces, unsigned int nVertices, unsigned int nCacheSize, unsigned int * pnIBOut, unsigned int * pnClustersOut, unsigned int * pnNumClustersOut, float fAlpha)} */
    @NativeType("TootleResult")
    public static int TootleFastOptimizeVCacheAndClusterMesh(@NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVertices, @NativeType("unsigned int") int nCacheSize, @NativeType("unsigned int *") IntBuffer pnIBOut, @NativeType("unsigned int *") IntBuffer pnClustersOut, @NativeType("unsigned int *") IntBuffer pnNumClustersOut, float fAlpha) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnIBOut, pnIB.remaining());
            check(pnClustersOut, nFaces + 1);
            check(pnNumClustersOut, 1);
        }
        return nTootleFastOptimizeVCacheAndClusterMesh(memAddress(pnIB), nFaces, nVertices, nCacheSize, memAddress(pnIBOut), memAddress(pnClustersOut), memAddress(pnNumClustersOut), fAlpha);
    }

    // --- [ TootleOptimizeOverdraw ] ---

    /** {@code TootleResult TootleOptimizeOverdraw(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, float const * pfViewpoint, unsigned int nViewpoints, TootleFaceWinding eFrontWinding, unsigned int const * pnFaceClusters, unsigned int * pnIBOut, unsigned int * pnClusterRemapOut, TootleOverdrawOptimizer eOverdrawOptimizer)} */
    public static native int nTootleOptimizeOverdraw(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, long pfViewpoint, int nViewpoints, int eFrontWinding, long pnFaceClusters, long pnIBOut, long pnClusterRemapOut, int eOverdrawOptimizer);

    /** {@code TootleResult TootleOptimizeOverdraw(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, float const * pfViewpoint, unsigned int nViewpoints, TootleFaceWinding eFrontWinding, unsigned int const * pnFaceClusters, unsigned int * pnIBOut, unsigned int * pnClusterRemapOut, TootleOverdrawOptimizer eOverdrawOptimizer)} */
    @NativeType("TootleResult")
    public static int TootleOptimizeOverdraw(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("float const *") @Nullable FloatBuffer pfViewpoint, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int const *") IntBuffer pnFaceClusters, @NativeType("unsigned int *") @Nullable IntBuffer pnIBOut, @NativeType("unsigned int *") @Nullable IntBuffer pnClusterRemapOut, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            checkSafe(pnIBOut, pnIB.remaining());
            check(pnFaceClusters, nFaces + 1);
            checkSafe(pnClusterRemapOut, pnFaceClusters.get(nFaces));
        }
        return nTootleOptimizeOverdraw(memAddress(pVB), memAddress(pnIB), pVB.remaining() / nVBStride, nFaces, nVBStride, memAddressSafe(pfViewpoint), remainingSafe(pfViewpoint) / 3, eFrontWinding, memAddress(pnFaceClusters), memAddressSafe(pnIBOut), memAddressSafe(pnClusterRemapOut), eOverdrawOptimizer);
    }

    /** {@code TootleResult TootleOptimizeOverdraw(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, float const * pfViewpoint, unsigned int nViewpoints, TootleFaceWinding eFrontWinding, unsigned int const * pnFaceClusters, unsigned int * pnIBOut, unsigned int * pnClusterRemapOut, TootleOverdrawOptimizer eOverdrawOptimizer)} */
    @NativeType("TootleResult")
    public static int TootleOptimizeOverdraw(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("float const *") @Nullable FloatBuffer pfViewpoint, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int const *") IntBuffer pnFaceClusters, @NativeType("unsigned int *") @Nullable IntBuffer pnIBOut, @NativeType("unsigned int *") @Nullable IntBuffer pnClusterRemapOut, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            checkSafe(pnIBOut, pnIB.remaining());
            check(pnFaceClusters, nFaces + 1);
            checkSafe(pnClusterRemapOut, pnFaceClusters.get(nFaces));
        }
        return nTootleOptimizeOverdraw(memAddress(pVB), memAddress(pnIB), (int)(((long)pVB.remaining() << 2) / nVBStride), nFaces, nVBStride, memAddressSafe(pfViewpoint), remainingSafe(pfViewpoint) / 3, eFrontWinding, memAddress(pnFaceClusters), memAddressSafe(pnIBOut), memAddressSafe(pnClusterRemapOut), eOverdrawOptimizer);
    }

    // --- [ TootleCleanup ] ---

    /** {@code void TootleCleanup(void)} */
    public static native void TootleCleanup();

    // --- [ TootleOptimize ] ---

    /** {@code TootleResult TootleOptimize(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, unsigned int nCacheSize, float const * pViewpoints, unsigned int nViewpoints, TootleFaceWinding eFrontWinding, unsigned int * pnIBOut, unsigned int * pnNumClustersOut, TootleVCacheOptimizer eVCacheOptimizer, TootleOverdrawOptimizer eOverdrawOptimizer)} */
    public static native int nTootleOptimize(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, int nCacheSize, long pViewpoints, int nViewpoints, int eFrontWinding, long pnIBOut, long pnNumClustersOut, int eVCacheOptimizer, int eOverdrawOptimizer);

    /** {@code TootleResult TootleOptimize(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, unsigned int nCacheSize, float const * pViewpoints, unsigned int nViewpoints, TootleFaceWinding eFrontWinding, unsigned int * pnIBOut, unsigned int * pnNumClustersOut, TootleVCacheOptimizer eVCacheOptimizer, TootleOverdrawOptimizer eOverdrawOptimizer)} */
    @NativeType("TootleResult")
    public static int TootleOptimize(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nCacheSize, @NativeType("float const *") @Nullable FloatBuffer pViewpoints, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int *") IntBuffer pnIBOut, @NativeType("unsigned int *") @Nullable IntBuffer pnNumClustersOut, @NativeType("TootleVCacheOptimizer") int eVCacheOptimizer, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnNumClustersOut, 1);
        }
        return nTootleOptimize(memAddress(pVB), memAddress(pnIB), pVB.remaining() / nVBStride, nFaces, nVBStride, nCacheSize, memAddressSafe(pViewpoints), remainingSafe(pViewpoints) / 3, eFrontWinding, memAddress(pnIBOut), memAddressSafe(pnNumClustersOut), eVCacheOptimizer, eOverdrawOptimizer);
    }

    /** {@code TootleResult TootleOptimize(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, unsigned int nCacheSize, float const * pViewpoints, unsigned int nViewpoints, TootleFaceWinding eFrontWinding, unsigned int * pnIBOut, unsigned int * pnNumClustersOut, TootleVCacheOptimizer eVCacheOptimizer, TootleOverdrawOptimizer eOverdrawOptimizer)} */
    @NativeType("TootleResult")
    public static int TootleOptimize(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nCacheSize, @NativeType("float const *") @Nullable FloatBuffer pViewpoints, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int *") IntBuffer pnIBOut, @NativeType("unsigned int *") @Nullable IntBuffer pnNumClustersOut, @NativeType("TootleVCacheOptimizer") int eVCacheOptimizer, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnNumClustersOut, 1);
        }
        return nTootleOptimize(memAddress(pVB), memAddress(pnIB), (int)(((long)pVB.remaining() << 2) / nVBStride), nFaces, nVBStride, nCacheSize, memAddressSafe(pViewpoints), remainingSafe(pViewpoints) / 3, eFrontWinding, memAddress(pnIBOut), memAddressSafe(pnNumClustersOut), eVCacheOptimizer, eOverdrawOptimizer);
    }

    // --- [ TootleFastOptimize ] ---

    /** {@code TootleResult TootleFastOptimize(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, unsigned int nCacheSize, TootleFaceWinding eFrontWinding, unsigned int * pnIBOut, unsigned int * pnNumClustersOut, float fAlpha)} */
    public static native int nTootleFastOptimize(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, int nCacheSize, int eFrontWinding, long pnIBOut, long pnNumClustersOut, float fAlpha);

    /** {@code TootleResult TootleFastOptimize(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, unsigned int nCacheSize, TootleFaceWinding eFrontWinding, unsigned int * pnIBOut, unsigned int * pnNumClustersOut, float fAlpha)} */
    @NativeType("TootleResult")
    public static int TootleFastOptimize(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nCacheSize, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int *") IntBuffer pnIBOut, @NativeType("unsigned int *") @Nullable IntBuffer pnNumClustersOut, float fAlpha) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnNumClustersOut, 1);
        }
        return nTootleFastOptimize(memAddress(pVB), memAddress(pnIB), pVB.remaining() / nVBStride, nFaces, nVBStride, nCacheSize, eFrontWinding, memAddress(pnIBOut), memAddressSafe(pnNumClustersOut), fAlpha);
    }

    /** {@code TootleResult TootleFastOptimize(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, unsigned int nCacheSize, TootleFaceWinding eFrontWinding, unsigned int * pnIBOut, unsigned int * pnNumClustersOut, float fAlpha)} */
    @NativeType("TootleResult")
    public static int TootleFastOptimize(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nCacheSize, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int *") IntBuffer pnIBOut, @NativeType("unsigned int *") @Nullable IntBuffer pnNumClustersOut, float fAlpha) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnNumClustersOut, 1);
        }
        return nTootleFastOptimize(memAddress(pVB), memAddress(pnIB), (int)(((long)pVB.remaining() << 2) / nVBStride), nFaces, nVBStride, nCacheSize, eFrontWinding, memAddress(pnIBOut), memAddressSafe(pnNumClustersOut), fAlpha);
    }

    // --- [ TootleVCacheClusters ] ---

    /** {@code TootleResult TootleVCacheClusters(unsigned int const * pnIB, unsigned int nFaces, unsigned int nVertices, unsigned int nCacheSize, unsigned int const * pnFaceClusters, unsigned int * pnIBOut, unsigned int * pnFaceRemapOut, TootleVCacheOptimizer eVCacheOptimizer)} */
    public static native int nTootleVCacheClusters(long pnIB, int nFaces, int nVertices, int nCacheSize, long pnFaceClusters, long pnIBOut, long pnFaceRemapOut, int eVCacheOptimizer);

    /** {@code TootleResult TootleVCacheClusters(unsigned int const * pnIB, unsigned int nFaces, unsigned int nVertices, unsigned int nCacheSize, unsigned int const * pnFaceClusters, unsigned int * pnIBOut, unsigned int * pnFaceRemapOut, TootleVCacheOptimizer eVCacheOptimizer)} */
    @NativeType("TootleResult")
    public static int TootleVCacheClusters(@NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVertices, @NativeType("unsigned int") int nCacheSize, @NativeType("unsigned int const *") IntBuffer pnFaceClusters, @NativeType("unsigned int *") @Nullable IntBuffer pnIBOut, @NativeType("unsigned int *") @Nullable IntBuffer pnFaceRemapOut, @NativeType("TootleVCacheOptimizer") int eVCacheOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            checkSafe(pnIBOut, pnIB.remaining());
            check(pnFaceClusters, nFaces + 1);
            checkSafe(pnFaceRemapOut, nFaces);
        }
        return nTootleVCacheClusters(memAddress(pnIB), nFaces, nVertices, nCacheSize, memAddress(pnFaceClusters), memAddressSafe(pnIBOut), memAddressSafe(pnFaceRemapOut), eVCacheOptimizer);
    }

    // --- [ TootleMeasureCacheEfficiency ] ---

    /** {@code TootleResult TootleMeasureCacheEfficiency(unsigned int const * pnIB, unsigned int nFaces, unsigned int nCacheSize, float * pfEfficiencyOut)} */
    public static native int nTootleMeasureCacheEfficiency(long pnIB, int nFaces, int nCacheSize, long pfEfficiencyOut);

    /** {@code TootleResult TootleMeasureCacheEfficiency(unsigned int const * pnIB, unsigned int nFaces, unsigned int nCacheSize, float * pfEfficiencyOut)} */
    @NativeType("TootleResult")
    public static int TootleMeasureCacheEfficiency(@NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nCacheSize, @NativeType("float *") FloatBuffer pfEfficiencyOut) {
        if (CHECKS) {
            check(pfEfficiencyOut, 1);
        }
        return nTootleMeasureCacheEfficiency(memAddress(pnIB), pnIB.remaining() / 3, nCacheSize, memAddress(pfEfficiencyOut));
    }

    // --- [ TootleMeasureOverdraw ] ---

    /** {@code TootleResult TootleMeasureOverdraw(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, float const * pfViewpoint, unsigned int nViewpoints, TootleFaceWinding eFrontWinding, float * pfAvgODOut, float * pfMaxODOut, TootleOverdrawOptimizer eOverdrawOptimizer)} */
    public static native int nTootleMeasureOverdraw(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, long pfViewpoint, int nViewpoints, int eFrontWinding, long pfAvgODOut, long pfMaxODOut, int eOverdrawOptimizer);

    /** {@code TootleResult TootleMeasureOverdraw(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, float const * pfViewpoint, unsigned int nViewpoints, TootleFaceWinding eFrontWinding, float * pfAvgODOut, float * pfMaxODOut, TootleOverdrawOptimizer eOverdrawOptimizer)} */
    @NativeType("TootleResult")
    public static int TootleMeasureOverdraw(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("float const *") @Nullable FloatBuffer pfViewpoint, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("float *") @Nullable FloatBuffer pfAvgODOut, @NativeType("float *") @Nullable FloatBuffer pfMaxODOut, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        if (CHECKS) {
            checkSafe(pfAvgODOut, 1);
            checkSafe(pfMaxODOut, 1);
        }
        return nTootleMeasureOverdraw(memAddress(pVB), memAddress(pnIB), pVB.remaining() / nVBStride, pnIB.remaining() / 3, nVBStride, memAddressSafe(pfViewpoint), remainingSafe(pfViewpoint) / 3, eFrontWinding, memAddressSafe(pfAvgODOut), memAddressSafe(pfMaxODOut), eOverdrawOptimizer);
    }

    /** {@code TootleResult TootleMeasureOverdraw(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, float const * pfViewpoint, unsigned int nViewpoints, TootleFaceWinding eFrontWinding, float * pfAvgODOut, float * pfMaxODOut, TootleOverdrawOptimizer eOverdrawOptimizer)} */
    @NativeType("TootleResult")
    public static int TootleMeasureOverdraw(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("float const *") @Nullable FloatBuffer pfViewpoint, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("float *") @Nullable FloatBuffer pfAvgODOut, @NativeType("float *") @Nullable FloatBuffer pfMaxODOut, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        if (CHECKS) {
            checkSafe(pfAvgODOut, 1);
            checkSafe(pfMaxODOut, 1);
        }
        return nTootleMeasureOverdraw(memAddress(pVB), memAddress(pnIB), (int)(((long)pVB.remaining() << 2) / nVBStride), pnIB.remaining() / 3, nVBStride, memAddressSafe(pfViewpoint), remainingSafe(pfViewpoint) / 3, eFrontWinding, memAddressSafe(pfAvgODOut), memAddressSafe(pfMaxODOut), eOverdrawOptimizer);
    }

    // --- [ TootleOptimizeVertexMemory ] ---

    /** {@code TootleResult TootleOptimizeVertexMemory(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, void * pVBOut, unsigned int * pnIBOut, unsigned int * pnVertexRemapOut)} */
    public static native int nTootleOptimizeVertexMemory(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, long pVBOut, long pnIBOut, long pnVertexRemapOut);

    /** {@code TootleResult TootleOptimizeVertexMemory(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, void * pVBOut, unsigned int * pnIBOut, unsigned int * pnVertexRemapOut)} */
    @NativeType("TootleResult")
    public static int TootleOptimizeVertexMemory(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("void *") ByteBuffer pVBOut, @NativeType("unsigned int *") IntBuffer pnIBOut, @NativeType("unsigned int *") @Nullable IntBuffer pnVertexRemapOut) {
        int nVertices = pVB.remaining() / nVBStride;
        if (CHECKS) {
            check(pVBOut, pVB.remaining());
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnVertexRemapOut, nVertices);
        }
        return nTootleOptimizeVertexMemory(memAddress(pVB), memAddress(pnIB), nVertices, pnIB.remaining() / 3, nVBStride, memAddress(pVBOut), memAddress(pnIBOut), memAddressSafe(pnVertexRemapOut));
    }

    /** {@code TootleResult TootleOptimizeVertexMemory(void const * pVB, unsigned int const * pnIB, unsigned int nVertices, unsigned int nFaces, unsigned int nVBStride, void * pVBOut, unsigned int * pnIBOut, unsigned int * pnVertexRemapOut)} */
    @NativeType("TootleResult")
    public static int TootleOptimizeVertexMemory(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("void *") FloatBuffer pVBOut, @NativeType("unsigned int *") IntBuffer pnIBOut, @NativeType("unsigned int *") @Nullable IntBuffer pnVertexRemapOut) {
        int nVertices = (int)(((long)pVBOut.remaining() << 2) / nVBStride);
        if (CHECKS) {
            check(pVBOut, pVB.remaining());
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnVertexRemapOut, nVertices);
        }
        return nTootleOptimizeVertexMemory(memAddress(pVB), memAddress(pnIB), nVertices, pnIB.remaining() / 3, nVBStride, memAddress(pVBOut), memAddress(pnIBOut), memAddressSafe(pnVertexRemapOut));
    }

}