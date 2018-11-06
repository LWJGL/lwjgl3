/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package yoga

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.YOGA,
        """
        Contains bindings to ${url("https://facebook.github.io/yoga/", "Yoga")}.

        Yoga is a cross-platform layout engine enabling maximum collaboration within your team by implementing an API familiar to many designers and opening it
        up to developers across different platforms.
        ${ul(
            "Do you already know Flexbox? Then you already know Yoga.",
            "Write code in a language familiar to you - Java, C#, Objective-C, C.",
            "C under the hood so your code moves fast.",
            "Battle tested in popular frameworks like React Native."
        )}

        <h3>LWJGL implementation</h3>

        Unlike the official Yoga Java bindings, the LWJGL bindings directly expose the native C API. {@code YGNodeRef} handles do not need to be wrapped in Java
        instances, so there is no memory overhead. The internal Yoga structs are also exposed, which makes it very efficient to read the current tree layout
        after a call to #NodeCalculateLayout():
        ${codeBlock("""
// Public API, 4x JNI call overhead
float l = YGNodeLayoutGetLeft(node);
float t = YGNodeLayoutGetTop(node);
float w = YGNodeLayoutGetWidth(node);
float h = YGNodeLayoutGetHeight(node);

// Internal API without overhead (plain memory accesses, assuming allocations are eliminated via EA)
YGLayout layout = YGNode.create(node).layout();

float l = layout.positions(YGEdgeLeft);
float t = layout.positions(YGEdgeTop);
float w = layout.dimensions(YGDimensionWidth);
float h = layout.dimensions(YGDimensionHeight);""")}
        """
    )
}

val YGNodeRef = "YGNodeRef".handle
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
val YGPrintOptions = "YGPrintOptions".enumType
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

val YGLogger = Module.YOGA.callback {
    int(
        "YGLogger",
        "",

        YGConfigRef.const("config", ""),
        YGNodeRef.const("node", ""),
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

val YGCachedMeasurement = struct(Module.YOGA, "YGCachedMeasurement", mutable = false) {
    float("availableWidth", "")
    float("availableHeight", "")
    YGMeasureMode("widthMeasureMode", "")
    YGMeasureMode("heightMeasureMode", "")

    float("computedWidth", "")
    float("computedHeight", "")
}

val YGFloatOptional = struct(Module.YOGA, "YGFloatOptional", mutable = false) {
    float("value", "")
    bool("isUndefined", "")
}

const val YG_MAX_CACHED_RESULT_COUNT = 16
val YGLayout = struct(Module.YOGA, "YGLayout", mutable = false) {
    float("positions", "")[4]
    float("dimensions", "")[2]
    float("margin", "")[6]
    float("border", "")[6]
    float("padding", "")[6]
    YGDirection("direction", "")

    uint32_t("computedFlexBasisGeneration", "")
    YGFloatOptional("computedFlexBasis", "")
    bool("hadOverflow", "")

    uint32_t("generationCount", "")
    YGDirection("lastOwnerDirection", "")

    uint32_t("nextCachedMeasurementsIndex", "")
    YGCachedMeasurement("cachedMeasurements", "")[YG_MAX_CACHED_RESULT_COUNT]
    float("measuredDimensions", "")[2]

    YGCachedMeasurement("cachedLayout", "")
    bool("didUseLegacyFlag", "")
    bool("doesLegacyStretchFlagAffectsLayout", "")
}

const val YGEdgeCount = 9
val YGStyle = struct(Module.YOGA, "YGStyle", mutable = false) {
    YGDirection("direction", "")
    YGFlexDirection("flexDirection", "")
    YGJustify("justifyContent", "")
    YGAlign("alignContent", "")
    YGAlign("alignItems", "")
    YGAlign("alignSelf", "")
    YGPositionType("positionType", "")
    YGWrap("flexWrap", "")
    YGOverflow("overflow", "")
    YGDisplay("display", "")
    YGFloatOptional("flex", "")
    YGFloatOptional("flexGrow", "")
    YGFloatOptional("flexShrink", "")
    YGValue("flexBasis", "")
    YGValue("margin", "")[YGEdgeCount]
    YGValue("positions", "")[YGEdgeCount]
    YGValue("padding", "")[YGEdgeCount]
    YGValue("border", "")[YGEdgeCount]
    YGValue("dimensions", "")[2]
    YGValue("minDimensions", "")[2]
    YGValue("maxDimensions", "")[2]

    // Yoga specific properties, not compatible with flexbox specification
    YGFloatOptional("aspectRatio", "")
}

private val YGNodeListRef = "YGNodeListRef".handle
private val _YGNode = struct(Module.YOGA, "YGNode")
val YGNode = struct(Module.YOGA, "YGNode") {
    nullable..opaque_p("context", "")
    nullable..YGPrintFunc("print", "")
    bool("hasNewLayout", "")
    YGNodeType("nodeType", "")
    nullable..YGMeasureFunc("measure", "")
    nullable..YGBaselineFunc("baseline", "")
    nullable..YGDirtiedFunc("dirtied", "")

    YGStyle("style", "")
    YGLayout("layout", "")
    uint32_t("lineIndex", "")

    nullable..YGNodeRef("owner", "")
    nullable..YGNodeListRef("children", "")
    nullable.._YGNode.p("nextChild", "")

    nullable..YGConfigRef("config", "")
    bool("isDirty", "")
    YGValue.p("resolvedDimensions", "")[2]
}