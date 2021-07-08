/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_chart {
 *     int slot;
 *     float x;
 *     float y;
 *     float w;
 *     float h;
 *     {@link NkChartSlot struct nk_chart_slot} slots[4];
 * }</code></pre>
 */
@NativeType("struct nk_chart")
public class NkChart extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SLOT,
        X,
        Y,
        W,
        H,
        SLOTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(NkChartSlot.SIZEOF, NkChartSlot.ALIGNOF, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SLOT = layout.offsetof(0);
        X = layout.offsetof(1);
        Y = layout.offsetof(2);
        W = layout.offsetof(3);
        H = layout.offsetof(4);
        SLOTS = layout.offsetof(5);
    }

    /**
     * Creates a {@code NkChart} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkChart(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code slot} field. */
    public int slot() { return nslot(address()); }
    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code w} field. */
    public float w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    public float h() { return nh(address()); }
    /** @return a {@link NkChartSlot}.Buffer view of the {@code slots} field. */
    @NativeType("struct nk_chart_slot[4]")
    public NkChartSlot.Buffer slots() { return nslots(address()); }
    /** @return a {@link NkChartSlot} view of the struct at the specified index of the {@code slots} field. */
    @NativeType("struct nk_chart_slot")
    public NkChartSlot slots(int index) { return nslots(address(), index); }

    // -----------------------------------

    /** Returns a new {@code NkChart} instance for the specified memory address. */
    public static NkChart create(long address) {
        return wrap(NkChart.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkChart createSafe(long address) {
        return address == NULL ? null : wrap(NkChart.class, address);
    }

    /**
     * Create a {@link NkChart.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkChart.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkChart.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #slot}. */
    public static int nslot(long struct) { return UNSAFE.getInt(null, struct + NkChart.SLOT); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + NkChart.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return UNSAFE.getFloat(null, struct + NkChart.Y); }
    /** Unsafe version of {@link #w}. */
    public static float nw(long struct) { return UNSAFE.getFloat(null, struct + NkChart.W); }
    /** Unsafe version of {@link #h}. */
    public static float nh(long struct) { return UNSAFE.getFloat(null, struct + NkChart.H); }
    /** Unsafe version of {@link #slots}. */
    public static NkChartSlot.Buffer nslots(long struct) { return NkChartSlot.create(struct + NkChart.SLOTS, 4); }
    /** Unsafe version of {@link #slots(int) slots}. */
    public static NkChartSlot nslots(long struct, int index) {
        return NkChartSlot.create(struct + NkChart.SLOTS + check(index, 4) * NkChartSlot.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link NkChart} structs. */
    public static class Buffer extends StructBuffer<NkChart, Buffer> {

        private static final NkChart ELEMENT_FACTORY = NkChart.create(-1L);

        /**
         * Creates a new {@code NkChart.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkChart#SIZEOF}, and its mark will be undefined.
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
        protected NkChart getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code slot} field. */
        public int slot() { return NkChart.nslot(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return NkChart.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return NkChart.ny(address()); }
        /** @return the value of the {@code w} field. */
        public float w() { return NkChart.nw(address()); }
        /** @return the value of the {@code h} field. */
        public float h() { return NkChart.nh(address()); }
        /** @return a {@link NkChartSlot}.Buffer view of the {@code slots} field. */
        @NativeType("struct nk_chart_slot[4]")
        public NkChartSlot.Buffer slots() { return NkChart.nslots(address()); }
        /** @return a {@link NkChartSlot} view of the struct at the specified index of the {@code slots} field. */
        @NativeType("struct nk_chart_slot")
        public NkChartSlot slots(int index) { return NkChart.nslots(address(), index); }

    }

}