/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_VARJO_xr4_controller_interaction">XR_VARJO_xr4_controller_interaction</a> extension.
 * 
 * <p>This extension adds a new interaction profile for the Varjo Controllers compatible with the Varjo XR-4 headset.</p>
 * 
 * <p>Interaction profile path:</p>
 * 
 * <ul>
 * <li>pathname:/interaction_profiles/varjo/xr-4_controller</li>
 * </ul>
 * 
 * <p>Valid for the user paths:</p>
 * 
 * <ul>
 * <li>pathname:/user/hand/left</li>
 * <li>pathname:/user/hand/right</li>
 * </ul>
 * 
 * <p>Supported component paths for pathname:/user/hand/left only:</p>
 * 
 * <ul>
 * <li>subpathname:/input/menu/click</li>
 * </ul>
 * 
 * <p>Supported component paths for pathname:/user/hand/right only:</p>
 * 
 * <ul>
 * <li>subpathname:/input/system/click (<b>may</b> not be available for application use)</li>
 * </ul>
 * 
 * <p>Supported component paths on both pathnames:</p>
 * 
 * <ul>
 * <li>subpathname:/input/a/click</li>
 * <li>subpathname:/input/a/touch</li>
 * <li>subpathname:/input/b/click</li>
 * <li>subpathname:/input/b/touch</li>
 * <li>subpathname:/input/squeeze/click</li>
 * <li>subpathname:/input/squeeze/touch</li>
 * <li>subpathname:/input/trigger/value</li>
 * <li>subpathname:/input/trigger/touch</li>
 * <li>subpathname:/input/thumbstick/x</li>
 * <li>subpathname:/input/thumbstick/y</li>
 * <li>subpathname:/input/thumbstick/click</li>
 * <li>subpathname:/input/thumbstick/touch</li>
 * <li>subpathname:/input/grip/pose</li>
 * <li>subpathname:/input/aim/pose</li>
 * <li>subpathname:/output/haptic</li>
 * </ul>
 */
public final class VARJOXr4ControllerInteraction {

    /** The extension specification version. */
    public static final int XR_VARJO_xr4_controller_interaction_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_VARJO_XR4_CONTROLLER_INTERACTION_EXTENSION_NAME = "XR_VARJO_xr4_controller_interaction";

    private VARJOXr4ControllerInteraction() {}

}