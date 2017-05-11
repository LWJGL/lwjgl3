/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OVR_multiview = "OVRMultiview".nativeClassGLES("OVR_multiview", postfix = OVR) {
    documentation =
        """
        Native bindings to the ${registryLink("OVR", "multiview")} extension.

        The method of stereo rendering supported in OpenGL is currently achieved by rendering to the two eye buffers sequentially. This typically incurs double
        the application and driver overhead, despite the fact that the command streams and render states are almost identical.

        This extension seeks to address the inefficiency of sequential multiview rendering by adding a means to render to multiple elements of a 2D texture
        array simultaneously. In multiview rendering, draw calls are instanced into each corresponding element of the texture array. The vertex program uses a
        new ViewID variable to compute per-view values, typically the vertex position and view-dependent variables like reflection.

        The formulation of this extension is high level in order to allow implementation freedom. On existing hardware, applications and drivers can realize
        the benefits of a single scene traversal, even if all GPU work is fully duplicated per-view. But future support could enable simultaneous rendering via
        multi-GPU, tile-based architectures could sort geometry into tiles for multiple views in a single pass, and the implementation could even choose to
        interleave at the fragment level for better texture cache utilization and more coherent fragment shader branching.

        The most obvious use case in this model is to support two simultaneous views: one view for each eye. However, we also anticipate a usage where two
        views are rendered per eye, where one has a wide field of view and the other has a narrow one. The nature of wide field of view planar projection is
        that the sample density can become unacceptably low in the view direction. By rendering two inset eye views per eye, we can get the required sample
        density in the center of projection without wasting samples, memory, and time by oversampling in the periphery.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

        "FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR"..0x9630,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR"..0x9632
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv.",

        "MAX_VIEWS_OVR"..0x9631
    )

    IntConstant(
        "Returned by CheckFramebufferStatus.",

        "FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR"..0x9633
    )

    void(
        "FramebufferTextureMultiviewOVR",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLint.IN("baseViewIndex", ""),
        GLsizei.IN("numViews", "")
    )
}