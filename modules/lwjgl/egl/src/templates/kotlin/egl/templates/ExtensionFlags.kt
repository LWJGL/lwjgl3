/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

const val EXT = "EXT"
const val KHR = "KHR"

const val ANDROID = "ANDROID"
const val ANGLE = "ANGLE"
const val ARM = "ARM"
const val HI = "HI"
const val IMG = "IMG"
const val MESA = "MESA"
const val NOK = "NOK"
const val NV = "NV"
const val OVR = "OVR"
const val TIZEN = "TIZEN"
const val WL = "WL"

private val NativeClass.cap: String get() = "{@link #$capName $templateName}"

val EXT_client_extensions = EXT_FLAG.nativeClassEGL("EXT_client_extensions", postfix = EXT)
val EXT_explicit_device = EXT_FLAG.nativeClassEGL("EXT_explicit_device", postfix = EXT)
val EXT_query_reset_notification_strategy = EXT_FLAG.nativeClassEGL("EXT_query_reset_notification_strategy", postfix = EXT)

val KHR_client_get_all_proc_addresses = EXT_FLAG.nativeClassEGL("KHR_client_get_all_proc_addresses", postfix = KHR)
val KHR_get_all_proc_addresses = EXT_FLAG.nativeClassEGL("KHR_get_all_proc_addresses", postfix = KHR)
val KHR_stream_producer_aldatalocator = EXT_FLAG.nativeClassEGL("KHR_stream_producer_aldatalocator", postfix = KHR)
val KHR_surfaceless_context = EXT_FLAG.nativeClassEGL("KHR_surfaceless_context", postfix = KHR)

val NV_post_convert_rounding = EXT_FLAG.nativeClassEGL("NV_post_convert_rounding", postfix = NV)
val NV_stream_cross_object = EXT_FLAG.nativeClassEGL("NV_stream_cross_object", postfix = NV)
val NV_stream_cross_display = EXT_FLAG.nativeClassEGL("NV_stream_cross_display", postfix = NV)
val NV_stream_cross_process = EXT_FLAG.nativeClassEGL("NV_stream_cross_process", postfix = NV)
val NV_stream_cross_partition = EXT_FLAG.nativeClassEGL("NV_stream_cross_partition", postfix = NV)
val NV_stream_cross_system = EXT_FLAG.nativeClassEGL("NV_stream_cross_system", postfix = NV)