/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openxr

import org.lwjgl.generator.*

fun XR_DEFINE_HANDLE(name: String) = WrappedPointerType(name)
fun XR_DEFINE_ATOM(name: String) = typedef(uint64_t, name)

val XrBool32 = PrimitiveType("XrBool32", PrimitiveMapping.BOOLEAN4)
val XrControllerModelKeyMSFT = XR_DEFINE_ATOM("XrControllerModelKeyMSFT")
val XrDuration = typedef(uint64_t, "XrDuration")
val XrFlags64 = typedef(uint64_t, "XrFlags64")
val XrPath = XR_DEFINE_ATOM("XrPath")
val XrRenderModelKeyFB = XR_DEFINE_ATOM("XrRenderModelKeyFB")
val XrSystemId = XR_DEFINE_ATOM("XrSystemId")
val XrTime = typedef(uint64_t, "XrTime")
val XrVersion = typedef(uint64_t, "XrVersion")

val PFN_xrVoidFunction = typedef(opaque_p, "PFN_xrVoidFunction")

val PFNEGLGETPROCADDRESSPROC = "PFNEGLGETPROCADDRESSPROC".handle

// TODO:
val wchar_t = CharType("wchar_t", CharMapping.UTF16)

// TODO:
val IUnknown = "IUnknown".opaque
val timespec = "struct timespec".opaque

// TODO: replace when/if we add xcb bindings
val xcb_connection_t = "xcb_connection_t".opaque
val xcb_glx_fbconfig_t = typedef(uint32_t, "xcb_glx_fbconfig_t")
val xcb_visualid_t = typedef(uint32_t, "xcb_visualid_t")
val xcb_glx_drawable_t = typedef(uint32_t, "xcb_glx_drawable_t")
val xcb_glx_context_t = typedef(uint32_t, "xcb_glx_context_t")