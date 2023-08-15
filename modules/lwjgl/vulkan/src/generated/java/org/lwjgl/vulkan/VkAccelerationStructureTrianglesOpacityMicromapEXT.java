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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying an opacity micromap in a bottom-level acceleration structure.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@link VkAccelerationStructureTrianglesOpacityMicromapEXT} is included in the {@code pNext} chain of a {@link VkAccelerationStructureGeometryTrianglesDataKHR} structure, that geometry will reference that micromap.</p>
 * 
 * <p>For each triangle in the geometry, the acceleration structure build fetches an index from {@code indexBuffer} using {@code indexType} and {@code indexStride}. If that value is the unsigned cast of one of the values from {@code VkOpacityMicromapSpecialIndexEXT} then that triangle behaves as described for that special value in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#ray-opacity-micromap">Ray Opacity Micromap</a>. Otherwise that triangle uses the opacity micromap information from {@code micromap} at that index plus {@code baseTriangle}.</p>
 * 
 * <p>Only one of {@code pUsageCounts} or {@code ppUsageCounts} <b>can</b> be a valid pointer, the other <b>must</b> be {@code NULL}. The elements of the non-{@code NULL} array describe the total count used to build this geometry. For a given {@code format} and {@code subdivisionLevel} the number of triangles in this geometry matching those values after indirection and special index handling <b>must</b> be equal to the sum of matching {@code count} provided.</p>
 * 
 * <p>If {@code micromap} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then every value read from {@code indexBuffer} <b>must</b> be one of the values in {@code VkOpacityMicromapSpecialIndexEXT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Only one of {@code pUsageCounts} or {@code ppUsageCounts} <b>can</b> be a valid pointer, the other <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT}</li>
 * <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
 * <li>If {@code usageCountsCount} is not 0, and {@code pUsageCounts} is not {@code NULL}, {@code pUsageCounts} <b>must</b> be a valid pointer to an array of {@code usageCountsCount} {@link VkMicromapUsageEXT} structures</li>
 * <li>If {@code usageCountsCount} is not 0, and {@code ppUsageCounts} is not {@code NULL}, {@code ppUsageCounts} <b>must</b> be a valid pointer to an array of {@code usageCountsCount} valid pointers to {@link VkMicromapUsageEXT} structures</li>
 * <li>If {@code micromap} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code micromap} <b>must</b> be a valid {@code VkMicromapEXT} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceOrHostAddressConstKHR}, {@link VkMicromapUsageEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureTrianglesOpacityMicromapEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkIndexType {@link #indexType};
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} {@link #indexBuffer};
 *     VkDeviceSize {@link #indexStride};
 *     uint32_t {@link #baseTriangle};
 *     uint32_t {@link #usageCountsCount};
 *     {@link VkMicromapUsageEXT VkMicromapUsageEXT} const * {@link #pUsageCounts};
 *     {@link VkMicromapUsageEXT VkMicromapUsageEXT} const * const * {@link #ppUsageCounts};
 *     VkMicromapEXT {@link #micromap};
 * }</code></pre>
 */
public class VkAccelerationStructureTrianglesOpacityMicromapEXT extends Struct<VkAccelerationStructureTrianglesOpacityMicromapEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INDEXTYPE,
        INDEXBUFFER,
        INDEXSTRIDE,
        BASETRIANGLE,
        USAGECOUNTSCOUNT,
        PUSAGECOUNTS,
        PPUSAGECOUNTS,
        MICROMAP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDEXTYPE = layout.offsetof(2);
        INDEXBUFFER = layout.offsetof(3);
        INDEXSTRIDE = layout.offsetof(4);
        BASETRIANGLE = layout.offsetof(5);
        USAGECOUNTSCOUNT = layout.offsetof(6);
        PUSAGECOUNTS = layout.offsetof(7);
        PPUSAGECOUNTS = layout.offsetof(8);
        MICROMAP = layout.offsetof(9);
    }

    protected VkAccelerationStructureTrianglesOpacityMicromapEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureTrianglesOpacityMicromapEXT create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureTrianglesOpacityMicromapEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the type of triangle indices used when indexing this micromap */
    @NativeType("VkIndexType")
    public int indexType() { return nindexType(address()); }
    /** the address containing the triangle indices */
    public VkDeviceOrHostAddressConstKHR indexBuffer() { return nindexBuffer(address()); }
    /** the byte stride between triangle indices */
    @NativeType("VkDeviceSize")
    public long indexStride() { return nindexStride(address()); }
    /** the base value added to the non-negative triangle indices */
    @NativeType("uint32_t")
    public int baseTriangle() { return nbaseTriangle(address()); }
    /** specifies the number of usage counts structures that will be used to determine the size of this micromap. */
    @NativeType("uint32_t")
    public int usageCountsCount() { return nusageCountsCount(address()); }
    /** a pointer to an array of {@link VkMicromapUsageEXT} structures. */
    @Nullable
    @NativeType("VkMicromapUsageEXT const *")
    public VkMicromapUsageEXT.Buffer pUsageCounts() { return npUsageCounts(address()); }
    /** a pointer to an array of pointers to {@link VkMicromapUsageEXT} structures. */
    @Nullable
    @NativeType("VkMicromapUsageEXT const * const *")
    public PointerBuffer ppUsageCounts() { return nppUsageCounts(address()); }
    /** the handle to the micromap object to include in this geometry */
    @NativeType("VkMicromapEXT")
    public long micromap() { return nmicromap(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT} value to the {@link #sType} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #indexType} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexType(@NativeType("VkIndexType") int value) { nindexType(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link #indexBuffer} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer(VkDeviceOrHostAddressConstKHR value) { nindexBuffer(address(), value); return this; }
    /** Passes the {@link #indexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(indexBuffer()); return this; }
    /** Sets the specified value to the {@link #indexStride} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexStride(@NativeType("VkDeviceSize") long value) { nindexStride(address(), value); return this; }
    /** Sets the specified value to the {@link #baseTriangle} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT baseTriangle(@NativeType("uint32_t") int value) { nbaseTriangle(address(), value); return this; }
    /** Sets the specified value to the {@link #usageCountsCount} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT usageCountsCount(@NativeType("uint32_t") int value) { nusageCountsCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkMicromapUsageEXT.Buffer} to the {@link #pUsageCounts} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) { npUsageCounts(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #ppUsageCounts} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT ppUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) { nppUsageCounts(address(), value); return this; }
    /** Sets the specified value to the {@link #micromap} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT micromap(@NativeType("VkMicromapEXT") long value) { nmicromap(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT set(
        int sType,
        long pNext,
        int indexType,
        VkDeviceOrHostAddressConstKHR indexBuffer,
        long indexStride,
        int baseTriangle,
        int usageCountsCount,
        @Nullable VkMicromapUsageEXT.Buffer pUsageCounts,
        @Nullable PointerBuffer ppUsageCounts,
        long micromap
    ) {
        sType(sType);
        pNext(pNext);
        indexType(indexType);
        indexBuffer(indexBuffer);
        indexStride(indexStride);
        baseTriangle(baseTriangle);
        usageCountsCount(usageCountsCount);
        pUsageCounts(pUsageCounts);
        ppUsageCounts(ppUsageCounts);
        micromap(micromap);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureTrianglesOpacityMicromapEXT set(VkAccelerationStructureTrianglesOpacityMicromapEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT malloc() {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT calloc() {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapEXT} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapEXT} instance for the specified memory address. */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT create(long address) {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureTrianglesOpacityMicromapEXT(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT malloc(MemoryStack stack) {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT calloc(MemoryStack stack) {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.PNEXT); }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXTYPE); }
    /** Unsafe version of {@link #indexBuffer}. */
    public static VkDeviceOrHostAddressConstKHR nindexBuffer(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXBUFFER); }
    /** Unsafe version of {@link #indexStride}. */
    public static long nindexStride(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXSTRIDE); }
    /** Unsafe version of {@link #baseTriangle}. */
    public static int nbaseTriangle(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.BASETRIANGLE); }
    /** Unsafe version of {@link #usageCountsCount}. */
    public static int nusageCountsCount(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.USAGECOUNTSCOUNT); }
    /** Unsafe version of {@link #pUsageCounts}. */
    @Nullable public static VkMicromapUsageEXT.Buffer npUsageCounts(long struct) { return VkMicromapUsageEXT.createSafe(memGetAddress(struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.PUSAGECOUNTS), nusageCountsCount(struct)); }
    /** Unsafe version of {@link #ppUsageCounts() ppUsageCounts}. */
    @Nullable public static PointerBuffer nppUsageCounts(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.PPUSAGECOUNTS), nusageCountsCount(struct)); }
    /** Unsafe version of {@link #micromap}. */
    public static long nmicromap(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.MICROMAP); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.PNEXT, value); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXTYPE, value); }
    /** Unsafe version of {@link #indexBuffer(VkDeviceOrHostAddressConstKHR) indexBuffer}. */
    public static void nindexBuffer(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXBUFFER, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #indexStride(long) indexStride}. */
    public static void nindexStride(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXSTRIDE, value); }
    /** Unsafe version of {@link #baseTriangle(int) baseTriangle}. */
    public static void nbaseTriangle(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.BASETRIANGLE, value); }
    /** Sets the specified value to the {@code usageCountsCount} field of the specified {@code struct}. */
    public static void nusageCountsCount(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.USAGECOUNTSCOUNT, value); }
    /** Unsafe version of {@link #pUsageCounts(VkMicromapUsageEXT.Buffer) pUsageCounts}. */
    public static void npUsageCounts(long struct, @Nullable VkMicromapUsageEXT.Buffer value) { memPutAddress(struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.PUSAGECOUNTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #ppUsageCounts(PointerBuffer) ppUsageCounts}. */
    public static void nppUsageCounts(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.PPUSAGECOUNTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #micromap(long) micromap}. */
    public static void nmicromap(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureTrianglesOpacityMicromapEXT.MICROMAP, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureTrianglesOpacityMicromapEXT} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureTrianglesOpacityMicromapEXT, Buffer> implements NativeResource {

        private static final VkAccelerationStructureTrianglesOpacityMicromapEXT ELEMENT_FACTORY = VkAccelerationStructureTrianglesOpacityMicromapEXT.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureTrianglesOpacityMicromapEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#indexType} field. */
        @NativeType("VkIndexType")
        public int indexType() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexType(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#indexBuffer} field. */
        public VkDeviceOrHostAddressConstKHR indexBuffer() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexBuffer(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#indexStride} field. */
        @NativeType("VkDeviceSize")
        public long indexStride() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexStride(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#baseTriangle} field. */
        @NativeType("uint32_t")
        public int baseTriangle() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.nbaseTriangle(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#usageCountsCount} field. */
        @NativeType("uint32_t")
        public int usageCountsCount() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.nusageCountsCount(address()); }
        /** @return a {@link VkMicromapUsageEXT.Buffer} view of the struct array pointed to by the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#pUsageCounts} field. */
        @Nullable
        @NativeType("VkMicromapUsageEXT const *")
        public VkMicromapUsageEXT.Buffer pUsageCounts() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.npUsageCounts(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#ppUsageCounts} field. */
        @Nullable
        @NativeType("VkMicromapUsageEXT const * const *")
        public PointerBuffer ppUsageCounts() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.nppUsageCounts(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#micromap} field. */
        @NativeType("VkMicromapEXT")
        public long micromap() { return VkAccelerationStructureTrianglesOpacityMicromapEXT.nmicromap(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#sType} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT} value to the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#sType} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT); }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#pNext} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer pNext(@NativeType("void *") long value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#indexType} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer indexType(@NativeType("VkIndexType") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexType(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#indexBuffer} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer indexBuffer(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexBuffer(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#indexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer indexBuffer(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(indexBuffer()); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#indexStride} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer indexStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexStride(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#baseTriangle} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer baseTriangle(@NativeType("uint32_t") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.nbaseTriangle(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#usageCountsCount} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer usageCountsCount(@NativeType("uint32_t") int value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.nusageCountsCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkMicromapUsageEXT.Buffer} to the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#pUsageCounts} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer pUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.npUsageCounts(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#ppUsageCounts} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer ppUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.nppUsageCounts(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#micromap} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer micromap(@NativeType("VkMicromapEXT") long value) { VkAccelerationStructureTrianglesOpacityMicromapEXT.nmicromap(address(), value); return this; }

    }

}