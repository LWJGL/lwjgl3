/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan

import org.lwjgl.generator.*

fun VK_DEFINE_HANDLE(name: String) = WrappedPointerType(name)
fun VK_DEFINE_NON_DISPATCHABLE_HANDLE(name: String) = typedef(uint64_t, name) // TODO: not a pointer, but implement nullability?

val VkBool32 = PrimitiveType("VkBool32", PrimitiveMapping.BOOLEAN4)
val VkDeviceAddress = typedef(uint64_t, "VkDeviceAddress")
val VkDeviceSize = typedef(uint64_t, "VkDeviceSize")
val VkFlags = typedef(uint32_t, "VkFlags")
val VkFlags64 = typedef(uint64_t, "VkFlags64")
val VkSampleMask = typedef(uint32_t, "VkSampleMask")

val PFN_vkVoidFunction = "PFN_vkVoidFunction".handle
val PFN_vkGetInstanceProcAddr = "PFN_vkGetInstanceProcAddr".handle
val PFN_vkGetInstanceProcAddrLUNARG = "PFN_vkGetInstanceProcAddrLUNARG".handle

val VkRemoteAddressNV = "VkRemoteAddressNV".handle

// Android interop types
val AHardwareBuffer = "AHardwareBuffer".opaque
val ANativeWindow = "ANativeWindow".opaque

// DirectFB interop types
val IDirectFB = "IDirectFB".opaque
val IDirectFBSurface = "IDirectFBSurface".opaque

// Metal interop types
val CAMetalLayer = "CAMetalLayer".handle
val MTLDevice_id = "MTLDevice_id".handle
val MTLCommandQueue_id = "MTLCommandQueue_id".handle
val MTLBuffer_id = "MTLBuffer_id".handle
val MTLTexture_id = "MTLTexture_id".handle
val MTLSharedEvent_id = "MTLSharedEvent_id".handle
val IOSurfaceRef = "IOSurfaceRef".handle

// UBM interop types

val ubm_device = "ubm_device".opaque
val ubm_surface = "ubm_surface".opaque

// XCB interop types
val xcb_connection_t = "xcb_connection_t".opaque
val xcb_visualid_t = typedef(uint32_t, "xcb_visualid_t")
val xcb_window_t = typedef(uint32_t, "xcb_window_t")