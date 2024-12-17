/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package yoga.templates

import org.lwjgl.generator.*
import yoga.*

val yoga = "Yoga".nativeClass(Module.YOGA, prefix = "YG", prefixConstant = "YG", prefixMethod = "YG") {
    nativeDirective("""
DISABLE_WARNINGS()
#include <yoga/Yoga.h>
ENABLE_WARNINGS()""")

    cpp = true
    // YGConfig.h

    YGConfigRef(
        "ConfigNew",

        void()
    )

    void(
        "ConfigFree",

        YGConfigRef("config")
    )

    YGConfigConstRef(
        "ConfigGetDefault",

        void()
    )

    void(
        "ConfigSetUseWebDefaults",

        YGConfigRef("config"),
        bool("enabled")
    )
    bool(
        "ConfigGetUseWebDefaults",

        YGConfigConstRef("config")
    )

    void(
        "ConfigSetPointScaleFactor",

        YGConfigRef("config"),
        float("pixelsInPoint")
    )
    float(
        "ConfigGetPointScaleFactor",

        YGConfigConstRef("config")
    )

    void(
        "ConfigSetErrata",

        YGConfigRef("config"),
        YGErrata("errata")
    )
    YGErrata(
        "ConfigGetErrata",

        YGConfigConstRef("config")
    )

    void(
        "ConfigSetLogger",

        YGConfigRef("config"),
        nullable..YGLogger("logger")
    )

    void(
        "ConfigSetContext",

        YGConfigRef("config"),
        nullable..opaque_p("context")
    )
    opaque_p(
        "ConfigGetContext",

        YGConfigConstRef("config")
    )

    void(
        "ConfigSetExperimentalFeatureEnabled",

        YGConfigRef("config"),
        YGExperimentalFeature("feature"),
        bool("enabled")
    )
    bool(
        "ConfigIsExperimentalFeatureEnabled",

        YGConfigConstRef("config"),
        YGExperimentalFeature("feature")
    )

    void(
        "ConfigSetCloneNodeFunc",

        YGConfigRef("config"),
        nullable..YGCloneNodeFunc("callback")
    )

    // YGEnums.h

    EnumConstant(
        "AlignAuto".enum,
        "AlignFlexStart".enum,
        "AlignCenter".enum,
        "AlignFlexEnd".enum,
        "AlignStretch".enum,
        "AlignBaseline".enum,
        "AlignSpaceBetween".enum,
        "AlignSpaceAround".enum,
        "AlignSpaceEvenly".enum
    )

    EnumConstant(
        "BoxSizingBorderBox".enum,
        "BoxSizingContentBox".enum
    )

    EnumConstant(
        "DimensionWidth".enum,
        "DimensionHeight".enum
    )

    EnumConstant(
        "DirectionInherit".enum,
        "DirectionLTR".enum,
        "DirectionRTL".enum
    )

    EnumConstant(
        "DisplayFlex".enum,
        "DisplayNone".enum,
        "DisplayContents".enum
    )

    EnumConstant(
        "EdgeLeft".enum,
        "EdgeTop".enum,
        "EdgeRight".enum,
        "EdgeBottom".enum,
        "EdgeStart".enum,
        "EdgeEnd".enum,
        "EdgeHorizontal".enum,
        "EdgeVertical".enum,
        "EdgeAll".enum
    )

    EnumConstant(
        "ErrataNone".enum("0"),
        "ErrataStretchFlexBasis".enum("1"),
        "ErrataAbsolutePositionWithoutInsetsExcludesPadding".enum("2"),
        "ErrataAbsolutePercentAgainstInnerSize".enum("4"),
        "ErrataAll".enum("2147483647"),
        "ErrataClassic".enum("2147483646")
    )

    EnumConstant(
        "ExperimentalFeatureWebFlexBasis".enum
    )

    EnumConstant(
        "FlexDirectionColumn".enum,
        "FlexDirectionColumnReverse".enum,
        "FlexDirectionRow".enum,
        "FlexDirectionRowReverse".enum
    )

    EnumConstant(
        "GutterColumn".enum,
        "GutterRow".enum,
        "GutterAll".enum
    )

    EnumConstant(
        "JustifyFlexStart".enum,
        "JustifyCenter".enum,
        "JustifyFlexEnd".enum,
        "JustifySpaceBetween".enum,
        "JustifySpaceAround".enum,
        "JustifySpaceEvenly".enum
    )

    EnumConstant(
        "LogLevelError".enum,
        "LogLevelWarn".enum,
        "LogLevelInfo".enum,
        "LogLevelDebug".enum,
        "LogLevelVerbose".enum,
        "LogLevelFatal".enum
    )

    EnumConstant(
        "MeasureModeUndefined".enum,
        "MeasureModeExactly".enum,
        "MeasureModeAtMost".enum
    )

    EnumConstant(
        "NodeTypeDefault".enum,
        "NodeTypeText".enum
    )

    EnumConstant(
        "OverflowVisible".enum,
        "OverflowHidden".enum,
        "OverflowScroll".enum
    )

    EnumConstant(
        "PositionTypeStatic".enum,
        "PositionTypeRelative".enum,
        "PositionTypeAbsolute".enum
    )

    EnumConstant(
        "UnitUndefined".enum,
        "UnitPoint".enum,
        "UnitPercent".enum,
        "UnitAuto".enum
    )

    EnumConstant(
        "WrapNoWrap".enum,
        "WrapWrap".enum,
        "WrapReverse".enum
    )

    // YGNode.h

    YGNodeRef(
        "NodeNew",

        void()
    )

    YGNodeRef(
        "NodeNewWithConfig",

        YGConfigConstRef("config")
    )

    YGNodeRef(
        "NodeClone",

        YGNodeConstRef("node")
    )

    void(
        "NodeFree",

        YGNodeRef("node")
    )

    void(
        "NodeFreeRecursive",

        YGNodeRef("node")
    )

    void(
        "NodeFinalize",

        YGNodeRef("node")
    )

    void(
        "NodeReset",

        YGNodeRef("node")
    )

    void(
        "NodeCalculateLayout",

        YGNodeRef("node"),
        float("availableWidth"),
        float("availableHeight"),
        YGDirection("ownerDirection")
    )

    bool(
        "NodeGetHasNewLayout",

        YGNodeConstRef("node")
    )
    void(
        "NodeSetHasNewLayout",

        YGNodeRef("node"),
        bool("hasNewLayout")
    )

    bool(
        "NodeIsDirty",

        YGNodeConstRef("node")
    )
    void(
        "NodeMarkDirty",

        YGNodeRef("node")
    )

    void(
        "NodeSetDirtiedFunc",

        YGNodeRef("node"),
        nullable..YGDirtiedFunc("dirtiedFunc")
    )
    YGDirtiedFunc(
        "NodeGetDirtiedFunc",

        YGNodeConstRef("node")
    )

    void(
        "NodeInsertChild",

        YGNodeRef("node"),
        YGNodeRef("child"),
        size_t("index")
    )

    void(
        "NodeSwapChild",

        YGNodeRef("node"),
        YGNodeRef("child"),
        size_t("index")
    )

    void(
        "NodeRemoveChild",

        YGNodeRef("node"),
        YGNodeRef("child")
    )

    void(
        "NodeRemoveAllChildren",

        YGNodeRef("node")
    )

    void(
        "NodeSetChildren",

        YGNodeRef("owner"),
        YGNodeRef.const.p("children"),
        AutoSize("children")..size_t("count")
    )

    YGNodeRef(
        "NodeGetChild",

        YGNodeRef("node"),
        size_t("index")
    )

    size_t(
        "NodeGetChildCount",

        YGNodeConstRef("node")
    )

    YGNodeRef(
        "NodeGetOwner",

        YGNodeRef("node")
    )

    YGNodeRef(
        "NodeGetParent",

        YGNodeRef("node")
    )

    void(
        "NodeSetConfig",

        YGNodeRef("node"),
        YGConfigRef("config")
    )
    YGConfigRef(
        "NodeGetConfig",

        YGNodeRef("node")
    )

    void(
        "NodeSetContext",

        YGNodeRef("node"),
        nullable..opaque_p("context")
    )
    opaque_p(
        "NodeGetContext",

        YGNodeRef("node")
    )

    void(
        "NodeSetMeasureFunc",

        YGNodeRef("node"),
        nullable..YGMeasureFunc("measureFunc")
    )
    bool(
        "NodeHasMeasureFunc",

        YGNodeConstRef("node")
    )

    void(
        "NodeSetBaselineFunc",

        YGNodeRef("node"),
        nullable..YGBaselineFunc("baselineFunc")
    )
    bool(
        "NodeHasBaselineFunc",

        YGNodeConstRef("node")
    )

    void(
        "NodeSetIsReferenceBaseline",

        YGNodeRef("node"),
        bool("isReferenceBaseline")
    )
    bool(
        "NodeIsReferenceBaseline",

        YGNodeConstRef("node")
    )

    void(
        "NodeSetNodeType",

        YGNodeRef("node"),
        YGNodeType("nodeType")
    )
    YGNodeType(
        "NodeGetNodeType",

        YGNodeConstRef("node")
    )

    void(
        "NodeSetAlwaysFormsContainingBlock",

        YGNodeRef("node"),
        bool("alwaysFormsContainingBlock")
    )

    bool(
        "NodeGetAlwaysFormsContainingBlock",

        YGNodeConstRef("node")
    )

    // YGNodeLayout.h

    float("NodeLayoutGetLeft", YGNodeRef("node"))
    float("NodeLayoutGetTop", YGNodeRef("node"))
    float("NodeLayoutGetRight", YGNodeRef("node"))
    float("NodeLayoutGetBottom", YGNodeRef("node"))
    float("NodeLayoutGetWidth", YGNodeRef("node"))
    float("NodeLayoutGetHeight", YGNodeRef("node"))
    YGDirection("NodeLayoutGetDirection", YGNodeRef("node"))
    bool("NodeLayoutGetHadOverflow", YGNodeRef("node"))

    float(
        "NodeLayoutGetMargin",

        YGNodeRef("node"),
        YGEdge("edge")
    )

    float(
        "NodeLayoutGetBorder",

        YGNodeRef("node"),
        YGEdge("edge")
    )

    float(
        "NodeLayoutGetPadding",

        YGNodeRef("node"),
        YGEdge("edge")
    )

    // YGNodeStyle.h

    void(
        "NodeCopyStyle",

        YGNodeRef("dstNode"),
        YGNodeConstRef("srcNode")
    )

    void(
        "NodeStyleSetDirection",

        YGNodeRef("node"),
        YGDirection("direction")
    )
    YGDirection("NodeStyleGetDirection", YGNodeConstRef("node"))

    void(
        "NodeStyleSetFlexDirection",

        YGNodeRef("node"),
        YGFlexDirection("flexDirection")
    )
    YGFlexDirection("NodeStyleGetFlexDirection", YGNodeConstRef("node")
    )

    void(
        "NodeStyleSetJustifyContent",

        YGNodeRef("node"),
        YGJustify("justifyContent")
    )
    YGJustify("NodeStyleGetJustifyContent", YGNodeConstRef("node"))

    void(
        "NodeStyleSetAlignContent",

        YGNodeRef("node"),
        YGAlign("alignContent")
    )
    YGAlign("NodeStyleGetAlignContent", YGNodeConstRef("node"))

    void(
        "NodeStyleSetAlignItems",

        YGNodeRef("node"),
        YGAlign("alignItems")
    )
    YGAlign("NodeStyleGetAlignItems", YGNodeConstRef("node"))

    void(
        "NodeStyleSetAlignSelf",

        YGNodeRef("node"),
        YGAlign("alignSelf")
    )
    YGAlign("NodeStyleGetAlignSelf", YGNodeConstRef("node"))

    void(
        "NodeStyleSetPositionType",

        YGNodeRef("node"),
        YGPositionType("positionType")
    )
    YGPositionType("NodeStyleGetPositionType", YGNodeConstRef("node"))

    void(
        "NodeStyleSetPositionAuto",

        YGNodeRef("node"),
        YGEdge("edge")
    )

    void(
        "NodeStyleSetFlexWrap",

        YGNodeRef("node"),
        YGWrap("flexWrap")
    )
    YGWrap("NodeStyleGetFlexWrap", YGNodeConstRef("node"))

    void(
        "NodeStyleSetOverflow",

        YGNodeRef("node"),
        YGOverflow("overflow")
    )
    YGOverflow("NodeStyleGetOverflow", YGNodeConstRef("node"))

    void(
        "NodeStyleSetDisplay",

        YGNodeRef("node"),
        YGDisplay("display")
    )
    YGDisplay("NodeStyleGetDisplay", YGNodeConstRef("node"))

    void(
        "NodeStyleSetFlex",

        YGNodeRef("node"),
        float("flex")
    )
    float("NodeStyleGetFlex", YGNodeConstRef("node"))

    void(
        "NodeStyleSetFlexGrow",

        YGNodeRef("node"),
        float("flexGrow")
    )
    float("NodeStyleGetFlexGrow", YGNodeConstRef("node"))

    void(
        "NodeStyleSetFlexShrink",

        YGNodeRef("node"),
        float("flexShrink")
    )
    float("NodeStyleGetFlexShrink", YGNodeConstRef("node"))

    void(
        "NodeStyleSetFlexBasis",

        YGNodeRef("node"),
        float("flexBasis")
    )
    void(
        "NodeStyleSetFlexBasisPercent",

        YGNodeRef("node"),
        float("flexBasis")
    )
    void(
        "NodeStyleSetFlexBasisAuto",

        YGNodeRef("node")
    )
    YGValue("NodeStyleGetFlexBasis", YGNodeConstRef("node"))

    void(
        "NodeStyleSetPosition",

        YGNodeRef("node"),
        YGEdge("edge"),
        float("position")
    )
    void(
        "NodeStyleSetPositionPercent",

        YGNodeRef("node"),
        YGEdge("edge"),
        float("position")
    )
    YGValue(
        "NodeStyleGetPosition",

        YGNodeConstRef("node"),
        YGEdge("edge")
    )

    void(
        "NodeStyleSetMargin",

        YGNodeRef("node"),
        YGEdge("edge"),
        float("margin")
    )
    void(
        "NodeStyleSetMarginPercent",

        YGNodeRef("node"),
        YGEdge("edge"),
        float("margin")
    )
    void(
        "NodeStyleSetMarginAuto",

        YGNodeRef("node"),
        YGEdge("edge")
    )
    YGValue(
        "NodeStyleGetMargin",

        YGNodeConstRef("node"),
        YGEdge("edge")
    )

    void(
        "NodeStyleSetPadding",

        YGNodeRef("node"),
        YGEdge("edge"),
        float("padding")
    )
    void(
        "NodeStyleSetPaddingPercent",

        YGNodeRef("node"),
        YGEdge("edge"),
        float("padding")
    )
    YGValue(
        "NodeStyleGetPadding",

        YGNodeConstRef("node"),
        YGEdge("edge")
    )

    void(
        "NodeStyleSetBorder",

        YGNodeRef("node"),
        YGEdge("edge"),
        float("border")
    )
    float(
        "NodeStyleGetBorder",

        YGNodeConstRef("node"),
        YGEdge("edge")
    )

    void(
        "NodeStyleSetGap",

        YGNodeRef("node"),
        YGGutter("gutter"),
        float("gapLength")
    )
    void(
        "NodeStyleSetGapPercent",

        YGNodeRef("node"),
        YGGutter("gutter"),
        float("gapLength")
    )
    float(
        "NodeStyleGetGap",

        YGNodeConstRef("node"),
        YGGutter("gutter")
    )

    void(
        "NodeStyleSetBoxSizing",

        YGNodeRef("node"),
        YGBoxSizing("boxSizing")
    )

    YGBoxSizing(
        "NodeStyleGetBoxSizing",

        YGNodeConstRef("node")
    )

    void(
        "NodeStyleSetWidth",

        YGNodeRef("node"),
        float("width")
    )
    void(
        "NodeStyleSetWidthPercent",

        YGNodeRef("node"),
        float("width")
    )
    void(
        "NodeStyleSetWidthAuto",

        YGNodeRef("node")
    )
    YGValue("NodeStyleGetWidth", YGNodeConstRef("node"))

    void(
        "NodeStyleSetHeight",

        YGNodeRef("node"),
        float("height")
    )
    void(
        "NodeStyleSetHeightPercent",

        YGNodeRef("node"),
        float("height")
    )
    void(
        "NodeStyleSetHeightAuto",

        YGNodeRef("node")
    )
    YGValue("NodeStyleGetHeight", YGNodeConstRef("node"))

    void(
        "NodeStyleSetMinWidth",

        YGNodeRef("node"),
        float("minWidth")
    )
    void(
        "NodeStyleSetMinWidthPercent",

        YGNodeRef("node"),
        float("minWidth")
    )
    YGValue("NodeStyleGetMinWidth", YGNodeConstRef("node"))

    void(
        "NodeStyleSetMinHeight",

        YGNodeRef("node"),
        float("minHeight")
    )
    void(
        "NodeStyleSetMinHeightPercent",

        YGNodeRef("node"),
        float("minHeight")
    )
    YGValue("NodeStyleGetMinHeight", YGNodeConstRef("node"))

    void(
        "NodeStyleSetMaxWidth",

        YGNodeRef("node"),
        float("maxWidth")
    )
    void(
        "NodeStyleSetMaxWidthPercent",

        YGNodeRef("node"),
        float("maxWidth")
    )
    YGValue("NodeStyleGetMaxWidth", YGNodeConstRef("node"))

    void(
        "NodeStyleSetMaxHeight",

        YGNodeRef("node"),
        float("maxHeight")
    )
    void(
        "NodeStyleSetMaxHeightPercent",

        YGNodeRef("node"),
        float("maxHeight")
    )
    YGValue("NodeStyleGetMaxHeight", YGNodeConstRef("node"))

    void(
        "NodeStyleSetAspectRatio",

        YGNodeRef("node"),
        float("aspectRatio")
    )
    float("NodeStyleGetAspectRatio", YGNodeConstRef("node"))

    // YGPixelGrid.h

    float(
        "RoundValueToPixelGrid",

        double("value"),
        double("pointScaleFactor"),
        bool("forceCeil"),
        bool("forceFloor")
    )

    // YGValue.h

    FloatConstant(
        "Undefined".."Float.NaN"
    )

    // Pre-defined YGValue structs

    macro..YGValue(
        "ValueAuto",

        void()
    )
    macro..YGValue(
        "ValueUndefined",
        void()
    )
    macro..YGValue(
        "ValueZero",

        void()
    )

    bool(
        "FloatIsUndefined",

        float("value")
    )

    // Enums

    fun YG_TYPE_TO_STRING(type: IntegerType) {
        val name = type.name.substring(2)
        Nonnull..charASCII.const.p(
            "${name}ToString",

            type("value")
        )
    }

    YG_TYPE_TO_STRING(YGAlign)
    YG_TYPE_TO_STRING(YGDimension)
    YG_TYPE_TO_STRING(YGDirection)
    YG_TYPE_TO_STRING(YGDisplay)
    YG_TYPE_TO_STRING(YGEdge)
    YG_TYPE_TO_STRING(YGErrata)
    YG_TYPE_TO_STRING(YGExperimentalFeature)
    YG_TYPE_TO_STRING(YGFlexDirection)
    YG_TYPE_TO_STRING(YGGutter)
    YG_TYPE_TO_STRING(YGJustify)
    YG_TYPE_TO_STRING(YGLogLevel)
    YG_TYPE_TO_STRING(YGMeasureMode)
    YG_TYPE_TO_STRING(YGNodeType)
    YG_TYPE_TO_STRING(YGOverflow)
    YG_TYPE_TO_STRING(YGPositionType)
    YG_TYPE_TO_STRING(YGUnit)
    YG_TYPE_TO_STRING(YGWrap)

}