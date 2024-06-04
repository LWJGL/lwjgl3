/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_META_recommended_layer_resolution">XR_META_recommended_layer_resolution</a> extension.
 * 
 * <p>The extension allows an application to request a recommended swapchain resolution from the runtime, in order to either allocate a swapchain of a more appropriate size, or to render into a smaller image rect according to the recommendation. For layers with multiple views such as {@link XrCompositionLayerProjection}, the application <b>may</b> scale the individual views to match the scaled swapchain resolution.</p>
 * 
 * <p>The runtime <b>may</b> use any factors to drive the recommendation it wishes to return to the application. Those include static properties such as screen resolution and HMD type, but also dynamic ones such as layer positioning and system-wide GPU utilization.</p>
 * 
 * <p>Application <b>may</b> also use this extension to allocate the swapchain by passing in a layer with a swapchain handle {@link XR10#XR_NULL_HANDLE NULL_HANDLE}.</p>
 */
public class METARecommendedLayerResolution {

    /** The extension specification version. */
    public static final int XR_META_recommended_layer_resolution_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_RECOMMENDED_LAYER_RESOLUTION_EXTENSION_NAME = "XR_META_recommended_layer_resolution";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_META TYPE_RECOMMENDED_LAYER_RESOLUTION_META}</li>
     * <li>{@link #XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_META          = 1000254000,
        XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META = 1000254001;

    protected METARecommendedLayerResolution() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetRecommendedLayerResolutionMETA ] ---

    /** Unsafe version of: {@link #xrGetRecommendedLayerResolutionMETA GetRecommendedLayerResolutionMETA} */
    public static int nxrGetRecommendedLayerResolutionMETA(XrSession session, long info, long resolution) {
        long __functionAddress = session.getCapabilities().xrGetRecommendedLayerResolutionMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrRecommendedLayerResolutionGetInfoMETA.validate(info);
        }
        return callPPPI(session.address(), info, resolution, __functionAddress);
    }

    /**
     * Get the recommended layer resolution for a layer from the runtime.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetRecommendedLayerResolutionMETA GetRecommendedLayerResolutionMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetRecommendedLayerResolutionMETA(
     *     XrSession                                   session,
     *     const XrRecommendedLayerResolutionGetInfoMETA* info,
     *     XrRecommendedLayerResolutionMETA*           resolution);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetRecommendedLayerResolutionMETA GetRecommendedLayerResolutionMETA} function returns the recommendation that the runtime wishes to make to the application for the layer provided in the {@link XrRecommendedLayerResolutionGetInfoMETA} structure. Application <b>may</b> choose to reallocate their swapchain or scale view resolution accordingly. Applications rendering multiple views into the swapchain <b>may</b> scale individual views to match the recommended swapchain resolution.</p>
     * 
     * <p>The runtime <b>may</b> not wish to make any recommendation, in which case it <b>must</b> return an {@link XrRecommendedLayerResolutionMETA}{@code ::isValid} value of {@link XR10#XR_FALSE FALSE}.</p>
     * 
     * <p>If the {@link XrRecommendedLayerResolutionGetInfoMETA}{@code ::layer} attribute of the {@code info} argument of the function contains valid swapchain handles in all fields where required, the runtime <b>must</b> return a resolution recommendation which is less than or equal to the size of that swapchain, so that the application <b>may</b> render into an existing swapchain or swapchains without reallocation. As an exception to valid usage, an otherwise-valid structure passed as {@link XrRecommendedLayerResolutionGetInfoMETA}{@code ::layer} <b>may</b> contain {@link XR10#XR_NULL_HANDLE NULL_HANDLE} in place of valid {@code XrSwapchain} handle(s) for this function only, to obtain a recommended resolution resolution for the purpose of allocating a swapchain. If at least one otherwise-required {@code XrSwapchain} handle within {@link XrRecommendedLayerResolutionGetInfoMETA}{@code ::layer} is {@link XR10#XR_NULL_HANDLE NULL_HANDLE}, the runtime <b>must</b> interpret this as a request for recommended resolution without limitation to the allocated size of any existing swapchain.</p>
     * 
     * <p>If the runtime makes a recommendation, it <b>should</b> make a recommendation that is directly usable by the application to render its frames without creating adverse visual effects for the user.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrRecommendedLayerResolutionGetInfoMETA}, {@link XrRecommendedLayerResolutionMETA}</p>
     *
     * @param session    the {@code XrSession} in which the recommendation is made.
     * @param info       a pointer to an {@link XrRecommendedLayerResolutionGetInfoMETA} structure containing the details of the layer for which the application is requesting a recommendation.
     * @param resolution a pointer to an {@link XrRecommendedLayerResolutionMETA} that the runtime will populate.
     */
    @NativeType("XrResult")
    public static int xrGetRecommendedLayerResolutionMETA(XrSession session, @NativeType("XrRecommendedLayerResolutionGetInfoMETA const *") XrRecommendedLayerResolutionGetInfoMETA info, @NativeType("XrRecommendedLayerResolutionMETA *") XrRecommendedLayerResolutionMETA resolution) {
        return nxrGetRecommendedLayerResolutionMETA(session, info.address(), resolution.address());
    }

}