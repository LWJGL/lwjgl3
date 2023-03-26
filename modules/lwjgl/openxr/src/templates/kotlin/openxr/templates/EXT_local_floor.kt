/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_local_floor = "EXTLocalFloor".nativeClassXR("EXT_local_floor", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EXT_local_floor">XR_EXT_local_floor</a> extension.

        The core OpenXR spec contains two world-locked reference space {@code XrSpace} types in {@code XrReferenceSpaceType}, #REFERENCE_SPACE_TYPE_LOCAL and #REFERENCE_SPACE_TYPE_STAGE with a design goal that {@code LOCAL} space gets the user positioned correctly in {@code XZ} space and {@code STAGE} gets the user positioned correctly in {@code Y} space.

        As defined in the core OpenXR spec, {@code LOCAL} space is useful when an application needs to render <b>seated-scale</b> content that is not positioned relative to the physical floor and {@code STAGE} space is useful when an application needs to render <b>standing-scale</b> content that is relative to the physical floor.

        The core OpenXR specification describes that <b>standing-scale</b> experiences are meant to use the {@code STAGE} reference space. However, using the {@code STAGE} forces the user to move to the stage space in order to operate their experience, rather than just standing locally where they are.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_local_floor_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_LOCAL_FLOOR_EXTENSION_NAME".."XR_EXT_local_floor"
    )

    EnumConstant(
        "Extends {@code XrReferenceSpaceType}.",

        "REFERENCE_SPACE_TYPE_LOCAL_FLOOR_EXT".."1000426000"
    )
}