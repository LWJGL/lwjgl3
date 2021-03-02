/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openxr

import org.lwjgl.generator.*

val XrVersion = typedef(uint64_t, "XrVersion")
val XrFlags = typedef(uint64_t, "XrFlags")
val XrBool32 = PrimitiveType("XrBool32", PrimitiveMapping.BOOLEAN4)
val XrTime = typedef(int64_t, "XrTime")
val XrDuration = typedef(int64_t, "XrDuration")

val XrPath = XR_DEFINE_ATOM("XrPath")
val XrSystemId = XR_DEFINE_ATOM("XrSystemId")
val XrControllerModelKeyMSFT = XR_DEFINE_ATOM("XrControllerModelKeyMSFT")

val PFN_vkGetInstanceProcAddr = typedef(vulkan.PFN_vkVoidFunction, "PFN_vkGetInstanceProcAddr")
val PFNEGLGETPROCADDRESSPROC = typedef(egl.__eglMustCastToProperFunctionPointerType, "PFNEGLGETPROCADDRESSPROC")

fun XR_DEFINE_HANDLE(name: String) = WrappedPointerType(name)
fun XR_DEFINE_ATOM(name: String) = typedef(uint64_t, name)