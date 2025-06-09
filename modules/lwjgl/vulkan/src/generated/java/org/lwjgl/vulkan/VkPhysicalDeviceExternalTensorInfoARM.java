/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceExternalTensorInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTensorCreateFlagsARM flags;
 *     {@link VkTensorDescriptionARM VkTensorDescriptionARM} const * pDescription;
 *     VkExternalMemoryHandleTypeFlagBits handleType;
 * }}</pre>
 */
public class VkPhysicalDeviceExternalTensorInfoARM extends Struct<VkPhysicalDeviceExternalTensorInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PDESCRIPTION,
        HANDLETYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PDESCRIPTION = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceExternalTensorInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceExternalTensorInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceExternalTensorInfoARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExternalTensorInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExternalTensorInfoARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkTensorCreateFlagsARM")
    public long flags() { return nflags(address()); }
    /** @return a {@link VkTensorDescriptionARM} view of the struct pointed to by the {@code pDescription} field. */
    @NativeType("VkTensorDescriptionARM const *")
    public VkTensorDescriptionARM pDescription() { return npDescription(address()); }
    /** @return the value of the {@code handleType} field. */
    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceExternalTensorInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceExternalTensorInfoARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceExternalTensorInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPhysicalDeviceExternalTensorInfoARM flags(@NativeType("VkTensorCreateFlagsARM") long value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkTensorDescriptionARM} to the {@code pDescription} field. */
    public VkPhysicalDeviceExternalTensorInfoARM pDescription(@NativeType("VkTensorDescriptionARM const *") VkTensorDescriptionARM value) { npDescription(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkPhysicalDeviceExternalTensorInfoARM handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExternalTensorInfoARM set(
        int sType,
        long pNext,
        long flags,
        VkTensorDescriptionARM pDescription,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pDescription(pDescription);
        handleType(handleType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExternalTensorInfoARM set(VkPhysicalDeviceExternalTensorInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExternalTensorInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalTensorInfoARM malloc() {
        return new VkPhysicalDeviceExternalTensorInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalTensorInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalTensorInfoARM calloc() {
        return new VkPhysicalDeviceExternalTensorInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalTensorInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExternalTensorInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalTensorInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalTensorInfoARM} instance for the specified memory address. */
    public static VkPhysicalDeviceExternalTensorInfoARM create(long address) {
        return new VkPhysicalDeviceExternalTensorInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceExternalTensorInfoARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceExternalTensorInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalTensorInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalTensorInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalTensorInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalTensorInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalTensorInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalTensorInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceExternalTensorInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalTensorInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceExternalTensorInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalTensorInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalTensorInfoARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalTensorInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalTensorInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalTensorInfoARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalTensorInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalTensorInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalTensorInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalTensorInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalTensorInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceExternalTensorInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExternalTensorInfoARM.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + VkPhysicalDeviceExternalTensorInfoARM.FLAGS); }
    /** Unsafe version of {@link #pDescription}. */
    public static VkTensorDescriptionARM npDescription(long struct) { return VkTensorDescriptionARM.create(memGetAddress(struct + VkPhysicalDeviceExternalTensorInfoARM.PDESCRIPTION)); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkPhysicalDeviceExternalTensorInfoARM.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExternalTensorInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExternalTensorInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + VkPhysicalDeviceExternalTensorInfoARM.FLAGS, value); }
    /** Unsafe version of {@link #pDescription(VkTensorDescriptionARM) pDescription}. */
    public static void npDescription(long struct, VkTensorDescriptionARM value) { memPutAddress(struct + VkPhysicalDeviceExternalTensorInfoARM.PDESCRIPTION, value.address()); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExternalTensorInfoARM.HANDLETYPE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pDescription = memGetAddress(struct + VkPhysicalDeviceExternalTensorInfoARM.PDESCRIPTION);
        check(pDescription);
        VkTensorDescriptionARM.validate(pDescription);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExternalTensorInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalTensorInfoARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExternalTensorInfoARM ELEMENT_FACTORY = VkPhysicalDeviceExternalTensorInfoARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExternalTensorInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExternalTensorInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceExternalTensorInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExternalTensorInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceExternalTensorInfoARM.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkTensorCreateFlagsARM")
        public long flags() { return VkPhysicalDeviceExternalTensorInfoARM.nflags(address()); }
        /** @return a {@link VkTensorDescriptionARM} view of the struct pointed to by the {@code pDescription} field. */
        @NativeType("VkTensorDescriptionARM const *")
        public VkTensorDescriptionARM pDescription() { return VkPhysicalDeviceExternalTensorInfoARM.npDescription(address()); }
        /** @return the value of the {@code handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() { return VkPhysicalDeviceExternalTensorInfoARM.nhandleType(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceExternalTensorInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExternalTensorInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceExternalTensorInfoARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceExternalTensorInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceExternalTensorInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPhysicalDeviceExternalTensorInfoARM.Buffer flags(@NativeType("VkTensorCreateFlagsARM") long value) { VkPhysicalDeviceExternalTensorInfoARM.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkTensorDescriptionARM} to the {@code pDescription} field. */
        public VkPhysicalDeviceExternalTensorInfoARM.Buffer pDescription(@NativeType("VkTensorDescriptionARM const *") VkTensorDescriptionARM value) { VkPhysicalDeviceExternalTensorInfoARM.npDescription(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkPhysicalDeviceExternalTensorInfoARM.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkPhysicalDeviceExternalTensorInfoARM.nhandleType(address(), value); return this; }

    }

}