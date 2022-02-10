/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val OVR_multiview = "OVRMultiview".nativeClassGL("OVR_multiview", postfix = OVR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The method of stereo rendering supported in OpenGL is currently achieved by rendering to the two eye buffers sequentially. This typically incurs double
        the application and driver overhead, despite the fact that the command streams and render states are almost identical.

        This extension seeks to address the inefficiency of sequential multiview rendering by adding a means to render to multiple elements of a 2D texture
        array simultaneously. In multiview rendering, draw calls are instanced into each corresponding element of the texture array. The vertex program uses a
        new {@code gl_ViewID_OVR} variable to compute per-view values, typically the vertex position and view-dependent variables like reflection.

        The formulation of this extension is high level in order to allow implementation freedom. On existing hardware, applications and drivers can realize
        the benefits of a single scene traversal, even if all GPU work is fully duplicated per-view. But future support could enable simultaneous rendering via
        multi-GPU, tile-based architectures could sort geometry into tiles for multiple views in a single pass, and the implementation could even choose to
        interleave at the fragment level for better texture cache utilization and more coherent fragment shader branching.

        The most obvious use case in this model is to support two simultaneous views: one view for each eye. However, we also anticipate a usage where two
        views are rendered per eye, where one has a wide field of view and the other has a narrow one. The nature of wide field of view planar projection is
        that the sample density can become unacceptably low in the view direction. By rendering two inset eye views per eye, we can get the required sample
        density in the center of projection without wasting samples, memory, and time by oversampling in the periphery.

        Requires ${GL30.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetFramebufferAttachmentParameteriv().",

        "FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR"..0x9630,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR"..0x9632
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv.",

        "MAX_VIEWS_OVR"..0x9631
    )

    IntConstant(
        "Returned by #CheckFramebufferStatus().",

        "FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR"..0x9633
    )

    val FramebufferTextureLayer = GL30["FramebufferTextureLayer"]

    void(
        "FramebufferTextureMultiviewOVR",
        """
        Operates similarly to the #FramebufferTextureLayer() command, except that {@code baseViewIndex} and {@code numViews} select a range of texture array
        elements that will be targeted when rendering. Such an attachment is considered <i>multiview</i> and rendering commands issued when such a framebuffer
        object is bound are termed "multiview rendering". The maximum number of views which can be bound simultaneously is determined by the value of
        #MAX_VIEWS_OVR, which can be queried with the #GetIntegerv() command.

        The command
        ${codeBlock("""
View( uint id );""")}
        does not exist in the GL, but is used here to describe the multiview functionality in this section. The effect of this hypothetical function is to set
        the value of the shader built-in input {@code gl_ViewID_OVR}.

        When multiview rendering is enabled, the {@code Clear}, {@code ClearBuffer*}, {@code Draw*}, and {@code Dispatch*} commands have the same effect as:
        ${codeBlock("""
for( int i = 0; i < numViews; i++ ) {
    FramebufferTextureLayer( target, attachment, texture, level, baseViewIndex + i );
    View( i );
    <drawing-command>
}""")}
        The result is that every drawing command is broadcast into every active view. The shader uses {@code gl_ViewID_OVR} to compute view dependent outputs.

        The number of views, as specified by {@code numViews}, must be the same for all framebuffer attachments points where the value of
        #FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE is not #NONE or the framebuffer is incomplete.

        If {@code texture} is non-zero and the command does not result in an error, the framebuffer attachment state corresponding to {@code attachment} is
        updated as in the #FramebufferTextureLayer() command, except that the values of #FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER and
        #FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR are is set to {@code baseViewIndex}, and the value of #FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR
        is set to {@code numViews}.

        <h5>Errors</h5>

        In addition to the corresponding errors for #FramebufferTextureLayer() when called with the same parameters (other than {@code layer}):

        An #INVALID_VALUE error is generated if:
        ${ul(
            "{@code numViews} is less than 1 or if {@code numViews} is greater than #MAX_VIEWS_OVR.",
            """
            {@code texture} is a two-dimensional array texture and {@code baseViewIndex} + {@code numViews} is larger than the value of
            #MAX_ARRAY_TEXTURE_LAYERS minus one.
            """,
            "{@code texture} is non-zero and {@code baseViewIndex} is negative."
        )}

        An #INVALID_OPERATION error is generated if texture is non-zero and is not the name of a two-dimensional array texture.
        """,

        FramebufferTextureLayer["target"],
        FramebufferTextureLayer["attachment"],
        FramebufferTextureLayer["texture"],
        FramebufferTextureLayer["level"],
        GLint("baseViewIndex", "the base framebuffer texture layer index"),
        GLsizei("numViews", "the number of views to target when rendering")
    )

    val NamedFramebufferTextureLayer = GL45["NamedFramebufferTextureLayer"]

    DependsOn("hasDSA(ext)")..void(
        "NamedFramebufferTextureMultiviewOVR",
        "",

        NamedFramebufferTextureLayer["framebuffer"],
        NamedFramebufferTextureLayer["attachment"],
        NamedFramebufferTextureLayer["texture"],
        NamedFramebufferTextureLayer["level"],
        GLint("baseViewIndex", ""),
        GLsizei("numViews", "")
    )
}
