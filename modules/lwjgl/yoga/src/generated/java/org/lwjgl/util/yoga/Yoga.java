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

public class Yoga {

    static { LibYoga.initialize(); }

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

    public static final int
        YGBoxSizingBorderBox  = 0,
        YGBoxSizingContentBox = 1;

    public static final int
        YGDimensionWidth  = 0,
        YGDimensionHeight = 1;

    public static final int
        YGDirectionInherit = 0,
        YGDirectionLTR     = 1,
        YGDirectionRTL     = 2;

    public static final int
        YGDisplayFlex     = 0,
        YGDisplayNone     = 1,
        YGDisplayContents = 2;

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

    public static final int
        YGErrataNone                                         = 0,
        YGErrataStretchFlexBasis                             = 1,
        YGErrataAbsolutePositionWithoutInsetsExcludesPadding = 2,
        YGErrataAbsolutePercentAgainstInnerSize              = 4,
        YGErrataAll                                          = 2147483647,
        YGErrataClassic                                      = 2147483646;

    public static final int YGExperimentalFeatureWebFlexBasis = 0;

    public static final int
        YGFlexDirectionColumn        = 0,
        YGFlexDirectionColumnReverse = 1,
        YGFlexDirectionRow           = 2,
        YGFlexDirectionRowReverse    = 3;

    public static final int
        YGGutterColumn = 0,
        YGGutterRow    = 1,
        YGGutterAll    = 2;

    public static final int
        YGJustifyFlexStart    = 0,
        YGJustifyCenter       = 1,
        YGJustifyFlexEnd      = 2,
        YGJustifySpaceBetween = 3,
        YGJustifySpaceAround  = 4,
        YGJustifySpaceEvenly  = 5;

    public static final int
        YGLogLevelError   = 0,
        YGLogLevelWarn    = 1,
        YGLogLevelInfo    = 2,
        YGLogLevelDebug   = 3,
        YGLogLevelVerbose = 4,
        YGLogLevelFatal   = 5;

    public static final int
        YGMeasureModeUndefined = 0,
        YGMeasureModeExactly   = 1,
        YGMeasureModeAtMost    = 2;

    public static final int
        YGNodeTypeDefault = 0,
        YGNodeTypeText    = 1;

    public static final int
        YGOverflowVisible = 0,
        YGOverflowHidden  = 1,
        YGOverflowScroll  = 2;

    public static final int
        YGPositionTypeStatic   = 0,
        YGPositionTypeRelative = 1,
        YGPositionTypeAbsolute = 2;

    public static final int
        YGUnitUndefined = 0,
        YGUnitPoint     = 1,
        YGUnitPercent   = 2,
        YGUnitAuto      = 3;

    public static final int
        YGWrapNoWrap  = 0,
        YGWrapWrap    = 1,
        YGWrapReverse = 2;

    public static final float YGUndefined = Float.NaN;

    protected Yoga() {
        throw new UnsupportedOperationException();
    }

    // --- [ YGConfigNew ] ---

    /** {@code YGConfigRef YGConfigNew(void)} */
    @NativeType("YGConfigRef")
    public static native long YGConfigNew();

    // --- [ YGConfigFree ] ---

    /** {@code void YGConfigFree(YGConfigRef config)} */
    public static native void nYGConfigFree(long config);

