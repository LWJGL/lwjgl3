/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx

import org.lwjgl.generator.*

val CFTypeRef = PointerType("CFTypeRef", includesPointer = true)
val CFAllocatorRef = PointerType("CFAllocatorRef", includesPointer = true)

val CFStringEncoding = typedef(UInt32, "CFStringEncoding")
val CFStringRef = PointerType("CFStringRef", includesPointer = true)

val CFBundleRef = PointerType("CFBundleRef", includesPointer = true)

val CFURLPathStyle = typedef(CFIndex, "CFURLPathStyle")
val CFURLRef = PointerType("CFURLRef", includesPointer = true)