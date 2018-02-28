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
        "NodeCalculateLayout",
        "",

        node,
        float.IN("availableWidth", ""),
        float.IN("availableHeight", ""),
        YGDirection.IN("parentDirection", "", "Direction\\w+")
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

    fun YG_NODE_PROPERTY(type: DataType, name: String, paramName: String) {
        void(
            "NodeSet$name",
            "",

            node,
            type.IN(paramName, "")
        )

        type(
            "NodeGet$name",
            "",

            node
        )
    }

    fun YG_NODE_STYLE_PROPERTY(type: DataType, name: String, paramName: String, documentation: String = "") {
        void(
            "NodeStyleSet$name",
            documentation,

            node,
            type.IN(paramName, "", if (type.name.startsWith("YG")) "${type.name.substring(2)}\\w+" else "")
        )

        type(
            "NodeStyleGet$name",
            documentation,

            node
        )
    }

    fun YG_NODE_STYLE_PROPERTY_UNIT(type: DataType, name: String, paramName: String, documentation: String = "") {
        void(
            "NodeStyleSet$name",
            documentation,

            node,
            float.IN(paramName, "")
        )

        void(
            "NodeStyleSet${name}Percent",
            documentation,

            node,
            float.IN(paramName, "")
        )

        type(
            "NodeStyleGet$name",
            documentation,

            node
        )
    }

    fun YG_NODE_STYLE_PROPERTY_UNIT_AUTO(type: DataType, name: String, paramName: String, documentation: String = "") {
        YG_NODE_STYLE_PROPERTY_UNIT(type, name, paramName, documentation)
        void(
            "NodeStyleSet${name}Auto",
            documentation,

            node
        )
    }

    fun YG_NODE_STYLE_EDGE_PROPERTY(type: DataType, name: String, paramName: String) {
        void(
            "NodeStyleSet$name",
            "",

            node,
            YGEdge.IN("edge", "", Edges),
            type.IN(paramName, "")
        )

        type(
            "NodeStyleGet$name",
            "",

            node,
            YGEdge.IN("edge", "", Edges)
        )
    }

    fun YG_NODE_STYLE_EDGE_PROPERTY_UNIT(type: DataType, name: String, paramName: String) {
        void(
            "NodeStyleSet$name",
            "",

            node,
            YGEdge.IN("edge", "", Edges),
            float.IN(paramName, "")
        )

        void(
            "NodeStyleSet${name}Percent",
            "",

            node,
            YGEdge.IN("edge", "", Edges),
            float.IN(paramName, "")
        )

        type(
            "NodeStyleGet$name",
            "",

            node,
            YGEdge.IN("edge", "", Edges)
        )
    }

    fun YG_NODE_STYLE_EDGE_PROPERTY_UNIT_AUTO(/*type: NativeType, */name: String) {
        void(
            "NodeStyleSet${name}Auto",
            "",

            node,
            YGEdge.IN("edge", "", Edges)
        )
    }

    fun YG_NODE_LAYOUT_PROPERTY(type: DataType, name: String) {
        type(
            "NodeLayoutGet$name",
            "",

            node
        )
    }

    fun YG_NODE_LAYOUT_EDGE_PROPERTY(type: DataType, name: String) {
        type(
            "NodeLayoutGet$name",
            """
            Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
            {@code YGNodeStyleGetXXX}. However if they were set using a percentage value then the returned value is the computed value used during layout.
            """,

            node,
            YGEdge.IN("edge", "", Edges)
        )
    }

    YG_NODE_PROPERTY(opaque_p, "Context", "context")
    YG_NODE_PROPERTY(YGMeasureFunc, "MeasureFunc", "measureFunc")
    YG_NODE_PROPERTY(YGBaselineFunc, "BaselineFunc", "baselineFunc")
    YG_NODE_PROPERTY(YGDirtiedFunc, "DirtiedFunc", "dirtiedFunc")
    YG_NODE_PROPERTY(YGPrintFunc, "PrintFunc", "printFunc")
    YG_NODE_PROPERTY(bool, "HasNewLayout", "hasNewLayout")
    YG_NODE_PROPERTY(YGNodeType, "NodeType", "nodeType")

    YG_NODE_STYLE_PROPERTY(YGDirection, "Direction", "direction")
    YG_NODE_STYLE_PROPERTY(YGFlexDirection, "FlexDirection", "flexDirection")
    YG_NODE_STYLE_PROPERTY(YGJustify, "JustifyContent", "justifyContent")
    YG_NODE_STYLE_PROPERTY(YGAlign, "AlignContent", "alignContent")
    YG_NODE_STYLE_PROPERTY(YGAlign, "AlignItems", "alignItems")
    YG_NODE_STYLE_PROPERTY(YGAlign, "AlignSelf", "alignSelf")
    YG_NODE_STYLE_PROPERTY(YGPositionType, "PositionType", "positionType")
    YG_NODE_STYLE_PROPERTY(YGWrap, "FlexWrap", "flexWrap")
    YG_NODE_STYLE_PROPERTY(YGOverflow, "Overflow", "overflow")
    YG_NODE_STYLE_PROPERTY(YGDisplay, "Display", "display")

    YG_NODE_STYLE_PROPERTY(float, "Flex", "flex")
    YG_NODE_STYLE_PROPERTY(float, "FlexGrow", "flexGrow")
    YG_NODE_STYLE_PROPERTY(float, "FlexShrink", "flexShrink")
    YG_NODE_STYLE_PROPERTY_UNIT_AUTO(YGValue, "FlexBasis", "flexBasis")

    YG_NODE_STYLE_EDGE_PROPERTY_UNIT(YGValue, "Position", "position")
    YG_NODE_STYLE_EDGE_PROPERTY_UNIT(YGValue, "Margin", "margin")
    YG_NODE_STYLE_EDGE_PROPERTY_UNIT_AUTO(/*YGValue, */"Margin")
    YG_NODE_STYLE_EDGE_PROPERTY_UNIT(YGValue, "Padding", "padding")
    YG_NODE_STYLE_EDGE_PROPERTY(float, "Border", "border")

    YG_NODE_STYLE_PROPERTY_UNIT_AUTO(YGValue, "Width", "width")
    YG_NODE_STYLE_PROPERTY_UNIT_AUTO(YGValue, "Height", "height")
    YG_NODE_STYLE_PROPERTY_UNIT(YGValue, "MinWidth", "minWidth")
    YG_NODE_STYLE_PROPERTY_UNIT(YGValue, "MinHeight", "minHeight")
    YG_NODE_STYLE_PROPERTY_UNIT(YGValue, "MaxWidth", "maxWidth")
    YG_NODE_STYLE_PROPERTY_UNIT(YGValue, "MaxHeight", "maxHeight")

    YG_NODE_STYLE_PROPERTY(
        float, "AspectRatio", "aspectRatio",
        documentation =
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
        """
    )

    YG_NODE_LAYOUT_PROPERTY(float, "Left")
    YG_NODE_LAYOUT_PROPERTY(float, "Top")
    YG_NODE_LAYOUT_PROPERTY(float, "Right")
    YG_NODE_LAYOUT_PROPERTY(float, "Bottom")
    YG_NODE_LAYOUT_PROPERTY(float, "Width")
    YG_NODE_LAYOUT_PROPERTY(float, "Height")
    YG_NODE_LAYOUT_PROPERTY(YGDirection, "Direction")
    YG_NODE_LAYOUT_PROPERTY(bool, "HadOverflow")

    YG_NODE_LAYOUT_EDGE_PROPERTY(float, "Margin")
    YG_NODE_LAYOUT_EDGE_PROPERTY(float, "Border")
    YG_NODE_LAYOUT_EDGE_PROPERTY(float, "Padding")

    void(
        "ConfigSetLogger",
        "",

        YGConfigRef.const.IN("config", ""),
        YGLogger.IN("logger", "")
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
        "ConfigSetPointScaleFactor",
        "Set this to number of pixels in 1 point to round calculation results. If you want to avoid rounding set {@code PointScaleFactor} to 0.",

        YGConfigRef.const.IN("config", ""),
        float.IN("pixelsInPoint", "")
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
        "ConfigSetNodeClonedFunc",
        "",

        YGConfigRef.const.IN("config", ""),
        YGNodeClonedFunc.IN("callback", "") // const function pointer in Yoga sources
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