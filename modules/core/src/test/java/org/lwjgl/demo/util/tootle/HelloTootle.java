/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.tootle;

import org.lwjgl.system.*;
import org.lwjgl.util.par.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.par.ParShapes.*;
import static org.lwjgl.util.tootle.Tootle.*;

public final class HelloTootle {

    private HelloTootle() {}

    public static void main(String[] args) {
        TootleInit();

        // TODO: use Assimp to load meshes from the command line
        ParShapesMesh mesh = generateMesh();

        int nVertices = mesh.npoints();
        int nFaces    = mesh.ntriangles();

        System.out.println("Vertex   #: " + nVertices);
        System.out.println("Triangle #: " + nFaces);
        System.out.println("Index    #: " + (nFaces * 3));

        FloatBuffer pVB = mesh.points(nVertices * 3);

        IntBuffer pnIB    = mesh.triangles(nFaces * 3);
        IntBuffer pnIBOut = memAllocInt(pnIB.remaining());

        if (Platform.get() != Platform.WINDOWS) {
            System.out.println("\n(overdraw calculation may take several seconds, please be patient)");
        }

        printStats("BEFORE", pVB, pnIB);

        System.out.println("\nOptimizing...");
        long t = System.nanoTime();

        /*
        BEFORE OPTIMIZATION
        -------------------
        ACMR: 1.03125
        Overdraw AVG:0.26592624
        Overdraw MAX:3.156979
         */

        int err =
            //optimizeVCacheOnly(nVertices, pnIB, pnIBOut);
            //optimize(pVB, pnIB, pnIBOut);
            optimizeFast(pVB, pnIB, pnIBOut);

        if (err != TOOTLE_OK) {
            throw new IllegalStateException("Failed: " + err);
        }

        t = System.nanoTime() - t;
        System.out.println("DONE in " + (t / 1_000_000L) + "ms");

        printStats("AFTER", pVB, pnIBOut);

        System.out.println("\nRearranging...");
        t = System.nanoTime();
        err = TootleOptimizeVertexMemory(
            pVB,
            pnIBOut,
            3 * Float.BYTES,
            pVB,
            pnIBOut,
            null
        );
        if (err != TOOTLE_OK) {
            throw new IllegalStateException("Failed: " + err);
        }
        t = System.nanoTime() - t;
        System.out.println("DONE in " + (t / 1_000L) + "us");

        TootleCleanup();
    }

    /*
    vertex cache optimization only
    809ms

    ACMR: 0.64476764
    Overdraw AVG:0.26596618
    Overdraw MAX:3.1577697
     */
    private static int optimizeVCacheOnly(int nVertices, IntBuffer pnIB, IntBuffer pnIBOut) {
        return TootleOptimizeVCache(
            pnIB,
            nVertices,
            TOOTLE_DEFAULT_VCACHE_SIZE,
            pnIBOut,
            null,
            TOOTLE_VCACHE_AUTO
        );
    }

    /*
    slow optimizer (TootleClusterMesh -> TootleVCacheClusters -> TootleOptimizeOverdraw)

    TOOTLE_OVERDRAW_AUTO:
    ---------------------
    12841ms

    ACMR: 0.6474919
    Overdraw AVG:0.25006402
    Overdraw MAX:1.7714512

    TOOTLE_OVERDRAW_FAST:
    ---------------------
    319ms

    ACMR: 0.6474919
    Overdraw AVG:0.24489474
    Overdraw MAX:1.489917
    */
    private static int optimize(FloatBuffer pVB, IntBuffer pnIB, IntBuffer pnIBOut) {
        return TootleOptimize(
            pVB,
            pnIB,
            3 * Float.BYTES,
            TOOTLE_DEFAULT_VCACHE_SIZE,
            null,
            TOOTLE_CCW,
            pnIBOut,
            null,
            TOOTLE_VCACHE_AUTO,
            TOOTLE_OVERDRAW_AUTO
        );
    }

    /*
    fast optimizer (TootleFastOptimizeVCacheAndClusterMesh -> TootleOptimizeOverdraw)
    9ms

    ACMR: 0.84388506
    Overdraw AVG:0.14286888
    Overdraw MAX:0.72162914
     */
    private static int optimizeFast(FloatBuffer pVB, IntBuffer pnIB, IntBuffer pnIBOut) {
        return TootleFastOptimize(
            pVB,
            pnIB,
            3 * Float.BYTES,
            TOOTLE_DEFAULT_VCACHE_SIZE,
            TOOTLE_CCW,
            pnIBOut,
            null,
            TOOTLE_DEFAULT_ALPHA
        );
    }

    private static void printStats(
        String title,
        FloatBuffer pVB,
        IntBuffer pnIB
    ) {
        System.out.println();
        System.out.println(title);
        for (int i = 0; i < title.length(); i++) {
            System.out.print("-");
        }
        System.out.println();

        try (MemoryStack stack = MemoryStack.stackPush()) {
            FloatBuffer pfA = stack.mallocFloat(1);
            FloatBuffer pfB = stack.mallocFloat(1);

            TootleMeasureCacheEfficiency(pnIB, TOOTLE_DEFAULT_VCACHE_SIZE, pfA);
            System.out.println("\tACMR: " + pfA.get(0));

            TootleMeasureOverdraw(
                pVB,
                pnIB,
                3 * Float.BYTES,
                null,
                TOOTLE_CCW,
                pfA,
                pfB,
                TOOTLE_OVERDRAW_AUTO
            );
            System.out.println("\tOverdraw AVG: " + pfA.get(0));
            System.out.println("\tOverdraw MAX: " + pfB.get(0));
        }
    }

    private static ParShapesMesh generateMesh() {
        String program =
            " sx 2 sy 2" +
            " ry 90 rx 90" +
            " shape tube rx 15  call rlimb rx -15" +
            " shape tube rx -15 call llimb rx 15" +
            " shape tube ry 15  call rlimb ry -15" +
            " shape tube ry 15  call llimb ry -15" +
            " rule rlimb" +
            "     sx 0.925 sy 0.925 tz 1 rx 1.2" +
            "     call rlimb2" +
            " rule rlimb2.1" +
            "     shape connect" +
            "     call rlimb" +
            " rule rlimb2.1" +
            "     rx 15  shape tube call rlimb rx -15" +
            "     rx -15 shape tube call llimb rx 15" +
            " rule rlimb.1" +
            "     call llimb" +
            " rule llimb.1" +
            "     call rlimb" +
            " rule llimb.10" +
            "     sx 0.925 sy 0.925" +
            "     tz 1" +
            "     rx -1.2" +
            "     shape connect" +
            "     call llimb";

        return par_shapes_create_lsystem(program, Platform.get() == Platform.WINDOWS ? 512 : 32, 60);
    }

}