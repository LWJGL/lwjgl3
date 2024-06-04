/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_recommended_layer_resolution = "METARecommendedLayerResolution".nativeClassXR("META_recommended_layer_resolution", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_META_recommended_layer_resolution">XR_META_recommended_layer_resolution</a> extension.

        The extension allows an application to request a recommended swapchain resolution from the runtime, in order to either allocate a swapchain of a more appropriate size, or to render into a smaller image rect according to the recommendation. For layers with multiple views such as ##XrCompositionLayerProjection, the application <b>may</b> scale the individual views to match the scaled swapchain resolution.

        The runtime <b>may</b> use any factors to drive the recommendation it wishes to return to the application. Those include static properties such as screen resolution and HMD type, but also dynamic ones such as layer positioning and system-wide GPU utilization.

        Application <b>may</b> also use this extension to allocate the swapchain by passing in a layer with a swapchain handle #NULL_HANDLE.
        """

    IntConstant(
        "The extension specification version.",

        "META_recommended_layer_resolution_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_RECOMMENDED_LAYER_RESOLUTION_EXTENSION_NAME".."XR_META_recommended_layer_resolution"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_RECOMMENDED_LAYER_RESOLUTION_META".."1000254000",
        "TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META".."1000254001"
    )

    XrResult(
        "GetRecommendedLayerResolutionMETA",
        """
        Get the recommended layer resolution for a layer from the runtime.

        <h5>C Specification</h5>
        The #GetRecommendedLayerResolutionMETA() function is defined as:

        <pre><code>
￿XrResult xrGetRecommendedLayerResolutionMETA(
￿    XrSession                                   session,
￿    const XrRecommendedLayerResolutionGetInfoMETA* info,
￿    XrRecommendedLayerResolutionMETA*           resolution);</code></pre>

        <h5>Description</h5>
        The #GetRecommendedLayerResolutionMETA() function returns the recommendation that the runtime wishes to make to the application for the layer provided in the ##XrRecommendedLayerResolutionGetInfoMETA structure. Application <b>may</b> choose to reallocate their swapchain or scale view resolution accordingly. Applications rendering multiple views into the swapchain <b>may</b> scale individual views to match the recommended swapchain resolution.

        The runtime <b>may</b> not wish to make any recommendation, in which case it <b>must</b> return an ##XrRecommendedLayerResolutionMETA{@code ::isValid} value of #FALSE.

        If the ##XrRecommendedLayerResolutionGetInfoMETA{@code ::layer} attribute of the {@code info} argument of the function contains valid swapchain handles in all fields where required, the runtime <b>must</b> return a resolution recommendation which is less than or equal to the size of that swapchain, so that the application <b>may</b> render into an existing swapchain or swapchains without reallocation. As an exception to valid usage, an otherwise-valid structure passed as ##XrRecommendedLayerResolutionGetInfoMETA{@code ::layer} <b>may</b> contain #NULL_HANDLE in place of valid {@code XrSwapchain} handle(s) for this function only, to obtain a recommended resolution resolution for the purpose of allocating a swapchain. If at least one otherwise-required {@code XrSwapchain} handle within ##XrRecommendedLayerResolutionGetInfoMETA{@code ::layer} is #NULL_HANDLE, the runtime <b>must</b> interpret this as a request for recommended resolution without limitation to the allocated size of any existing swapchain.

        If the runtime makes a recommendation, it <b>should</b> make a recommendation that is directly usable by the application to render its frames without creating adverse visual effects for the user.

        <h5>See Also</h5>
        ##XrRecommendedLayerResolutionGetInfoMETA, ##XrRecommendedLayerResolutionMETA
        """,

        XrSession("session", "the {@code XrSession} in which the recommendation is made."),
        XrRecommendedLayerResolutionGetInfoMETA.const.p("info", "a pointer to an ##XrRecommendedLayerResolutionGetInfoMETA structure containing the details of the layer for which the application is requesting a recommendation."),
        XrRecommendedLayerResolutionMETA.p("resolution", "a pointer to an ##XrRecommendedLayerResolutionMETA that the runtime will populate.")
    )
}