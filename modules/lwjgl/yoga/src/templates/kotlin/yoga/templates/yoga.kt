/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package yoga.templates

import org.lwjgl.generator.*
import yoga.*

val yoga = "Yoga".nativeClass(Module.YOGA, prefix = "YG", prefixConstant = "YG", prefixMethod = "YG", library = "lwjgl_yoga") {
    nativeDirective("""#define FB_ASSERTIONS_ENABLED 0
#define YG_ASSERT(X, message)
DISABLE_WARNINGS()
#include "Yoga.h"
ENABLE_WARNINGS()""")

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

        "Undefined".."10e20f"
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

        "PositionTypeRelative".enum,
        "PositionTypeAbsolute".enum
    )

    EnumConstant(
        "YGPrintOptions",

        "PrintOptionsLayout".enum("", "1"),
        "PrintOptionsStyle".enum("", "2"),
        "PrintOptionsChildren".enum("", "4")
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

    YGNodeRef(
        "NodeNew",
        ""
    )

    YGNodeRef(
        "NodeNewWithConfig",
        "",

        YGConfigRef.const.IN("config", "")
    )

    YGNodeRef(
        "NodeClone",
        "",

        YGNodeRef.const.IN("node", "")
    )

    val node = YGNodeRef.const.IN("node", "")

    void(
        "NodeFree",
        "",

        node
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

    int32_t(
        "NodeGetInstanceCount",
        ""
    )

    void(
        "NodeInsertChild",
        "",

        node,
        YGNodeRef.const.IN("child", ""),
        uint32_t.IN("index", "")
    )

    void(
        "NodeInsertSharedChild",
        """
        This function inserts the child {@code YGNodeRef} as a children of the node received by parameter and set the Owner of the child object to null. This
        function is expected to be called when using Yoga in persistent mode in order to share a {@code YGNodeRef} object as a child of two different Yoga
        trees. The child {@code YGNodeRef} is expected to be referenced from its original owner and from a clone of its original owner.
        """,

        node,
        YGNodeRef.const.IN("child", ""),
        uint32_t.IN("index", "")
    )

    void(
        "NodeRemoveChild",
        "",

        node,
        YGNodeRef.const.IN("child", "")
    )

    void(
        "NodeRemoveAllChildren",
        "",

        YGNodeRef.const.IN("node", "")
    )

    YGNodeRef(
        "NodeGetChild",
        "",

        node,
        uint32_t.IN("index", "")
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

        YGNodeRef.const.IN("owner", ""),
        YGNodeRef.const.p.IN("children", ""),
        AutoSize("children")..uint32_t.IN("count", "")
    )

    void(
        "NodeCalculateLayout",
        "",

        node,
        float.IN("availableWidth", ""),
        float.IN("availableHeight", ""),
        YGDirection.IN("ownerDirection", "", "Direction\\w+")
    )

    void(
        "NodeMarkDirty",
        """
        Marks a node as dirty.

        Only valid for nodes with a custom measure function set. YG knows when to mark all other nodes as dirty but because nodes with measure functions
        depends on information not known to YG they must perform this dirty marking manually.
        """,

        node
    )

    void(
        "NodeMarkDirtyAndPropogateToDescendants",
        """
        Marks the current node and all its descendants as dirty.

        This function is added to test yoga benchmarks. It is not expected to be used in production as calling #NodeCalculateLayout() will cause the
        recalculation of each and every node.
        """,

        node
    )

    void(
        "NodePrint",
        "",

        node,
        YGPrintOptions.IN("options", "", "PrintOptions\\w+")
    )

    bool(
        "FloatIsUndefined",
        "",

        float.IN("value", "")
    )

    bool(
        "NodeCanUseCachedMeasurement",
        "",

        YGMeasureMode.IN("widthMode", "", "MeasureMode\\w+"),
        float.IN("width", ""),
        YGMeasureMode.IN("heightMode", ""),
        float.IN("height", ""),
        YGMeasureMode.IN("lastWidthMode", ""),
        float.IN("lastWidth", ""),
        YGMeasureMode.IN("lastHeightMode", ""),
        float.IN("lastHeight", ""),
        float.IN("lastComputedWidth", ""),
        float.IN("lastComputedHeight", ""),
        float.IN("marginRow", ""),
        float.IN("marginColumn", ""),
        YGConfigRef.const.IN("config", "")
    )

    void(
        "NodeCopyStyle",
        "",

        YGNodeRef.const.IN("dstNode", ""),
        YGNodeRef.const.IN("srcNode", "")
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
        opaque_p.IN("context", "")
    )

    YGMeasureFunc(
        "NodeGetMeasureFunc",
        "",

        node
    )
    void(
        "NodeSetMeasureFunc",
        "",

        node,
        nullable..YGMeasureFunc.IN("measureFunc", "")
    )

    YGBaselineFunc(
        "NodeGetBaselineFunc",
        "",

        node
    )
    void(
        "NodeSetBaselineFunc",
        "",

        node,
        nullable..YGBaselineFunc.IN("baselineFunc", "")
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
        nullable..YGDirtiedFunc.IN("dirtiedFunc", "")
    )

    YGPrintFunc(
        "NodeGetPrintFunc",
        "",

        node
    )
    void(
        "NodeSetPrintFunc",
        "",

        node,
        nullable..YGPrintFunc.IN("printFunc", "")
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
        bool.IN("hasNewLayout", "")
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
        YGNodeType.IN("nodeType", "")
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
        YGDirection.IN("direction", "", "Direction\\w+")
    )
    YGDirection(
        "NodeStyleGetDirection",
        "",

        node
    )

    void(
        "NodeStyleSetFlexDirection",
        "",

        node,
        YGFlexDirection.IN("flexDirection", "", "FlexDirection\\w+")
    )
    YGFlexDirection(
        "NodeStyleGetFlexDirection",
        "",

        node
    )

    void(
        "NodeStyleSetJustifyContent",
        "",

        node,
        YGJustify.IN("justifyContent", "", "Justify\\w+")
    )
    YGJustify(
        "NodeStyleGetJustifyContent",
        "",

        node
    )

    void(
        "NodeStyleSetAlignContent",
        "",

        node,
        YGAlign.IN("alignContent", "", "Align\\w+")
    )
    YGAlign(
        "NodeStyleGetAlignContent",
        "",

        node
    )

    void(
        "NodeStyleSetAlignItems",
        "",

        node,
        YGAlign.IN("alignItems", "", "Align\\w+")
    )
    YGAlign(
        "NodeStyleGetAlignItems",
        "",

        node
    )

    void(
        "NodeStyleSetAlignSelf",
        "",

        node,
        YGAlign.IN("alignSelf", "", "Align\\w+")
    )
    YGAlign(
        "NodeStyleGetAlignSelf",
        "",

        node
    )

    void(
        "NodeStyleSetPositionType",
        "",

        node,
        YGPositionType.IN("positionType", "", "PositionType\\w+")
    )
    YGPositionType(
        "NodeStyleGetPositionType",
        "",

        node
    )

    void(
        "NodeStyleSetFlexWrap",
        "",

        node,
        YGWrap.IN("flexWrap", "", "Wrap\\w+")
    )
    YGWrap(
        "NodeStyleGetFlexWrap",
        "",

        node
    )

    void(
        "NodeStyleSetOverflow",
        "",

        node,
        YGOverflow.IN("overflow", "", "Overflow\\w+")
    )
    YGOverflow(
        "NodeStyleGetOverflow",
        "",

        node
    )

    void(
        "NodeStyleSetDisplay",
        "",

        node,
        YGDisplay.IN("display", "", "Display\\w+")
    )
    YGDisplay(
        "NodeStyleGetDisplay",
        "",

        node
    )

    void(
        "NodeStyleSetFlex",
        "",

        node,
        float.IN("flex", "")
    )
    float(
        "NodeStyleGetFlex",
        "",

        node
    )

    void(
        "NodeStyleSetFlexGrow",
        "",

        node,
        float.IN("flexGrow", "")
    )
    float(
        "NodeStyleGetFlexGrow",
        "",

        node
    )

    void(
        "NodeStyleSetFlexShrink",
        "",

        node,
        float.IN("flexShrink", "")
    )
    float(
        "NodeStyleGetFlexShrink",
        "",

        node
    )

    void(
        "NodeStyleSetFlexBasis",
        "",

        node,
        float.IN("flexBasis", "")
    )
    void(
        "NodeStyleSetFlexBasisPercent",
        "",

        node,
        float.IN("flexBasis", "")
    )
    void(
        "NodeStyleSetFlexBasisAuto",
        "",

        node
    )
    YGValue(
        "NodeStyleGetFlexBasis",
        "",

        node
    )

    void(
        "NodeStyleSetPosition",
        "",

        node,
        YGEdge.IN("edge", "", Edges),
        float.IN("position", "")
    )
    void(
        "NodeStyleSetPositionPercent",
        "",

        node,
        YGEdge.IN("edge", "", Edges),
        float.IN("position", "")
    )
    YGValue(
        "NodeStyleGetPosition",
        "",

        node,
        YGEdge.IN("edge", "", Edges)
    )

    void(
        "NodeStyleSetMargin",
        "",

        node,
        YGEdge.IN("edge", "", Edges),
        float.IN("margin", "")
    )
    void(
        "NodeStyleSetMarginPercent",
        "",

        node,
        YGEdge.IN("edge", "", Edges),
        float.IN("margin", "")
    )
    void(
        "NodeStyleSetMarginAuto",
        "",

        node,
        YGEdge.IN("edge", "", Edges)
    )
    YGValue(
        "NodeStyleGetMargin",
        "",

        node,
        YGEdge.IN("edge", "", Edges)
    )

    void(
        "NodeStyleSetPadding",
        "",

        node,
        YGEdge.IN("edge", "", Edges),
        float.IN("padding", "")
    )
    void(
        "NodeStyleSetPaddingPercent",
        "",

        node,
        YGEdge.IN("edge", "", Edges),
        float.IN("padding", "")
    )
    YGValue(
        "NodeStyleGetPadding",
        "",

        node,
        YGEdge.IN("edge", "", Edges)
    )

    void(
        "NodeStyleSetBorder",
        "",

        node,
        YGEdge.IN("edge", "", Edges),
        float.IN("border", "")
    )
    float(
        "NodeStyleGetBorder",
        "",

        node,
        YGEdge.IN("edge", "", Edges)
    )

    void(
        "NodeStyleSetWidth",
        "",

        node,
        float.IN("width", "")
    )
    void(
        "NodeStyleSetWidthPercent",
        "",

        node,
        float.IN("width", "")
    )
    void(
        "NodeStyleSetWidthAuto",
        "",

        node
    )
    YGValue(
        "NodeStyleGetWidth",
        "",

        node
    )

    void(
        "NodeStyleSetHeight",
        "",

        node,
        float.IN("height", "")
    )
    void(
        "NodeStyleSetHeightPercent",
        "",

        node,
        float.IN("height", "")
    )
    void(
        "NodeStyleSetHeightAuto",
        "",

        node
    )
    YGValue(
        "NodeStyleGetHeight",
        "",

        node
    )

    void(
        "NodeStyleSetMinWidth",
        "",

        node,
        float.IN("minWidth", "")
    )
    void(
        "NodeStyleSetMinWidthPercent",
        "",

        node,
        float.IN("minWidth", "")
    )
    YGValue(
        "NodeStyleGetMinWidth",
        "",

        node
    )

    void(
        "NodeStyleSetMinHeight",
        "",

        node,
        float.IN("minHeight", "")
    )
    void(
        "NodeStyleSetMinHeightPercent",
        "",

        node,
        float.IN("minHeight", "")
    )
    YGValue(
        "NodeStyleGetMinHeight",
        "",

        node
    )

    void(
        "NodeStyleSetMaxWidth",
        "",

        node,
        float.IN("maxWidth", "")
    )
    void(
        "NodeStyleSetMaxWidthPercent",
        "",

        node,
        float.IN("maxWidth", "")
    )
    YGValue(
        "NodeStyleGetMaxWidth",
        "",

        node
    )

    void(
        "NodeStyleSetMaxHeight",
        "",

        node,
        float.IN("maxHeight", "")
    )
    void(
        "NodeStyleSetMaxHeightPercent",
        "",

        node,
        float.IN("maxHeight", "")
    )
    YGValue(
        "NodeStyleGetMaxHeight",
        "",

        node
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
        float.IN("aspectRatio", "")
    )
    float(
        "NodeStyleGetAspectRatio",
        "",

        node
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
        YGEdge.IN("edge", "", Edges)
    )
    float(
        "NodeLayoutGetBorder",
        """
        Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
        {@code YGNodeStyleGetBorder}. However if they were set using a percentage value then the returned value is the computed value used during layout.
        """,

        node,
        YGEdge.IN("edge", "", Edges)
    )
    float(
        "NodeLayoutGetPadding",
        """
        Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
        {@code YGNodeStyleGetPadding}. However if they were set using a percentage value then the returned value is the computed value used during layout.
        """,

        node,
        YGEdge.IN("edge", "", Edges)
    )

    void(
        "ConfigSetLogger",
        "",

        YGConfigRef.const.IN("config", ""),
        nullable..YGLogger.IN("logger", "")
    )

    void(
        "Log",
        "",

        YGNodeRef.const.IN("node", ""),
        YGLogLevel.IN("level", "", "LogLevel\\w+"),
        charUTF8.const.p.IN("message", "")
    )

    void(
        "LogWithConfig",
        "",

        YGConfigRef.const.IN("config", ""),
        YGLogLevel.IN("level", ""),
        charUTF8.const.p.IN("message", "")
    )

    void(
        "Assert",
        "",

        bool.IN("condition", ""),
        charUTF8.const.p.IN("message", "")
    )

    void(
        "AssertWithNode",
        "",

        YGNodeRef.const.IN("node", ""),
        bool.IN("condition", ""),
        charUTF8.const.p.IN("message", "")
    )

    void(
        "AssertWithConfig",
        "",

        YGConfigRef.const.IN("config", ""),
        bool.IN("condition", ""),
        charUTF8.const.p.IN("message", "")
    )

    void(
        "ConfigSetPointScaleFactor",
        "Set this to number of pixels in 1 point to round calculation results. If you want to avoid rounding set {@code PointScaleFactor} to 0.",

        YGConfigRef.const.IN("config", ""),
        float.IN("pixelsInPoint", "")
    )

    void(
        "ConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour",
        "",

        YGConfigRef.const.IN("config", ""),
        bool.IN("shouldDiffLayout", "")
    )

    void(
        "ConfigSetUseLegacyStretchBehaviour",
        """
        Yoga previously had an error where containers would take the maximum space possible instead of the minimum like they are supposed to. In practice this
        resulted in implicit behaviour similar to align-self: stretch; Because this was such a long-standing bug we must allow legacy users to switch back to
        this behaviour.
        """,

        YGConfigRef.const.IN("config", ""),
        bool.IN("useLegacyStretchBehaviour", "")
    )

    YGConfigRef(
        "ConfigNew",
        ""
    )

    void("ConfigFree",
        "",
        YGConfigRef.const.IN("config", "")
    )

    void(
        "ConfigCopy",
        "",

        YGConfigRef.const.IN("dest", ""),
        YGConfigRef.const.IN("src", "")
    )

    int32_t(
        "ConfigGetInstanceCount",
        ""
    )

    void(
        "ConfigSetExperimentalFeatureEnabled",
        "",

        YGConfigRef.const.IN("config", ""),
        YGExperimentalFeature.IN("feature", "", "ExperimentalFeature\\w+"),
        bool.IN("enabled", "")
    )
    bool(
        "ConfigIsExperimentalFeatureEnabled",
        "",

        YGConfigRef.const.IN("config", ""),
        YGExperimentalFeature.IN("feature", "", "ExperimentalFeature\\w+")
    )

    void(
        "ConfigSetUseWebDefaults",
        "Using the web defaults is the prefered configuration for new projects. Usage of non web defaults should be considered as legacy.",

        YGConfigRef.const.IN("config", ""),
        bool.IN("enabled", "")
    )
    bool(
        "ConfigGetUseWebDefaults",
        "",

        YGConfigRef.const.IN("config", "")
    )

    void(
        "ConfigSetCloneNodeFunc",
        "",

        YGConfigRef.const.IN("config", ""),
        nullable..YGCloneNodeFunc.IN("callback", "") // const function pointer in Yoga sources
    )

    YGConfigRef(
        "ConfigGetDefault",
        ""
    )

    void(
        "ConfigSetContext",
        "",

        YGConfigRef.const.IN("config", ""),
        opaque_p.IN("context", "")
    )
    opaque_p(
        "ConfigGetContext",
        "",

        YGConfigRef.const.IN("config", "")
    )

    float(
        "RoundValueToPixelGrid",
        "",

        float.IN("value", ""),
        float.IN("pointScaleFactor", ""),
        bool.IN("forceCeil", ""),
        bool.IN("forceFloor", "")
    )

    // Enums

    fun YG_TYPE_TO_STRING(type: IntegerType) {
        val name = type.name.substring(2)
        Nonnull..charASCII.const.p(
            "${name}ToString",
            "",

            type.IN("value", "", "$name\\w+")
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
    YG_TYPE_TO_STRING(YGPrintOptions)
    YG_TYPE_TO_STRING(YGUnit)
    YG_TYPE_TO_STRING(YGWrap)
}