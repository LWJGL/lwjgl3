/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EXT_samsung_odyssey_controller">XR_EXT_samsung_odyssey_controller</a> extension.
 * 
 * <p>This extension enables the application to differentiate the newer form factor of motion controller released with the Samsung Odyssey headset. It enables the application to customize the appearance and experience of the controller differently from the original <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#_microsoft_mixed_reality_motion_controller_profile">mixed reality motion controller</a>.</p>
 * 
 * <p>This extension added a new interaction profile pathname:/interaction_profiles/samsung/odyssey_controller to describe the Odyssey controller. The action bindings of this interaction profile work exactly the same as the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#_microsoft_mixed_reality_motion_controller_profile">pathname:/interaction_profiles/microsoft/motion_controller</a> in terms of valid user paths and supported input and output component paths.</p>
 * 
 * <p>If the application doesn’t do its own custom rendering for specific motion controllers, it <b>should</b> avoid using this extension and instead just use subpathname:/microsoft/motion_controller, as runtimes <b>should</b> treat both controllers equally when applications declare action bindings only for that profile.</p>
 * 
 * <p>If the application wants to customize rendering for specific motion controllers, it <b>should</b> setup the suggested bindings for subpathname:/samsung/odyssey_controller the same as subpathname:/microsoft/motion_controller when calling {@link XR10#xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings}, and expect the same action bindings. Then the application <b>can</b> listen to the {@link XrEventDataInteractionProfileChanged} event and inspect the returned interaction profile from {@link XR10#xrGetCurrentInteractionProfile GetCurrentInteractionProfile} to differentiate which controller is being used by the user, and hence customize the appearance or experience of the motion controller specifically for the form factor of subpathname:/samsung/odyssey_controller.</p>
 */
public final class EXTSamsungOdysseyController {

    /** The extension specification version. */
    public static final int XR_EXT_samsung_odyssey_controller_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_SAMSUNG_ODYSSEY_CONTROLLER_EXTENSION_NAME = "XR_EXT_samsung_odyssey_controller";

    private EXTSamsungOdysseyController() {}

}