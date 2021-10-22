/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.util.yoga.YogaNode.*;
import static org.testng.AssertJUnit.*;

@SuppressWarnings("MisorderedAssertEqualsArgumentsTestNG")
public class YogaNodeStylePropertiesTest {

    private static final float UNDEFINED = YogaConstants.UNDEFINED;

    @Test
    public void testDirectionDefault() {
        YogaNode node = createNode();

        assertEquals(node.getStyleDirection(), YogaDirection.INHERIT);
        assertEquals(node.getLayoutDirection(), YogaDirection.INHERIT);
    }

    @Test
    public void testDirectionAssignment() {
        YogaNode node = createNode();
        node.setDirection(YogaDirection.LTR);
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(YogaDirection.LTR, node.getStyleDirection());
        assertEquals(YogaDirection.LTR, node.getLayoutDirection());
    }

    @Test
    public void testDirectionAffectsLayout() {
        YogaNode node =
            style().direction(YogaDirection.RTL).width(200).children(style().widthPercent(40)).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(120, node.getChildAt(0).getLayoutX(), 0);
    }

    @Test
    public void testFlexDirectionDefault() {
        YogaNode node = createNode();

        assertEquals(YogaFlexDirection.COLUMN.value, node.getFlexDirection());
    }

    @Test
    public void testFlexDirectionAssignment() {
        YogaNode node = style().flexDirection(YogaFlexDirection.COLUMN_REVERSE).node();

        assertEquals(YogaFlexDirection.COLUMN_REVERSE.value, node.getFlexDirection());
    }

    @Test
    public void testFlexDirectionAffectsLayout() {
        YogaNode node =
            style()
                .flexDirection(YogaFlexDirection.ROW_REVERSE)
                .width(200)
                .children(style().widthPercent(40))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(120, node.getChildAt(0).getLayoutX(), 0);
    }

    @Test
    public void testJustifyContentDefault() {
        YogaNode node = createNode();

        assertEquals(YogaJustify.FLEX_START, node.getJustifyContent());
    }

    @Test
    public void testJustifyContentAssignment() {
        YogaNode node = createNode();
        node.setJustifyContent(YogaJustify.SPACE_EVENLY);

        assertEquals(YogaJustify.SPACE_EVENLY, node.getJustifyContent());
    }

    @Test
    public void testJustifyContentAffectsLayout() {
        YogaNode node =
            style()
                .justifyContent(YogaJustify.CENTER)
                .height(200)
                .children(style().heightPercent(40))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(60, node.getChildAt(0).getLayoutY(), 0);
    }

    @Test
    public void testAlignItemsDefault() {
        YogaNode node = createNode();

        assertEquals(YogaAlign.STRETCH, node.getAlignItems());
    }

    @Test
    public void testAlignItemsAssignment() {
        YogaNode node = createNode();
        node.setAlignItems(YogaAlign.SPACE_AROUND);

        assertEquals(YogaAlign.SPACE_AROUND, node.getAlignItems());
    }

    @Test
    public void testAlignItemsAffectsLayout() {
        YogaNode node =
            style().alignItems(YogaAlign.CENTER).height(200).children(style().widthPercent(40)).node();
        node.calculateLayout(200, UNDEFINED);

        assertEquals(60, node.getChildAt(0).getLayoutX(), 0);
    }

    @Test
    public void testAlignSelfDefault() {
        YogaNode node = createNode();

        assertEquals(YogaAlign.AUTO, node.getAlignSelf());
    }

    @Test
    public void testAlignSelfAssignment() {
        YogaNode node = createNode();
        node.setAlignSelf(YogaAlign.FLEX_END);

        assertEquals(YogaAlign.FLEX_END, node.getAlignSelf());
    }

    @Test
    public void testAlignSelfAffectsLayout() {
        YogaNode node =
            style().height(200).children(style().alignSelf(YogaAlign.CENTER).widthPercent(40)).node();
        node.calculateLayout(200, UNDEFINED);

        assertEquals(60, node.getChildAt(0).getLayoutX(), 0);
    }

    @Test
    public void testAlignContentDefault() {
        YogaNode node = createNode();

        assertEquals(YogaAlign.FLEX_START, node.getAlignContent());
    }

    @Test
    public void testAlignContentAssignment() {
        YogaNode node = createNode();
        node.setAlignContent(YogaAlign.BASELINE);

        assertEquals(YogaAlign.BASELINE, node.getAlignContent());
    }

