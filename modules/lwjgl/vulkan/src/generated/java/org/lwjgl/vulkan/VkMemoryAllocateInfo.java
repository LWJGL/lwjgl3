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
 * struct VkMemoryAllocateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceSize allocationSize;
 *     uint32_t memoryTypeIndex;
 * }}</pre>
 */
public class VkMemoryAllocateInfo extends Struct<VkMemoryAllocateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ALLOCATIONSIZE,
        MEMORYTYPEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ALLOCATIONSIZE = layout.offsetof(2);
        MEMORYTYPEINDEX = layout.offsetof(3);
    }

    protected VkMemoryAllocateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryAllocateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryAllocateInfo(address, container);
    }

    /**
     * Creates a {@code VkMemoryAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryAllocateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code allocationSize} field. */
    @NativeType("VkDeviceSize")
    public long allocationSize() { return nallocationSize(address()); }
    /** @return the value of the {@code memoryTypeIndex} field. */
    @NativeType("uint32_t")
    public int memoryTypeIndex() { return nmemoryTypeIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryAllocateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO} value to the {@code sType} field. */
    public VkMemoryAllocateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryAllocateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDedicatedAllocationMemoryAllocateInfoNV} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkDedicatedAllocationMemoryAllocateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryAllocateInfo} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMemoryAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryAllocateInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMemoryAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryAllocateInfoNV} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMemoryAllocateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryWin32HandleInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMemoryWin32HandleInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryWin32HandleInfoNV} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMemoryWin32HandleInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportAndroidHardwareBufferInfoANDROID} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportAndroidHardwareBufferInfoANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryFdInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportMemoryFdInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryHostPointerInfoEXT} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportMemoryHostPointerInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryMetalHandleInfoEXT} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportMemoryMetalHandleInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryWin32HandleInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportMemoryWin32HandleInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryWin32HandleInfoNV} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportMemoryWin32HandleInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMetalBufferInfoEXT} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportMetalBufferInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryAllocateFlagsInfo} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryAllocateFlagsInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryAllocateFlagsInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryAllocateFlagsInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryDedicatedAllocateInfo} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryDedicatedAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryDedicatedAllocateInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryDedicatedAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryDedicatedAllocateInfoTensorARM} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryDedicatedAllocateInfoTensorARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfo} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryOpaqueCaptureAddressAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryOpaqueCaptureAddressAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryPriorityAllocateInfoEXT} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryPriorityAllocateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code allocationSize} field. */
    public VkMemoryAllocateInfo allocationSize(@NativeType("VkDeviceSize") long value) { nallocationSize(address(), value); return this; }
    /** Sets the specified value to the {@code memoryTypeIndex} field. */
    public VkMemoryAllocateInfo memoryTypeIndex(@NativeType("uint32_t") int value) { nmemoryTypeIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryAllocateInfo set(
        int sType,
        long pNext,
        long allocationSize,
        int memoryTypeIndex
    ) {
        sType(sType);
        pNext(pNext);
        allocationSize(allocationSize);
        memoryTypeIndex(memoryTypeIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryAllocateInfo set(VkMemoryAllocateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateInfo malloc() {
        return new VkMemoryAllocateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateInfo calloc() {
        return new VkMemoryAllocateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryAllocateInfo} instance allocated with {@link BufferUtils}. */
    public static VkMemoryAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryAllocateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryAllocateInfo} instance for the specified memory address. */
    public static VkMemoryAllocateInfo create(long address) {
        return new VkMemoryAllocateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryAllocateInfo createSafe(long address) {
        return address == NULL ? null : new VkMemoryAllocateInfo(address, null);
    }

    /**
     * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryAllocateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryAllocateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryAllocateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateInfo malloc(MemoryStack stack) {
        return new VkMemoryAllocateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryAllocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateInfo calloc(MemoryStack stack) {
        return new VkMemoryAllocateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryAllocateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryAllocateInfo.PNEXT); }
    /** Unsafe version of {@link #allocationSize}. */
    public static long nallocationSize(long struct) { return memGetLong(struct + VkMemoryAllocateInfo.ALLOCATIONSIZE); }
    /** Unsafe version of {@link #memoryTypeIndex}. */
    public static int nmemoryTypeIndex(long struct) { return memGetInt(struct + VkMemoryAllocateInfo.MEMORYTYPEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryAllocateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryAllocateInfo.PNEXT, value); }
    /** Unsafe version of {@link #allocationSize(long) allocationSize}. */
    public static void nallocationSize(long struct, long value) { memPutLong(struct + VkMemoryAllocateInfo.ALLOCATIONSIZE, value); }
    /** Unsafe version of {@link #memoryTypeIndex(int) memoryTypeIndex}. */
    public static void nmemoryTypeIndex(long struct, int value) { memPutInt(struct + VkMemoryAllocateInfo.MEMORYTYPEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryAllocateInfo} structs. */
    public static class Buffer extends StructBuffer<VkMemoryAllocateInfo, Buffer> implements NativeResource {

        private static final VkMemoryAllocateInfo ELEMENT_FACTORY = VkMemoryAllocateInfo.create(-1L);

        /**
         * Creates a new {@code VkMemoryAllocateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryAllocateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryAllocateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryAllocateInfo.npNext(address()); }
        /** @return the value of the {@code allocationSize} field. */
        @NativeType("VkDeviceSize")
        public long allocationSize() { return VkMemoryAllocateInfo.nallocationSize(address()); }
        /** @return the value of the {@code memoryTypeIndex} field. */
        @NativeType("uint32_t")
        public int memoryTypeIndex() { return VkMemoryAllocateInfo.nmemoryTypeIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryAllocateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryAllocateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO} value to the {@code sType} field. */
        public VkMemoryAllocateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryAllocateInfo.Buffer pNext(@NativeType("void const *") long value) { VkMemoryAllocateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDedicatedAllocationMemoryAllocateInfoNV} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkDedicatedAllocationMemoryAllocateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryAllocateInfo} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMemoryAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryAllocateInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMemoryAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryAllocateInfoNV} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMemoryAllocateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryWin32HandleInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMemoryWin32HandleInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryWin32HandleInfoNV} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMemoryWin32HandleInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportAndroidHardwareBufferInfoANDROID} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportAndroidHardwareBufferInfoANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryFdInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportMemoryFdInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryHostPointerInfoEXT} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportMemoryHostPointerInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryMetalHandleInfoEXT} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportMemoryMetalHandleInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryWin32HandleInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportMemoryWin32HandleInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryWin32HandleInfoNV} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportMemoryWin32HandleInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMetalBufferInfoEXT} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportMetalBufferInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryAllocateFlagsInfo} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryAllocateFlagsInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryAllocateFlagsInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryAllocateFlagsInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryDedicatedAllocateInfo} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryDedicatedAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryDedicatedAllocateInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryDedicatedAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryDedicatedAllocateInfoTensorARM} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryDedicatedAllocateInfoTensorARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfo} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryOpaqueCaptureAddressAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryOpaqueCaptureAddressAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryPriorityAllocateInfoEXT} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryPriorityAllocateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code allocationSize} field. */
        public VkMemoryAllocateInfo.Buffer allocationSize(@NativeType("VkDeviceSize") long value) { VkMemoryAllocateInfo.nallocationSize(address(), value); return this; }
        /** Sets the specified value to the {@code memoryTypeIndex} field. */
        public VkMemoryAllocateInfo.Buffer memoryTypeIndex(@NativeType("uint32_t") int value) { VkMemoryAllocateInfo.nmemoryTypeIndex(address(), value); return this; }

    }

}