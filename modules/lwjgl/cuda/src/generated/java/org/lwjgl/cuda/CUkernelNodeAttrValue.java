/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Graph kernel node attributes union, used with {@link CU#cuGraphKernelNodeSetAttribute GraphKernelNodeSetAttribute}/{@link CU#cuGraphKernelNodeGetAttribute GraphKernelNodeGetAttribute}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union CUkernelNodeAttrValue {
 *     {@link CUaccessPolicyWindow CUaccessPolicyWindow} {@link #accessPolicyWindow};
 *     int {@link #cooperative};
 * }</code></pre>
 */
public class CUkernelNodeAttrValue extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ACCESSPOLICYWINDOW,
        COOPERATIVE;

    static {
        Layout layout = __union(
            __member(CUaccessPolicyWindow.SIZEOF, CUaccessPolicyWindow.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ACCESSPOLICYWINDOW = layout.offsetof(0);
        COOPERATIVE = layout.offsetof(1);
    }

    /**
     * Creates a {@code CUkernelNodeAttrValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUkernelNodeAttrValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** attribute {@code CUaccessPolicyWindow} */
    public CUaccessPolicyWindow accessPolicyWindow() { return naccessPolicyWindow(address()); }
    /** nonzero indicates a cooperative kernel (see {@link CU#cuLaunchCooperativeKernel LaunchCooperativeKernel}) */
    public int cooperative() { return ncooperative(address()); }

    /** Copies the specified {@link CUaccessPolicyWindow} to the {@link #accessPolicyWindow} field. */
    public CUkernelNodeAttrValue accessPolicyWindow(CUaccessPolicyWindow value) { naccessPolicyWindow(address(), value); return this; }
    /** Passes the {@link #accessPolicyWindow} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUkernelNodeAttrValue accessPolicyWindow(java.util.function.Consumer<CUaccessPolicyWindow> consumer) { consumer.accept(accessPolicyWindow()); return this; }
    /** Sets the specified value to the {@link #cooperative} field. */
    public CUkernelNodeAttrValue cooperative(int value) { ncooperative(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUkernelNodeAttrValue set(CUkernelNodeAttrValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUkernelNodeAttrValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUkernelNodeAttrValue malloc() {
        return wrap(CUkernelNodeAttrValue.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUkernelNodeAttrValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUkernelNodeAttrValue calloc() {
        return wrap(CUkernelNodeAttrValue.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUkernelNodeAttrValue} instance allocated with {@link BufferUtils}. */
    public static CUkernelNodeAttrValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUkernelNodeAttrValue.class, memAddress(container), container);
    }

    /** Returns a new {@code CUkernelNodeAttrValue} instance for the specified memory address. */
    public static CUkernelNodeAttrValue create(long address) {
        return wrap(CUkernelNodeAttrValue.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUkernelNodeAttrValue createSafe(long address) {
        return address == NULL ? null : wrap(CUkernelNodeAttrValue.class, address);
    }

    /**
     * Returns a new {@link CUkernelNodeAttrValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUkernelNodeAttrValue.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUkernelNodeAttrValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUkernelNodeAttrValue.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUkernelNodeAttrValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUkernelNodeAttrValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUkernelNodeAttrValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUkernelNodeAttrValue.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUkernelNodeAttrValue.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUkernelNodeAttrValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUkernelNodeAttrValue malloc(MemoryStack stack) {
        return wrap(CUkernelNodeAttrValue.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUkernelNodeAttrValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUkernelNodeAttrValue calloc(MemoryStack stack) {
        return wrap(CUkernelNodeAttrValue.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUkernelNodeAttrValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUkernelNodeAttrValue.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUkernelNodeAttrValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUkernelNodeAttrValue.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #accessPolicyWindow}. */
    public static CUaccessPolicyWindow naccessPolicyWindow(long struct) { return CUaccessPolicyWindow.create(struct + CUkernelNodeAttrValue.ACCESSPOLICYWINDOW); }
    /** Unsafe version of {@link #cooperative}. */
    public static int ncooperative(long struct) { return UNSAFE.getInt(null, struct + CUkernelNodeAttrValue.COOPERATIVE); }

    /** Unsafe version of {@link #accessPolicyWindow(CUaccessPolicyWindow) accessPolicyWindow}. */
    public static void naccessPolicyWindow(long struct, CUaccessPolicyWindow value) { memCopy(value.address(), struct + CUkernelNodeAttrValue.ACCESSPOLICYWINDOW, CUaccessPolicyWindow.SIZEOF); }
    /** Unsafe version of {@link #cooperative(int) cooperative}. */
    public static void ncooperative(long struct, int value) { UNSAFE.putInt(null, struct + CUkernelNodeAttrValue.COOPERATIVE, value); }

    // -----------------------------------

    /** An array of {@link CUkernelNodeAttrValue} structs. */
    public static class Buffer extends StructBuffer<CUkernelNodeAttrValue, Buffer> implements NativeResource {

        private static final CUkernelNodeAttrValue ELEMENT_FACTORY = CUkernelNodeAttrValue.create(-1L);

        /**
         * Creates a new {@code CUkernelNodeAttrValue.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUkernelNodeAttrValue#SIZEOF}, and its mark will be undefined.
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
        protected CUkernelNodeAttrValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CUaccessPolicyWindow} view of the {@link CUkernelNodeAttrValue#accessPolicyWindow} field. */
        public CUaccessPolicyWindow accessPolicyWindow() { return CUkernelNodeAttrValue.naccessPolicyWindow(address()); }
        /** @return the value of the {@link CUkernelNodeAttrValue#cooperative} field. */
        public int cooperative() { return CUkernelNodeAttrValue.ncooperative(address()); }

        /** Copies the specified {@link CUaccessPolicyWindow} to the {@link CUkernelNodeAttrValue#accessPolicyWindow} field. */
        public CUkernelNodeAttrValue.Buffer accessPolicyWindow(CUaccessPolicyWindow value) { CUkernelNodeAttrValue.naccessPolicyWindow(address(), value); return this; }
        /** Passes the {@link CUkernelNodeAttrValue#accessPolicyWindow} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUkernelNodeAttrValue.Buffer accessPolicyWindow(java.util.function.Consumer<CUaccessPolicyWindow> consumer) { consumer.accept(accessPolicyWindow()); return this; }
        /** Sets the specified value to the {@link CUkernelNodeAttrValue#cooperative} field. */
        public CUkernelNodeAttrValue.Buffer cooperative(int value) { CUkernelNodeAttrValue.ncooperative(address(), value); return this; }

    }

}