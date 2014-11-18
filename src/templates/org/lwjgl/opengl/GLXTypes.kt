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