/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.jspecify.annotations.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to <a href="https://www.yogalayout.dev/">Yoga</a>.
 * 
 * <p>Yoga is an embeddable layout system used in popular UI frameworks like React Native. Yoga itself is not a UI framework, and does not do any drawing
 * itself. Yoga's only responsibility is determining the size and position of boxes.</p>
 * 
 * <p>Yoga supports a familiar subset of CSS, mostly focused on Flexbox. This gives users a familiar model, and enables sharing code between native platforms
 * and the browser.</p>
 * 
 * <p>Yoga is written in C++, with a public C API. This allows Yoga to be used by a wide variety of languages, via both offficial and unofficial bindings.</p>
 */
public class Yoga {

    static { LibYoga.initialize(); }

    /**
     * YGAlign
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGAlignAuto AlignAuto}</li>
     * <li>{@link #YGAlignFlexStart AlignFlexStart}</li>
     * <li>{@link #YGAlignCenter AlignCenter}</li>
     * <li>{@link #YGAlignFlexEnd AlignFlexEnd}</li>
     * <li>{@link #YGAlignStretch AlignStretch}</li>
     * <li>{@link #YGAlignBaseline AlignBaseline}</li>
     * <li>{@link #YGAlignSpaceBetween AlignSpaceBetween}</li>
     * <li>{@link #YGAlignSpaceAround AlignSpaceAround}</li>
     * <li>{@link #YGAlignSpaceEvenly AlignSpaceEvenly}</li>
     * </ul>
     */
    public static final int
        YGAlignAuto         = 0,
        YGAlignFlexStart    = 1,
        YGAlignCenter       = 2,
        YGAlignFlexEnd      = 3,
        YGAlignStretch      = 4,
        YGAlignBaseline     = 5,
        YGAlignSpaceBetween = 6,
        YGAlignSpaceAround  = 7,
        YGAlignSpaceEvenly  = 8;

    /**
     * YGDimension
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGDimensionWidth DimensionWidth}</li>
     * <li>{@link #YGDimensionHeight DimensionHeight}</li>
     * </ul>
     */
    public static final int
        YGDimensionWidth  = 0,
        YGDimensionHeight = 1;

    /**
     * YGDirection
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGDirectionInherit DirectionInherit}</li>
     * <li>{@link #YGDirectionLTR DirectionLTR}</li>
     * <li>{@link #YGDirectionRTL DirectionRTL}</li>
     * </ul>
     */
    public static final int
        YGDirectionInherit = 0,
        YGDirectionLTR     = 1,
        YGDirectionRTL     = 2;

    /**
     * YGDisplay
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGDisplayFlex DisplayFlex}</li>
     * <li>{@link #YGDisplayNone DisplayNone}</li>
     * </ul>
     */
    public static final int
        YGDisplayFlex = 0,
        YGDisplayNone = 1;

    /**
     * YGEdge
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGEdgeLeft EdgeLeft}</li>
     * <li>{@link #YGEdgeTop EdgeTop}</li>
     * <li>{@link #YGEdgeRight EdgeRight}</li>
     * <li>{@link #YGEdgeBottom EdgeBottom}</li>
     * <li>{@link #YGEdgeStart EdgeStart}</li>
     * <li>{@link #YGEdgeEnd EdgeEnd}</li>
     * <li>{@link #YGEdgeHorizontal EdgeHorizontal}</li>
     * <li>{@link #YGEdgeVertical EdgeVertical}</li>
     * <li>{@link #YGEdgeAll EdgeAll}</li>
     * </ul>
     */
    public static final int
        YGEdgeLeft       = 0,
        YGEdgeTop        = 1,
        YGEdgeRight      = 2,
        YGEdgeBottom     = 3,
        YGEdgeStart      = 4,
        YGEdgeEnd        = 5,
        YGEdgeHorizontal = 6,
        YGEdgeVertical   = 7,
        YGEdgeAll        = 8;

    /**
     * YGErrata
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGErrataNone ErrataNone}</li>
     * <li>{@link #YGErrataStretchFlexBasis ErrataStretchFlexBasis}</li>
     * <li>{@link #YGErrataAbsolutePositioningIncorrect ErrataAbsolutePositioningIncorrect}</li>
     * <li>{@link #YGErrataAbsolutePercentAgainstInnerSize ErrataAbsolutePercentAgainstInnerSize}</li>
     * <li>{@link #YGErrataAll ErrataAll}</li>
     * <li>{@link #YGErrataClassic ErrataClassic}</li>
     * </ul>
     */
    public static final int
        YGErrataNone                            = 0,
        YGErrataStretchFlexBasis                = 1,
        YGErrataAbsolutePositioningIncorrect    = 2,
        YGErrataAbsolutePercentAgainstInnerSize = 4,
        YGErrataAll                             = 2147483647,
        YGErrataClassic                         = 2147483646;

    /** YGExperimentalFeature */
    public static final int YGExperimentalFeatureWebFlexBasis = 0;

    /**
     * YGFlexDirection
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGFlexDirectionColumn FlexDirectionColumn}</li>
     * <li>{@link #YGFlexDirectionColumnReverse FlexDirectionColumnReverse}</li>
     * <li>{@link #YGFlexDirectionRow FlexDirectionRow}</li>
     * <li>{@link #YGFlexDirectionRowReverse FlexDirectionRowReverse}</li>
     * </ul>
     */
    public static final int
        YGFlexDirectionColumn        = 0,
        YGFlexDirectionColumnReverse = 1,
        YGFlexDirectionRow           = 2,
        YGFlexDirectionRowReverse    = 3;

    /**
     * YGGutter
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGGutterColumn GutterColumn}</li>
     * <li>{@link #YGGutterRow GutterRow}</li>
     * <li>{@link #YGGutterAll GutterAll}</li>
     * </ul>
     */
    public static final int
        YGGutterColumn = 0,
        YGGutterRow    = 1,
        YGGutterAll    = 2;

    /**
     * YGJustify
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGJustifyFlexStart JustifyFlexStart}</li>
     * <li>{@link #YGJustifyCenter JustifyCenter}</li>
     * <li>{@link #YGJustifyFlexEnd JustifyFlexEnd}</li>
     * <li>{@link #YGJustifySpaceBetween JustifySpaceBetween}</li>
     * <li>{@link #YGJustifySpaceAround JustifySpaceAround}</li>
     * <li>{@link #YGJustifySpaceEvenly JustifySpaceEvenly}</li>
     * </ul>
     */
    public static final int
        YGJustifyFlexStart    = 0,
        YGJustifyCenter       = 1,
        YGJustifyFlexEnd      = 2,
        YGJustifySpaceBetween = 3,
        YGJustifySpaceAround  = 4,
        YGJustifySpaceEvenly  = 5;

    /**
     * YGLogLevel
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGLogLevelError LogLevelError}</li>
     * <li>{@link #YGLogLevelWarn LogLevelWarn}</li>
     * <li>{@link #YGLogLevelInfo LogLevelInfo}</li>
     * <li>{@link #YGLogLevelDebug LogLevelDebug}</li>
     * <li>{@link #YGLogLevelVerbose LogLevelVerbose}</li>
     * <li>{@link #YGLogLevelFatal LogLevelFatal}</li>
     * </ul>
     */
    public static final int
        YGLogLevelError   = 0,
        YGLogLevelWarn    = 1,
        YGLogLevelInfo    = 2,
        YGLogLevelDebug   = 3,
        YGLogLevelVerbose = 4,
        YGLogLevelFatal   = 5;

    /**
     * YGMeasureMode
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGMeasureModeUndefined MeasureModeUndefined}</li>
     * <li>{@link #YGMeasureModeExactly MeasureModeExactly}</li>
     * <li>{@link #YGMeasureModeAtMost MeasureModeAtMost}</li>
     * </ul>
     */
    public static final int
        YGMeasureModeUndefined = 0,
        YGMeasureModeExactly   = 1,
        YGMeasureModeAtMost    = 2;

    /**
     * YGNodeType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGNodeTypeDefault NodeTypeDefault}</li>
     * <li>{@link #YGNodeTypeText NodeTypeText}</li>
     * </ul>
     */
    public static final int
        YGNodeTypeDefault = 0,
        YGNodeTypeText    = 1;

    /**
     * YGOverflow
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGOverflowVisible OverflowVisible}</li>
     * <li>{@link #YGOverflowHidden OverflowHidden}</li>
     * <li>{@link #YGOverflowScroll OverflowScroll}</li>
     * </ul>
     */
    public static final int
        YGOverflowVisible = 0,
        YGOverflowHidden  = 1,
        YGOverflowScroll  = 2;

    /**
     * YGPositionType
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGPositionTypeStatic PositionTypeStatic}</li>
     * <li>{@link #YGPositionTypeRelative PositionTypeRelative}</li>
     * <li>{@link #YGPositionTypeAbsolute PositionTypeAbsolute}</li>
     * </ul>
     */
    public static final int
        YGPositionTypeStatic   = 0,
        YGPositionTypeRelative = 1,
        YGPositionTypeAbsolute = 2;

    /**
     * YGUnit
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGUnitUndefined UnitUndefined}</li>
     * <li>{@link #YGUnitPoint UnitPoint}</li>
     * <li>{@link #YGUnitPercent UnitPercent}</li>
     * <li>{@link #YGUnitAuto UnitAuto}</li>
     * </ul>
     */
    public static final int
        YGUnitUndefined = 0,
        YGUnitPoint     = 1,
        YGUnitPercent   = 2,
        YGUnitAuto      = 3;

