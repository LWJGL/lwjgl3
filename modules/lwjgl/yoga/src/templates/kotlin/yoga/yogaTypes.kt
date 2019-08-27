/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package yoga

import org.lwjgl.generator.*

val YGNodeRef = "YGNodeRef".handle
val YGNodeConstRef = "YGNodeConstRef".handle

val YGConfigRef = "YGConfigRef".handle

val YGAlign = "YGAlign".enumType
val YGDimension = "YGDimension".enumType
val YGDirection = "YGDirection".enumType
val YGDisplay = "YGDisplay".enumType
val YGEdge = "YGEdge".enumType
val YGExperimentalFeature = "YGExperimentalFeature".enumType
val YGFlexDirection = "YGFlexDirection".enumType
val YGJustify = "YGJustify".enumType
val YGLogLevel = "YGLogLevel".enumType
val YGMeasureMode = "YGMeasureMode".enumType
val YGNodeType = "YGNodeType".enumType
val YGOverflow = "YGOverflow".enumType
val YGPositionType = "YGPositionType".enumType
val YGUnit = "YGUnit".enumType
val YGWrap = "YGWrap".enumType

val YGSize = struct(Module.YOGA, "YGSize") {
    float("width", "")
    float("height", "")
}

val YGValue = struct(Module.YOGA, "YGValue") {
    float("value", "")
    YGUnit("unit", "")
}

// TODO: Returns struct by value
val YGMeasureFunc = Module.YOGA.callback {
    uint64_t/*YGSize*/(
        "YGMeasureFunc",
        "Use {@link YGMeasureFunc\\#toLong toLong} to create the return value.",

        YGNodeRef("node", ""),
        float("width", ""),
        YGMeasureMode("widthMode", ""),
        float("height", ""),
        YGMeasureMode("heightMode", ""),

        nativeType = "YGMeasureFunc"
    ) {
        javaImport("static java.lang.Float.*")
        additionalCode = """
    public static long toLong(YGSize size) {
        return floatToRawIntBits(size.width()) | ((long)floatToRawIntBits(size.height()) << 32);
    }
    """
    }
}

val YGBaselineFunc = Module.YOGA.callback {
    float(
        "YGBaselineFunc",
        "",

        YGNodeRef("node", ""),
        float("width", ""),
        float("height", ""),

        nativeType = "YGBaselineFunc"
    )
}

val YGDirtiedFunc = Module.YOGA.callback {
    void(
        "YGDirtiedFunc",
        "",

        YGNodeRef("node", ""),

        nativeType = "YGDirtiedFunc"
    )
}

val YGPrintFunc = Module.YOGA.callback {
    void(
        "YGPrintFunc",
        "",

        YGNodeRef("node", ""),

        nativeType = "YGPrintFunc"
    )
}

val YGNodeCleanupFunc = Module.YOGA.callback {
    void(
        "YGNodeCleanupFunc",
        "",

        YGNodeRef("node", ""),

        nativeType = "YGNodeCleanupFunc"
    )
}

val YGLogger = Module.YOGA.callback {
    int(
        "YGLogger",
        "",

        YGConfigRef("config", ""),
        YGNodeRef("node", ""),
        YGLogLevel("level", ""),
        charUTF8.const.p("format", ""),
        va_list("args", ""),

        nativeType = "YGLogger"
    )
}

val YGCloneNodeFunc = Module.YOGA.callback {
    YGNodeRef(
        "YGCloneNodeFunc",
        "",

        YGNodeRef("oldNode", ""),
        YGNodeRef("owner", ""),
        int("childIndex", ""),

        nativeType = "YGCloneNodeFunc"
    )
}

// Internal API, exposed for efficiency.

val CompactValue = struct(Module.YOGA, "CompactValue", mutable = false) {
    documentation = "Unstable/private API."

    union {
        float("value", "")
        uint32_t("repr", "")
    }
}

val YGCachedMeasurement = struct(Module.YOGA, "YGCachedMeasurement", mutable = false) {
    documentation = "Unstable/private API."

    float("availableWidth", "")
    float("availableHeight", "")
    YGMeasureMode("widthMeasureMode", "")
    YGMeasureMode("heightMeasureMode", "")

    float("computedWidth", "")
    float("computedHeight", "")
}

val YGFloatOptional = struct(Module.YOGA, "YGFloatOptional", mutable = false) {
    float("value", "")
}

const val YG_MAX_CACHED_RESULT_COUNT = 16
val YGLayout = struct(Module.YOGA, "YGLayout", mutable = false) {
    documentation = "Unstable/private API."

    NativeName("position")..float("positions", "")[4]
    float("dimensions", "")[2]
    float("margin", "")[4]
    float("border", "")[4]
    float("padding", "")[4]

    uint32_t("bitfield", "")

    uint32_t("computedFlexBasisGeneration", "")
    YGFloatOptional("computedFlexBasis", "")

    uint32_t("generationCount", "")
    YGDirection("lastOwnerDirection", "")

    uint32_t("nextCachedMeasurementsIndex", "")
    YGCachedMeasurement("cachedMeasurements", "")[YG_MAX_CACHED_RESULT_COUNT]
    float("measuredDimensions", "")[2]

    YGCachedMeasurement("cachedLayout", "")
}

const val YGEdgeCount = 9
val YGStyle = struct(Module.YOGA, "YGStyle", mutable = false) {
    documentation = "Unstable/private API."

    uint32_t("bitfield", "")
    YGFloatOptional("flex", "")
    YGFloatOptional("flexGrow", "")
    YGFloatOptional("flexShrink", "")
    CompactValue("flexBasis", "")
    CompactValue("margin", "")[YGEdgeCount]
    NativeName("position")..CompactValue("positions", "")[YGEdgeCount]
    CompactValue("padding", "")[YGEdgeCount]
    CompactValue("border", "")[YGEdgeCount]
    CompactValue("dimensions", "")[2]
    CompactValue("minDimensions", "")[2]
    CompactValue("maxDimensions", "")[2]

    YGFloatOptional("aspectRatio", "")
}

val YGNode = struct(Module.YOGA, "YGNode", nativeName = "YGNodeLWJGL") {
    documentation = "Unstable/private API."

    nullable..opaque_p("context", "")

    uint8_t("bitfield", "")
    padding(1)

    union {
        nullable..YGMeasureFunc("noContext", "")
        nullable.."MeasureWithContextFn".handle("withContext", "")
    }("measure", "")

    union {
        nullable..YGBaselineFunc("noContext", "")
        nullable.."BaselineWithContextFn".handle("withContext", "")
    }("baseline", "")

    union {
        nullable..YGPrintFunc("noContext", "")
        nullable.."PrintWithContextFn".handle("withContext", "")
    }("print", "")

    nullable..YGDirtiedFunc("dirtied", "")

    YGStyle("style", "")
    YGLayout("layout", "")
    uint32_t("lineIndex", "")

    nullable..YGNodeRef("owner", "")
    nullable.."YGVector".handle("children", "").private() // std:vector<YGNodeRef>

    nullable..YGConfigRef("config", "")
    YGValue("resolvedDimensions", "")[2]
}