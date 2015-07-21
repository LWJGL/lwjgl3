/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx

import org.lwjgl.generator.*

val CFTypeRef = "CFTypeRef".opaque_p
val CFAllocatorRef = "CFAllocatorRef".opaque_p

val CFStringEncoding = typedef(UInt32, "CFStringEncoding")
val CFStringRef = "CFStringRef".opaque_p

val CFBundleRef = "CFBundleRef".opaque_p

val CFURLPathStyle = typedef(CFIndex, "CFURLPathStyle")
val CFURLRef = "CFURLRef".opaque_p