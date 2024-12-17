/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package jawt.templates

import org.lwjgl.generator.*
import jawt.*
import core.jni.*

val jawt = "JAWTFunctions".nativeClass(Module.JAWT, prefix = "JAWT_", prefixMethod = "JAWT_", binding = simpleBinding(
    Module.JAWT,
    libraryExpression = """Configuration.JAWT_LIBRARY_NAME, "jawt", apiFindLibrary(System.getProperty("java.home"), "jawt")"""
)) {
    nativeDirective(
        """DISABLE_WARNINGS()
#include "jawt_md.h"
ENABLE_WARNINGS()
#ifndef APIENTRY
    #define APIENTRY
#endif""")

    javaImport(
        "java.awt.Component",
        "java.awt.Frame"
    )

    IntConstant(
        "VERSION_1_3"..0x00010003,
        "VERSION_1_4"..0x00010004,
        "VERSION_1_7"..0x00010007,
        "VERSION_9"..0x00090000
    )

    IntConstant(
        "MACOSX_USE_CALAYER"..0x80000000.i
    )

    IntConstant(
        "LOCK_ERROR"..0x00000001,
        "LOCK_CLIP_CHANGED"..0x00000002,
        "LOCK_BOUNDS_CHANGED"..0x00000004,
        "LOCK_SURFACE_CHANGED"..0x00000008
    )

    NativeName("Pointer.BITS64 || Platform.get() != Platform.WINDOWS ? \"JAWT_GetAWT\" : \"_JAWT_GetAWT@8\"")..jboolean(
        "GetAWT",

        JNI_ENV,
        JAWT.p("awt")
    )

    // JAWT_DrawingSurface functions

    jint(
        "DrawingSurface_Lock",

        Input..JAWT_DrawingSurface.p("ds"),
        EXPLICIT_FUNCTION_ADDRESS
    )

    JAWT_DrawingSurfaceInfo.p(
        "DrawingSurface_GetDrawingSurfaceInfo",

        Input..JAWT_DrawingSurface.p("ds"),
        EXPLICIT_FUNCTION_ADDRESS
    )

    void(
        "DrawingSurface_FreeDrawingSurfaceInfo",

        Input..JAWT_DrawingSurfaceInfo.p("dsi"),
        EXPLICIT_FUNCTION_ADDRESS
    )

    void(
        "DrawingSurface_Unlock",

        Input..JAWT_DrawingSurface.p("ds"),
        EXPLICIT_FUNCTION_ADDRESS
    )

    // JAWT struct functions

    JAWT_DrawingSurface.p(
        "GetDrawingSurface",

        JNI_ENV,
        jobject("target"),
        EXPLICIT_FUNCTION_ADDRESS
    )

    void(
        "FreeDrawingSurface",

        Input..JAWT_DrawingSurface.p("ds"),
        EXPLICIT_FUNCTION_ADDRESS
    )

    void(
        "Lock",

        JNI_ENV,
        EXPLICIT_FUNCTION_ADDRESS
    )

    void(
        "Unlock",

        JNI_ENV,
        EXPLICIT_FUNCTION_ADDRESS
    )

    Component(
        "GetComponent",

        JNI_ENV,
        opaque_p("platformInfo"),
        EXPLICIT_FUNCTION_ADDRESS
    )

    // JDK 9+

    Frame(
        "CreateEmbeddedFrame",

        JNI_ENV,
        opaque_p("platformInfo"),
        EXPLICIT_FUNCTION_ADDRESS
    )

    void(
        "SetBounds",

        JNI_ENV,
        Frame("embeddedFrame"),
        jint("x"),
        jint("y"),
        jint("w"),
        jint("h"),
        EXPLICIT_FUNCTION_ADDRESS
    )

    void(
        "SynthesizeWindowActivation",

        JNI_ENV,
        Frame("embeddedFrame"),
        jboolean("doActivate"),
        EXPLICIT_FUNCTION_ADDRESS
    )
}