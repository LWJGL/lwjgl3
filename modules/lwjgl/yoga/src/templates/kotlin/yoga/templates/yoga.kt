/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package yoga.templates

import org.lwjgl.generator.*
import yoga.*

val yoga = "Yoga".nativeClass(Module.YOGA, prefix = "YG", prefixConstant = "YG", prefixMethod = "YG") {
    nativeDirective("""#define FB_ASSERTIONS_ENABLED 0
#define YG_ASSERT(X, message)
DISABLE_WARNINGS()
#include "Yoga.h"
ENABLE_WARNINGS()""")

    cpp = true
    documentation =
        """
        Native bindings to ${url("https://facebook.github.io/yoga/", "Yoga")}.

        Yoga is an open-source, cross-platform layout library that implements Flexbox. Yoga’s focus is on creating an expressive layout library, not
        implementing all of CSS. Therefore, there are no plans to include support for tables, floats, or similar CSS concepts. Yoga also does not support
        styling properties that have no impact on layout, such as color or background properties.

        <h3>Yoga vs Flexbox</h3>

        Yoga aims to be compatible with Flexbox according to the w3 specification. However, Yoga was not developed to strictly adhere to the specification;
        thus, there are aspects where Yoga differs.

        <h3>Default values</h3>

        Yoga has chosen to change the default values of some properties to better fit mobile layout use cases. The following CSS block describes the
        differences in default values from the Flexbox w3 specification:
        ${codeBlock("""
div {
  box-sizing: border-box;
  position: relative;

  display: flex;
  flex-direction: column;
  align-items: stretch;
  flex-shrink: 0;
  align-content: flex-start;

  border-width: 0px;
  margin: 0px;
  padding: 0px;
  min-width: 0px;
}""")}

        <h3>Right-to-Left</h3>

        We believe that Right-to-Left (RTL) should be a first class citizen when it comes to layout. Therefore, Yoga implements non-standard RTL support for
        margin, padding, border, and position properties. This enables specifying these properties as start instead of left and end instead of right.

        <h3>Yoga-specific properties</h3>

        The goal of Yoga is to be a library which makes layout easy. Of course, implementing Flexbox, a common and well-liked system, helps meet this goal.
        However, there are areas where we think Yoga can evolve beyond Flexbox and provide developers with tools not included in the Flexbox w3 specification.
        Currently Yoga has added one such property, AspectRatio, to solve a common problem we saw in many UIs.
        """

    FloatConstant(
        "",

        "Undefined".."Float.NaN"
    )

    EnumConstant(
        "YGAlign",

        "AlignAuto".enum,
        "AlignFlexStart".enum,
        "AlignCenter".enum,
        "AlignFlexEnd".enum,
        "AlignStretch".enum,
        "AlignBaseline".enum,
        "AlignSpaceBetween".enum,
        "AlignSpaceAround".enum
    )

    EnumConstant(
        "YGDimension",

        "DimensionWidth".enum,
        "DimensionHeight".enum
    )

    EnumConstant(
        "YGDirection",

        "DirectionInherit".enum,
        "DirectionLTR".enum,
        "DirectionRTL".enum
    )

    EnumConstant(
        "YGDisplay",

        "DisplayFlex".enum,
        "DisplayNone".enum
    )

    val Edges = EnumConstant(
        "YGEdge",

        "EdgeLeft".enum,
        "EdgeTop".enum,
        "EdgeRight".enum,
        "EdgeBottom".enum,
        "EdgeStart".enum,
        "EdgeEnd".enum,
        "EdgeHorizontal".enum,
        "EdgeVertical".enum,
        "EdgeAll".enum
    ).javaDocLinks

    EnumConstant(
        "YGExperimentalFeature",

        "ExperimentalFeatureWebFlexBasis".enum
    )

    EnumConstant(
        "YGFlexDirection",

        "FlexDirectionColumn".enum,
        "FlexDirectionColumnReverse".enum,
        "FlexDirectionRow".enum,
        "FlexDirectionRowReverse".enum
    )

    EnumConstant(
        "YGJustify",

        "JustifyFlexStart".enum,
        "JustifyCenter".enum,
        "JustifyFlexEnd".enum,
        "JustifySpaceBetween".enum,
        "JustifySpaceAround".enum,
        "JustifySpaceEvenly".enum
    )

    EnumConstant(
        "YGLogLevel",

        "LogLevelError".enum,
        "LogLevelWarn".enum,
        "LogLevelInfo".enum,
        "LogLevelDebug".enum,
        "LogLevelVerbose".enum,
        "LogLevelFatal".enum
    )

    EnumConstant(
        "YGMeasureMode",

        "MeasureModeUndefined".enum,
        "MeasureModeExactly".enum,
        "MeasureModeAtMost".enum
    )

    EnumConstant(
        "YGNodeType",

        "NodeTypeDefault".enum,
        "NodeTypeText".enum
    )

    EnumConstant(
        "YGOverflow",

        "OverflowVisible".enum,
        "OverflowHidden".enum,
        "OverflowScroll".enum
    )

    EnumConstant(
        "YGPositionType",

        "PositionTypeStatic".enum,
        "PositionTypeRelative".enum,
        "PositionTypeAbsolute".enum
    )

    EnumConstant(
        "YGUnit",

        "UnitUndefined".enum,
        "UnitPoint".enum,
        "UnitPercent".enum,
        "UnitAuto".enum
    )

    EnumConstant(
        "YGWrap",

        "WrapNoWrap".enum,
        "WrapWrap".enum,
        "WrapReverse".enum
    )

    YGNodeRef("NodeNew", "", void())

    YGNodeRef(
        "NodeNewWithConfig",
        "",

        YGConfigRef("config", "")
    )

    YGNodeRef(
        "NodeClone",
        "",

        YGNodeRef("node", "")
    )

    val node = YGNodeRef("node", "")
    val constNode = YGNodeConstRef("node", "")

    void(
        "NodeFree",
        "",

        node
    )

    void(
        "NodeFreeRecursiveWithCleanupFunc",
        "",

        node,
        YGNodeCleanupFunc("cleanup", "")
    )

    void(
        "NodeFreeRecursive",
        "",

        node
    )

    void(
        "NodeReset",
        "",

        node
    )

    void(
        "NodeInsertChild",
        "",

        node,
        YGNodeRef("child", ""),
        uint32_t("index", "")
    )

    void(
        "NodeSwapChild",
        "",

        node,
        YGNodeRef("child", ""),
        uint32_t("index", "")
    )

    void(
        "NodeRemoveChild",
        "",

        node,
        YGNodeRef("child", "")
    )

    void(
        "NodeRemoveAllChildren",
        "",

        YGNodeRef("node", "")
    )

    YGNodeRef(
        "NodeGetChild",
        "",

        node,
        uint32_t("index", "")
    )

    YGNodeRef(
        "NodeGetOwner",
        "",

        node
    )

    YGNodeRef(
        "NodeGetParent",
        "",

        node
    )

    uint32_t(
        "NodeGetChildCount",
        "",

        node
    )

    void(
        "NodeSetChildren",
        "",

        YGNodeRef("owner", ""),
        YGNodeRef.const.p("children", ""),
        AutoSize("children")..uint32_t("count", "")
    )

    void(
        "NodeSetIsReferenceBaseline",
        "",

        YGNodeRef("node", ""),
        bool("isReferenceBaseline", "")
    )

    bool(
        "NodeIsReferenceBaseline",
        "",

        YGNodeRef("node", "")
    )

    void(
        "NodeCalculateLayout",
        "",

        node,
        float("availableWidth", ""),
        float("availableHeight", ""),
        YGDirection("ownerDirection", "", "Direction\\w+")
    )

    void(
        "NodeMarkDirty",
        """
        Marks a node as dirty.

        Only valid for nodes with a custom measure function set.

        Yoga knows when to mark all other nodes as dirty but because nodes with measure functions depend on information not known to Yoga they must perform
        this dirty marking manually.
        """,

        node
    )

    void(
        "NodeMarkDirtyAndPropogateToDescendants",
        """
        Marks the current node and all its descendants as dirty.

        Intended to be used for Yoga benchmarks. Don't use in production, as calling #NodeCalculateLayout() will cause the recalculation of each and every
        node.
        """,

        node
    )

    bool(
        "FloatIsUndefined",
        "",

        float("value", "")
    )

    bool(
        "NodeCanUseCachedMeasurement",
        "",

        YGMeasureMode("widthMode", "", "MeasureMode\\w+"),
        float("width", ""),
        YGMeasureMode("heightMode", ""),
        float("height", ""),
        YGMeasureMode("lastWidthMode", ""),
        float("lastWidth", ""),
        YGMeasureMode("lastHeightMode", ""),
        float("lastHeight", ""),
        float("lastComputedWidth", ""),
        float("lastComputedHeight", ""),
        float("marginRow", ""),
        float("marginColumn", ""),
        YGConfigRef("config", "")
    )

    void(
        "NodeCopyStyle",
        "",

        YGNodeRef("dstNode", ""),
        YGNodeRef("srcNode", "")
    )

    opaque_p(
        "NodeGetContext",
        "",

        node
    )
    void(
        "NodeSetContext",
        "",

        node,
        opaque_p("context", "")
    )

    void(
        "ConfigSetPrintTreeFlag",
        "",

        YGConfigRef("config", ""),
        bool("enabled", "")
    )

    bool(
        "NodeHasMeasureFunc",
        "",

        node
    )
    void(
        "NodeSetMeasureFunc",
        "",

        node,
        nullable..YGMeasureFunc("measureFunc", "")
    )

    bool(
        "NodeHasBaselineFunc",
        "",

        node
    )
    void(
        "NodeSetBaselineFunc",
        "",

        node,
        nullable..YGBaselineFunc("baselineFunc", "")
    )

    YGDirtiedFunc(
        "NodeGetDirtiedFunc",
        "",

        node
    )
    void(
        "NodeSetDirtiedFunc",
        "",

        node,
        nullable..YGDirtiedFunc("dirtiedFunc", "")
    )

    void(
        "NodeSetPrintFunc",
        "",

        node,
        nullable..YGPrintFunc("printFunc", "")
    )

    bool(
        "NodeGetHasNewLayout",
        "",

        node
    )
    void(
        "NodeSetHasNewLayout",
        "",

        node,
        bool("hasNewLayout", "")
    )

    YGNodeType(
        "NodeGetNodeType",
        "",

        node
    )
    void(
        "NodeSetNodeType",
        "",

        node,
        YGNodeType("nodeType", "")
    )

    bool(
        "NodeIsDirty",
        "",

        node
    )

    bool(
        "NodeLayoutGetDidUseLegacyFlag",
        "",

        node
    )

    void(
        "NodeStyleSetDirection",
        "",

        node,
        YGDirection("direction", "", "Direction\\w+")
    )
    YGDirection(
        "NodeStyleGetDirection",
        "",

        constNode
    )

    void(
        "NodeStyleSetFlexDirection",
        "",

        node,
        YGFlexDirection("flexDirection", "", "FlexDirection\\w+")
    )
    YGFlexDirection(
        "NodeStyleGetFlexDirection",
        "",

        constNode
    )

    void(
        "NodeStyleSetJustifyContent",
        "",

        node,
        YGJustify("justifyContent", "", "Justify\\w+")
    )
    YGJustify(
        "NodeStyleGetJustifyContent",
        "",

        constNode
    )

    void(
        "NodeStyleSetAlignContent",
        "",

        node,
        YGAlign("alignContent", "", "Align\\w+")
    )
    YGAlign(
        "NodeStyleGetAlignContent",
        "",

        constNode
    )

    void(
        "NodeStyleSetAlignItems",
        "",

        node,
        YGAlign("alignItems", "", "Align\\w+")
    )
    YGAlign(
        "NodeStyleGetAlignItems",
        "",

        constNode
    )

    void(
        "NodeStyleSetAlignSelf",
        "",

        node,
        YGAlign("alignSelf", "", "Align\\w+")
    )
    YGAlign(
        "NodeStyleGetAlignSelf",
        "",

        constNode
    )

    void(
        "NodeStyleSetPositionType",
        "",

        node,
        YGPositionType("positionType", "", "PositionType\\w+")
    )
    YGPositionType(
        "NodeStyleGetPositionType",
        "",

        constNode
    )

    void(
        "NodeStyleSetFlexWrap",
        "",

        node,
        YGWrap("flexWrap", "", "Wrap\\w+")
    )
    YGWrap(
        "NodeStyleGetFlexWrap",
        "",

        constNode
    )

    void(
        "NodeStyleSetOverflow",
        "",

        node,
        YGOverflow("overflow", "", "Overflow\\w+")
    )
    YGOverflow(
        "NodeStyleGetOverflow",
        "",

        constNode
    )

    void(
        "NodeStyleSetDisplay",
        "",

        node,
        YGDisplay("display", "", "Display\\w+")
    )
    YGDisplay(
        "NodeStyleGetDisplay",
        "",

        constNode
    )

    void(
        "NodeStyleSetFlex",
        "",

        node,
        float("flex", "")
    )
    float(
        "NodeStyleGetFlex",
        "",

        constNode
    )

    void(
        "NodeStyleSetFlexGrow",
        "",

        node,
        float("flexGrow", "")
    )
    float(
        "NodeStyleGetFlexGrow",
        "",

        constNode
    )

    void(
        "NodeStyleSetFlexShrink",
        "",

        node,
        float("flexShrink", "")
    )
    float(
        "NodeStyleGetFlexShrink",
        "",

        constNode
    )

    void(
        "NodeStyleSetFlexBasis",
        "",

        node,
        float("flexBasis", "")
    )
    void(
        "NodeStyleSetFlexBasisPercent",
        "",

        node,
        float("flexBasis", "")
    )
    void(
        "NodeStyleSetFlexBasisAuto",
        "",

        node
    )
    YGValue(
        "NodeStyleGetFlexBasis",
        "",

        constNode
    )

    void(
        "NodeStyleSetPosition",
        "",

        node,
        YGEdge("edge", "", Edges),
        float("position", "")
    )
    void(
        "NodeStyleSetPositionPercent",
        "",

        node,
        YGEdge("edge", "", Edges),
        float("position", "")
    )
    YGValue(
        "NodeStyleGetPosition",
        "",

        constNode,
        YGEdge("edge", "", Edges)
    )

    void(
        "NodeStyleSetMargin",
        "",

        node,
        YGEdge("edge", "", Edges),
        float("margin", "")
    )
    void(
        "NodeStyleSetMarginPercent",
        "",

        node,
        YGEdge("edge", "", Edges),
        float("margin", "")
    )
    void(
        "NodeStyleSetMarginAuto",
        "",

        node,
        YGEdge("edge", "", Edges)
    )
    YGValue(
        "NodeStyleGetMargin",
        "",

        constNode,
        YGEdge("edge", "", Edges)
    )

    void(
        "NodeStyleSetPadding",
        "",

        node,
        YGEdge("edge", "", Edges),
        float("padding", "")
    )
    void(
        "NodeStyleSetPaddingPercent",
        "",

        node,
        YGEdge("edge", "", Edges),
        float("padding", "")
    )
    YGValue(
        "NodeStyleGetPadding",
        "",

        constNode,
        YGEdge("edge", "", Edges)
    )

    void(
        "NodeStyleSetBorder",
        "",

        node,
        YGEdge("edge", "", Edges),
        float("border", "")
    )
    float(
        "NodeStyleGetBorder",
        "",

        constNode,
        YGEdge("edge", "", Edges)
    )

    void(
        "NodeStyleSetWidth",
        "",

        node,
        float("width", "")
    )
    void(
        "NodeStyleSetWidthPercent",
        "",

        node,
        float("width", "")
    )
    void(
        "NodeStyleSetWidthAuto",
        "",

        node
    )
    YGValue(
        "NodeStyleGetWidth",
        "",

        constNode
    )

    void(
        "NodeStyleSetHeight",
        "",

        node,
        float("height", "")
    )
    void(
        "NodeStyleSetHeightPercent",
        "",

        node,
        float("height", "")
    )
    void(
        "NodeStyleSetHeightAuto",
        "",

        node
    )
    YGValue(
        "NodeStyleGetHeight",
        "",

        constNode
    )

    void(
        "NodeStyleSetMinWidth",
        "",

        node,
        float("minWidth", "")
    )
    void(
        "NodeStyleSetMinWidthPercent",
        "",

        node,
        float("minWidth", "")
    )
    YGValue(
        "NodeStyleGetMinWidth",
        "",

        constNode
    )

    void(
        "NodeStyleSetMinHeight",
        "",

        node,
        float("minHeight", "")
    )
    void(
        "NodeStyleSetMinHeightPercent",
        "",

        node,
        float("minHeight", "")
    )
    YGValue(
        "NodeStyleGetMinHeight",
        "",

        constNode
    )

    void(
        "NodeStyleSetMaxWidth",
        "",

        node,
        float("maxWidth", "")
    )
    void(
        "NodeStyleSetMaxWidthPercent",
        "",

        node,
        float("maxWidth", "")
    )
    YGValue(
        "NodeStyleGetMaxWidth",
        "",

        constNode
    )

    void(
        "NodeStyleSetMaxHeight",
        "",

        node,
        float("maxHeight", "")
    )
    void(
        "NodeStyleSetMaxHeightPercent",
        "",

        node,
        float("maxHeight", "")
    )
    YGValue(
        "NodeStyleGetMaxHeight",
        "",

        constNode
    )

    void(
        "NodeStyleSetAspectRatio",
        """
        Aspect ratio controls the size of the undefined dimension of a node.

        Aspect ratio is encoded as a floating point value width/height. e.g. A value of 2 leads to a node with a width twice the size of its height while a
        value of 0.5 gives the opposite effect.
        ${ul(
            "On a node with a set width/height aspect ratio controls the size of the unset dimension",
            "On a node with a set flex basis aspect ratio controls the size of the node in the cross axis if unset",
            "On a node with a measure function aspect ratio works as though the measure function measures the flex basis",
            "On a node with flex grow/shrink aspect ratio controls the size of the node in the cross axis if unset",
            "Aspect ratio takes min/max dimensions into account"
        )}
        """,

        node,
        float("aspectRatio", "")
    )
    float(
        "NodeStyleGetAspectRatio",
        "",

        constNode
    )

    float(
        "NodeLayoutGetLeft",
        "",

        node
    )
    float(
        "NodeLayoutGetTop",
        "",

        node
    )
    float(
        "NodeLayoutGetRight",
        "",

        node
    )
    float(
        "NodeLayoutGetBottom",
        "",

        node
    )
    float(
        "NodeLayoutGetWidth",
        "",

        node
    )
    float(
        "NodeLayoutGetHeight",
        "",

        node
    )
    YGDirection(
        "NodeLayoutGetDirection",
        "",

        node
    )
    bool(
        "NodeLayoutGetHadOverflow",
        "",

        node
    )
    bool(
        "NodeLayoutGetDidLegacyStretchFlagAffectLayout",
        "",

        node
    )

    float(
        "NodeLayoutGetMargin",
        """
        Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
        {@code YGNodeStyleGetMargin}. However if they were set using a percentage value then the returned value is the computed value used during layout.
        """,

        node,
        YGEdge("edge", "", Edges)
    )
    float(
        "NodeLayoutGetBorder",
        """
        Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
        {@code YGNodeStyleGetBorder}. However if they were set using a percentage value then the returned value is the computed value used during layout.
        """,

        node,
        YGEdge("edge", "", Edges)
    )
    float(
        "NodeLayoutGetPadding",
        """
        Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
        {@code YGNodeStyleGetPadding}. However if they were set using a percentage value then the returned value is the computed value used during layout.
        """,

        node,
        YGEdge("edge", "", Edges)
    )

    void(
        "ConfigSetLogger",
        "",

        YGConfigRef("config", ""),
        nullable..YGLogger("logger", "")
    )

    void(
        "Assert",
        "",

        bool("condition", ""),
        charUTF8.const.p("message", "")
    )

    void(
        "AssertWithNode",
        "",

        YGNodeRef("node", ""),
        bool("condition", ""),
        charUTF8.const.p("message", "")
    )

    void(
        "AssertWithConfig",
        "",

        YGConfigRef("config", ""),
        bool("condition", ""),
        charUTF8.const.p("message", "")
    )

    void(
        "ConfigSetPointScaleFactor",
        "Set this to number of pixels in 1 point to round calculation results. If you want to avoid rounding set {@code PointScaleFactor} to 0.",

        YGConfigRef("config", ""),
        float("pixelsInPoint", "")
    )

    void(
        "ConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour",
        "",

        YGConfigRef("config", ""),
        bool("shouldDiffLayout", "")
    )

    void(
        "ConfigSetUseLegacyStretchBehaviour",
        """
        Yoga previously had an error where containers would take the maximum space possible instead of the minimum like they are supposed to. In practice this
        resulted in implicit behaviour similar to align-self: stretch; Because this was such a long-standing bug we must allow legacy users to switch back to
        this behaviour.
        """,

        YGConfigRef("config", ""),
        bool("useLegacyStretchBehaviour", "")
    )

    YGConfigRef("ConfigNew", "", void())

    void("ConfigFree",
        "",
        YGConfigRef("config", "")
    )

    void(
        "ConfigCopy",
        "",

        YGConfigRef("dest", ""),
        YGConfigRef("src", "")
    )

    int32_t("ConfigGetInstanceCount", "", void())

    void(
        "ConfigSetExperimentalFeatureEnabled",
        "",

        YGConfigRef("config", ""),
        YGExperimentalFeature("feature", "", "ExperimentalFeature\\w+"),
        bool("enabled", "")
    )
    bool(
        "ConfigIsExperimentalFeatureEnabled",
        "",

        YGConfigRef("config", ""),
        YGExperimentalFeature("feature", "", "ExperimentalFeature\\w+")
    )

    void(
        "ConfigSetUseWebDefaults",
        "Using the web defaults is the preferred configuration for new projects. Usage of non web defaults should be considered as legacy.",

        YGConfigRef("config", ""),
        bool("enabled", "")
    )
    bool(
        "ConfigGetUseWebDefaults",
        "",

        YGConfigRef("config", "")
    )

    void(
        "ConfigSetCloneNodeFunc",
        "",

        YGConfigRef("config", ""),
        nullable..YGCloneNodeFunc("callback", "") // const function pointer in Yoga sources
    )

    YGConfigRef("ConfigGetDefault", "", void())

    void(
        "ConfigSetContext",
        "",

        YGConfigRef("config", ""),
        opaque_p("context", "")
    )
    opaque_p(
        "ConfigGetContext",
        "",

        YGConfigRef("config", "")
    )

    float(
        "RoundValueToPixelGrid",
        "",

        double("value", ""),
        double("pointScaleFactor", ""),
        bool("forceCeil", ""),
        bool("forceFloor", "")
    )

    // Enums

    fun YG_TYPE_TO_STRING(type: IntegerType) {
        val name = type.name.substring(2)
        Nonnull..charASCII.const.p(
            "${name}ToString",
            "",

            type("value", "", "$name\\w+")
        )
    }

    YG_TYPE_TO_STRING(YGAlign)
    YG_TYPE_TO_STRING(YGDimension)
    YG_TYPE_TO_STRING(YGDirection)
    YG_TYPE_TO_STRING(YGDisplay)
    YG_TYPE_TO_STRING(YGEdge)
    YG_TYPE_TO_STRING(YGExperimentalFeature)
    YG_TYPE_TO_STRING(YGFlexDirection)
    YG_TYPE_TO_STRING(YGJustify)
    YG_TYPE_TO_STRING(YGLogLevel)
    YG_TYPE_TO_STRING(YGMeasureMode)
    YG_TYPE_TO_STRING(YGNodeType)
    YG_TYPE_TO_STRING(YGOverflow)
    YG_TYPE_TO_STRING(YGPositionType)
    YG_TYPE_TO_STRING(YGUnit)
    YG_TYPE_TO_STRING(YGWrap)

    // Pre-defined YGValue structs

    macro..YGValue("ValueAuto", "", void())
    macro..YGValue("ValueUndefined", "", void())
    macro..YGValue("ValueZero", "", void())
}