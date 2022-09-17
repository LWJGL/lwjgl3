/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_first_person_observer = "MSFTFirstPersonObserver".nativeClassXR("MSFT_first_person_observer", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_MSFT_first_person_observer">XR_MSFT_first_person_observer</a> extension.

        This first-person observer view configuration enables the runtime to request the application to render an additional first-person view of the scene to be composed onto video frames being captured from a camera attached to and moved with the primary display on the form factor, which is generally for viewing on a 2D screen by an external observer. This first-person camera will be facing forward with roughly the same perspective as the primary views, and so the application should render its view to show objects that surround the user and avoid rendering the user’s body avatar. The runtime is responsible for composing the application’s rendered observer view onto the camera frame based on the chosen environment blend mode for this view configuration, as this extension does not provide the associated camera frame to the application.

        This extension requires the {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension to also be enabled.

        #VIEW_CONFIGURATION_TYPE_SECONDARY_MONO_FIRST_PERSON_OBSERVER_MSFT requires one element in ##XrViewConfigurationProperties and one projection in each ##XrCompositionLayerProjection layer.

        Runtimes <b>should</b> only make this view configuration active when the user or the application activates a runtime feature that will make use of the resulting composed camera frames, for example taking a mixed reality photo. Otherwise, the runtime <b>should</b> leave this view configuration inactive to avoid the application wasting CPU and GPU resources rendering unnecessarily for this extra view.

        Because this is a first-person view of the scene, applications <b>can</b> share a common culling and instanced rendering pass with their primary view renders. However, the view state (pose and FOV) of the first-person observer view will not match the view state of any of the primary views. Applications enabling this view configuration <b>must</b> call #LocateViews() a second time each frame to explicitly query the view state for the #VIEW_CONFIGURATION_TYPE_SECONDARY_MONO_FIRST_PERSON_OBSERVER_MSFT configuration.

        This secondary view configuration <b>may</b> support a different set of environment blend modes than the primary view configuration. For example, a device that only supports additive blending for its primary display may support alpha-blending when composing the first-person observer view with camera frames. The application should render with assets and shaders that produce output acceptable to both the primary and observer view configuration’s environment blend modes when sharing render passes across both view configurations.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_first_person_observer_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_FIRST_PERSON_OBSERVER_EXTENSION_NAME".."XR_MSFT_first_person_observer"
    )

    EnumConstant(
        "Extends {@code XrViewConfigurationType}.",

        "VIEW_CONFIGURATION_TYPE_SECONDARY_MONO_FIRST_PERSON_OBSERVER_MSFT".."1000054000"
    )
}