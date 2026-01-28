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
 * <pre><code>
 * struct VkTensorCreateInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTensorCreateFlagsARM flags;
 *     {@link VkTensorDescriptionARM VkTensorDescriptionARM} const * pDescription;
 *     VkSharingMode sharingMode;
 *     uint32_t queueFamilyIndexCount;
 *     uint32_t const * pQueueFamilyIndices;
 * }</code></pre>
 */
public class VkTensorCreateInfoARM extends Struct<VkTensorCreateInfoARM> implements NativeResource {

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
        SHARINGMODE,
        QUEUEFAMILYINDEXCOUNT,
        PQUEUEFAMILYINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PDESCRIPTION = layout.offsetof(3);
        SHARINGMODE = layout.offsetof(4);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(5);
        PQUEUEFAMILYINDICES = layout.offsetof(6);
    }

    protected VkTensorCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTensorCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkTensorCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkTensorCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTensorCreateInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code sharingMode} field. */
    @NativeType("VkSharingMode")
    public int sharingMode() { return nsharingMode(address()); }
    /** @return the value of the {@code queueFamilyIndexCount} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTensorCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkTensorCreateInfoARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTensorCreateInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkExternalMemoryTensorCreateInfoARM} value to the {@code pNext} chain. */
    public VkTensorCreateInfoARM pNext(VkExternalMemoryTensorCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkOpaqueCaptureDataCreateInfoEXT} value to the {@code pNext} chain. */
    public VkTensorCreateInfoARM pNext(VkOpaqueCaptureDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
    public VkTensorCreateInfoARM pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkTensorCreateInfoARM flags(@NativeType("VkTensorCreateFlagsARM") long value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkTensorDescriptionARM} to the {@code pDescription} field. */
    public VkTensorCreateInfoARM pDescription(@NativeType("VkTensorDescriptionARM const *") VkTensorDescriptionARM value) { npDescription(address(), value); return this; }
    /** Sets the specified value to the {@code sharingMode} field. */
    public VkTensorCreateInfoARM sharingMode(@NativeType("VkSharingMode") int value) { nsharingMode(address(), value); return this; }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field. */
    public VkTensorCreateInfoARM queueFamilyIndexCount(@NativeType("uint32_t") int value) { nqueueFamilyIndexCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
    public VkTensorCreateInfoARM pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTensorCreateInfoARM set(
        int sType,
        long pNext,
        long flags,
        VkTensorDescriptionARM pDescription,
        int sharingMode,
        int queueFamilyIndexCount,
        @Nullable IntBuffer pQueueFamilyIndices
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pDescription(pDescription);
        sharingMode(sharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTensorCreateInfoARM set(VkTensorCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTensorCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTensorCreateInfoARM malloc() {
        return new VkTensorCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTensorCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTensorCreateInfoARM calloc() {
        return new VkTensorCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTensorCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkTensorCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkTensorCreateInfoARM} instance for the specified memory address. */
    public static VkTensorCreateInfoARM create(long address) {
        return new VkTensorCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTensorCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkTensorCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkTensorCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTensorCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTensorCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTensorCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTensorCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTensorCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorCreateInfoARM malloc(MemoryStack stack) {
        return new VkTensorCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTensorCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorCreateInfoARM calloc(MemoryStack stack) {
        return new VkTensorCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTensorCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTensorCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTensorCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + VkTensorCreateInfoARM.FLAGS); }
    /** Unsafe version of {@link #pDescription}. */
    public static VkTensorDescriptionARM npDescription(long struct) { return VkTensorDescriptionARM.create(memGetAddress(struct + VkTensorCreateInfoARM.PDESCRIPTION)); }
    /** Unsafe version of {@link #sharingMode}. */
    public static int nsharingMode(long struct) { return memGetInt(struct + VkTensorCreateInfoARM.SHARINGMODE); }
    /** Unsafe version of {@link #queueFamilyIndexCount}. */
    public static int nqueueFamilyIndexCount(long struct) { return memGetInt(struct + VkTensorCreateInfoARM.QUEUEFAMILYINDEXCOUNT); }
    /** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
    public static @Nullable IntBuffer npQueueFamilyIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkTensorCreateInfoARM.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTensorCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTensorCreateInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + VkTensorCreateInfoARM.FLAGS, value); }
    /** Unsafe version of {@link #pDescription(VkTensorDescriptionARM) pDescription}. */
    public static void npDescription(long struct, VkTensorDescriptionARM value) { memPutAddress(struct + VkTensorCreateInfoARM.PDESCRIPTION, value.address()); }
    /** Unsafe version of {@link #sharingMode(int) sharingMode}. */
    public static void nsharingMode(long struct, int value) { memPutInt(struct + VkTensorCreateInfoARM.SHARINGMODE, value); }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
    public static void nqueueFamilyIndexCount(long struct, int value) { memPutInt(struct + VkTensorCreateInfoARM.QUEUEFAMILYINDEXCOUNT, value); }
    /** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
    public static void npQueueFamilyIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkTensorCreateInfoARM.PQUEUEFAMILYINDICES, memAddressSafe(value)); if (value != null) { nqueueFamilyIndexCount(struct, value.remaining()); } }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pDescription = memGetAddress(struct + VkTensorCreateInfoARM.PDESCRIPTION);
        check(pDescription);
        VkTensorDescriptionARM.validate(pDescription);
    }

    // -----------------------------------

    /** An array of {@link VkTensorCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkTensorCreateInfoARM, Buffer> implements NativeResource {

        private static final VkTensorCreateInfoARM ELEMENT_FACTORY = VkTensorCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkTensorCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTensorCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTensorCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTensorCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTensorCreateInfoARM.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkTensorCreateFlagsARM")
        public long flags() { return VkTensorCreateInfoARM.nflags(address()); }
        /** @return a {@link VkTensorDescriptionARM} view of the struct pointed to by the {@code pDescription} field. */
        @NativeType("VkTensorDescriptionARM const *")
        public VkTensorDescriptionARM pDescription() { return VkTensorCreateInfoARM.npDescription(address()); }
        /** @return the value of the {@code sharingMode} field. */
        @NativeType("VkSharingMode")
        public int sharingMode() { return VkTensorCreateInfoARM.nsharingMode(address()); }
        /** @return the value of the {@code queueFamilyIndexCount} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndexCount() { return VkTensorCreateInfoARM.nqueueFamilyIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pQueueFamilyIndices() { return VkTensorCreateInfoARM.npQueueFamilyIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTensorCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkTensorCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkTensorCreateInfoARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTensorCreateInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkTensorCreateInfoARM.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkExternalMemoryTensorCreateInfoARM} value to the {@code pNext} chain. */
        public VkTensorCreateInfoARM.Buffer pNext(VkExternalMemoryTensorCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkOpaqueCaptureDataCreateInfoEXT} value to the {@code pNext} chain. */
        public VkTensorCreateInfoARM.Buffer pNext(VkOpaqueCaptureDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
        public VkTensorCreateInfoARM.Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkTensorCreateInfoARM.Buffer flags(@NativeType("VkTensorCreateFlagsARM") long value) { VkTensorCreateInfoARM.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkTensorDescriptionARM} to the {@code pDescription} field. */
        public VkTensorCreateInfoARM.Buffer pDescription(@NativeType("VkTensorDescriptionARM const *") VkTensorDescriptionARM value) { VkTensorCreateInfoARM.npDescription(address(), value); return this; }
        /** Sets the specified value to the {@code sharingMode} field. */
        public VkTensorCreateInfoARM.Buffer sharingMode(@NativeType("VkSharingMode") int value) { VkTensorCreateInfoARM.nsharingMode(address(), value); return this; }
        /** Sets the specified value to the {@code queueFamilyIndexCount} field. */
        public VkTensorCreateInfoARM.Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) { VkTensorCreateInfoARM.nqueueFamilyIndexCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
        public VkTensorCreateInfoARM.Buffer pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkTensorCreateInfoARM.npQueueFamilyIndices(address(), value); return this; }

    }

}