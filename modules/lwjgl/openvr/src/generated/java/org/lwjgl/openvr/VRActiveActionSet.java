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
 * <li>{@code ulActionSet} &ndash; this is the handle of the action set to activate for this frame</li>
 * <li>{@code ulRestrictedToDevice} &ndash; this is the handle of a device path that this action set should be active for. To activate for all devices, set this to {@link VR#k_ulInvalidInputValueHandle}.</li>
 * <li>{@code ulSecondaryActionSet} &ndash; 
 * the action set to activate for all devices other than {@code ulRestrictedDevice}. If {@code ulRestrictedToDevice} is set to
 * {@link VR#k_ulInvalidInputValueHandle}, this parameter is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VRActiveActionSet_t {
 *     VRActionSetHandle_t ulActionSet;
 *     VRInputValueHandle_t ulRestrictedToDevice;
 *     VRActionSetHandle_t ulSecondaryActionSet;
 * }</pre></code>
 */
@NativeType("struct VRActiveActionSet_t")
public class VRActiveActionSet extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ULACTIONSET,
        ULRESTRICTEDTODEVICE,
        ULSECONDARYACTIONSET;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ULACTIONSET = layout.offsetof(0);
        ULRESTRICTEDTODEVICE = layout.offsetof(1);
        ULSECONDARYACTIONSET = layout.offsetof(2);
    }

    VRActiveActionSet(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VRActiveActionSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRActiveActionSet(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code ulActionSet} field. */
    @NativeType("VRActionSetHandle_t")
    public long ulActionSet() { return nulActionSet(address()); }
    /** Returns the value of the {@code ulRestrictedToDevice} field. */
    @NativeType("VRInputValueHandle_t")
    public long ulRestrictedToDevice() { return nulRestrictedToDevice(address()); }
    /** Returns the value of the {@code ulSecondaryActionSet} field. */
    @NativeType("VRActionSetHandle_t")
    public long ulSecondaryActionSet() { return nulSecondaryActionSet(address()); }

    /** Sets the specified value to the {@code ulActionSet} field. */
    public VRActiveActionSet ulActionSet(@NativeType("VRActionSetHandle_t") long value) { nulActionSet(address(), value); return this; }
    /** Sets the specified value to the {@code ulRestrictedToDevice} field. */
    public VRActiveActionSet ulRestrictedToDevice(@NativeType("VRInputValueHandle_t") long value) { nulRestrictedToDevice(address(), value); return this; }
    /** Sets the specified value to the {@code ulSecondaryActionSet} field. */
    public VRActiveActionSet ulSecondaryActionSet(@NativeType("VRActionSetHandle_t") long value) { nulSecondaryActionSet(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VRActiveActionSet set(
        long ulActionSet,
        long ulRestrictedToDevice,
        long ulSecondaryActionSet
    ) {
        ulActionSet(ulActionSet);
        ulRestrictedToDevice(ulRestrictedToDevice);
        ulSecondaryActionSet(ulSecondaryActionSet);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRActiveActionSet set(VRActiveActionSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VRActiveActionSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRActiveActionSet malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VRActiveActionSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRActiveActionSet calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VRActiveActionSet} instance allocated with {@link BufferUtils}. */
    public static VRActiveActionSet create() {
        return new VRActiveActionSet(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VRActiveActionSet} instance for the specified memory address. */
    public static VRActiveActionSet create(long address) {
        return new VRActiveActionSet(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRActiveActionSet createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VRActiveActionSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRActiveActionSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VRActiveActionSet} instance allocated on the thread-local {@link MemoryStack}. */
    public static VRActiveActionSet mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VRActiveActionSet} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VRActiveActionSet callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VRActiveActionSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRActiveActionSet mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VRActiveActionSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRActiveActionSet callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ulActionSet}. */
    public static long nulActionSet(long struct) { return memGetLong(struct + VRActiveActionSet.ULACTIONSET); }
    /** Unsafe version of {@link #ulRestrictedToDevice}. */
    public static long nulRestrictedToDevice(long struct) { return memGetLong(struct + VRActiveActionSet.ULRESTRICTEDTODEVICE); }
    /** Unsafe version of {@link #ulSecondaryActionSet}. */
    public static long nulSecondaryActionSet(long struct) { return memGetLong(struct + VRActiveActionSet.ULSECONDARYACTIONSET); }

    /** Unsafe version of {@link #ulActionSet(long) ulActionSet}. */
    public static void nulActionSet(long struct, long value) { memPutLong(struct + VRActiveActionSet.ULACTIONSET, value); }
    /** Unsafe version of {@link #ulRestrictedToDevice(long) ulRestrictedToDevice}. */
    public static void nulRestrictedToDevice(long struct, long value) { memPutLong(struct + VRActiveActionSet.ULRESTRICTEDTODEVICE, value); }
    /** Unsafe version of {@link #ulSecondaryActionSet(long) ulSecondaryActionSet}. */
    public static void nulSecondaryActionSet(long struct, long value) { memPutLong(struct + VRActiveActionSet.ULSECONDARYACTIONSET, value); }

    // -----------------------------------

    /** An array of {@link VRActiveActionSet} structs. */
    public static class Buffer extends StructBuffer<VRActiveActionSet, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VRActiveActionSet.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRActiveActionSet#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VRActiveActionSet newInstance(long address) {
            return new VRActiveActionSet(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code ulActionSet} field. */
        @NativeType("VRActionSetHandle_t")
        public long ulActionSet() { return VRActiveActionSet.nulActionSet(address()); }
        /** Returns the value of the {@code ulRestrictedToDevice} field. */
        @NativeType("VRInputValueHandle_t")
        public long ulRestrictedToDevice() { return VRActiveActionSet.nulRestrictedToDevice(address()); }
        /** Returns the value of the {@code ulSecondaryActionSet} field. */
        @NativeType("VRActionSetHandle_t")
        public long ulSecondaryActionSet() { return VRActiveActionSet.nulSecondaryActionSet(address()); }

        /** Sets the specified value to the {@code ulActionSet} field. */
        public VRActiveActionSet.Buffer ulActionSet(@NativeType("VRActionSetHandle_t") long value) { VRActiveActionSet.nulActionSet(address(), value); return this; }
        /** Sets the specified value to the {@code ulRestrictedToDevice} field. */
        public VRActiveActionSet.Buffer ulRestrictedToDevice(@NativeType("VRInputValueHandle_t") long value) { VRActiveActionSet.nulRestrictedToDevice(address(), value); return this; }
        /** Sets the specified value to the {@code ulSecondaryActionSet} field. */
        public VRActiveActionSet.Buffer ulSecondaryActionSet(@NativeType("VRActionSetHandle_t") long value) { VRActiveActionSet.nulSecondaryActionSet(address(), value); return this; }

    }

}