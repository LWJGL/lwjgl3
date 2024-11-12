/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.yoga;

import org.jspecify.annotations.*;
import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.*;

import static java.lang.Float.*;
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

    final long node;

    private final long weakGlobalRef;

    private @Nullable YGMeasureFunc  measureFunc;
    private @Nullable YGBaselineFunc baselineFunc;

    private final List<YogaNode> children;

    private @Nullable YogaNode owner;

    private @Nullable Object data;

    YogaNode() {
        this(YGNodeNew());
    }

    YogaNode(YogaConfig config) {
        this(YGNodeNewWithConfig(config.handle));
    }

    private YogaNode(long node) {
        this.node = check(node);
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
        return (int)YGNodeGetChildCount(node);
    }

    public @Nullable YogaNode getOwner() {
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

    void setGap(YogaGutter gutter, float gap) {
        YGNodeStyleSetGap(node, gutter.value, gap);
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

    void setData(Object data) {
        this.data = data;
    }

    Object getData() {
        return data;
    }

    void setMeasureFunction(YGMeasureFuncI measureFunction) {
        YGMeasureFunc func = YGMeasureFunc.create(measureFunction);
        this.measureFunc = func;
        YGNodeSetMeasureFunc(node, func);
    }

    void setBaselineFunction(YGBaselineFuncI baselineFunc) {
        YGBaselineFunc func = YGBaselineFunc.create(baselineFunc);
        this.baselineFunc = func;
        YGNodeSetBaselineFunc(node, func);
    }

    boolean isMeasureDefined() {
        return YGNodeHasMeasureFunc(node);
    }

    boolean isBaselineDefined() {
        return YGNodeHasBaselineFunc(node);
    }

    void setIsReferenceBaseline(boolean isReferenceBaseline) {
        YGNodeSetIsReferenceBaseline(node, isReferenceBaseline);
    }

    void calculateLayout(float width, float height) {
        YGNodeCalculateLayout(node, width, height, YGNodeStyleGetDirection(node));
    }

    float getLayoutX() {
        return YGNodeLayoutGetLeft(node);
    }

    float getLayoutY() {
        return YGNodeLayoutGetTop(node);
    }

    float getLayoutWidth() {
        return YGNodeLayoutGetWidth(node);
    }

    float getLayoutHeight() {
        return YGNodeLayoutGetHeight(node);
    }

    YGValue getWidth(YGValue __result) {
        return YGNodeStyleGetWidth(node, __result);
    }

    YGValue getHeight(YGValue __result) {
        return YGNodeStyleGetHeight(node, __result);
    }

    YGValue getMinWidth(YGValue __result) {
        return YGNodeStyleGetMinWidth(node, __result);
    }

    YGValue getMinHeight(YGValue __result) {
        return YGNodeStyleGetMinHeight(node, __result);
    }

    YGValue getMaxWidth(YGValue __result) {
        return YGNodeStyleGetMaxWidth(node, __result);
    }

    YGValue getMaxHeight(YGValue __result) {
        return YGNodeStyleGetMaxHeight(node, __result);
    }

    float getAspectRatio() {
        return YGNodeStyleGetAspectRatio(node);
    }

    void copyStyle(YogaNode src) {
        YGNodeCopyStyle(this.node, src.node);
    }

    float getLayoutBorder(YogaEdge edge) {
        return YGNodeLayoutGetBorder(node, edge.value);
    }

    float getLayoutMargin(YogaEdge edge) {
        return YGNodeLayoutGetMargin(node, edge.value);
    }

    float getLayoutPadding(YogaEdge edge) {
        return YGNodeLayoutGetPadding(node, edge.value);
    }

    float getBorder(YogaEdge edge) {
        return YGNodeStyleGetBorder(node, edge.value);
    }

    int getFlexDirection() {
        return YGNodeStyleGetFlexDirection(node);
    }

    YGValue getMargin(YogaEdge edge, YogaValue __result) {
        return YGNodeStyleGetMargin(node, edge.value, __result);
    }

    YGValue getPadding(YogaEdge edge, YogaValue __result) {
        return YGNodeStyleGetPadding(node, edge.value, __result);
    }

    YGValue getPosition(YogaEdge edge, YogaValue __result) {
        return YGNodeStyleGetPosition(node, edge.value, __result);
    }

    void freeMeasureFunction() {
        if (measureFunc != null) {
            measureFunc.free();
            measureFunc = null;
        }
    }

    void freeBaselineFunction() {
        if (baselineFunc != null) {
            baselineFunc.free();
            baselineFunc = null;
        }
    }

    public void markLayoutSeen() {
        YGNodeSetHasNewLayout(node, false);
    }

    public boolean hasNewLayout() {
        return YGNodeGetHasNewLayout(node);
    }

    public void reset() {
        freeMeasureFunction();
        freeBaselineFunction();
        YGNodeReset(node);
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
        return YGNodeStyleGetFlexGrow(node);
    }

    float getFlexShrink() {
        return YGNodeStyleGetFlexShrink(node);
    }

    YogaValue getFlexBasis(YogaValue __result) {
        YGNodeStyleGetFlexBasis(node, __result);
        return __result;
    }

    static <T extends Struct<T>> boolean assertEquals(T a, T b) {
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
        static final YogaValue UNDEFINED = YogaValue.create(YogaConstants.UNDEFINED, YogaUnit.UNDEFINED);
        static final YogaValue ZERO      = YogaValue.create(0.0f, YogaUnit.POINT);
        static final YogaValue AUTO      = YogaValue.create(YogaConstants.UNDEFINED, YogaUnit.AUTO);

        YogaValue(long address, @Nullable ByteBuffer container) {
            super(address, container);
        }

        public static YogaValue create(float value, int unit) {
            ByteBuffer container = BufferUtils.createByteBuffer(YGValue.SIZEOF);
            YogaValue v = new YogaValue(memAddress(container), container);
            v.set(value, unit);
            return v;
        }

        public static YogaValue malloc(MemoryStack stack) {
            return new YogaValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
        }

        public static YogaValue create(MemoryStack stack, float value, int unit) {
            YogaValue v = malloc(stack);
            v.set(value, unit);
            return v;
        }

        @Override
        public boolean equals(Object o) {
            YogaValue other = (YogaValue)o;

            return floatToRawIntBits(this.value()) == floatToRawIntBits(other.value()) && this.unit() == other.unit();
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
        SPACE_AROUND(YGAlignSpaceAround),
        SPACE_EVENLY(YGAlignSpaceEvenly);

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

    enum YogaGutter implements EnumWrapper {
        COLUMN(YGGutterColumn),
        ROW(YGGutterRow),
        ALL(YGGutterAll);

        final int value;

        YogaGutter(int value) {
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