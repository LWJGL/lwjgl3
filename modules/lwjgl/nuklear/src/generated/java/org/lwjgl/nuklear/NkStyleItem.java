/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code type} &ndash; the style type. One of:<br><table><tr><td>{@link Nuklear#NK_STYLE_ITEM_COLOR STYLE_ITEM_COLOR}</td><td>{@link Nuklear#NK_STYLE_ITEM_IMAGE STYLE_ITEM_IMAGE}</td></tr></table></li>
 * <li>{@code data} &ndash; the style data</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_style_item {
 *     enum nk_style_item_type type;
 *     {@link NkStyleItemData union nk_style_item_data} data;
 * }</pre></code>
 */
@NativeType("struct nk_style_item")
public class NkStyleItem extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(NkStyleItemData.SIZEOF, NkStyleItemData.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    NkStyleItem(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkStyleItem} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleItem(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("enum nk_style_item_type")
    public int type() { return ntype(address()); }
    /** Returns a {@link NkStyleItemData} view of the {@code data} field. */
    @NativeType("union nk_style_item_data")
    public NkStyleItemData data() { return ndata(address()); }

    /** Sets the specified value to the {@code type} field. */
    public NkStyleItem type(@NativeType("enum nk_style_item_type") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link NkStyleItemData} to the {@code data} field. */
    public NkStyleItem data(@NativeType("union nk_style_item_data") NkStyleItemData value) { ndata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleItem set(
        int type,
        NkStyleItemData data
    ) {
        type(type);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkStyleItem set(NkStyleItem src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link NkStyleItem} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleItem malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link NkStyleItem} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleItem calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link NkStyleItem} instance allocated with {@link BufferUtils}. */
    public static NkStyleItem create() {
        return new NkStyleItem(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link NkStyleItem} instance for the specified memory address. */
    public static NkStyleItem create(long address) {
        return new NkStyleItem(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleItem createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link NkStyleItem.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleItem.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleItem.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleItem.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleItem.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleItem.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link NkStyleItem.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleItem.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleItem.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link NkStyleItem} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleItem mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link NkStyleItem} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleItem callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link NkStyleItem} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleItem mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleItem} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleItem callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleItem.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleItem.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleItem.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleItem.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleItem.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleItem.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleItem.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleItem.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + NkStyleItem.TYPE); }
    /** Unsafe version of {@link #data}. */
    public static NkStyleItemData ndata(long struct) { return NkStyleItemData.create(struct + NkStyleItem.DATA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + NkStyleItem.TYPE, value); }
    /** Unsafe version of {@link #data(NkStyleItemData) data}. */
    public static void ndata(long struct, NkStyleItemData value) { memCopy(value.address(), struct + NkStyleItem.DATA, NkStyleItemData.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkStyleItem} structs. */
    public static class Buffer extends StructBuffer<NkStyleItem, Buffer> implements NativeResource {

        /**
         * Creates a new {@link NkStyleItem.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleItem#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected NkStyleItem newInstance(long address) {
            return new NkStyleItem(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("enum nk_style_item_type")
        public int type() { return NkStyleItem.ntype(address()); }
        /** Returns a {@link NkStyleItemData} view of the {@code data} field. */
        @NativeType("union nk_style_item_data")
        public NkStyleItemData data() { return NkStyleItem.ndata(address()); }

        /** Sets the specified value to the {@code type} field. */
        public NkStyleItem.Buffer type(@NativeType("enum nk_style_item_type") int value) { NkStyleItem.ntype(address(), value); return this; }
        /** Copies the specified {@link NkStyleItemData} to the {@code data} field. */
        public NkStyleItem.Buffer data(@NativeType("union nk_style_item_data") NkStyleItemData value) { NkStyleItem.ndata(address(), value); return this; }

    }

}