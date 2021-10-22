/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import javax.annotation.*;
import java.nio.*;
import java.util.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;
import static org.lwjgl.util.yoga.Yoga.*;

/**
 * Wraps the C API in an OO-wrapper class.
 *
 * <p>This is done for compatibility with Yoga's test suite. It is not recommended for production, as it would negate the performance benefit of using the
 * LWJGL bindings.</p>
 */
class YogaNode {

    /** Set to true to access Yoga data structures directly, instead of going through the JNI bindings. */
    private static final boolean INTERNAL_API = false;

    final long node;

    private final YGNode internal;

    private final long weakGlobalRef;

    private final List<YogaNode> children;

    @Nullable
    private YogaNode owner;

    YogaNode() {
        this(YGNodeNew());
    }

    YogaNode(YogaConfig config) {
        this(YGNodeNewWithConfig(config.handle));
    }

    private YogaNode(long node) {
        this.node = check(node);
        this.internal = YGNode.create(node);
        this.weakGlobalRef = NewWeakGlobalRef(this);
        YGNodeSetContext(node, weakGlobalRef);
        children = new ArrayList<>();
    }

    static YogaNode create(long node) {
        return memGlobalRefToObject(YGNodeGetContext(node));
    }

    static YogaNode createNode() {
        return new YogaNode();
    }

    static YogaNode createNode(YogaConfig config) {
        return new YogaNode(config);
    }

    @Override
    public YogaNode clone() {
        YogaNode clone = new YogaNode(YGNodeClone(node));
        clone.children.addAll(children);
        return clone;
    }

    public YogaNode clone(long owner) {
        YogaNode clone = clone();
        clone.owner = create(owner);
        return clone;
    }

    public YogaNode cloneWithNewChildren() {
        YogaNode clone = new YogaNode(YGNodeClone(this.node));
        YGNodeRemoveAllChildren(clone.node);
        return clone;
    }

    @Override
    protected void finalize() {
        DeleteWeakGlobalRef(weakGlobalRef);
        YGNodeFree(node);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        YogaNode yogaNode = (YogaNode)o;
        return node == yogaNode.node;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(node);
    }

    void addChildAt(YogaNode child, int index) {
        YGNodeInsertChild(node, child.node, index);
        children.add(index, child);
        child.owner = this;
    }

    public YogaNode getChildAt(int index) {
        return create(YGNodeGetChild(node, index));
    }

    public void removeChildAt(int index) {
        YGNodeRemoveChild(node, YGNodeGetChild(node, index));
        children.remove(index).owner = null;
    }

    int getChildCount() {
        return YGNodeGetChildCount(node);
    }

    @Nullable
    public YogaNode getOwner() {
        long owner = YGNodeGetOwner(node);
        return owner == NULL ? null : create(owner);
    }

    void setAlignContent(YogaAlign alignContent) {
        YGNodeStyleSetAlignContent(node, alignContent.value);
    }

    void setAlignItems(YogaAlign alignItems) {
        YGNodeStyleSetAlignItems(node, alignItems.value);
    }

    void setAlignSelf(YogaAlign alignSelf) {
        YGNodeStyleSetAlignSelf(node, alignSelf.value);
    }

    void setBorder(YogaEdge edge, float border) {
        YGNodeStyleSetBorder(node, edge.value, border);
    }

    void setDirection(YogaDirection direction) {
        YGNodeStyleSetDirection(node, direction.value);
    }

    void setDisplay(YogaDisplay display) {
        YGNodeStyleSetDisplay(node, display.value);
    }

    void setFlexBasis(float flexBasis) {
        YGNodeStyleSetFlexBasis(node, flexBasis);
    }

    void setFlexBasisPercent(float flexBasis) {
        YGNodeStyleSetFlexBasisPercent(node, flexBasis);
    }

    void setFlexBasisAuto() {
        YGNodeStyleSetFlexBasisAuto(node);
    }

    void setFlexGrow(float flexGrow) {
        YGNodeStyleSetFlexGrow(node, flexGrow);
    }

    void setFlex(float flex) {
        YGNodeStyleSetFlex(node, flex);
    }

