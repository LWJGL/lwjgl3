/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package yoga

import org.lwjgl.generator.*

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

// Marker API

val YGMarkerLayoutData = struct(Module.YOGA, "YGMarkerLayoutData", mutable = false) {
    int("layouts", "")
    int("measures", "")
    int("maxMeasureCache", "")
    int("cachedLayouts", "")
    int("cachedMeasures", "")
}

val YGMarkerNoData = struct(Module.YOGA, "YGMarkerNoData", mutable = false) {
    bool("_unused", "").private()
}

val YGMarkerData = union(Module.YOGA, "YGMarkerData", mutable = false) {
  YGMarkerLayoutData.p("layout", "")
  YGMarkerNoData.p("noData", "")
}

val YGMarker = "YGMarker".enumType

// TODO: parameter data is passed by value
val YGMarkerCallbacks = struct(Module.YOGA, "YGMarkerCallbacks") {
  nullable..Module.YOGA.callback {
        opaque_p(
            "StartMarkerCallback",
            "The start marker callback.",

            YGMarker("marker", ""),
            YGNodeRef("node", ""),
            //YGMarkerData("data", "")
            opaque_p("data", "")
        ) {
            documentation = "Instances of this interface may be set to the {@code startMarker} field of the ##YGMarkerCallbacks struct."
        }
    }(
        "startMarker",
        "Accepts marker type, a node ref, and marker data (depends on marker type) can return a handle or id that Yoga will pass to {@code endMarker}."
    )
  nullable..Module.YOGA.callback {
        void(
            "EndMarkerCallback",
            "The end marker callback.",

            YGMarker("marker", ""),
            YGNodeRef("node", ""),
            //YGMarkerData("data", ""),
            opaque_p("data", ""),
            opaque_p("id", "")
        ) {
            documentation = "Instances of this interface may be set to the {@code endMarker} field of the ##YGMarkerCallbacks struct."
        }
    }(
        "endMarker",
        "Accepts marker type, a node ref, marker data, and marker id as returned by {@code startMarker}."
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

    cpp = true
    nativeImport("YGLayout.h")

    NativeName("position")..float("positions", "")[4]
    float("dimensions", "")[2]
    float("margin", "")[6]
    float("border", "")[6]
    float("padding", "")[6]
    YGDirection("direction", "", bits = 2)
    bool("didUseLegacyFlag", "", bits = 1)
    bool("doesLegacyStretchFlagAffectsLayout", "", bits = 1)
    bool("hadOverflow", "", bits = 1)

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

    cpp = true
    nativeImport("YGStyle.h")

    YGDirection("direction", "", bits = 2)
    YGFlexDirection("flexDirection", "", bits = 2)
    YGJustify("justifyContent", "", bits = 3)
    YGAlign("alignContent", "", bits = 3)
    YGAlign("alignItems", "", bits = 3)
    YGAlign("alignSelf", "", bits = 3)
    YGPositionType("positionType", "", bits = 1)
    YGWrap("flexWrap", "", bits = 2)
    YGOverflow("overflow", "", bits = 2)
    YGDisplay("display", "", bits = 1)
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

    cpp = true
    nativeImport("Yoga.h")
    nativeImport("YGLayout.h")
    nativeImport("YGStyle.h")

    // Redefine YGNode as a struct to expose the private layout
    nativeDirective("""
typedef YGSize (*MeasureWithContextFn)(YGNode*, float, YGMeasureMode, float, YGMeasureMode, void*);
typedef float (*BaselineWithContextFn)(YGNode*, float, float, void*);
typedef void (*PrintWithContextFn)(YGNode*, void*);

typedef struct YGNodeLWJGL {
  void* context;
  bool hasNewLayout : 1;
  bool isReferenceBaseline : 1;
  bool isDirty : 1;
  YGNodeType nodeType : 1;
  bool measureUsesContext : 1;
  bool baselineUsesContext : 1;
  bool printUsesContext : 1;
  union {
    YGMeasureFunc noContext;
    MeasureWithContextFn withContext;
  } measure;
  union {
    YGBaselineFunc noContext;
    BaselineWithContextFn withContext;
  } baseline;
  union {
    YGPrintFunc noContext;
    PrintWithContextFn withContext;
  } print;
  YGDirtiedFunc dirtied;
  YGStyle style;
  YGLayout layout;
  uint32_t lineIndex;
  YGNodeRef owner;
  YGVector children;
  YGConfigRef config;
  std::array<YGValue, 2> resolvedDimensions;
} YGNodeLWJGL;""")

    nullable..opaque_p("context", "")
    bool("hasNewLayout", "", bits = 1)
    bool("isReferenceBaseline", "", bits = 1)
    bool("isDirty", "", bits = 1)
    YGNodeType("nodeType", "", bits = 1)
    bool("measureUsesContext", "", bits = 1)
    bool("baselineUsesContext", "", bits = 1)
    bool("printUsesContext", "", bits = 1)

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