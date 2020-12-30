/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val collections = "BTCollections".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CompoundShapeChild_array_at",
        "",

        opaque_p("a", ""),
        int("n", "")
    )

    opaque_p(
        "SoftBodyNodePtrArray_at",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    void(
        "SoftBodyNodePtrArray_set",
        "",

        opaque_p("obj", ""),
        opaque_p("value", ""),
        int("index", "")
    )

    void(
        "Vector3_array_at",
        "",

        btVector3.const.p("a", ""),
        int("n", ""),
        btVector3.p("value", "")
    )

    void(
        "Vector3_array_set",
        "",

        btVector3.p("obj", ""),
        int("n", ""),
        btVector3.const.p("value", "")
    )

    opaque_p(
	    "AlignedObjectArray_btVector3_new",
		""
		
	)

    void(
        "AlignedObjectArray_btVector3_at",
        "",

        opaque_p("obj", ""),
        int("n", ""),
        btVector3.p("value", "")
    )

    void(
        "AlignedObjectArray_btVector3_push_back",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "AlignedObjectArray_btVector3_push_back2",
        "",

        opaque_p("obj", ""),
        btVector4.const.p("value", "")
    )

    void(
        "AlignedObjectArray_btVector3_set",
        "",

        opaque_p("obj", ""),
        int("n", ""),
        btVector3.const.p("value", "")
    )

    int(
        "AlignedObjectArray_btVector3_size",
        "",

        opaque_p("obj", "")
    )

    void(
        "AlignedObjectArray_btVector3_delete",
        "",

        opaque_p("obj", "")
    )

}