    void setFlexShrink(float flexShrink) {
        YGNodeStyleSetFlexShrink(node, flexShrink);
    }

    void setJustifyContent(YogaJustify justifyContent) {
        YGNodeStyleSetJustifyContent(node, justifyContent.value);
    }

    void setWidth(float width) {
        YGNodeStyleSetWidth(node, width);
    }

    void setWidthPercent(float width) {
        YGNodeStyleSetWidthPercent(node, width);
    }

    void setMinWidth(float minWidth) {
        YGNodeStyleSetMinWidth(node, minWidth);
    }

    void setMaxWidth(float maxWidth) {
        YGNodeStyleSetMaxWidth(node, maxWidth);
    }

    void setMinWidthPercent(float minWidth) {
        YGNodeStyleSetMinWidthPercent(node, minWidth);
    }

    void setMaxWidthPercent(float maxWidth) {
        YGNodeStyleSetMaxWidthPercent(node, maxWidth);
    }

    void setHeight(float height) {
        YGNodeStyleSetHeight(node, height);
    }

    void setHeightPercent(float height) {
        YGNodeStyleSetHeightPercent(node, height);
    }

    void setMinHeight(float minHeight) {
        YGNodeStyleSetMinHeight(node, minHeight);
    }

    void setMaxHeight(float maxHeight) {
        YGNodeStyleSetMaxHeight(node, maxHeight);
    }

    void setMinHeightPercent(float minHeight) {
        YGNodeStyleSetMinHeightPercent(node, minHeight);
    }

    void setMaxHeightPercent(float maxHeight) {
        YGNodeStyleSetMaxHeightPercent(node, maxHeight);
    }

    void setAspectRatio(float aspectRatio) {
        YGNodeStyleSetAspectRatio(node, aspectRatio);
    }

    void setPositionType(YogaPositionType type) {
        YGNodeStyleSetPositionType(node, type.value);
    }

    void setPosition(YogaEdge edge, float position) {
        YGNodeStyleSetPosition(node, edge.value, position);
    }

    void setPositionPercent(YogaEdge edge, float position) {
        YGNodeStyleSetPositionPercent(node, edge.value, position);
    }

    void setFlexDirection(YogaFlexDirection direction) {
        YGNodeStyleSetFlexDirection(node, direction.value);
    }

    void setMargin(YogaEdge edge, float margin) {
        YGNodeStyleSetMargin(node, edge.value, margin);
    }

    void setMarginPercent(YogaEdge edge, float margin) {
        YGNodeStyleSetMarginPercent(node, edge.value, margin);
    }

    void setMarginAuto(YogaEdge edge) {
        YGNodeStyleSetMarginAuto(node, edge.value);
    }

    void setOverflow(YogaOverflow overflow) {
        YGNodeStyleSetOverflow(node, overflow.value);
    }

    void setPadding(YogaEdge edge, float padding) {
        YGNodeStyleSetPadding(node, edge.value, padding);
    }

    void setPaddingPercent(YogaEdge edge, float padding) {
        YGNodeStyleSetPaddingPercent(node, edge.value, padding);
    }

    void setWrap(YogaWrap flexWrap) {
        YGNodeStyleSetFlexWrap(node, flexWrap.value);
    }

    void setMeasureFunction(YGMeasureFuncI measureFunction) {
        YGNodeSetMeasureFunc(node, measureFunction);
    }

    void setBaselineFunction(YGBaselineFuncI baselineFunc) {
        YGNodeSetBaselineFunc(node, baselineFunc);
    }

    boolean isMeasureDefined() {
        return INTERNAL_API
            ? internal.measure_noContext() != null
            : YGNodeHasMeasureFunc(node);
    }

    boolean isBaselineDefined() {
        return INTERNAL_API
            ? internal.baseline_noContext() != null
            : YGNodeHasBaselineFunc(node);
    }

    void setIsReferenceBaseline(boolean isReferenceBaseline) {
        YGNodeSetIsReferenceBaseline(node, isReferenceBaseline);
    }

