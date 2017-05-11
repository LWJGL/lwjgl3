/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_primitive_bounding_box = "EXTPrimitiveBoundingBox".nativeClassGLES("EXT_primitive_bounding_box", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        On tile-based architectures, transformed primitives are generally written out to memory before rasterization, and then read back from memory for each
        tile they intersect. When geometry expands during transformation due to tessellation or one-to-many geometry shaders, the external bandwidth required
        grows proportionally. This extension provides a way for implementations to know which tiles incoming geometry will intersect before fully transforming
        (and expanding) the geometry. This allows them to only store the unexpanded geometry in memory, and perform expansion on-chip for each intersected
        tile.

        New state is added to hold an axis-aligned bounding box which is assumed to contain any geometry submitted. An implementation is allowed to ignore any
        portions of primitives outside the bounding box; thus if a primitive extends outside of a tile into a neighboring tile that the bounding box didn't
        intersect, the implementation is not required to render those portions. The tessellation control shader is optionally able to specify a per-patch
        bounding box that overrides the bounding box state for primitives generated from that patch, in order to provide tighter bounds.

        The typical usage is that an application will have an object-space bounding volume for a primitive or group of primitives, either calculated at runtime
        or provided with the mesh by the authoring tool or content pipeline. It will transform this volume to clip space, compute an axis-aligned bounding box
        that contains the transformed bounding volume, and provide that at either per-patch or per-draw granularity.

        Requires ${GLES31.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v.",

        "PRIMITIVE_BOUNDING_BOX_EXT"..0x92BE
    )

    void(
        "PrimitiveBoundingBoxEXT",
        "",

        GLfloat.IN("minX", ""),
        GLfloat.IN("minY", ""),
        GLfloat.IN("minZ", ""),
        GLfloat.IN("minW", ""),
        GLfloat.IN("maxX", ""),
        GLfloat.IN("maxY", ""),
        GLfloat.IN("maxZ", ""),
        GLfloat.IN("maxW", "")
    )
}