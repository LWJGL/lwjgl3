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
 * struct InputAnalogActionData_t {
 *     bool {@link #bActive};
 *     VRInputValueHandle_t {@link #activeOrigin};
 *     float {@link #x};
 *     float {@link #y};
 *     float {@link #z};
 *     float {@link #deltaX};
 *     float {@link #deltaY};
 *     float {@link #deltaZ};
 *     float {@link #fUpdateTime};
 * }</code></pre>
 */
@NativeType("struct InputAnalogActionData_t")
public class InputAnalogActionData extends Struct<InputAnalogActionData> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BACTIVE,
        ACTIVEORIGIN,
        X,
        Y,
        Z,
        DELTAX,
        DELTAY,
        DELTAZ,
        FUPDATETIME;

    static {
        Layout layout = __struct(
            __member(1),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BACTIVE = layout.offsetof(0);
        ACTIVEORIGIN = layout.offsetof(1);
        X = layout.offsetof(2);
        Y = layout.offsetof(3);
        Z = layout.offsetof(4);
        DELTAX = layout.offsetof(5);
        DELTAY = layout.offsetof(6);
        DELTAZ = layout.offsetof(7);
        FUPDATETIME = layout.offsetof(8);
    }

    protected InputAnalogActionData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected InputAnalogActionData create(long address, @Nullable ByteBuffer container) {
        return new InputAnalogActionData(address, container);
    }

    /**
     * Creates a {@code InputAnalogActionData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public InputAnalogActionData(ByteBuffer container) {
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
    /** the current state of this action; will be delta updates for mouse actions */
    public float x() { return nx(address()); }
    /** the current state of this action; will be delta updates for mouse actions */
    public float y() { return ny(address()); }
    /** the current state of this action; will be delta updates for mouse actions */
    public float z() { return nz(address()); }
    /** teltas since the previous call to {@link VRInput#VRInput_UpdateActionState UpdateActionState} */
    public float deltaX() { return ndeltaX(address()); }
    /** teltas since the previous call to {@link VRInput#VRInput_UpdateActionState UpdateActionState} */
    public float deltaY() { return ndeltaY(address()); }
    /** teltas since the previous call to {@link VRInput#VRInput_UpdateActionState UpdateActionState} */
    public float deltaZ() { return ndeltaZ(address()); }
    /** time relative to now when this event happened. Will be negative to indicate a past time */
    public float fUpdateTime() { return nfUpdateTime(address()); }

    // -----------------------------------

    /** Returns a new {@code InputAnalogActionData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static InputAnalogActionData malloc() {
        return new InputAnalogActionData(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code InputAnalogActionData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static InputAnalogActionData calloc() {
        return new InputAnalogActionData(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code InputAnalogActionData} instance allocated with {@link BufferUtils}. */
    public static InputAnalogActionData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new InputAnalogActionData(memAddress(container), container);
    }

    /** Returns a new {@code InputAnalogActionData} instance for the specified memory address. */
    public static InputAnalogActionData create(long address) {
        return new InputAnalogActionData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable InputAnalogActionData createSafe(long address) {
        return address == NULL ? null : new InputAnalogActionData(address, null);
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link InputAnalogActionData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static InputAnalogActionData.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static InputAnalogActionData mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static InputAnalogActionData callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static InputAnalogActionData mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static InputAnalogActionData callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static InputAnalogActionData.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static InputAnalogActionData.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static InputAnalogActionData.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static InputAnalogActionData.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code InputAnalogActionData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static InputAnalogActionData malloc(MemoryStack stack) {
        return new InputAnalogActionData(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code InputAnalogActionData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static InputAnalogActionData calloc(MemoryStack stack) {
        return new InputAnalogActionData(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bActive}. */
    public static boolean nbActive(long struct) { return memGetByte(struct + InputAnalogActionData.BACTIVE) != 0; }
    /** Unsafe version of {@link #activeOrigin}. */
    public static long nactiveOrigin(long struct) { return memGetLong(struct + InputAnalogActionData.ACTIVEORIGIN); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + InputAnalogActionData.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + InputAnalogActionData.Y); }
    /** Unsafe version of {@link #z}. */
    public static float nz(long struct) { return memGetFloat(struct + InputAnalogActionData.Z); }
    /** Unsafe version of {@link #deltaX}. */
    public static float ndeltaX(long struct) { return memGetFloat(struct + InputAnalogActionData.DELTAX); }
    /** Unsafe version of {@link #deltaY}. */
    public static float ndeltaY(long struct) { return memGetFloat(struct + InputAnalogActionData.DELTAY); }
    /** Unsafe version of {@link #deltaZ}. */
    public static float ndeltaZ(long struct) { return memGetFloat(struct + InputAnalogActionData.DELTAZ); }
    /** Unsafe version of {@link #fUpdateTime}. */
    public static float nfUpdateTime(long struct) { return memGetFloat(struct + InputAnalogActionData.FUPDATETIME); }

    // -----------------------------------

    /** An array of {@link InputAnalogActionData} structs. */
    public static class Buffer extends StructBuffer<InputAnalogActionData, Buffer> implements NativeResource {

        private static final InputAnalogActionData ELEMENT_FACTORY = InputAnalogActionData.create(-1L);

        /**
         * Creates a new {@code InputAnalogActionData.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link InputAnalogActionData#SIZEOF}, and its mark will be undefined.</p>
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
        protected InputAnalogActionData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link InputAnalogActionData#bActive} field. */
        @NativeType("bool")
        public boolean bActive() { return InputAnalogActionData.nbActive(address()); }
        /** @return the value of the {@link InputAnalogActionData#activeOrigin} field. */
        @NativeType("VRInputValueHandle_t")
        public long activeOrigin() { return InputAnalogActionData.nactiveOrigin(address()); }
        /** @return the value of the {@link InputAnalogActionData#x} field. */
        public float x() { return InputAnalogActionData.nx(address()); }
        /** @return the value of the {@link InputAnalogActionData#y} field. */
        public float y() { return InputAnalogActionData.ny(address()); }
        /** @return the value of the {@link InputAnalogActionData#z} field. */
        public float z() { return InputAnalogActionData.nz(address()); }
        /** @return the value of the {@link InputAnalogActionData#deltaX} field. */
        public float deltaX() { return InputAnalogActionData.ndeltaX(address()); }
        /** @return the value of the {@link InputAnalogActionData#deltaY} field. */
        public float deltaY() { return InputAnalogActionData.ndeltaY(address()); }
        /** @return the value of the {@link InputAnalogActionData#deltaZ} field. */
        public float deltaZ() { return InputAnalogActionData.ndeltaZ(address()); }
        /** @return the value of the {@link InputAnalogActionData#fUpdateTime} field. */
        public float fUpdateTime() { return InputAnalogActionData.nfUpdateTime(address()); }

    }

}