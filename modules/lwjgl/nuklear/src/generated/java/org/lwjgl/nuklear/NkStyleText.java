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
 * struct nk_style_text {
 *     {@link NkColor struct nk_color} color;
 *     {@link NkVec2 struct nk_vec2} padding;
 * }</code></pre>
 */
@NativeType("struct nk_style_text")
public class NkStyleText extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLOR,
        PADDING;

    static {
        Layout layout = __struct(
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLOR = layout.offsetof(0);
        PADDING = layout.offsetof(1);
    }

    /**
     * Creates a {@code NkStyleText} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleText(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkColor} view of the {@code color} field. */
    @NativeType("struct nk_color")
    public NkColor color() { return ncolor(address()); }
    /** Returns a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }

    /** Copies the specified {@link NkColor} to the {@code color} field. */
    public NkStyleText color(@NativeType("struct nk_color") NkColor value) { ncolor(address(), value); return this; }
    /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleText color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(color()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleText padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleText padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleText set(
        NkColor color,
        NkVec2 padding
    ) {
        color(color);
        padding(padding);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkStyleText set(NkStyleText src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleText} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleText malloc() {
        return wrap(NkStyleText.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleText} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleText calloc() {
        return wrap(NkStyleText.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleText} instance allocated with {@link BufferUtils}. */
    public static NkStyleText create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleText.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleText} instance for the specified memory address. */
    public static NkStyleText create(long address) {
        return wrap(NkStyleText.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleText createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleText.class, address);
    }

    /**
     * Returns a new {@link NkStyleText.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleText.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleText.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleText.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleText.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleText.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleText.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleText.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleText.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleText} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleText mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleText} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleText callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleText} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleText mallocStack(MemoryStack stack) {
        return wrap(NkStyleText.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleText} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleText callocStack(MemoryStack stack) {
        return wrap(NkStyleText.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleText.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleText.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleText.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleText.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleText.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleText.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleText.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleText.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #color}. */
    public static NkColor ncolor(long struct) { return NkColor.create(struct + NkStyleText.COLOR); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleText.PADDING); }

    /** Unsafe version of {@link #color(NkColor) color}. */
    public static void ncolor(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleText.COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleText.PADDING, NkVec2.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkStyleText} structs. */
    public static class Buffer extends StructBuffer<NkStyleText, Buffer> implements NativeResource {

        private static final NkStyleText ELEMENT_FACTORY = NkStyleText.create(-1L);

        /**
         * Creates a new {@code NkStyleText.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleText#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleText getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkColor} view of the {@code color} field. */
        @NativeType("struct nk_color")
        public NkColor color() { return NkStyleText.ncolor(address()); }
        /** Returns a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleText.npadding(address()); }

        /** Copies the specified {@link NkColor} to the {@code color} field. */
        public NkStyleText.Buffer color(@NativeType("struct nk_color") NkColor value) { NkStyleText.ncolor(address(), value); return this; }
        /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleText.Buffer color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(color()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleText.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleText.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleText.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }

    }

}