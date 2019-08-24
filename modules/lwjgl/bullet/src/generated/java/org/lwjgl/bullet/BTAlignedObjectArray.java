/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class BTAlignedObjectArray {

    protected BTAlignedObjectArray() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            AlignedObjectArray_btBroadphasePair_at                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btBroadphasePair_at"),
            AlignedObjectArray_btBroadphasePair_push_back                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btBroadphasePair_push_back"),
            AlignedObjectArray_btBroadphasePair_resizeNoInitialize        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btBroadphasePair_resizeNoInitialize"),
            AlignedObjectArray_btBroadphasePair_size                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btBroadphasePair_size"),
            AlignedObjectArray_btCollisionObjectPtr_at                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btCollisionObjectPtr_at"),
            AlignedObjectArray_btCollisionObjectPtr_findLinearSearch2     = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btCollisionObjectPtr_findLinearSearch2"),
            AlignedObjectArray_btCollisionObjectPtr_push_back             = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btCollisionObjectPtr_push_back"),
            AlignedObjectArray_btCollisionObjectPtr_resizeNoInitialize    = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btCollisionObjectPtr_resizeNoInitialize"),
            AlignedObjectArray_btCollisionObjectPtr_size                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btCollisionObjectPtr_size"),
            AlignedObjectArray_btIndexedMesh_at                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btIndexedMesh_at"),
            AlignedObjectArray_btIndexedMesh_push_back                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btIndexedMesh_push_back"),
            AlignedObjectArray_btIndexedMesh_resizeNoInitialize           = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btIndexedMesh_resizeNoInitialize"),
            AlignedObjectArray_btIndexedMesh_size                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btIndexedMesh_size"),
            AlignedObjectArray_btPersistentManifoldPtr_new                = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btPersistentManifoldPtr_new"),
            AlignedObjectArray_btPersistentManifoldPtr_at                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btPersistentManifoldPtr_at"),
            AlignedObjectArray_btPersistentManifoldPtr_push_back          = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btPersistentManifoldPtr_push_back"),
            AlignedObjectArray_btPersistentManifoldPtr_resizeNoInitialize = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btPersistentManifoldPtr_resizeNoInitialize"),
            AlignedObjectArray_btPersistentManifoldPtr_size               = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btPersistentManifoldPtr_size"),
            AlignedObjectArray_btPersistentManifoldPtr_delete             = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btPersistentManifoldPtr_delete"),
            AlignedObjectArray_btSoftBodyPtr_at                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBodyPtr_at"),
            AlignedObjectArray_btSoftBodyPtr_push_back                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBodyPtr_push_back"),
            AlignedObjectArray_btSoftBodyPtr_resizeNoInitialize           = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBodyPtr_resizeNoInitialize"),
            AlignedObjectArray_btSoftBodyPtr_size                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBodyPtr_size"),
            AlignedObjectArray_btSoftBody_Anchor_at                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Anchor_at"),
            AlignedObjectArray_btSoftBody_Anchor_push_back                = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Anchor_push_back"),
            AlignedObjectArray_btSoftBody_Anchor_resizeNoInitialize       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Anchor_resizeNoInitialize"),
            AlignedObjectArray_btSoftBody_Anchor_size                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Anchor_size"),
            AlignedObjectArray_btSoftBody_ClusterPtr_at                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_ClusterPtr_at"),
            AlignedObjectArray_btSoftBody_ClusterPtr_push_back            = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_ClusterPtr_push_back"),
            AlignedObjectArray_btSoftBody_ClusterPtr_resizeNoInitialize   = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_ClusterPtr_resizeNoInitialize"),
            AlignedObjectArray_btSoftBody_ClusterPtr_size                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_ClusterPtr_size"),
            AlignedObjectArray_btSoftBody_Face_at                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Face_at"),
            AlignedObjectArray_btSoftBody_Face_push_back                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Face_push_back"),
            AlignedObjectArray_btSoftBody_Face_resizeNoInitialize         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Face_resizeNoInitialize"),
            AlignedObjectArray_btSoftBody_Face_size                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Face_size"),
            AlignedObjectArray_btSoftBody_JointPtr_at                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_JointPtr_at"),
            AlignedObjectArray_btSoftBody_JointPtr_push_back              = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_JointPtr_push_back"),
            AlignedObjectArray_btSoftBody_JointPtr_resizeNoInitialize     = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_JointPtr_resizeNoInitialize"),
            AlignedObjectArray_btSoftBody_JointPtr_size                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_JointPtr_size"),
            AlignedObjectArray_btSoftBody_Link_at                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Link_at"),
            AlignedObjectArray_btSoftBody_Link_push_back                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Link_push_back"),
            AlignedObjectArray_btSoftBody_Link_resizeNoInitialize         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Link_resizeNoInitialize"),
            AlignedObjectArray_btSoftBody_Link_set                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Link_set"),
            AlignedObjectArray_btSoftBody_Link_size                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Link_size"),
            AlignedObjectArray_btSoftBody_MaterialPtr_at                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_MaterialPtr_at"),
            AlignedObjectArray_btSoftBody_MaterialPtr_push_back           = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_MaterialPtr_push_back"),
            AlignedObjectArray_btSoftBody_MaterialPtr_resizeNoInitialize  = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_MaterialPtr_resizeNoInitialize"),
            AlignedObjectArray_btSoftBody_MaterialPtr_size                = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_MaterialPtr_size"),
            AlignedObjectArray_btSoftBody_Node_at                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Node_at"),
            AlignedObjectArray_btSoftBody_Node_index_of                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Node_index_of"),
            AlignedObjectArray_btSoftBody_Node_push_back                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Node_push_back"),
            AlignedObjectArray_btSoftBody_Node_resizeNoInitialize         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Node_resizeNoInitialize"),
            AlignedObjectArray_btSoftBody_Node_size                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Node_size"),
            AlignedObjectArray_btSoftBody_Note_at                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Note_at"),
            AlignedObjectArray_btSoftBody_Note_size                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Note_size"),
            AlignedObjectArray_btSoftBody_Tetra_at                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Tetra_at"),
            AlignedObjectArray_btSoftBody_Tetra_push_back                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Tetra_push_back"),
            AlignedObjectArray_btSoftBody_Tetra_resizeNoInitialize        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Tetra_resizeNoInitialize"),
            AlignedObjectArray_btSoftBody_Tetra_size                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btAlignedObjectArray_btSoftBody_Tetra_size");

    }

    // --- [ btAlignedObjectArray_btBroadphasePair_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btBroadphasePair_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btBroadphasePair_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btBroadphasePair_push_back ] ---

    public static void btAlignedObjectArray_btBroadphasePair_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btBroadphasePair_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btBroadphasePair_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btBroadphasePair_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btBroadphasePair_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btBroadphasePair_size ] ---

    public static int btAlignedObjectArray_btBroadphasePair_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btBroadphasePair_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btCollisionObjectPtr_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btCollisionObjectPtr_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btCollisionObjectPtr_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btCollisionObjectPtr_findLinearSearch2 ] ---

    public static int btAlignedObjectArray_btCollisionObjectPtr_findLinearSearch2(@NativeType("void *") long obj, @NativeType("void *") long key) {
        long __functionAddress = Functions.AlignedObjectArray_btCollisionObjectPtr_findLinearSearch2;
        if (CHECKS) {
            check(obj);
            check(key);
        }
        return invokePPI(obj, key, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btCollisionObjectPtr_push_back ] ---

    public static void btAlignedObjectArray_btCollisionObjectPtr_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btCollisionObjectPtr_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btCollisionObjectPtr_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btCollisionObjectPtr_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btCollisionObjectPtr_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btCollisionObjectPtr_size ] ---

    public static int btAlignedObjectArray_btCollisionObjectPtr_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btCollisionObjectPtr_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btIndexedMesh_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btIndexedMesh_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btIndexedMesh_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btIndexedMesh_push_back ] ---

    public static void btAlignedObjectArray_btIndexedMesh_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btIndexedMesh_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btIndexedMesh_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btIndexedMesh_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btIndexedMesh_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btIndexedMesh_size ] ---

    public static int btAlignedObjectArray_btIndexedMesh_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btIndexedMesh_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btPersistentManifoldPtr_new ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btPersistentManifoldPtr_new() {
        long __functionAddress = Functions.AlignedObjectArray_btPersistentManifoldPtr_new;
        return invokeP(__functionAddress);
    }

    // --- [ btAlignedObjectArray_btPersistentManifoldPtr_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btPersistentManifoldPtr_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btPersistentManifoldPtr_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btPersistentManifoldPtr_push_back ] ---

    public static void btAlignedObjectArray_btPersistentManifoldPtr_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btPersistentManifoldPtr_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btPersistentManifoldPtr_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btPersistentManifoldPtr_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btPersistentManifoldPtr_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btPersistentManifoldPtr_size ] ---

    public static int btAlignedObjectArray_btPersistentManifoldPtr_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btPersistentManifoldPtr_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btPersistentManifoldPtr_delete ] ---

    public static void btAlignedObjectArray_btPersistentManifoldPtr_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btPersistentManifoldPtr_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBodyPtr_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btSoftBodyPtr_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBodyPtr_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBodyPtr_push_back ] ---

    public static void btAlignedObjectArray_btSoftBodyPtr_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBodyPtr_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBodyPtr_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btSoftBodyPtr_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBodyPtr_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBodyPtr_size ] ---

    public static int btAlignedObjectArray_btSoftBodyPtr_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBodyPtr_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Anchor_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btSoftBody_Anchor_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Anchor_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Anchor_push_back ] ---

    public static void btAlignedObjectArray_btSoftBody_Anchor_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Anchor_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Anchor_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btSoftBody_Anchor_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Anchor_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Anchor_size ] ---

    public static int btAlignedObjectArray_btSoftBody_Anchor_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Anchor_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_ClusterPtr_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btSoftBody_ClusterPtr_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_ClusterPtr_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_ClusterPtr_push_back ] ---

    public static void btAlignedObjectArray_btSoftBody_ClusterPtr_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_ClusterPtr_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_ClusterPtr_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btSoftBody_ClusterPtr_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_ClusterPtr_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_ClusterPtr_size ] ---

    public static int btAlignedObjectArray_btSoftBody_ClusterPtr_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_ClusterPtr_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Face_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btSoftBody_Face_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Face_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Face_push_back ] ---

    public static void btAlignedObjectArray_btSoftBody_Face_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Face_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Face_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btSoftBody_Face_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Face_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Face_size ] ---

    public static int btAlignedObjectArray_btSoftBody_Face_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Face_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_JointPtr_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btSoftBody_JointPtr_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_JointPtr_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_JointPtr_push_back ] ---

    public static void btAlignedObjectArray_btSoftBody_JointPtr_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_JointPtr_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_JointPtr_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btSoftBody_JointPtr_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_JointPtr_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_JointPtr_size ] ---

    public static int btAlignedObjectArray_btSoftBody_JointPtr_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_JointPtr_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Link_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btSoftBody_Link_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Link_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Link_push_back ] ---

    public static void btAlignedObjectArray_btSoftBody_Link_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Link_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Link_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btSoftBody_Link_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Link_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Link_set ] ---

    public static void btAlignedObjectArray_btSoftBody_Link_set(@NativeType("void *") long obj, @NativeType("void *") long val, int index) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Link_set;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, index, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Link_size ] ---

    public static int btAlignedObjectArray_btSoftBody_Link_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Link_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_MaterialPtr_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btSoftBody_MaterialPtr_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_MaterialPtr_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_MaterialPtr_push_back ] ---

    public static void btAlignedObjectArray_btSoftBody_MaterialPtr_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_MaterialPtr_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_MaterialPtr_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btSoftBody_MaterialPtr_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_MaterialPtr_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_MaterialPtr_size ] ---

    public static int btAlignedObjectArray_btSoftBody_MaterialPtr_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_MaterialPtr_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Node_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btSoftBody_Node_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Node_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Node_index_of ] ---

    public static int btAlignedObjectArray_btSoftBody_Node_index_of(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Node_index_of;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        return invokePPI(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Node_push_back ] ---

    public static void btAlignedObjectArray_btSoftBody_Node_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Node_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Node_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btSoftBody_Node_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Node_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Node_size ] ---

    public static int btAlignedObjectArray_btSoftBody_Node_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Node_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Note_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btSoftBody_Note_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Note_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Note_size ] ---

    public static int btAlignedObjectArray_btSoftBody_Note_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Note_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Tetra_at ] ---

    @NativeType("void *")
    public static long btAlignedObjectArray_btSoftBody_Tetra_at(@NativeType("void *") long obj, int n) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Tetra_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, n, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Tetra_push_back ] ---

    public static void btAlignedObjectArray_btSoftBody_Tetra_push_back(@NativeType("void *") long obj, @NativeType("void *") long val) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Tetra_push_back;
        if (CHECKS) {
            check(obj);
            check(val);
        }
        invokePPV(obj, val, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Tetra_resizeNoInitialize ] ---

    public static void btAlignedObjectArray_btSoftBody_Tetra_resizeNoInitialize(@NativeType("void *") long obj, int newSize) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Tetra_resizeNoInitialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, newSize, __functionAddress);
    }

    // --- [ btAlignedObjectArray_btSoftBody_Tetra_size ] ---

    public static int btAlignedObjectArray_btSoftBody_Tetra_size(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AlignedObjectArray_btSoftBody_Tetra_size;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

}