/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx

import org.lwjgl.generator.*

val CGLPixelFormatObj = PointerType("CGLPixelFormatObj", includesPointer = true)
val CGLRendererInfoObj = PointerType("CGLRendererInfoObj", includesPointer = true)
val CGLContextObj = PointerType("CGLContextObj", includesPointer = true)
val CGLPBufferObj = PointerType("CGLPBufferObj", includesPointer = true)

val CGLPixelFormatObj_p = PointerType(CGLPixelFormatObj)
val CGLRendererInfoObj_p = PointerType(CGLRendererInfoObj)
val CGLContextObj_p = PointerType(CGLContextObj)
val CGLPBufferObj_p = PointerType(CGLPBufferObj)

val CGLShareGroupObj = PointerType("CGLShareGroupObj", includesPointer = true)

val CGLError = EnumType("CGLError")
val CGLPixelFormatAttribute = EnumType("CGLPixelFormatAttribute")
val CGLContextEnable = EnumType("CGLContextEnable")
val CGLRendererProperty = EnumType("CGLRendererProperty")
val CGLContextParameter = EnumType("CGLContextParameter")
val CGLGlobalOption = EnumType("CGLGlobalOption")

val CGLPixelFormatAttribute_p = PointerType(CGLPixelFormatAttribute)