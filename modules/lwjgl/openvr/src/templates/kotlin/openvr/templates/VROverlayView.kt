/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VROverlayView = "VROverlayView".nativeClass(
    Module.OPENVR,
    prefixMethod = "VROverlayView_",
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    EVROverlayError(
        "AcquireOverlayView",
        """
        Acquires an {@code OverlayView_t} from an overlay handle

        The overlay view can be used to sample the contents directly by a native API. The contents of the {@code OverlayView_t} will remain unchanged through
        the lifetime of the {@code OverlayView_t}.

        The caller acquires read privileges over the {@code OverlayView_t}, but should not write to it.

        {@code AcquireOverlayView()} may be called on the same {@code ulOverlayHandle} multiple times to refresh the image contents. In this case the caller is
        strongly encouraged to re-use the same {@code pOverlayView} for all re-acquisition calls.

        If the producer has not yet queued an image, {@code AcquireOverlayView} will return success, and the {@code Texture_t} will have the expected
        {@code ETextureType}. However, the {@code Texture_t->handle} will be {@code nullptr}. Once the producer generates the first overlay frame,
        {@code Texture_t->handle} will become a valid handle.
        """,

        VROverlayHandle_t("ulOverlayHandle", ""),
        VRNativeDevice_t.p("pNativeDevice", ""),
        VROverlayView_t.p("pOverlayView", ""),
        uint32_t("unOverlayViewSize", "")
    )

    EVROverlayError(
        "ReleaseOverlayView",
        """
        Releases an acquired {@code OverlayView_t}.

        Denotes that {@code pOverlayView} will no longer require access to the resources it acquired in all previous calls to {@code AcquireOverlayView()}.

        All {@code OverlayView_t*}'s provided to {@code AcquireOverlayView()} as {@code pOverlayViews} must be passed into {@code ReleaseOverlayView()} in
        order for the underlying GPU resources to be freed.
        """,

        VROverlayView_t.p("pOverlayView", "")
    )

    void(
        "PostOverlayEvent",
        "Posts an overlay event.",

        VROverlayHandle_t("ulOverlayHandle", ""),
        VREvent_t.p("pvrEvent", "")
    )

    bool(
        "IsViewingPermitted",
        "Determines whether this process is permitted to view an overlay's content.",

        VROverlayHandle_t("ulOverlayHandle", "")
    )
}