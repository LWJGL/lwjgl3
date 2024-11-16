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
 * struct InputDigitalActionData_t {
 *     bool {@link #bActive};
 *     VRInputValueHandle_t {@link #activeOrigin};
 *     bool {@link #bState};
 *     bool {@link #bChanged};
 *     float {@link #fUpdateTime};
 * }</code></pre>
 */
@NativeType("struct InputDigitalActionData_t")
public class InputDigitalActionData extends Struct<InputDigitalActionData> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BACTIVE,
        ACTIVEORIGIN,
        BSTATE,
        BCHANGED,
        FUPDATETIME;

    static {
        Layout layout = __struct(
            __member(1),
            __member(8),
            __member(1),
            __member(1),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BACTIVE = layout.offsetof(0);
        ACTIVEORIGIN = layout.offsetof(1);
        BSTATE = layout.offsetof(2);
        BCHANGED = layout.offsetof(3);
        FUPDATETIME = layout.offsetof(4);
    }

    protected InputDigitalActionData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected InputDigitalActionData create(long address, @Nullable ByteBuffer container) {
        return new InputDigitalActionData(address, container);
    }

    /**
     * Creates a {@code InputDigitalActionData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public InputDigitalActionData(ByteBuffer container) {
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
    /** the current state of this action; will be true if currently pressed */
    @NativeType("bool")
    public boolean bState() { return nbState(address()); }
    /** this is true if the state has changed since the last frame */
    @NativeType("bool")
    public boolean bChanged() { return nbChanged(address()); }
    /** time relative to now when this event happened. Will be negative to indicate a past time. */
    public float fUpdateTime() { return nfUpdateTime(address()); }

    // -----------------------------------

    /** Returns a new {@code InputDigitalActionData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static InputDigitalActionData malloc() {
        return new InputDigitalActionData(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code InputDigitalActionData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static InputDigitalActionData calloc() {
        return new InputDigitalActionData(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code InputDigitalActionData} instance allocated with {@link BufferUtils}. */
    public static InputDigitalActionData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new InputDigitalActionData(memAddress(container), container);
    }

    /** Returns a new {@code InputDigitalActionData} instance for the specified memory address. */
    public static InputDigitalActionData create(long address) {
        return new InputDigitalActionData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable InputDigitalActionData createSafe(long address) {
        return address == NULL ? null : new InputDigitalActionData(address, null);
    }

    /**
     * Returns a new {@link InputDigitalActionData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputDigitalActionData.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link InputDigitalActionData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputDigitalActionData.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputDigitalActionData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static InputDigitalActionData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link InputDigitalActionData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static InputDigitalActionData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static InputDigitalActionData.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static InputDigitalActionData mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static InputDigitalActionData callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static InputDigitalActionData mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static InputDigitalActionData callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static InputDigitalActionData.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static InputDigitalActionData.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static InputDigitalActionData.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static InputDigitalActionData.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code InputDigitalActionData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static InputDigitalActionData malloc(MemoryStack stack) {
        return new InputDigitalActionData(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code InputDigitalActionData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static InputDigitalActionData calloc(MemoryStack stack) {
        return new InputDigitalActionData(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link InputDigitalActionData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputDigitalActionData.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputDigitalActionData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputDigitalActionData.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bActive}. */
    public static boolean nbActive(long struct) { return memGetByte(struct + InputDigitalActionData.BACTIVE) != 0; }
    /** Unsafe version of {@link #activeOrigin}. */
    public static long nactiveOrigin(long struct) { return memGetLong(struct + InputDigitalActionData.ACTIVEORIGIN); }
    /** Unsafe version of {@link #bState}. */
    public static boolean nbState(long struct) { return memGetByte(struct + InputDigitalActionData.BSTATE) != 0; }
    /** Unsafe version of {@link #bChanged}. */
    public static boolean nbChanged(long struct) { return memGetByte(struct + InputDigitalActionData.BCHANGED) != 0; }
    /** Unsafe version of {@link #fUpdateTime}. */
    public static float nfUpdateTime(long struct) { return memGetFloat(struct + InputDigitalActionData.FUPDATETIME); }

    // -----------------------------------

    /** An array of {@link InputDigitalActionData} structs. */
    public static class Buffer extends StructBuffer<InputDigitalActionData, Buffer> implements NativeResource {

        private static final InputDigitalActionData ELEMENT_FACTORY = InputDigitalActionData.create(-1L);

        /**
         * Creates a new {@code InputDigitalActionData.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link InputDigitalActionData#SIZEOF}, and its mark will be undefined.</p>
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
        protected InputDigitalActionData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link InputDigitalActionData#bActive} field. */
        @NativeType("bool")
        public boolean bActive() { return InputDigitalActionData.nbActive(address()); }
        /** @return the value of the {@link InputDigitalActionData#activeOrigin} field. */
        @NativeType("VRInputValueHandle_t")
        public long activeOrigin() { return InputDigitalActionData.nactiveOrigin(address()); }
        /** @return the value of the {@link InputDigitalActionData#bState} field. */
        @NativeType("bool")
        public boolean bState() { return InputDigitalActionData.nbState(address()); }
        /** @return the value of the {@link InputDigitalActionData#bChanged} field. */
        @NativeType("bool")
        public boolean bChanged() { return InputDigitalActionData.nbChanged(address()); }
        /** @return the value of the {@link InputDigitalActionData#fUpdateTime} field. */
        public float fUpdateTime() { return InputDigitalActionData.nfUpdateTime(address()); }

    }

}