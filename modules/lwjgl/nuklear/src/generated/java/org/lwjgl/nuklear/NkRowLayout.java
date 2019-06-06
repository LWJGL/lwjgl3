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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code type} &ndash; one of:<br><table><tr><td>{@link Nuklear#NK_LAYOUT_DYNAMIC_FIXED LAYOUT_DYNAMIC_FIXED}</td><td>{@link Nuklear#NK_LAYOUT_DYNAMIC_ROW LAYOUT_DYNAMIC_ROW}</td><td>{@link Nuklear#NK_LAYOUT_DYNAMIC_FREE LAYOUT_DYNAMIC_FREE}</td><td>{@link Nuklear#NK_LAYOUT_DYNAMIC LAYOUT_DYNAMIC}</td></tr><tr><td>{@link Nuklear#NK_LAYOUT_STATIC_FIXED LAYOUT_STATIC_FIXED}</td><td>{@link Nuklear#NK_LAYOUT_STATIC_ROW LAYOUT_STATIC_ROW}</td><td>{@link Nuklear#NK_LAYOUT_STATIC_FREE LAYOUT_STATIC_FREE}</td><td>{@link Nuklear#NK_LAYOUT_STATIC LAYOUT_STATIC}</td></tr><tr><td>{@link Nuklear#NK_LAYOUT_TEMPLATE LAYOUT_TEMPLATE}</td><td>{@link Nuklear#NK_LAYOUT_COUNT LAYOUT_COUNT}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_row_layout {
 *     enum nk_panel_row_layout_type type;
 *     int index;
 *     float height;
 *     float min_height;
 *     int columns;
 *     float const * ratio;
 *     float item_width;
 *     float item_height;
 *     float item_offset;
 *     float filled;
 *     {@link NkRect struct nk_rect} item;
 *     int tree_depth;
 *     float templates[16];
 * }</code></pre>
 */
