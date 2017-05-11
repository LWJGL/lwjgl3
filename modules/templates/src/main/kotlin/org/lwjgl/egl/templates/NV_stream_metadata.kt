/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_stream_metadata = "NVStreamMetadata".nativeClassEGL("NV_stream_metadata", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Application suites which make use of streams to transmit images may need to communicate additional data between the producer and consumer, synchronized
        with the frame updates. This data may change infrequently, such as a movie title and track number to be displayed to the user, or every frame, such as
        a focal length and exposure time used to process the image. Transmitting this data outside the scope of the stream may be inconvenient, particularly in
        the case of cross-process streams. But the nature of the data is highly application-dependent, so it is not feasible for an EGL implementation to
        define specific extensions for a broad range of application data.

        This extension provides a means for an application (or application suite in the cross-process case) to associate arbitrary metadata with a stream.
        Multiple metadata fields are available, allowing them to be updated and used independently by separate subcomponents of producers and consumers,
        respectively. The format of the data is determined by the application, which is responsible for writing and reading it correctly.

        Requires ${KHR_stream.link}.
        """

    IntConstant(
        "Accepted as {@code attribute} by #QueryDisplayAttribNV().",

        "MAX_STREAM_METADATA_BLOCKS_NV"..0x3250,
        "MAX_STREAM_METADATA_BLOCK_SIZE_NV"..0x3251,
        "MAX_STREAM_METADATA_TOTAL_SIZE_NV"..0x3252
    )

    IntConstant(
        "Accepted as {@code name} by #QueryStreamMetadataNV().",

        "PRODUCER_METADATA_NV"..0x3253,
        "CONSUMER_METADATA_NV"..0x3254,
        "PENDING_METADATA_NV"..0x3328
    )

    IntConstant(
        "Accepted in {@code attrib_list} by #CreateStreamKHR() and as {@code attribute} by #QueryStreamKHR().",

        "METADATA0_SIZE_NV"..0x3255,
        "METADATA1_SIZE_NV"..0x3256,
        "METADATA2_SIZE_NV"..0x3257,
        "METADATA3_SIZE_NV"..0x3258,
        "METADATA0_TYPE_NV"..0x3259,
        "METADATA1_TYPE_NV"..0x325A,
        "METADATA2_TYPE_NV"..0x325B,
        "METADATA3_TYPE_NV"..0x325C
    )

    EGLBoolean(
        "QueryDisplayAttribNV",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLint.IN("attribute", ""),
        Check(1)..EGLAttrib_p.OUT("value", "")
    )

    EGLBoolean(
        "SetStreamMetadataNV",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        EGLint.IN("n", ""),
        EGLint.IN("offset", ""),
        AutoSize("data")..EGLint.IN("size", ""),
        const..void_p.IN("data", "")
    )

    EGLBoolean(
        "QueryStreamMetadataNV",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        EGLenum.IN("name", ""),
        EGLint.IN("n", ""),
        EGLint.IN("offset", ""),
        AutoSize("data")..EGLint.IN("size", ""),
        void_p.OUT("data", "")
    )
}