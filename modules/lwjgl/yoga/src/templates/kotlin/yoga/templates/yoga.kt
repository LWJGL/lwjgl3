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
    documentation =
        """
        Native bindings to ${url("https://www.yogalayout.dev/", "Yoga")}.

        Yoga is an embeddable layout system used in popular UI frameworks like React Native. Yoga itself is not a UI framework, and does not do any drawing
        itself. Yoga's only responsibility is determining the size and position of boxes.

        Yoga supports a familiar subset of CSS, mostly focused on Flexbox. This gives users a familiar model, and enables sharing code between native platforms
        and the browser.

        Yoga is written in C++, with a public C API. This allows Yoga to be used by a wide variety of languages, via both offficial and unofficial bindings.
        """

    // YGConfig.h

    YGConfigRef(
        "ConfigNew",
        """
        Allocates a set of configuration options.

        The configuration may be applied to multiple nodes (i.e. a single global config), or can be applied more granularly per-node.
        """,

        void()
    )

    void(
        "ConfigFree",
        "Frees the associated Yoga configuration.",

        YGConfigRef("config", "")
    )

    YGConfigConstRef(
        "ConfigGetDefault",
        "Returns the default config values set by Yoga.",

        void()
    )

    void(
        "ConfigSetUseWebDefaults",
        """
        Yoga by default creates new nodes with style defaults different from flexbox on web (e.g. #FlexDirectionColumn and #PositionTypeRelative).

        {@code UseWebDefaults} instructs Yoga to instead use a default style consistent with the web.
        """,

        YGConfigRef("config", ""),
        bool("enabled", "")
    )
    bool(
        "ConfigGetUseWebDefaults",
        "Whether the configuration is set to use web defaults.",

        YGConfigConstRef("config", "")
    )

    void(
        "ConfigSetPointScaleFactor",
        """
        Yoga will by default round final layout positions and dimensions to the nearst point.

        {@code pointScaleFactor} controls the density of the grid used for layout rounding (e.g. to round to the closest display pixel).
 
        May be set to 0.0f to avoid rounding the layout results.
        """,

        YGConfigRef("config", ""),
        float("pixelsInPoint", "")
    )
    float(
        "ConfigGetPointScaleFactor",
        "Get the currently set point scale factor.",

        YGConfigConstRef("config", "")
    )

    void(
        "ConfigSetErrata",
        """
        Configures how Yoga balances W3C conformance vs compatibility with layouts created against earlier versions of Yoga.

        By default Yoga will prioritize W3C conformance. {@code Errata} may be set to ask Yoga to produce specific incorrect behaviors. E.g.
        {@code YGConfigSetErrata(config, YGErrataStretchFlexBasis)}.

        {@code YGErrata} is a bitmask, and multiple errata may be set at once. Predefined constants exist for convenience:
        ${ol(
            "#ErrataNone: No errata",
            "#ErrataClassic: Match layout behaviors of Yoga 1.x",
            "#ErrataAll: Match layout behaviors of Yoga 1.x, including {@code UseLegacyStretchBehaviour}"
        )}
         """,

        YGConfigRef("config", ""),
        YGErrata("errata", "")
    )
    YGErrata(
        "ConfigGetErrata",
        "Get the currently set errata.",

        YGConfigConstRef("config", "")
    )

    void(
        "ConfigSetLogger",
        "Set a custom log function for to use when logging diagnostics or fatal errors.",

        YGConfigRef("config", ""),
        nullable..YGLogger("logger", "")
    )

    void(
        "ConfigSetContext",
        "Sets an arbitrary context pointer on the config which may be read from during callbacks.",

        YGConfigRef("config", ""),
        nullable..opaque_p("context", "")
    )
    opaque_p(
        "ConfigGetContext",
        "Gets the currently set context.",

        YGConfigConstRef("config", "")
    )

    void(
        "ConfigSetExperimentalFeatureEnabled",
        "Enable an experimental/unsupported feature in Yoga.",

        YGConfigRef("config", ""),
        YGExperimentalFeature("feature", "", "ExperimentalFeature\\w+"),
        bool("enabled", "")
    )
    bool(
        "ConfigIsExperimentalFeatureEnabled",
        "Whether an experimental feature is set.",

        YGConfigConstRef("config", ""),
        YGExperimentalFeature("feature", "", "ExperimentalFeature\\w+")
    )

    void(
        "ConfigSetCloneNodeFunc",
        """
        Sets a callback, called during layout, to create a new mutable Yoga node if Yoga must write to it and its owner is not its parent observed during
        layout.
        """,

        YGConfigRef("config", ""),
        nullable..YGCloneNodeFunc("callback", "")
    )

    // YGEnums.h

    EnumConstant(
        "YGAlign",

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
        "YGBoxSizing",

        "BoxSizingBorderBox".enum,
        "BoxSizingContentBox".enum
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
        "DisplayNone".enum,
        "DisplayContents".enum
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
        "YGErrata",

        "ErrataNone".enum("", "0"),
        "ErrataStretchFlexBasis".enum("", "1"),
        "ErrataAbsolutePositionWithoutInsetsExcludesPadding".enum("", "2"),
        "ErrataAbsolutePercentAgainstInnerSize".enum("", "4"),
        "ErrataAll".enum("", "2147483647"),
        "ErrataClassic".enum("", "2147483646")
    )

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

    val Gutters = EnumConstant(
        "YGGutter",

        "GutterColumn".enum,
        "GutterRow".enum,
        "GutterAll".enum
    ).javaDocLinks

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

    // YGNode.h

    YGNodeRef(
        "NodeNew",
        "Heap allocates and returns a new Yoga node using Yoga settings.",

        void()
    )

    YGNodeRef(
        "NodeNewWithConfig",
        "Heap allocates and returns a new Yoga node, with customized settings.",

        YGConfigConstRef("config", "")
    )

    YGNodeRef(
        "NodeClone",
        """
        Returns a mutable copy of an existing node, with the same context and children, but no owner set.

        Does not call the function set by #ConfigSetCloneNodeFunc().
        """,

        YGNodeConstRef("node", "")
    )

    void(
        "NodeFree",
        "Frees the Yoga node, disconnecting it from its owner and children.",

        YGNodeRef("node", "")
    )

    void(
        "NodeFreeRecursive",
        "Frees the subtree of Yoga nodes rooted at the given node.",

        YGNodeRef("node", "")
    )

    void(
        "NodeFinalize",
        """
        Frees the Yoga node without disconnecting it from its owner or children.

        Allows garbage collecting Yoga nodes in parallel when the entire tree is unreachable.
        """,

        YGNodeRef("node", "")
    )

    void(
        "NodeReset",
        "Resets the node to its default state.",

        YGNodeRef("node", "")
    )

    void(
        "NodeCalculateLayout",
        """
        Calculates the layout of the tree rooted at the given node.

        Layout results may be read after calling {@code YGNodeCalculateLayout()} using functions like #NodeLayoutGetLeft(), #NodeLayoutGetTop(), etc.

        #NodeGetHasNewLayout() may be read to know if the layout of the node or its subtrees may have changed since the last time {@code YGNodeCalculate()} was
        called.
        """,

        YGNodeRef("node", ""),
        float("availableWidth", ""),
        float("availableHeight", ""),
        YGDirection("ownerDirection", "", "Direction\\w+")
    )

    bool(
        "NodeGetHasNewLayout",
        """
        Whether the given node may have new layout results.

        Must be reset by calling #NodeSetHasNewLayout().
        """,

        YGNodeConstRef("node", "")
    )
    void(
        "NodeSetHasNewLayout",
        "Sets whether a nodes layout is considered new.",

        YGNodeRef("node", ""),
        bool("hasNewLayout", "")
    )

    bool(
        "NodeIsDirty",
        "Whether the node's layout results are dirty due to it or its children changing.",

        YGNodeConstRef("node", "")
    )
    void(
        "NodeMarkDirty",
        "Marks a node with custom measure function as dirty.",

        YGNodeRef("node", "")
    )

    void(
        "NodeSetDirtiedFunc",
        "Called when a change is made to the Yoga tree which dirties this node.",

        YGNodeRef("node", ""),
        nullable..YGDirtiedFunc("dirtiedFunc", "")
    )
    YGDirtiedFunc(
        "NodeGetDirtiedFunc",
        "Returns a dirtied func if set.",

        YGNodeConstRef("node", "")
    )

    void(
        "NodeInsertChild",
        "Inserts a child node at the given index.",

        YGNodeRef("node", ""),
        YGNodeRef("child", ""),
        size_t("index", "")
    )

    void(
        "NodeSwapChild",
        "Replaces the child node at a given index with a new one.",

        YGNodeRef("node", ""),
        YGNodeRef("child", ""),
        size_t("index", "")
    )

    void(
        "NodeRemoveChild",
        "Removes the given child node.",

        YGNodeRef("node", ""),
        YGNodeRef("child", "")
    )

    void(
        "NodeRemoveAllChildren",
        "Removes all children nodes.",

        YGNodeRef("node", "")
    )

    void(
        "NodeSetChildren",
        "Sets children according to the given list of nodes.",

        YGNodeRef("owner", ""),
        YGNodeRef.const.p("children", ""),
        AutoSize("children")..size_t("count", "")
    )

    YGNodeRef(
        "NodeGetChild",
        "Get the child node at a given index.",

        YGNodeRef("node", ""),
        size_t("index", "")
    )

    size_t(
        "NodeGetChildCount",
        "The number of child nodes.",

        YGNodeConstRef("node", "")
    )

    YGNodeRef(
        "NodeGetOwner",
        "Get the parent/owner currently set for a node.",

        YGNodeRef("node", "")
    )

    YGNodeRef(
        "NodeGetParent",
        "Get the parent/owner currently set for a node.",

        YGNodeRef("node", "")
    )

    void(
        "NodeSetConfig",
        "Set a new config for the node after creation.",

        YGNodeRef("node", ""),
        YGConfigRef("config", "")
    )
    YGConfigRef(
        "NodeGetConfig",
        "Get the config currently set on the node.",

        YGNodeRef("node", "")
    )

    void(
        "NodeSetContext",
        "Sets extra data on the Yoga node which may be read from during callbacks.",

        YGNodeRef("node", ""),
        nullable..opaque_p("context", "")
    )
    opaque_p(
        "NodeGetContext",
        "Returns the context or #NULL if no context has been set.",

        YGNodeRef("node", "")
    )

    void(
        "NodeSetMeasureFunc",
        """
        Allows providing custom measurements for a Yoga leaf node (usually for measuring text).

        #NodeMarkDirty() must be set if content effecting the measurements of the node changes.
        """,

        YGNodeRef("node", ""),
        nullable..YGMeasureFunc("measureFunc", "")
    )
    bool(
        "NodeHasMeasureFunc",
        "Whether a measure function is set.",

        YGNodeConstRef("node", "")
    )

    void(
        "NodeSetBaselineFunc",
        "Set a custom function for determining the text baseline for use in baseline alignment.",

        YGNodeRef("node", ""),
        nullable..YGBaselineFunc("baselineFunc", "")
    )
    bool(
        "NodeHasBaselineFunc",
        "Whether a baseline function is set.",

        YGNodeConstRef("node", "")
    )

    void(
        "NodeSetIsReferenceBaseline",
        "Sets this node should be considered the reference baseline among siblings.",

        YGNodeRef("node", ""),
        bool("isReferenceBaseline", "")
    )
    bool(
        "NodeIsReferenceBaseline",
        "Whether this node is set as the reference baseline.",

        YGNodeConstRef("node", "")
    )

    void(
        "NodeSetNodeType",
        "Sets whether a leaf node's layout results may be truncated during layout rounding.",

        YGNodeRef("node", ""),
        YGNodeType("nodeType", "")
    )
    YGNodeType(
        "NodeGetNodeType",
        "Whether a leaf node's layout results may be truncated during layout rounding.",

        YGNodeConstRef("node", "")
    )

    void(
        "NodeSetAlwaysFormsContainingBlock",
        """
        Make it so that this node will always form a containing block for any descendant nodes.

        This is useful for when a node has a property outside of Yoga that will form a containing block. For example, transforms or some of the others listed
        in ${url("https://developer.mozilla.org/en-US/docs/Web/CSS/Containing_block", "Layout and the containing block")}.
        """,

        YGNodeRef("node", ""),
        bool("alwaysFormsContainingBlock", "")
    )

    bool(
        "NodeGetAlwaysFormsContainingBlock",
        """
        Whether the node will always form a containing block for any descendant.

        This can happen in situation where the client implements something like a transform that can affect containing blocks but is not handled by Yoga
        directly.
        """,

        YGNodeConstRef("node", "")
    )

    // YGNodeLayout.h

    float("NodeLayoutGetLeft", "", YGNodeRef("node", ""))
    float("NodeLayoutGetTop", "", YGNodeRef("node", ""))
    float("NodeLayoutGetRight", "", YGNodeRef("node", ""))
    float("NodeLayoutGetBottom", "", YGNodeRef("node", ""))
    float("NodeLayoutGetWidth", "", YGNodeRef("node", ""))
    float("NodeLayoutGetHeight", "", YGNodeRef("node", ""))
    YGDirection("NodeLayoutGetDirection", "", YGNodeRef("node", ""))
    bool("NodeLayoutGetHadOverflow", "", YGNodeRef("node", ""))

    float(
        "NodeLayoutGetMargin",
        """
        Gets the computed value for these nodess after performing layout.

        If they were set using point values then the returned value will be the same as #NodeStyleGetMargin()). However if they were set using a percentage
        value then the returned value is the computed value used during layout.
        """,

        YGNodeRef("node", ""),
        YGEdge("edge", "", Edges)
    )

    float(
        "NodeLayoutGetBorder",
        """
        Gets the computed value for these nodes after performing layout.

        If they were set using point values then the returned value will be the same as #NodeStyleGetBorder(). However if they were set using a percentage
        value then the returned value is the computed value used during layout.
        """,

        YGNodeRef("node", ""),
        YGEdge("edge", "", Edges)
    )

    float(
        "NodeLayoutGetPadding",
        """
        Gets the computed value for these nodes after performing layout.

        If they were set using point values then the returned value will be the same as #NodeStyleGetPadding(). However if they were set using a percentage
        value then the returned value is the computed value used during layout.
        """,

        YGNodeRef("node", ""),
        YGEdge("edge", "", Edges)
    )

    // YGNodeStyle.h

    void(
        "NodeCopyStyle",
        "",

        YGNodeRef("dstNode", ""),
        YGNodeConstRef("srcNode", "")
    )

    void(
        "NodeStyleSetDirection",
        "",

        YGNodeRef("node", ""),
        YGDirection("direction", "", "Direction\\w+")
    )
    YGDirection("NodeStyleGetDirection", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetFlexDirection",
        "",

        YGNodeRef("node", ""),
        YGFlexDirection("flexDirection", "", "FlexDirection\\w+")
    )
    YGFlexDirection("NodeStyleGetFlexDirection", "", YGNodeConstRef("node", "")
    )

    void(
        "NodeStyleSetJustifyContent",
        "",

        YGNodeRef("node", ""),
        YGJustify("justifyContent", "", "Justify\\w+")
    )
    YGJustify("NodeStyleGetJustifyContent", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetAlignContent",
        "",

        YGNodeRef("node", ""),
        YGAlign("alignContent", "", "Align\\w+")
    )
    YGAlign("NodeStyleGetAlignContent", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetAlignItems",
        "",

        YGNodeRef("node", ""),
        YGAlign("alignItems", "", "Align\\w+")
    )
    YGAlign("NodeStyleGetAlignItems", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetAlignSelf",
        "",

        YGNodeRef("node", ""),
        YGAlign("alignSelf", "", "Align\\w+")
    )
    YGAlign("NodeStyleGetAlignSelf", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetPositionType",
        "",

        YGNodeRef("node", ""),
        YGPositionType("positionType", "", "PositionType\\w+")
    )
    YGPositionType("NodeStyleGetPositionType", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetPositionAuto",
        "",

        YGNodeRef("node", ""),
        YGEdge("edge", "")
    )

    void(
        "NodeStyleSetFlexWrap",
        "",

        YGNodeRef("node", ""),
        YGWrap("flexWrap", "", "Wrap\\w+")
    )
    YGWrap("NodeStyleGetFlexWrap", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetOverflow",
        "",

        YGNodeRef("node", ""),
        YGOverflow("overflow", "", "Overflow\\w+")
    )
    YGOverflow("NodeStyleGetOverflow", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetDisplay",
        "",

        YGNodeRef("node", ""),
        YGDisplay("display", "", "Display\\w+")
    )
    YGDisplay("NodeStyleGetDisplay", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetFlex",
        "",

        YGNodeRef("node", ""),
        float("flex", "")
    )
    float("NodeStyleGetFlex", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetFlexGrow",
        "",

        YGNodeRef("node", ""),
        float("flexGrow", "")
    )
    float("NodeStyleGetFlexGrow", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetFlexShrink",
        "",

        YGNodeRef("node", ""),
        float("flexShrink", "")
    )
    float("NodeStyleGetFlexShrink", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetFlexBasis",
        "",

        YGNodeRef("node", ""),
        float("flexBasis", "")
    )
    void(
        "NodeStyleSetFlexBasisPercent",
        "",

        YGNodeRef("node", ""),
        float("flexBasis", "")
    )
    void(
        "NodeStyleSetFlexBasisAuto",
        "",

        YGNodeRef("node", "")
    )
    YGValue("NodeStyleGetFlexBasis", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetPosition",
        "",

        YGNodeRef("node", ""),
        YGEdge("edge", "", Edges),
        float("position", "")
    )
    void(
        "NodeStyleSetPositionPercent",
        "",

        YGNodeRef("node", ""),
        YGEdge("edge", "", Edges),
        float("position", "")
    )
    YGValue(
        "NodeStyleGetPosition",
        "",

        YGNodeConstRef("node", ""),
        YGEdge("edge", "", Edges)
    )

    void(
        "NodeStyleSetMargin",
        "",

        YGNodeRef("node", ""),
        YGEdge("edge", "", Edges),
        float("margin", "")
    )
    void(
        "NodeStyleSetMarginPercent",
        "",

        YGNodeRef("node", ""),
        YGEdge("edge", "", Edges),
        float("margin", "")
    )
    void(
        "NodeStyleSetMarginAuto",
        "",

        YGNodeRef("node", ""),
        YGEdge("edge", "", Edges)
    )
    YGValue(
        "NodeStyleGetMargin",
        "",

        YGNodeConstRef("node", ""),
        YGEdge("edge", "", Edges)
    )

    void(
        "NodeStyleSetPadding",
        "",

        YGNodeRef("node", ""),
        YGEdge("edge", "", Edges),
        float("padding", "")
    )
    void(
        "NodeStyleSetPaddingPercent",
        "",

        YGNodeRef("node", ""),
        YGEdge("edge", "", Edges),
        float("padding", "")
    )
    YGValue(
        "NodeStyleGetPadding",
        "",

        YGNodeConstRef("node", ""),
        YGEdge("edge", "", Edges)
    )

    void(
        "NodeStyleSetBorder",
        "",

        YGNodeRef("node", ""),
        YGEdge("edge", "", Edges),
        float("border", "")
    )
    float(
        "NodeStyleGetBorder",
        "",

        YGNodeConstRef("node", ""),
        YGEdge("edge", "", Edges)
    )

    void(
        "NodeStyleSetGap",
        "",

        YGNodeRef("node", ""),
        YGGutter("gutter", "", Gutters),
        float("gapLength", "")
    )
    void(
        "NodeStyleSetGapPercent",
        "",

        YGNodeRef("node", ""),
        YGGutter("gutter", "", Gutters),
        float("gapLength", "")
    )
    float(
        "NodeStyleGetGap",
        "",

        YGNodeConstRef("node", ""),
        YGGutter("gutter", "", Gutters)
    )

    void(
        "NodeStyleSetBoxSizing",
        "",

        YGNodeRef("node", ""),
        YGBoxSizing("boxSizing", "")
    )

    YGBoxSizing(
        "NodeStyleGetBoxSizing",
        "",

        YGNodeConstRef("node", "")
    )

    void(
        "NodeStyleSetWidth",
        "",

        YGNodeRef("node", ""),
        float("width", "")
    )
    void(
        "NodeStyleSetWidthPercent",
        "",

        YGNodeRef("node", ""),
        float("width", "")
    )
    void(
        "NodeStyleSetWidthAuto",
        "",

        YGNodeRef("node", "")
    )
    YGValue("NodeStyleGetWidth", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetHeight",
        "",

        YGNodeRef("node", ""),
        float("height", "")
    )
    void(
        "NodeStyleSetHeightPercent",
        "",

        YGNodeRef("node", ""),
        float("height", "")
    )
    void(
        "NodeStyleSetHeightAuto",
        "",

        YGNodeRef("node", "")
    )
    YGValue("NodeStyleGetHeight", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetMinWidth",
        "",

        YGNodeRef("node", ""),
        float("minWidth", "")
    )
    void(
        "NodeStyleSetMinWidthPercent",
        "",

        YGNodeRef("node", ""),
        float("minWidth", "")
    )
    YGValue("NodeStyleGetMinWidth", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetMinHeight",
        "",

        YGNodeRef("node", ""),
        float("minHeight", "")
    )
    void(
        "NodeStyleSetMinHeightPercent",
        "",

        YGNodeRef("node", ""),
        float("minHeight", "")
    )
    YGValue("NodeStyleGetMinHeight", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetMaxWidth",
        "",

        YGNodeRef("node", ""),
        float("maxWidth", "")
    )
    void(
        "NodeStyleSetMaxWidthPercent",
        "",

        YGNodeRef("node", ""),
        float("maxWidth", "")
    )
    YGValue("NodeStyleGetMaxWidth", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetMaxHeight",
        "",

        YGNodeRef("node", ""),
        float("maxHeight", "")
    )
    void(
        "NodeStyleSetMaxHeightPercent",
        "",

        YGNodeRef("node", ""),
        float("maxHeight", "")
    )
    YGValue("NodeStyleGetMaxHeight", "", YGNodeConstRef("node", ""))

    void(
        "NodeStyleSetAspectRatio",
        "",

        YGNodeRef("node", ""),
        float("aspectRatio", "")
    )
    float("NodeStyleGetAspectRatio", "", YGNodeConstRef("node", ""))

    // YGPixelGrid.h

    float(
        "RoundValueToPixelGrid",
        "Rounds a point value to the nearest whole pixel, given a {@code pointScaleFactor} describing pixel density.",

        double("value", ""),
        double("pointScaleFactor", ""),
        bool("forceCeil", ""),
        bool("forceFloor", ""),

        returnDoc = "the rounded value in points"
    )

    // YGValue.h

    FloatConstant(
        "",

        "Undefined".."Float.NaN"
    )

    // Pre-defined YGValue structs

    macro..YGValue(
        "ValueAuto",
        "Constant for a dimension of \"auto\".",

        void()
    )
    macro..YGValue(
        "ValueUndefined",
        "Constant for a dimension which is not defined.",
        void()
    )
    macro..YGValue(
        "ValueZero",
        "Constant for a dimension that is zero-length.",

        void()
    )

    bool(
        "FloatIsUndefined",
        "Whether a dimension represented as a float is defined.",

        float("value", "")
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