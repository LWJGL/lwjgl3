/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val QCOM_tiled_rendering = "QCOMTiledRendering".nativeClassGLES("QCOM_tiled_rendering", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        In the handheld graphics space, a typical challenge is achieving efficient rendering performance given the different characteristics of the various
        types of graphics memory. Some types of memory ("slow" memory) are less expensive but have low bandwidth, higher latency, and/or higher power
        consumption, while other types ("fast" memory) are more expensive but have higher bandwidth, lower latency, and/or lower power consumption. In many
        cases, it is more efficient for a graphics processing unit (GPU) to render directly to fast memory, but at most common display resolutions it is not
        practical for a device to contain enough fast memory to accommodate both the full color and depth/stencil buffers (the frame buffer). In some devices,
        this problem can be addressed by providing both types of memory; a large amount of slow memory that is sufficient to store the entire frame buffer, and
        a small, dedicated amount of fast memory that allows the GPU to render with optimal performance. The challenge lies in finding a way for the GPU to
        render to fast memory when it is not large enough to contain the actual frame buffer.

        One approach to solving this problem is to design the GPU and/or driver using a tiled rendering architecture. With this approach the render target is
        subdivided into a number of individual tiles, which are sized to fit within the available amount of fast memory. Under normal operation, the entire
        scene will be rendered to each individual tile using a multi-pass technique, in which primitives that lie entirely outside of the tile being rendered
        are trivially discarded. After each tile has been rendered, its contents are saved out to the actual frame buffer in slow memory (a process referred to
        as the "resolve"). The resolve introduces significant overhead, both for the CPU and the GPU. However, even with this additional overhead, rendering
        using this method is usually more efficient than rendering directly to slow memory.

        This extension allows the application to specify a rectangular tile rendering area and have full control over the resolves for that area. The
        information given to the driver through this API can be used to perform various optimizations in the driver and hardware. One example optimization is
        being able to reduce the size or number of the resolves. Another optimization might be to reduce the number of passes needed in the tiling approach
        mentioned above. Even traditional rendering GPUs that don't use tiles may benefit from this extension depending on their implemention of certain common
        GPU operations.

        One typical use case could involve an application only rendering to select portions of the render target using this technique (which shall be referred
        to as "application tiling"), leaving all other portions of the render target untouched. Therefore, in order to preserve the contents of the untouched
        portions of the render target, the application must request an EGL (or other context management API) configuration with a non-destructive swap. A
        destructive swap may only be used safely if the application renders to the entire area of the render target during each frame (otherwise the contents
        of the untouched portions of the frame buffer will be undefined).

        Additionally, care must be taken to avoid the cost of mixing rendering with and without application tiling within a single frame. Rendering without
        application tiling ("normal" rendering) is most efficient when all of the rendering for the entire scene can be encompassed within a single resolve. If
        any portions of the scene are rendered prior to that resolve (such as via a prior resolve, or via application tiling), then that resolve becomes much
        more heavyweight. When this occurs, prior to rendering each tile the fast memory must be populated with the existing contents of the frame buffer
        region corresponding to that tile. This operation can double the cost of resolves, so it is recommended that applications avoid mixing application
        tiling and normal rendering within a single frame. If both rendering methods must be used in the same frame, then the most efficient approach is to
        perform all normal rendering first, followed by rendering done with application tiling. An implicit resolve will occur (if needed) at the start of
        application tiling, so any pending normal rendering operations will be flushed at the time application tiling is initiated. This extension provides
        interfaces for the application to communicate to the driver whether or not rendering done with application tiling depends on the existing contents of
        the specified tile, and whether or not the rendered contents of the specified tile need to be preserved upon completion. This mechanism can be used to
        obtain optimal performance, e.g. when the application knows that every pixel in a tile will be completely rendered or when the resulting contents of
        the depth/stencil buffers do not need to be preserved.
        """

    IntConstant(
        "Accepted by the {@code preserveMask} parameter of StartTilingQCOM and EndTilingQCOM.",

        "COLOR_BUFFER_BIT0_QCOM"..0x00000001,
        "COLOR_BUFFER_BIT1_QCOM"..0x00000002,
        "COLOR_BUFFER_BIT2_QCOM"..0x00000004,
        "COLOR_BUFFER_BIT3_QCOM"..0x00000008,
        "COLOR_BUFFER_BIT4_QCOM"..0x00000010,
        "COLOR_BUFFER_BIT5_QCOM"..0x00000020,
        "COLOR_BUFFER_BIT6_QCOM"..0x00000040,
        "COLOR_BUFFER_BIT7_QCOM"..0x00000080,
        "DEPTH_BUFFER_BIT0_QCOM"..0x00000100,
        "DEPTH_BUFFER_BIT1_QCOM"..0x00000200,
        "DEPTH_BUFFER_BIT2_QCOM"..0x00000400,
        "DEPTH_BUFFER_BIT3_QCOM"..0x00000800,
        "DEPTH_BUFFER_BIT4_QCOM"..0x00001000,
        "DEPTH_BUFFER_BIT5_QCOM"..0x00002000,
        "DEPTH_BUFFER_BIT6_QCOM"..0x00004000,
        "DEPTH_BUFFER_BIT7_QCOM"..0x00008000,
        "STENCIL_BUFFER_BIT0_QCOM"..0x00010000,
        "STENCIL_BUFFER_BIT1_QCOM"..0x00020000,
        "STENCIL_BUFFER_BIT2_QCOM"..0x00040000,
        "STENCIL_BUFFER_BIT3_QCOM"..0x00080000,
        "STENCIL_BUFFER_BIT4_QCOM"..0x00100000,
        "STENCIL_BUFFER_BIT5_QCOM"..0x00200000,
        "STENCIL_BUFFER_BIT6_QCOM"..0x00400000,
        "STENCIL_BUFFER_BIT7_QCOM"..0x00800000,
        "MULTISAMPLE_BUFFER_BIT0_QCOM"..0x01000000,
        "MULTISAMPLE_BUFFER_BIT1_QCOM"..0x02000000,
        "MULTISAMPLE_BUFFER_BIT2_QCOM"..0x04000000,
        "MULTISAMPLE_BUFFER_BIT3_QCOM"..0x08000000,
        "MULTISAMPLE_BUFFER_BIT4_QCOM"..0x10000000,
        "MULTISAMPLE_BUFFER_BIT5_QCOM"..0x20000000,
        "MULTISAMPLE_BUFFER_BIT6_QCOM"..0x40000000,
        "MULTISAMPLE_BUFFER_BIT7_QCOM".."0x80000000"
    )

    void(
        "StartTilingQCOM",
        "",

        GLuint.IN("x", ""),
        GLuint.IN("y", ""),
        GLuint.IN("width", ""),
        GLuint.IN("height", ""),
        GLbitfield.IN("preserveMask", "")
    )

    void(
        "EndTilingQCOM",
        "",

        GLbitfield.IN("preserveMask", "")
    )
}