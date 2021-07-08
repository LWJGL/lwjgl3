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
 * When in mouse input mode you can receive data from the touchpad, these events are only sent if the users finger is on the touchpad (or just released from
 * it). These events are sent to overlays with the {@link VR#VROverlayFlags_SendVRTouchpadEvents} flag set.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_TouchPadMove_t {
 *     bool {@link #bFingerDown};
 *     float {@link #flSecondsFingerDown};
 *     float {@link #fValueXFirst};
 *     float fValueYFirst;
 *     float {@link #fValueXRaw};
 *     float fValueYRaw;
 * }</code></pre>
 */
@NativeType("struct VREvent_TouchPadMove_t")
public class VREventTouchPadMove extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BFINGERDOWN,
        FLSECONDSFINGERDOWN,
        FVALUEXFIRST,
        FVALUEYFIRST,
        FVALUEXRAW,
        FVALUEYRAW;

    static {
        Layout layout = __struct(
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BFINGERDOWN = layout.offsetof(0);
        FLSECONDSFINGERDOWN = layout.offsetof(1);
        FVALUEXFIRST = layout.offsetof(2);
        FVALUEYFIRST = layout.offsetof(3);
        FVALUEXRAW = layout.offsetof(4);
        FVALUEYRAW = layout.offsetof(5);
    }

    /**
     * Creates a {@code VREventTouchPadMove} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventTouchPadMove(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** true if the users finger is detected on the touch pad */
    @NativeType("bool")
    public boolean bFingerDown() { return nbFingerDown(address()); }
    /** how long the finger has been down in seconds */
    public float flSecondsFingerDown() { return nflSecondsFingerDown(address()); }
    /** these values indicate the starting finger position (so you can do some basic swipe stuff) */
    public float fValueXFirst() { return nfValueXFirst(address()); }
    /** @return the value of the {@code fValueYFirst} field. */
    public float fValueYFirst() { return nfValueYFirst(address()); }
    /** this is the raw sampled coordinate without deadzoning */
    public float fValueXRaw() { return nfValueXRaw(address()); }
    /** @return the value of the {@code fValueYRaw} field. */
    public float fValueYRaw() { return nfValueYRaw(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventTouchPadMove} instance for the specified memory address. */
    public static VREventTouchPadMove create(long address) {
        return wrap(VREventTouchPadMove.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventTouchPadMove createSafe(long address) {
        return address == NULL ? null : wrap(VREventTouchPadMove.class, address);
    }

    /**
     * Create a {@link VREventTouchPadMove.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventTouchPadMove.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventTouchPadMove.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bFingerDown}. */
    public static boolean nbFingerDown(long struct) { return UNSAFE.getByte(null, struct + VREventTouchPadMove.BFINGERDOWN) != 0; }
    /** Unsafe version of {@link #flSecondsFingerDown}. */
    public static float nflSecondsFingerDown(long struct) { return UNSAFE.getFloat(null, struct + VREventTouchPadMove.FLSECONDSFINGERDOWN); }
    /** Unsafe version of {@link #fValueXFirst}. */
    public static float nfValueXFirst(long struct) { return UNSAFE.getFloat(null, struct + VREventTouchPadMove.FVALUEXFIRST); }
    /** Unsafe version of {@link #fValueYFirst}. */
    public static float nfValueYFirst(long struct) { return UNSAFE.getFloat(null, struct + VREventTouchPadMove.FVALUEYFIRST); }
    /** Unsafe version of {@link #fValueXRaw}. */
    public static float nfValueXRaw(long struct) { return UNSAFE.getFloat(null, struct + VREventTouchPadMove.FVALUEXRAW); }
    /** Unsafe version of {@link #fValueYRaw}. */
    public static float nfValueYRaw(long struct) { return UNSAFE.getFloat(null, struct + VREventTouchPadMove.FVALUEYRAW); }

    // -----------------------------------

    /** An array of {@link VREventTouchPadMove} structs. */
    public static class Buffer extends StructBuffer<VREventTouchPadMove, Buffer> {

        private static final VREventTouchPadMove ELEMENT_FACTORY = VREventTouchPadMove.create(-1L);

        /**
         * Creates a new {@code VREventTouchPadMove.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventTouchPadMove#SIZEOF}, and its mark will be undefined.
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
        protected VREventTouchPadMove getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VREventTouchPadMove#bFingerDown} field. */
        @NativeType("bool")
        public boolean bFingerDown() { return VREventTouchPadMove.nbFingerDown(address()); }
        /** @return the value of the {@link VREventTouchPadMove#flSecondsFingerDown} field. */
        public float flSecondsFingerDown() { return VREventTouchPadMove.nflSecondsFingerDown(address()); }
        /** @return the value of the {@link VREventTouchPadMove#fValueXFirst} field. */
        public float fValueXFirst() { return VREventTouchPadMove.nfValueXFirst(address()); }
        /** @return the value of the {@code fValueYFirst} field. */
        public float fValueYFirst() { return VREventTouchPadMove.nfValueYFirst(address()); }
        /** @return the value of the {@link VREventTouchPadMove#fValueXRaw} field. */
        public float fValueXRaw() { return VREventTouchPadMove.nfValueXRaw(address()); }
        /** @return the value of the {@code fValueYRaw} field. */
        public float fValueYRaw() { return VREventTouchPadMove.nfValueYRaw(address()); }

    }

}