/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package yoga

import org.lwjgl.generator.*

val YGNodeRef = "YGNodeRef".handle
val YGNodeConstRef = "YGNodeConstRef".handle

val YGConfigRef = "YGConfigRef".handle
val YGConfigConstRef = "YGConfigConstRef".handle

val YGAlign = "YGAlign".enumType
val YGBoxSizing = "YGBoxSizing".enumType
val YGDimension = "YGDimension".enumType
val YGDirection = "YGDirection".enumType
val YGDisplay = "YGDisplay".enumType
val YGEdge = "YGEdge".enumType
val YGErrata = "YGErrata".enumType
val YGExperimentalFeature = "YGExperimentalFeature".enumType
val YGFlexDirection = "YGFlexDirection".enumType
val YGGutter = "YGGutter".enumType
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
        """
        Returns the computed dimensions of the node, following the constraints of {@code widthMode} and {@code heightMode}:

        #MeasureModeUndefined: The parent has not imposed any constraint on the child. It can be whatever size it wants.
 
        #MeasureModeAtMost: The child can be as large as it wants up to the specified size.
 
        #MeasureModeExactly: The parent has determined an exact size for the child. The child is going to be given those bounds regardless of how big it wants
        to be.
        """,

        YGNodeConstRef("node", ""),
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
        "Returns a defined offset to baseline (ascent).",

        YGNodeConstRef("node", ""),
        float("width", ""),
        float("height", ""),

        nativeType = "YGBaselineFunc"
    )
}

val YGDirtiedFunc = Module.YOGA.callback {
    void(
        "YGDirtiedFunc",
        "",

        YGNodeConstRef("node", ""),

        nativeType = "YGDirtiedFunc"
    )
}

val YGLogger = Module.YOGA.callback {
    int(
        "YGLogger",
        "",

        YGConfigConstRef("config", ""),
        YGNodeConstRef("node", ""),
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

        YGNodeConstRef("oldNode", ""),
        YGNodeConstRef("owner", ""),
        int("childIndex", ""),

        nativeType = "YGCloneNodeFunc"
    )
}