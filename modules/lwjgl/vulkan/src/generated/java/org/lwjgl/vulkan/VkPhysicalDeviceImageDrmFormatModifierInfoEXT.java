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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceImageDrmFormatModifierInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t drmFormatModifier;
 *     VkSharingMode sharingMode;
 *     uint32_t queueFamilyIndexCount;
 *     uint32_t const * pQueueFamilyIndices;
 * }}</pre>
 */
public class VkPhysicalDeviceImageDrmFormatModifierInfoEXT extends Struct<VkPhysicalDeviceImageDrmFormatModifierInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DRMFORMATMODIFIER,
        SHARINGMODE,
        QUEUEFAMILYINDEXCOUNT,
        PQUEUEFAMILYINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRMFORMATMODIFIER = layout.offsetof(2);
        SHARINGMODE = layout.offsetof(3);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(4);
        PQUEUEFAMILYINDICES = layout.offsetof(5);
    }

    protected VkPhysicalDeviceImageDrmFormatModifierInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageDrmFormatModifierInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code drmFormatModifier} field. */
    @NativeType("uint64_t")
    public long drmFormatModifier() { return ndrmFormatModifier(address()); }
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
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code drmFormatModifier} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT drmFormatModifier(@NativeType("uint64_t") long value) { ndrmFormatModifier(address(), value); return this; }
    /** Sets the specified value to the {@code sharingMode} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sharingMode(@NativeType("VkSharingMode") int value) { nsharingMode(address(), value); return this; }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT queueFamilyIndexCount(@NativeType("uint32_t") int value) { nqueueFamilyIndexCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT set(
        int sType,
        long pNext,
        long drmFormatModifier,
        int sharingMode,
        int queueFamilyIndexCount,
        @Nullable IntBuffer pQueueFamilyIndices
    ) {
        sType(sType);
        pNext(pNext);
        drmFormatModifier(drmFormatModifier);
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
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT set(VkPhysicalDeviceImageDrmFormatModifierInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT malloc() {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT calloc() {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT create(long address) {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceImageDrmFormatModifierInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.PNEXT); }
    /** Unsafe version of {@link #drmFormatModifier}. */
    public static long ndrmFormatModifier(long struct) { return memGetLong(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.DRMFORMATMODIFIER); }
    /** Unsafe version of {@link #sharingMode}. */
    public static int nsharingMode(long struct) { return memGetInt(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.SHARINGMODE); }
    /** Unsafe version of {@link #queueFamilyIndexCount}. */
    public static int nqueueFamilyIndexCount(long struct) { return memGetInt(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.QUEUEFAMILYINDEXCOUNT); }
    /** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
    public static @Nullable IntBuffer npQueueFamilyIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #drmFormatModifier(long) drmFormatModifier}. */
    public static void ndrmFormatModifier(long struct, long value) { memPutLong(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.DRMFORMATMODIFIER, value); }
    /** Unsafe version of {@link #sharingMode(int) sharingMode}. */
    public static void nsharingMode(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.SHARINGMODE, value); }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
    public static void nqueueFamilyIndexCount(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.QUEUEFAMILYINDEXCOUNT, value); }
    /** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
    public static void npQueueFamilyIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.PQUEUEFAMILYINDICES, memAddressSafe(value)); if (value != null) { nqueueFamilyIndexCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageDrmFormatModifierInfoEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageDrmFormatModifierInfoEXT ELEMENT_FACTORY = VkPhysicalDeviceImageDrmFormatModifierInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageDrmFormatModifierInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npNext(address()); }
        /** @return the value of the {@code drmFormatModifier} field. */
        @NativeType("uint64_t")
        public long drmFormatModifier() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.ndrmFormatModifier(address()); }
        /** @return the value of the {@code sharingMode} field. */
        @NativeType("VkSharingMode")
        public int sharingMode() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsharingMode(address()); }
        /** @return the value of the {@code queueFamilyIndexCount} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndexCount() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nqueueFamilyIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pQueueFamilyIndices() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npQueueFamilyIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code drmFormatModifier} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer drmFormatModifier(@NativeType("uint64_t") long value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.ndrmFormatModifier(address(), value); return this; }
        /** Sets the specified value to the {@code sharingMode} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer sharingMode(@NativeType("VkSharingMode") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsharingMode(address(), value); return this; }
        /** Sets the specified value to the {@code queueFamilyIndexCount} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nqueueFamilyIndexCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npQueueFamilyIndices(address(), value); return this; }

    }

}