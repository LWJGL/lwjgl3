/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_EXT_import_context = "GLXEXTImportContext".nativeClassGLX("GLX_EXT_import_context", EXT) {
    IntConstant(
        "SHARE_CONTEXT_EXT"..0x800A,
        "VISUAL_ID_EXT"..0x800B,
        "SCREEN_EXT"..0x800C
    )

    Display.p(
        "GetCurrentDisplayEXT",
        void()
    )

    int(
        "QueryContextInfoEXT",

        DISPLAY,
        GLXContext("context"),
        int("attribute"),
        Check(1)..int.p("value")
    )

    GLXContextID(
        "GetContextIDEXT",

        GLXContext.const("context")
    )

    GLXContext(
        "ImportContextEXT",

        DISPLAY,
        GLXContextID("contextID")
    )

    void(
        "FreeContextEXT",

        DISPLAY,
        GLXContext("context")
    )

}