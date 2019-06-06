/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

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
 * <li>{@code bActive} &ndash; whether or not this action is currently available to be bound in the active action set</li>
 * <li>{@code activeOrigin} &ndash; the origin that caused this action's current state</li>
 * <li>{@code pose} &ndash; the current state of this action</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct InputPoseActionData_t {
 *     bool bActive;
 *     VRInputValueHandle_t activeOrigin;
 *     {@link TrackedDevicePose TrackedDevicePose_t} pose;
 * }</code></pre>
 */
@NativeType("struct InputPoseActionData_t")
public class InputPoseActionData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BACTIVE,
        ACTIVEORIGIN,
        POSE;

    static {
        Layout layout = __struct(
            __member(1),
            __member(8),
            __member(TrackedDevicePose.SIZEOF, TrackedDevicePose.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BACTIVE = layout.offsetof(0);
        ACTIVEORIGIN = layout.offsetof(1);
        POSE = layout.offsetof(2);
    }

    /**
     * Creates a {@code InputPoseActionData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public InputPoseActionData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code bActive} field. */
    @NativeType("bool")
    public boolean bActive() { return nbActive(address()); }
    /** Returns the value of the {@code activeOrigin} field. */
    @NativeType("VRInputValueHandle_t")
    public long activeOrigin() { return nactiveOrigin(address()); }
    /** Returns a {@link TrackedDevicePose} view of the {@code pose} field. */
    @NativeType("TrackedDevicePose_t")
    public TrackedDevicePose pose() { return npose(address()); }

    // -----------------------------------

    /** Returns a new {@code InputPoseActionData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static InputPoseActionData malloc() {
        return wrap(InputPoseActionData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code InputPoseActionData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static InputPoseActionData calloc() {
        return wrap(InputPoseActionData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code InputPoseActionData} instance allocated with {@link BufferUtils}. */
    public static InputPoseActionData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(InputPoseActionData.class, memAddress(container), container);
    }

    /** Returns a new {@code InputPoseActionData} instance for the specified memory address. */
    public static InputPoseActionData create(long address) {
        return wrap(InputPoseActionData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static InputPoseActionData createSafe(long address) {
        return address == NULL ? null : wrap(InputPoseActionData.class, address);
    }

    /**
     * Returns a new {@link InputPoseActionData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputPoseActionData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link InputPoseActionData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputPoseActionData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputPoseActionData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static InputPoseActionData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link InputPoseActionData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static InputPoseActionData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static InputPoseActionData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code InputPoseActionData} instance allocated on the thread-local {@link MemoryStack}. */
    public static InputPoseActionData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code InputPoseActionData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static InputPoseActionData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code InputPoseActionData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static InputPoseActionData mallocStack(MemoryStack stack) {
        return wrap(InputPoseActionData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code InputPoseActionData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static InputPoseActionData callocStack(MemoryStack stack) {
        return wrap(InputPoseActionData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link InputPoseActionData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static InputPoseActionData.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link InputPoseActionData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static InputPoseActionData.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link InputPoseActionData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputPoseActionData.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputPoseActionData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputPoseActionData.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bActive}. */
    public static boolean nbActive(long struct) { return UNSAFE.getByte(null, struct + InputPoseActionData.BACTIVE) != 0; }
    /** Unsafe version of {@link #activeOrigin}. */
    public static long nactiveOrigin(long struct) { return UNSAFE.getLong(null, struct + InputPoseActionData.ACTIVEORIGIN); }
    /** Unsafe version of {@link #pose}. */
    public static TrackedDevicePose npose(long struct) { return TrackedDevicePose.create(struct + InputPoseActionData.POSE); }

    // -----------------------------------

    /** An array of {@link InputPoseActionData} structs. */
    public static class Buffer extends StructBuffer<InputPoseActionData, Buffer> implements NativeResource {

        private static final InputPoseActionData ELEMENT_FACTORY = InputPoseActionData.create(-1L);

        /**
         * Creates a new {@code InputPoseActionData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link InputPoseActionData#SIZEOF}, and its mark will be undefined.
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
        protected InputPoseActionData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code bActive} field. */
        @NativeType("bool")
        public boolean bActive() { return InputPoseActionData.nbActive(address()); }
        /** Returns the value of the {@code activeOrigin} field. */
        @NativeType("VRInputValueHandle_t")
        public long activeOrigin() { return InputPoseActionData.nactiveOrigin(address()); }
        /** Returns a {@link TrackedDevicePose} view of the {@code pose} field. */
        @NativeType("TrackedDevicePose_t")
        public TrackedDevicePose pose() { return InputPoseActionData.npose(address()); }

    }

}