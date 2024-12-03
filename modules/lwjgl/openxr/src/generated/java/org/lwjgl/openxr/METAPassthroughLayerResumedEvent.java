/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_META_passthrough_layer_resumed_event">XR_META_passthrough_layer_resumed_event</a> extension.
 * 
 * <p>This extension defines an event that is emitted once a passthrough layer (created using {@link FBPassthrough XR_FB_passthrough}) is resumed and ready for displaying after a resume command or when the passthrough layer was created with {@link FBPassthrough#XR_PASSTHROUGH_IS_RUNNING_AT_CREATION_BIT_FB PASSTHROUGH_IS_RUNNING_AT_CREATION_BIT_FB}.</p>
 * 
 * <p>The functions {@link FBPassthrough#xrPassthroughLayerResumeFB PassthroughLayerResumeFB} and {@link FBPassthrough#xrCreatePassthroughLayerFB CreatePassthroughLayerFB} from {@link FBPassthrough XR_FB_passthrough} are asynchronous without any guarantees on when their effect will be visible on the display. Runtimes <b>may</b> asynchronously perform operations which <b>may</b> take several frames to complete, such as turning on sensor hardware. Runtimes queue this event under the aforementioned conditions when this extension is requested during instance creation.</p>
 * 
 * <p>Unlike most extensions, to start receiving the event, an app only needs to enable this extension.</p>
 * 
 * <p>This extension depends on {@link FBPassthrough XR_FB_passthrough}.</p>
 */
public final class METAPassthroughLayerResumedEvent {

    /** The extension specification version. */
    public static final int XR_META_passthrough_layer_resumed_event_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_PASSTHROUGH_LAYER_RESUMED_EVENT_EXTENSION_NAME = "XR_META_passthrough_layer_resumed_event";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META = 1000282000;

    private METAPassthroughLayerResumedEvent() {}

}