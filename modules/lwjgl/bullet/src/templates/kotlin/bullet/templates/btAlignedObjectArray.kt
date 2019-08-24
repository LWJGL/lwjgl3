/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btAlignedObjectArray = "BTAlignedObjectArray".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "AlignedObjectArray_btBroadphasePair_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "AlignedObjectArray_btBroadphasePair_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btBroadphasePair_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btBroadphasePair_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btCollisionObjectPtr_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    int(
        "AlignedObjectArray_btCollisionObjectPtr_findLinearSearch2",
        "",

        opaque_p("obj", ""),
        opaque_p("key", "")
    )

    void(
        "AlignedObjectArray_btCollisionObjectPtr_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btCollisionObjectPtr_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btCollisionObjectPtr_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btIndexedMesh_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "AlignedObjectArray_btIndexedMesh_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btIndexedMesh_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btIndexedMesh_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btPersistentManifoldPtr_new",
        "",

        void()
    )

    opaque_p(
        "AlignedObjectArray_btPersistentManifoldPtr_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "AlignedObjectArray_btPersistentManifoldPtr_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btPersistentManifoldPtr_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btPersistentManifoldPtr_size",
        "",

        opaque_p("obj", "")
    )

    void(
        "AlignedObjectArray_btPersistentManifoldPtr_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btSoftBodyPtr_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "AlignedObjectArray_btSoftBodyPtr_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btSoftBodyPtr_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btSoftBodyPtr_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btSoftBody_Anchor_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_Anchor_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_Anchor_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btSoftBody_Anchor_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btSoftBody_ClusterPtr_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_ClusterPtr_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_ClusterPtr_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btSoftBody_ClusterPtr_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btSoftBody_Face_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_Face_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_Face_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btSoftBody_Face_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btSoftBody_JointPtr_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_JointPtr_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_JointPtr_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btSoftBody_JointPtr_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btSoftBody_Link_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_Link_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_Link_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_Link_set",
        "",

        opaque_p("obj", ""),
        opaque_p("val", ""),
        int("index", "")
    )

    int(
        "AlignedObjectArray_btSoftBody_Link_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btSoftBody_MaterialPtr_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_MaterialPtr_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_MaterialPtr_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btSoftBody_MaterialPtr_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btSoftBody_Node_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    int(
        "AlignedObjectArray_btSoftBody_Node_index_of",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_Node_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_Node_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btSoftBody_Node_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btSoftBody_Note_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    int(
        "AlignedObjectArray_btSoftBody_Note_size",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AlignedObjectArray_btSoftBody_Tetra_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_Tetra_push_back",
        "",

        opaque_p("obj", ""),
        opaque_p("val", "")
    )

    void(
        "AlignedObjectArray_btSoftBody_Tetra_resizeNoInitialize",
        "",

        opaque_p("obj", ""),
        int("newSize", "")
    )

    int(
        "AlignedObjectArray_btSoftBody_Tetra_size",
        "",

        opaque_p("obj", "")
    )

}