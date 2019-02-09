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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; coordinates are -1..1 analog values</li>
 * <li>{@code y} &ndash; coordinates are -1..1 analog values</li>
 * <li>{@code transformedX} &ndash; transformed by the center and radius numbers provided by the overlay</li>
 * <li>{@code transformedY} &ndash; transformed by the center and radius numbers provided by the overlay</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_DualAnalog_t {
 *     float x;
 *     float y;
 *     float transformedX;
 *     float transformedY;
 *     EDualAnalogWhich which;
 * }</code></pre>
 */
@NativeType("struct VREvent_DualAnalog_t")
public class VREventDualAnalog extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        TRANSFORMEDX,
        TRANSFORMEDY,
        WHICH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        TRANSFORMEDX = layout.offsetof(2);
        TRANSFORMEDY = layout.offsetof(3);
        WHICH = layout.offsetof(4);
    }

    /**
     * Creates a {@code VREventDualAnalog} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventDualAnalog(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** Returns the value of the {@code transformedX} field. */
    public float transformedX() { return ntransformedX(address()); }
    /** Returns the value of the {@code transformedY} field. */
    public float transformedY() { return ntransformedY(address()); }
    /** Returns the value of the {@code which} field. */
    @NativeType("EDualAnalogWhich")
    public int which() { return nwhich(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventDualAnalog} instance for the specified memory address. */
    public static VREventDualAnalog create(long address) {
        return wrap(VREventDualAnalog.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventDualAnalog createSafe(long address) {
        return address == NULL ? null : wrap(VREventDualAnalog.class, address);
    }

    /**
     * Create a {@link VREventDualAnalog.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventDualAnalog.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventDualAnalog.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + VREventDualAnalog.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return UNSAFE.getFloat(null, struct + VREventDualAnalog.Y); }
    /** Unsafe version of {@link #transformedX}. */
    public static float ntransformedX(long struct) { return UNSAFE.getFloat(null, struct + VREventDualAnalog.TRANSFORMEDX); }
    /** Unsafe version of {@link #transformedY}. */
    public static float ntransformedY(long struct) { return UNSAFE.getFloat(null, struct + VREventDualAnalog.TRANSFORMEDY); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return UNSAFE.getInt(null, struct + VREventDualAnalog.WHICH); }

    // -----------------------------------

    /** An array of {@link VREventDualAnalog} structs. */
    public static class Buffer extends StructBuffer<VREventDualAnalog, Buffer> {

        private static final VREventDualAnalog ELEMENT_FACTORY = VREventDualAnalog.create(-1L);

        /**
         * Creates a new {@code VREventDualAnalog.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventDualAnalog#SIZEOF}, and its mark will be undefined.
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
        protected VREventDualAnalog getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code x} field. */
        public float x() { return VREventDualAnalog.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public float y() { return VREventDualAnalog.ny(address()); }
        /** Returns the value of the {@code transformedX} field. */
        public float transformedX() { return VREventDualAnalog.ntransformedX(address()); }
        /** Returns the value of the {@code transformedY} field. */
        public float transformedY() { return VREventDualAnalog.ntransformedY(address()); }
        /** Returns the value of the {@code which} field. */
        @NativeType("EDualAnalogWhich")
        public int which() { return VREventDualAnalog.nwhich(address()); }

    }

}