    void calculateLayout(float width, float height) {
        YGNodeCalculateLayout(node, width, height, YGNodeStyleGetDirection(node));
    }

    float getLayoutX() {
        return INTERNAL_API
            ? internal.layout().positions(YGEdgeLeft)
            : YGNodeLayoutGetLeft(node);
    }

    float getLayoutY() {
        return INTERNAL_API
            ? internal.layout().positions(YGEdgeTop)
            : YGNodeLayoutGetTop(node);
    }

    float getLayoutWidth() {
        return INTERNAL_API
            ? internal.layout().dimensions(YGDimensionWidth)
            : YGNodeLayoutGetWidth(node);
    }

    float getLayoutHeight() {
        return INTERNAL_API
            ? internal.layout().dimensions(YGDimensionHeight)
            : YGNodeLayoutGetHeight(node);
    }

    YGValue getWidth(YGValue __result) {
        return INTERNAL_API
            ? internal.style().dimensions(YGDimensionWidth).decode(__result)
            : YGNodeStyleGetWidth(node, __result);
    }

    YGValue getHeight(YGValue __result) {
        return INTERNAL_API
            ? internal.style().dimensions(YGDimensionHeight).decode(__result)
            : YGNodeStyleGetHeight(node, __result);
    }

    YGValue getMinWidth(YGValue __result) {
        return INTERNAL_API
            ? internal.style().minDimensions(YGDimensionWidth).decode(__result)
            : YGNodeStyleGetMinWidth(node, __result);
    }

    YGValue getMinHeight(YGValue __result) {
        return INTERNAL_API
            ? internal.style().minDimensions(YGDimensionHeight).decode(__result)
            : YGNodeStyleGetMinHeight(node, __result);
    }

    YGValue getMaxWidth(YGValue __result) {
        return INTERNAL_API
            ? internal.style().maxDimensions(YGDimensionWidth).decode(__result)
            : YGNodeStyleGetMaxWidth(node, __result);
    }

    YGValue getMaxHeight(YGValue __result) {
        return INTERNAL_API
            ? internal.style().maxDimensions(YGDimensionHeight).decode(__result)
            : YGNodeStyleGetMaxHeight(node, __result);
    }

    float getAspectRatio() {
        return INTERNAL_API
            ? internal.style().aspectRatio().value()
            : YGNodeStyleGetAspectRatio(node);
    }

    void copyStyle(YogaNode src) {
        YGNodeCopyStyle(this.node, src.node);
    }

    float getLayoutBorder(YogaEdge edge) {
        return INTERNAL_API
            ? internal.layout().border(edge.value)
            : YGNodeLayoutGetBorder(node, edge.value);
    }

    float getLayoutMargin(YogaEdge edge) {
        return INTERNAL_API
            ? internal.layout().margin(edge.value)
            : YGNodeLayoutGetMargin(node, edge.value);
    }

    float getLayoutPadding(YogaEdge edge) {
        return INTERNAL_API
            ? internal.layout().padding(edge.value)
            : YGNodeLayoutGetPadding(node, edge.value);
    }

    float getBorder(YogaEdge edge) {
        return INTERNAL_API
            ? internal.style().border(edge.value).decode()
            : YGNodeStyleGetBorder(node, edge.value);
    }

    int getFlexDirection() {
        return INTERNAL_API
            ? internal.style().flexDirection()
            : YGNodeStyleGetFlexDirection(node);
    }

    YGValue getMargin(YogaEdge edge, YGValue __result) {
        return INTERNAL_API
            ? internal.style().margin(edge.value).decode(__result)
            : YGNodeStyleGetMargin(node, edge.value, __result);
    }

    YGValue getPadding(YogaEdge edge, YGValue __result) {
        return INTERNAL_API
            ? internal.style().padding(edge.value).decode(__result)
            : YGNodeStyleGetPadding(node, edge.value, __result);
    }

    YGValue getPosition(YogaEdge edge, YGValue __result) {
        return INTERNAL_API
            ? internal.style().positions(edge.value).decode(__result)
            : YGNodeStyleGetPosition(node, edge.value, __result);
    }

