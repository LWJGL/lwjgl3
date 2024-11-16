/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

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
 * struct InputSkeletalActionData_t {
 *     bool {@link #bActive};
 *     VRInputValueHandle_t {@link #activeOrigin};
 * }</code></pre>
 */
@NativeType("struct InputSkeletalActionData_t")
public class InputSkeletalActionData extends Struct<InputSkeletalActionData> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BACTIVE,
        ACTIVEORIGIN;

    static {
        Layout layout = __struct(
            __member(1),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BACTIVE = layout.offsetof(0);
        ACTIVEORIGIN = layout.offsetof(1);
    }

    protected InputSkeletalActionData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected InputSkeletalActionData create(long address, @Nullable ByteBuffer container) {
        return new InputSkeletalActionData(address, container);
    }

    /**
     * Creates a {@code InputSkeletalActionData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public InputSkeletalActionData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** whether or not this action is currently available to be bound in the active action set */
    @NativeType("bool")
    public boolean bActive() { return nbActive(address()); }
    /** the origin that caused this action's current state */
    @NativeType("VRInputValueHandle_t")
    public long activeOrigin() { return nactiveOrigin(address()); }

    // -----------------------------------

    /** Returns a new {@code InputSkeletalActionData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static InputSkeletalActionData malloc() {
        return new InputSkeletalActionData(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code InputSkeletalActionData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static InputSkeletalActionData calloc() {
        return new InputSkeletalActionData(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code InputSkeletalActionData} instance allocated with {@link BufferUtils}. */
    public static InputSkeletalActionData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new InputSkeletalActionData(memAddress(container), container);
    }

    /** Returns a new {@code InputSkeletalActionData} instance for the specified memory address. */
    public static InputSkeletalActionData create(long address) {
        return new InputSkeletalActionData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable InputSkeletalActionData createSafe(long address) {
        return address == NULL ? null : new InputSkeletalActionData(address, null);
    }

    /**
     * Returns a new {@link InputSkeletalActionData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputSkeletalActionData.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link InputSkeletalActionData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputSkeletalActionData.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputSkeletalActionData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static InputSkeletalActionData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link InputSkeletalActionData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static InputSkeletalActionData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static InputSkeletalActionData.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static InputSkeletalActionData mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static InputSkeletalActionData callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static InputSkeletalActionData mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static InputSkeletalActionData callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static InputSkeletalActionData.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static InputSkeletalActionData.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static InputSkeletalActionData.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static InputSkeletalActionData.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code InputSkeletalActionData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static InputSkeletalActionData malloc(MemoryStack stack) {
        return new InputSkeletalActionData(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code InputSkeletalActionData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static InputSkeletalActionData calloc(MemoryStack stack) {
        return new InputSkeletalActionData(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link InputSkeletalActionData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputSkeletalActionData.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputSkeletalActionData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputSkeletalActionData.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bActive}. */
    public static boolean nbActive(long struct) { return memGetByte(struct + InputSkeletalActionData.BACTIVE) != 0; }
    /** Unsafe version of {@link #activeOrigin}. */
    public static long nactiveOrigin(long struct) { return memGetLong(struct + InputSkeletalActionData.ACTIVEORIGIN); }

    // -----------------------------------

    /** An array of {@link InputSkeletalActionData} structs. */
    public static class Buffer extends StructBuffer<InputSkeletalActionData, Buffer> implements NativeResource {

        private static final InputSkeletalActionData ELEMENT_FACTORY = InputSkeletalActionData.create(-1L);

        /**
         * Creates a new {@code InputSkeletalActionData.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link InputSkeletalActionData#SIZEOF}, and its mark will be undefined.</p>
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
        protected InputSkeletalActionData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link InputSkeletalActionData#bActive} field. */
        @NativeType("bool")
        public boolean bActive() { return InputSkeletalActionData.nbActive(address()); }
        /** @return the value of the {@link InputSkeletalActionData#activeOrigin} field. */
        @NativeType("VRInputValueHandle_t")
        public long activeOrigin() { return InputSkeletalActionData.nactiveOrigin(address()); }

    }

}