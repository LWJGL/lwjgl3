/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

public class STBRectPack {

    static { LibSTB.initialize(); }

    public static final int STBRP__MAXVAL = 0x7FFFFFFF;

    public static final int
        STBRP_HEURISTIC_Skyline_default       = 0,
        STBRP_HEURISTIC_Skyline_BL_sortHeight = STBRP_HEURISTIC_Skyline_default,
        STBRP_HEURISTIC_Skyline_BF_sortHeight = 1;

    protected STBRectPack() {
        throw new UnsupportedOperationException();
    }

    // --- [ stbrp_pack_rects ] ---

    /** {@code int stbrp_pack_rects(stbrp_context * context, stbrp_rect * rects, int num_rects)} */
    public static native int nstbrp_pack_rects(long context, long rects, int num_rects);

    /** {@code int stbrp_pack_rects(stbrp_context * context, stbrp_rect * rects, int num_rects)} */
    public static int stbrp_pack_rects(@NativeType("stbrp_context *") STBRPContext context, @NativeType("stbrp_rect *") STBRPRect.Buffer rects) {
        return nstbrp_pack_rects(context.address(), rects.address(), rects.remaining());
    }

    // --- [ stbrp_init_target ] ---

    /** {@code void stbrp_init_target(stbrp_context * context, int width, int height, stbrp_node * nodes, int num_nodes)} */
    public static native void nstbrp_init_target(long context, int width, int height, long nodes, int num_nodes);

    /** {@code void stbrp_init_target(stbrp_context * context, int width, int height, stbrp_node * nodes, int num_nodes)} */
    public static void stbrp_init_target(@NativeType("stbrp_context *") STBRPContext context, int width, int height, @NativeType("stbrp_node *") STBRPNode.Buffer nodes) {
        nstbrp_init_target(context.address(), width, height, nodes.address(), nodes.remaining());
    }

    // --- [ stbrp_setup_allow_out_of_mem ] ---

    /** {@code void stbrp_setup_allow_out_of_mem(stbrp_context * context, int allow_out_of_mem)} */
    public static native void nstbrp_setup_allow_out_of_mem(long context, int allow_out_of_mem);

    /** {@code void stbrp_setup_allow_out_of_mem(stbrp_context * context, int allow_out_of_mem)} */
    public static void stbrp_setup_allow_out_of_mem(@NativeType("stbrp_context *") STBRPContext context, @NativeType("int") boolean allow_out_of_mem) {
        nstbrp_setup_allow_out_of_mem(context.address(), allow_out_of_mem ? 1 : 0);
    }

    // --- [ stbrp_setup_heuristic ] ---

    /** {@code void stbrp_setup_heuristic(stbrp_context * context, int heuristic)} */
    public static native void nstbrp_setup_heuristic(long context, int heuristic);

    /** {@code void stbrp_setup_heuristic(stbrp_context * context, int heuristic)} */
    public static void stbrp_setup_heuristic(@NativeType("stbrp_context *") STBRPContext context, int heuristic) {
        nstbrp_setup_heuristic(context.address(), heuristic);
    }

}