    public boolean getDoesLegacyStretchFlagAffectsLayout() {
        return INTERNAL_API
            ? internal.layout().doesLegacyStretchFlagAffectsLayout()
            : YGNodeLayoutGetDidLegacyStretchFlagAffectLayout(node);
    }

    @Nullable
    YGMeasureFunc getMeasureFunction() {
        return internal.measure_noContext();
    }

    @Nullable
    YGBaselineFunc getBaselineFunction() {
        return internal.baseline_noContext();
    }

    public void markLayoutSeen() {
        YGNodeSetHasNewLayout(node, false);
    }

    public boolean hasNewLayout() {
        return INTERNAL_API
            ? internal.hasNewLayout()
            : YGNodeGetHasNewLayout(node);
    }

    public void reset() {
        YGMeasureFunc measureFunc = getMeasureFunction();
        if (measureFunc != null) {
            measureFunc.free();
        }
        YGBaselineFunc baselineFunc = getBaselineFunction();
        if (baselineFunc != null) {
            baselineFunc.free();
        }
        YGNodeReset(node);
    }

    private interface EnumWrapper {
        int getValue();
    }

    private static <T extends EnumWrapper> T getEnumFromValue(T[] values, int value) {
        for (T t : values) {
            if (t.getValue() == value) {
                return t;
            }
        }
        throw new IllegalStateException();
    }

    YogaDirection getStyleDirection() {
        return getEnumFromValue(YogaDirection.values(), YGNodeStyleGetDirection(node));
    }

    YogaDirection getLayoutDirection() {
        return getEnumFromValue(YogaDirection.values(), YGNodeLayoutGetDirection(node));
    }

    YogaJustify getJustifyContent() {
        return getEnumFromValue(YogaJustify.values(), YGNodeStyleGetJustifyContent(node));
    }

    YogaAlign getAlignItems() {
        return getEnumFromValue(YogaAlign.values(), YGNodeStyleGetAlignItems(node));
    }

    YogaAlign getAlignSelf() {
        return getEnumFromValue(YogaAlign.values(), YGNodeStyleGetAlignSelf(node));
    }

    YogaAlign getAlignContent() {
        return getEnumFromValue(YogaAlign.values(), YGNodeStyleGetAlignContent(node));
    }

    YogaPositionType getPositionType() {
        return getEnumFromValue(YogaPositionType.values(), YGNodeStyleGetPositionType(node));
    }

    YogaOverflow getOverflow() {
        return getEnumFromValue(YogaOverflow.values(), YGNodeStyleGetOverflow(node));
    }

    YogaDisplay getDisplay() {
        return getEnumFromValue(YogaDisplay.values(), YGNodeStyleGetDisplay(node));
    }

    float getFlexGrow() {
        if (INTERNAL_API) {
            YGFloatOptional value = internal.style().flexGrow();
            return value.isUndefined() ? 0.0f : value.value();
        }
        return YGNodeStyleGetFlexGrow(node);
    }

    float getFlexShrink() {
        if (INTERNAL_API) {
            YGFloatOptional value = internal.style().flexShrink();
            return value.isUndefined()
                ? internal.useWebDefaults() ? 1.0f : 0.0f
                : value.value();
        }
        return YGNodeStyleGetFlexShrink(node);
    }

    YGValue getFlexBasis(YGValue __result) {
        return INTERNAL_API
            ? internal.style().flexBasis().decode(__result)
            : YGNodeStyleGetFlexBasis(node, __result);
    }

    static <T extends Struct> boolean assertEquals(T a, T b) {
        for (int i = 0; i < a.sizeof(); i++) {
            if (memGetByte(a.address() + i) != memGetByte(b.address() + i)) {
                return false;
            }
        }
        return true;
    }

    static final class YogaConstants {
        static final float UNDEFINED = YGUndefined;

        private YogaConstants() {
        }

        static boolean isUndefined(YGValue value) {
            return isUndefined(value.value());
        }

        static boolean isUndefined(float value) {
            return YGFloatIsUndefined(value);
        }
    }

