/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val GLXContext = "GLXContext".opaque_p

val GLXFBConfig = "GLXFBConfig".opaque_p
val GLXFBConfig_p = GLXFBConfig.p

val GLXFBConfigSGIX = "GLXFBConfigSGIX".opaque_p
val GLXFBConfigSGIX_p = GLXFBConfigSGIX.p

val GLXWindow = "GLXWindow".opaque_p
val GLXDrawable = "GLXDrawable".opaque_p
val GLXPixmap = "GLXPixmap".opaque_p

val GLXContextID = typedef(XID, "GLXContextID")

val GLXPbuffer = "GLXPbuffer".opaque_p

fun config() {
	struct(OPENGL_PACKAGE, "GLXStereoNotifyEventEXT", "glx", mutable = false) {
		nativeImport ("<GL/glx.h>", "GLX.h")
		int.member("type")
		unsigned_long.member("serial")
		Bool.member("send_event")
		Display_p.member("display")
		int.member("extension")
		int.member("evtype")
		GLXDrawable.member("window")
		Bool.member("stereo_tree")
	}
}