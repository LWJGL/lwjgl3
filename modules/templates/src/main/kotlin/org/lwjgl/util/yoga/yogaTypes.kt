/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.yoga

import org.lwjgl.generator.*

val YOGA_PACKAGE = "org.lwjgl.util.yoga"

fun config() {
    packageInfo(
        YOGA_PACKAGE,
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

val YGNodeRef = "YGNodeRef".opaque_p
val YGConfigRef = "YGConfigRef".opaque_p

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
val YGOverflow = "YGOverflow".enumType
val YGPositionType = "YGPositionType".enumType
val YGPrintOptions = "YGPrintOptions".enumType
val YGUnit = "YGUnit".enumType
val YGWrap = "YGWrap".enumType

val YGSize = struct(YOGA_PACKAGE, "YGSize") {
    float.member("width", "")
    float.member("height", "")
}

val YGValue = struct(YOGA_PACKAGE, "YGValue") {
    float.member("value", "")
    YGUnit.member("unit", "")
}

// TODO: Returns struct by value
val YGMeasureFunc = "YGMeasureFunc".callback(
    YOGA_PACKAGE, uint64_t/*YGSize*/, "YGMeasureFunc",
    "Use {@link YGMeasureFunc\\#toLong toLong} to create the return value.",

    YGNodeRef.IN("node", ""),
    float.IN("width", ""),
    YGMeasureMode.IN("widthMode", ""),
    float.IN("height", ""),
    YGMeasureMode.IN("heightMode", "")
) {
    javaImport("static java.lang.Float.*")
    additionalCode = """
    public static long toLong(YGSize size) {
        return floatToRawIntBits(size.width()) | ((long)floatToRawIntBits(size.height()) << 32);
    }
    """
}

val YGBaselineFunc = "YGBaselineFunc".callback(
    YOGA_PACKAGE, float, "YGBaselineFunc",
    "",

    YGNodeRef.IN("node", ""),
    float.IN("width", ""),
    float.IN("height", "")
)

val YGPrintFunc = "YGPrintFunc".callback(
    YOGA_PACKAGE, void, "YGPrintFunc",
    "",

    YGNodeRef.IN("node", "")
)

val YGLogger = "YGLogger".callback(
    YOGA_PACKAGE, int, "YGLogger",
    "",

    const..YGConfigRef.IN("config", ""),
    const..YGNodeRef.IN("node", ""),
    YGLogLevel.IN("level", ""),
    const..charUTF8_p.IN("format", ""),
    va_list.IN("args", "")
)

val YGMalloc = "YGMalloc".callback(
    YOGA_PACKAGE, opaque_p, "YGMalloc",
    "",

    size_t.IN("size", "")
)

val YGCalloc = "YGCalloc".callback(
    YOGA_PACKAGE, opaque_p, "YGMalloc",
    "",

    size_t.IN("count", ""),
    size_t.IN("size", "")
)

val YGRealloc = "YGRealloc".callback(
    YOGA_PACKAGE, opaque_p, "YGRealloc",
    "",

    nullable..opaque_p.IN("ptr", ""),
    size_t.IN("size", "")
)

val YGFree = "YGFree".callback(
    YOGA_PACKAGE, opaque_p, "YGFree",
    "",

    nullable..opaque_p.IN("ptr", "")
)

// Internal API, exposed for efficiency.

val YGCachedMeasurement = struct(YOGA_PACKAGE, "YGCachedMeasurement", mutable = false) {
    float.member("availableWidth", "")
    float.member("availableHeight", "")
    YGMeasureMode.member("widthMeasureMode", "")
    YGMeasureMode.member("heightMeasureMode", "")

    float.member("computedWidth", "")
    float.member("computedHeight", "")
}

val YG_MAX_CACHED_RESULT_COUNT = 16
val YGLayout = struct(YOGA_PACKAGE, "YGLayout", mutable = false) {
    float.array("positions", "", size = 4)
    float.array("dimensions", "", size = 2)
    float.array("margin", "", size = 6)
    float.array("border", "", size = 6)
    float.array("padding", "", size = 6)
    YGDirection.member("direction", "")

    uint32_t.member("computedFlexBasisGeneration", "")
    float.member("computedFlexBasis", "")

    uint32_t.member("generationCount", "")
    YGDirection.member("lastParentDirection", "")

    uint32_t.member("nextCachedMeasurementsIndex", "")
    YGCachedMeasurement.array("cachedMeasurements", "", size = YG_MAX_CACHED_RESULT_COUNT)
    float.array("measuredDimensions", "", size = 2)

    YGCachedMeasurement.member("cachedLayout", "")
}

val YGEdgeCount = 9
val YGStyle = struct(YOGA_PACKAGE, "YGStyle", mutable = false) {
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
    float.member("flex", "")
    float.member("flexGrow", "")
    float.member("flexShrink", "")
    YGValue.member("flexBasis", "")
    YGValue.array("margin", "", size = YGEdgeCount)
    YGValue.array("positions", "", size = YGEdgeCount)
    YGValue.array("padding", "", size = YGEdgeCount)
    YGValue.array("border", "", size = YGEdgeCount)
    YGValue.array("dimensions", "", size = 2)
    YGValue.array("minDimensions", "", size = 2)
    YGValue.array("maxDimensions", "", size = 2)

    // Yoga specific properties, not compatible with flexbox specification
    float.member("aspectRatio", "")
}

val YGNodeListRef = "YGNodeListRef".opaque_p
val YGNode_p = struct(YOGA_PACKAGE, "YGNode").p
val YGNode = struct(YOGA_PACKAGE, "YGNode", mutable = false) {
    YGStyle.member("style", "")
    YGLayout.member("layout", "")
    uint32_t.member("lineIndex", "")

    YGNodeRef.member("parent", "")
    YGNodeListRef.member("children", "")

    YGNode_p.member("nextChild", "")

    YGMeasureFunc.member("measure", "")
    YGPrintFunc.member("print", "")
    opaque_p.member("context", "")

    bool.member("isDirty", "")
    bool.member("hasNewLayout", "")

    YGValue.p.array("resolvedDimensions", "", size = 2)
}