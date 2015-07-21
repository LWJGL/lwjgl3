/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx

import org.lwjgl.generator.*

val CGLPixelFormatObj = "CGLPixelFormatObj".opaque_p
val CGLRendererInfoObj = "CGLRendererInfoObj".opaque_p
val CGLContextObj = "CGLContextObj".opaque_p
val CGLPBufferObj = "CGLPBufferObj".opaque_p

val CGLPixelFormatObj_p = CGLPixelFormatObj.p
val CGLRendererInfoObj_p = CGLRendererInfoObj.p
val CGLContextObj_p = CGLContextObj.p
val CGLPBufferObj_p = CGLPBufferObj.p

val CGLShareGroupObj = "CGLShareGroupObj".opaque_p

val CGLError = EnumType("CGLError")
val CGLPixelFormatAttribute = EnumType("CGLPixelFormatAttribute")
val CGLContextEnable = EnumType("CGLContextEnable")
val CGLRendererProperty = EnumType("CGLRendererProperty")
val CGLContextParameter = EnumType("CGLContextParameter")
val CGLGlobalOption = EnumType("CGLGlobalOption")

val CGLPixelFormatAttribute_p = CGLPixelFormatAttribute.p