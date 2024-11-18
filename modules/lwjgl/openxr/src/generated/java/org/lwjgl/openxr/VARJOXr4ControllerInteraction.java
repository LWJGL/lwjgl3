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
 * <h5>Note</h5>
 * 
 * <p>The interaction profile path pathname:{legacy-path} defined here does not follow current rules for interaction profile names. If this extension were introduced today, it would be called pathname:{properly-suffixed-path}, to allow for modifications when promoted to a KHR extension or the core specification.</p>
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
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When the runtime supports {@link XR11 XR_VERSION_1_1} and use of OpenXR 1.1 is requested by the application, this interaction profile <b>must</b> also support</p>
 * 
 * <ul>
 * <li>subpathname:/input/grip_surface/pose</li>
 * </ul>
 * </div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When the {@link KHRMaintenance1 XR_KHR_maintenance1} extension is available and enabled, this interaction profile <b>must</b> also support</p>
 * 
 * <ul>
 * <li>subpathname:/input/grip_surface/pose</li>
 * </ul>
 * </div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When the {@link EXTPalmPose XR_EXT_palm_pose} extension is available and enabled, this interaction profile <b>must</b> also support</p>
 * 
 * <ul>
 * <li>subpathname:/input/palm_ext/pose</li>
 * </ul>
 * </div>
 */
public final class VARJOXr4ControllerInteraction {

    /** The extension specification version. */
    public static final int XR_VARJO_xr4_controller_interaction_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_VARJO_XR4_CONTROLLER_INTERACTION_EXTENSION_NAME = "XR_VARJO_xr4_controller_interaction";

    private VARJOXr4ControllerInteraction() {}

}