/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.yoga;

import org.jspecify.annotations.*;
import org.lwjgl.system.*;
import org.lwjgl.system.ffm.*;
import org.lwjgl.util.yoga.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.system.ffm.FFM.*;
import static org.lwjgl.util.yoga.Yoga.*;
import static org.testng.AssertJUnit.*;

// FFM port of YGIntrinsicSizeTest::test_contains_inner_text_long_word to test upcall that returns a struct by-value.
@NullMarked
public class YGMeasureFuncTest {

    static final SymbolLookup YOGA = SymbolLookup.libraryLookup(
        Objects.requireNonNull(Library.loadNative(Yoga.class, "org.lwjgl.yoga", "lwjgl_yoga", true).getPath()),
        Arena.global()
    );

    static {
        ffmConfig(
            YGMeasureFuncTest.class,
            ffmConfigBuilder(MethodHandles.lookup())
                .withSymbolLookup(YOGA)
                .build()
        );
    }

    public interface YGSize {
        StructBinder<YGSize> $ = struct(YGSize.class)
            .m("width", float32)
            .m("height", float32)
            .build();

        float width();
        float height();

        YGSize width(float value);
        YGSize height(float value);
    }

    @FFMDefinition("YGSize (*YGMeasureFunc)( YGNodeConstRef node, float width, YGMeasureMode widthMode, float height, YGMeasureMode heightMode);")
    @FunctionalInterface
    public interface YGMeasureFunc {
        UpcallBinder<YGMeasureFunc> $ = upcall(YGMeasureFunc.class);
        @FFMByValue YGSize invoke(@FFMPointer long node, float width, int widthMode, float height, int heightMode);
    }

    @FFMCharset(FFMCharset.Type.UTF8)
    @FFMJNI
    @FFMPrefix("YG")
    interface MyYoga {
        @FFMName("Java_org_lwjgl_util_yoga_Yoga_YGConfigNew")
        @FFMPointer long ConfigNew();

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeNewWithConfig")
        @FFMPointer long NodeNewWithConfig(@FFMPointer long config);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignItems")
        void NodeStyleSetAlignItems(@FFMPointer long node, int alignItems);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPositionType")
        void NodeStyleSetPositionType(@FFMPointer long node, int positionType);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidth")
        void NodeStyleSetWidth(@FFMPointer long node, float width);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeight")
        void NodeStyleSetHeight(@FFMPointer long node, float height);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexDirection")
        void NodeStyleSetFlexDirection(@FFMPointer long node, int flexDirection);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeInsertChild")
        void NodeInsertChild(@FFMPointer long node, @FFMPointer long child, long index);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetMeasureFunc")
        void NodeSetMeasureFunc(Arena arena, @FFMPointer long node, @Nullable YGMeasureFunc measureFunc);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetDirection")
        void NodeStyleSetDirection(@FFMPointer long node, int direction);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetDirection")
        int NodeStyleGetDirection(@FFMPointer long node);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeCalculateLayout")
        void NodeCalculateLayout(@FFMPointer long node, float availableWidth, float availableHeight, int ownerDirection);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetLeft")
        float NodeLayoutGetLeft(@FFMPointer long node);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetTop")
        float NodeLayoutGetTop(@FFMPointer long node);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetWidth")
        float NodeLayoutGetWidth(@FFMPointer long node);

        @FFMName("Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetHeight")
        float NodeLayoutGetHeight(@FFMPointer long node);
    }

    private static final MyYoga YG = ffmGenerate(MyYoga.class);

    private static final float widthPerChar  = 10;
    private static final float heightPerChar = 10;

    private YGMeasureFuncTest() {
    }

    static void main() {
        var config = YG.ConfigNew();

        var root = YG.NodeNewWithConfig(config);

        YG.NodeStyleSetAlignItems(root, YGAlignFlexStart);
        YG.NodeStyleSetPositionType(root, YGPositionTypeAbsolute);
        YG.NodeStyleSetWidth(root, 2000f);
        YG.NodeStyleSetHeight(root, 2000f);

        var root_child0 = YG.NodeNewWithConfig(config);

        YG.NodeStyleSetFlexDirection(root_child0, YGFlexDirectionRow);
        YG.NodeInsertChild(root, root_child0, 0);

        try (var arena = Arena.ofConfined()) {
            var text = "LoremipsumdolorsitametconsecteturadipiscingelitSedeleifasdfettortoracauctorFuscerhoncusipsumtemporerosaliquamconsequatPraesentsoda";

            var __result = YGSize.$.allocate(arena);
            YG.NodeSetMeasureFunc(arena, root_child0, (_, width, widthMode, height, heightMode) -> {
                float measuredWidth;
                float measuredHeight;

                if (widthMode == YGMeasureModeExactly) {
                    measuredWidth = width;
                } else if (widthMode == YGMeasureModeAtMost) {
                    measuredWidth = Math.min(text.length() * widthPerChar, width);
                } else {
                    measuredWidth = text.length() * widthPerChar;
                }

                if (heightMode == YGMeasureModeExactly) {
                    measuredHeight = height;
                } else if (heightMode == YGMeasureModeAtMost) {
                    measuredHeight = Math.min(calculateHeight(text, max(measuredWidth, getWidestWordWidth(text))), height);
                } else {
                    measuredHeight = calculateHeight(text, max(measuredWidth, getWidestWordWidth(text)));
                }

                System.out.println("measuredWidth = " + measuredWidth);
                System.out.println("measuredHeight = " + measuredHeight);

                return YGSize.$.get(__result)
                    .width(measuredWidth)
                    .height(measuredHeight);
            });

            YG.NodeStyleSetDirection(root, YGDirectionLTR);
            YG.NodeCalculateLayout(root, YGUndefined, YGUndefined, YG.NodeStyleGetDirection(root));
        }

        assertEquals(0f, YG.NodeLayoutGetLeft(root), 0.0f);
        assertEquals(0f, YG.NodeLayoutGetTop(root), 0.0f);
        assertEquals(2000f, YG.NodeLayoutGetWidth(root), 0.0f);
        assertEquals(2000f, YG.NodeLayoutGetHeight(root), 0.0f);

        assertEquals(0f, YG.NodeLayoutGetLeft(root_child0), 0.0f);
        assertEquals(0f, YG.NodeLayoutGetTop(root_child0), 0.0f);
        assertEquals(1300f, YG.NodeLayoutGetWidth(root_child0), 0.0f);
        assertEquals(10f, YG.NodeLayoutGetHeight(root_child0), 0.0f);
    }

    static float getWidestWordWidth(String text) {
        var widestWordLength = 0;

        var words = text.split(" ");
        for (var word : words) {
            var wordLength = word.length();
            if (widestWordLength < wordLength) {
                widestWordLength = wordLength;
            }
        }

        return widestWordLength * widthPerChar;
    }

    static float calculateHeight(String text, float measuredWidth) {
        if (text.length() * widthPerChar <= measuredWidth) {
            return heightPerChar;
        }

        var words = text.split(" ");

        float lines             = 1;
        float currentLineLength = 0;
        for (var word : words) {
            var wordWidth = word.length() * widthPerChar;
            if (wordWidth > measuredWidth) {
                if (currentLineLength > 0) {
                    lines++;
                }
                lines++;
                currentLineLength = 0;
            } else if (currentLineLength + wordWidth <= measuredWidth) {
                currentLineLength += wordWidth + widthPerChar;
            } else {
                lines++;
                currentLineLength = wordWidth + widthPerChar;
            }
        }

        return (currentLineLength == 0 ? lines - 1 : lines) * heightPerChar;
    }

}
