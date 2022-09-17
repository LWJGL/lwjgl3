/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EXT_palm_pose">XR_EXT_palm_pose</a> extension.
 * 
 * <p>This extension defines a new "standard pose identifier" for interaction profiles, named "palm_ext". The new identifier is a pose that can be used to place application-specific visual content such as avatar visuals that may or may not match human hands. This extension also adds a new input component path using this "palm_ext" pose identifier to existing interaction profiles when active.</p>
 * 
 * <p>The application <b>can</b> use the subpathname:/input/palm_ext/pose component path to place visual content representing the user’s physical hand location. Application visuals may depict, for example, realistic human hands that are very simply animated or creative depictions such as an animal, an alien, or robot limb extremity.</p>
 * 
 * <p>Note that this is not intended to be an alternative to extensions that perform hand tracking for more complex use cases: the use of "palm" in the name is to reflect that it is a user-focused pose rather than a held-object-focused pose.</p>
 */
public final class EXTPalmPose {

    /** The extension specification version. */
    public static final int XR_EXT_palm_pose_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_EXT_PALM_POSE_EXTENSION_NAME = "XR_EXT_palm_pose";

    private EXTPalmPose() {}

}