    /**
     * YGWrap
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #YGWrapNoWrap WrapNoWrap}</li>
     * <li>{@link #YGWrapWrap WrapWrap}</li>
     * <li>{@link #YGWrapReverse WrapReverse}</li>
     * </ul>
     */
    public static final int
        YGWrapNoWrap  = 0,
        YGWrapWrap    = 1,
        YGWrapReverse = 2;

    public static final float YGUndefined = Float.NaN;

    protected Yoga() {
        throw new UnsupportedOperationException();
    }

    // --- [ YGConfigNew ] ---

    /**
     * Allocates a set of configuration options.
     * 
     * <p>The configuration may be applied to multiple nodes (i.e. a single global config), or can be applied more granularly per-node.</p>
     */
    @NativeType("YGConfigRef")
    public static native long YGConfigNew();

    // --- [ YGConfigFree ] ---

    /** Unsafe version of: {@link #YGConfigFree ConfigFree} */
    public static native void nYGConfigFree(long config);

    /** Frees the associated Yoga configuration. */
    public static void YGConfigFree(@NativeType("YGConfigRef") long config) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigFree(config);
    }

    // --- [ YGConfigGetDefault ] ---

    /** Returns the default config values set by Yoga. */
    @NativeType("YGConfigConstRef")
    public static native long YGConfigGetDefault();

    // --- [ YGConfigSetUseWebDefaults ] ---

    /** Unsafe version of: {@link #YGConfigSetUseWebDefaults ConfigSetUseWebDefaults} */
    public static native void nYGConfigSetUseWebDefaults(long config, boolean enabled);

    /**
     * Yoga by default creates new nodes with style defaults different from flexbox on web (e.g. {@link #YGFlexDirectionColumn FlexDirectionColumn} and {@link #YGPositionTypeRelative PositionTypeRelative}).
     * 
     * <p>{@code UseWebDefaults} instructs Yoga to instead use a default style consistent with the web.</p>
     */
    public static void YGConfigSetUseWebDefaults(@NativeType("YGConfigRef") long config, @NativeType("bool") boolean enabled) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetUseWebDefaults(config, enabled);
    }

    // --- [ YGConfigGetUseWebDefaults ] ---

    /** Unsafe version of: {@link #YGConfigGetUseWebDefaults ConfigGetUseWebDefaults} */
    public static native boolean nYGConfigGetUseWebDefaults(long config);

    /** Whether the configuration is set to use web defaults. */
    @NativeType("bool")
    public static boolean YGConfigGetUseWebDefaults(@NativeType("YGConfigConstRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigGetUseWebDefaults(config);
    }

    // --- [ YGConfigSetPointScaleFactor ] ---

    /** Unsafe version of: {@link #YGConfigSetPointScaleFactor ConfigSetPointScaleFactor} */
    public static native void nYGConfigSetPointScaleFactor(long config, float pixelsInPoint);

    /**
     * Yoga will by default round final layout positions and dimensions to the nearst point.
     * 
     * <p>{@code pointScaleFactor} controls the density of the grid used for layout rounding (e.g. to round to the closest display pixel).</p>
     * 
     * <p>May be set to 0.0f to avoid rounding the layout results.</p>
     */
    public static void YGConfigSetPointScaleFactor(@NativeType("YGConfigRef") long config, float pixelsInPoint) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetPointScaleFactor(config, pixelsInPoint);
    }

    // --- [ YGConfigGetPointScaleFactor ] ---

    /** Unsafe version of: {@link #YGConfigGetPointScaleFactor ConfigGetPointScaleFactor} */
    public static native float nYGConfigGetPointScaleFactor(long config);

    /** Get the currently set point scale factor. */
    public static float YGConfigGetPointScaleFactor(@NativeType("YGConfigConstRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigGetPointScaleFactor(config);
    }

    // --- [ YGConfigSetErrata ] ---

    /** Unsafe version of: {@link #YGConfigSetErrata ConfigSetErrata} */
    public static native void nYGConfigSetErrata(long config, int errata);

    /**
     * Configures how Yoga balances W3C conformance vs compatibility with layouts created against earlier versions of Yoga.
     * 
     * <p>By default Yoga will prioritize W3C conformance. {@code Errata} may be set to ask Yoga to produce specific incorrect behaviors. E.g.
     * {@code YGConfigSetErrata(config, YGErrataStretchFlexBasis)}.</p>
     * 
     * <p>{@code YGErrata} is a bitmask, and multiple errata may be set at once. Predefined constants exist for convenience:</p>
     * 
     * <ol>
     * <li>{@link #YGErrataNone ErrataNone}: No errata</li>
     * <li>{@link #YGErrataClassic ErrataClassic}: Match layout behaviors of Yoga 1.x</li>
     * <li>{@link #YGErrataAll ErrataAll}: Match layout behaviors of Yoga 1.x, including {@code UseLegacyStretchBehaviour}</li>
     * </ol>
     */
    public static void YGConfigSetErrata(@NativeType("YGConfigRef") long config, @NativeType("YGErrata") int errata) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetErrata(config, errata);
    }

    // --- [ YGConfigGetErrata ] ---

    /** Unsafe version of: {@link #YGConfigGetErrata ConfigGetErrata} */
    public static native int nYGConfigGetErrata(long config);

    /** Get the currently set errata. */
    @NativeType("YGErrata")
    public static int YGConfigGetErrata(@NativeType("YGConfigConstRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigGetErrata(config);
    }

    // --- [ YGConfigSetLogger ] ---

    /** Unsafe version of: {@link #YGConfigSetLogger ConfigSetLogger} */
    public static native void nYGConfigSetLogger(long config, long logger);

    /** Set a custom log function for to use when logging diagnostics or fatal errors. */
    public static void YGConfigSetLogger(@NativeType("YGConfigRef") long config, @NativeType("YGLogger") @Nullable YGLoggerI logger) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetLogger(config, memAddressSafe(logger));
    }

    // --- [ YGConfigSetContext ] ---

    /** Unsafe version of: {@link #YGConfigSetContext ConfigSetContext} */
    public static native void nYGConfigSetContext(long config, long context);

    /** Sets an arbitrary context pointer on the config which may be read from during callbacks. */
    public static void YGConfigSetContext(@NativeType("YGConfigRef") long config, @NativeType("void *") long context) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetContext(config, context);
    }

    // --- [ YGConfigGetContext ] ---

    /** Unsafe version of: {@link #YGConfigGetContext ConfigGetContext} */
    public static native long nYGConfigGetContext(long config);

    /** Gets the currently set context. */
    @NativeType("void *")
    public static long YGConfigGetContext(@NativeType("YGConfigConstRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigGetContext(config);
    }

    // --- [ YGConfigSetExperimentalFeatureEnabled ] ---

    /** Unsafe version of: {@link #YGConfigSetExperimentalFeatureEnabled ConfigSetExperimentalFeatureEnabled} */
    public static native void nYGConfigSetExperimentalFeatureEnabled(long config, int feature, boolean enabled);

    /**
     * Enable an experimental/unsupported feature in Yoga.
     *
     * @param feature must be:<br><table><tr><td>{@link #YGExperimentalFeatureWebFlexBasis ExperimentalFeatureWebFlexBasis}</td></tr></table>
     */
    public static void YGConfigSetExperimentalFeatureEnabled(@NativeType("YGConfigRef") long config, @NativeType("YGExperimentalFeature") int feature, @NativeType("bool") boolean enabled) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetExperimentalFeatureEnabled(config, feature, enabled);
    }

    // --- [ YGConfigIsExperimentalFeatureEnabled ] ---

    /** Unsafe version of: {@link #YGConfigIsExperimentalFeatureEnabled ConfigIsExperimentalFeatureEnabled} */
    public static native boolean nYGConfigIsExperimentalFeatureEnabled(long config, int feature);

    /**
     * Whether an experimental feature is set.
     *
     * @param feature must be:<br><table><tr><td>{@link #YGExperimentalFeatureWebFlexBasis ExperimentalFeatureWebFlexBasis}</td></tr></table>
     */
    @NativeType("bool")
    public static boolean YGConfigIsExperimentalFeatureEnabled(@NativeType("YGConfigConstRef") long config, @NativeType("YGExperimentalFeature") int feature) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigIsExperimentalFeatureEnabled(config, feature);
    }

    // --- [ YGConfigSetCloneNodeFunc ] ---

    /** Unsafe version of: {@link #YGConfigSetCloneNodeFunc ConfigSetCloneNodeFunc} */
    public static native void nYGConfigSetCloneNodeFunc(long config, long callback);

    /**
     * Sets a callback, called during layout, to create a new mutable Yoga node if Yoga must write to it and its owner is not its parent observed during
     * layout.
     */
    public static void YGConfigSetCloneNodeFunc(@NativeType("YGConfigRef") long config, @NativeType("YGCloneNodeFunc") @Nullable YGCloneNodeFuncI callback) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetCloneNodeFunc(config, memAddressSafe(callback));
    }

    // --- [ YGNodeNew ] ---

    /** Heap allocates and returns a new Yoga node using Yoga settings. */
    @NativeType("YGNodeRef")
    public static native long YGNodeNew();

    // --- [ YGNodeNewWithConfig ] ---

    /** Unsafe version of: {@link #YGNodeNewWithConfig NodeNewWithConfig} */
    public static native long nYGNodeNewWithConfig(long config);

    /** Heap allocates and returns a new Yoga node, with customized settings. */
    @NativeType("YGNodeRef")
    public static long YGNodeNewWithConfig(@NativeType("YGConfigConstRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGNodeNewWithConfig(config);
    }

    // --- [ YGNodeClone ] ---

    /** Unsafe version of: {@link #YGNodeClone NodeClone} */
    public static native long nYGNodeClone(long node);

    /**
     * Returns a mutable copy of an existing node, with the same context and children, but no owner set.
     * 
     * <p>Does not call the function set by {@link #YGConfigSetCloneNodeFunc ConfigSetCloneNodeFunc}.</p>
     */
    @NativeType("YGNodeRef")
    public static long YGNodeClone(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeClone(node);
    }

    // --- [ YGNodeFree ] ---

    /** Unsafe version of: {@link #YGNodeFree NodeFree} */
    public static native void nYGNodeFree(long node);

    /** Frees the Yoga node, disconnecting it from its owner and children. */
    public static void YGNodeFree(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeFree(node);
    }

    // --- [ YGNodeFreeRecursive ] ---

    /** Unsafe version of: {@link #YGNodeFreeRecursive NodeFreeRecursive} */
    public static native void nYGNodeFreeRecursive(long node);

    /** Frees the subtree of Yoga nodes rooted at the given node. */
    public static void YGNodeFreeRecursive(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeFreeRecursive(node);
    }

    // --- [ YGNodeFinalize ] ---

    /** Unsafe version of: {@link #YGNodeFinalize NodeFinalize} */
    public static native void nYGNodeFinalize(long node);

    /**
     * Frees the Yoga node without disconnecting it from its owner or children.
     * 
     * <p>Allows garbage collecting Yoga nodes in parallel when the entire tree is unreachable.</p>
     */
    public static void YGNodeFinalize(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeFinalize(node);
    }

    // --- [ YGNodeReset ] ---

    /** Unsafe version of: {@link #YGNodeReset NodeReset} */
    public static native void nYGNodeReset(long node);

    /** Resets the node to its default state. */
    public static void YGNodeReset(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeReset(node);
    }

    // --- [ YGNodeCalculateLayout ] ---

    /** Unsafe version of: {@link #YGNodeCalculateLayout NodeCalculateLayout} */
    public static native void nYGNodeCalculateLayout(long node, float availableWidth, float availableHeight, int ownerDirection);

    /**
     * Calculates the layout of the tree rooted at the given node.
     * 
     * <p>Layout results may be read after calling {@code YGNodeCalculateLayout()} using functions like {@link #YGNodeLayoutGetLeft NodeLayoutGetLeft}, {@link #YGNodeLayoutGetTop NodeLayoutGetTop}, etc.</p>
     * 
     * <p>{@link #YGNodeGetHasNewLayout NodeGetHasNewLayout} may be read to know if the layout of the node or its subtrees may have changed since the last time {@code YGNodeCalculate()} was
     * called.</p>
     *
     * @param ownerDirection one of:<br><table><tr><td>{@link #YGDirectionInherit DirectionInherit}</td><td>{@link #YGDirectionLTR DirectionLTR}</td><td>{@link #YGDirectionRTL DirectionRTL}</td></tr></table>
     */
    public static void YGNodeCalculateLayout(@NativeType("YGNodeRef") long node, float availableWidth, float availableHeight, @NativeType("YGDirection") int ownerDirection) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeCalculateLayout(node, availableWidth, availableHeight, ownerDirection);
    }

    // --- [ YGNodeGetHasNewLayout ] ---

    /** Unsafe version of: {@link #YGNodeGetHasNewLayout NodeGetHasNewLayout} */
    public static native boolean nYGNodeGetHasNewLayout(long node);

    /**
     * Whether the given node may have new layout results.
     * 
     * <p>Must be reset by calling {@link #YGNodeSetHasNewLayout NodeSetHasNewLayout}.</p>
     */
    @NativeType("bool")
    public static boolean YGNodeGetHasNewLayout(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetHasNewLayout(node);
    }

    // --- [ YGNodeSetHasNewLayout ] ---

    /** Unsafe version of: {@link #YGNodeSetHasNewLayout NodeSetHasNewLayout} */
    public static native void nYGNodeSetHasNewLayout(long node, boolean hasNewLayout);

    /** Sets whether a nodes layout is considered new. */
    public static void YGNodeSetHasNewLayout(@NativeType("YGNodeRef") long node, @NativeType("bool") boolean hasNewLayout) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetHasNewLayout(node, hasNewLayout);
    }

    // --- [ YGNodeIsDirty ] ---

    /** Unsafe version of: {@link #YGNodeIsDirty NodeIsDirty} */
    public static native boolean nYGNodeIsDirty(long node);

    /** Whether the node's layout results are dirty due to it or its children changing. */
    @NativeType("bool")
    public static boolean YGNodeIsDirty(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeIsDirty(node);
    }

    // --- [ YGNodeMarkDirty ] ---

    /** Unsafe version of: {@link #YGNodeMarkDirty NodeMarkDirty} */
    public static native void nYGNodeMarkDirty(long node);

    /** Marks a node with custom measure function as dirty. */
    public static void YGNodeMarkDirty(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeMarkDirty(node);
    }

    // --- [ YGNodeSetDirtiedFunc ] ---

    /** Unsafe version of: {@link #YGNodeSetDirtiedFunc NodeSetDirtiedFunc} */
    public static native void nYGNodeSetDirtiedFunc(long node, long dirtiedFunc);

    /** Called when a change is made to the Yoga tree which dirties this node. */
    public static void YGNodeSetDirtiedFunc(@NativeType("YGNodeRef") long node, @NativeType("YGDirtiedFunc") @Nullable YGDirtiedFuncI dirtiedFunc) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetDirtiedFunc(node, memAddressSafe(dirtiedFunc));
    }

    // --- [ YGNodeGetDirtiedFunc ] ---

    /** Unsafe version of: {@link #YGNodeGetDirtiedFunc NodeGetDirtiedFunc} */
    public static native long nYGNodeGetDirtiedFunc(long node);

    /** Returns a dirtied func if set. */
    @NativeType("YGDirtiedFunc")
    public static @Nullable YGDirtiedFunc YGNodeGetDirtiedFunc(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return YGDirtiedFunc.createSafe(nYGNodeGetDirtiedFunc(node));
    }

    // --- [ YGNodeInsertChild ] ---

    /** Unsafe version of: {@link #YGNodeInsertChild NodeInsertChild} */
    public static native void nYGNodeInsertChild(long node, long child, long index);

    /** Inserts a child node at the given index. */
    public static void YGNodeInsertChild(@NativeType("YGNodeRef") long node, @NativeType("YGNodeRef") long child, @NativeType("size_t") long index) {
        if (CHECKS) {
            check(node);
            check(child);
        }
        nYGNodeInsertChild(node, child, index);
    }

    // --- [ YGNodeSwapChild ] ---

    /** Unsafe version of: {@link #YGNodeSwapChild NodeSwapChild} */
    public static native void nYGNodeSwapChild(long node, long child, long index);

    /** Replaces the child node at a given index with a new one. */
    public static void YGNodeSwapChild(@NativeType("YGNodeRef") long node, @NativeType("YGNodeRef") long child, @NativeType("size_t") long index) {
        if (CHECKS) {
            check(node);
            check(child);
        }
        nYGNodeSwapChild(node, child, index);
    }

    // --- [ YGNodeRemoveChild ] ---

    /** Unsafe version of: {@link #YGNodeRemoveChild NodeRemoveChild} */
    public static native void nYGNodeRemoveChild(long node, long child);

    /** Removes the given child node. */
    public static void YGNodeRemoveChild(@NativeType("YGNodeRef") long node, @NativeType("YGNodeRef") long child) {
        if (CHECKS) {
            check(node);
            check(child);
        }
        nYGNodeRemoveChild(node, child);
    }

    // --- [ YGNodeRemoveAllChildren ] ---

    /** Unsafe version of: {@link #YGNodeRemoveAllChildren NodeRemoveAllChildren} */
    public static native void nYGNodeRemoveAllChildren(long node);

    /** Removes all children nodes. */
    public static void YGNodeRemoveAllChildren(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeRemoveAllChildren(node);
    }

    // --- [ YGNodeSetChildren ] ---

    /** Unsafe version of: {@link #YGNodeSetChildren NodeSetChildren} */
    public static native void nYGNodeSetChildren(long owner, long children, long count);

    /** Sets children according to the given list of nodes. */
    public static void YGNodeSetChildren(@NativeType("YGNodeRef") long owner, @NativeType("YGNodeRef const *") PointerBuffer children) {
        if (CHECKS) {
            check(owner);
        }
        nYGNodeSetChildren(owner, memAddress(children), children.remaining());
    }

    // --- [ YGNodeGetChild ] ---

    /** Unsafe version of: {@link #YGNodeGetChild NodeGetChild} */
    public static native long nYGNodeGetChild(long node, long index);

    /** Get the child node at a given index. */
    @NativeType("YGNodeRef")
    public static long YGNodeGetChild(@NativeType("YGNodeRef") long node, @NativeType("size_t") long index) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetChild(node, index);
    }

    // --- [ YGNodeGetChildCount ] ---

    /** Unsafe version of: {@link #YGNodeGetChildCount NodeGetChildCount} */
    public static native long nYGNodeGetChildCount(long node);

    /** The number of child nodes. */
    @NativeType("size_t")
    public static long YGNodeGetChildCount(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetChildCount(node);
    }

    // --- [ YGNodeGetOwner ] ---

    /** Unsafe version of: {@link #YGNodeGetOwner NodeGetOwner} */
    public static native long nYGNodeGetOwner(long node);

    /** Get the parent/owner currently set for a node. */
    @NativeType("YGNodeRef")
    public static long YGNodeGetOwner(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetOwner(node);
    }

    // --- [ YGNodeGetParent ] ---

    /** Unsafe version of: {@link #YGNodeGetParent NodeGetParent} */
    public static native long nYGNodeGetParent(long node);

    /** Get the parent/owner currently set for a node. */
    @NativeType("YGNodeRef")
    public static long YGNodeGetParent(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetParent(node);
    }

    // --- [ YGNodeSetConfig ] ---

    /** Unsafe version of: {@link #YGNodeSetConfig NodeSetConfig} */
    public static native void nYGNodeSetConfig(long node, long config);

    /** Set a new config for the node after creation. */
    public static void YGNodeSetConfig(@NativeType("YGNodeRef") long node, @NativeType("YGConfigRef") long config) {
        if (CHECKS) {
            check(node);
            check(config);
        }
        nYGNodeSetConfig(node, config);
    }

    // --- [ YGNodeGetConfig ] ---

    /** Unsafe version of: {@link #YGNodeGetConfig NodeGetConfig} */
    public static native long nYGNodeGetConfig(long node);

    /** Get the config currently set on the node. */
    @NativeType("YGConfigRef")
    public static long YGNodeGetConfig(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetConfig(node);
    }

    // --- [ YGNodeSetContext ] ---

    /** Unsafe version of: {@link #YGNodeSetContext NodeSetContext} */
    public static native void nYGNodeSetContext(long node, long context);

    /** Sets extra data on the Yoga node which may be read from during callbacks. */
    public static void YGNodeSetContext(@NativeType("YGNodeRef") long node, @NativeType("void *") long context) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetContext(node, context);
    }

    // --- [ YGNodeGetContext ] ---

    /** Unsafe version of: {@link #YGNodeGetContext NodeGetContext} */
    public static native long nYGNodeGetContext(long node);

    /** Returns the context or {@code NULL} if no context has been set. */
    @NativeType("void *")
    public static long YGNodeGetContext(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetContext(node);
    }

    // --- [ YGNodeSetMeasureFunc ] ---

    /** Unsafe version of: {@link #YGNodeSetMeasureFunc NodeSetMeasureFunc} */
    public static native void nYGNodeSetMeasureFunc(long node, long measureFunc);

    /**
     * Allows providing custom measurements for a Yoga leaf node (usually for measuring text).
     * 
     * <p>{@link #YGNodeMarkDirty NodeMarkDirty} must be set if content effecting the measurements of the node changes.</p>
     */
    public static void YGNodeSetMeasureFunc(@NativeType("YGNodeRef") long node, @NativeType("YGMeasureFunc") @Nullable YGMeasureFuncI measureFunc) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetMeasureFunc(node, memAddressSafe(measureFunc));
    }

    // --- [ YGNodeHasMeasureFunc ] ---

    /** Unsafe version of: {@link #YGNodeHasMeasureFunc NodeHasMeasureFunc} */
    public static native boolean nYGNodeHasMeasureFunc(long node);

    /** Whether a measure function is set. */
    @NativeType("bool")
    public static boolean YGNodeHasMeasureFunc(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeHasMeasureFunc(node);
    }

    // --- [ YGNodeSetBaselineFunc ] ---

    /** Unsafe version of: {@link #YGNodeSetBaselineFunc NodeSetBaselineFunc} */
    public static native void nYGNodeSetBaselineFunc(long node, long baselineFunc);

    /** Set a custom function for determining the text baseline for use in baseline alignment. */
    public static void YGNodeSetBaselineFunc(@NativeType("YGNodeRef") long node, @NativeType("YGBaselineFunc") @Nullable YGBaselineFuncI baselineFunc) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetBaselineFunc(node, memAddressSafe(baselineFunc));
    }

    // --- [ YGNodeHasBaselineFunc ] ---

    /** Unsafe version of: {@link #YGNodeHasBaselineFunc NodeHasBaselineFunc} */
    public static native boolean nYGNodeHasBaselineFunc(long node);

    /** Whether a baseline function is set. */
    @NativeType("bool")
    public static boolean YGNodeHasBaselineFunc(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeHasBaselineFunc(node);
    }

    // --- [ YGNodeSetIsReferenceBaseline ] ---

    /** Unsafe version of: {@link #YGNodeSetIsReferenceBaseline NodeSetIsReferenceBaseline} */
    public static native void nYGNodeSetIsReferenceBaseline(long node, boolean isReferenceBaseline);

    /** Sets this node should be considered the reference baseline among siblings. */
    public static void YGNodeSetIsReferenceBaseline(@NativeType("YGNodeRef") long node, @NativeType("bool") boolean isReferenceBaseline) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetIsReferenceBaseline(node, isReferenceBaseline);
    }

    // --- [ YGNodeIsReferenceBaseline ] ---

    /** Unsafe version of: {@link #YGNodeIsReferenceBaseline NodeIsReferenceBaseline} */
    public static native boolean nYGNodeIsReferenceBaseline(long node);

    /** Whether this node is set as the reference baseline. */
    @NativeType("bool")
    public static boolean YGNodeIsReferenceBaseline(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeIsReferenceBaseline(node);
    }

    // --- [ YGNodeSetNodeType ] ---

    /** Unsafe version of: {@link #YGNodeSetNodeType NodeSetNodeType} */
    public static native void nYGNodeSetNodeType(long node, int nodeType);

    /** Sets whether a leaf node's layout results may be truncated during layout rounding. */
    public static void YGNodeSetNodeType(@NativeType("YGNodeRef") long node, @NativeType("YGNodeType") int nodeType) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetNodeType(node, nodeType);
    }

    // --- [ YGNodeGetNodeType ] ---

    /** Unsafe version of: {@link #YGNodeGetNodeType NodeGetNodeType} */
    public static native int nYGNodeGetNodeType(long node);

    /** Whether a leaf node's layout results may be truncated during layout rounding. */
    @NativeType("YGNodeType")
    public static int YGNodeGetNodeType(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetNodeType(node);
    }

    // --- [ YGNodeSetAlwaysFormsContainingBlock ] ---

    /** Unsafe version of: {@link #YGNodeSetAlwaysFormsContainingBlock NodeSetAlwaysFormsContainingBlock} */
    public static native void nYGNodeSetAlwaysFormsContainingBlock(long node, boolean alwaysFormsContainingBlock);

    /**
     * Make it so that this node will always form a containing block for any descendant nodes.
     * 
     * <p>This is useful for when a node has a property outside of Yoga that will form a containing block. For example, transforms or some of the others listed
     * in <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/Containing_block">Layout and the containing block</a>.</p>
     */
    public static void YGNodeSetAlwaysFormsContainingBlock(@NativeType("YGNodeRef") long node, @NativeType("bool") boolean alwaysFormsContainingBlock) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetAlwaysFormsContainingBlock(node, alwaysFormsContainingBlock);
    }

    // --- [ YGNodeGetAlwaysFormsContainingBlock ] ---

    /** Unsafe version of: {@link #YGNodeGetAlwaysFormsContainingBlock NodeGetAlwaysFormsContainingBlock} */
    public static native boolean nYGNodeGetAlwaysFormsContainingBlock(long node);

    /**
     * Whether the node will always form a containing block for any descendant.
     * 
     * <p>This can happen in situation where the client implements something like a transform that can affect containing blocks but is not handled by Yoga
     * directly.</p>
     */
    @NativeType("bool")
    public static boolean YGNodeGetAlwaysFormsContainingBlock(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetAlwaysFormsContainingBlock(node);
    }

    // --- [ YGNodeLayoutGetLeft ] ---

    public static native float nYGNodeLayoutGetLeft(long node);

    public static float YGNodeLayoutGetLeft(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetLeft(node);
    }

    // --- [ YGNodeLayoutGetTop ] ---

    public static native float nYGNodeLayoutGetTop(long node);

    public static float YGNodeLayoutGetTop(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetTop(node);
    }

    // --- [ YGNodeLayoutGetRight ] ---

    public static native float nYGNodeLayoutGetRight(long node);

    public static float YGNodeLayoutGetRight(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetRight(node);
    }

    // --- [ YGNodeLayoutGetBottom ] ---

    public static native float nYGNodeLayoutGetBottom(long node);

    public static float YGNodeLayoutGetBottom(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetBottom(node);
    }

    // --- [ YGNodeLayoutGetWidth ] ---

    public static native float nYGNodeLayoutGetWidth(long node);

    public static float YGNodeLayoutGetWidth(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetWidth(node);
    }

    // --- [ YGNodeLayoutGetHeight ] ---

    public static native float nYGNodeLayoutGetHeight(long node);

    public static float YGNodeLayoutGetHeight(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetHeight(node);
    }

    // --- [ YGNodeLayoutGetDirection ] ---

    public static native int nYGNodeLayoutGetDirection(long node);

    @NativeType("YGDirection")
    public static int YGNodeLayoutGetDirection(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetDirection(node);
    }

    // --- [ YGNodeLayoutGetHadOverflow ] ---

    public static native boolean nYGNodeLayoutGetHadOverflow(long node);

    @NativeType("bool")
    public static boolean YGNodeLayoutGetHadOverflow(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetHadOverflow(node);
    }

    // --- [ YGNodeLayoutGetMargin ] ---

    /** Unsafe version of: {@link #YGNodeLayoutGetMargin NodeLayoutGetMargin} */
    public static native float nYGNodeLayoutGetMargin(long node, int edge);

    /**
     * Gets the computed value for these nodess after performing layout.
     * 
     * <p>If they were set using point values then the returned value will be the same as {@link #YGNodeStyleGetMargin NodeStyleGetMargin}). However if they were set using a percentage
     * value then the returned value is the computed value used during layout.</p>
     *
     * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     */
    public static float YGNodeLayoutGetMargin(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetMargin(node, edge);
    }

    // --- [ YGNodeLayoutGetBorder ] ---

    /** Unsafe version of: {@link #YGNodeLayoutGetBorder NodeLayoutGetBorder} */
    public static native float nYGNodeLayoutGetBorder(long node, int edge);

    /**
     * Gets the computed value for these nodes after performing layout.
     * 
     * <p>If they were set using point values then the returned value will be the same as {@link #YGNodeStyleGetBorder NodeStyleGetBorder}. However if they were set using a percentage
     * value then the returned value is the computed value used during layout.</p>
     *
     * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     */
    public static float YGNodeLayoutGetBorder(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetBorder(node, edge);
    }

    // --- [ YGNodeLayoutGetPadding ] ---

    /** Unsafe version of: {@link #YGNodeLayoutGetPadding NodeLayoutGetPadding} */
    public static native float nYGNodeLayoutGetPadding(long node, int edge);

    /**
     * Gets the computed value for these nodes after performing layout.
     * 
     * <p>If they were set using point values then the returned value will be the same as {@link #YGNodeStyleGetPadding NodeStyleGetPadding}. However if they were set using a percentage
     * value then the returned value is the computed value used during layout.</p>
     *
     * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
     */
    public static float YGNodeLayoutGetPadding(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetPadding(node, edge);
    }

    // --- [ YGNodeCopyStyle ] ---

    public static native void nYGNodeCopyStyle(long dstNode, long srcNode);

    public static void YGNodeCopyStyle(@NativeType("YGNodeRef") long dstNode, @NativeType("YGNodeConstRef") long srcNode) {
        if (CHECKS) {
            check(dstNode);
            check(srcNode);
        }
        nYGNodeCopyStyle(dstNode, srcNode);
    }

    // --- [ YGNodeStyleSetDirection ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetDirection NodeStyleSetDirection} */
    public static native void nYGNodeStyleSetDirection(long node, int direction);

    /** @param direction one of:<br><table><tr><td>{@link #YGDirectionInherit DirectionInherit}</td><td>{@link #YGDirectionLTR DirectionLTR}</td><td>{@link #YGDirectionRTL DirectionRTL}</td></tr></table> */
    public static void YGNodeStyleSetDirection(@NativeType("YGNodeRef") long node, @NativeType("YGDirection") int direction) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetDirection(node, direction);
    }

    // --- [ YGNodeStyleGetDirection ] ---

    public static native int nYGNodeStyleGetDirection(long node);

    @NativeType("YGDirection")
    public static int YGNodeStyleGetDirection(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetDirection(node);
    }

    // --- [ YGNodeStyleSetFlexDirection ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetFlexDirection NodeStyleSetFlexDirection} */
    public static native void nYGNodeStyleSetFlexDirection(long node, int flexDirection);

    /** @param flexDirection one of:<br><table><tr><td>{@link #YGFlexDirectionColumn FlexDirectionColumn}</td><td>{@link #YGFlexDirectionColumnReverse FlexDirectionColumnReverse}</td><td>{@link #YGFlexDirectionRow FlexDirectionRow}</td></tr><tr><td>{@link #YGFlexDirectionRowReverse FlexDirectionRowReverse}</td></tr></table> */
    public static void YGNodeStyleSetFlexDirection(@NativeType("YGNodeRef") long node, @NativeType("YGFlexDirection") int flexDirection) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexDirection(node, flexDirection);
    }

    // --- [ YGNodeStyleGetFlexDirection ] ---

    public static native int nYGNodeStyleGetFlexDirection(long node);

    @NativeType("YGFlexDirection")
    public static int YGNodeStyleGetFlexDirection(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexDirection(node);
    }

    // --- [ YGNodeStyleSetJustifyContent ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetJustifyContent NodeStyleSetJustifyContent} */
    public static native void nYGNodeStyleSetJustifyContent(long node, int justifyContent);

    /** @param justifyContent one of:<br><table><tr><td>{@link #YGJustifyFlexStart JustifyFlexStart}</td><td>{@link #YGJustifyCenter JustifyCenter}</td><td>{@link #YGJustifyFlexEnd JustifyFlexEnd}</td><td>{@link #YGJustifySpaceBetween JustifySpaceBetween}</td><td>{@link #YGJustifySpaceAround JustifySpaceAround}</td></tr><tr><td>{@link #YGJustifySpaceEvenly JustifySpaceEvenly}</td></tr></table> */
    public static void YGNodeStyleSetJustifyContent(@NativeType("YGNodeRef") long node, @NativeType("YGJustify") int justifyContent) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetJustifyContent(node, justifyContent);
    }

    // --- [ YGNodeStyleGetJustifyContent ] ---

    public static native int nYGNodeStyleGetJustifyContent(long node);

    @NativeType("YGJustify")
    public static int YGNodeStyleGetJustifyContent(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetJustifyContent(node);
    }

    // --- [ YGNodeStyleSetAlignContent ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetAlignContent NodeStyleSetAlignContent} */
    public static native void nYGNodeStyleSetAlignContent(long node, int alignContent);

    /** @param alignContent one of:<br><table><tr><td>{@link #YGAlignAuto AlignAuto}</td><td>{@link #YGAlignFlexStart AlignFlexStart}</td><td>{@link #YGAlignCenter AlignCenter}</td><td>{@link #YGAlignFlexEnd AlignFlexEnd}</td><td>{@link #YGAlignStretch AlignStretch}</td><td>{@link #YGAlignBaseline AlignBaseline}</td></tr><tr><td>{@link #YGAlignSpaceBetween AlignSpaceBetween}</td><td>{@link #YGAlignSpaceAround AlignSpaceAround}</td><td>{@link #YGAlignSpaceEvenly AlignSpaceEvenly}</td></tr></table> */
    public static void YGNodeStyleSetAlignContent(@NativeType("YGNodeRef") long node, @NativeType("YGAlign") int alignContent) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAlignContent(node, alignContent);
    }

    // --- [ YGNodeStyleGetAlignContent ] ---

    public static native int nYGNodeStyleGetAlignContent(long node);

    @NativeType("YGAlign")
    public static int YGNodeStyleGetAlignContent(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAlignContent(node);
    }

    // --- [ YGNodeStyleSetAlignItems ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetAlignItems NodeStyleSetAlignItems} */
    public static native void nYGNodeStyleSetAlignItems(long node, int alignItems);

    /** @param alignItems one of:<br><table><tr><td>{@link #YGAlignAuto AlignAuto}</td><td>{@link #YGAlignFlexStart AlignFlexStart}</td><td>{@link #YGAlignCenter AlignCenter}</td><td>{@link #YGAlignFlexEnd AlignFlexEnd}</td><td>{@link #YGAlignStretch AlignStretch}</td><td>{@link #YGAlignBaseline AlignBaseline}</td></tr><tr><td>{@link #YGAlignSpaceBetween AlignSpaceBetween}</td><td>{@link #YGAlignSpaceAround AlignSpaceAround}</td><td>{@link #YGAlignSpaceEvenly AlignSpaceEvenly}</td></tr></table> */
    public static void YGNodeStyleSetAlignItems(@NativeType("YGNodeRef") long node, @NativeType("YGAlign") int alignItems) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAlignItems(node, alignItems);
    }

    // --- [ YGNodeStyleGetAlignItems ] ---

    public static native int nYGNodeStyleGetAlignItems(long node);

    @NativeType("YGAlign")
    public static int YGNodeStyleGetAlignItems(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAlignItems(node);
    }

    // --- [ YGNodeStyleSetAlignSelf ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetAlignSelf NodeStyleSetAlignSelf} */
    public static native void nYGNodeStyleSetAlignSelf(long node, int alignSelf);

    /** @param alignSelf one of:<br><table><tr><td>{@link #YGAlignAuto AlignAuto}</td><td>{@link #YGAlignFlexStart AlignFlexStart}</td><td>{@link #YGAlignCenter AlignCenter}</td><td>{@link #YGAlignFlexEnd AlignFlexEnd}</td><td>{@link #YGAlignStretch AlignStretch}</td><td>{@link #YGAlignBaseline AlignBaseline}</td></tr><tr><td>{@link #YGAlignSpaceBetween AlignSpaceBetween}</td><td>{@link #YGAlignSpaceAround AlignSpaceAround}</td><td>{@link #YGAlignSpaceEvenly AlignSpaceEvenly}</td></tr></table> */
    public static void YGNodeStyleSetAlignSelf(@NativeType("YGNodeRef") long node, @NativeType("YGAlign") int alignSelf) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAlignSelf(node, alignSelf);
    }

    // --- [ YGNodeStyleGetAlignSelf ] ---

    public static native int nYGNodeStyleGetAlignSelf(long node);

    @NativeType("YGAlign")
    public static int YGNodeStyleGetAlignSelf(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAlignSelf(node);
    }

    // --- [ YGNodeStyleSetPositionType ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetPositionType NodeStyleSetPositionType} */
    public static native void nYGNodeStyleSetPositionType(long node, int positionType);

    /** @param positionType one of:<br><table><tr><td>{@link #YGPositionTypeStatic PositionTypeStatic}</td><td>{@link #YGPositionTypeRelative PositionTypeRelative}</td><td>{@link #YGPositionTypeAbsolute PositionTypeAbsolute}</td></tr></table> */
    public static void YGNodeStyleSetPositionType(@NativeType("YGNodeRef") long node, @NativeType("YGPositionType") int positionType) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPositionType(node, positionType);
    }

    // --- [ YGNodeStyleGetPositionType ] ---

    public static native int nYGNodeStyleGetPositionType(long node);

    @NativeType("YGPositionType")
    public static int YGNodeStyleGetPositionType(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetPositionType(node);
    }

    // --- [ YGNodeStyleSetFlexWrap ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetFlexWrap NodeStyleSetFlexWrap} */
    public static native void nYGNodeStyleSetFlexWrap(long node, int flexWrap);

    /** @param flexWrap one of:<br><table><tr><td>{@link #YGWrapNoWrap WrapNoWrap}</td><td>{@link #YGWrapWrap WrapWrap}</td><td>{@link #YGWrapReverse WrapReverse}</td></tr></table> */
    public static void YGNodeStyleSetFlexWrap(@NativeType("YGNodeRef") long node, @NativeType("YGWrap") int flexWrap) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexWrap(node, flexWrap);
    }

    // --- [ YGNodeStyleGetFlexWrap ] ---

    public static native int nYGNodeStyleGetFlexWrap(long node);

    @NativeType("YGWrap")
    public static int YGNodeStyleGetFlexWrap(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexWrap(node);
    }

    // --- [ YGNodeStyleSetOverflow ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetOverflow NodeStyleSetOverflow} */
    public static native void nYGNodeStyleSetOverflow(long node, int overflow);

    /** @param overflow one of:<br><table><tr><td>{@link #YGOverflowVisible OverflowVisible}</td><td>{@link #YGOverflowHidden OverflowHidden}</td><td>{@link #YGOverflowScroll OverflowScroll}</td></tr></table> */
    public static void YGNodeStyleSetOverflow(@NativeType("YGNodeRef") long node, @NativeType("YGOverflow") int overflow) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetOverflow(node, overflow);
    }

    // --- [ YGNodeStyleGetOverflow ] ---

    public static native int nYGNodeStyleGetOverflow(long node);

    @NativeType("YGOverflow")
    public static int YGNodeStyleGetOverflow(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetOverflow(node);
    }

    // --- [ YGNodeStyleSetDisplay ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetDisplay NodeStyleSetDisplay} */
    public static native void nYGNodeStyleSetDisplay(long node, int display);

    /** @param display one of:<br><table><tr><td>{@link #YGDisplayFlex DisplayFlex}</td><td>{@link #YGDisplayNone DisplayNone}</td></tr></table> */
    public static void YGNodeStyleSetDisplay(@NativeType("YGNodeRef") long node, @NativeType("YGDisplay") int display) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetDisplay(node, display);
    }

    // --- [ YGNodeStyleGetDisplay ] ---

    public static native int nYGNodeStyleGetDisplay(long node);

    @NativeType("YGDisplay")
    public static int YGNodeStyleGetDisplay(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetDisplay(node);
    }

    // --- [ YGNodeStyleSetFlex ] ---

    public static native void nYGNodeStyleSetFlex(long node, float flex);

    public static void YGNodeStyleSetFlex(@NativeType("YGNodeRef") long node, float flex) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlex(node, flex);
    }

    // --- [ YGNodeStyleGetFlex ] ---

    public static native float nYGNodeStyleGetFlex(long node);

    public static float YGNodeStyleGetFlex(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlex(node);
    }

    // --- [ YGNodeStyleSetFlexGrow ] ---

    public static native void nYGNodeStyleSetFlexGrow(long node, float flexGrow);

    public static void YGNodeStyleSetFlexGrow(@NativeType("YGNodeRef") long node, float flexGrow) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexGrow(node, flexGrow);
    }

    // --- [ YGNodeStyleGetFlexGrow ] ---

    public static native float nYGNodeStyleGetFlexGrow(long node);

    public static float YGNodeStyleGetFlexGrow(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexGrow(node);
    }

    // --- [ YGNodeStyleSetFlexShrink ] ---

    public static native void nYGNodeStyleSetFlexShrink(long node, float flexShrink);

    public static void YGNodeStyleSetFlexShrink(@NativeType("YGNodeRef") long node, float flexShrink) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexShrink(node, flexShrink);
    }

    // --- [ YGNodeStyleGetFlexShrink ] ---

    public static native float nYGNodeStyleGetFlexShrink(long node);

    public static float YGNodeStyleGetFlexShrink(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexShrink(node);
    }

    // --- [ YGNodeStyleSetFlexBasis ] ---

    public static native void nYGNodeStyleSetFlexBasis(long node, float flexBasis);

    public static void YGNodeStyleSetFlexBasis(@NativeType("YGNodeRef") long node, float flexBasis) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexBasis(node, flexBasis);
    }

    // --- [ YGNodeStyleSetFlexBasisPercent ] ---

    public static native void nYGNodeStyleSetFlexBasisPercent(long node, float flexBasis);

    public static void YGNodeStyleSetFlexBasisPercent(@NativeType("YGNodeRef") long node, float flexBasis) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexBasisPercent(node, flexBasis);
    }

    // --- [ YGNodeStyleSetFlexBasisAuto ] ---

    public static native void nYGNodeStyleSetFlexBasisAuto(long node);

    public static void YGNodeStyleSetFlexBasisAuto(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexBasisAuto(node);
    }

    // --- [ YGNodeStyleGetFlexBasis ] ---

    public static native void nYGNodeStyleGetFlexBasis(long node, long __result);

    public static YGValue YGNodeStyleGetFlexBasis(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetFlexBasis(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetPosition ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetPosition NodeStyleSetPosition} */
    public static native void nYGNodeStyleSetPosition(long node, int edge, float position);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static void YGNodeStyleSetPosition(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float position) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPosition(node, edge, position);
    }

    // --- [ YGNodeStyleSetPositionPercent ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetPositionPercent NodeStyleSetPositionPercent} */
    public static native void nYGNodeStyleSetPositionPercent(long node, int edge, float position);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static void YGNodeStyleSetPositionPercent(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float position) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPositionPercent(node, edge, position);
    }

    // --- [ YGNodeStyleGetPosition ] ---

    /** Unsafe version of: {@link #YGNodeStyleGetPosition NodeStyleGetPosition} */
    public static native void nYGNodeStyleGetPosition(long node, int edge, long __result);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static YGValue YGNodeStyleGetPosition(@NativeType("YGNodeConstRef") long node, @NativeType("YGEdge") int edge, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetPosition(node, edge, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMargin ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetMargin NodeStyleSetMargin} */
    public static native void nYGNodeStyleSetMargin(long node, int edge, float margin);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static void YGNodeStyleSetMargin(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float margin) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMargin(node, edge, margin);
    }

    // --- [ YGNodeStyleSetMarginPercent ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetMarginPercent NodeStyleSetMarginPercent} */
    public static native void nYGNodeStyleSetMarginPercent(long node, int edge, float margin);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static void YGNodeStyleSetMarginPercent(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float margin) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMarginPercent(node, edge, margin);
    }

    // --- [ YGNodeStyleSetMarginAuto ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetMarginAuto NodeStyleSetMarginAuto} */
    public static native void nYGNodeStyleSetMarginAuto(long node, int edge);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static void YGNodeStyleSetMarginAuto(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMarginAuto(node, edge);
    }

    // --- [ YGNodeStyleGetMargin ] ---

    /** Unsafe version of: {@link #YGNodeStyleGetMargin NodeStyleGetMargin} */
    public static native void nYGNodeStyleGetMargin(long node, int edge, long __result);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static YGValue YGNodeStyleGetMargin(@NativeType("YGNodeConstRef") long node, @NativeType("YGEdge") int edge, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMargin(node, edge, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetPadding ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetPadding NodeStyleSetPadding} */
    public static native void nYGNodeStyleSetPadding(long node, int edge, float padding);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static void YGNodeStyleSetPadding(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float padding) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPadding(node, edge, padding);
    }

    // --- [ YGNodeStyleSetPaddingPercent ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetPaddingPercent NodeStyleSetPaddingPercent} */
    public static native void nYGNodeStyleSetPaddingPercent(long node, int edge, float padding);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static void YGNodeStyleSetPaddingPercent(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float padding) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPaddingPercent(node, edge, padding);
    }

    // --- [ YGNodeStyleGetPadding ] ---

    /** Unsafe version of: {@link #YGNodeStyleGetPadding NodeStyleGetPadding} */
    public static native void nYGNodeStyleGetPadding(long node, int edge, long __result);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static YGValue YGNodeStyleGetPadding(@NativeType("YGNodeConstRef") long node, @NativeType("YGEdge") int edge, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetPadding(node, edge, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetBorder ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetBorder NodeStyleSetBorder} */
    public static native void nYGNodeStyleSetBorder(long node, int edge, float border);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static void YGNodeStyleSetBorder(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float border) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetBorder(node, edge, border);
    }

    // --- [ YGNodeStyleGetBorder ] ---

    /** Unsafe version of: {@link #YGNodeStyleGetBorder NodeStyleGetBorder} */
    public static native float nYGNodeStyleGetBorder(long node, int edge);

    /** @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    public static float YGNodeStyleGetBorder(@NativeType("YGNodeConstRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetBorder(node, edge);
    }

    // --- [ YGNodeStyleSetGap ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetGap NodeStyleSetGap} */
    public static native void nYGNodeStyleSetGap(long node, int gutter, float gapLength);

    /** @param gutter one of:<br><table><tr><td>{@link #YGGutterColumn GutterColumn}</td><td>{@link #YGGutterRow GutterRow}</td><td>{@link #YGGutterAll GutterAll}</td></tr></table> */
    public static void YGNodeStyleSetGap(@NativeType("YGNodeRef") long node, @NativeType("YGGutter") int gutter, float gapLength) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetGap(node, gutter, gapLength);
    }

    // --- [ YGNodeStyleSetGapPercent ] ---

    /** Unsafe version of: {@link #YGNodeStyleSetGapPercent NodeStyleSetGapPercent} */
    public static native void nYGNodeStyleSetGapPercent(long node, int gutter, float gapLength);

    /** @param gutter one of:<br><table><tr><td>{@link #YGGutterColumn GutterColumn}</td><td>{@link #YGGutterRow GutterRow}</td><td>{@link #YGGutterAll GutterAll}</td></tr></table> */
    public static void YGNodeStyleSetGapPercent(@NativeType("YGNodeRef") long node, @NativeType("YGGutter") int gutter, float gapLength) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetGapPercent(node, gutter, gapLength);
    }

    // --- [ YGNodeStyleGetGap ] ---

    /** Unsafe version of: {@link #YGNodeStyleGetGap NodeStyleGetGap} */
    public static native float nYGNodeStyleGetGap(long node, int gutter);

    /** @param gutter one of:<br><table><tr><td>{@link #YGGutterColumn GutterColumn}</td><td>{@link #YGGutterRow GutterRow}</td><td>{@link #YGGutterAll GutterAll}</td></tr></table> */
    public static float YGNodeStyleGetGap(@NativeType("YGNodeConstRef") long node, @NativeType("YGGutter") int gutter) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetGap(node, gutter);
    }

    // --- [ YGNodeStyleSetWidth ] ---

    public static native void nYGNodeStyleSetWidth(long node, float width);

    public static void YGNodeStyleSetWidth(@NativeType("YGNodeRef") long node, float width) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetWidth(node, width);
    }

    // --- [ YGNodeStyleSetWidthPercent ] ---

    public static native void nYGNodeStyleSetWidthPercent(long node, float width);

    public static void YGNodeStyleSetWidthPercent(@NativeType("YGNodeRef") long node, float width) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetWidthPercent(node, width);
    }

    // --- [ YGNodeStyleSetWidthAuto ] ---

    public static native void nYGNodeStyleSetWidthAuto(long node);

    public static void YGNodeStyleSetWidthAuto(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetWidthAuto(node);
    }

    // --- [ YGNodeStyleGetWidth ] ---

    public static native void nYGNodeStyleGetWidth(long node, long __result);

    public static YGValue YGNodeStyleGetWidth(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetWidth(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetHeight ] ---

    public static native void nYGNodeStyleSetHeight(long node, float height);

    public static void YGNodeStyleSetHeight(@NativeType("YGNodeRef") long node, float height) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetHeight(node, height);
    }

    // --- [ YGNodeStyleSetHeightPercent ] ---

    public static native void nYGNodeStyleSetHeightPercent(long node, float height);

    public static void YGNodeStyleSetHeightPercent(@NativeType("YGNodeRef") long node, float height) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetHeightPercent(node, height);
    }

    // --- [ YGNodeStyleSetHeightAuto ] ---

    public static native void nYGNodeStyleSetHeightAuto(long node);

    public static void YGNodeStyleSetHeightAuto(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetHeightAuto(node);
    }

    // --- [ YGNodeStyleGetHeight ] ---

    public static native void nYGNodeStyleGetHeight(long node, long __result);

    public static YGValue YGNodeStyleGetHeight(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetHeight(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMinWidth ] ---

    public static native void nYGNodeStyleSetMinWidth(long node, float minWidth);

    public static void YGNodeStyleSetMinWidth(@NativeType("YGNodeRef") long node, float minWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinWidth(node, minWidth);
    }

    // --- [ YGNodeStyleSetMinWidthPercent ] ---

    public static native void nYGNodeStyleSetMinWidthPercent(long node, float minWidth);

    public static void YGNodeStyleSetMinWidthPercent(@NativeType("YGNodeRef") long node, float minWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinWidthPercent(node, minWidth);
    }

    // --- [ YGNodeStyleGetMinWidth ] ---

    public static native void nYGNodeStyleGetMinWidth(long node, long __result);

    public static YGValue YGNodeStyleGetMinWidth(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMinWidth(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMinHeight ] ---

    public static native void nYGNodeStyleSetMinHeight(long node, float minHeight);

    public static void YGNodeStyleSetMinHeight(@NativeType("YGNodeRef") long node, float minHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinHeight(node, minHeight);
    }

    // --- [ YGNodeStyleSetMinHeightPercent ] ---

    public static native void nYGNodeStyleSetMinHeightPercent(long node, float minHeight);

    public static void YGNodeStyleSetMinHeightPercent(@NativeType("YGNodeRef") long node, float minHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinHeightPercent(node, minHeight);
    }

    // --- [ YGNodeStyleGetMinHeight ] ---

    public static native void nYGNodeStyleGetMinHeight(long node, long __result);

    public static YGValue YGNodeStyleGetMinHeight(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMinHeight(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMaxWidth ] ---

    public static native void nYGNodeStyleSetMaxWidth(long node, float maxWidth);

    public static void YGNodeStyleSetMaxWidth(@NativeType("YGNodeRef") long node, float maxWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxWidth(node, maxWidth);
    }

    // --- [ YGNodeStyleSetMaxWidthPercent ] ---

    public static native void nYGNodeStyleSetMaxWidthPercent(long node, float maxWidth);

    public static void YGNodeStyleSetMaxWidthPercent(@NativeType("YGNodeRef") long node, float maxWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxWidthPercent(node, maxWidth);
    }

    // --- [ YGNodeStyleGetMaxWidth ] ---

    public static native void nYGNodeStyleGetMaxWidth(long node, long __result);

    public static YGValue YGNodeStyleGetMaxWidth(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMaxWidth(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMaxHeight ] ---

    public static native void nYGNodeStyleSetMaxHeight(long node, float maxHeight);

    public static void YGNodeStyleSetMaxHeight(@NativeType("YGNodeRef") long node, float maxHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxHeight(node, maxHeight);
    }

    // --- [ YGNodeStyleSetMaxHeightPercent ] ---

    public static native void nYGNodeStyleSetMaxHeightPercent(long node, float maxHeight);

    public static void YGNodeStyleSetMaxHeightPercent(@NativeType("YGNodeRef") long node, float maxHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxHeightPercent(node, maxHeight);
    }

    // --- [ YGNodeStyleGetMaxHeight ] ---

    public static native void nYGNodeStyleGetMaxHeight(long node, long __result);

    public static YGValue YGNodeStyleGetMaxHeight(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMaxHeight(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetAspectRatio ] ---

    public static native void nYGNodeStyleSetAspectRatio(long node, float aspectRatio);

    public static void YGNodeStyleSetAspectRatio(@NativeType("YGNodeRef") long node, float aspectRatio) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAspectRatio(node, aspectRatio);
    }

    // --- [ YGNodeStyleGetAspectRatio ] ---

    public static native float nYGNodeStyleGetAspectRatio(long node);

    public static float YGNodeStyleGetAspectRatio(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAspectRatio(node);
    }

    // --- [ YGRoundValueToPixelGrid ] ---

    /**
     * Rounds a point value to the nearest whole pixel, given a {@code pointScaleFactor} describing pixel density.
     *
     * @return the rounded value in points
     */
    public static native float YGRoundValueToPixelGrid(double value, double pointScaleFactor, @NativeType("bool") boolean forceCeil, @NativeType("bool") boolean forceFloor);

    // --- [ YGValueAuto ] ---

    private static native void nYGValueAuto(long __result);

    private static YGValue YGValueAuto(YGValue __result) {
        nYGValueAuto(__result.address());
        return __result;
    }

    /** Constant for a dimension of "auto". */
    public static final YGValue YGValueAuto = YGValueAuto(YGValue.create());

    // --- [ YGValueUndefined ] ---

    private static native void nYGValueUndefined(long __result);

    private static YGValue YGValueUndefined(YGValue __result) {
        nYGValueUndefined(__result.address());
        return __result;
    }

    /** Constant for a dimension which is not defined. */
    public static final YGValue YGValueUndefined = YGValueUndefined(YGValue.create());

    // --- [ YGValueZero ] ---

    private static native void nYGValueZero(long __result);

    private static YGValue YGValueZero(YGValue __result) {
        nYGValueZero(__result.address());
        return __result;
    }

    /** Constant for a dimension that is zero-length. */
    public static final YGValue YGValueZero = YGValueZero(YGValue.create());

    // --- [ YGFloatIsUndefined ] ---

    /** Whether a dimension represented as a float is defined. */
    @NativeType("bool")
    public static native boolean YGFloatIsUndefined(float value);

    // --- [ YGAlignToString ] ---

    /** Unsafe version of: {@link #YGAlignToString AlignToString} */
    public static native long nYGAlignToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGAlignAuto AlignAuto}</td><td>{@link #YGAlignFlexStart AlignFlexStart}</td><td>{@link #YGAlignCenter AlignCenter}</td><td>{@link #YGAlignFlexEnd AlignFlexEnd}</td><td>{@link #YGAlignStretch AlignStretch}</td><td>{@link #YGAlignBaseline AlignBaseline}</td></tr><tr><td>{@link #YGAlignSpaceBetween AlignSpaceBetween}</td><td>{@link #YGAlignSpaceAround AlignSpaceAround}</td><td>{@link #YGAlignSpaceEvenly AlignSpaceEvenly}</td></tr></table> */
    @NativeType("char const *")
    public static String YGAlignToString(@NativeType("YGAlign") int value) {
        long __result = nYGAlignToString(value);
        return memASCII(__result);
    }

    // --- [ YGDimensionToString ] ---

    /** Unsafe version of: {@link #YGDimensionToString DimensionToString} */
    public static native long nYGDimensionToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGDimensionWidth DimensionWidth}</td><td>{@link #YGDimensionHeight DimensionHeight}</td></tr></table> */
    @NativeType("char const *")
    public static String YGDimensionToString(@NativeType("YGDimension") int value) {
        long __result = nYGDimensionToString(value);
        return memASCII(__result);
    }

    // --- [ YGDirectionToString ] ---

    /** Unsafe version of: {@link #YGDirectionToString DirectionToString} */
    public static native long nYGDirectionToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGDirectionInherit DirectionInherit}</td><td>{@link #YGDirectionLTR DirectionLTR}</td><td>{@link #YGDirectionRTL DirectionRTL}</td></tr></table> */
    @NativeType("char const *")
    public static String YGDirectionToString(@NativeType("YGDirection") int value) {
        long __result = nYGDirectionToString(value);
        return memASCII(__result);
    }

    // --- [ YGDisplayToString ] ---

    /** Unsafe version of: {@link #YGDisplayToString DisplayToString} */
    public static native long nYGDisplayToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGDisplayFlex DisplayFlex}</td><td>{@link #YGDisplayNone DisplayNone}</td></tr></table> */
    @NativeType("char const *")
    public static String YGDisplayToString(@NativeType("YGDisplay") int value) {
        long __result = nYGDisplayToString(value);
        return memASCII(__result);
    }

    // --- [ YGEdgeToString ] ---

    /** Unsafe version of: {@link #YGEdgeToString EdgeToString} */
    public static native long nYGEdgeToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table> */
    @NativeType("char const *")
    public static String YGEdgeToString(@NativeType("YGEdge") int value) {
        long __result = nYGEdgeToString(value);
        return memASCII(__result);
    }

    // --- [ YGErrataToString ] ---

    /** Unsafe version of: {@link #YGErrataToString ErrataToString} */
    public static native long nYGErrataToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGErrataNone ErrataNone}</td><td>{@link #YGErrataStretchFlexBasis ErrataStretchFlexBasis}</td><td>{@link #YGErrataAbsolutePositioningIncorrect ErrataAbsolutePositioningIncorrect}</td></tr><tr><td>{@link #YGErrataAbsolutePercentAgainstInnerSize ErrataAbsolutePercentAgainstInnerSize}</td><td>{@link #YGErrataAll ErrataAll}</td><td>{@link #YGErrataClassic ErrataClassic}</td></tr></table> */
    @NativeType("char const *")
    public static String YGErrataToString(@NativeType("YGErrata") int value) {
        long __result = nYGErrataToString(value);
        return memASCII(__result);
    }

    // --- [ YGExperimentalFeatureToString ] ---

    /** Unsafe version of: {@link #YGExperimentalFeatureToString ExperimentalFeatureToString} */
    public static native long nYGExperimentalFeatureToString(int value);

    /** @param value must be:<br><table><tr><td>{@link #YGExperimentalFeatureWebFlexBasis ExperimentalFeatureWebFlexBasis}</td></tr></table> */
    @NativeType("char const *")
    public static String YGExperimentalFeatureToString(@NativeType("YGExperimentalFeature") int value) {
        long __result = nYGExperimentalFeatureToString(value);
        return memASCII(__result);
    }

    // --- [ YGFlexDirectionToString ] ---

    /** Unsafe version of: {@link #YGFlexDirectionToString FlexDirectionToString} */
    public static native long nYGFlexDirectionToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGFlexDirectionColumn FlexDirectionColumn}</td><td>{@link #YGFlexDirectionColumnReverse FlexDirectionColumnReverse}</td><td>{@link #YGFlexDirectionRow FlexDirectionRow}</td></tr><tr><td>{@link #YGFlexDirectionRowReverse FlexDirectionRowReverse}</td></tr></table> */
    @NativeType("char const *")
    public static String YGFlexDirectionToString(@NativeType("YGFlexDirection") int value) {
        long __result = nYGFlexDirectionToString(value);
        return memASCII(__result);
    }

    // --- [ YGGutterToString ] ---

    /** Unsafe version of: {@link #YGGutterToString GutterToString} */
    public static native long nYGGutterToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGGutterColumn GutterColumn}</td><td>{@link #YGGutterRow GutterRow}</td><td>{@link #YGGutterAll GutterAll}</td></tr></table> */
    @NativeType("char const *")
    public static String YGGutterToString(@NativeType("YGGutter") int value) {
        long __result = nYGGutterToString(value);
        return memASCII(__result);
    }

    // --- [ YGJustifyToString ] ---

    /** Unsafe version of: {@link #YGJustifyToString JustifyToString} */
    public static native long nYGJustifyToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGJustifyFlexStart JustifyFlexStart}</td><td>{@link #YGJustifyCenter JustifyCenter}</td><td>{@link #YGJustifyFlexEnd JustifyFlexEnd}</td><td>{@link #YGJustifySpaceBetween JustifySpaceBetween}</td><td>{@link #YGJustifySpaceAround JustifySpaceAround}</td></tr><tr><td>{@link #YGJustifySpaceEvenly JustifySpaceEvenly}</td></tr></table> */
    @NativeType("char const *")
    public static String YGJustifyToString(@NativeType("YGJustify") int value) {
        long __result = nYGJustifyToString(value);
        return memASCII(__result);
    }

    // --- [ YGLogLevelToString ] ---

    /** Unsafe version of: {@link #YGLogLevelToString LogLevelToString} */
    public static native long nYGLogLevelToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGLogLevelError LogLevelError}</td><td>{@link #YGLogLevelWarn LogLevelWarn}</td><td>{@link #YGLogLevelInfo LogLevelInfo}</td><td>{@link #YGLogLevelDebug LogLevelDebug}</td><td>{@link #YGLogLevelVerbose LogLevelVerbose}</td><td>{@link #YGLogLevelFatal LogLevelFatal}</td></tr></table> */
    @NativeType("char const *")
    public static String YGLogLevelToString(@NativeType("YGLogLevel") int value) {
        long __result = nYGLogLevelToString(value);
        return memASCII(__result);
    }

    // --- [ YGMeasureModeToString ] ---

    /** Unsafe version of: {@link #YGMeasureModeToString MeasureModeToString} */
    public static native long nYGMeasureModeToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGMeasureModeUndefined MeasureModeUndefined}</td><td>{@link #YGMeasureModeExactly MeasureModeExactly}</td><td>{@link #YGMeasureModeAtMost MeasureModeAtMost}</td></tr></table> */
    @NativeType("char const *")
    public static String YGMeasureModeToString(@NativeType("YGMeasureMode") int value) {
        long __result = nYGMeasureModeToString(value);
        return memASCII(__result);
    }

    // --- [ YGNodeTypeToString ] ---

    /** Unsafe version of: {@link #YGNodeTypeToString NodeTypeToString} */
    public static native long nYGNodeTypeToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGNodeTypeDefault NodeTypeDefault}</td><td>{@link #YGNodeTypeText NodeTypeText}</td></tr></table> */
    @NativeType("char const *")
    public static String YGNodeTypeToString(@NativeType("YGNodeType") int value) {
        long __result = nYGNodeTypeToString(value);
        return memASCII(__result);
    }

    // --- [ YGOverflowToString ] ---

    /** Unsafe version of: {@link #YGOverflowToString OverflowToString} */
    public static native long nYGOverflowToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGOverflowVisible OverflowVisible}</td><td>{@link #YGOverflowHidden OverflowHidden}</td><td>{@link #YGOverflowScroll OverflowScroll}</td></tr></table> */
    @NativeType("char const *")
    public static String YGOverflowToString(@NativeType("YGOverflow") int value) {
        long __result = nYGOverflowToString(value);
        return memASCII(__result);
    }

    // --- [ YGPositionTypeToString ] ---

    /** Unsafe version of: {@link #YGPositionTypeToString PositionTypeToString} */
    public static native long nYGPositionTypeToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGPositionTypeStatic PositionTypeStatic}</td><td>{@link #YGPositionTypeRelative PositionTypeRelative}</td><td>{@link #YGPositionTypeAbsolute PositionTypeAbsolute}</td></tr></table> */
    @NativeType("char const *")
    public static String YGPositionTypeToString(@NativeType("YGPositionType") int value) {
        long __result = nYGPositionTypeToString(value);
        return memASCII(__result);
    }

    // --- [ YGUnitToString ] ---

    /** Unsafe version of: {@link #YGUnitToString UnitToString} */
    public static native long nYGUnitToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGUnitUndefined UnitUndefined}</td><td>{@link #YGUnitPoint UnitPoint}</td><td>{@link #YGUnitPercent UnitPercent}</td><td>{@link #YGUnitAuto UnitAuto}</td></tr></table> */
    @NativeType("char const *")
    public static String YGUnitToString(@NativeType("YGUnit") int value) {
        long __result = nYGUnitToString(value);
        return memASCII(__result);
    }

    // --- [ YGWrapToString ] ---

    /** Unsafe version of: {@link #YGWrapToString WrapToString} */
    public static native long nYGWrapToString(int value);

    /** @param value one of:<br><table><tr><td>{@link #YGWrapNoWrap WrapNoWrap}</td><td>{@link #YGWrapWrap WrapWrap}</td><td>{@link #YGWrapReverse WrapReverse}</td></tr></table> */
    @NativeType("char const *")
    public static String YGWrapToString(@NativeType("YGWrap") int value) {
        long __result = nYGWrapToString(value);
        return memASCII(__result);
    }

}