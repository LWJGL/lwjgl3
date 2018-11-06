/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_EXT_import_context = "GLXEXTImportContext".nativeClassGLX("GLX_EXT_import_context", EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows multiple X clients to share an indirect rendering context.

        Additional convenience procedures to get the current Display* bound to a context as well as other context information are also added.
        """

    IntConstant(
        "Accepted by the {@code attribute} parameter of #QueryContextInfoEXT().",

        "SHARE_CONTEXT_EXT"..0x800A,
        "VISUAL_ID_EXT"..0x800B,
        "SCREEN_EXT"..0x800C
    )

    Display.p(
        "GetCurrentDisplayEXT",
        "Returns the display associated with the current context.",
        void()
    )

    int(
        "QueryContextInfoEXT",
        "Obtains the value of a context's attribute.",

        DISPLAY,
        GLXContext("context", "the context being queried"),
        int("attribute", "the attribute to query"),
        Check(1)..int.p("value", "returns the attribute value")
    )

    GLXContextID(
        "GetContextIDEXT",
        "Returns the XID of a GLXContext.",

        GLXContext.const("context", "the context")
    )

    GLXContext(
        "ImportContextEXT",
        "May be used in place of glXCreateContext to share another process's indirect rendering context.",

        DISPLAY,
        GLXContextID("contextID", "the context XID")
    )

    void(
        "FreeContextEXT",
        "Frees the client-side part of a GLXContext that was created  with #ImportContextEXT().",

        DISPLAY,
        GLXContext("context", "the context to free")
    )

}