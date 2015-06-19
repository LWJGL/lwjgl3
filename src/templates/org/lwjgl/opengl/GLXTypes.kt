/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val GLXContext = PointerType("GLXContext", includesPointer = true)

val GLXFBConfig = PointerType("GLXFBConfig", includesPointer = true)
val GLXFBConfig_p = PointerType(GLXFBConfig)

val GLXFBConfigSGIX = PointerType("GLXFBConfigSGIX", includesPointer = true)
val GLXFBConfigSGIX_p = PointerType(GLXFBConfigSGIX)

val GLXWindow = PointerType("GLXWindow", includesPointer = true)
val GLXDrawable = PointerType("GLXDrawable", includesPointer = true)
val GLXPixmap = PointerType("GLXPixmap", includesPointer = true)

val GLXContextID = typedef(XID, "GLXContextID")

val GLXPbuffer = PointerType("GLXPbuffer", includesPointer = true)

fun config() {
	struct(OPENGL_PACKAGE, "GLXStereoNotifyEventEXT", "glx") {
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