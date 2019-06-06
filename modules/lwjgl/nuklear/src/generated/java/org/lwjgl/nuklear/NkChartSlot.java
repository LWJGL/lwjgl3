/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_chart_slot {
 *     enum nk_chart_type type;
 *     {@link NkColor struct nk_color} color;
 *     {@link NkColor struct nk_color} highlight;
 *     float min;
 *     float max;
 *     float range;
 *     int count;
 *     {@link NkVec2 struct nk_vec2} last;
 *     int index;
 * }</code></pre>
 */
@NativeType("struct nk_chart_slot")
public class NkChartSlot extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        COLOR,
        HIGHLIGHT,
        MIN,
        MAX,
        RANGE,
        COUNT,
        LAST,
        INDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        COLOR = layout.offsetof(1);
        HIGHLIGHT = layout.offsetof(2);
        MIN = layout.offsetof(3);
        MAX = layout.offsetof(4);
        RANGE = layout.offsetof(5);
        COUNT = layout.offsetof(6);
        LAST = layout.offsetof(7);
        INDEX = layout.offsetof(8);
    }

    /**
     * Creates a {@code NkChartSlot} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkChartSlot(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("enum nk_chart_type")
    public int type() { return ntype(address()); }
    /** Returns a {@link NkColor} view of the {@code color} field. */
    @NativeType("struct nk_color")
    public NkColor color() { return ncolor(address()); }
    /** Returns a {@link NkColor} view of the {@code highlight} field. */
    @NativeType("struct nk_color")
    public NkColor highlight() { return nhighlight(address()); }
    /** Returns the value of the {@code min} field. */
    public float min() { return nmin(address()); }
    /** Returns the value of the {@code max} field. */
    public float max() { return nmax(address()); }
    /** Returns the value of the {@code range} field. */
    public float range() { return nrange(address()); }
    /** Returns the value of the {@code count} field. */
    public int count() { return ncount(address()); }
    /** Returns a {@link NkVec2} view of the {@code last} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 last() { return nlast(address()); }
    /** Returns the value of the {@code index} field. */
    public int index() { return nindex(address()); }

    // -----------------------------------

    /** Returns a new {@code NkChartSlot} instance for the specified memory address. */
    public static NkChartSlot create(long address) {
        return wrap(NkChartSlot.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkChartSlot createSafe(long address) {
        return address == NULL ? null : wrap(NkChartSlot.class, address);
    }

    /**
     * Create a {@link NkChartSlot.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkChartSlot.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkChartSlot.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + NkChartSlot.TYPE); }
    /** Unsafe version of {@link #color}. */
    public static NkColor ncolor(long struct) { return NkColor.create(struct + NkChartSlot.COLOR); }
    /** Unsafe version of {@link #highlight}. */
    public static NkColor nhighlight(long struct) { return NkColor.create(struct + NkChartSlot.HIGHLIGHT); }
    /** Unsafe version of {@link #min}. */
    public static float nmin(long struct) { return UNSAFE.getFloat(null, struct + NkChartSlot.MIN); }
    /** Unsafe version of {@link #max}. */
    public static float nmax(long struct) { return UNSAFE.getFloat(null, struct + NkChartSlot.MAX); }
    /** Unsafe version of {@link #range}. */
    public static float nrange(long struct) { return UNSAFE.getFloat(null, struct + NkChartSlot.RANGE); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return UNSAFE.getInt(null, struct + NkChartSlot.COUNT); }
    /** Unsafe version of {@link #last}. */
    public static NkVec2 nlast(long struct) { return NkVec2.create(struct + NkChartSlot.LAST); }
    /** Unsafe version of {@link #index}. */
    public static int nindex(long struct) { return UNSAFE.getInt(null, struct + NkChartSlot.INDEX); }

    // -----------------------------------

    /** An array of {@link NkChartSlot} structs. */
    public static class Buffer extends StructBuffer<NkChartSlot, Buffer> {

        private static final NkChartSlot ELEMENT_FACTORY = NkChartSlot.create(-1L);

        /**
         * Creates a new {@code NkChartSlot.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkChartSlot#SIZEOF}, and its mark will be undefined.
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
        protected NkChartSlot getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("enum nk_chart_type")
        public int type() { return NkChartSlot.ntype(address()); }
        /** Returns a {@link NkColor} view of the {@code color} field. */
        @NativeType("struct nk_color")
        public NkColor color() { return NkChartSlot.ncolor(address()); }
        /** Returns a {@link NkColor} view of the {@code highlight} field. */
        @NativeType("struct nk_color")
        public NkColor highlight() { return NkChartSlot.nhighlight(address()); }
        /** Returns the value of the {@code min} field. */
        public float min() { return NkChartSlot.nmin(address()); }
        /** Returns the value of the {@code max} field. */
        public float max() { return NkChartSlot.nmax(address()); }
        /** Returns the value of the {@code range} field. */
        public float range() { return NkChartSlot.nrange(address()); }
        /** Returns the value of the {@code count} field. */
        public int count() { return NkChartSlot.ncount(address()); }
        /** Returns a {@link NkVec2} view of the {@code last} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 last() { return NkChartSlot.nlast(address()); }
        /** Returns the value of the {@code index} field. */
        public int index() { return NkChartSlot.nindex(address()); }

    }

}