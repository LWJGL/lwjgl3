/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union CUstreamAttrValue {
 *     {@link CUaccessPolicyWindow CUaccessPolicyWindow} accessPolicyWindow;
 *     CUsynchronizationPolicy syncPolicy;
 * }</code></pre>
 */
public class CUstreamAttrValue extends Struct<CUstreamAttrValue> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ACCESSPOLICYWINDOW,
        SYNCPOLICY;

    static {
        Layout layout = __union(
            __member(CUaccessPolicyWindow.SIZEOF, CUaccessPolicyWindow.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ACCESSPOLICYWINDOW = layout.offsetof(0);
        SYNCPOLICY = layout.offsetof(1);
    }

    protected CUstreamAttrValue(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUstreamAttrValue create(long address, @Nullable ByteBuffer container) {
        return new CUstreamAttrValue(address, container);
    }

    /**
     * Creates a {@code CUstreamAttrValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUstreamAttrValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CUaccessPolicyWindow} view of the {@code accessPolicyWindow} field. */
    public CUaccessPolicyWindow accessPolicyWindow() { return naccessPolicyWindow(address()); }
    /** @return the value of the {@code syncPolicy} field. */
    @NativeType("CUsynchronizationPolicy")
    public int syncPolicy() { return nsyncPolicy(address()); }

    /** Copies the specified {@link CUaccessPolicyWindow} to the {@code accessPolicyWindow} field. */
    public CUstreamAttrValue accessPolicyWindow(CUaccessPolicyWindow value) { naccessPolicyWindow(address(), value); return this; }
    /** Passes the {@code accessPolicyWindow} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUstreamAttrValue accessPolicyWindow(java.util.function.Consumer<CUaccessPolicyWindow> consumer) { consumer.accept(accessPolicyWindow()); return this; }
    /** Sets the specified value to the {@code syncPolicy} field. */
    public CUstreamAttrValue syncPolicy(@NativeType("CUsynchronizationPolicy") int value) { nsyncPolicy(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUstreamAttrValue set(CUstreamAttrValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUstreamAttrValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUstreamAttrValue malloc() {
        return new CUstreamAttrValue(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUstreamAttrValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUstreamAttrValue calloc() {
        return new CUstreamAttrValue(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUstreamAttrValue} instance allocated with {@link BufferUtils}. */
    public static CUstreamAttrValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUstreamAttrValue(memAddress(container), container);
    }

    /** Returns a new {@code CUstreamAttrValue} instance for the specified memory address. */
    public static CUstreamAttrValue create(long address) {
        return new CUstreamAttrValue(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUstreamAttrValue createSafe(long address) {
        return address == NULL ? null : new CUstreamAttrValue(address, null);
    }

    /**
     * Returns a new {@link CUstreamAttrValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUstreamAttrValue.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUstreamAttrValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUstreamAttrValue.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUstreamAttrValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUstreamAttrValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUstreamAttrValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUstreamAttrValue.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUstreamAttrValue.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUstreamAttrValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUstreamAttrValue malloc(MemoryStack stack) {
        return new CUstreamAttrValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUstreamAttrValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUstreamAttrValue calloc(MemoryStack stack) {
        return new CUstreamAttrValue(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUstreamAttrValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUstreamAttrValue.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUstreamAttrValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUstreamAttrValue.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #accessPolicyWindow}. */
    public static CUaccessPolicyWindow naccessPolicyWindow(long struct) { return CUaccessPolicyWindow.create(struct + CUstreamAttrValue.ACCESSPOLICYWINDOW); }
    /** Unsafe version of {@link #syncPolicy}. */
    public static int nsyncPolicy(long struct) { return memGetInt(struct + CUstreamAttrValue.SYNCPOLICY); }

    /** Unsafe version of {@link #accessPolicyWindow(CUaccessPolicyWindow) accessPolicyWindow}. */
    public static void naccessPolicyWindow(long struct, CUaccessPolicyWindow value) { memCopy(value.address(), struct + CUstreamAttrValue.ACCESSPOLICYWINDOW, CUaccessPolicyWindow.SIZEOF); }
    /** Unsafe version of {@link #syncPolicy(int) syncPolicy}. */
    public static void nsyncPolicy(long struct, int value) { memPutInt(struct + CUstreamAttrValue.SYNCPOLICY, value); }

    // -----------------------------------

    /** An array of {@link CUstreamAttrValue} structs. */
    public static class Buffer extends StructBuffer<CUstreamAttrValue, Buffer> implements NativeResource {

        private static final CUstreamAttrValue ELEMENT_FACTORY = CUstreamAttrValue.create(-1L);

        /**
         * Creates a new {@code CUstreamAttrValue.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUstreamAttrValue#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUstreamAttrValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CUaccessPolicyWindow} view of the {@code accessPolicyWindow} field. */
        public CUaccessPolicyWindow accessPolicyWindow() { return CUstreamAttrValue.naccessPolicyWindow(address()); }
        /** @return the value of the {@code syncPolicy} field. */
        @NativeType("CUsynchronizationPolicy")
        public int syncPolicy() { return CUstreamAttrValue.nsyncPolicy(address()); }

        /** Copies the specified {@link CUaccessPolicyWindow} to the {@code accessPolicyWindow} field. */
        public CUstreamAttrValue.Buffer accessPolicyWindow(CUaccessPolicyWindow value) { CUstreamAttrValue.naccessPolicyWindow(address(), value); return this; }
        /** Passes the {@code accessPolicyWindow} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUstreamAttrValue.Buffer accessPolicyWindow(java.util.function.Consumer<CUaccessPolicyWindow> consumer) { consumer.accept(accessPolicyWindow()); return this; }
        /** Sets the specified value to the {@code syncPolicy} field. */
        public CUstreamAttrValue.Buffer syncPolicy(@NativeType("CUsynchronizationPolicy") int value) { CUstreamAttrValue.nsyncPolicy(address(), value); return this; }

    }

}