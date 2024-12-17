/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl

import org.lwjgl.generator.*
import core.linux.*

val GLXContext = "GLXContext".handle
val GLXFBConfig = "GLXFBConfig".handle
val GLXFBConfigSGIX = "GLXFBConfigSGIX".handle

val GLXWindow = "GLXWindow".handle
val GLXDrawable = "GLXDrawable".handle
val GLXPixmap = "GLXPixmap".handle

val GLXContextID = typedef(XID, "GLXContextID")

val GLXPbuffer = "GLXPbuffer".handle

fun configGLX() {
    struct(Module.OPENGL, "GLXStereoNotifyEventEXT", nativeSubPath = "glx", mutable = false) {
        int("type")
        unsigned_long("serial")
        Bool("send_event")
        Display.p("display")
        int("extension")
        int("evtype")
        GLXDrawable("window")
        Bool("stereo_tree")
    }
}