    @Test
    public void testAlignContentAffectsLayout() {
        YogaNode node =
            style()
                .alignContent(YogaAlign.SPACE_AROUND)
                .flexWrap(YogaWrap.WRAP)
                .height(200)
                .width(200)
                .children(
                    style().widthPercent(20).heightPercent(60),
                    style().widthPercent(20).heightPercent(60))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(30, node.getChildAt(0).getLayoutX(), 0);
    }

    @Test
    public void testPositionTypeDefault() {
        YogaNode node = createNode();

        assertEquals(YogaPositionType.STATIC, node.getPositionType());
    }

    @Test
    public void testPositionTypeAssignment() {
        YogaNode node = createNode();
        node.setPositionType(YogaPositionType.ABSOLUTE);

        assertEquals(YogaPositionType.ABSOLUTE, node.getPositionType());
    }

    @Test
    public void testPositionTypeAffectsLayout() {
        YogaNode node =
            style()
                .height(200)
                .children(
                    style().height(100), style().height(100).positionType(YogaPositionType.ABSOLUTE))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(0, node.getChildAt(1).getLayoutY(), 0);
    }

    @Test
    public void testWrapAffectsLayout() {
        YogaNode node =
            style()
                .width(200)
                .height(200)
                .flexWrap(YogaWrap.WRAP_REVERSE)
                .children(style().width(10).heightPercent(60), style().heightPercent(60))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(190, node.getChildAt(0).getLayoutX(), 0);
    }

    @Test
    public void testOverflowDefault() {
        YogaNode node = createNode();

        assertEquals(YogaOverflow.VISIBLE, node.getOverflow());
    }

    @Test
    public void testOverflowAssignment() {
        YogaNode node = createNode();
        node.setOverflow(YogaOverflow.SCROLL);

        assertEquals(YogaOverflow.SCROLL, node.getOverflow());
    }

    // TODO add testOverflowAffectsLayout()

    @Test
    public void testDisplayDefault() {
        YogaNode node = createNode();

        assertEquals(YogaDisplay.FLEX, node.getDisplay());
    }

    @Test
    public void testDisplayAssignment() {
        YogaNode node = createNode();
        node.setDisplay(YogaDisplay.NONE);

        assertEquals(YogaDisplay.NONE, node.getDisplay());
    }

    @Test
    public void testDisplayAffectsLayout() {
        YogaNode node =
            style().children(style().flexGrow(1).display(YogaDisplay.NONE), style().flexGrow(1)).node();
        node.calculateLayout(200, 200);

        assertEquals(200, node.getChildAt(1).getLayoutHeight(), 0);
    }

    @Test
    public void testFlexAffectsLayoutGrowing() {
        YogaNode node = style().height(200).children(style().height(100).flex(1.25f)).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(200, node.getChildAt(0).getLayoutHeight(), 0);
    }

    @Test
    public void testFlexAffectsLayoutShrinking() {
        YogaNode node = style().height(200).children(style().height(300).flex(1.25f)).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(200, node.getChildAt(0).getLayoutHeight(), 0);
    }

    @Test
    public void testFlexGrowDefault() {
        YogaNode node = createNode();

        assertEquals(0, node.getFlexGrow(), 0);
    }

    @Test
    public void testFlexGrowAssignment() {
        YogaNode node = createNode();
        node.setFlexGrow(2.5f);

        assertEquals(2.5f, node.getFlexGrow(), 0);
    }

    @Test
    public void testFlexGrowAffectsLayout() {
        YogaNode node =
            style().height(200).children(style().height(50).flexGrow(1), style().height(50)).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(150, node.getChildAt(0).getLayoutHeight(), 0);
    }

    @Test
    public void testFlexShrinkDefault() {
        YogaNode node = createNode();

        assertEquals(0, node.getFlexShrink(), 0);
    }

    @Test
    public void testFlexShrinkAssignment() {
        YogaNode node = createNode();
        node.setFlexShrink(2.5f);

        assertEquals(2.5f, node.getFlexShrink(), 0);
    }

    @Test
    public void testFlexShrinkAffectsLayout() {
        YogaNode node =
            style().height(200).children(style().height(150).flexShrink(1), style().height(150)).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(50, node.getChildAt(0).getLayoutHeight(), 0);
    }

