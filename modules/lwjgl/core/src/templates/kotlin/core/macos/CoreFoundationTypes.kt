/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.macos

import org.lwjgl.generator.*

val CFTypeRef = "CFTypeRef".handle
val CFAllocatorRef = "CFAllocatorRef".handle

val CFDataRef = "CFDataRef".handle

val CFStringEncoding = typedef(UInt32, "CFStringEncoding")
val CFStringRef = "CFStringRef".handle

val CFBundleRef = "CFBundleRef".handle

val CFURLPathStyle = typedef(CFIndex, "CFURLPathStyle")
val CFURLRef = "CFURLRef".handle