@NativeType("struct nk_row_layout")
public class NkRowLayout extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        INDEX,
        HEIGHT,
        MIN_HEIGHT,
        COLUMNS,
        RATIO,
        ITEM_WIDTH,
        ITEM_HEIGHT,
        ITEM_OFFSET,
        FILLED,
        ITEM,
        TREE_DEPTH,
        TEMPLATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkRect.SIZEOF, NkRect.ALIGNOF),
            __member(4),
            __array(4, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        INDEX = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        MIN_HEIGHT = layout.offsetof(3);
        COLUMNS = layout.offsetof(4);
        RATIO = layout.offsetof(5);
        ITEM_WIDTH = layout.offsetof(6);
        ITEM_HEIGHT = layout.offsetof(7);
        ITEM_OFFSET = layout.offsetof(8);
        FILLED = layout.offsetof(9);
        ITEM = layout.offsetof(10);
        TREE_DEPTH = layout.offsetof(11);
        TEMPLATES = layout.offsetof(12);
    }

    /**
     * Creates a {@code NkRowLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkRowLayout(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("enum nk_panel_row_layout_type")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code index} field. */
    public int index() { return nindex(address()); }
    /** Returns the value of the {@code height} field. */
    public float height() { return nheight(address()); }
    /** Returns the value of the {@code min_height} field. */
    public float min_height() { return nmin_height(address()); }
    /** Returns the value of the {@code columns} field. */
    public int columns() { return ncolumns(address()); }
    /**
     * Returns a {@link FloatBuffer} view of the data pointed to by the {@code ratio} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("float const *")
    public FloatBuffer ratio(int capacity) { return nratio(address(), capacity); }
    /** Returns the value of the {@code item_width} field. */
    public float item_width() { return nitem_width(address()); }
    /** Returns the value of the {@code item_height} field. */
    public float item_height() { return nitem_height(address()); }
    /** Returns the value of the {@code item_offset} field. */
    public float item_offset() { return nitem_offset(address()); }
    /** Returns the value of the {@code filled} field. */
    public float filled() { return nfilled(address()); }
    /** Returns a {@link NkRect} view of the {@code item} field. */
    @NativeType("struct nk_rect")
    public NkRect item() { return nitem(address()); }
    /** Returns the value of the {@code tree_depth} field. */
    public int tree_depth() { return ntree_depth(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code templates} field. */
    @NativeType("float[16]")
    public FloatBuffer templates() { return ntemplates(address()); }
    /** Returns the value at the specified index of the {@code templates} field. */
    public float templates(int index) { return ntemplates(address(), index); }

    // -----------------------------------

    /** Returns a new {@code NkRowLayout} instance for the specified memory address. */
    public static NkRowLayout create(long address) {
        return wrap(NkRowLayout.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkRowLayout createSafe(long address) {
        return address == NULL ? null : wrap(NkRowLayout.class, address);
    }

    /**
     * Create a {@link NkRowLayout.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkRowLayout.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkRowLayout.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + NkRowLayout.TYPE); }
    /** Unsafe version of {@link #index}. */
    public static int nindex(long struct) { return UNSAFE.getInt(null, struct + NkRowLayout.INDEX); }
    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return UNSAFE.getFloat(null, struct + NkRowLayout.HEIGHT); }
    /** Unsafe version of {@link #min_height}. */
    public static float nmin_height(long struct) { return UNSAFE.getFloat(null, struct + NkRowLayout.MIN_HEIGHT); }
    /** Unsafe version of {@link #columns}. */
    public static int ncolumns(long struct) { return UNSAFE.getInt(null, struct + NkRowLayout.COLUMNS); }
    /** Unsafe version of {@link #ratio(int) ratio}. */
    public static FloatBuffer nratio(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + NkRowLayout.RATIO), capacity); }
    /** Unsafe version of {@link #item_width}. */
    public static float nitem_width(long struct) { return UNSAFE.getFloat(null, struct + NkRowLayout.ITEM_WIDTH); }
    /** Unsafe version of {@link #item_height}. */
    public static float nitem_height(long struct) { return UNSAFE.getFloat(null, struct + NkRowLayout.ITEM_HEIGHT); }
    /** Unsafe version of {@link #item_offset}. */
    public static float nitem_offset(long struct) { return UNSAFE.getFloat(null, struct + NkRowLayout.ITEM_OFFSET); }
    /** Unsafe version of {@link #filled}. */
    public static float nfilled(long struct) { return UNSAFE.getFloat(null, struct + NkRowLayout.FILLED); }
    /** Unsafe version of {@link #item}. */
    public static NkRect nitem(long struct) { return NkRect.create(struct + NkRowLayout.ITEM); }
    /** Unsafe version of {@link #tree_depth}. */
    public static int ntree_depth(long struct) { return UNSAFE.getInt(null, struct + NkRowLayout.TREE_DEPTH); }
    /** Unsafe version of {@link #templates}. */
    public static FloatBuffer ntemplates(long struct) { return memFloatBuffer(struct + NkRowLayout.TEMPLATES, 16); }
    /** Unsafe version of {@link #templates(int) templates}. */
    public static float ntemplates(long struct, int index) {
        return UNSAFE.getFloat(null, struct + NkRowLayout.TEMPLATES + check(index, 16) * 4);
    }

    // -----------------------------------

    /** An array of {@link NkRowLayout} structs. */
    public static class Buffer extends StructBuffer<NkRowLayout, Buffer> {

        private static final NkRowLayout ELEMENT_FACTORY = NkRowLayout.create(-1L);

        /**
         * Creates a new {@code NkRowLayout.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkRowLayout#SIZEOF}, and its mark will be undefined.
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
        protected NkRowLayout getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("enum nk_panel_row_layout_type")
        public int type() { return NkRowLayout.ntype(address()); }
        /** Returns the value of the {@code index} field. */
        public int index() { return NkRowLayout.nindex(address()); }
        /** Returns the value of the {@code height} field. */
        public float height() { return NkRowLayout.nheight(address()); }
        /** Returns the value of the {@code min_height} field. */
        public float min_height() { return NkRowLayout.nmin_height(address()); }
        /** Returns the value of the {@code columns} field. */
        public int columns() { return NkRowLayout.ncolumns(address()); }
        /**
         * Returns a {@link FloatBuffer} view of the data pointed to by the {@code ratio} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("float const *")
        public FloatBuffer ratio(int capacity) { return NkRowLayout.nratio(address(), capacity); }
        /** Returns the value of the {@code item_width} field. */
        public float item_width() { return NkRowLayout.nitem_width(address()); }
        /** Returns the value of the {@code item_height} field. */
        public float item_height() { return NkRowLayout.nitem_height(address()); }
        /** Returns the value of the {@code item_offset} field. */
        public float item_offset() { return NkRowLayout.nitem_offset(address()); }
        /** Returns the value of the {@code filled} field. */
        public float filled() { return NkRowLayout.nfilled(address()); }
        /** Returns a {@link NkRect} view of the {@code item} field. */
        @NativeType("struct nk_rect")
        public NkRect item() { return NkRowLayout.nitem(address()); }
        /** Returns the value of the {@code tree_depth} field. */
        public int tree_depth() { return NkRowLayout.ntree_depth(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code templates} field. */
        @NativeType("float[16]")
        public FloatBuffer templates() { return NkRowLayout.ntemplates(address()); }
        /** Returns the value at the specified index of the {@code templates} field. */
        public float templates(int index) { return NkRowLayout.ntemplates(address(), index); }

    }

}