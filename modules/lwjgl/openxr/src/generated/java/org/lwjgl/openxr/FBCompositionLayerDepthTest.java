/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_composition_layer_depth_test">XR_FB_composition_layer_depth_test</a> extension.
 * 
 * <p>This extension enables depth-tested layer composition. The compositor will maintain a depth buffer in addition to a color buffer. The depth buffer is cleared to a depth corresponding to the infinitely far distance at the beginning of composition.</p>
 * 
 * <p>When composing each layer, if depth testing is requested, the incoming layer depths are transformed into the compositor window space depth and compared to the depth stored in the frame buffer. After the transformation, incoming depths that are outside of the range of the compositor window space depth <b>must</b> be clamped. If the depth test fails, the fragment is discarded. If the depth test passes the depth buffer is updated if depth writes are enabled, and color processing continues.</p>
 * 
 * <p>Depth testing requires depth values for the layer. For projection layers, this can be supplied via the {@link KHRCompositionLayerDepth XR_KHR_composition_layer_depth} extension. For geometric primitive layers, the runtime computes the depth of the sample directly from the layer parameters. An {@link XrCompositionLayerDepthTestFB} chained to layers without depth <b>must</b> be ignored.</p>
 */
public final class FBCompositionLayerDepthTest {

    /** The extension specification version. */
    public static final int XR_FB_composition_layer_depth_test_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_COMPOSITION_LAYER_DEPTH_TEST_EXTENSION_NAME = "XR_FB_composition_layer_depth_test";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB = 1000212000;

    /**
     * XrCompareOpFB - Compare Operation
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_COMPARE_OP_NEVER_FB COMPARE_OP_NEVER_FB} — Comparison is never true.</li>
     * <li>{@link #XR_COMPARE_OP_LESS_FB COMPARE_OP_LESS_FB} — Comparison is true if source less than is destination.</li>
     * <li>{@link #XR_COMPARE_OP_EQUAL_FB COMPARE_OP_EQUAL_FB} — Comparison is true if source is equal to destination.</li>
     * <li>{@link #XR_COMPARE_OP_LESS_OR_EQUAL_FB COMPARE_OP_LESS_OR_EQUAL_FB} — Comparison is true if source is less than or equal to destination.</li>
     * <li>{@link #XR_COMPARE_OP_GREATER_FB COMPARE_OP_GREATER_FB} — Comparison is true if source is greater than destination.</li>
     * <li>{@link #XR_COMPARE_OP_NOT_EQUAL_FB COMPARE_OP_NOT_EQUAL_FB} — Comparison is true if source is not equal to destination.</li>
     * <li>{@link #XR_COMPARE_OP_GREATER_OR_EQUAL_FB COMPARE_OP_GREATER_OR_EQUAL_FB} — Comparison is true if source is greater than or equal to destination.</li>
     * <li>{@link #XR_COMPARE_OP_ALWAYS_FB COMPARE_OP_ALWAYS_FB} — Comparison is always true.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrCompositionLayerDepthTestFB}</p>
     */
    public static final int
        XR_COMPARE_OP_NEVER_FB            = 0,
        XR_COMPARE_OP_LESS_FB             = 1,
        XR_COMPARE_OP_EQUAL_FB            = 2,
        XR_COMPARE_OP_LESS_OR_EQUAL_FB    = 3,
        XR_COMPARE_OP_GREATER_FB          = 4,
        XR_COMPARE_OP_NOT_EQUAL_FB        = 5,
        XR_COMPARE_OP_GREATER_OR_EQUAL_FB = 6,
        XR_COMPARE_OP_ALWAYS_FB           = 7;

    private FBCompositionLayerDepthTest() {}

}