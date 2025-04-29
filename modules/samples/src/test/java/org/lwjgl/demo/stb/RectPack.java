/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.stb;

import org.lwjgl.stb.*;
import org.lwjgl.system.*;

import static org.lwjgl.stb.STBRectPack.*;
import static org.lwjgl.system.MemoryStack.*;

public class RectPack {

    private RectPack() {
    }

    public static void main(String[] args) {
        try (MemoryStack stack = stackPush()) {
            STBRPNode.Buffer nodes   = STBRPNode.calloc(3, stack);
            STBRPContext     context = STBRPContext.calloc(stack);

            stbrp_init_target(context, 60, 20, nodes);

            STBRPRect.Buffer rectangles = STBRPRect.calloc(3, stack);

            rectangles.get(0).w(40).h(10); // rectangle 1 has size 40x10
            rectangles.get(1).w(20).h(8); // rectangle 2 has size 20x8
            rectangles.get(2).w(25).h(9); // rectangle 3 has size 25x9

            if (stbrp_pack_rects(context, rectangles) != 1) {
                System.out.println("Rectangle packing failed :(");
                return;
            }

            for (int i = 0; i < 3; i++) {
                STBRPRect rectangle = rectangles.get(i);
                System.out.println("Rectangle " + i + " was placed at (" + rectangle.x() + ", " + rectangle.y() + ")");
            }
        }
    }
}
