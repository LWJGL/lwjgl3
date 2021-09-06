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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VRActiveActionSet_t {
 *     VRActionSetHandle_t {@link #ulActionSet};
 *     VRInputValueHandle_t {@link #ulRestrictedToDevice};
 *     VRActionSetHandle_t {@link #ulSecondaryActionSet};
 *     char[4];
 *     int32_t {@link #nPriority};
 * }</code></pre>
 */
@NativeType("struct VRActiveActionSet_t")
public class VRActiveActionSet extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ULACTIONSET,
        ULRESTRICTEDTODEVICE,
        ULSECONDARYACTIONSET,
        NPRIORITY;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __padding(4, true),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ULACTIONSET = layout.offsetof(0);
        ULRESTRICTEDTODEVICE = layout.offsetof(1);
        ULSECONDARYACTIONSET = layout.offsetof(2);
        NPRIORITY = layout.offsetof(4);
    }

    /**
     * Creates a {@code VRActiveActionSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRActiveActionSet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** this is the handle of the action set to activate for this frame */
    @NativeType("VRActionSetHandle_t")
    public long ulActionSet() { return nulActionSet(address()); }
    /** this is the handle of a device path that this action set should be active for. To activate for all devices, set this to {@link VR#k_ulInvalidInputValueHandle}. */
    @NativeType("VRInputValueHandle_t")
    public long ulRestrictedToDevice() { return nulRestrictedToDevice(address()); }
    /**
     * the action set to activate for all devices other than {@code ulRestrictedDevice}. If {@code ulRestrictedToDevice} is set to
     * {@link VR#k_ulInvalidInputValueHandle}, this parameter is ignored.
     */
    @NativeType("VRActionSetHandle_t")
    public long ulSecondaryActionSet() { return nulSecondaryActionSet(address()); }
    /**
     * the priority of this action set relative to other action sets. Any inputs bound to a source (e.g. trackpad, joystick, trigger) will disable bindings in
     * other active action sets with a smaller priority.
     * 
     * <p>Overlay applications (i.e. ApplicationType_Overlay) may set their action set priority to a value between {@link VR#k_nActionSetOverlayGlobalPriorityMin} and
     * {@link VR#k_nActionSetOverlayGlobalPriorityMax} to cause any inputs bound to a source used by that action set to be disabled in scene applications.</p>
     * 
     * <p>No action set priority may value may be larger than {@link VR#k_nActionSetPriorityReservedMin}.</p>
     */
    @NativeType("int32_t")
    public int nPriority() { return nnPriority(address()); }

    /** Sets the specified value to the {@link #ulActionSet} field. */
    public VRActiveActionSet ulActionSet(@NativeType("VRActionSetHandle_t") long value) { nulActionSet(address(), value); return this; }
    /** Sets the specified value to the {@link #ulRestrictedToDevice} field. */
    public VRActiveActionSet ulRestrictedToDevice(@NativeType("VRInputValueHandle_t") long value) { nulRestrictedToDevice(address(), value); return this; }
    /** Sets the specified value to the {@link #ulSecondaryActionSet} field. */
    public VRActiveActionSet ulSecondaryActionSet(@NativeType("VRActionSetHandle_t") long value) { nulSecondaryActionSet(address(), value); return this; }
    /** Sets the specified value to the {@link #nPriority} field. */
    public VRActiveActionSet nPriority(@NativeType("int32_t") int value) { nnPriority(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VRActiveActionSet set(
        long ulActionSet,
        long ulRestrictedToDevice,
        long ulSecondaryActionSet,
        int nPriority
    ) {
        ulActionSet(ulActionSet);
        ulRestrictedToDevice(ulRestrictedToDevice);
        ulSecondaryActionSet(ulSecondaryActionSet);
        nPriority(nPriority);

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

    /** Returns a new {@code VRActiveActionSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRActiveActionSet malloc() {
        return wrap(VRActiveActionSet.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VRActiveActionSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRActiveActionSet calloc() {
        return wrap(VRActiveActionSet.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VRActiveActionSet} instance allocated with {@link BufferUtils}. */
    public static VRActiveActionSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VRActiveActionSet.class, memAddress(container), container);
    }

    /** Returns a new {@code VRActiveActionSet} instance for the specified memory address. */
    public static VRActiveActionSet create(long address) {
        return wrap(VRActiveActionSet.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRActiveActionSet createSafe(long address) {
        return address == NULL ? null : wrap(VRActiveActionSet.class, address);
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VRActiveActionSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRActiveActionSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRActiveActionSet mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRActiveActionSet callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRActiveActionSet mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRActiveActionSet callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRActiveActionSet.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRActiveActionSet.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRActiveActionSet.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRActiveActionSet.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VRActiveActionSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRActiveActionSet malloc(MemoryStack stack) {
        return wrap(VRActiveActionSet.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VRActiveActionSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRActiveActionSet calloc(MemoryStack stack) {
        return wrap(VRActiveActionSet.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRActiveActionSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRActiveActionSet.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ulActionSet}. */
    public static long nulActionSet(long struct) { return UNSAFE.getLong(null, struct + VRActiveActionSet.ULACTIONSET); }
    /** Unsafe version of {@link #ulRestrictedToDevice}. */
    public static long nulRestrictedToDevice(long struct) { return UNSAFE.getLong(null, struct + VRActiveActionSet.ULRESTRICTEDTODEVICE); }
    /** Unsafe version of {@link #ulSecondaryActionSet}. */
    public static long nulSecondaryActionSet(long struct) { return UNSAFE.getLong(null, struct + VRActiveActionSet.ULSECONDARYACTIONSET); }
    /** Unsafe version of {@link #nPriority}. */
    public static int nnPriority(long struct) { return UNSAFE.getInt(null, struct + VRActiveActionSet.NPRIORITY); }

    /** Unsafe version of {@link #ulActionSet(long) ulActionSet}. */
    public static void nulActionSet(long struct, long value) { UNSAFE.putLong(null, struct + VRActiveActionSet.ULACTIONSET, value); }
    /** Unsafe version of {@link #ulRestrictedToDevice(long) ulRestrictedToDevice}. */
    public static void nulRestrictedToDevice(long struct, long value) { UNSAFE.putLong(null, struct + VRActiveActionSet.ULRESTRICTEDTODEVICE, value); }
    /** Unsafe version of {@link #ulSecondaryActionSet(long) ulSecondaryActionSet}. */
    public static void nulSecondaryActionSet(long struct, long value) { UNSAFE.putLong(null, struct + VRActiveActionSet.ULSECONDARYACTIONSET, value); }
    /** Unsafe version of {@link #nPriority(int) nPriority}. */
    public static void nnPriority(long struct, int value) { UNSAFE.putInt(null, struct + VRActiveActionSet.NPRIORITY, value); }

    // -----------------------------------

    /** An array of {@link VRActiveActionSet} structs. */
    public static class Buffer extends StructBuffer<VRActiveActionSet, Buffer> implements NativeResource {

        private static final VRActiveActionSet ELEMENT_FACTORY = VRActiveActionSet.create(-1L);

        /**
         * Creates a new {@code VRActiveActionSet.Buffer} instance backed by the specified container.
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
        protected VRActiveActionSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VRActiveActionSet#ulActionSet} field. */
        @NativeType("VRActionSetHandle_t")
        public long ulActionSet() { return VRActiveActionSet.nulActionSet(address()); }
        /** @return the value of the {@link VRActiveActionSet#ulRestrictedToDevice} field. */
        @NativeType("VRInputValueHandle_t")
        public long ulRestrictedToDevice() { return VRActiveActionSet.nulRestrictedToDevice(address()); }
        /** @return the value of the {@link VRActiveActionSet#ulSecondaryActionSet} field. */
        @NativeType("VRActionSetHandle_t")
        public long ulSecondaryActionSet() { return VRActiveActionSet.nulSecondaryActionSet(address()); }
        /** @return the value of the {@link VRActiveActionSet#nPriority} field. */
        @NativeType("int32_t")
        public int nPriority() { return VRActiveActionSet.nnPriority(address()); }

        /** Sets the specified value to the {@link VRActiveActionSet#ulActionSet} field. */
        public VRActiveActionSet.Buffer ulActionSet(@NativeType("VRActionSetHandle_t") long value) { VRActiveActionSet.nulActionSet(address(), value); return this; }
        /** Sets the specified value to the {@link VRActiveActionSet#ulRestrictedToDevice} field. */
        public VRActiveActionSet.Buffer ulRestrictedToDevice(@NativeType("VRInputValueHandle_t") long value) { VRActiveActionSet.nulRestrictedToDevice(address(), value); return this; }
        /** Sets the specified value to the {@link VRActiveActionSet#ulSecondaryActionSet} field. */
        public VRActiveActionSet.Buffer ulSecondaryActionSet(@NativeType("VRActionSetHandle_t") long value) { VRActiveActionSet.nulSecondaryActionSet(address(), value); return this; }
        /** Sets the specified value to the {@link VRActiveActionSet#nPriority} field. */
        public VRActiveActionSet.Buffer nPriority(@NativeType("int32_t") int value) { VRActiveActionSet.nnPriority(address(), value); return this; }

    }

}