/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_SGIX_fbconfig = "GLXSGIXFBConfig".nativeClassGLX("GLX_SGIX_fbconfig", SGIX) {
    javaImport("org.lwjgl.system.linux.*")

    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces a new way to describe the capabilities of a GLX drawable (i.e., to describe the depth of color buffer components and the type
        and size of ancillary buffers), removes the "similarity" requirement when making a context current to a drawable, and supports  RGBA rendering to
        one-and two-component Windows and GLX Pixmaps.
        """

    IntConstant(
        "Accepted by the {@code attribute} parameter of #GetFBConfigAttribSGIX(), and by the {@code attrib_list} parameter of #ChooseFBConfigSGIX().",

        "DRAWABLE_TYPE_SGIX"..0x8010,
        "RENDER_TYPE_SGIX"..0x8011,
        "X_RENDERABLE_SGIX"..0x8012
    )

    IntConstant(
        """
        Accepted by the {@code attribute} parameter of #GetFBConfigAttribSGIX(), the {@code attrib_list} parameter of #ChooseFBConfigSGIX(),
        by the {@code attribute} parameter of #QueryGLXPbufferSGIX() and by the {@code attribute} parameter of
        #QueryContextInfoEXT().
        """,

        "FBCONFIG_ID_SGIX"..0x8013
    )

    IntConstant(
        "Accepted by the {@code attribute} parameter of #GetFBConfigAttribSGIX().",

        "SCREEN_EXT"..0x800C
    )

    IntConstant(
        """
        Returned by #GetFBConfigAttribSGIX() (when {@code attribute} is set to #DRAWABLE_TYPE_SGIX) and accepted by the {@code attrib_list}
        parameter of #ChooseFBConfigSGIX() (following the #DRAWABLE_TYPE_SGIX token).
        """,

        "WINDOW_BIT_SGIX"..0x00000001,
        "PIXMAP_BIT_SGIX"..0x00000002
    )

    IntConstant(
        """
        Returned by #GetFBConfigAttribSGIX() (when {@code attribute} is set to #RENDER_TYPE_SGIX) and accepted by the {@code attrib_list}
        parameter of #ChooseFBConfigSGIX() (following the #RENDER_TYPE_SGIX token).
        """,

        "RGBA_BIT_SGIX"..0x00000001,
        "COLOR_INDEX_BIT_SGIX"..0x00000002
    )

    val RenderTypes = IntConstant(
        "Accepted by the {@code render_type} parameter of #CreateContextWithConfigSGIX().",

        "RGBA_TYPE_SGIX"..0x8014,
        "COLOR_INDEX_TYPE_SGIX"..0x8015
    ).javaDocLinks

    int(
        "GetFBConfigAttribSGIX",
        "Gets the value of a GLX attribute for a {@code GLXFBConfigSGIX}.",

        DISPLAY,
        GLXFBConfigSGIX.IN("config", "the {@code GLXFBConfigSGIX} being queried"),
        int.IN("attribute", "the attribute to query"),
        Check(1)..int.p.OUT("value", "returns the attribute value")
    )

    GLXFBConfigSGIX.p(
        "ChooseFBConfigSGIX",
        "Gets {@code GLXFBConfigSGIX}s that match a list of attributes or to get the list of GLXFBConfigSGIXs that are available on the specified screen.",

        DISPLAY,
        int.IN("screen", "the screen number"),
        NullTerminated..nullable..int.const.p.IN("attrib_list", "an optional list of attributes, terminated with org.lwjgl.system.linux.{@code None}"),
        AutoSizeResult..int.p.OUT("nelements", "the number of {@code GLXFBConfigSGIX} returned")
    )

    GLXPixmap(
        "CreateGLXPixmapWithConfigSGIX",
        "Creates a GLX pixmap using a {@code GLXFBConfigSGIX}.",

        DISPLAY,
        GLXFBConfig.IN("config", "the {@code GLXFBConfigSGIX}"),
        Pixmap.IN("pixmap", "the pixmap")
    )

    GLXContext(
        "CreateContextWithConfigSGIX",
        "Creates a GLX context using a {@code GLXFBConfigSGIX}.",

        DISPLAY,
        GLXFBConfig.IN("config", "the {@code GLXFBConfigSGIX}"),
        int.IN("render_type", "the render type", RenderTypes),
        GLXContext.IN("share_list", "the GLX context to share objects with"),
        Bool.IN("direct", "direct rendering request")
    )

    XVisualInfo.p(
        "GetVisualFromFBConfigSGIX",
        "Retrieves the associated visual of a {@code GLXFBConfigSGIX}.",

        DISPLAY,
        GLXFBConfig.IN("config", "the {@code GLXFBConfigSGIX}")
    )

    GLXFBConfigSGIX(
        "GetFBConfigFromVisualSGIX",
        "Retrieves the {@code GLXFBConfigSGIX} associated with a visual.",

        DISPLAY,
        XVisualInfo.p.IN("vis", "the visual")
    )

}