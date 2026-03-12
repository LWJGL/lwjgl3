/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package renderdoc

import org.lwjgl.generator.*
import java.io.*

private const val CAPABILITIES_CLASS = "RDCapabilities"

val RENDERDOC_BINDING = object : APIBinding(
    Module.RENDERDOC,
    CAPABILITIES_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {
    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = RENDERDOC.${function.simpleName}();")
    }

    override fun PrintWriter.generateJava() = throw UnsupportedOperationException("RenderDoc does not use the standard API binding generation.")
}

val uint32_tb = PrimitiveType("uint32_t", PrimitiveMapping.BOOLEAN4)

val RENDERDOC_AnnotationType = "RENDERDOC_AnnotationType".enumType
val RENDERDOC_CaptureOption = "RENDERDOC_CaptureOption".enumType
val RENDERDOC_InputButton = "RENDERDOC_InputButton".enumType
val RENDERDOC_Version = "RENDERDOC_Version".enumType

val RENDERDOC_DevicePointer = "RENDERDOC_DevicePointer".handle
val RENDERDOC_WindowHandle = "RENDERDOC_WindowHandle".handle

val RENDERDOC_API_1_7_0 = struct(Module.RENDERDOC, "RENDERDOC_API_1_7_0", mutable = false) {
    setUsageInput()

    opaque_p("GetAPIVersion")
    opaque_p("SetCaptureOptionU32")
    opaque_p("SetCaptureOptionF32")
    opaque_p("GetCaptureOptionU32")
    opaque_p("GetCaptureOptionF32")
    opaque_p("SetFocusToggleKeys")
    opaque_p("SetCaptureKeys")
    opaque_p("GetOverlayBits")
    opaque_p("MaskOverlayBits")
    opaque_p("RemoveHooks")
    opaque_p("UnloadCrashHandler")
    opaque_p("SetCaptureFilePathTemplate")
    opaque_p("GetCaptureFilePathTemplate")
    opaque_p("GetNumCaptures")
    opaque_p("GetCapture")
    opaque_p("TriggerCapture")
    opaque_p("IsTargetControlConnected")
    opaque_p("LaunchReplayUI")
    opaque_p("SetActiveWindow")
    opaque_p("StartFrameCapture")
    opaque_p("IsFrameCapturing")
    opaque_p("EndFrameCapture")
    nullable..opaque_p("TriggerMultiFrameCapture")
    nullable..opaque_p("SetCaptureFileComments")
    nullable..opaque_p("DiscardFrameCapture")
    nullable..opaque_p("ShowReplayUI")
    nullable..opaque_p("SetCaptureTitle")
    nullable..opaque_p("SetObjectAnnotation")
    nullable..opaque_p("SetCommandAnnotation")
}

val RENDERDOC_AnnotationVectorValue = union(Module.RENDERDOC, "RENDERDOC_AnnotationVectorValue") {
    bool("boolean")[4]
    int32_t("int32")[4]
    int64_t("int64")[4]
    uint32_t("uint32")[4]
    uint64_t("uint64")[4]
    float("float32")[4]
    double("float64")[4]
}

val RENDERDOC_AnnotationValue = union(Module.RENDERDOC, "RENDERDOC_AnnotationValue") {
    bool("boolean")
    int32_t("int32")
    int64_t("int64")
    uint32_t("uint32")
    uint64_t("uint64")
    float("float32")
    double("float64")

    RENDERDOC_AnnotationVectorValue("vector")

    charUTF8.const.p("string")
    opaque_p("apiObject")
}

val GLResourceReference = struct(Module.RENDERDOC, "GLResourceReference") {
    uint32_t("identifier")
    uint32_t("name")
}