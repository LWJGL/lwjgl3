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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union nk_style_item_data {
 *     {@link NkImage struct nk_image} image;
 *     {@link NkColor struct nk_color} color;
 * }</code></pre>
 */
@NativeType("union nk_style_item_data")
public class NkStyleItemData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMAGE,
        COLOR;

    static {
        Layout layout = __union(
            __member(NkImage.SIZEOF, NkImage.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMAGE = layout.offsetof(0);
        COLOR = layout.offsetof(1);
    }

    /**
     * Creates a {@code NkStyleItemData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleItemData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkImage} view of the {@code image} field. */
    @NativeType("struct nk_image")
    public NkImage image() { return nimage(address()); }
    /** Returns a {@link NkColor} view of the {@code color} field. */
    @NativeType("struct nk_color")
    public NkColor color() { return ncolor(address()); }

    /** Copies the specified {@link NkImage} to the {@code image} field. */
    public NkStyleItemData image(@NativeType("struct nk_image") NkImage value) { nimage(address(), value); return this; }
    /** Passes the {@code image} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleItemData image(java.util.function.Consumer<NkImage> consumer) { consumer.accept(image()); return this; }
    /** Copies the specified {@link NkColor} to the {@code color} field. */
    public NkStyleItemData color(@NativeType("struct nk_color") NkColor value) { ncolor(address(), value); return this; }
    /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleItemData color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(color()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkStyleItemData set(NkStyleItemData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleItemData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleItemData malloc() {
        return wrap(NkStyleItemData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleItemData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleItemData calloc() {
        return wrap(NkStyleItemData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleItemData} instance allocated with {@link BufferUtils}. */
    public static NkStyleItemData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleItemData.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleItemData} instance for the specified memory address. */
    public static NkStyleItemData create(long address) {
        return wrap(NkStyleItemData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleItemData createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleItemData.class, address);
    }

    /**
     * Returns a new {@link NkStyleItemData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleItemData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleItemData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleItemData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleItemData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleItemData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleItemData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleItemData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleItemData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleItemData} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleItemData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleItemData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleItemData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleItemData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleItemData mallocStack(MemoryStack stack) {
        return wrap(NkStyleItemData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleItemData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleItemData callocStack(MemoryStack stack) {
        return wrap(NkStyleItemData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleItemData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleItemData.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleItemData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleItemData.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleItemData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleItemData.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleItemData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleItemData.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #image}. */
    public static NkImage nimage(long struct) { return NkImage.create(struct + NkStyleItemData.IMAGE); }
    /** Unsafe version of {@link #color}. */
    public static NkColor ncolor(long struct) { return NkColor.create(struct + NkStyleItemData.COLOR); }

    /** Unsafe version of {@link #image(NkImage) image}. */
    public static void nimage(long struct, NkImage value) { memCopy(value.address(), struct + NkStyleItemData.IMAGE, NkImage.SIZEOF); }
    /** Unsafe version of {@link #color(NkColor) color}. */
    public static void ncolor(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleItemData.COLOR, NkColor.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkStyleItemData} structs. */
    public static class Buffer extends StructBuffer<NkStyleItemData, Buffer> implements NativeResource {

        private static final NkStyleItemData ELEMENT_FACTORY = NkStyleItemData.create(-1L);

        /**
         * Creates a new {@code NkStyleItemData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleItemData#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleItemData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkImage} view of the {@code image} field. */
        @NativeType("struct nk_image")
        public NkImage image() { return NkStyleItemData.nimage(address()); }
        /** Returns a {@link NkColor} view of the {@code color} field. */
        @NativeType("struct nk_color")
        public NkColor color() { return NkStyleItemData.ncolor(address()); }

        /** Copies the specified {@link NkImage} to the {@code image} field. */
        public NkStyleItemData.Buffer image(@NativeType("struct nk_image") NkImage value) { NkStyleItemData.nimage(address(), value); return this; }
        /** Passes the {@code image} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleItemData.Buffer image(java.util.function.Consumer<NkImage> consumer) { consumer.accept(image()); return this; }
        /** Copies the specified {@link NkColor} to the {@code color} field. */
        public NkStyleItemData.Buffer color(@NativeType("struct nk_color") NkColor value) { NkStyleItemData.ncolor(address(), value); return this; }
        /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleItemData.Buffer color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(color()); return this; }

    }

}