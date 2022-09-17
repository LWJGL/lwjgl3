/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_unbounded_reference_space = "MSFTUnboundedReferenceSpace".nativeClassXR("MSFT_unbounded_reference_space", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_MSFT_unbounded_reference_space">XR_MSFT_unbounded_reference_space</a> extension.

        This extension allows an application to create an {@code UNBOUNDED_MSFT} reference space. This reference space enables the viewer to move freely through a complex environment, often many meters from where they started, while always optimizing for coordinate system stability near the viewer. This is done by allowing the origin of the reference space to drift as necessary to keep the viewer’s coordinates relative to the space’s origin stable.

        To create an {@code UNBOUNDED_MSFT} reference space, the application <b>can</b> pass #REFERENCE_SPACE_TYPE_UNBOUNDED_MSFT to #CreateReferenceSpace().

        The {@code UNBOUNDED_MSFT} reference space establishes a world-locked origin, gravity-aligned to exclude pitch and roll, with +Y up, +X to the right, and -Z forward. This space begins with an arbitrary initial position and orientation, which the runtime <b>may</b> define to be either the initial position at app launch or some other initial zero position. Unlike a {@code STAGE} reference space, the runtime <b>may</b> place the origin of an {@code UNBOUNDED_MSFT} reference space at any height, rather than fixing it at the floor. This is because the viewer may move through various rooms and levels of their environment, each of which has a different floor height. Runtimes <b>should</b> not automatically adjust the position of the origin when the viewer moves to a room with a different floor height.

        {@code UNBOUNDED_MSFT} space is useful when an app needs to render <b>world-scale</b> content that spans beyond the bounds of a single {@code STAGE}, for example, an entire floor or multiple floors of a building.

        An {@code UNBOUNDED_MSFT} space maintains stability near the viewer by slightly adjusting its origin over time. The runtime <b>must</b> not queue the ##XrEventDataReferenceSpaceChangePending event in response to these minor adjustments.

        When views, controllers or other spaces experience tracking loss relative to the {@code UNBOUNDED_MSFT} space, runtimes <b>should</b> continue to provide inferred or last-known {@code position} and {@code orientation} values. These inferred poses can, for example, be based on neck model updates, inertial dead reckoning, or a last-known position, so long as it is still reasonable for the application to use that pose. While a runtime is providing position data, it <b>must</b> continue to set #SPACE_LOCATION_POSITION_VALID_BIT and #VIEW_STATE_POSITION_VALID_BIT but it <b>can</b> clear #SPACE_LOCATION_POSITION_TRACKED_BIT and #VIEW_STATE_POSITION_TRACKED_BIT to indicate that the position is inferred or last-known in this way.

        When tracking is recovered, runtimes <b>should</b> snap the pose of other spaces back into position relative to the {@code UNBOUNDED_MSFT} space’s original origin. However, if tracking recovers into a new tracking volume in which the original origin can no longer be located (e.g. the viewer moved through a dark hallway and regained tracking in a new room), the runtime <b>may</b> recenter the origin arbitrarily, for example moving the origin to coincide with the viewer. If such recentering occurs, the runtime <b>must</b> queue the ##XrEventDataReferenceSpaceChangePending event with {@code poseValid} set to false.

        If the viewer moves far enough away from the origin of an {@code UNBOUNDED_MSFT} reference space that floating point error would introduce noticeable error when locating the viewer within that space, the runtime <b>may</b> recenter the space’s origin to a new location closer to the viewer. If such recentering occurs, the runtime <b>must</b> queue the ##XrEventDataReferenceSpaceChangePending event with {@code poseValid} set to true.

        Runtimes <b>must</b> support the {@code UNBOUNDED_MSFT} reference space when this extension is enabled.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_unbounded_reference_space_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_UNBOUNDED_REFERENCE_SPACE_EXTENSION_NAME".."XR_MSFT_unbounded_reference_space"
    )

    EnumConstant(
        "Extends {@code XrReferenceSpaceType}.",

        "REFERENCE_SPACE_TYPE_UNBOUNDED_MSFT".."1000038000"
    )
}