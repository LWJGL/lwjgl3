/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTSoftBodyHelpers {

    protected BTSoftBodyHelpers() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SoftBodyHelpers_CreateFromConvexHull = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyHelpers_CreateFromConvexHull"),
            SoftBodyHelpers_CreatePatchUV        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyHelpers_CreatePatchUV"),
            SoftBodyHelpers_Draw                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyHelpers_Draw"),
            SoftBodyHelpers_DrawClusterTree      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyHelpers_DrawClusterTree"),
            SoftBodyHelpers_DrawFaceTree         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyHelpers_DrawFaceTree"),
            SoftBodyHelpers_DrawFrame            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyHelpers_DrawFrame"),
            SoftBodyHelpers_DrawNodeTree         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyHelpers_DrawNodeTree");

    }

    // --- [ btSoftBodyHelpers_CreateFromConvexHull ] ---

    public static long nbtSoftBodyHelpers_CreateFromConvexHull(long worldInfo, long vertices, int nvertices, boolean randomizeConstraints) {
        long __functionAddress = Functions.SoftBodyHelpers_CreateFromConvexHull;
        if (CHECKS) {
            check(worldInfo);
        }
        return invokePPP(worldInfo, vertices, nvertices, randomizeConstraints, __functionAddress);
    }

    @NativeType("void *")
    public static long btSoftBodyHelpers_CreateFromConvexHull(@NativeType("void *") long worldInfo, @NativeType("btScalar const *") FloatBuffer vertices, @NativeType("bool") boolean randomizeConstraints) {
        return nbtSoftBodyHelpers_CreateFromConvexHull(worldInfo, memAddress(vertices), vertices.remaining() / 3, randomizeConstraints);
    }

    // --- [ btSoftBodyHelpers_CreatePatchUV ] ---

    /** Unsafe version of: {@link #btSoftBodyHelpers_CreatePatchUV SoftBodyHelpers_CreatePatchUV} */
    public static long nbtSoftBodyHelpers_CreatePatchUV(long worldInfo, long corner00, long corner10, long corner01, long corner11, int resx, int resy, int fixeds, boolean gendiags, long tex_coords) {
        long __functionAddress = Functions.SoftBodyHelpers_CreatePatchUV;
        if (CHECKS) {
            check(worldInfo);
        }
        return invokePPPPPPP(worldInfo, corner00, corner10, corner01, corner11, resx, resy, fixeds, gendiags, tex_coords, __functionAddress);
    }

    /** @param tex_coords size   (resx-1)*(resy-1)*12 */
    @NativeType("void *")
    public static long btSoftBodyHelpers_CreatePatchUV(@NativeType("void *") long worldInfo, @NativeType("btVector3 const *") ΒΤVector3 corner00, @NativeType("btVector3 const *") ΒΤVector3 corner10, @NativeType("btVector3 const *") ΒΤVector3 corner01, @NativeType("btVector3 const *") ΒΤVector3 corner11, int resx, int resy, int fixeds, @NativeType("bool") boolean gendiags, @NativeType("float *") FloatBuffer tex_coords) {
        return nbtSoftBodyHelpers_CreatePatchUV(worldInfo, corner00.address(), corner10.address(), corner01.address(), corner11.address(), resx, resy, fixeds, gendiags, memAddress(tex_coords));
    }

    // --- [ btSoftBodyHelpers_Draw ] ---

    public static void btSoftBodyHelpers_Draw(@NativeType("void *") long psb, @NativeType("void *") long idraw, int drawflags) {
        long __functionAddress = Functions.SoftBodyHelpers_Draw;
        if (CHECKS) {
            check(psb);
            check(idraw);
        }
        invokePPV(psb, idraw, drawflags, __functionAddress);
    }

    // --- [ btSoftBodyHelpers_DrawClusterTree ] ---

    public static void btSoftBodyHelpers_DrawClusterTree(@NativeType("void *") long psb, @NativeType("void *") long idraw, int mindepth, int maxdepth) {
        long __functionAddress = Functions.SoftBodyHelpers_DrawClusterTree;
        if (CHECKS) {
            check(psb);
            check(idraw);
        }
        invokePPV(psb, idraw, mindepth, maxdepth, __functionAddress);
    }

    // --- [ btSoftBodyHelpers_DrawFaceTree ] ---

    public static void btSoftBodyHelpers_DrawFaceTree(@NativeType("void *") long psb, @NativeType("void *") long idraw, int mindepth, int maxdepth) {
        long __functionAddress = Functions.SoftBodyHelpers_DrawFaceTree;
        if (CHECKS) {
            check(psb);
            check(idraw);
        }
        invokePPV(psb, idraw, mindepth, maxdepth, __functionAddress);
    }

    // --- [ btSoftBodyHelpers_DrawFrame ] ---

    public static void btSoftBodyHelpers_DrawFrame(@NativeType("void *") long psb, @NativeType("void *") long idraw) {
        long __functionAddress = Functions.SoftBodyHelpers_DrawFrame;
        if (CHECKS) {
            check(psb);
            check(idraw);
        }
        invokePPV(psb, idraw, __functionAddress);
    }

    // --- [ btSoftBodyHelpers_DrawNodeTree ] ---

    public static void btSoftBodyHelpers_DrawNodeTree(@NativeType("void *") long psb, @NativeType("void *") long idraw, int mindepth, int maxdepth) {
        long __functionAddress = Functions.SoftBodyHelpers_DrawNodeTree;
        if (CHECKS) {
            check(psb);
            check(idraw);
        }
        invokePPV(psb, idraw, mindepth, maxdepth, __functionAddress);
    }

}