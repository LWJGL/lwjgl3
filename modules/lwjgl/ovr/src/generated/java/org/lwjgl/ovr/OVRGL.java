/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class OVRGL {

    static { LibOVR.initialize(); }

    protected OVRGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ ovr_CreateTextureSwapChainGL ] ---

    /** {@code ovrResult ovr_CreateTextureSwapChainGL(ovrSession session, ovrTextureSwapChainDesc const * desc, ovrTextureSwapChain * out_TextureSwapChain)} */
    public static native int novr_CreateTextureSwapChainGL(long session, long desc, long out_TextureSwapChain);

    /** {@code ovrResult ovr_CreateTextureSwapChainGL(ovrSession session, ovrTextureSwapChainDesc const * desc, ovrTextureSwapChain * out_TextureSwapChain)} */
    @NativeType("ovrResult")
    public static int ovr_CreateTextureSwapChainGL(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChainDesc const *") OVRTextureSwapChainDesc desc, @NativeType("ovrTextureSwapChain *") PointerBuffer out_TextureSwapChain) {
        if (CHECKS) {
            check(session);
            check(out_TextureSwapChain, 1);
        }
        return novr_CreateTextureSwapChainGL(session, desc.address(), memAddress(out_TextureSwapChain));
    }

    // --- [ ovr_GetTextureSwapChainBufferGL ] ---

    /** {@code ovrResult ovr_GetTextureSwapChainBufferGL(ovrSession session, ovrTextureSwapChain chain, int index, unsigned int * out_TexId)} */
    public static native int novr_GetTextureSwapChainBufferGL(long session, long chain, int index, long out_TexId);

    /** {@code ovrResult ovr_GetTextureSwapChainBufferGL(ovrSession session, ovrTextureSwapChain chain, int index, unsigned int * out_TexId)} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainBufferGL(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, int index, @NativeType("unsigned int *") IntBuffer out_TexId) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_TexId, 1);
        }
        return novr_GetTextureSwapChainBufferGL(session, chain, index, memAddress(out_TexId));
    }

    // --- [ ovr_CreateMirrorTextureWithOptionsGL ] ---

    /** {@code ovrResult ovr_CreateMirrorTextureWithOptionsGL(ovrSession session, ovrMirrorTextureDesc const * desc, ovrMirrorTexture * out_MirrorTexture)} */
    public static native int novr_CreateMirrorTextureWithOptionsGL(long session, long desc, long out_MirrorTexture);

    /** {@code ovrResult ovr_CreateMirrorTextureWithOptionsGL(ovrSession session, ovrMirrorTextureDesc const * desc, ovrMirrorTexture * out_MirrorTexture)} */
    @NativeType("ovrResult")
    public static int ovr_CreateMirrorTextureWithOptionsGL(@NativeType("ovrSession") long session, @NativeType("ovrMirrorTextureDesc const *") OVRMirrorTextureDesc desc, @NativeType("ovrMirrorTexture *") PointerBuffer out_MirrorTexture) {
        if (CHECKS) {
            check(session);
            check(out_MirrorTexture, 1);
        }
        return novr_CreateMirrorTextureWithOptionsGL(session, desc.address(), memAddress(out_MirrorTexture));
    }

    // --- [ ovr_CreateMirrorTextureGL ] ---

    /** {@code ovrResult ovr_CreateMirrorTextureGL(ovrSession session, ovrMirrorTextureDesc const * desc, ovrMirrorTexture * out_MirrorTexture)} */
    public static native int novr_CreateMirrorTextureGL(long session, long desc, long out_MirrorTexture);

    /** {@code ovrResult ovr_CreateMirrorTextureGL(ovrSession session, ovrMirrorTextureDesc const * desc, ovrMirrorTexture * out_MirrorTexture)} */
    @NativeType("ovrResult")
    public static int ovr_CreateMirrorTextureGL(@NativeType("ovrSession") long session, @NativeType("ovrMirrorTextureDesc const *") OVRMirrorTextureDesc desc, @NativeType("ovrMirrorTexture *") PointerBuffer out_MirrorTexture) {
        if (CHECKS) {
            check(session);
            check(out_MirrorTexture, 1);
        }
        return novr_CreateMirrorTextureGL(session, desc.address(), memAddress(out_MirrorTexture));
    }

    // --- [ ovr_GetMirrorTextureBufferGL ] ---

    /** {@code ovrResult ovr_GetMirrorTextureBufferGL(ovrSession session, ovrMirrorTexture mirrorTexture, unsigned int * out_TexId)} */
    public static native int novr_GetMirrorTextureBufferGL(long session, long mirrorTexture, long out_TexId);

    /** {@code ovrResult ovr_GetMirrorTextureBufferGL(ovrSession session, ovrMirrorTexture mirrorTexture, unsigned int * out_TexId)} */
    @NativeType("ovrResult")
    public static int ovr_GetMirrorTextureBufferGL(@NativeType("ovrSession") long session, @NativeType("ovrMirrorTexture") long mirrorTexture, @NativeType("unsigned int *") IntBuffer out_TexId) {
        if (CHECKS) {
            check(session);
            check(mirrorTexture);
            check(out_TexId, 1);
        }
        return novr_GetMirrorTextureBufferGL(session, mirrorTexture, memAddress(out_TexId));
    }

    /** {@code ovrResult ovr_GetTextureSwapChainBufferGL(ovrSession session, ovrTextureSwapChain chain, int index, unsigned int * out_TexId)} */
    public static native int novr_GetTextureSwapChainBufferGL(long session, long chain, int index, int[] out_TexId);

    /** {@code ovrResult ovr_GetTextureSwapChainBufferGL(ovrSession session, ovrTextureSwapChain chain, int index, unsigned int * out_TexId)} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainBufferGL(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, int index, @NativeType("unsigned int *") int[] out_TexId) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_TexId, 1);
        }
        return novr_GetTextureSwapChainBufferGL(session, chain, index, out_TexId);
    }

    /** {@code ovrResult ovr_GetMirrorTextureBufferGL(ovrSession session, ovrMirrorTexture mirrorTexture, unsigned int * out_TexId)} */
    public static native int novr_GetMirrorTextureBufferGL(long session, long mirrorTexture, int[] out_TexId);

    /** {@code ovrResult ovr_GetMirrorTextureBufferGL(ovrSession session, ovrMirrorTexture mirrorTexture, unsigned int * out_TexId)} */
    @NativeType("ovrResult")
    public static int ovr_GetMirrorTextureBufferGL(@NativeType("ovrSession") long session, @NativeType("ovrMirrorTexture") long mirrorTexture, @NativeType("unsigned int *") int[] out_TexId) {
        if (CHECKS) {
            check(session);
            check(mirrorTexture);
            check(out_TexId, 1);
        }
        return novr_GetMirrorTextureBufferGL(session, mirrorTexture, out_TexId);
    }

}