/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package remotery

import org.lwjgl.generator.*

fun NativeClass.remoteryIncludes(type: String) {
    nativeDirective(
        """DISABLE_WARNINGS()
#define RMT_USE_OPENGL 1
#define RMT_USE_VULKAN 1
#define RMT_ASSUME_LITTLE_ENDIAN 1
#ifdef LWJGL_LINUX
    #define RMT_USE_POSIX_THREADNAMES 1
#elif LWJGL_MACOS
    #define RMT_USE_METAL 1
#endif
#include "Remotery.$type"${if (type == "h") "" else """
#ifdef LWJGL_MACOS
    #include "RemoteryMetal.mm"
#endif"""}
ENABLE_WARNINGS()""")
}

// Boolean
val rmtBool = PrimitiveType("rmtBool", PrimitiveMapping.BOOLEAN4)

// Unsigned integer types
val rmtU8 = typedef(uint8_t, "rmtU8")
val rmtU16 = typedef(uint16_t, "rmtU16")
val rmtU32 = typedef(uint32_t, "rmtU32")
val rmtU64 = typedef(uint64_t, "rmtU64")

// Signed integer types
val rmtS8 = typedef(int8_t, "rmtS8")
val rmtS16 = typedef(int16_t, "rmtS16")
val rmtS32 = typedef(int32_t, "rmtS32")
val rmtS64 = typedef(int64_t, "rmtS64")

// float types
val rmtF32 = typedef(float, "rmtF32")
val rmtF64 = typedef(double, "rmtF64")

// Const, null-terminated string pointer
val rmtPStr = typedef(charUTF8.const.p, "rmtPStr")

// Opaque pointer for a sample graph tree
val rmtSampleTree = "rmtSampleTree".opaque

// Opaque pointer to a node in the sample graph tree
val rmtSample = "rmtSample".opaque

// Handle to the main remotery instance
val Remotery = "Remotery".opaque

// Forward declaration
val _rmtProperty = struct(Module.REMOTERY, "RMTProperty", nativeName = "rmtProperty")

val rmtSampleType = "rmtSampleType".enumType

val rmtError = "rmtError".enumType

val rmtPropertyType = "rmtPropertyType".enumType
val rmtPropertyFlags = "rmtPropertyFlags".enumType

// Callback function pointer types
val rmtMallocPtr = Module.REMOTERY.callback {
    opaque_p(
        "RMTMalloc",

        opaque_p("mm_context"),
        rmtU32("size"),

        nativeType = "rmtMallocPtr"
    )
}

val rmtReallocPtr = Module.REMOTERY.callback {
    opaque_p(
        "RMTRealloc",

        opaque_p("mm_context"),
        void.p("ptr"),
        rmtU32("size"),

        nativeType = "rmtReallocPtr"
    )
}

val rmtFreePtr = Module.REMOTERY.callback {
    void(
        "RMTFree",

        opaque_p("mm_context"),
        void.p("ptr"),

        nativeType = "rmtFreePtr"
    )
}

val rmtInputHandlerPtr = Module.REMOTERY.callback {
    opaque_p(
        "RMTInputHandler",

        charUTF8.const.p("text"),
        opaque_p("context"),

        nativeType = "rmtInputHandlerPtr"
    )
}

val rmtSampleTreeHandlerPtr = Module.REMOTERY.callback {
    void(
        "RMTSampleTreeHandler",

        nullable..opaque_p("cbk_context"),
        rmtSampleTree.p("sample_tree"),

        nativeType = "rmtSampleTreeHandlerPtr"
    )
}

val rmtPropertyHandlerPtr = Module.REMOTERY.callback {
    void(
        "RMTPropertyHandler",

        nullable..opaque_p("cbk_context"),
        _rmtProperty.p("root"),

        nativeType = "rmtPropertyHandlerPtr"
    )
}

val rmtSettings = struct(Module.REMOTERY, "RMTSettings", nativeName = "rmtSettings", skipBuffer = true) {
    rmtU16("port")
	rmtBool("reuse_open_port")
    rmtBool("limit_connections_to_localhost")
    rmtBool("enableThreadSampler")
    rmtU32("msSleepBetweenServerUpdates")
    rmtU32("messageQueueSizeInBytes")
    rmtU32("maxNbMessagesPerUpdate")

    rmtMallocPtr("_malloc")
    rmtReallocPtr("realloc")
    rmtFreePtr("_free")
    nullable..opaque_p("mm_context")

    nullable..rmtInputHandlerPtr("input_handler")

    nullable..rmtSampleTreeHandlerPtr("sampletree_handler")
    nullable..opaque_p("sampletree_context")

    nullable..rmtPropertyHandlerPtr("snapshot_callback")
    nullable..opaque_p("snapshot_context")

    nullable..opaque_p("input_handler_context")

    nullable..rmtPStr("logPath")
}

val rmtPropertyValue = union(Module.REMOTERY, "RMTPropertyValue", nativeName = "rmtPropertyValue") {
    rmtBool("Bool")
    rmtS32("S32")
    rmtU32("U32")
    rmtF32("F32")
    rmtS64("S64")
    rmtU64("U64")
    rmtF64("F64")
}

val rmtProperty = struct(Module.REMOTERY, "RMTProperty", nativeName = "rmtProperty") {
    rmtBool("initialised")

    rmtPropertyType("type")
    rmtPropertyFlags("flags")

    rmtPropertyValue("value")

    rmtPropertyValue("lastFrameValue")

    rmtPropertyValue("prevValue")
    rmtU32("prevValueFrame")

    charUTF8.const.p("name")
    charUTF8.const.p("description")

    rmtPropertyValue("defaultValue")

    nullable.._rmtProperty.p("parent")

    nullable.._rmtProperty.p("firstChild")
    nullable.._rmtProperty.p("lastChild")
    nullable.._rmtProperty.p("nextSibling")

    rmtU32("nameHash")

    rmtU32("uniqueID")
}

val rmtSampleIterator = struct(Module.REMOTERY, "RMTSampleIterator", nativeName = "rmtSampleIterator", mutable = false, skipBuffer = true) {
    rmtSample.p("sample")
    rmtSample.p("initial").private()
}

val rmtPropertyIterator = struct(Module.REMOTERY, "RMTPropertyIterator", nativeName = "rmtPropertyIterator", mutable = false, skipBuffer = true) {
    rmtProperty.p("property")
    rmtProperty.p("initial").private()
}

// Metal

val id = "id".handle

// Vulkan

val rmtVulkanFunctions = struct(Module.REMOTERY, "RMTVulkanFunctions", nativeName = "rmtVulkanFunctions") {
    opaque_p("vkGetPhysicalDeviceProperties")

    opaque_p("vkQueueSubmit")
    opaque_p("vkQueueWaitIdle")
    opaque_p("vkCreateQueryPool")
    opaque_p("vkDestroyQueryPool")
    opaque_p("vkResetQueryPool")
    opaque_p("vkGetQueryPoolResults")
    opaque_p("vkCmdWriteTimestamp")
    opaque_p("vkCreateSemaphore")
    opaque_p("vkDestroySemaphore")
    opaque_p("vkSignalSemaphore")
    opaque_p("vkGetSemaphoreCounterValue")
    opaque_p("vkGetCalibratedTimestampsEXT")
}

val rmtVulkanBind = struct(Module.REMOTERY, "RMTVulkanBind", nativeName = "rmtVulkanBind", mutable = false) {
    "VkInstance".handle("instance")
    "VkPhysicalDevice".handle("physical_device")
    "VkDevice".handle("device")
    "VkQueue".handle("queue")
}