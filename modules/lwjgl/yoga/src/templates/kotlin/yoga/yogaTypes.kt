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

val YGMeasureFunc = Module.YOGA.callback {
    YGSize(
        "YGMeasureFunc",
        "",

        YGNodeRef("node", ""),
        float("width", ""),
        YGMeasureMode("widthMode", ""),
        float("height", ""),
        YGMeasureMode("heightMode", ""),

        nativeType = "YGMeasureFunc"
    )
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
    javaImport("static org.lwjgl.util.yoga.Yoga.*")
    documentation = "Unstable/private API."

    union {
        float("value", "")
        uint32_t("repr", "")
    }

    customMethod("""
    private static final int BIAS        = 0x20000000;
    private static final int PERCENT_BIT = 0x40000000;

    private static final int AUTO_BITS         = 0x7faaaaaa;
    private static final int ZERO_BITS_POINT   = 0x7f8f0f0f;
    private static final int ZERO_BITS_PERCENT = 0x7f80f0f0;

    public float decode() {
        int repr = repr();

        switch (repr) {
            case AUTO_BITS:
                return Float.NaN;
            case ZERO_BITS_POINT:
            case ZERO_BITS_PERCENT:
                return 0.0f;
        }

        if (Float.isNaN(value())) {
            return Float.NaN;
        }

        repr &= ~PERCENT_BIT;
        repr += BIAS;

        return Float.intBitsToFloat(repr);
    }

    public YGValue decode(YGValue __result) {
        int repr = repr();

        switch (repr) {
            case AUTO_BITS:
                return __result
                    .value(YGUndefined)
                    .unit(YGUnitAuto);
            case ZERO_BITS_POINT:
                return __result
                    .value(0.0f)
                    .unit(YGUnitPoint);
            case ZERO_BITS_PERCENT:
                return __result
                    .value(0.0f)
                    .unit(YGUnitPercent);
        }

        if (Float.isNaN(value())) {
            return __result
                .value(YGUndefined)
                .unit(YGUnitUndefined);
        }

        int data = repr;
        data &= ~PERCENT_BIT;
        data += BIAS;

        return __result
            .value(Float.intBitsToFloat(data))
            .unit((repr & PERCENT_BIT) != 0 ? YGUnitPercent : YGUnitPoint);
    }
    """)
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

    customMethod("""
    public boolean isUndefined() {
        return Float.isNaN(value());
    }""")
}

const val YG_MAX_CACHED_RESULT_COUNT = 16
val YGLayout = struct(Module.YOGA, "YGLayout", mutable = false) {
    documentation = "Unstable/private API."

    NativeName("position")..float("positions", "")[4]
    float("dimensions", "")[2]
    float("margin", "")[4]
    float("border", "")[4]
    float("padding", "")[4]

    uint8_t("flags", "").virtual()
    YGDirection("direction", "", bits = 2).getter("nflags(struct) & 0b11")
    bool("didUseLegacyFlag", "", bits = 1).getter("((nflags(struct) >>> 2) & 0b1) != 0")
    bool("doesLegacyStretchFlagAffectsLayout", "", bits = 1).getter("((nflags(struct) >>> 3) & 0b1) != 0")
    bool("hadOverflow", "", bits = 1).getter("((nflags(struct) >>> 4) & 0b1) != 0")

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

    uint32_t("flags", "").virtual()
    YGDirection("direction", "", bits = 2).getter("nflags(struct) & 0b11")
    YGFlexDirection("flexDirection", "", bits = 2).getter("(nflags(struct) >>> 2) & 0b11")
    YGJustify("justifyContent", "", bits = 3).getter("(nflags(struct) >>> 4) & 0b111")
    YGAlign("alignContent", "", bits = 3).getter("(nflags(struct) >>> 7) & 0b111")
    YGAlign("alignItems", "", bits = 3).getter("(nflags(struct) >>> 10) & 0b111")
    YGAlign("alignSelf", "", bits = 3).getter("(nflags(struct) >>> 13) & 0b111")
    YGPositionType("positionType", "", bits = 2).getter("(nflags(struct) >>> 16) & 0b11")
    YGWrap("flexWrap", "", bits = 2).getter("(nflags(struct) >>> 18) & 0b11")
    YGOverflow("overflow", "", bits = 2).getter("(nflags(struct) >>> 20) & 0b11")
    YGDisplay("display", "", bits = 1).getter("(nflags(struct) >>> 22) & 0b1")
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

val YGNode = struct(Module.YOGA, "YGNode") {
    documentation = "Unstable/private API."

    nullable..opaque_p("context", "")

    uint8_t("flags", "").virtual()
    bool("hasNewLayout", "", bits = 1).getter("(nflags(struct) & 0b1) != 0")
    bool("isReferenceBaseline", "", bits = 1).getter("((nflags(struct) >>> 1) & 0b1) != 0")
    bool("isDirty", "", bits = 1).getter("((nflags(struct) >>> 2) & 0b1) != 0")
    YGNodeType("nodeType", "", bits = 1).getter("(nflags(struct) >>> 3) & 0b1")
    bool("measureUsesContext", "", bits = 1).getter("((nflags(struct) >>> 4) & 0b1) != 0")
    bool("baselineUsesContext", "", bits = 1).getter("((nflags(struct) >>> 5) & 0b1) != 0")
    bool("printUsesContext", "", bits = 1).getter("((nflags(struct) >>> 6) & 0b1) != 0")
    bool("useWebDefaults", "", bits = 1).getter("((nflags(struct) >>> 7) & 0b1) != 0")
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