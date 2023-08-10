/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_stencil_clear_tag.txt">EXT_stencil_clear_tag</a> extension.
 * 
 * <p>Stencil-only framebuffer clears are increasingly common as 3D applications are now using rendering algorithms such as stenciled shadow volume rendering
 * for multiple light sources in a single frame, recent "soft" stenciled shadow volume techniques, and stencil-based constructive solid geometry
 * techniques. In such algorithms there are multiple stencil buffer clears for each depth buffer clear. Additionally in most cases, these algorithms do
 * not require all of the 8 typical stencil bitplanes for their stencil requirements. In such cases, there is the potential for unused stencil bitplanes
 * to encode a "stencil clear tag" in such a way to reduce the number of actual stencil clears. The idea is that switching to an unused stencil clear tag
 * logically corresponds to when an application would otherwise perform a framebuffer-wide stencil clear.</p>
 * 
 * <p>This extension exposes an inexpensive hardware mechanism for amortizing the cost of multiple stencil-only clears by using a client-specified number of
 * upper bits of the stencil buffer to maintain a per-pixel stencil tag.</p>
 * 
 * <p>The upper bits of each stencil value is treated as a tag that indicates the state of the upper bits of the "stencil clear tag" state when the stencil
 * value was last written. If a stencil value is read and its upper bits containing its tag do NOT match the current upper bits of the stencil clear tag
 * state, the stencil value is substituted with the lower bits of the stencil clear tag (the reset value). Either way, the upper tag bits of the stencil
 * value are ignored by subsequent stencil function and operation processing of the stencil value.</p>
 * 
 * <p>When a stencil value is written to the stencil buffer, its upper bits are overridden with the upper bits of the current stencil clear tag state so
 * subsequent reads, prior to any subsequent stencil clear tag state change, properly return the updated lower bits.</p>
 * 
 * <p>In this way, the stencil clear tag functionality provides a way to replace multiple bandwidth-intensive stencil clears with very inexpensive update of
 * the stencil clear tag state.</p>
 * 
 * <p>If used as expected with the client specifying 3 bits for the stencil tag, every 7 of 8 stencil-only clears of the entire stencil buffer can be
 * substituted for an update of the current stencil clear tag rather than an actual update of all the framebuffer's stencil values. Still, every 8th clear
 * must be an actual stencil clear. The net effect is that the aggregate cost of stencil clears is reduced by a factor of 1/(2^n) where n is the number of
 * bits devoted to the stencil tag.</p>
 * 
 * <p>The application specifies two new pieces of state: 1) the number of upper stencil bits, n, assigned to maintain the tag bits for each stencil value
 * within the stencil buffer, and 2) a stencil clear tag value that packs the current tag and a reset value into a single integer values. The upper n bits
 * of the stencil clear tag value specify the current tag while the lower s-min(n,s) bits specify the current reset value, where s is the number of
 * bitplanes in the stencil buffer and n is the current number of stencil tag bits.</p>
 * 
 * <p>If zero stencil clear tag bits are assigned to the stencil tag encoding, then the stencil buffer operates in the conventional manner.</p>
 */
public class EXTStencilClearTag {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_STENCIL_TAG_BITS_EXT        = 0x88F2,
        GL_STENCIL_CLEAR_TAG_VALUE_EXT = 0x88F3;

    protected EXTStencilClearTag() {
        throw new UnsupportedOperationException();
    }

    // --- [ glStencilClearTagEXT ] ---

    public static native void glStencilClearTagEXT(@NativeType("GLsizei") int stencilTagBits, @NativeType("GLuint") int stencilClearTag);

}