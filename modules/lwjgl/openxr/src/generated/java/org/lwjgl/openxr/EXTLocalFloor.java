/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EXT_local_floor">XR_EXT_local_floor</a> extension.
 * 
 * <p>The core OpenXR spec contains two world-locked reference space {@code XrSpace} types in {@code XrReferenceSpaceType}, {@link XR10#XR_REFERENCE_SPACE_TYPE_LOCAL REFERENCE_SPACE_TYPE_LOCAL} and {@link XR10#XR_REFERENCE_SPACE_TYPE_STAGE REFERENCE_SPACE_TYPE_STAGE} with a design goal that {@code LOCAL} space gets the user positioned correctly in {@code XZ} space and {@code STAGE} gets the user positioned correctly in {@code Y} space.</p>
 * 
 * <p>As defined in the core OpenXR spec, {@code LOCAL} space is useful when an application needs to render <b>seated-scale</b> content that is not positioned relative to the physical floor and {@code STAGE} space is useful when an application needs to render <b>standing-scale</b> content that is relative to the physical floor.</p>
 * 
 * <p>The core OpenXR specification describes that <b>standing-scale</b> experiences are meant to use the {@code STAGE} reference space. However, using the {@code STAGE} forces the user to move to the stage space in order to operate their experience, rather than just standing locally where they are.</p>
 */
public final class EXTLocalFloor {

    /** The extension specification version. */
    public static final int XR_EXT_local_floor_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_LOCAL_FLOOR_EXTENSION_NAME = "XR_EXT_local_floor";

    /** Extends {@code XrReferenceSpaceType}. */
    public static final int XR_REFERENCE_SPACE_TYPE_LOCAL_FLOOR_EXT = 1000426000;

    private EXTLocalFloor() {}

}