    static final class YogaUnit {
        static final int UNDEFINED = YGUnitUndefined;
        static final int POINT     = YGUnitPoint;
        static final int PERCENT   = YGUnitPercent;
        static final int AUTO      = YGUnitAuto;

        private YogaUnit() {
        }
    }

    static final class YogaValue extends YGValue {
        static final YGValue UNDEFINED = YGValue.create().set(YogaConstants.UNDEFINED, YogaUnit.UNDEFINED);
        static final YGValue ZERO      = YGValue.create().set(0, YogaUnit.POINT);
        static final YGValue AUTO      = YGValue.create().set(YogaConstants.UNDEFINED, YogaUnit.AUTO);

        YogaValue(ByteBuffer container) {
            super(container);
        }

        public static YogaValue create(MemoryStack stack, float value, int unit) {
            YogaValue v = wrap(YogaValue.class, stack.nmalloc(ALIGNOF, SIZEOF));
            v.set(value, unit);
            return v;
        }
    }

    enum YogaAlign implements EnumWrapper {
        AUTO(YGAlignAuto),
        FLEX_START(YGAlignFlexStart),
        CENTER(YGAlignCenter),
        FLEX_END(YGAlignFlexEnd),
        STRETCH(YGAlignStretch),
        BASELINE(YGAlignBaseline),
        SPACE_BETWEEN(YGAlignSpaceBetween),
        SPACE_AROUND(YGAlignSpaceAround);

        final int value;

        YogaAlign(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }

    enum YogaDirection implements EnumWrapper {
        INHERIT(YGDirectionInherit),
        LTR(YGDirectionLTR),
        RTL(YGDirectionRTL);

        final int value;

        YogaDirection(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }

    enum YogaDisplay implements EnumWrapper {
        FLEX(YGDisplayFlex),
        NONE(YGDisplayNone);

        final int value;

        YogaDisplay(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }

    enum YogaEdge implements EnumWrapper {
        LEFT(YGEdgeLeft),
        TOP(YGEdgeTop),
        RIGHT(YGEdgeRight),
        BOTTOM(YGEdgeBottom),
        START(YGEdgeStart),
        END(YGEdgeEnd),
        HORIZONTAL(YGEdgeHorizontal),
        VERTICAL(YGEdgeVertical),
        ALL(YGEdgeAll);

        final int value;

        YogaEdge(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }

    enum YogaExperimentalFeature implements EnumWrapper {
        WEB_FLEX_BASIS(YGExperimentalFeatureWebFlexBasis);

        final int value;

        YogaExperimentalFeature(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }

    enum YogaFlexDirection implements EnumWrapper {
        COLUMN(YGFlexDirectionColumn),
        COLUMN_REVERSE(YGFlexDirectionColumnReverse),
        ROW(YGFlexDirectionRow),
        ROW_REVERSE(YGFlexDirectionRowReverse);

        final int value;

        YogaFlexDirection(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }

    enum YogaJustify implements EnumWrapper {
        FLEX_START(YGJustifyFlexStart),
        CENTER(YGJustifyCenter),
        FLEX_END(YGJustifyFlexEnd),
        SPACE_BETWEEN(YGJustifySpaceBetween),
        SPACE_AROUND(YGJustifySpaceAround),
        SPACE_EVENLY(YGJustifySpaceEvenly);

        final int value;

        YogaJustify(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }

    enum YogaOverflow implements EnumWrapper {
        VISIBLE(YGOverflowVisible),
        HIDDEN(YGOverflowHidden),
        SCROLL(YGOverflowScroll);

        final int value;

        YogaOverflow(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }

    enum YogaPositionType implements EnumWrapper {
        STATIC(YGPositionTypeStatic),
        RELATIVE(YGPositionTypeRelative),
        ABSOLUTE(YGPositionTypeAbsolute);

        final int value;

        YogaPositionType(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }

    enum YogaWrap implements EnumWrapper {
        NO_WRAP(YGWrapNoWrap),
        WRAP(YGWrapWrap),
        WRAP_REVERSE(YGWrapReverse);

        final int value;

        YogaWrap(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }

}