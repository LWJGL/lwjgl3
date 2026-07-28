/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.meshoptimizer;

import org.lwjgl.system.*;
import org.lwjgl.util.meshoptimizer.*;
import org.lwjgl.util.par.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.meshoptimizer.MeshOptimizer.*;
import static org.lwjgl.util.par.ParShapes.*;
import static org.testng.Assert.*;

public class HelloMeshOptimizer {

    public static void main(String[] args) {
        ParShapesMesh mesh = Objects.requireNonNull(par_shapes_create_torus(32, 32, 1.0f));

        System.out.println("BEFORE:");
        System.out.println("-------");
        printStats(mesh);

        IntBuffer indexBuffer = mesh.triangles(mesh.ntriangles() * 3);

        FloatBuffer vertexBuffer = mesh.points(mesh.npoints() * 3);
        FloatBuffer normalBuffer = Objects.requireNonNull(mesh.normals(mesh.npoints() * 3));

        nmeshopt_setAllocator(
            MemoryUtil.getAllocator(true).getMalloc(),
            MemoryUtil.getAllocator(true).getFree()
        );

        MeshoptStream.Buffer streams = MeshoptStream.create(2)
            .apply(0, it -> it
                .data(memByteBuffer(vertexBuffer))
                .size(4 * 3)
                .stride(4 * 3))
            .apply(1, it -> it
                .data(memByteBuffer(normalBuffer))
                .size(4 * 3)
                .stride(4 * 3));

        IntBuffer remap = memAllocInt(mesh.npoints());

        int uniqueVertices = (int)meshopt_generateVertexRemapMulti(remap, indexBuffer, mesh.npoints(), streams);

        remap(vertexBuffer, indexBuffer, normalBuffer, remap);

        if (uniqueVertices < remap.remaining()) {
            remap.limit(uniqueVertices);

            vertexBuffer.limit(uniqueVertices * 3);
            normalBuffer.limit(uniqueVertices * 3);
        }

        meshopt_optimizeVertexCache(indexBuffer, indexBuffer, uniqueVertices);
        meshopt_optimizeOverdraw(indexBuffer, indexBuffer, vertexBuffer, uniqueVertices, 3 * Float.BYTES, 1.05f);

        assertEquals((int)meshopt_optimizeVertexFetchRemap(remap, indexBuffer), uniqueVertices);
        remap(vertexBuffer, indexBuffer, normalBuffer, remap);

        memFree(remap);

        memPutInt(mesh.address() + ParShapesMesh.NPOINTS, uniqueVertices);

        System.out.println("\nAFTER:");
        System.out.println("------");
        printStats(mesh);

        par_shapes_free_mesh(mesh);
    }

    private static void remap(FloatBuffer vertexBuffer, IntBuffer indexBuffer, FloatBuffer normalBuffer, IntBuffer remap) {
        meshopt_remapIndexBuffer(indexBuffer, indexBuffer, indexBuffer.remaining(), remap);
        meshopt_remapVertexBuffer(memByteBuffer(vertexBuffer), memByteBuffer(vertexBuffer), remap.remaining(), 3 * Float.BYTES, remap);
        meshopt_remapVertexBuffer(memByteBuffer(normalBuffer), memByteBuffer(normalBuffer), remap.remaining(), 3 * Float.BYTES, remap);
    }

    private static void printStats(ParShapesMesh mesh) {
        try (MemoryStack stack = stackPush()) {
            MeshoptVertexCacheStatistics vcache = meshopt_analyzeVertexCache(
                mesh.triangles(mesh.ntriangles() * 3),
                mesh.npoints(),
                32, 32, 32, // NVIDIA
                //14, 64, 128, // AMD
                //128, 0, 0, // INTEL
                MeshoptVertexCacheStatistics.malloc(stack)
            );
            System.out.println("ACMR: " + vcache.acmr());
            System.out.println("ATVR: " + vcache.atvr());

            MeshoptOverdrawStatistics overdraw = meshopt_analyzeOverdraw(
                mesh.triangles(mesh.ntriangles() * 3),
                mesh.points(mesh.npoints() * 3),
                mesh.npoints(),
                3 * Float.BYTES,
                MeshoptOverdrawStatistics.malloc(stack)
            );
            System.out.println("Overdraw: " + overdraw.overdraw());
            System.out.println("Pixels covered: " + overdraw.pixels_covered());
            System.out.println("Pixels shaded: " + overdraw.pixels_shaded());
        }
    }

}