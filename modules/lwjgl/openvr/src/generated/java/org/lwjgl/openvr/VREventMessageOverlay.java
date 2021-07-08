/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_MessageOverlay_t {
 *     uint32_t {@link #unVRMessageOverlayResponse};
 * }</code></pre>
 */
@NativeType("struct VREvent_MessageOverlay_t")
public class VREventMessageOverlay extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UNVRMESSAGEOVERLAYRESPONSE;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UNVRMESSAGEOVERLAYRESPONSE = layout.offsetof(0);
    }

    /**
     * Creates a {@code VREventMessageOverlay} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventMessageOverlay(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** one of:<br><table><tr><td>{@link VR#VRMessageOverlayResponse_ButtonPress_0}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_ButtonPress_1}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_ButtonPress_2}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_ButtonPress_3}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_CouldntFindSystemOverlay}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_CouldntFindOrCreateClientOverlay}</td></tr><tr><td>{@link VR#VRMessageOverlayResponse_ApplicationQuit}</td></tr></table> */
    @NativeType("uint32_t")
    public int unVRMessageOverlayResponse() { return nunVRMessageOverlayResponse(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventMessageOverlay} instance for the specified memory address. */
    public static VREventMessageOverlay create(long address) {
        return wrap(VREventMessageOverlay.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventMessageOverlay createSafe(long address) {
        return address == NULL ? null : wrap(VREventMessageOverlay.class, address);
    }

    /**
     * Create a {@link VREventMessageOverlay.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventMessageOverlay.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventMessageOverlay.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #unVRMessageOverlayResponse}. */
    public static int nunVRMessageOverlayResponse(long struct) { return UNSAFE.getInt(null, struct + VREventMessageOverlay.UNVRMESSAGEOVERLAYRESPONSE); }

    // -----------------------------------

    /** An array of {@link VREventMessageOverlay} structs. */
    public static class Buffer extends StructBuffer<VREventMessageOverlay, Buffer> {

        private static final VREventMessageOverlay ELEMENT_FACTORY = VREventMessageOverlay.create(-1L);

        /**
         * Creates a new {@code VREventMessageOverlay.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventMessageOverlay#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VREventMessageOverlay getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VREventMessageOverlay#unVRMessageOverlayResponse} field. */
        @NativeType("uint32_t")
        public int unVRMessageOverlayResponse() { return VREventMessageOverlay.nunVRMessageOverlayResponse(address()); }

    }

}