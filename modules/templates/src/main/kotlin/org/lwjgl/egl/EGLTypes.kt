/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl

import org.lwjgl.generator.*

val EGL_PACKAGE = "org.lwjgl.egl"

fun GeneratorTargetNative.includeEGLEXT() = nativeDirective(
	"""DISABLE_WARNINGS()
#include "EGL/egl.h"
#include "EGL/eglext.h"
ENABLE_WARNINGS()""")

val noneTerminated = Terminated("EGL10.EGL_NONE") // EGL_NONE is not zero

// khrplatform.h
val khronos_uint64_t = IntegerType("khronos_uint64_t", PrimitiveMapping.LONG, unsigned = true)
val khronos_ssize_t = IntegerType("khronos_ssize_t", PrimitiveMapping.POINTER)
val khronos_utime_nanoseconds_t = typedef(khronos_uint64_t, "khronos_utime_nanoseconds_t")

// EGL 1.0
val EGLBoolean = PrimitiveType("EGLBoolean", PrimitiveMapping.BOOLEAN)
val EGLint = IntegerType("EGLint", PrimitiveMapping.INT)
val EGLint_p = EGLint.p

val EGLDisplay = "EGLDisplay".opaque_p
val EGLNativeDisplayType = "EGLNativeDisplayType".opaque_p
val EGLNativePixmapType = "EGLNativePixmapType".opaque_p
val EGLNativeWindowType = "EGLNativeWindowType".opaque_p
val EGLConfig = "EGLConfig".opaque_p
val EGLSurface = "EGLSurface".opaque_p
val EGLContext = "EGLContext".opaque_p

val EGLNativeDisplayType_p = EGLNativeDisplayType.p
val EGLNativePixmapType_p = EGLNativePixmapType.p
val EGLNativeWindowType_p = EGLNativeWindowType.p
val EGLConfig_p = EGLConfig.p

val __eglMustCastToProperFunctionPointerType = "__eglMustCastToProperFunctionPointerType".opaque_p

// EGL 1.2
val EGLenum = typedef(unsigned_int, "EGLenum")
val EGLClientBuffer = "EGLClientBuffer".opaque_p

// EGL 1.5
val EGLSync = "EGLSync".opaque_p
val EGLAttrib = typedef(intptr_t, "EGLAttrib")
val EGLAttrib_p = EGLAttrib.p
val EGLTime = typedef(khronos_utime_nanoseconds_t, "EGLTime")
val EGLImage = "EGLImage".opaque_p

// KHR_cl_event2
val EGLAttribKHR = typedef(intptr_t, "EGLAttribKHR")
val EGLAttribKHR_p = EGLAttribKHR.p

// KHR_fence_sync
val EGLSyncKHR = "EGLSyncKHR".opaque_p
val EGLTimeKHR = typedef(khronos_utime_nanoseconds_t, "EGLTimeKHR")
val EGLTimeKHR_p = EGLTimeKHR.p

// KHR_image
val EGLImageKHR = "EGLImageKHR".opaque_p

// KHR_stream
val EGLStreamKHR = "EGLStreamKHR".opaque_p
val EGLuint64KHR = typedef(khronos_uint64_t, "EGLuint64KHR")
val EGLuint64KHR_p = EGLuint64KHR.p

// KHR_stream_cross_process_fd
val EGLNativeFileDescriptorKHR = typedef(int, "EGLNativeFileDescriptorKHR")

// ANDROID_blob_cache
val EGLsizeiANDROID = typedef(khronos_ssize_t, "EGLsizeiANDROID")
val EGLSetBlobFuncANDROID = "EGLSetBlobFuncANDROID".callback(
	EGL_PACKAGE, void, "EGLSetBlobFuncANDROID", "",
	const _ void_p.IN("key", ""),
	AutoSize("key") _ EGLsizeiANDROID.IN("keySize", ""),
	const _ void_p.IN("value", ""),
	AutoSize("value") _ EGLsizeiANDROID.IN("valueSize", ""),
	samConstructor = "ANDROIDBlobCache"
) {
	documentation = "Instances of this interface may be passed to the ANDROIDBlobCache##eglSetBlobCacheFuncsANDROID() method."
	additionalCode = """
	/** A functional interface for {@link EGLSetBlobFuncANDROID}. */
	public interface SAMBuffer {
		void invoke(ByteBuffer key, ByteBuffer value);
	}

	/**
	 * Creates a {@link EGLSetBlobFuncANDROID} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link EGLSetBlobFuncANDROID} instance
	 */
	public static EGLSetBlobFuncANDROID createBuffer(final SAMBuffer sam) {
		return new EGLSetBlobFuncANDROID() {
			@Override
			public void invoke(long key, long keySize, long value, long valueSize) {
				sam.invoke(memByteBuffer(key, (int)keySize), memByteBuffer(value, (int)valueSize));
			}
		};
	}
	"""
}
val EGLGetBlobFuncANDROID = "EGLGetBlobFuncANDROID".callback(
	EGL_PACKAGE, EGLsizeiANDROID, "EGLGetBlobFuncANDROID", "",
	const _ void_p.IN("key", ""),
	AutoSize("key") _ EGLsizeiANDROID.IN("keySize", ""),
	void_p.IN("value", ""),
	AutoSize("value") _ EGLsizeiANDROID.IN("valueSize", ""),
	samConstructor = "ANDROIDBlobCache"
) {
	documentation = "Instances of this interface may be passed to the ANDROIDBlobCache##eglSetBlobCacheFuncsANDROID() method."
	additionalCode = """
	/** A functional interface for {@link EGLGetBlobFuncANDROID}. */
	public interface SAMBuffer {
		long invoke(ByteBuffer key, ByteBuffer value);
	}

	/**
	 * Creates a {@link EGLGetBlobFuncANDROID} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link EGLGetBlobFuncANDROID} instance
	 */
	public static EGLGetBlobFuncANDROID createBuffer(final SAMBuffer sam) {
		return new EGLGetBlobFuncANDROID() {
			@Override
			public long invoke(long key, long keySize, long value, long valueSize) {
				return sam.invoke(memByteBuffer(key, (int)keySize), memByteBuffer(value, (int)valueSize));
			}
		};
	}
	"""
}

// EXT_device_base
val EGLDeviceEXT = "EGLDeviceEXT".opaque_p
val EGLDeviceEXT_p = EGLDeviceEXT.p

// EXT_output_base
val EGLOutputLayerEXT = "EGLOutputLayerEXT".opaque_p
val EGLOutputLayerEXT_p = EGLOutputLayerEXT.p
val EGLOutputPortEXT = "EGLOutputPortEXT".opaque_p
val EGLOutputPortEXT_p = EGLOutputPortEXT.p

// HI_clientpixmap
val EGLClientPixmapHI_p = struct_p(EGL_PACKAGE, "EGLClientPixmapHI", identifierType = StructIdentifierType.STRUCT) {
	documentation = "Image format struct."
	includeEGLEXT()
	void_p.member("pData")
	EGLint.member("iWidth")
	EGLint.member("iHeight")
	EGLint.member("iStride")
}

// NV_sync
val EGLSyncNV = "EGLSyncNV".opaque_p
val EGLTimeNV = typedef(khronos_utime_nanoseconds_t, "EGLTimeNV")

// NV_system_time
val EGLuint64NV = typedef(khronos_utime_nanoseconds_t, "EGLuint64NV")