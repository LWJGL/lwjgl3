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
 * struct VkBindImageMemoryDeviceGroupInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t deviceIndexCount;
 *     uint32_t const * pDeviceIndices;
 *     uint32_t splitInstanceBindRegionCount;
 *     {@link VkRect2D VkRect2D} const * pSplitInstanceBindRegions;
 * }</code></pre>
 */
public class VkBindImageMemoryDeviceGroupInfo extends Struct<VkBindImageMemoryDeviceGroupInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEINDEXCOUNT,
        PDEVICEINDICES,
        SPLITINSTANCEBINDREGIONCOUNT,
        PSPLITINSTANCEBINDREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEINDEXCOUNT = layout.offsetof(2);
        PDEVICEINDICES = layout.offsetof(3);
        SPLITINSTANCEBINDREGIONCOUNT = layout.offsetof(4);
        PSPLITINSTANCEBINDREGIONS = layout.offsetof(5);
    }

    protected VkBindImageMemoryDeviceGroupInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindImageMemoryDeviceGroupInfo create(long address, @Nullable ByteBuffer container) {
        return new VkBindImageMemoryDeviceGroupInfo(address, container);
    }

    /**
     * Creates a {@code VkBindImageMemoryDeviceGroupInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindImageMemoryDeviceGroupInfo(ByteBuffer container) {
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
    /** @return the value of the {@code deviceIndexCount} field. */
    @NativeType("uint32_t")
    public int deviceIndexCount() { return ndeviceIndexCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pDeviceIndices() { return npDeviceIndices(address()); }
    /** @return the value of the {@code splitInstanceBindRegionCount} field. */
    @NativeType("uint32_t")
    public int splitInstanceBindRegionCount() { return nsplitInstanceBindRegionCount(address()); }
    /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pSplitInstanceBindRegions} field. */
    @NativeType("VkRect2D const *")
    public VkRect2D.@Nullable Buffer pSplitInstanceBindRegions() { return npSplitInstanceBindRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindImageMemoryDeviceGroupInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO} value to the {@code sType} field. */
    public VkBindImageMemoryDeviceGroupInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindImageMemoryDeviceGroupInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    public VkBindImageMemoryDeviceGroupInfo pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceIndices(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pSplitInstanceBindRegions} field. */
    public VkBindImageMemoryDeviceGroupInfo pSplitInstanceBindRegions(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { npSplitInstanceBindRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindImageMemoryDeviceGroupInfo set(
        int sType,
        long pNext,
        @Nullable IntBuffer pDeviceIndices,
        VkRect2D.@Nullable Buffer pSplitInstanceBindRegions
    ) {
        sType(sType);
        pNext(pNext);
        pDeviceIndices(pDeviceIndices);
        pSplitInstanceBindRegions(pSplitInstanceBindRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindImageMemoryDeviceGroupInfo set(VkBindImageMemoryDeviceGroupInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryDeviceGroupInfo malloc() {
        return new VkBindImageMemoryDeviceGroupInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryDeviceGroupInfo calloc() {
        return new VkBindImageMemoryDeviceGroupInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance allocated with {@link BufferUtils}. */
    public static VkBindImageMemoryDeviceGroupInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindImageMemoryDeviceGroupInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance for the specified memory address. */
    public static VkBindImageMemoryDeviceGroupInfo create(long address) {
        return new VkBindImageMemoryDeviceGroupInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindImageMemoryDeviceGroupInfo createSafe(long address) {
        return address == NULL ? null : new VkBindImageMemoryDeviceGroupInfo(address, null);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindImageMemoryDeviceGroupInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryDeviceGroupInfo malloc(MemoryStack stack) {
        return new VkBindImageMemoryDeviceGroupInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryDeviceGroupInfo calloc(MemoryStack stack) {
        return new VkBindImageMemoryDeviceGroupInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindImageMemoryDeviceGroupInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindImageMemoryDeviceGroupInfo.PNEXT); }
    /** Unsafe version of {@link #deviceIndexCount}. */
    public static int ndeviceIndexCount(long struct) { return memGetInt(struct + VkBindImageMemoryDeviceGroupInfo.DEVICEINDEXCOUNT); }
    /** Unsafe version of {@link #pDeviceIndices() pDeviceIndices}. */
    public static @Nullable IntBuffer npDeviceIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkBindImageMemoryDeviceGroupInfo.PDEVICEINDICES), ndeviceIndexCount(struct)); }
    /** Unsafe version of {@link #splitInstanceBindRegionCount}. */
    public static int nsplitInstanceBindRegionCount(long struct) { return memGetInt(struct + VkBindImageMemoryDeviceGroupInfo.SPLITINSTANCEBINDREGIONCOUNT); }
    /** Unsafe version of {@link #pSplitInstanceBindRegions}. */
    public static VkRect2D.@Nullable Buffer npSplitInstanceBindRegions(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkBindImageMemoryDeviceGroupInfo.PSPLITINSTANCEBINDREGIONS), nsplitInstanceBindRegionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindImageMemoryDeviceGroupInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindImageMemoryDeviceGroupInfo.PNEXT, value); }
    /** Sets the specified value to the {@code deviceIndexCount} field of the specified {@code struct}. */
    public static void ndeviceIndexCount(long struct, int value) { memPutInt(struct + VkBindImageMemoryDeviceGroupInfo.DEVICEINDEXCOUNT, value); }
    /** Unsafe version of {@link #pDeviceIndices(IntBuffer) pDeviceIndices}. */
    public static void npDeviceIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkBindImageMemoryDeviceGroupInfo.PDEVICEINDICES, memAddressSafe(value)); ndeviceIndexCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code splitInstanceBindRegionCount} field of the specified {@code struct}. */
    public static void nsplitInstanceBindRegionCount(long struct, int value) { memPutInt(struct + VkBindImageMemoryDeviceGroupInfo.SPLITINSTANCEBINDREGIONCOUNT, value); }
    /** Unsafe version of {@link #pSplitInstanceBindRegions(VkRect2D.Buffer) pSplitInstanceBindRegions}. */
    public static void npSplitInstanceBindRegions(long struct, VkRect2D.@Nullable Buffer value) { memPutAddress(struct + VkBindImageMemoryDeviceGroupInfo.PSPLITINSTANCEBINDREGIONS, memAddressSafe(value)); nsplitInstanceBindRegionCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndeviceIndexCount(struct) != 0) {
            check(memGetAddress(struct + VkBindImageMemoryDeviceGroupInfo.PDEVICEINDICES));
        }
        if (nsplitInstanceBindRegionCount(struct) != 0) {
            check(memGetAddress(struct + VkBindImageMemoryDeviceGroupInfo.PSPLITINSTANCEBINDREGIONS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkBindImageMemoryDeviceGroupInfo} structs. */
    public static class Buffer extends StructBuffer<VkBindImageMemoryDeviceGroupInfo, Buffer> implements NativeResource {

        private static final VkBindImageMemoryDeviceGroupInfo ELEMENT_FACTORY = VkBindImageMemoryDeviceGroupInfo.create(-1L);

        /**
         * Creates a new {@code VkBindImageMemoryDeviceGroupInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindImageMemoryDeviceGroupInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindImageMemoryDeviceGroupInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindImageMemoryDeviceGroupInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindImageMemoryDeviceGroupInfo.npNext(address()); }
        /** @return the value of the {@code deviceIndexCount} field. */
        @NativeType("uint32_t")
        public int deviceIndexCount() { return VkBindImageMemoryDeviceGroupInfo.ndeviceIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pDeviceIndices() { return VkBindImageMemoryDeviceGroupInfo.npDeviceIndices(address()); }
        /** @return the value of the {@code splitInstanceBindRegionCount} field. */
        @NativeType("uint32_t")
        public int splitInstanceBindRegionCount() { return VkBindImageMemoryDeviceGroupInfo.nsplitInstanceBindRegionCount(address()); }
        /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pSplitInstanceBindRegions} field. */
        @NativeType("VkRect2D const *")
        public VkRect2D.@Nullable Buffer pSplitInstanceBindRegions() { return VkBindImageMemoryDeviceGroupInfo.npSplitInstanceBindRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindImageMemoryDeviceGroupInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBindImageMemoryDeviceGroupInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO} value to the {@code sType} field. */
        public VkBindImageMemoryDeviceGroupInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindImageMemoryDeviceGroupInfo.Buffer pNext(@NativeType("void const *") long value) { VkBindImageMemoryDeviceGroupInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        public VkBindImageMemoryDeviceGroupInfo.Buffer pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindImageMemoryDeviceGroupInfo.npDeviceIndices(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pSplitInstanceBindRegions} field. */
        public VkBindImageMemoryDeviceGroupInfo.Buffer pSplitInstanceBindRegions(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { VkBindImageMemoryDeviceGroupInfo.npSplitInstanceBindRegions(address(), value); return this; }

    }

}