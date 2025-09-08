/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct XrRenderModelNodeStateEXT {
 *     {@link XrPosef XrPosef} nodePose;
 *     XrBool32 isVisible;
 * }</code></pre>
 */
public class XrRenderModelNodeStateEXT extends Struct<XrRenderModelNodeStateEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NODEPOSE,
        ISVISIBLE;

    static {
        Layout layout = __struct(
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NODEPOSE = layout.offsetof(0);
        ISVISIBLE = layout.offsetof(1);
    }

    protected XrRenderModelNodeStateEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelNodeStateEXT create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelNodeStateEXT(address, container);
    }

    /**
     * Creates a {@code XrRenderModelNodeStateEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelNodeStateEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link XrPosef} view of the {@code nodePose} field. */
    public XrPosef nodePose() { return nnodePose(address()); }
    /** @return the value of the {@code isVisible} field. */
    @NativeType("XrBool32")
    public boolean isVisible() { return nisVisible(address()) != 0; }

    /** Copies the specified {@link XrPosef} to the {@code nodePose} field. */
    public XrRenderModelNodeStateEXT nodePose(XrPosef value) { nnodePose(address(), value); return this; }
    /** Passes the {@code nodePose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRenderModelNodeStateEXT nodePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(nodePose()); return this; }
    /** Sets the specified value to the {@code isVisible} field. */
    public XrRenderModelNodeStateEXT isVisible(@NativeType("XrBool32") boolean value) { nisVisible(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelNodeStateEXT set(
        XrPosef nodePose,
        boolean isVisible
    ) {
        nodePose(nodePose);
        isVisible(isVisible);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelNodeStateEXT set(XrRenderModelNodeStateEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelNodeStateEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelNodeStateEXT malloc() {
        return new XrRenderModelNodeStateEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelNodeStateEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelNodeStateEXT calloc() {
        return new XrRenderModelNodeStateEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelNodeStateEXT} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelNodeStateEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelNodeStateEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelNodeStateEXT} instance for the specified memory address. */
    public static XrRenderModelNodeStateEXT create(long address) {
        return new XrRenderModelNodeStateEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelNodeStateEXT createSafe(long address) {
        return address == NULL ? null : new XrRenderModelNodeStateEXT(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelNodeStateEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelNodeStateEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelNodeStateEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelNodeStateEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelNodeStateEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelNodeStateEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelNodeStateEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelNodeStateEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelNodeStateEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelNodeStateEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelNodeStateEXT malloc(MemoryStack stack) {
        return new XrRenderModelNodeStateEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelNodeStateEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelNodeStateEXT calloc(MemoryStack stack) {
        return new XrRenderModelNodeStateEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelNodeStateEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelNodeStateEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelNodeStateEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelNodeStateEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #nodePose}. */
    public static XrPosef nnodePose(long struct) { return XrPosef.create(struct + XrRenderModelNodeStateEXT.NODEPOSE); }
    /** Unsafe version of {@link #isVisible}. */
    public static int nisVisible(long struct) { return memGetInt(struct + XrRenderModelNodeStateEXT.ISVISIBLE); }

    /** Unsafe version of {@link #nodePose(XrPosef) nodePose}. */
    public static void nnodePose(long struct, XrPosef value) { memCopy(value.address(), struct + XrRenderModelNodeStateEXT.NODEPOSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #isVisible(boolean) isVisible}. */
    public static void nisVisible(long struct, int value) { memPutInt(struct + XrRenderModelNodeStateEXT.ISVISIBLE, value); }

    // -----------------------------------

    /** An array of {@link XrRenderModelNodeStateEXT} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelNodeStateEXT, Buffer> implements NativeResource {

        private static final XrRenderModelNodeStateEXT ELEMENT_FACTORY = XrRenderModelNodeStateEXT.create(-1L);

        /**
         * Creates a new {@code XrRenderModelNodeStateEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelNodeStateEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrRenderModelNodeStateEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrPosef} view of the {@code nodePose} field. */
        public XrPosef nodePose() { return XrRenderModelNodeStateEXT.nnodePose(address()); }
        /** @return the value of the {@code isVisible} field. */
        @NativeType("XrBool32")
        public boolean isVisible() { return XrRenderModelNodeStateEXT.nisVisible(address()) != 0; }

        /** Copies the specified {@link XrPosef} to the {@code nodePose} field. */
        public XrRenderModelNodeStateEXT.Buffer nodePose(XrPosef value) { XrRenderModelNodeStateEXT.nnodePose(address(), value); return this; }
        /** Passes the {@code nodePose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRenderModelNodeStateEXT.Buffer nodePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(nodePose()); return this; }
        /** Sets the specified value to the {@code isVisible} field. */
        public XrRenderModelNodeStateEXT.Buffer isVisible(@NativeType("XrBool32") boolean value) { XrRenderModelNodeStateEXT.nisVisible(address(), value ? 1 : 0); return this; }

    }

}