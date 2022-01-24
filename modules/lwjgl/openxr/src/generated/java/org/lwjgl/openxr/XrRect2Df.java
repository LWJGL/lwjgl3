/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Rect in two dimensions.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is used for component values that may be fractional (floating-point).</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExtent2Df}, {@link XrOffset2Df}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrRect2Df {
 *     {@link XrOffset2Df XrOffset2Df} {@link #offset};
 *     {@link XrExtent2Df XrExtent2Df} {@link #extent};
 * }</code></pre>
 */
public class XrRect2Df extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        EXTENT;

    static {
        Layout layout = __struct(
            __member(XrOffset2Df.SIZEOF, XrOffset2Df.ALIGNOF),
            __member(XrExtent2Df.SIZEOF, XrExtent2Df.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        EXTENT = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrRect2Df} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRect2Df(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@link XrOffset2Df} specifying the rectangle offset. */
    public XrOffset2Df offset() { return noffset(address()); }
    /** the {@link XrExtent2Df} specifying the rectangle extent. */
    public XrExtent2Df extent() { return nextent(address()); }

    /** Copies the specified {@link XrOffset2Df} to the {@link #offset} field. */
    public XrRect2Df offset(XrOffset2Df value) { noffset(address(), value); return this; }
    /** Passes the {@link #offset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRect2Df offset(java.util.function.Consumer<XrOffset2Df> consumer) { consumer.accept(offset()); return this; }
    /** Copies the specified {@link XrExtent2Df} to the {@link #extent} field. */
    public XrRect2Df extent(XrExtent2Df value) { nextent(address(), value); return this; }
    /** Passes the {@link #extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRect2Df extent(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extent()); return this; }

    /** Initializes this struct with the specified values. */
    public XrRect2Df set(
        XrOffset2Df offset,
        XrExtent2Df extent
    ) {
        offset(offset);
        extent(extent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRect2Df set(XrRect2Df src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRect2Df} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRect2Df malloc() {
        return wrap(XrRect2Df.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrRect2Df} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRect2Df calloc() {
        return wrap(XrRect2Df.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrRect2Df} instance allocated with {@link BufferUtils}. */
    public static XrRect2Df create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrRect2Df.class, memAddress(container), container);
    }

    /** Returns a new {@code XrRect2Df} instance for the specified memory address. */
    public static XrRect2Df create(long address) {
        return wrap(XrRect2Df.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRect2Df createSafe(long address) {
        return address == NULL ? null : wrap(XrRect2Df.class, address);
    }

    /**
     * Returns a new {@link XrRect2Df.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRect2Df.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRect2Df.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRect2Df.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRect2Df.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRect2Df.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrRect2Df.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRect2Df.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRect2Df.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrRect2Df} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRect2Df malloc(MemoryStack stack) {
        return wrap(XrRect2Df.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrRect2Df} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRect2Df calloc(MemoryStack stack) {
        return wrap(XrRect2Df.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrRect2Df.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRect2Df.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRect2Df.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRect2Df.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static XrOffset2Df noffset(long struct) { return XrOffset2Df.create(struct + XrRect2Df.OFFSET); }
    /** Unsafe version of {@link #extent}. */
    public static XrExtent2Df nextent(long struct) { return XrExtent2Df.create(struct + XrRect2Df.EXTENT); }

    /** Unsafe version of {@link #offset(XrOffset2Df) offset}. */
    public static void noffset(long struct, XrOffset2Df value) { memCopy(value.address(), struct + XrRect2Df.OFFSET, XrOffset2Df.SIZEOF); }
    /** Unsafe version of {@link #extent(XrExtent2Df) extent}. */
    public static void nextent(long struct, XrExtent2Df value) { memCopy(value.address(), struct + XrRect2Df.EXTENT, XrExtent2Df.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrRect2Df} structs. */
    public static class Buffer extends StructBuffer<XrRect2Df, Buffer> implements NativeResource {

        private static final XrRect2Df ELEMENT_FACTORY = XrRect2Df.create(-1L);

        /**
         * Creates a new {@code XrRect2Df.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRect2Df#SIZEOF}, and its mark will be undefined.
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
        protected XrRect2Df getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrOffset2Df} view of the {@link XrRect2Df#offset} field. */
        public XrOffset2Df offset() { return XrRect2Df.noffset(address()); }
        /** @return a {@link XrExtent2Df} view of the {@link XrRect2Df#extent} field. */
        public XrExtent2Df extent() { return XrRect2Df.nextent(address()); }

        /** Copies the specified {@link XrOffset2Df} to the {@link XrRect2Df#offset} field. */
        public XrRect2Df.Buffer offset(XrOffset2Df value) { XrRect2Df.noffset(address(), value); return this; }
        /** Passes the {@link XrRect2Df#offset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRect2Df.Buffer offset(java.util.function.Consumer<XrOffset2Df> consumer) { consumer.accept(offset()); return this; }
        /** Copies the specified {@link XrExtent2Df} to the {@link XrRect2Df#extent} field. */
        public XrRect2Df.Buffer extent(XrExtent2Df value) { XrRect2Df.nextent(address(), value); return this; }
        /** Passes the {@link XrRect2Df#extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRect2Df.Buffer extent(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extent()); return this; }

    }

}