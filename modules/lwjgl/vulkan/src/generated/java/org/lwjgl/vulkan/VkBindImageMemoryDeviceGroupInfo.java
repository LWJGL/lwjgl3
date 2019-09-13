/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying device within a group to bind to.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link VkBindImageMemoryDeviceGroupInfo} structure is defined as:</p>
 * 
 * <ul>
 * <li>{@code sType} is the type of this structure.</li>
 * <li>{@code pNext} is {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code deviceIndexCount} is the number of elements in {@code pDeviceIndices}.</li>
 * <li>{@code pDeviceIndices} is a pointer to an array of device indices.</li>
 * <li>{@code splitInstanceBindRegionCount} is the number of elements in {@code pSplitInstanceBindRegions}.</li>
 * <li>{@code pSplitInstanceBindRegions} is a pointer to an array of {@link VkRect2D} structures describing which regions of the image are attached to each instance of memory.</li>
 * </ul>
 * 
 * <p>If {@code deviceIndexCount} is greater than zero, then on device index <code>i</code> {@code image} is attached to the instance of the memory on the physical device with device index <code>pDeviceIndices[i]</code>.</p>
 * 
 * <p>Let <code>N</code> be the number of physical devices in the logical device. If {@code splitInstanceBindRegionCount} is greater than zero, then {@code pSplitInstanceBindRegions} is an array of <code>N<sup>2</sup></code> rectangles, where the image region specified by the rectangle at element <code>i*N+j</code> in resource instance <code>i</code> is bound to the memory instance <code>j</code>. The blocks of the memory that are bound to each sparse image block region use an offset in memory, relative to {@code memoryOffset}, computed as if the whole image were being bound to a contiguous range of memory. In other words, horizontally adjacent image blocks use consecutive blocks of memory, vertically adjacent image blocks are separated by the number of bytes per block multiplied by the width in blocks of {@code image}, and the block at <code>(0,0)</code> corresponds to memory starting at {@code memoryOffset}.</p>
 * 
 * <p>If {@code splitInstanceBindRegionCount} and {@code deviceIndexCount} are zero and the memory comes from a memory heap with the {@link VK11#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT MEMORY_HEAP_MULTI_INSTANCE_BIT} bit set, then it is as if {@code pDeviceIndices} contains consecutive indices from zero to the number of physical devices in the logical device, minus one. In other words, by default each physical device attaches to its own instance of the memory.</p>
 * 
 * <p>If {@code splitInstanceBindRegionCount} and {@code deviceIndexCount} are zero and the memory comes from a memory heap without the {@link VK11#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT MEMORY_HEAP_MULTI_INSTANCE_BIT} bit set, then it is as if {@code pDeviceIndices} contains an array of zeros. In other words, by default each physical device attaches to instance zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>At least one of {@code deviceIndexCount} and {@code splitInstanceBindRegionCount} <b>must</b> be zero.</li>
 * <li>{@code deviceIndexCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device</li>
 * <li>All elements of {@code pDeviceIndices} <b>must</b> be valid device indices.</li>
 * <li>{@code splitInstanceBindRegionCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device squared</li>
 * <li>Elements of {@code pSplitInstanceBindRegions} that correspond to the same instance of an image <b>must</b> not overlap.</li>
 * <li>The {@code offset.x} member of any element of {@code pSplitInstanceBindRegions} <b>must</b> be a multiple of the sparse image block width ({@link VkSparseImageFormatProperties}{@code ::imageGranularity}.width) of all non-metadata aspects of the image</li>
 * <li>The {@code offset.y} member of any element of {@code pSplitInstanceBindRegions} <b>must</b> be a multiple of the sparse image block height ({@link VkSparseImageFormatProperties}{@code ::imageGranularity}.height) of all non-metadata aspects of the image</li>
 * <li>The {@code extent.width} member of any element of {@code pSplitInstanceBindRegions} <b>must</b> either be a multiple of the sparse image block width of all non-metadata aspects of the image, or else {@code extent.width} + {@code offset.x} <b>must</b> equal the width of the image subresource</li>
 * <li>The {@code extent.height} member of any element of {@code pSplitInstanceBindRegions} <b>must</b> either be a multiple of the sparse image block height of all non-metadata aspects of the image, or else {@code extent.height} + {@code offset.y} <b>must</b> equal the width of the image subresource</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO}</li>
 * <li>If {@code deviceIndexCount} is not 0, {@code pDeviceIndices} <b>must</b> be a valid pointer to an array of {@code deviceIndexCount} {@code uint32_t} values</li>
 * <li>If {@code splitInstanceBindRegionCount} is not 0, {@code pSplitInstanceBindRegions} <b>must</b> be a valid pointer to an array of {@code splitInstanceBindRegionCount} {@link VkRect2D} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}</p>
 * 
 * <h3>Layout</h3>
 * 
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
public class VkBindImageMemoryDeviceGroupInfo extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code deviceIndexCount} field. */
    @NativeType("uint32_t")
    public int deviceIndexCount() { return ndeviceIndexCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pDeviceIndices() { return npDeviceIndices(address()); }
    /** Returns the value of the {@code splitInstanceBindRegionCount} field. */
    @NativeType("uint32_t")
    public int splitInstanceBindRegionCount() { return nsplitInstanceBindRegionCount(address()); }
    /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pSplitInstanceBindRegions} field. */
    @Nullable
    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pSplitInstanceBindRegions() { return npSplitInstanceBindRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindImageMemoryDeviceGroupInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindImageMemoryDeviceGroupInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    public VkBindImageMemoryDeviceGroupInfo pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceIndices(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pSplitInstanceBindRegions} field. */
    public VkBindImageMemoryDeviceGroupInfo pSplitInstanceBindRegions(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { npSplitInstanceBindRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindImageMemoryDeviceGroupInfo set(
        int sType,
        long pNext,
        @Nullable IntBuffer pDeviceIndices,
        @Nullable VkRect2D.Buffer pSplitInstanceBindRegions
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
        return wrap(VkBindImageMemoryDeviceGroupInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryDeviceGroupInfo calloc() {
        return wrap(VkBindImageMemoryDeviceGroupInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance allocated with {@link BufferUtils}. */
    public static VkBindImageMemoryDeviceGroupInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindImageMemoryDeviceGroupInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance for the specified memory address. */
    public static VkBindImageMemoryDeviceGroupInfo create(long address) {
        return wrap(VkBindImageMemoryDeviceGroupInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryDeviceGroupInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkBindImageMemoryDeviceGroupInfo.class, address);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryDeviceGroupInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindImageMemoryDeviceGroupInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindImageMemoryDeviceGroupInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryDeviceGroupInfo mallocStack(MemoryStack stack) {
        return wrap(VkBindImageMemoryDeviceGroupInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindImageMemoryDeviceGroupInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryDeviceGroupInfo callocStack(MemoryStack stack) {
        return wrap(VkBindImageMemoryDeviceGroupInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBindImageMemoryDeviceGroupInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindImageMemoryDeviceGroupInfo.PNEXT); }
    /** Unsafe version of {@link #deviceIndexCount}. */
    public static int ndeviceIndexCount(long struct) { return UNSAFE.getInt(null, struct + VkBindImageMemoryDeviceGroupInfo.DEVICEINDEXCOUNT); }
    /** Unsafe version of {@link #pDeviceIndices() pDeviceIndices}. */
    @Nullable public static IntBuffer npDeviceIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkBindImageMemoryDeviceGroupInfo.PDEVICEINDICES), ndeviceIndexCount(struct)); }
    /** Unsafe version of {@link #splitInstanceBindRegionCount}. */
    public static int nsplitInstanceBindRegionCount(long struct) { return UNSAFE.getInt(null, struct + VkBindImageMemoryDeviceGroupInfo.SPLITINSTANCEBINDREGIONCOUNT); }
    /** Unsafe version of {@link #pSplitInstanceBindRegions}. */
    @Nullable public static VkRect2D.Buffer npSplitInstanceBindRegions(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkBindImageMemoryDeviceGroupInfo.PSPLITINSTANCEBINDREGIONS), nsplitInstanceBindRegionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindImageMemoryDeviceGroupInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindImageMemoryDeviceGroupInfo.PNEXT, value); }
    /** Sets the specified value to the {@code deviceIndexCount} field of the specified {@code struct}. */
    public static void ndeviceIndexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindImageMemoryDeviceGroupInfo.DEVICEINDEXCOUNT, value); }
    /** Unsafe version of {@link #pDeviceIndices(IntBuffer) pDeviceIndices}. */
    public static void npDeviceIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkBindImageMemoryDeviceGroupInfo.PDEVICEINDICES, memAddressSafe(value)); ndeviceIndexCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code splitInstanceBindRegionCount} field of the specified {@code struct}. */
    public static void nsplitInstanceBindRegionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindImageMemoryDeviceGroupInfo.SPLITINSTANCEBINDREGIONCOUNT, value); }
    /** Unsafe version of {@link #pSplitInstanceBindRegions(VkRect2D.Buffer) pSplitInstanceBindRegions}. */
    public static void npSplitInstanceBindRegions(long struct, @Nullable VkRect2D.Buffer value) { memPutAddress(struct + VkBindImageMemoryDeviceGroupInfo.PSPLITINSTANCEBINDREGIONS, memAddressSafe(value)); nsplitInstanceBindRegionCount(struct, value == null ? 0 : value.remaining()); }

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

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkBindImageMemoryDeviceGroupInfo} structs. */
    public static class Buffer extends StructBuffer<VkBindImageMemoryDeviceGroupInfo, Buffer> implements NativeResource {

        private static final VkBindImageMemoryDeviceGroupInfo ELEMENT_FACTORY = VkBindImageMemoryDeviceGroupInfo.create(-1L);

        /**
         * Creates a new {@code VkBindImageMemoryDeviceGroupInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindImageMemoryDeviceGroupInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkBindImageMemoryDeviceGroupInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindImageMemoryDeviceGroupInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindImageMemoryDeviceGroupInfo.npNext(address()); }
        /** Returns the value of the {@code deviceIndexCount} field. */
        @NativeType("uint32_t")
        public int deviceIndexCount() { return VkBindImageMemoryDeviceGroupInfo.ndeviceIndexCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pDeviceIndices() { return VkBindImageMemoryDeviceGroupInfo.npDeviceIndices(address()); }
        /** Returns the value of the {@code splitInstanceBindRegionCount} field. */
        @NativeType("uint32_t")
        public int splitInstanceBindRegionCount() { return VkBindImageMemoryDeviceGroupInfo.nsplitInstanceBindRegionCount(address()); }
        /** Returns a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pSplitInstanceBindRegions} field. */
        @Nullable
        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pSplitInstanceBindRegions() { return VkBindImageMemoryDeviceGroupInfo.npSplitInstanceBindRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindImageMemoryDeviceGroupInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBindImageMemoryDeviceGroupInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindImageMemoryDeviceGroupInfo.Buffer pNext(@NativeType("void const *") long value) { VkBindImageMemoryDeviceGroupInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        public VkBindImageMemoryDeviceGroupInfo.Buffer pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindImageMemoryDeviceGroupInfo.npDeviceIndices(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pSplitInstanceBindRegions} field. */
        public VkBindImageMemoryDeviceGroupInfo.Buffer pSplitInstanceBindRegions(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { VkBindImageMemoryDeviceGroupInfo.npSplitInstanceBindRegions(address(), value); return this; }

    }

}