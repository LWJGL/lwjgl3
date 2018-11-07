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
    float.member("width", "")
    float.member("height", "")
}

val YGValue = struct(Module.YOGA, "YGValue") {
    float.member("value", "")
    YGUnit.member("unit", "")
}

// TODO: Returns struct by value
val YGMeasureFunc = Module.YOGA.callback {
    uint64_t/*YGSize*/(
        "YGMeasureFunc",
        "Use {@link YGMeasureFunc\\#toLong toLong} to create the return value.",

        YGNodeRef.IN("node", ""),
        float.IN("width", ""),
        YGMeasureMode.IN("widthMode", ""),
        float.IN("height", ""),
        YGMeasureMode.IN("heightMode", ""),

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

        YGNodeRef.IN("node", ""),
        float.IN("width", ""),
        float.IN("height", ""),

        nativeType = "YGBaselineFunc"
    )
}

val YGDirtiedFunc = Module.YOGA.callback {
    void(
        "YGDirtiedFunc",
        "",

        YGNodeRef.IN("node", ""),

        nativeType = "YGDirtiedFunc"
    )
}

val YGPrintFunc = Module.YOGA.callback {
    void(
        "YGPrintFunc",
        "",

        YGNodeRef.IN("node", ""),

        nativeType = "YGPrintFunc"
    )
}

val YGLogger = Module.YOGA.callback {
    int(
        "YGLogger",
        "",

        YGConfigRef.const.IN("config", ""),
        YGNodeRef.const.IN("node", ""),
        YGLogLevel.IN("level", ""),
        charUTF8.const.p.IN("format", ""),
        va_list.IN("args", ""),

        nativeType = "YGLogger"
    )
}

val YGCloneNodeFunc = Module.YOGA.callback {
    YGNodeRef(
        "YGCloneNodeFunc",
        "",

        YGNodeRef.IN("oldNode", ""),
        YGNodeRef.IN("owner", ""),
        int.IN("childIndex", ""),

        nativeType = "YGCloneNodeFunc"
    )
}

// Internal API, exposed for efficiency.

val YGCachedMeasurement = struct(Module.YOGA, "YGCachedMeasurement", mutable = false) {
    float.member("availableWidth", "")
    float.member("availableHeight", "")
    YGMeasureMode.member("widthMeasureMode", "")
    YGMeasureMode.member("heightMeasureMode", "")

    float.member("computedWidth", "")
    float.member("computedHeight", "")
}

val YGFloatOptional = struct(Module.YOGA, "YGFloatOptional", mutable = false) {
    float.member("value", "")
    bool.member("isUndefined", "")
}

const val YG_MAX_CACHED_RESULT_COUNT = 16
val YGLayout = struct(Module.YOGA, "YGLayout", mutable = false) {
    float.member("positions", "")[4]
    float.member("dimensions", "")[2]
    float.member("margin", "")[6]
    float.member("border", "")[6]
    float.member("padding", "")[6]
    YGDirection.member("direction", "")

    uint32_t.member("computedFlexBasisGeneration", "")
    YGFloatOptional.member("computedFlexBasis", "")
    bool.member("hadOverflow", "")

    uint32_t.member("generationCount", "")
    YGDirection.member("lastOwnerDirection", "")

    uint32_t.member("nextCachedMeasurementsIndex", "")
    YGCachedMeasurement.member("cachedMeasurements", "")[YG_MAX_CACHED_RESULT_COUNT]
    float.member("measuredDimensions", "")[2]

    YGCachedMeasurement.member("cachedLayout", "")
    bool.member("didUseLegacyFlag", "")
    bool.member("doesLegacyStretchFlagAffectsLayout", "")
}

const val YGEdgeCount = 9
val YGStyle = struct(Module.YOGA, "YGStyle", mutable = false) {
    YGDirection.member("direction", "")
    YGFlexDirection.member("flexDirection", "")
    YGJustify.member("justifyContent", "")
    YGAlign.member("alignContent", "")
    YGAlign.member("alignItems", "")
    YGAlign.member("alignSelf", "")
    YGPositionType.member("positionType", "")
    YGWrap.member("flexWrap", "")
    YGOverflow.member("overflow", "")
    YGDisplay.member("display", "")
    YGFloatOptional.member("flex", "")
    YGFloatOptional.member("flexGrow", "")
    YGFloatOptional.member("flexShrink", "")
    YGValue.member("flexBasis", "")
    YGValue.member("margin", "")[YGEdgeCount]
    YGValue.member("positions", "")[YGEdgeCount]
    YGValue.member("padding", "")[YGEdgeCount]
    YGValue.member("border", "")[YGEdgeCount]
    YGValue.member("dimensions", "")[2]
    YGValue.member("minDimensions", "")[2]
    YGValue.member("maxDimensions", "")[2]

    // Yoga specific properties, not compatible with flexbox specification
    YGFloatOptional.member("aspectRatio", "")
}

private val YGNodeListRef = "YGNodeListRef".handle
private val _YGNode = struct(Module.YOGA, "YGNode")
val YGNode = struct(Module.YOGA, "YGNode") {
    nullable..opaque_p.member("context", "")
    nullable..YGPrintFunc.member("print", "")
    bool.member("hasNewLayout", "")
    YGNodeType.member("nodeType", "")
    nullable..YGMeasureFunc.member("measure", "")
    nullable..YGBaselineFunc.member("baseline", "")
    nullable..YGDirtiedFunc.member("dirtied", "")

    YGStyle.member("style", "")
    YGLayout.member("layout", "")
    uint32_t.member("lineIndex", "")

    nullable..YGNodeRef.member("owner", "")
    nullable..YGNodeListRef.member("children", "")
    nullable.._YGNode.p.member("nextChild", "")

    nullable..YGConfigRef.member("config", "")
    bool.member("isDirty", "")
    YGValue.p.member("resolvedDimensions", "")[2]
}