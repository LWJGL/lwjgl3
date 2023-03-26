/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_touch_controller_pro">XR_FB_touch_controller_pro</a> extension.
 * 
 * <p>This extension defines a new interaction profile for the Meta Quest Touch Pro Controller.</p>
 * 
 * <p>Meta Quest Touch Pro Controller Profile Path:</p>
 * 
 * <ul>
 * <li>pathname:/interaction_profiles/facebook/touch_controller_pro</li>
 * </ul>
 * 
 * <p>Valid for user paths:</p>
 * 
 * <ul>
 * <li>pathname:/user/hand/left</li>
 * <li>pathname:/user/hand/right</li>
 * </ul>
 * 
 * <p>This interaction profile provides inputs and outputs that are a superset of those available in the existing "Oculus Touch Controller" interaction profile:</p>
 * 
 * <ul>
 * <li>pathname:/interaction_profiles/oculus/touch_controller</li>
 * </ul>
 * 
 * <p>Supported component paths (Note that the paths which are marked as 'new' are enabled by Meta Quest Touch Pro Controller profile exclusively):</p>
 * 
 * <ul>
 * <li>On pathname:/user/hand/left only:
 * 
 * <ul>
 * <li>subpathname:/input/x/click</li>
 * <li>subpathname:/input/x/touch</li>
 * <li>subpathname:/input/y/click</li>
 * <li>subpathname:/input/y/touch</li>
 * <li>subpathname:/input/menu/click</li>
 * </ul>
 * </li>
 * <li>On pathname:/user/hand/right only:
 * 
 * <ul>
 * <li>subpathname:/input/a/click</li>
 * <li>subpathname:/input/a/touch</li>
 * <li>subpathname:/input/b/click</li>
 * <li>subpathname:/input/b/touch</li>
 * <li>subpathname:/input/system/click (<b>may</b> not be available for application use)</li>
 * </ul>
 * </li>
 * <li>On both:
 * 
 * <ul>
 * <li>subpathname:/input/squeeze/value</li>
 * <li>subpathname:/input/trigger/value</li>
 * <li>subpathname:/input/trigger/touch</li>
 * <li>subpathname:/input/thumbstick</li>
 * <li>subpathname:/input/thumbstick/x</li>
 * <li>subpathname:/input/thumbstick/y</li>
 * <li>subpathname:/input/thumbstick/click</li>
 * <li>subpathname:/input/thumbstick/touch</li>
 * <li>subpathname:/input/thumbrest/touch</li>
 * <li>subpathname:/input/grip/pose</li>
 * <li>subpathname:/input/aim/pose</li>
 * <li>subpathname:/output/haptic</li>
 * <li>subpathname:/input/thumbrest/force (new)</li>
 * <li>subpathname:/input/stylus_fb/force (new)</li>
 * <li>subpathname:/input/trigger/curl_fb (new)</li>
 * <li>subpathname:/input/trigger/slide_fb (new)</li>
 * <li>subpathname:/input/trigger/proximity_fb (new)</li>
 * <li>subpathname:/input/thumb_fb/proximity_fb (new)</li>
 * <li>subpathname:/output/haptic_trigger_fb (new)</li>
 * <li>subpathname:/output/haptic_thumb_fb (new)</li>
 * </ul>
 * </li>
 * </ul>
 */
public final class FBTouchControllerPro {

    /** The extension specification version. */
    public static final int XR_FB_touch_controller_pro_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_TOUCH_CONTROLLER_PRO_EXTENSION_NAME = "XR_FB_touch_controller_pro";

    private FBTouchControllerPro() {}

}