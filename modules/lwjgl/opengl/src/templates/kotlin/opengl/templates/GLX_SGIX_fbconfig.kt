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

    IntConstant(
        "DRAWABLE_TYPE_SGIX"..0x8010,
        "RENDER_TYPE_SGIX"..0x8011,
        "X_RENDERABLE_SGIX"..0x8012
    )

    IntConstant(
        "FBCONFIG_ID_SGIX"..0x8013
    )

    IntConstant(
        "SCREEN_EXT"..0x800C
    )

    IntConstant(
        "WINDOW_BIT_SGIX"..0x00000001,
        "PIXMAP_BIT_SGIX"..0x00000002
    )

    IntConstant(
        "RGBA_BIT_SGIX"..0x00000001,
        "COLOR_INDEX_BIT_SGIX"..0x00000002
    )

    IntConstant(
        "RGBA_TYPE_SGIX"..0x8014,
        "COLOR_INDEX_TYPE_SGIX"..0x8015
    )

    int(
        "GetFBConfigAttribSGIX",

        DISPLAY,
        GLXFBConfigSGIX("config"),
        int("attribute"),
        Check(1)..int.p("value")
    )

    GLXFBConfigSGIX.p(
        "ChooseFBConfigSGIX",

        DISPLAY,
        int("screen"),
        NullTerminated..nullable..int.const.p("attrib_list"),
        AutoSizeResult..int.p("nelements")
    )

    GLXPixmap(
        "CreateGLXPixmapWithConfigSGIX",

        DISPLAY,
        GLXFBConfig("config"),
        Pixmap("pixmap")
    )

    GLXContext(
        "CreateContextWithConfigSGIX",

        DISPLAY,
        GLXFBConfig("config"),
        int("render_type"),
        GLXContext("share_list"),
        Bool("direct")
    )

    XVisualInfo.p(
        "GetVisualFromFBConfigSGIX",

        DISPLAY,
        GLXFBConfig("config")
    )

    GLXFBConfigSGIX(
        "GetFBConfigFromVisualSGIX",

        DISPLAY,
        Input..XVisualInfo.p("vis")
    )

}