    /** {@code void YGConfigFree(YGConfigRef config)} */
    public static void YGConfigFree(@NativeType("YGConfigRef") long config) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigFree(config);
    }

    // --- [ YGConfigGetDefault ] ---

    /** {@code YGConfigConstRef YGConfigGetDefault(void)} */
    @NativeType("YGConfigConstRef")
    public static native long YGConfigGetDefault();

    // --- [ YGConfigSetUseWebDefaults ] ---

    /** {@code void YGConfigSetUseWebDefaults(YGConfigRef config, bool enabled)} */
    public static native void nYGConfigSetUseWebDefaults(long config, boolean enabled);

    /** {@code void YGConfigSetUseWebDefaults(YGConfigRef config, bool enabled)} */
    public static void YGConfigSetUseWebDefaults(@NativeType("YGConfigRef") long config, @NativeType("bool") boolean enabled) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetUseWebDefaults(config, enabled);
    }

    // --- [ YGConfigGetUseWebDefaults ] ---

    /** {@code bool YGConfigGetUseWebDefaults(YGConfigConstRef config)} */
    public static native boolean nYGConfigGetUseWebDefaults(long config);

    /** {@code bool YGConfigGetUseWebDefaults(YGConfigConstRef config)} */
    @NativeType("bool")
    public static boolean YGConfigGetUseWebDefaults(@NativeType("YGConfigConstRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigGetUseWebDefaults(config);
    }

    // --- [ YGConfigSetPointScaleFactor ] ---

    /** {@code void YGConfigSetPointScaleFactor(YGConfigRef config, float pixelsInPoint)} */
    public static native void nYGConfigSetPointScaleFactor(long config, float pixelsInPoint);

    /** {@code void YGConfigSetPointScaleFactor(YGConfigRef config, float pixelsInPoint)} */
    public static void YGConfigSetPointScaleFactor(@NativeType("YGConfigRef") long config, float pixelsInPoint) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetPointScaleFactor(config, pixelsInPoint);
    }

    // --- [ YGConfigGetPointScaleFactor ] ---

    /** {@code float YGConfigGetPointScaleFactor(YGConfigConstRef config)} */
    public static native float nYGConfigGetPointScaleFactor(long config);

    /** {@code float YGConfigGetPointScaleFactor(YGConfigConstRef config)} */
    public static float YGConfigGetPointScaleFactor(@NativeType("YGConfigConstRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigGetPointScaleFactor(config);
    }

    // --- [ YGConfigSetErrata ] ---

    /** {@code void YGConfigSetErrata(YGConfigRef config, YGErrata errata)} */
    public static native void nYGConfigSetErrata(long config, int errata);

    /** {@code void YGConfigSetErrata(YGConfigRef config, YGErrata errata)} */
    public static void YGConfigSetErrata(@NativeType("YGConfigRef") long config, @NativeType("YGErrata") int errata) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetErrata(config, errata);
    }

    // --- [ YGConfigGetErrata ] ---

    /** {@code YGErrata YGConfigGetErrata(YGConfigConstRef config)} */
    public static native int nYGConfigGetErrata(long config);

    /** {@code YGErrata YGConfigGetErrata(YGConfigConstRef config)} */
    @NativeType("YGErrata")
    public static int YGConfigGetErrata(@NativeType("YGConfigConstRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigGetErrata(config);
    }

    // --- [ YGConfigSetLogger ] ---

    /** {@code void YGConfigSetLogger(YGConfigRef config, YGLogger logger)} */
    public static native void nYGConfigSetLogger(long config, long logger);

    /** {@code void YGConfigSetLogger(YGConfigRef config, YGLogger logger)} */
    public static void YGConfigSetLogger(@NativeType("YGConfigRef") long config, @NativeType("YGLogger") @Nullable YGLoggerI logger) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetLogger(config, memAddressSafe(logger));
    }

    // --- [ YGConfigSetContext ] ---

    /** {@code void YGConfigSetContext(YGConfigRef config, void * context)} */
    public static native void nYGConfigSetContext(long config, long context);

    /** {@code void YGConfigSetContext(YGConfigRef config, void * context)} */
    public static void YGConfigSetContext(@NativeType("YGConfigRef") long config, @NativeType("void *") long context) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetContext(config, context);
    }

    // --- [ YGConfigGetContext ] ---

    /** {@code void * YGConfigGetContext(YGConfigConstRef config)} */
    public static native long nYGConfigGetContext(long config);

    /** {@code void * YGConfigGetContext(YGConfigConstRef config)} */
    @NativeType("void *")
    public static long YGConfigGetContext(@NativeType("YGConfigConstRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigGetContext(config);
    }

    // --- [ YGConfigSetExperimentalFeatureEnabled ] ---

    /** {@code void YGConfigSetExperimentalFeatureEnabled(YGConfigRef config, YGExperimentalFeature feature, bool enabled)} */
    public static native void nYGConfigSetExperimentalFeatureEnabled(long config, int feature, boolean enabled);

    /** {@code void YGConfigSetExperimentalFeatureEnabled(YGConfigRef config, YGExperimentalFeature feature, bool enabled)} */
    public static void YGConfigSetExperimentalFeatureEnabled(@NativeType("YGConfigRef") long config, @NativeType("YGExperimentalFeature") int feature, @NativeType("bool") boolean enabled) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetExperimentalFeatureEnabled(config, feature, enabled);
    }

    // --- [ YGConfigIsExperimentalFeatureEnabled ] ---

    /** {@code bool YGConfigIsExperimentalFeatureEnabled(YGConfigConstRef config, YGExperimentalFeature feature)} */
    public static native boolean nYGConfigIsExperimentalFeatureEnabled(long config, int feature);

    /** {@code bool YGConfigIsExperimentalFeatureEnabled(YGConfigConstRef config, YGExperimentalFeature feature)} */
    @NativeType("bool")
    public static boolean YGConfigIsExperimentalFeatureEnabled(@NativeType("YGConfigConstRef") long config, @NativeType("YGExperimentalFeature") int feature) {
        if (CHECKS) {
            check(config);
        }
        return nYGConfigIsExperimentalFeatureEnabled(config, feature);
    }

    // --- [ YGConfigSetCloneNodeFunc ] ---

    /** {@code void YGConfigSetCloneNodeFunc(YGConfigRef config, YGCloneNodeFunc callback)} */
    public static native void nYGConfigSetCloneNodeFunc(long config, long callback);

    /** {@code void YGConfigSetCloneNodeFunc(YGConfigRef config, YGCloneNodeFunc callback)} */
    public static void YGConfigSetCloneNodeFunc(@NativeType("YGConfigRef") long config, @NativeType("YGCloneNodeFunc") @Nullable YGCloneNodeFuncI callback) {
        if (CHECKS) {
            check(config);
        }
        nYGConfigSetCloneNodeFunc(config, memAddressSafe(callback));
    }

    // --- [ YGNodeNew ] ---

    /** {@code YGNodeRef YGNodeNew(void)} */
    @NativeType("YGNodeRef")
    public static native long YGNodeNew();

    // --- [ YGNodeNewWithConfig ] ---

    /** {@code YGNodeRef YGNodeNewWithConfig(YGConfigConstRef config)} */
    public static native long nYGNodeNewWithConfig(long config);

    /** {@code YGNodeRef YGNodeNewWithConfig(YGConfigConstRef config)} */
    @NativeType("YGNodeRef")
    public static long YGNodeNewWithConfig(@NativeType("YGConfigConstRef") long config) {
        if (CHECKS) {
            check(config);
        }
        return nYGNodeNewWithConfig(config);
    }

    // --- [ YGNodeClone ] ---

    /** {@code YGNodeRef YGNodeClone(YGNodeConstRef node)} */
    public static native long nYGNodeClone(long node);

    /** {@code YGNodeRef YGNodeClone(YGNodeConstRef node)} */
    @NativeType("YGNodeRef")
    public static long YGNodeClone(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeClone(node);
    }

    // --- [ YGNodeFree ] ---

    /** {@code void YGNodeFree(YGNodeRef node)} */
    public static native void nYGNodeFree(long node);

    /** {@code void YGNodeFree(YGNodeRef node)} */
    public static void YGNodeFree(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeFree(node);
    }

    // --- [ YGNodeFreeRecursive ] ---

    /** {@code void YGNodeFreeRecursive(YGNodeRef node)} */
    public static native void nYGNodeFreeRecursive(long node);

    /** {@code void YGNodeFreeRecursive(YGNodeRef node)} */
    public static void YGNodeFreeRecursive(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeFreeRecursive(node);
    }

    // --- [ YGNodeFinalize ] ---

    /** {@code void YGNodeFinalize(YGNodeRef node)} */
    public static native void nYGNodeFinalize(long node);

    /** {@code void YGNodeFinalize(YGNodeRef node)} */
    public static void YGNodeFinalize(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeFinalize(node);
    }

    // --- [ YGNodeReset ] ---

    /** {@code void YGNodeReset(YGNodeRef node)} */
    public static native void nYGNodeReset(long node);

    /** {@code void YGNodeReset(YGNodeRef node)} */
    public static void YGNodeReset(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeReset(node);
    }

    // --- [ YGNodeCalculateLayout ] ---

    /** {@code void YGNodeCalculateLayout(YGNodeRef node, float availableWidth, float availableHeight, YGDirection ownerDirection)} */
    public static native void nYGNodeCalculateLayout(long node, float availableWidth, float availableHeight, int ownerDirection);

    /** {@code void YGNodeCalculateLayout(YGNodeRef node, float availableWidth, float availableHeight, YGDirection ownerDirection)} */
    public static void YGNodeCalculateLayout(@NativeType("YGNodeRef") long node, float availableWidth, float availableHeight, @NativeType("YGDirection") int ownerDirection) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeCalculateLayout(node, availableWidth, availableHeight, ownerDirection);
    }

    // --- [ YGNodeGetHasNewLayout ] ---

    /** {@code bool YGNodeGetHasNewLayout(YGNodeConstRef node)} */
    public static native boolean nYGNodeGetHasNewLayout(long node);

    /** {@code bool YGNodeGetHasNewLayout(YGNodeConstRef node)} */
    @NativeType("bool")
    public static boolean YGNodeGetHasNewLayout(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetHasNewLayout(node);
    }

    // --- [ YGNodeSetHasNewLayout ] ---

    /** {@code void YGNodeSetHasNewLayout(YGNodeRef node, bool hasNewLayout)} */
    public static native void nYGNodeSetHasNewLayout(long node, boolean hasNewLayout);

    /** {@code void YGNodeSetHasNewLayout(YGNodeRef node, bool hasNewLayout)} */
    public static void YGNodeSetHasNewLayout(@NativeType("YGNodeRef") long node, @NativeType("bool") boolean hasNewLayout) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetHasNewLayout(node, hasNewLayout);
    }

    // --- [ YGNodeIsDirty ] ---

    /** {@code bool YGNodeIsDirty(YGNodeConstRef node)} */
    public static native boolean nYGNodeIsDirty(long node);

    /** {@code bool YGNodeIsDirty(YGNodeConstRef node)} */
    @NativeType("bool")
    public static boolean YGNodeIsDirty(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeIsDirty(node);
    }

    // --- [ YGNodeMarkDirty ] ---

    /** {@code void YGNodeMarkDirty(YGNodeRef node)} */
    public static native void nYGNodeMarkDirty(long node);

    /** {@code void YGNodeMarkDirty(YGNodeRef node)} */
    public static void YGNodeMarkDirty(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeMarkDirty(node);
    }

    // --- [ YGNodeSetDirtiedFunc ] ---

    /** {@code void YGNodeSetDirtiedFunc(YGNodeRef node, YGDirtiedFunc dirtiedFunc)} */
    public static native void nYGNodeSetDirtiedFunc(long node, long dirtiedFunc);

    /** {@code void YGNodeSetDirtiedFunc(YGNodeRef node, YGDirtiedFunc dirtiedFunc)} */
    public static void YGNodeSetDirtiedFunc(@NativeType("YGNodeRef") long node, @NativeType("YGDirtiedFunc") @Nullable YGDirtiedFuncI dirtiedFunc) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetDirtiedFunc(node, memAddressSafe(dirtiedFunc));
    }

    // --- [ YGNodeGetDirtiedFunc ] ---

    /** {@code YGDirtiedFunc YGNodeGetDirtiedFunc(YGNodeConstRef node)} */
    public static native long nYGNodeGetDirtiedFunc(long node);

    /** {@code YGDirtiedFunc YGNodeGetDirtiedFunc(YGNodeConstRef node)} */
    @NativeType("YGDirtiedFunc")
    public static @Nullable YGDirtiedFunc YGNodeGetDirtiedFunc(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return YGDirtiedFunc.createSafe(nYGNodeGetDirtiedFunc(node));
    }

    // --- [ YGNodeInsertChild ] ---

    /** {@code void YGNodeInsertChild(YGNodeRef node, YGNodeRef child, size_t index)} */
    public static native void nYGNodeInsertChild(long node, long child, long index);

    /** {@code void YGNodeInsertChild(YGNodeRef node, YGNodeRef child, size_t index)} */
    public static void YGNodeInsertChild(@NativeType("YGNodeRef") long node, @NativeType("YGNodeRef") long child, @NativeType("size_t") long index) {
        if (CHECKS) {
            check(node);
            check(child);
        }
        nYGNodeInsertChild(node, child, index);
    }

    // --- [ YGNodeSwapChild ] ---

    /** {@code void YGNodeSwapChild(YGNodeRef node, YGNodeRef child, size_t index)} */
    public static native void nYGNodeSwapChild(long node, long child, long index);

    /** {@code void YGNodeSwapChild(YGNodeRef node, YGNodeRef child, size_t index)} */
    public static void YGNodeSwapChild(@NativeType("YGNodeRef") long node, @NativeType("YGNodeRef") long child, @NativeType("size_t") long index) {
        if (CHECKS) {
            check(node);
            check(child);
        }
        nYGNodeSwapChild(node, child, index);
    }

    // --- [ YGNodeRemoveChild ] ---

    /** {@code void YGNodeRemoveChild(YGNodeRef node, YGNodeRef child)} */
    public static native void nYGNodeRemoveChild(long node, long child);

    /** {@code void YGNodeRemoveChild(YGNodeRef node, YGNodeRef child)} */
    public static void YGNodeRemoveChild(@NativeType("YGNodeRef") long node, @NativeType("YGNodeRef") long child) {
        if (CHECKS) {
            check(node);
            check(child);
        }
        nYGNodeRemoveChild(node, child);
    }

    // --- [ YGNodeRemoveAllChildren ] ---

    /** {@code void YGNodeRemoveAllChildren(YGNodeRef node)} */
    public static native void nYGNodeRemoveAllChildren(long node);

    /** {@code void YGNodeRemoveAllChildren(YGNodeRef node)} */
    public static void YGNodeRemoveAllChildren(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeRemoveAllChildren(node);
    }

    // --- [ YGNodeSetChildren ] ---

    /** {@code void YGNodeSetChildren(YGNodeRef owner, YGNodeRef const * children, size_t count)} */
    public static native void nYGNodeSetChildren(long owner, long children, long count);

    /** {@code void YGNodeSetChildren(YGNodeRef owner, YGNodeRef const * children, size_t count)} */
    public static void YGNodeSetChildren(@NativeType("YGNodeRef") long owner, @NativeType("YGNodeRef const *") PointerBuffer children) {
        if (CHECKS) {
            check(owner);
        }
        nYGNodeSetChildren(owner, memAddress(children), children.remaining());
    }

    // --- [ YGNodeGetChild ] ---

    /** {@code YGNodeRef YGNodeGetChild(YGNodeRef node, size_t index)} */
    public static native long nYGNodeGetChild(long node, long index);

    /** {@code YGNodeRef YGNodeGetChild(YGNodeRef node, size_t index)} */
    @NativeType("YGNodeRef")
    public static long YGNodeGetChild(@NativeType("YGNodeRef") long node, @NativeType("size_t") long index) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetChild(node, index);
    }

    // --- [ YGNodeGetChildCount ] ---

    /** {@code size_t YGNodeGetChildCount(YGNodeConstRef node)} */
    public static native long nYGNodeGetChildCount(long node);

    /** {@code size_t YGNodeGetChildCount(YGNodeConstRef node)} */
    @NativeType("size_t")
    public static long YGNodeGetChildCount(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetChildCount(node);
    }

    // --- [ YGNodeGetOwner ] ---

    /** {@code YGNodeRef YGNodeGetOwner(YGNodeRef node)} */
    public static native long nYGNodeGetOwner(long node);

    /** {@code YGNodeRef YGNodeGetOwner(YGNodeRef node)} */
    @NativeType("YGNodeRef")
    public static long YGNodeGetOwner(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetOwner(node);
    }

    // --- [ YGNodeGetParent ] ---

    /** {@code YGNodeRef YGNodeGetParent(YGNodeRef node)} */
    public static native long nYGNodeGetParent(long node);

    /** {@code YGNodeRef YGNodeGetParent(YGNodeRef node)} */
    @NativeType("YGNodeRef")
    public static long YGNodeGetParent(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetParent(node);
    }

    // --- [ YGNodeSetConfig ] ---

    /** {@code void YGNodeSetConfig(YGNodeRef node, YGConfigRef config)} */
    public static native void nYGNodeSetConfig(long node, long config);

    /** {@code void YGNodeSetConfig(YGNodeRef node, YGConfigRef config)} */
    public static void YGNodeSetConfig(@NativeType("YGNodeRef") long node, @NativeType("YGConfigRef") long config) {
        if (CHECKS) {
            check(node);
            check(config);
        }
        nYGNodeSetConfig(node, config);
    }

    // --- [ YGNodeGetConfig ] ---

    /** {@code YGConfigRef YGNodeGetConfig(YGNodeRef node)} */
    public static native long nYGNodeGetConfig(long node);

    /** {@code YGConfigRef YGNodeGetConfig(YGNodeRef node)} */
    @NativeType("YGConfigRef")
    public static long YGNodeGetConfig(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetConfig(node);
    }

    // --- [ YGNodeSetContext ] ---

    /** {@code void YGNodeSetContext(YGNodeRef node, void * context)} */
    public static native void nYGNodeSetContext(long node, long context);

    /** {@code void YGNodeSetContext(YGNodeRef node, void * context)} */
    public static void YGNodeSetContext(@NativeType("YGNodeRef") long node, @NativeType("void *") long context) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetContext(node, context);
    }

    // --- [ YGNodeGetContext ] ---

    /** {@code void * YGNodeGetContext(YGNodeRef node)} */
    public static native long nYGNodeGetContext(long node);

    /** {@code void * YGNodeGetContext(YGNodeRef node)} */
    @NativeType("void *")
    public static long YGNodeGetContext(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetContext(node);
    }

    // --- [ YGNodeSetMeasureFunc ] ---

    /** {@code void YGNodeSetMeasureFunc(YGNodeRef node, YGMeasureFunc measureFunc)} */
    public static native void nYGNodeSetMeasureFunc(long node, long measureFunc);

    /** {@code void YGNodeSetMeasureFunc(YGNodeRef node, YGMeasureFunc measureFunc)} */
    public static void YGNodeSetMeasureFunc(@NativeType("YGNodeRef") long node, @NativeType("YGMeasureFunc") @Nullable YGMeasureFuncI measureFunc) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetMeasureFunc(node, memAddressSafe(measureFunc));
    }

    // --- [ YGNodeHasMeasureFunc ] ---

    /** {@code bool YGNodeHasMeasureFunc(YGNodeConstRef node)} */
    public static native boolean nYGNodeHasMeasureFunc(long node);

    /** {@code bool YGNodeHasMeasureFunc(YGNodeConstRef node)} */
    @NativeType("bool")
    public static boolean YGNodeHasMeasureFunc(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeHasMeasureFunc(node);
    }

    // --- [ YGNodeSetBaselineFunc ] ---

    /** {@code void YGNodeSetBaselineFunc(YGNodeRef node, YGBaselineFunc baselineFunc)} */
    public static native void nYGNodeSetBaselineFunc(long node, long baselineFunc);

    /** {@code void YGNodeSetBaselineFunc(YGNodeRef node, YGBaselineFunc baselineFunc)} */
    public static void YGNodeSetBaselineFunc(@NativeType("YGNodeRef") long node, @NativeType("YGBaselineFunc") @Nullable YGBaselineFuncI baselineFunc) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetBaselineFunc(node, memAddressSafe(baselineFunc));
    }

    // --- [ YGNodeHasBaselineFunc ] ---

    /** {@code bool YGNodeHasBaselineFunc(YGNodeConstRef node)} */
    public static native boolean nYGNodeHasBaselineFunc(long node);

    /** {@code bool YGNodeHasBaselineFunc(YGNodeConstRef node)} */
    @NativeType("bool")
    public static boolean YGNodeHasBaselineFunc(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeHasBaselineFunc(node);
    }

    // --- [ YGNodeSetIsReferenceBaseline ] ---

    /** {@code void YGNodeSetIsReferenceBaseline(YGNodeRef node, bool isReferenceBaseline)} */
    public static native void nYGNodeSetIsReferenceBaseline(long node, boolean isReferenceBaseline);

    /** {@code void YGNodeSetIsReferenceBaseline(YGNodeRef node, bool isReferenceBaseline)} */
    public static void YGNodeSetIsReferenceBaseline(@NativeType("YGNodeRef") long node, @NativeType("bool") boolean isReferenceBaseline) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetIsReferenceBaseline(node, isReferenceBaseline);
    }

    // --- [ YGNodeIsReferenceBaseline ] ---

    /** {@code bool YGNodeIsReferenceBaseline(YGNodeConstRef node)} */
    public static native boolean nYGNodeIsReferenceBaseline(long node);

    /** {@code bool YGNodeIsReferenceBaseline(YGNodeConstRef node)} */
    @NativeType("bool")
    public static boolean YGNodeIsReferenceBaseline(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeIsReferenceBaseline(node);
    }

    // --- [ YGNodeSetNodeType ] ---

    /** {@code void YGNodeSetNodeType(YGNodeRef node, YGNodeType nodeType)} */
    public static native void nYGNodeSetNodeType(long node, int nodeType);

    /** {@code void YGNodeSetNodeType(YGNodeRef node, YGNodeType nodeType)} */
    public static void YGNodeSetNodeType(@NativeType("YGNodeRef") long node, @NativeType("YGNodeType") int nodeType) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetNodeType(node, nodeType);
    }

    // --- [ YGNodeGetNodeType ] ---

    /** {@code YGNodeType YGNodeGetNodeType(YGNodeConstRef node)} */
    public static native int nYGNodeGetNodeType(long node);

    /** {@code YGNodeType YGNodeGetNodeType(YGNodeConstRef node)} */
    @NativeType("YGNodeType")
    public static int YGNodeGetNodeType(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetNodeType(node);
    }

    // --- [ YGNodeSetAlwaysFormsContainingBlock ] ---

    /** {@code void YGNodeSetAlwaysFormsContainingBlock(YGNodeRef node, bool alwaysFormsContainingBlock)} */
    public static native void nYGNodeSetAlwaysFormsContainingBlock(long node, boolean alwaysFormsContainingBlock);

    /** {@code void YGNodeSetAlwaysFormsContainingBlock(YGNodeRef node, bool alwaysFormsContainingBlock)} */
    public static void YGNodeSetAlwaysFormsContainingBlock(@NativeType("YGNodeRef") long node, @NativeType("bool") boolean alwaysFormsContainingBlock) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeSetAlwaysFormsContainingBlock(node, alwaysFormsContainingBlock);
    }

    // --- [ YGNodeGetAlwaysFormsContainingBlock ] ---

    /** {@code bool YGNodeGetAlwaysFormsContainingBlock(YGNodeConstRef node)} */
    public static native boolean nYGNodeGetAlwaysFormsContainingBlock(long node);

    /** {@code bool YGNodeGetAlwaysFormsContainingBlock(YGNodeConstRef node)} */
    @NativeType("bool")
    public static boolean YGNodeGetAlwaysFormsContainingBlock(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeGetAlwaysFormsContainingBlock(node);
    }

    // --- [ YGNodeLayoutGetLeft ] ---

    /** {@code float YGNodeLayoutGetLeft(YGNodeRef node)} */
    public static native float nYGNodeLayoutGetLeft(long node);

    /** {@code float YGNodeLayoutGetLeft(YGNodeRef node)} */
    public static float YGNodeLayoutGetLeft(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetLeft(node);
    }

    // --- [ YGNodeLayoutGetTop ] ---

    /** {@code float YGNodeLayoutGetTop(YGNodeRef node)} */
    public static native float nYGNodeLayoutGetTop(long node);

    /** {@code float YGNodeLayoutGetTop(YGNodeRef node)} */
    public static float YGNodeLayoutGetTop(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetTop(node);
    }

    // --- [ YGNodeLayoutGetRight ] ---

    /** {@code float YGNodeLayoutGetRight(YGNodeRef node)} */
    public static native float nYGNodeLayoutGetRight(long node);

    /** {@code float YGNodeLayoutGetRight(YGNodeRef node)} */
    public static float YGNodeLayoutGetRight(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetRight(node);
    }

    // --- [ YGNodeLayoutGetBottom ] ---

    /** {@code float YGNodeLayoutGetBottom(YGNodeRef node)} */
    public static native float nYGNodeLayoutGetBottom(long node);

    /** {@code float YGNodeLayoutGetBottom(YGNodeRef node)} */
    public static float YGNodeLayoutGetBottom(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetBottom(node);
    }

    // --- [ YGNodeLayoutGetWidth ] ---

    /** {@code float YGNodeLayoutGetWidth(YGNodeRef node)} */
    public static native float nYGNodeLayoutGetWidth(long node);

    /** {@code float YGNodeLayoutGetWidth(YGNodeRef node)} */
    public static float YGNodeLayoutGetWidth(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetWidth(node);
    }

    // --- [ YGNodeLayoutGetHeight ] ---

    /** {@code float YGNodeLayoutGetHeight(YGNodeRef node)} */
    public static native float nYGNodeLayoutGetHeight(long node);

    /** {@code float YGNodeLayoutGetHeight(YGNodeRef node)} */
    public static float YGNodeLayoutGetHeight(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetHeight(node);
    }

    // --- [ YGNodeLayoutGetDirection ] ---

    /** {@code YGDirection YGNodeLayoutGetDirection(YGNodeRef node)} */
    public static native int nYGNodeLayoutGetDirection(long node);

    /** {@code YGDirection YGNodeLayoutGetDirection(YGNodeRef node)} */
    @NativeType("YGDirection")
    public static int YGNodeLayoutGetDirection(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetDirection(node);
    }

    // --- [ YGNodeLayoutGetHadOverflow ] ---

    /** {@code bool YGNodeLayoutGetHadOverflow(YGNodeRef node)} */
    public static native boolean nYGNodeLayoutGetHadOverflow(long node);

    /** {@code bool YGNodeLayoutGetHadOverflow(YGNodeRef node)} */
    @NativeType("bool")
    public static boolean YGNodeLayoutGetHadOverflow(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetHadOverflow(node);
    }

    // --- [ YGNodeLayoutGetMargin ] ---

    /** {@code float YGNodeLayoutGetMargin(YGNodeRef node, YGEdge edge)} */
    public static native float nYGNodeLayoutGetMargin(long node, int edge);

    /** {@code float YGNodeLayoutGetMargin(YGNodeRef node, YGEdge edge)} */
    public static float YGNodeLayoutGetMargin(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetMargin(node, edge);
    }

    // --- [ YGNodeLayoutGetBorder ] ---

    /** {@code float YGNodeLayoutGetBorder(YGNodeRef node, YGEdge edge)} */
    public static native float nYGNodeLayoutGetBorder(long node, int edge);

    /** {@code float YGNodeLayoutGetBorder(YGNodeRef node, YGEdge edge)} */
    public static float YGNodeLayoutGetBorder(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetBorder(node, edge);
    }

    // --- [ YGNodeLayoutGetPadding ] ---

    /** {@code float YGNodeLayoutGetPadding(YGNodeRef node, YGEdge edge)} */
    public static native float nYGNodeLayoutGetPadding(long node, int edge);

    /** {@code float YGNodeLayoutGetPadding(YGNodeRef node, YGEdge edge)} */
    public static float YGNodeLayoutGetPadding(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeLayoutGetPadding(node, edge);
    }

    // --- [ YGNodeCopyStyle ] ---

    /** {@code void YGNodeCopyStyle(YGNodeRef dstNode, YGNodeConstRef srcNode)} */
    public static native void nYGNodeCopyStyle(long dstNode, long srcNode);

    /** {@code void YGNodeCopyStyle(YGNodeRef dstNode, YGNodeConstRef srcNode)} */
    public static void YGNodeCopyStyle(@NativeType("YGNodeRef") long dstNode, @NativeType("YGNodeConstRef") long srcNode) {
        if (CHECKS) {
            check(dstNode);
            check(srcNode);
        }
        nYGNodeCopyStyle(dstNode, srcNode);
    }

    // --- [ YGNodeStyleSetDirection ] ---

    /** {@code void YGNodeStyleSetDirection(YGNodeRef node, YGDirection direction)} */
    public static native void nYGNodeStyleSetDirection(long node, int direction);

    /** {@code void YGNodeStyleSetDirection(YGNodeRef node, YGDirection direction)} */
    public static void YGNodeStyleSetDirection(@NativeType("YGNodeRef") long node, @NativeType("YGDirection") int direction) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetDirection(node, direction);
    }

    // --- [ YGNodeStyleGetDirection ] ---

    /** {@code YGDirection YGNodeStyleGetDirection(YGNodeConstRef node)} */
    public static native int nYGNodeStyleGetDirection(long node);

    /** {@code YGDirection YGNodeStyleGetDirection(YGNodeConstRef node)} */
    @NativeType("YGDirection")
    public static int YGNodeStyleGetDirection(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetDirection(node);
    }

    // --- [ YGNodeStyleSetFlexDirection ] ---

    /** {@code void YGNodeStyleSetFlexDirection(YGNodeRef node, YGFlexDirection flexDirection)} */
    public static native void nYGNodeStyleSetFlexDirection(long node, int flexDirection);

    /** {@code void YGNodeStyleSetFlexDirection(YGNodeRef node, YGFlexDirection flexDirection)} */
    public static void YGNodeStyleSetFlexDirection(@NativeType("YGNodeRef") long node, @NativeType("YGFlexDirection") int flexDirection) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexDirection(node, flexDirection);
    }

    // --- [ YGNodeStyleGetFlexDirection ] ---

    /** {@code YGFlexDirection YGNodeStyleGetFlexDirection(YGNodeConstRef node)} */
    public static native int nYGNodeStyleGetFlexDirection(long node);

    /** {@code YGFlexDirection YGNodeStyleGetFlexDirection(YGNodeConstRef node)} */
    @NativeType("YGFlexDirection")
    public static int YGNodeStyleGetFlexDirection(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexDirection(node);
    }

    // --- [ YGNodeStyleSetJustifyContent ] ---

    /** {@code void YGNodeStyleSetJustifyContent(YGNodeRef node, YGJustify justifyContent)} */
    public static native void nYGNodeStyleSetJustifyContent(long node, int justifyContent);

    /** {@code void YGNodeStyleSetJustifyContent(YGNodeRef node, YGJustify justifyContent)} */
    public static void YGNodeStyleSetJustifyContent(@NativeType("YGNodeRef") long node, @NativeType("YGJustify") int justifyContent) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetJustifyContent(node, justifyContent);
    }

    // --- [ YGNodeStyleGetJustifyContent ] ---

    /** {@code YGJustify YGNodeStyleGetJustifyContent(YGNodeConstRef node)} */
    public static native int nYGNodeStyleGetJustifyContent(long node);

    /** {@code YGJustify YGNodeStyleGetJustifyContent(YGNodeConstRef node)} */
    @NativeType("YGJustify")
    public static int YGNodeStyleGetJustifyContent(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetJustifyContent(node);
    }

    // --- [ YGNodeStyleSetAlignContent ] ---

    /** {@code void YGNodeStyleSetAlignContent(YGNodeRef node, YGAlign alignContent)} */
    public static native void nYGNodeStyleSetAlignContent(long node, int alignContent);

    /** {@code void YGNodeStyleSetAlignContent(YGNodeRef node, YGAlign alignContent)} */
    public static void YGNodeStyleSetAlignContent(@NativeType("YGNodeRef") long node, @NativeType("YGAlign") int alignContent) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAlignContent(node, alignContent);
    }

    // --- [ YGNodeStyleGetAlignContent ] ---

    /** {@code YGAlign YGNodeStyleGetAlignContent(YGNodeConstRef node)} */
    public static native int nYGNodeStyleGetAlignContent(long node);

    /** {@code YGAlign YGNodeStyleGetAlignContent(YGNodeConstRef node)} */
    @NativeType("YGAlign")
    public static int YGNodeStyleGetAlignContent(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAlignContent(node);
    }

    // --- [ YGNodeStyleSetAlignItems ] ---

    /** {@code void YGNodeStyleSetAlignItems(YGNodeRef node, YGAlign alignItems)} */
    public static native void nYGNodeStyleSetAlignItems(long node, int alignItems);

    /** {@code void YGNodeStyleSetAlignItems(YGNodeRef node, YGAlign alignItems)} */
    public static void YGNodeStyleSetAlignItems(@NativeType("YGNodeRef") long node, @NativeType("YGAlign") int alignItems) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAlignItems(node, alignItems);
    }

    // --- [ YGNodeStyleGetAlignItems ] ---

    /** {@code YGAlign YGNodeStyleGetAlignItems(YGNodeConstRef node)} */
    public static native int nYGNodeStyleGetAlignItems(long node);

    /** {@code YGAlign YGNodeStyleGetAlignItems(YGNodeConstRef node)} */
    @NativeType("YGAlign")
    public static int YGNodeStyleGetAlignItems(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAlignItems(node);
    }

    // --- [ YGNodeStyleSetAlignSelf ] ---

    /** {@code void YGNodeStyleSetAlignSelf(YGNodeRef node, YGAlign alignSelf)} */
    public static native void nYGNodeStyleSetAlignSelf(long node, int alignSelf);

    /** {@code void YGNodeStyleSetAlignSelf(YGNodeRef node, YGAlign alignSelf)} */
    public static void YGNodeStyleSetAlignSelf(@NativeType("YGNodeRef") long node, @NativeType("YGAlign") int alignSelf) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAlignSelf(node, alignSelf);
    }

    // --- [ YGNodeStyleGetAlignSelf ] ---

    /** {@code YGAlign YGNodeStyleGetAlignSelf(YGNodeConstRef node)} */
    public static native int nYGNodeStyleGetAlignSelf(long node);

    /** {@code YGAlign YGNodeStyleGetAlignSelf(YGNodeConstRef node)} */
    @NativeType("YGAlign")
    public static int YGNodeStyleGetAlignSelf(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAlignSelf(node);
    }

    // --- [ YGNodeStyleSetPositionType ] ---

    /** {@code void YGNodeStyleSetPositionType(YGNodeRef node, YGPositionType positionType)} */
    public static native void nYGNodeStyleSetPositionType(long node, int positionType);

    /** {@code void YGNodeStyleSetPositionType(YGNodeRef node, YGPositionType positionType)} */
    public static void YGNodeStyleSetPositionType(@NativeType("YGNodeRef") long node, @NativeType("YGPositionType") int positionType) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPositionType(node, positionType);
    }

    // --- [ YGNodeStyleGetPositionType ] ---

    /** {@code YGPositionType YGNodeStyleGetPositionType(YGNodeConstRef node)} */
    public static native int nYGNodeStyleGetPositionType(long node);

    /** {@code YGPositionType YGNodeStyleGetPositionType(YGNodeConstRef node)} */
    @NativeType("YGPositionType")
    public static int YGNodeStyleGetPositionType(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetPositionType(node);
    }

    // --- [ YGNodeStyleSetPositionAuto ] ---

    /** {@code void YGNodeStyleSetPositionAuto(YGNodeRef node, YGEdge edge)} */
    public static native void nYGNodeStyleSetPositionAuto(long node, int edge);

    /** {@code void YGNodeStyleSetPositionAuto(YGNodeRef node, YGEdge edge)} */
    public static void YGNodeStyleSetPositionAuto(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPositionAuto(node, edge);
    }

    // --- [ YGNodeStyleSetFlexWrap ] ---

    /** {@code void YGNodeStyleSetFlexWrap(YGNodeRef node, YGWrap flexWrap)} */
    public static native void nYGNodeStyleSetFlexWrap(long node, int flexWrap);

    /** {@code void YGNodeStyleSetFlexWrap(YGNodeRef node, YGWrap flexWrap)} */
    public static void YGNodeStyleSetFlexWrap(@NativeType("YGNodeRef") long node, @NativeType("YGWrap") int flexWrap) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexWrap(node, flexWrap);
    }

    // --- [ YGNodeStyleGetFlexWrap ] ---

    /** {@code YGWrap YGNodeStyleGetFlexWrap(YGNodeConstRef node)} */
    public static native int nYGNodeStyleGetFlexWrap(long node);

    /** {@code YGWrap YGNodeStyleGetFlexWrap(YGNodeConstRef node)} */
    @NativeType("YGWrap")
    public static int YGNodeStyleGetFlexWrap(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexWrap(node);
    }

    // --- [ YGNodeStyleSetOverflow ] ---

    /** {@code void YGNodeStyleSetOverflow(YGNodeRef node, YGOverflow overflow)} */
    public static native void nYGNodeStyleSetOverflow(long node, int overflow);

    /** {@code void YGNodeStyleSetOverflow(YGNodeRef node, YGOverflow overflow)} */
    public static void YGNodeStyleSetOverflow(@NativeType("YGNodeRef") long node, @NativeType("YGOverflow") int overflow) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetOverflow(node, overflow);
    }

    // --- [ YGNodeStyleGetOverflow ] ---

    /** {@code YGOverflow YGNodeStyleGetOverflow(YGNodeConstRef node)} */
    public static native int nYGNodeStyleGetOverflow(long node);

    /** {@code YGOverflow YGNodeStyleGetOverflow(YGNodeConstRef node)} */
    @NativeType("YGOverflow")
    public static int YGNodeStyleGetOverflow(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetOverflow(node);
    }

    // --- [ YGNodeStyleSetDisplay ] ---

    /** {@code void YGNodeStyleSetDisplay(YGNodeRef node, YGDisplay display)} */
    public static native void nYGNodeStyleSetDisplay(long node, int display);

    /** {@code void YGNodeStyleSetDisplay(YGNodeRef node, YGDisplay display)} */
    public static void YGNodeStyleSetDisplay(@NativeType("YGNodeRef") long node, @NativeType("YGDisplay") int display) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetDisplay(node, display);
    }

    // --- [ YGNodeStyleGetDisplay ] ---

    /** {@code YGDisplay YGNodeStyleGetDisplay(YGNodeConstRef node)} */
    public static native int nYGNodeStyleGetDisplay(long node);

    /** {@code YGDisplay YGNodeStyleGetDisplay(YGNodeConstRef node)} */
    @NativeType("YGDisplay")
    public static int YGNodeStyleGetDisplay(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetDisplay(node);
    }

    // --- [ YGNodeStyleSetFlex ] ---

    /** {@code void YGNodeStyleSetFlex(YGNodeRef node, float flex)} */
    public static native void nYGNodeStyleSetFlex(long node, float flex);

    /** {@code void YGNodeStyleSetFlex(YGNodeRef node, float flex)} */
    public static void YGNodeStyleSetFlex(@NativeType("YGNodeRef") long node, float flex) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlex(node, flex);
    }

    // --- [ YGNodeStyleGetFlex ] ---

    /** {@code float YGNodeStyleGetFlex(YGNodeConstRef node)} */
    public static native float nYGNodeStyleGetFlex(long node);

    /** {@code float YGNodeStyleGetFlex(YGNodeConstRef node)} */
    public static float YGNodeStyleGetFlex(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlex(node);
    }

    // --- [ YGNodeStyleSetFlexGrow ] ---

    /** {@code void YGNodeStyleSetFlexGrow(YGNodeRef node, float flexGrow)} */
    public static native void nYGNodeStyleSetFlexGrow(long node, float flexGrow);

    /** {@code void YGNodeStyleSetFlexGrow(YGNodeRef node, float flexGrow)} */
    public static void YGNodeStyleSetFlexGrow(@NativeType("YGNodeRef") long node, float flexGrow) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexGrow(node, flexGrow);
    }

    // --- [ YGNodeStyleGetFlexGrow ] ---

    /** {@code float YGNodeStyleGetFlexGrow(YGNodeConstRef node)} */
    public static native float nYGNodeStyleGetFlexGrow(long node);

    /** {@code float YGNodeStyleGetFlexGrow(YGNodeConstRef node)} */
    public static float YGNodeStyleGetFlexGrow(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexGrow(node);
    }

    // --- [ YGNodeStyleSetFlexShrink ] ---

    /** {@code void YGNodeStyleSetFlexShrink(YGNodeRef node, float flexShrink)} */
    public static native void nYGNodeStyleSetFlexShrink(long node, float flexShrink);

    /** {@code void YGNodeStyleSetFlexShrink(YGNodeRef node, float flexShrink)} */
    public static void YGNodeStyleSetFlexShrink(@NativeType("YGNodeRef") long node, float flexShrink) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexShrink(node, flexShrink);
    }

    // --- [ YGNodeStyleGetFlexShrink ] ---

    /** {@code float YGNodeStyleGetFlexShrink(YGNodeConstRef node)} */
    public static native float nYGNodeStyleGetFlexShrink(long node);

    /** {@code float YGNodeStyleGetFlexShrink(YGNodeConstRef node)} */
    public static float YGNodeStyleGetFlexShrink(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetFlexShrink(node);
    }

    // --- [ YGNodeStyleSetFlexBasis ] ---

    /** {@code void YGNodeStyleSetFlexBasis(YGNodeRef node, float flexBasis)} */
    public static native void nYGNodeStyleSetFlexBasis(long node, float flexBasis);

    /** {@code void YGNodeStyleSetFlexBasis(YGNodeRef node, float flexBasis)} */
    public static void YGNodeStyleSetFlexBasis(@NativeType("YGNodeRef") long node, float flexBasis) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexBasis(node, flexBasis);
    }

    // --- [ YGNodeStyleSetFlexBasisPercent ] ---

    /** {@code void YGNodeStyleSetFlexBasisPercent(YGNodeRef node, float flexBasis)} */
    public static native void nYGNodeStyleSetFlexBasisPercent(long node, float flexBasis);

    /** {@code void YGNodeStyleSetFlexBasisPercent(YGNodeRef node, float flexBasis)} */
    public static void YGNodeStyleSetFlexBasisPercent(@NativeType("YGNodeRef") long node, float flexBasis) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexBasisPercent(node, flexBasis);
    }

    // --- [ YGNodeStyleSetFlexBasisAuto ] ---

    /** {@code void YGNodeStyleSetFlexBasisAuto(YGNodeRef node)} */
    public static native void nYGNodeStyleSetFlexBasisAuto(long node);

    /** {@code void YGNodeStyleSetFlexBasisAuto(YGNodeRef node)} */
    public static void YGNodeStyleSetFlexBasisAuto(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetFlexBasisAuto(node);
    }

    // --- [ YGNodeStyleGetFlexBasis ] ---

    /** {@code YGValue YGNodeStyleGetFlexBasis(YGNodeConstRef node)} */
    public static native void nYGNodeStyleGetFlexBasis(long node, long __result);

    /** {@code YGValue YGNodeStyleGetFlexBasis(YGNodeConstRef node)} */
    public static YGValue YGNodeStyleGetFlexBasis(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetFlexBasis(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetPosition ] ---

    /** {@code void YGNodeStyleSetPosition(YGNodeRef node, YGEdge edge, float position)} */
    public static native void nYGNodeStyleSetPosition(long node, int edge, float position);

    /** {@code void YGNodeStyleSetPosition(YGNodeRef node, YGEdge edge, float position)} */
    public static void YGNodeStyleSetPosition(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float position) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPosition(node, edge, position);
    }

    // --- [ YGNodeStyleSetPositionPercent ] ---

    /** {@code void YGNodeStyleSetPositionPercent(YGNodeRef node, YGEdge edge, float position)} */
    public static native void nYGNodeStyleSetPositionPercent(long node, int edge, float position);

    /** {@code void YGNodeStyleSetPositionPercent(YGNodeRef node, YGEdge edge, float position)} */
    public static void YGNodeStyleSetPositionPercent(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float position) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPositionPercent(node, edge, position);
    }

    // --- [ YGNodeStyleGetPosition ] ---

    /** {@code YGValue YGNodeStyleGetPosition(YGNodeConstRef node, YGEdge edge)} */
    public static native void nYGNodeStyleGetPosition(long node, int edge, long __result);

    /** {@code YGValue YGNodeStyleGetPosition(YGNodeConstRef node, YGEdge edge)} */
    public static YGValue YGNodeStyleGetPosition(@NativeType("YGNodeConstRef") long node, @NativeType("YGEdge") int edge, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetPosition(node, edge, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMargin ] ---

    /** {@code void YGNodeStyleSetMargin(YGNodeRef node, YGEdge edge, float margin)} */
    public static native void nYGNodeStyleSetMargin(long node, int edge, float margin);

    /** {@code void YGNodeStyleSetMargin(YGNodeRef node, YGEdge edge, float margin)} */
    public static void YGNodeStyleSetMargin(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float margin) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMargin(node, edge, margin);
    }

    // --- [ YGNodeStyleSetMarginPercent ] ---

    /** {@code void YGNodeStyleSetMarginPercent(YGNodeRef node, YGEdge edge, float margin)} */
    public static native void nYGNodeStyleSetMarginPercent(long node, int edge, float margin);

    /** {@code void YGNodeStyleSetMarginPercent(YGNodeRef node, YGEdge edge, float margin)} */
    public static void YGNodeStyleSetMarginPercent(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float margin) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMarginPercent(node, edge, margin);
    }

    // --- [ YGNodeStyleSetMarginAuto ] ---

    /** {@code void YGNodeStyleSetMarginAuto(YGNodeRef node, YGEdge edge)} */
    public static native void nYGNodeStyleSetMarginAuto(long node, int edge);

    /** {@code void YGNodeStyleSetMarginAuto(YGNodeRef node, YGEdge edge)} */
    public static void YGNodeStyleSetMarginAuto(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMarginAuto(node, edge);
    }

    // --- [ YGNodeStyleGetMargin ] ---

    /** {@code YGValue YGNodeStyleGetMargin(YGNodeConstRef node, YGEdge edge)} */
    public static native void nYGNodeStyleGetMargin(long node, int edge, long __result);

    /** {@code YGValue YGNodeStyleGetMargin(YGNodeConstRef node, YGEdge edge)} */
    public static YGValue YGNodeStyleGetMargin(@NativeType("YGNodeConstRef") long node, @NativeType("YGEdge") int edge, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMargin(node, edge, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetPadding ] ---

    /** {@code void YGNodeStyleSetPadding(YGNodeRef node, YGEdge edge, float padding)} */
    public static native void nYGNodeStyleSetPadding(long node, int edge, float padding);

    /** {@code void YGNodeStyleSetPadding(YGNodeRef node, YGEdge edge, float padding)} */
    public static void YGNodeStyleSetPadding(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float padding) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPadding(node, edge, padding);
    }

    // --- [ YGNodeStyleSetPaddingPercent ] ---

    /** {@code void YGNodeStyleSetPaddingPercent(YGNodeRef node, YGEdge edge, float padding)} */
    public static native void nYGNodeStyleSetPaddingPercent(long node, int edge, float padding);

    /** {@code void YGNodeStyleSetPaddingPercent(YGNodeRef node, YGEdge edge, float padding)} */
    public static void YGNodeStyleSetPaddingPercent(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float padding) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetPaddingPercent(node, edge, padding);
    }

    // --- [ YGNodeStyleGetPadding ] ---

    /** {@code YGValue YGNodeStyleGetPadding(YGNodeConstRef node, YGEdge edge)} */
    public static native void nYGNodeStyleGetPadding(long node, int edge, long __result);

    /** {@code YGValue YGNodeStyleGetPadding(YGNodeConstRef node, YGEdge edge)} */
    public static YGValue YGNodeStyleGetPadding(@NativeType("YGNodeConstRef") long node, @NativeType("YGEdge") int edge, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetPadding(node, edge, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetBorder ] ---

    /** {@code void YGNodeStyleSetBorder(YGNodeRef node, YGEdge edge, float border)} */
    public static native void nYGNodeStyleSetBorder(long node, int edge, float border);

    /** {@code void YGNodeStyleSetBorder(YGNodeRef node, YGEdge edge, float border)} */
    public static void YGNodeStyleSetBorder(@NativeType("YGNodeRef") long node, @NativeType("YGEdge") int edge, float border) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetBorder(node, edge, border);
    }

    // --- [ YGNodeStyleGetBorder ] ---

    /** {@code float YGNodeStyleGetBorder(YGNodeConstRef node, YGEdge edge)} */
    public static native float nYGNodeStyleGetBorder(long node, int edge);

    /** {@code float YGNodeStyleGetBorder(YGNodeConstRef node, YGEdge edge)} */
    public static float YGNodeStyleGetBorder(@NativeType("YGNodeConstRef") long node, @NativeType("YGEdge") int edge) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetBorder(node, edge);
    }

    // --- [ YGNodeStyleSetGap ] ---

    /** {@code void YGNodeStyleSetGap(YGNodeRef node, YGGutter gutter, float gapLength)} */
    public static native void nYGNodeStyleSetGap(long node, int gutter, float gapLength);

    /** {@code void YGNodeStyleSetGap(YGNodeRef node, YGGutter gutter, float gapLength)} */
    public static void YGNodeStyleSetGap(@NativeType("YGNodeRef") long node, @NativeType("YGGutter") int gutter, float gapLength) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetGap(node, gutter, gapLength);
    }

    // --- [ YGNodeStyleSetGapPercent ] ---

    /** {@code void YGNodeStyleSetGapPercent(YGNodeRef node, YGGutter gutter, float gapLength)} */
    public static native void nYGNodeStyleSetGapPercent(long node, int gutter, float gapLength);

    /** {@code void YGNodeStyleSetGapPercent(YGNodeRef node, YGGutter gutter, float gapLength)} */
    public static void YGNodeStyleSetGapPercent(@NativeType("YGNodeRef") long node, @NativeType("YGGutter") int gutter, float gapLength) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetGapPercent(node, gutter, gapLength);
    }

    // --- [ YGNodeStyleGetGap ] ---

    /** {@code float YGNodeStyleGetGap(YGNodeConstRef node, YGGutter gutter)} */
    public static native float nYGNodeStyleGetGap(long node, int gutter);

    /** {@code float YGNodeStyleGetGap(YGNodeConstRef node, YGGutter gutter)} */
    public static float YGNodeStyleGetGap(@NativeType("YGNodeConstRef") long node, @NativeType("YGGutter") int gutter) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetGap(node, gutter);
    }

    // --- [ YGNodeStyleSetBoxSizing ] ---

    /** {@code void YGNodeStyleSetBoxSizing(YGNodeRef node, YGBoxSizing boxSizing)} */
    public static native void nYGNodeStyleSetBoxSizing(long node, int boxSizing);

    /** {@code void YGNodeStyleSetBoxSizing(YGNodeRef node, YGBoxSizing boxSizing)} */
    public static void YGNodeStyleSetBoxSizing(@NativeType("YGNodeRef") long node, @NativeType("YGBoxSizing") int boxSizing) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetBoxSizing(node, boxSizing);
    }

    // --- [ YGNodeStyleGetBoxSizing ] ---

    /** {@code YGBoxSizing YGNodeStyleGetBoxSizing(YGNodeConstRef node)} */
    public static native int nYGNodeStyleGetBoxSizing(long node);

    /** {@code YGBoxSizing YGNodeStyleGetBoxSizing(YGNodeConstRef node)} */
    @NativeType("YGBoxSizing")
    public static int YGNodeStyleGetBoxSizing(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetBoxSizing(node);
    }

    // --- [ YGNodeStyleSetWidth ] ---

    /** {@code void YGNodeStyleSetWidth(YGNodeRef node, float width)} */
    public static native void nYGNodeStyleSetWidth(long node, float width);

    /** {@code void YGNodeStyleSetWidth(YGNodeRef node, float width)} */
    public static void YGNodeStyleSetWidth(@NativeType("YGNodeRef") long node, float width) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetWidth(node, width);
    }

    // --- [ YGNodeStyleSetWidthPercent ] ---

    /** {@code void YGNodeStyleSetWidthPercent(YGNodeRef node, float width)} */
    public static native void nYGNodeStyleSetWidthPercent(long node, float width);

    /** {@code void YGNodeStyleSetWidthPercent(YGNodeRef node, float width)} */
    public static void YGNodeStyleSetWidthPercent(@NativeType("YGNodeRef") long node, float width) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetWidthPercent(node, width);
    }

    // --- [ YGNodeStyleSetWidthAuto ] ---

    /** {@code void YGNodeStyleSetWidthAuto(YGNodeRef node)} */
    public static native void nYGNodeStyleSetWidthAuto(long node);

    /** {@code void YGNodeStyleSetWidthAuto(YGNodeRef node)} */
    public static void YGNodeStyleSetWidthAuto(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetWidthAuto(node);
    }

    // --- [ YGNodeStyleGetWidth ] ---

    /** {@code YGValue YGNodeStyleGetWidth(YGNodeConstRef node)} */
    public static native void nYGNodeStyleGetWidth(long node, long __result);

    /** {@code YGValue YGNodeStyleGetWidth(YGNodeConstRef node)} */
    public static YGValue YGNodeStyleGetWidth(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetWidth(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetHeight ] ---

    /** {@code void YGNodeStyleSetHeight(YGNodeRef node, float height)} */
    public static native void nYGNodeStyleSetHeight(long node, float height);

    /** {@code void YGNodeStyleSetHeight(YGNodeRef node, float height)} */
    public static void YGNodeStyleSetHeight(@NativeType("YGNodeRef") long node, float height) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetHeight(node, height);
    }

    // --- [ YGNodeStyleSetHeightPercent ] ---

    /** {@code void YGNodeStyleSetHeightPercent(YGNodeRef node, float height)} */
    public static native void nYGNodeStyleSetHeightPercent(long node, float height);

    /** {@code void YGNodeStyleSetHeightPercent(YGNodeRef node, float height)} */
    public static void YGNodeStyleSetHeightPercent(@NativeType("YGNodeRef") long node, float height) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetHeightPercent(node, height);
    }

    // --- [ YGNodeStyleSetHeightAuto ] ---

    /** {@code void YGNodeStyleSetHeightAuto(YGNodeRef node)} */
    public static native void nYGNodeStyleSetHeightAuto(long node);

    /** {@code void YGNodeStyleSetHeightAuto(YGNodeRef node)} */
    public static void YGNodeStyleSetHeightAuto(@NativeType("YGNodeRef") long node) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetHeightAuto(node);
    }

    // --- [ YGNodeStyleGetHeight ] ---

    /** {@code YGValue YGNodeStyleGetHeight(YGNodeConstRef node)} */
    public static native void nYGNodeStyleGetHeight(long node, long __result);

    /** {@code YGValue YGNodeStyleGetHeight(YGNodeConstRef node)} */
    public static YGValue YGNodeStyleGetHeight(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetHeight(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMinWidth ] ---

    /** {@code void YGNodeStyleSetMinWidth(YGNodeRef node, float minWidth)} */
    public static native void nYGNodeStyleSetMinWidth(long node, float minWidth);

    /** {@code void YGNodeStyleSetMinWidth(YGNodeRef node, float minWidth)} */
    public static void YGNodeStyleSetMinWidth(@NativeType("YGNodeRef") long node, float minWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinWidth(node, minWidth);
    }

    // --- [ YGNodeStyleSetMinWidthPercent ] ---

    /** {@code void YGNodeStyleSetMinWidthPercent(YGNodeRef node, float minWidth)} */
    public static native void nYGNodeStyleSetMinWidthPercent(long node, float minWidth);

    /** {@code void YGNodeStyleSetMinWidthPercent(YGNodeRef node, float minWidth)} */
    public static void YGNodeStyleSetMinWidthPercent(@NativeType("YGNodeRef") long node, float minWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinWidthPercent(node, minWidth);
    }

    // --- [ YGNodeStyleGetMinWidth ] ---

    /** {@code YGValue YGNodeStyleGetMinWidth(YGNodeConstRef node)} */
    public static native void nYGNodeStyleGetMinWidth(long node, long __result);

    /** {@code YGValue YGNodeStyleGetMinWidth(YGNodeConstRef node)} */
    public static YGValue YGNodeStyleGetMinWidth(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMinWidth(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMinHeight ] ---

    /** {@code void YGNodeStyleSetMinHeight(YGNodeRef node, float minHeight)} */
    public static native void nYGNodeStyleSetMinHeight(long node, float minHeight);

    /** {@code void YGNodeStyleSetMinHeight(YGNodeRef node, float minHeight)} */
    public static void YGNodeStyleSetMinHeight(@NativeType("YGNodeRef") long node, float minHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinHeight(node, minHeight);
    }

    // --- [ YGNodeStyleSetMinHeightPercent ] ---

    /** {@code void YGNodeStyleSetMinHeightPercent(YGNodeRef node, float minHeight)} */
    public static native void nYGNodeStyleSetMinHeightPercent(long node, float minHeight);

    /** {@code void YGNodeStyleSetMinHeightPercent(YGNodeRef node, float minHeight)} */
    public static void YGNodeStyleSetMinHeightPercent(@NativeType("YGNodeRef") long node, float minHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMinHeightPercent(node, minHeight);
    }

    // --- [ YGNodeStyleGetMinHeight ] ---

    /** {@code YGValue YGNodeStyleGetMinHeight(YGNodeConstRef node)} */
    public static native void nYGNodeStyleGetMinHeight(long node, long __result);

    /** {@code YGValue YGNodeStyleGetMinHeight(YGNodeConstRef node)} */
    public static YGValue YGNodeStyleGetMinHeight(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMinHeight(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMaxWidth ] ---

    /** {@code void YGNodeStyleSetMaxWidth(YGNodeRef node, float maxWidth)} */
    public static native void nYGNodeStyleSetMaxWidth(long node, float maxWidth);

    /** {@code void YGNodeStyleSetMaxWidth(YGNodeRef node, float maxWidth)} */
    public static void YGNodeStyleSetMaxWidth(@NativeType("YGNodeRef") long node, float maxWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxWidth(node, maxWidth);
    }

    // --- [ YGNodeStyleSetMaxWidthPercent ] ---

    /** {@code void YGNodeStyleSetMaxWidthPercent(YGNodeRef node, float maxWidth)} */
    public static native void nYGNodeStyleSetMaxWidthPercent(long node, float maxWidth);

    /** {@code void YGNodeStyleSetMaxWidthPercent(YGNodeRef node, float maxWidth)} */
    public static void YGNodeStyleSetMaxWidthPercent(@NativeType("YGNodeRef") long node, float maxWidth) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxWidthPercent(node, maxWidth);
    }

    // --- [ YGNodeStyleGetMaxWidth ] ---

    /** {@code YGValue YGNodeStyleGetMaxWidth(YGNodeConstRef node)} */
    public static native void nYGNodeStyleGetMaxWidth(long node, long __result);

    /** {@code YGValue YGNodeStyleGetMaxWidth(YGNodeConstRef node)} */
    public static YGValue YGNodeStyleGetMaxWidth(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMaxWidth(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetMaxHeight ] ---

    /** {@code void YGNodeStyleSetMaxHeight(YGNodeRef node, float maxHeight)} */
    public static native void nYGNodeStyleSetMaxHeight(long node, float maxHeight);

    /** {@code void YGNodeStyleSetMaxHeight(YGNodeRef node, float maxHeight)} */
    public static void YGNodeStyleSetMaxHeight(@NativeType("YGNodeRef") long node, float maxHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxHeight(node, maxHeight);
    }

    // --- [ YGNodeStyleSetMaxHeightPercent ] ---

    /** {@code void YGNodeStyleSetMaxHeightPercent(YGNodeRef node, float maxHeight)} */
    public static native void nYGNodeStyleSetMaxHeightPercent(long node, float maxHeight);

    /** {@code void YGNodeStyleSetMaxHeightPercent(YGNodeRef node, float maxHeight)} */
    public static void YGNodeStyleSetMaxHeightPercent(@NativeType("YGNodeRef") long node, float maxHeight) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetMaxHeightPercent(node, maxHeight);
    }

    // --- [ YGNodeStyleGetMaxHeight ] ---

    /** {@code YGValue YGNodeStyleGetMaxHeight(YGNodeConstRef node)} */
    public static native void nYGNodeStyleGetMaxHeight(long node, long __result);

    /** {@code YGValue YGNodeStyleGetMaxHeight(YGNodeConstRef node)} */
    public static YGValue YGNodeStyleGetMaxHeight(@NativeType("YGNodeConstRef") long node, YGValue __result) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleGetMaxHeight(node, __result.address());
        return __result;
    }

    // --- [ YGNodeStyleSetAspectRatio ] ---

    /** {@code void YGNodeStyleSetAspectRatio(YGNodeRef node, float aspectRatio)} */
    public static native void nYGNodeStyleSetAspectRatio(long node, float aspectRatio);

    /** {@code void YGNodeStyleSetAspectRatio(YGNodeRef node, float aspectRatio)} */
    public static void YGNodeStyleSetAspectRatio(@NativeType("YGNodeRef") long node, float aspectRatio) {
        if (CHECKS) {
            check(node);
        }
        nYGNodeStyleSetAspectRatio(node, aspectRatio);
    }

    // --- [ YGNodeStyleGetAspectRatio ] ---

    /** {@code float YGNodeStyleGetAspectRatio(YGNodeConstRef node)} */
    public static native float nYGNodeStyleGetAspectRatio(long node);

    /** {@code float YGNodeStyleGetAspectRatio(YGNodeConstRef node)} */
    public static float YGNodeStyleGetAspectRatio(@NativeType("YGNodeConstRef") long node) {
        if (CHECKS) {
            check(node);
        }
        return nYGNodeStyleGetAspectRatio(node);
    }

    // --- [ YGRoundValueToPixelGrid ] ---

    /** {@code float YGRoundValueToPixelGrid(double value, double pointScaleFactor, bool forceCeil, bool forceFloor)} */
    public static native float YGRoundValueToPixelGrid(double value, double pointScaleFactor, @NativeType("bool") boolean forceCeil, @NativeType("bool") boolean forceFloor);

    // --- [ YGValueAuto ] ---

    private static native void nYGValueAuto(long __result);

    private static YGValue YGValueAuto(YGValue __result) {
        nYGValueAuto(__result.address());
        return __result;
    }

    /** {@code YGValue YGValueAuto(void)} */
    public static final YGValue YGValueAuto = YGValueAuto(YGValue.create());

    // --- [ YGValueUndefined ] ---

    private static native void nYGValueUndefined(long __result);

    private static YGValue YGValueUndefined(YGValue __result) {
        nYGValueUndefined(__result.address());
        return __result;
    }

    /** {@code YGValue YGValueUndefined(void)} */
    public static final YGValue YGValueUndefined = YGValueUndefined(YGValue.create());

    // --- [ YGValueZero ] ---

    private static native void nYGValueZero(long __result);

    private static YGValue YGValueZero(YGValue __result) {
        nYGValueZero(__result.address());
        return __result;
    }

    /** {@code YGValue YGValueZero(void)} */
    public static final YGValue YGValueZero = YGValueZero(YGValue.create());

    // --- [ YGFloatIsUndefined ] ---

    /** {@code bool YGFloatIsUndefined(float value)} */
    @NativeType("bool")
    public static native boolean YGFloatIsUndefined(float value);

    // --- [ YGAlignToString ] ---

    /** {@code char const * YGAlignToString(YGAlign value)} */
    public static native long nYGAlignToString(int value);

    /** {@code char const * YGAlignToString(YGAlign value)} */
    @NativeType("char const *")
    public static String YGAlignToString(@NativeType("YGAlign") int value) {
        long __result = nYGAlignToString(value);
        return memASCII(__result);
    }

    // --- [ YGDimensionToString ] ---

    /** {@code char const * YGDimensionToString(YGDimension value)} */
    public static native long nYGDimensionToString(int value);

    /** {@code char const * YGDimensionToString(YGDimension value)} */
    @NativeType("char const *")
    public static String YGDimensionToString(@NativeType("YGDimension") int value) {
        long __result = nYGDimensionToString(value);
        return memASCII(__result);
    }

    // --- [ YGDirectionToString ] ---

    /** {@code char const * YGDirectionToString(YGDirection value)} */
    public static native long nYGDirectionToString(int value);

    /** {@code char const * YGDirectionToString(YGDirection value)} */
    @NativeType("char const *")
    public static String YGDirectionToString(@NativeType("YGDirection") int value) {
        long __result = nYGDirectionToString(value);
        return memASCII(__result);
    }

    // --- [ YGDisplayToString ] ---

    /** {@code char const * YGDisplayToString(YGDisplay value)} */
    public static native long nYGDisplayToString(int value);

    /** {@code char const * YGDisplayToString(YGDisplay value)} */
    @NativeType("char const *")
    public static String YGDisplayToString(@NativeType("YGDisplay") int value) {
        long __result = nYGDisplayToString(value);
        return memASCII(__result);
    }

    // --- [ YGEdgeToString ] ---

    /** {@code char const * YGEdgeToString(YGEdge value)} */
    public static native long nYGEdgeToString(int value);

    /** {@code char const * YGEdgeToString(YGEdge value)} */
    @NativeType("char const *")
    public static String YGEdgeToString(@NativeType("YGEdge") int value) {
        long __result = nYGEdgeToString(value);
        return memASCII(__result);
    }

    // --- [ YGErrataToString ] ---

    /** {@code char const * YGErrataToString(YGErrata value)} */
    public static native long nYGErrataToString(int value);

    /** {@code char const * YGErrataToString(YGErrata value)} */
    @NativeType("char const *")
    public static String YGErrataToString(@NativeType("YGErrata") int value) {
        long __result = nYGErrataToString(value);
        return memASCII(__result);
    }

    // --- [ YGExperimentalFeatureToString ] ---

    /** {@code char const * YGExperimentalFeatureToString(YGExperimentalFeature value)} */
    public static native long nYGExperimentalFeatureToString(int value);

    /** {@code char const * YGExperimentalFeatureToString(YGExperimentalFeature value)} */
    @NativeType("char const *")
    public static String YGExperimentalFeatureToString(@NativeType("YGExperimentalFeature") int value) {
        long __result = nYGExperimentalFeatureToString(value);
        return memASCII(__result);
    }

    // --- [ YGFlexDirectionToString ] ---

    /** {@code char const * YGFlexDirectionToString(YGFlexDirection value)} */
    public static native long nYGFlexDirectionToString(int value);

    /** {@code char const * YGFlexDirectionToString(YGFlexDirection value)} */
    @NativeType("char const *")
    public static String YGFlexDirectionToString(@NativeType("YGFlexDirection") int value) {
        long __result = nYGFlexDirectionToString(value);
        return memASCII(__result);
    }

    // --- [ YGGutterToString ] ---

    /** {@code char const * YGGutterToString(YGGutter value)} */
    public static native long nYGGutterToString(int value);

    /** {@code char const * YGGutterToString(YGGutter value)} */
    @NativeType("char const *")
    public static String YGGutterToString(@NativeType("YGGutter") int value) {
        long __result = nYGGutterToString(value);
        return memASCII(__result);
    }

    // --- [ YGJustifyToString ] ---

    /** {@code char const * YGJustifyToString(YGJustify value)} */
    public static native long nYGJustifyToString(int value);

    /** {@code char const * YGJustifyToString(YGJustify value)} */
    @NativeType("char const *")
    public static String YGJustifyToString(@NativeType("YGJustify") int value) {
        long __result = nYGJustifyToString(value);
        return memASCII(__result);
    }

    // --- [ YGLogLevelToString ] ---

    /** {@code char const * YGLogLevelToString(YGLogLevel value)} */
    public static native long nYGLogLevelToString(int value);

    /** {@code char const * YGLogLevelToString(YGLogLevel value)} */
    @NativeType("char const *")
    public static String YGLogLevelToString(@NativeType("YGLogLevel") int value) {
        long __result = nYGLogLevelToString(value);
        return memASCII(__result);
    }

    // --- [ YGMeasureModeToString ] ---

    /** {@code char const * YGMeasureModeToString(YGMeasureMode value)} */
    public static native long nYGMeasureModeToString(int value);

    /** {@code char const * YGMeasureModeToString(YGMeasureMode value)} */
    @NativeType("char const *")
    public static String YGMeasureModeToString(@NativeType("YGMeasureMode") int value) {
        long __result = nYGMeasureModeToString(value);
        return memASCII(__result);
    }

    // --- [ YGNodeTypeToString ] ---

    /** {@code char const * YGNodeTypeToString(YGNodeType value)} */
    public static native long nYGNodeTypeToString(int value);

    /** {@code char const * YGNodeTypeToString(YGNodeType value)} */
    @NativeType("char const *")
    public static String YGNodeTypeToString(@NativeType("YGNodeType") int value) {
        long __result = nYGNodeTypeToString(value);
        return memASCII(__result);
    }

    // --- [ YGOverflowToString ] ---

    /** {@code char const * YGOverflowToString(YGOverflow value)} */
    public static native long nYGOverflowToString(int value);

    /** {@code char const * YGOverflowToString(YGOverflow value)} */
    @NativeType("char const *")
    public static String YGOverflowToString(@NativeType("YGOverflow") int value) {
        long __result = nYGOverflowToString(value);
        return memASCII(__result);
    }

    // --- [ YGPositionTypeToString ] ---

    /** {@code char const * YGPositionTypeToString(YGPositionType value)} */
    public static native long nYGPositionTypeToString(int value);

    /** {@code char const * YGPositionTypeToString(YGPositionType value)} */
    @NativeType("char const *")
    public static String YGPositionTypeToString(@NativeType("YGPositionType") int value) {
        long __result = nYGPositionTypeToString(value);
        return memASCII(__result);
    }

    // --- [ YGUnitToString ] ---

    /** {@code char const * YGUnitToString(YGUnit value)} */
    public static native long nYGUnitToString(int value);

    /** {@code char const * YGUnitToString(YGUnit value)} */
    @NativeType("char const *")
    public static String YGUnitToString(@NativeType("YGUnit") int value) {
        long __result = nYGUnitToString(value);
        return memASCII(__result);
    }

    // --- [ YGWrapToString ] ---

    /** {@code char const * YGWrapToString(YGWrap value)} */
    public static native long nYGWrapToString(int value);

    /** {@code char const * YGWrapToString(YGWrap value)} */
    @NativeType("char const *")
    public static String YGWrapToString(@NativeType("YGWrap") int value) {
        long __result = nYGWrapToString(value);
        return memASCII(__result);
    }

}