    @Test
    public void testFlexBasisDefault() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            assertEquals(YogaValue.AUTO, node.getFlexBasis(v));
        }
    }

    @Test
    public void testFlexBasisAssignment() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);

            node.setFlexBasis(50);
            assertEquals(YogaValue.create(stack, 50, YogaUnit.POINT), node.getFlexBasis(v));

            node.setFlexBasisPercent(20);
            assertEquals(YogaValue.create(stack, 20, YogaUnit.PERCENT), node.getFlexBasis(v));

            node.setFlexBasisAuto();
            assertEquals(YogaValue.AUTO, node.getFlexBasis(v));
        }
    }

    @Test
    public void testFlexBasisAffectsLayout() {
        YogaNode node =
            style()
                .height(200)
                .children(style().flexBasis(150).flexShrink(1), style().flexBasis(150).flexShrink(1))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(100, node.getChildAt(0).getLayoutHeight(), 0);
    }

    @Test
    public void testFlexBasisPercentAffectsLayout() {
        YogaNode node =
            style()
                .height(200)
                .children(style().flexBasisPercent(60), style().flexBasisPercent(40))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(80, node.getChildAt(1).getLayoutHeight(), 0);
    }

    @Test
    public void testMarginDefault() {
        YogaNode node = createNode();
        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            for (YogaEdge edge : YogaEdge.values()) {
                assertEquals(YogaValue.UNDEFINED, node.getMargin(edge, v));
            }
        }
    }

    @Test
    public void testMarginAssignment() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            for (YogaEdge edge : YogaEdge.values()) {
                node.setMargin(edge, 25);
                assertEquals(YogaValue.create(stack, 25, YogaUnit.POINT), node.getMargin(edge, v));

                node.setMarginPercent(edge, 5);
                assertEquals(YogaValue.create(stack, 5, YogaUnit.PERCENT), node.getMargin(edge, v));

                node.setMarginAuto(edge);
                assertEquals(YogaValue.AUTO, node.getMargin(edge, v));
            }
        }
    }

    @Test
    public void testMarginPointAffectsLayout() {
        YogaNode node = style().margin(YogaEdge.TOP, 42).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(42, node.getLayoutY(), 0);
    }

    @Test
    public void testMarginPercentAffectsLayout() {
        YogaNode node =
            style().height(200).children(style().flexGrow(1).marginPercent(YogaEdge.TOP, 20)).node();
        node.calculateLayout(200, 200);

        assertEquals(40, node.getChildAt(0).getLayoutY(), 0);
    }

    @Test
    public void testMarginAutoAffectsLayout() {
        YogaNode node =
            style()
                .width(200)
                .flexDirection(YogaFlexDirection.ROW)
                .children(style().marginAuto(YogaEdge.LEFT).marginAuto(YogaEdge.RIGHT).width(100))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(50, node.getChildAt(0).getLayoutX(), 0);
    }

    @Test
    public void testPaddingDefault() {
        YogaNode node = createNode();
        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            for (YogaEdge edge : YogaEdge.values()) {
                assertEquals(YogaValue.UNDEFINED, node.getPadding(edge, v));
            }
        }
    }

    @Test
    public void testPaddingAssignment() {
        YogaNode node = createNode();
        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            for (YogaEdge edge : YogaEdge.values()) {
                node.setPadding(edge, 25);
                assertEquals(YogaValue.create(stack, 25, YogaUnit.POINT), node.getPadding(edge, v));

                node.setPaddingPercent(edge, 5);
                assertEquals(YogaValue.create(stack, 5, YogaUnit.PERCENT), node.getPadding(edge, v));
            }
        }
    }

    @Test
    public void testPaddingPointAffectsLayout() {
        YogaNode node = style().padding(YogaEdge.TOP, 42).children(style()).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(42, node.getChildAt(0).getLayoutY(), 0);
    }

    @Test
    public void testPaddingPercentAffectsLayout() {
        YogaNode node =
            style().height(200).paddingPercent(YogaEdge.TOP, 20).children(style().flexGrow(1)).node();
        node.calculateLayout(200, 200);

        assertEquals(40, node.getChildAt(0).getLayoutY(), 0);
    }

    @Test
    public void testBorderDefault() {
        YogaNode node = createNode();
        for (YogaEdge edge : YogaEdge.values()) {
            assertEquals(UNDEFINED, node.getBorder(edge));
        }
    }

    @Test
    public void testBorderAssignment() {
        YogaNode node = createNode();
        for (YogaEdge edge : YogaEdge.values()) {
            node.setBorder(edge, 2.5f);
            assertEquals(2.5f, node.getBorder(edge), 0);
        }
    }

    @Test
    public void testBorderAffectsLayout() {
        YogaNode node = style().border(YogaEdge.TOP, 42).children(style()).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(42, node.getChildAt(0).getLayoutY(), 0);
    }

    @Test
    public void testPositionDefault() {
        try (MemoryStack stack = stackPush()) {
            YGValue  v    = YGValue.malloc(stack);
            YogaNode node = createNode();
            for (YogaEdge edge : YogaEdge.values()) {
                assertEquals(YogaValue.UNDEFINED, node.getPosition(edge, v));
            }
        }
    }

    @Test
    public void testPositionAssignment() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            for (YogaEdge edge : YogaEdge.values()) {
                node.setPosition(edge, 25);
                assertEquals(YogaValue.create(stack, 25, YogaUnit.POINT), node.getPosition(edge, v));

                node.setPositionPercent(edge, 5);
                assertEquals(YogaValue.create(stack, 5, YogaUnit.PERCENT), node.getPosition(edge, v));
            }
        }
    }

    @Test
    public void testPositionAffectsLayout() {
        YogaNode node =
            style()
                .height(100)
                .children(
                    style()
                        .positionType(YogaPositionType.ABSOLUTE)
                        .position(YogaEdge.TOP, 11)
                        .position(YogaEdge.BOTTOM, 22))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(67, node.getChildAt(0).getLayoutHeight(), 0);
    }

    @Test
    public void testPositionPercentAffectsLayout() {
        YogaNode node =
            style()
                .width(100)
                .children(
                    style()
                        .positionType(YogaPositionType.ABSOLUTE)
                        .positionPercent(YogaEdge.LEFT, 11)
                        .positionPercent(YogaEdge.RIGHT, 22))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(67, node.getChildAt(0).getLayoutWidth(), 0);
    }

    @Test
    public void testWidthDefault() {
        YogaNode node = createNode();
        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            assertEquals(YogaValue.AUTO, node.getWidth(v));
        }
    }

    @Test
    public void testWidthAssignment() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            node.setWidth(123);
            assertEquals(YogaValue.create(stack, 123, YogaUnit.POINT), node.getWidth(v));

            node.setWidthPercent(45);
            assertEquals(YogaValue.create(stack, 45, YogaUnit.PERCENT), node.getWidth(v));
        }
    }

    @Test
    public void testWidthAffectsLayout() {
        YogaNode node = style().width(123).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(123, node.getLayoutWidth(), 0);
    }

    @Test
    public void testWidthPercentAffectsLayout() {
        YogaNode node = style().widthPercent(75).node();
        node.calculateLayout(200, UNDEFINED);

        assertEquals(150, node.getLayoutWidth(), 0);
    }

    // TODO: testWidthAutoAffectsLayout

    @Test
    public void testHeightDefault() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            assertEquals(YogaValue.AUTO, node.getHeight(v));
        }
    }

    @Test
    public void testHeightAssignment() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            node.setHeight(123);
            assertEquals(YogaValue.create(stack, 123, YogaUnit.POINT), node.getHeight(v));

            node.setHeightPercent(45);
            assertEquals(YogaValue.create(stack, 45, YogaUnit.PERCENT), node.getHeight(v));
        }
    }

    @Test
    public void testHeightAffectsLayout() {
        YogaNode node = style().height(123).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(123, node.getLayoutHeight(), 0);
    }

    @Test
    public void testHeightPercentAffectsLayout() {
        YogaNode node = style().heightPercent(75).node();
        node.calculateLayout(UNDEFINED, 200);

        assertEquals(150, node.getLayoutHeight(), 0);
    }

    // TODO: testHeightAutoAffectsLayout

    @Test
    public void testMinWidthDefault() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            assertEquals(YogaValue.UNDEFINED, node.getMinWidth(v));
        }
    }

    @Test
    public void testMinWidthAssignment() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            node.setMinWidth(123);
            assertEquals(YogaValue.create(stack, 123, YogaUnit.POINT), node.getMinWidth(v));

            node.setMinWidthPercent(45);
            assertEquals(YogaValue.create(stack, 45, YogaUnit.PERCENT), node.getMinWidth(v));
        }
    }

    @Test
    public void testMinWidthAffectsLayout() {
        YogaNode node = style().minWidth(123).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(123, node.getLayoutWidth(), 0);
    }

    @Test
    public void testMinWidthPercentAffectsLayout() {
        YogaNode node = style().minWidthPercent(120).node();
        node.calculateLayout(200, UNDEFINED);

        assertEquals(240, node.getLayoutWidth(), 0);
    }

    @Test
    public void testMinHeightDefault() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            assertEquals(YogaValue.UNDEFINED, node.getMinHeight(v));
        }
    }

    @Test
    public void testMinHeightAssignment() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            node.setMinHeight(123);
            assertEquals(YogaValue.create(stack, 123, YogaUnit.POINT), node.getMinHeight(v));

            node.setMinHeightPercent(45);
            assertEquals(YogaValue.create(stack, 45, YogaUnit.PERCENT), node.getMinHeight(v));
        }
    }

    @Test
    public void testMinHeightAffectsLayout() {
        YogaNode node = style().minHeight(123).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(123, node.getLayoutHeight(), 0);
    }

    @Test
    public void testMinHeightPercentAffectsLayout() {
        YogaNode node = style().minHeightPercent(120).node();
        node.calculateLayout(UNDEFINED, 200);

        assertEquals(240, node.getLayoutHeight(), 0);
    }

    @Test
    public void testMaxWidthDefault() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            assertEquals(YogaValue.UNDEFINED, node.getMaxWidth(v));
        }
    }

    @Test
    public void testMaxWidthAssignment() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            node.setMaxWidth(123);
            assertEquals(YogaValue.create(stack, 123, YogaUnit.POINT), node.getMaxWidth(v));

            node.setMaxWidthPercent(45);
            assertEquals(YogaValue.create(stack, 45, YogaUnit.PERCENT), node.getMaxWidth(v));
        }
    }

    @Test
    public void testMaxWidthAffectsLayout() {
        YogaNode node = style().width(200).children(style().maxWidth(123)).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(123, node.getChildAt(0).getLayoutWidth(), 0);
    }

    @Test
    public void testMaxWidthPercentAffectsLayout() {
        YogaNode node = style().width(200).children(style().maxWidthPercent(80)).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(160, node.getChildAt(0).getLayoutWidth(), 0);
    }

    @Test
    public void testMaxHeightDefault() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            assertEquals(YogaValue.UNDEFINED, node.getMaxHeight(v));
        }
    }

    @Test
    public void testMaxHeightAssignment() {
        YogaNode node = createNode();

        try (MemoryStack stack = stackPush()) {
            YGValue v = YGValue.malloc(stack);
            node.setMaxHeight(123);
            assertEquals(YogaValue.create(stack, 123, YogaUnit.POINT), node.getMaxHeight(v));

            node.setMaxHeightPercent(45);
            assertEquals(YogaValue.create(stack, 45, YogaUnit.PERCENT), node.getMaxHeight(v));
        }
    }

    @Test
    public void testMaxHeightAffectsLayout() {
        YogaNode node =
            style()
                .height(200)
                .flexDirection(YogaFlexDirection.ROW)
                .children(style().maxHeight(123))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(123, node.getChildAt(0).getLayoutHeight(), 0);
    }

    @Test
    public void testMaxHeightPercentAffectsLayout() {
        YogaNode node =
            style()
                .flexDirection(YogaFlexDirection.ROW)
                .height(200)
                .children(style().maxHeightPercent(80))
                .node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(160, node.getChildAt(0).getLayoutHeight(), 0);
    }

    @Test
    public void testAspectRatioDefault() {
        YogaNode node = createNode();

        assertEquals(UNDEFINED, node.getAspectRatio());
    }

    @Test
    public void testAspectRatioAssignment() {
        YogaNode node = createNode();
        node.setAspectRatio(2.75f);

        assertEquals(2.75f, node.getAspectRatio(), 0);
    }

    @Test
    public void aspectRatioAffectsLayoutWithGivenWidth() {
        YogaNode node = style().children(style().width(300).aspectRatio(1.5f)).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(200, node.getChildAt(0).getLayoutHeight(), 0);
    }

    @Test
    public void aspectRatioAffectsLayoutWithGivenHeight() {
        YogaNode node = style().children(style().height(300).aspectRatio(1.5f)).node();
        node.calculateLayout(UNDEFINED, UNDEFINED);

        assertEquals(450, node.getChildAt(0).getLayoutWidth(), 0);
    }

    private static StyledNode style() {
        return new StyledNode();
    }

    private static class StyledNode {

        private YogaNode mNode = createNode();

        YogaNode node() {
            return mNode;
        }

        StyledNode children(StyledNode... children) {
            for (int i = mNode.getChildCount(); --i >= 0; ) {
                mNode.removeChildAt(i);
            }
            for (int i = 0; i < children.length; i++) {
                mNode.addChildAt(children[i].node(), i);
            }
            return this;
        }

        StyledNode direction(YogaDirection direction) {
            mNode.setDirection(direction);
            return this;
        }

        StyledNode width(float width) {
            mNode.setWidth(width);
            return this;
        }

        StyledNode widthPercent(float width) {
            mNode.setWidthPercent(width);
            return this;
        }

        StyledNode flexDirection(YogaFlexDirection direction) {
            mNode.setFlexDirection(direction);
            return this;
        }

        StyledNode justifyContent(YogaJustify justify) {
            mNode.setJustifyContent(justify);
            return this;
        }

        StyledNode height(float height) {
            mNode.setHeight(height);
            return this;
        }

        StyledNode heightPercent(float height) {
            mNode.setHeightPercent(height);
            return this;
        }

        StyledNode alignItems(YogaAlign align) {
            mNode.setAlignItems(align);
            return this;
        }

        StyledNode alignSelf(YogaAlign align) {
            mNode.setAlignSelf(align);
            return this;
        }

        StyledNode alignContent(YogaAlign align) {
            mNode.setAlignContent(align);
            return this;
        }

        StyledNode flexWrap(YogaWrap wrap) {
            mNode.setWrap(wrap);
            return this;
        }

        StyledNode positionType(YogaPositionType positionType) {
            mNode.setPositionType(positionType);
            return this;
        }

        StyledNode overflow(YogaOverflow overflow) {
            mNode.setOverflow(overflow);
            return this;
        }

        StyledNode flexShrink(float flexShrink) {
            mNode.setFlexShrink(flexShrink);
            return this;
        }

        StyledNode display(YogaDisplay display) {
            mNode.setDisplay(display);
            return this;
        }

        StyledNode flexGrow(float flexGrow) {
            mNode.setFlexGrow(flexGrow);
            return this;
        }

        StyledNode flex(float flex) {
            mNode.setFlex(flex);
            return this;
        }

        StyledNode flexBasis(float flexBasis) {
            mNode.setFlexBasis(flexBasis);
            return this;
        }

        StyledNode flexBasisPercent(float flexBasis) {
            mNode.setFlexBasisPercent(flexBasis);
            return this;
        }

        StyledNode margin(YogaEdge edge, float margin) {
            mNode.setMargin(edge, margin);
            return this;
        }

        StyledNode marginPercent(YogaEdge edge, float margin) {
            mNode.setMarginPercent(edge, margin);
            return this;
        }

        StyledNode marginAuto(YogaEdge edge) {
            mNode.setMarginAuto(edge);
            return this;
        }

        StyledNode padding(YogaEdge edge, float padding) {
            mNode.setPadding(edge, padding);
            return this;
        }

        StyledNode paddingPercent(YogaEdge edge, float padding) {
            mNode.setPaddingPercent(edge, padding);
            return this;
        }

        StyledNode border(YogaEdge edge, float border) {
            mNode.setBorder(edge, border);
            return this;
        }

        StyledNode position(YogaEdge edge, float position) {
            mNode.setPosition(edge, position);
            return this;
        }

        StyledNode positionPercent(YogaEdge edge, float position) {
            mNode.setPositionPercent(edge, position);
            return this;
        }

        StyledNode minWidth(float minWidth) {
            mNode.setMinWidth(minWidth);
            return this;
        }

        StyledNode minWidthPercent(float minWidth) {
            mNode.setMinWidthPercent(minWidth);
            return this;
        }

        StyledNode minHeight(float minHeight) {
            mNode.setMinHeight(minHeight);
            return this;
        }

        StyledNode minHeightPercent(float minHeight) {
            mNode.setMinHeightPercent(minHeight);
            return this;
        }

        StyledNode maxWidth(float maxWidth) {
            mNode.setMaxWidth(maxWidth);
            return this;
        }

        StyledNode maxWidthPercent(float maxWidth) {
            mNode.setMaxWidthPercent(maxWidth);
            return this;
        }

        StyledNode maxHeight(float maxHeight) {
            mNode.setMaxHeight(maxHeight);
            return this;
        }

        StyledNode maxHeightPercent(float maxHeight) {
            mNode.setMaxHeightPercent(maxHeight);
            return this;
        }

        StyledNode aspectRatio(float aspectRatio) {
            mNode.setAspectRatio(aspectRatio);
            return this;
        }
    }
}
