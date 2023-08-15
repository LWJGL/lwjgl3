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
 * Structure specifying a displacement micromap in a bottom-level acceleration structure.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@link VkAccelerationStructureTrianglesDisplacementMicromapNV} is included in the {@code pNext} chain of a {@link VkAccelerationStructureGeometryTrianglesDataKHR} structure, that geometry will reference that micromap.</p>
 * 
 * <p>For each triangle in the geometry, the acceleration structure build fetches an index from {@code indexBuffer} using {@code indexType} and {@code indexStride}. That triangle uses the displacement micromap information from {@code micromap} at that index plus {@code baseTriangle}.</p>
 * 
 * <p>Only one of {@code pUsageCounts} or {@code ppUsageCounts} <b>can</b> be a valid pointer, the other <b>must</b> be {@code NULL}. The elements of the non-{@code NULL} array describe the total count used to build this geometry. For a given {@code format} and {@code subdivisionLevel} the number of triangles in this geometry matching those values after indirection <b>must</b> be equal to the sum of matching {@code count} provided.</p>
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
 * <li>{@code sType} <b>must</b> be {@link NVDisplacementMicromap#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV}</li>
 * <li>{@code displacementBiasAndScaleFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code displacementVectorFormat} <b>must</b> be a valid {@code VkFormat} value</li>
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
 * struct VkAccelerationStructureTrianglesDisplacementMicromapNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkFormat {@link #displacementBiasAndScaleFormat};
 *     VkFormat {@link #displacementVectorFormat};
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} {@link #displacementBiasAndScaleBuffer};
 *     VkDeviceSize {@link #displacementBiasAndScaleStride};
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} {@link #displacementVectorBuffer};
 *     VkDeviceSize {@link #displacementVectorStride};
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} {@link #displacedMicromapPrimitiveFlags};
 *     VkDeviceSize {@link #displacedMicromapPrimitiveFlagsStride};
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
public class VkAccelerationStructureTrianglesDisplacementMicromapNV extends Struct<VkAccelerationStructureTrianglesDisplacementMicromapNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DISPLACEMENTBIASANDSCALEFORMAT,
        DISPLACEMENTVECTORFORMAT,
        DISPLACEMENTBIASANDSCALEBUFFER,
        DISPLACEMENTBIASANDSCALESTRIDE,
        DISPLACEMENTVECTORBUFFER,
        DISPLACEMENTVECTORSTRIDE,
        DISPLACEDMICROMAPPRIMITIVEFLAGS,
        DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE,
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
            __member(4),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8),
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
        DISPLACEMENTBIASANDSCALEFORMAT = layout.offsetof(2);
        DISPLACEMENTVECTORFORMAT = layout.offsetof(3);
        DISPLACEMENTBIASANDSCALEBUFFER = layout.offsetof(4);
        DISPLACEMENTBIASANDSCALESTRIDE = layout.offsetof(5);
        DISPLACEMENTVECTORBUFFER = layout.offsetof(6);
        DISPLACEMENTVECTORSTRIDE = layout.offsetof(7);
        DISPLACEDMICROMAPPRIMITIVEFLAGS = layout.offsetof(8);
        DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE = layout.offsetof(9);
        INDEXTYPE = layout.offsetof(10);
        INDEXBUFFER = layout.offsetof(11);
        INDEXSTRIDE = layout.offsetof(12);
        BASETRIANGLE = layout.offsetof(13);
        USAGECOUNTSCOUNT = layout.offsetof(14);
        PUSAGECOUNTS = layout.offsetof(15);
        PPUSAGECOUNTS = layout.offsetof(16);
        MICROMAP = layout.offsetof(17);
    }

    protected VkAccelerationStructureTrianglesDisplacementMicromapNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureTrianglesDisplacementMicromapNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureTrianglesDisplacementMicromapNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV(ByteBuffer container) {
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
    /** the format of displacement bias and scale used in this displacement micromap reference. */
    @NativeType("VkFormat")
    public int displacementBiasAndScaleFormat() { return ndisplacementBiasAndScaleFormat(address()); }
    /** the format of displacement vector used in this displacement micromap reference. */
    @NativeType("VkFormat")
    public int displacementVectorFormat() { return ndisplacementVectorFormat(address()); }
    /** the address containing the bias and scale. */
    public VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer() { return ndisplacementBiasAndScaleBuffer(address()); }
    /** the byte stride between bias and scale values. */
    @NativeType("VkDeviceSize")
    public long displacementBiasAndScaleStride() { return ndisplacementBiasAndScaleStride(address()); }
    /** the address containing the displacement vector values. */
    public VkDeviceOrHostAddressConstKHR displacementVectorBuffer() { return ndisplacementVectorBuffer(address()); }
    /** the byte stride between displacement vector values. */
    @NativeType("VkDeviceSize")
    public long displacementVectorStride() { return ndisplacementVectorStride(address()); }
    /** the address containing the primitive flags. */
    public VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags() { return ndisplacedMicromapPrimitiveFlags(address()); }
    /** the byte stride between primitive flag values. */
    @NativeType("VkDeviceSize")
    public long displacedMicromapPrimitiveFlagsStride() { return ndisplacedMicromapPrimitiveFlagsStride(address()); }
    /** the type of triangle indices used when indexing this micromap. */
    @NativeType("VkIndexType")
    public int indexType() { return nindexType(address()); }
    /** the address containing the triangle indices. */
    public VkDeviceOrHostAddressConstKHR indexBuffer() { return nindexBuffer(address()); }
    /** the byte stride between triangle indices. */
    @NativeType("VkDeviceSize")
    public long indexStride() { return nindexStride(address()); }
    /** the base value added to the non-negative triangle indices. */
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
    /** the handle to the micromap object to include in this geometry. */
    @NativeType("VkMicromapEXT")
    public long micromap() { return nmicromap(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDisplacementMicromap#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV} value to the {@link #sType} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV sType$Default() { return sType(NVDisplacementMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #displacementBiasAndScaleFormat} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleFormat(@NativeType("VkFormat") int value) { ndisplacementBiasAndScaleFormat(address(), value); return this; }
    /** Sets the specified value to the {@link #displacementVectorFormat} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorFormat(@NativeType("VkFormat") int value) { ndisplacementVectorFormat(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link #displacementBiasAndScaleBuffer} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer(VkDeviceOrHostAddressConstKHR value) { ndisplacementBiasAndScaleBuffer(address(), value); return this; }
    /** Passes the {@link #displacementBiasAndScaleBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(displacementBiasAndScaleBuffer()); return this; }
    /** Sets the specified value to the {@link #displacementBiasAndScaleStride} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleStride(@NativeType("VkDeviceSize") long value) { ndisplacementBiasAndScaleStride(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link #displacementVectorBuffer} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer(VkDeviceOrHostAddressConstKHR value) { ndisplacementVectorBuffer(address(), value); return this; }
    /** Passes the {@link #displacementVectorBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(displacementVectorBuffer()); return this; }
    /** Sets the specified value to the {@link #displacementVectorStride} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorStride(@NativeType("VkDeviceSize") long value) { ndisplacementVectorStride(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link #displacedMicromapPrimitiveFlags} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags(VkDeviceOrHostAddressConstKHR value) { ndisplacedMicromapPrimitiveFlags(address(), value); return this; }
    /** Passes the {@link #displacedMicromapPrimitiveFlags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(displacedMicromapPrimitiveFlags()); return this; }
    /** Sets the specified value to the {@link #displacedMicromapPrimitiveFlagsStride} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlagsStride(@NativeType("VkDeviceSize") long value) { ndisplacedMicromapPrimitiveFlagsStride(address(), value); return this; }
    /** Sets the specified value to the {@link #indexType} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexType(@NativeType("VkIndexType") int value) { nindexType(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link #indexBuffer} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer(VkDeviceOrHostAddressConstKHR value) { nindexBuffer(address(), value); return this; }
    /** Passes the {@link #indexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(indexBuffer()); return this; }
    /** Sets the specified value to the {@link #indexStride} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexStride(@NativeType("VkDeviceSize") long value) { nindexStride(address(), value); return this; }
    /** Sets the specified value to the {@link #baseTriangle} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV baseTriangle(@NativeType("uint32_t") int value) { nbaseTriangle(address(), value); return this; }
    /** Sets the specified value to the {@link #usageCountsCount} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV usageCountsCount(@NativeType("uint32_t") int value) { nusageCountsCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkMicromapUsageEXT.Buffer} to the {@link #pUsageCounts} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV pUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) { npUsageCounts(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #ppUsageCounts} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV ppUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) { nppUsageCounts(address(), value); return this; }
    /** Sets the specified value to the {@link #micromap} field. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV micromap(@NativeType("VkMicromapEXT") long value) { nmicromap(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureTrianglesDisplacementMicromapNV set(
        int sType,
        long pNext,
        int displacementBiasAndScaleFormat,
        int displacementVectorFormat,
        VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer,
        long displacementBiasAndScaleStride,
        VkDeviceOrHostAddressConstKHR displacementVectorBuffer,
        long displacementVectorStride,
        VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags,
        long displacedMicromapPrimitiveFlagsStride,
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
        displacementBiasAndScaleFormat(displacementBiasAndScaleFormat);
        displacementVectorFormat(displacementVectorFormat);
        displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer);
        displacementBiasAndScaleStride(displacementBiasAndScaleStride);
        displacementVectorBuffer(displacementVectorBuffer);
        displacementVectorStride(displacementVectorStride);
        displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags);
        displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride);
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
    public VkAccelerationStructureTrianglesDisplacementMicromapNV set(VkAccelerationStructureTrianglesDisplacementMicromapNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureTrianglesDisplacementMicromapNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV malloc() {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureTrianglesDisplacementMicromapNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV calloc() {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureTrianglesDisplacementMicromapNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureTrianglesDisplacementMicromapNV} instance for the specified memory address. */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV create(long address) {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureTrianglesDisplacementMicromapNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureTrianglesDisplacementMicromapNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureTrianglesDisplacementMicromapNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.PNEXT); }
    /** Unsafe version of {@link #displacementBiasAndScaleFormat}. */
    public static int ndisplacementBiasAndScaleFormat(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALEFORMAT); }
    /** Unsafe version of {@link #displacementVectorFormat}. */
    public static int ndisplacementVectorFormat(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORFORMAT); }
    /** Unsafe version of {@link #displacementBiasAndScaleBuffer}. */
    public static VkDeviceOrHostAddressConstKHR ndisplacementBiasAndScaleBuffer(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALEBUFFER); }
    /** Unsafe version of {@link #displacementBiasAndScaleStride}. */
    public static long ndisplacementBiasAndScaleStride(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALESTRIDE); }
    /** Unsafe version of {@link #displacementVectorBuffer}. */
    public static VkDeviceOrHostAddressConstKHR ndisplacementVectorBuffer(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORBUFFER); }
    /** Unsafe version of {@link #displacementVectorStride}. */
    public static long ndisplacementVectorStride(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORSTRIDE); }
    /** Unsafe version of {@link #displacedMicromapPrimitiveFlags}. */
    public static VkDeviceOrHostAddressConstKHR ndisplacedMicromapPrimitiveFlags(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEDMICROMAPPRIMITIVEFLAGS); }
    /** Unsafe version of {@link #displacedMicromapPrimitiveFlagsStride}. */
    public static long ndisplacedMicromapPrimitiveFlagsStride(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE); }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXTYPE); }
    /** Unsafe version of {@link #indexBuffer}. */
    public static VkDeviceOrHostAddressConstKHR nindexBuffer(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXBUFFER); }
    /** Unsafe version of {@link #indexStride}. */
    public static long nindexStride(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXSTRIDE); }
    /** Unsafe version of {@link #baseTriangle}. */
    public static int nbaseTriangle(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.BASETRIANGLE); }
    /** Unsafe version of {@link #usageCountsCount}. */
    public static int nusageCountsCount(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.USAGECOUNTSCOUNT); }
    /** Unsafe version of {@link #pUsageCounts}. */
    @Nullable public static VkMicromapUsageEXT.Buffer npUsageCounts(long struct) { return VkMicromapUsageEXT.createSafe(memGetAddress(struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.PUSAGECOUNTS), nusageCountsCount(struct)); }
    /** Unsafe version of {@link #ppUsageCounts() ppUsageCounts}. */
    @Nullable public static PointerBuffer nppUsageCounts(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.PPUSAGECOUNTS), nusageCountsCount(struct)); }
    /** Unsafe version of {@link #micromap}. */
    public static long nmicromap(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.MICROMAP); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.PNEXT, value); }
    /** Unsafe version of {@link #displacementBiasAndScaleFormat(int) displacementBiasAndScaleFormat}. */
    public static void ndisplacementBiasAndScaleFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALEFORMAT, value); }
    /** Unsafe version of {@link #displacementVectorFormat(int) displacementVectorFormat}. */
    public static void ndisplacementVectorFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORFORMAT, value); }
    /** Unsafe version of {@link #displacementBiasAndScaleBuffer(VkDeviceOrHostAddressConstKHR) displacementBiasAndScaleBuffer}. */
    public static void ndisplacementBiasAndScaleBuffer(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALEBUFFER, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #displacementBiasAndScaleStride(long) displacementBiasAndScaleStride}. */
    public static void ndisplacementBiasAndScaleStride(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALESTRIDE, value); }
    /** Unsafe version of {@link #displacementVectorBuffer(VkDeviceOrHostAddressConstKHR) displacementVectorBuffer}. */
    public static void ndisplacementVectorBuffer(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORBUFFER, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #displacementVectorStride(long) displacementVectorStride}. */
    public static void ndisplacementVectorStride(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORSTRIDE, value); }
    /** Unsafe version of {@link #displacedMicromapPrimitiveFlags(VkDeviceOrHostAddressConstKHR) displacedMicromapPrimitiveFlags}. */
    public static void ndisplacedMicromapPrimitiveFlags(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEDMICROMAPPRIMITIVEFLAGS, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #displacedMicromapPrimitiveFlagsStride(long) displacedMicromapPrimitiveFlagsStride}. */
    public static void ndisplacedMicromapPrimitiveFlagsStride(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE, value); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXTYPE, value); }
    /** Unsafe version of {@link #indexBuffer(VkDeviceOrHostAddressConstKHR) indexBuffer}. */
    public static void nindexBuffer(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXBUFFER, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #indexStride(long) indexStride}. */
    public static void nindexStride(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXSTRIDE, value); }
    /** Unsafe version of {@link #baseTriangle(int) baseTriangle}. */
    public static void nbaseTriangle(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.BASETRIANGLE, value); }
    /** Sets the specified value to the {@code usageCountsCount} field of the specified {@code struct}. */
    public static void nusageCountsCount(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.USAGECOUNTSCOUNT, value); }
    /** Unsafe version of {@link #pUsageCounts(VkMicromapUsageEXT.Buffer) pUsageCounts}. */
    public static void npUsageCounts(long struct, @Nullable VkMicromapUsageEXT.Buffer value) { memPutAddress(struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.PUSAGECOUNTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #ppUsageCounts(PointerBuffer) ppUsageCounts}. */
    public static void nppUsageCounts(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.PPUSAGECOUNTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #micromap(long) micromap}. */
    public static void nmicromap(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureTrianglesDisplacementMicromapNV.MICROMAP, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureTrianglesDisplacementMicromapNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureTrianglesDisplacementMicromapNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureTrianglesDisplacementMicromapNV ELEMENT_FACTORY = VkAccelerationStructureTrianglesDisplacementMicromapNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureTrianglesDisplacementMicromapNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementBiasAndScaleFormat} field. */
        @NativeType("VkFormat")
        public int displacementBiasAndScaleFormat() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleFormat(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementVectorFormat} field. */
        @NativeType("VkFormat")
        public int displacementVectorFormat() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorFormat(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementBiasAndScaleBuffer} field. */
        public VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleBuffer(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementBiasAndScaleStride} field. */
        @NativeType("VkDeviceSize")
        public long displacementBiasAndScaleStride() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleStride(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementVectorBuffer} field. */
        public VkDeviceOrHostAddressConstKHR displacementVectorBuffer() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorBuffer(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementVectorStride} field. */
        @NativeType("VkDeviceSize")
        public long displacementVectorStride() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorStride(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacedMicromapPrimitiveFlags} field. */
        public VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlags(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacedMicromapPrimitiveFlagsStride} field. */
        @NativeType("VkDeviceSize")
        public long displacedMicromapPrimitiveFlagsStride() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlagsStride(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#indexType} field. */
        @NativeType("VkIndexType")
        public int indexType() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexType(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#indexBuffer} field. */
        public VkDeviceOrHostAddressConstKHR indexBuffer() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexBuffer(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#indexStride} field. */
        @NativeType("VkDeviceSize")
        public long indexStride() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexStride(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#baseTriangle} field. */
        @NativeType("uint32_t")
        public int baseTriangle() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.nbaseTriangle(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#usageCountsCount} field. */
        @NativeType("uint32_t")
        public int usageCountsCount() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.nusageCountsCount(address()); }
        /** @return a {@link VkMicromapUsageEXT.Buffer} view of the struct array pointed to by the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#pUsageCounts} field. */
        @Nullable
        @NativeType("VkMicromapUsageEXT const *")
        public VkMicromapUsageEXT.Buffer pUsageCounts() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.npUsageCounts(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#ppUsageCounts} field. */
        @Nullable
        @NativeType("VkMicromapUsageEXT const * const *")
        public PointerBuffer ppUsageCounts() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.nppUsageCounts(address()); }
        /** @return the value of the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#micromap} field. */
        @NativeType("VkMicromapEXT")
        public long micromap() { return VkAccelerationStructureTrianglesDisplacementMicromapNV.nmicromap(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#sType} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDisplacementMicromap#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV} value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#sType} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer sType$Default() { return sType(NVDisplacementMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV); }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#pNext} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer pNext(@NativeType("void *") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementBiasAndScaleFormat} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementBiasAndScaleFormat(@NativeType("VkFormat") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleFormat(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementVectorFormat} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementVectorFormat(@NativeType("VkFormat") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorFormat(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementBiasAndScaleBuffer} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementBiasAndScaleBuffer(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleBuffer(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementBiasAndScaleBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementBiasAndScaleBuffer(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(displacementBiasAndScaleBuffer()); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementBiasAndScaleStride} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementBiasAndScaleStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleStride(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementVectorBuffer} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementVectorBuffer(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorBuffer(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementVectorBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementVectorBuffer(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(displacementVectorBuffer()); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacementVectorStride} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementVectorStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorStride(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacedMicromapPrimitiveFlags} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacedMicromapPrimitiveFlags(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlags(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacedMicromapPrimitiveFlags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacedMicromapPrimitiveFlags(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(displacedMicromapPrimitiveFlags()); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#displacedMicromapPrimitiveFlagsStride} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacedMicromapPrimitiveFlagsStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlagsStride(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#indexType} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer indexType(@NativeType("VkIndexType") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexType(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#indexBuffer} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer indexBuffer(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexBuffer(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#indexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer indexBuffer(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(indexBuffer()); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#indexStride} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer indexStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexStride(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#baseTriangle} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer baseTriangle(@NativeType("uint32_t") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.nbaseTriangle(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#usageCountsCount} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer usageCountsCount(@NativeType("uint32_t") int value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.nusageCountsCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkMicromapUsageEXT.Buffer} to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#pUsageCounts} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer pUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.npUsageCounts(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#ppUsageCounts} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer ppUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.nppUsageCounts(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureTrianglesDisplacementMicromapNV#micromap} field. */
        public VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer micromap(@NativeType("VkMicromapEXT") long value) { VkAccelerationStructureTrianglesDisplacementMicromapNV.nmicromap(address(), value); return this; }

    }

}