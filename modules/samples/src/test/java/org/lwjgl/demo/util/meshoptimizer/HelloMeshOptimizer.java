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

        MeshoptStream.Buffer streams = MeshoptStream.create(2)
            .apply(0, it -> it
                .data(memByteBuffer(vertexBuffer))
                .size(4 * 3)
                .stride(4 * 3))
            .apply(1, it -> it
                .data(memByteBuffer(vertexBuffer))
                .size(4 * 3)
                .stride(4 * 3));

        IntBuffer remap = memAllocInt(mesh.npoints());

        int uniqueVertices = (int)meshopt_generateVertexRemapMulti(remap, indexBuffer, indexBuffer.remaining(), streams);
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

        System.out.println("AFTER:");
        System.out.println("------");
        printStats(mesh);
    }

    private static void remap(FloatBuffer vertexBuffer, IntBuffer indexBuffer, FloatBuffer normalBuffer, IntBuffer remap) {
        meshopt_remapIndexBuffer(indexBuffer, indexBuffer, remap);
        meshopt_remapVertexBuffer(memByteBuffer(vertexBuffer), memByteBuffer(vertexBuffer), 3 * Float.BYTES, remap);
        meshopt_remapVertexBuffer(memByteBuffer(normalBuffer), memByteBuffer(normalBuffer), 3 * Float.BYTES, remap);
    }

    private static void printStats(ParShapesMesh mesh) {
        try (MemoryStack stack = stackPush()) {
            MeshoptVertexCacheStatistics stats = meshopt_analyzeVertexCache(
                mesh.triangles(mesh.ntriangles() * 3),
                mesh.npoints(),
                16, 0, 0,
                MeshoptVertexCacheStatistics.malloc(stack)
            );
            System.out.println("ACMR: " + stats.acmr());
            System.out.println("ATVR: " + stats.atvr());
        }
    }

}