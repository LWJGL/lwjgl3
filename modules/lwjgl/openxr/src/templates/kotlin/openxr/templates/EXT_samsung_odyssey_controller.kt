/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_samsung_odyssey_controller = "EXTSamsungOdysseyController".nativeClassXR("EXT_samsung_odyssey_controller", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EXT_samsung_odyssey_controller">XR_EXT_samsung_odyssey_controller</a> extension.

        This extension enables the application to differentiate the newer form factor of motion controller released with the Samsung Odyssey headset. It enables the application to customize the appearance and experience of the controller differently from the original <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#_microsoft_mixed_reality_motion_controller_profile">mixed reality motion controller</a>.

        This extension added a new interaction profile pathname:/interaction_profiles/samsung/odyssey_controller to describe the Odyssey controller. The action bindings of this interaction profile work exactly the same as the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#_microsoft_mixed_reality_motion_controller_profile">pathname:/interaction_profiles/microsoft/motion_controller</a> in terms of valid user paths and supported input and output component paths.

        If the application doesn’t do its own custom rendering for specific motion controllers, it <b>should</b> avoid using this extension and instead just use subpathname:/microsoft/motion_controller, as runtimes <b>should</b> treat both controllers equally when applications declare action bindings only for that profile.

        If the application wants to customize rendering for specific motion controllers, it <b>should</b> setup the suggested bindings for subpathname:/samsung/odyssey_controller the same as subpathname:/microsoft/motion_controller when calling #SuggestInteractionProfileBindings(), and expect the same action bindings. Then the application <b>can</b> listen to the ##XrEventDataInteractionProfileChanged event and inspect the returned interaction profile from #GetCurrentInteractionProfile() to differentiate which controller is being used by the user, and hence customize the appearance or experience of the motion controller specifically for the form factor of subpathname:/samsung/odyssey_controller.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_samsung_odyssey_controller_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SAMSUNG_ODYSSEY_CONTROLLER_EXTENSION_NAME".."XR_EXT_samsung_odyssey_controller"
    )
}