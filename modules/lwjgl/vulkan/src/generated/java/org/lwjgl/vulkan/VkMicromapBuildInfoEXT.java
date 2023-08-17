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
 * Structure specifying the  data used to build a micromap.
 * 
 * <h5>Description</h5>
 * 
 * <p>Only one of {@code pUsageCounts} or {@code ppUsageCounts} <b>can</b> be a valid pointer, the other <b>must</b> be {@code NULL}. The elements of the non-{@code NULL} array describe the total counts used to build each micromap. Each element contains a {@code count} which is the number of micromap triangles of that {@code format} and {@code subdivisionLevel} contained in the micromap. Multiple elements with the same {@code format} and {@code subdivisionLevel} are allowed and the total count for that {@code format} and {@code subdivisionLevel} is the sum of the {@code count} for each element.</p>
 * 
 * <p>Each micromap triangle refers to one element in {@code triangleArray} which contains the {@code format} and {@code subdivisionLevel} for that particular triangle as well as a {@code dataOffset} in bytes which is the location relative to {@code data} where that triangle’s micromap data begins. The data at {@code triangleArray} is laid out as a 4 byte unsigned integer for the {@code dataOffset} followed by a 2 byte unsigned integer for the subdivision level then a 2 byte unsigned integer for the format. In practice, compilers compile {@link VkMicromapTriangleEXT} to match this pattern.</p>
 * 
 * <p>For opacity micromaps, the data at {@code data} is packed as either one bit per element for {@link EXTOpacityMicromap#VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT OPACITY_MICROMAP_FORMAT_2_STATE_EXT} or two bits per element for {@link EXTOpacityMicromap#VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT OPACITY_MICROMAP_FORMAT_4_STATE_EXT} and is packed from LSB to MSB in each byte. The data at each index in those bytes is interpreted as discussed in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#ray-opacity-micromap">Ray Opacity Micromap</a>.</p>
 * 
 * <p>For displacement micromaps, the data at {@code data} is interpreted as discussed in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#displacement-micromap-encoding">Displacement Micromap Encoding</a>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Only one of {@code pUsageCounts} or {@code ppUsageCounts} <b>can</b> be a valid pointer, the other <b>must</b> be {@code NULL}</li>
 * <li>If {@code type} is {@link EXTOpacityMicromap#VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT MICROMAP_TYPE_OPACITY_MICROMAP_EXT} the {@code format} member of {@link VkMicromapUsageEXT} <b>must</b> be a valid value from {@code VkOpacityMicromapFormatEXT}</li>
 * <li>If {@code type} is {@link EXTOpacityMicromap#VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT MICROMAP_TYPE_OPACITY_MICROMAP_EXT} the {@code format} member of {@link VkMicromapTriangleEXT} <b>must</b> be a valid value from {@code VkOpacityMicromapFormatEXT}</li>
 * <li>If {@code type} is {@link NVDisplacementMicromap#VK_MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV} the {@code format} member of {@link VkMicromapUsageEXT} <b>must</b> be a valid value from {@code VkDisplacementMicromapFormatNV}</li>
 * <li>If {@code type} is {@link NVDisplacementMicromap#VK_MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV} the {@code format} member of {@link VkMicromapTriangleEXT} <b>must</b> be a valid value from {@code VkDisplacementMicromapFormatNV}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkMicromapTypeEXT} value</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkBuildMicromapFlagBitsEXT} values</li>
 * <li>If {@code usageCountsCount} is not 0, and {@code pUsageCounts} is not {@code NULL}, {@code pUsageCounts} <b>must</b> be a valid pointer to an array of {@code usageCountsCount} {@link VkMicromapUsageEXT} structures</li>
 * <li>If {@code usageCountsCount} is not 0, and {@code ppUsageCounts} is not {@code NULL}, {@code ppUsageCounts} <b>must</b> be a valid pointer to an array of {@code usageCountsCount} valid pointers to {@link VkMicromapUsageEXT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceOrHostAddressConstKHR}, {@link VkDeviceOrHostAddressKHR}, {@link VkMicromapUsageEXT}, {@link EXTOpacityMicromap#vkBuildMicromapsEXT BuildMicromapsEXT}, {@link EXTOpacityMicromap#vkCmdBuildMicromapsEXT CmdBuildMicromapsEXT}, {@link EXTOpacityMicromap#vkGetMicromapBuildSizesEXT GetMicromapBuildSizesEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMicromapBuildInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkMicromapTypeEXT {@link #type};
 *     VkBuildMicromapFlagsEXT {@link #flags};
 *     VkBuildMicromapModeEXT {@link #mode};
 *     VkMicromapEXT {@link #dstMicromap};
 *     uint32_t {@link #usageCountsCount};
 *     {@link VkMicromapUsageEXT VkMicromapUsageEXT} const * {@link #pUsageCounts};
 *     {@link VkMicromapUsageEXT VkMicromapUsageEXT} const * const * {@link #ppUsageCounts};
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} {@link #data};
 *     {@link VkDeviceOrHostAddressKHR VkDeviceOrHostAddressKHR} {@link #scratchData};
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} {@link #triangleArray};
 *     VkDeviceSize {@link #triangleArrayStride};
 * }</code></pre>
 */
public class VkMicromapBuildInfoEXT extends Struct<VkMicromapBuildInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        FLAGS,
        MODE,
        DSTMICROMAP,
        USAGECOUNTSCOUNT,
        PUSAGECOUNTS,
        PPUSAGECOUNTS,
        DATA,
        SCRATCHDATA,
        TRIANGLEARRAY,
        TRIANGLEARRAYSTRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(VkDeviceOrHostAddressKHR.SIZEOF, VkDeviceOrHostAddressKHR.ALIGNOF),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        MODE = layout.offsetof(4);
        DSTMICROMAP = layout.offsetof(5);
        USAGECOUNTSCOUNT = layout.offsetof(6);
        PUSAGECOUNTS = layout.offsetof(7);
        PPUSAGECOUNTS = layout.offsetof(8);
        DATA = layout.offsetof(9);
        SCRATCHDATA = layout.offsetof(10);
        TRIANGLEARRAY = layout.offsetof(11);
        TRIANGLEARRAYSTRIDE = layout.offsetof(12);
    }

    protected VkMicromapBuildInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMicromapBuildInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMicromapBuildInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkMicromapBuildInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMicromapBuildInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkMicromapTypeEXT} value specifying the type of micromap being built. */
    @NativeType("VkMicromapTypeEXT")
    public int type() { return ntype(address()); }
    /** a bitmask of {@code VkBuildMicromapFlagBitsEXT} specifying additional parameters of the micromap. */
    @NativeType("VkBuildMicromapFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a {@code VkBuildMicromapModeEXT} value specifying the type of operation to perform. */
    @NativeType("VkBuildMicromapModeEXT")
    public int mode() { return nmode(address()); }
    /** a pointer to the target micromap for the build. */
    @NativeType("VkMicromapEXT")
    public long dstMicromap() { return ndstMicromap(address()); }
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
    /** the device or host address to memory which contains the data for the micromap. */
    public VkDeviceOrHostAddressConstKHR data() { return ndata(address()); }
    /** the device or host address to memory that will be used as scratch memory for the build. */
    public VkDeviceOrHostAddressKHR scratchData() { return nscratchData(address()); }
    /** the device or host address to memory containing the {@link VkMicromapTriangleEXT} data */
    public VkDeviceOrHostAddressConstKHR triangleArray() { return ntriangleArray(address()); }
    /** the stride in bytes between each element of {@code triangleArray} */
    @NativeType("VkDeviceSize")
    public long triangleArrayStride() { return ntriangleArrayStride(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMicromapBuildInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT} value to the {@link #sType} field. */
    public VkMicromapBuildInfoEXT sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMicromapBuildInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkMicromapBuildInfoEXT type(@NativeType("VkMicromapTypeEXT") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkMicromapBuildInfoEXT flags(@NativeType("VkBuildMicromapFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkMicromapBuildInfoEXT mode(@NativeType("VkBuildMicromapModeEXT") int value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@link #dstMicromap} field. */
    public VkMicromapBuildInfoEXT dstMicromap(@NativeType("VkMicromapEXT") long value) { ndstMicromap(address(), value); return this; }
    /** Sets the specified value to the {@link #usageCountsCount} field. */
    public VkMicromapBuildInfoEXT usageCountsCount(@NativeType("uint32_t") int value) { nusageCountsCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkMicromapUsageEXT.Buffer} to the {@link #pUsageCounts} field. */
    public VkMicromapBuildInfoEXT pUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) { npUsageCounts(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #ppUsageCounts} field. */
    public VkMicromapBuildInfoEXT ppUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) { nppUsageCounts(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link #data} field. */
    public VkMicromapBuildInfoEXT data(VkDeviceOrHostAddressConstKHR value) { ndata(address(), value); return this; }
    /** Passes the {@link #data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkMicromapBuildInfoEXT data(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(data()); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@link #scratchData} field. */
    public VkMicromapBuildInfoEXT scratchData(VkDeviceOrHostAddressKHR value) { nscratchData(address(), value); return this; }
    /** Passes the {@link #scratchData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkMicromapBuildInfoEXT scratchData(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(scratchData()); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link #triangleArray} field. */
    public VkMicromapBuildInfoEXT triangleArray(VkDeviceOrHostAddressConstKHR value) { ntriangleArray(address(), value); return this; }
    /** Passes the {@link #triangleArray} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkMicromapBuildInfoEXT triangleArray(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(triangleArray()); return this; }
    /** Sets the specified value to the {@link #triangleArrayStride} field. */
    public VkMicromapBuildInfoEXT triangleArrayStride(@NativeType("VkDeviceSize") long value) { ntriangleArrayStride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMicromapBuildInfoEXT set(
        int sType,
        long pNext,
        int type,
        int flags,
        int mode,
        long dstMicromap,
        int usageCountsCount,
        @Nullable VkMicromapUsageEXT.Buffer pUsageCounts,
        @Nullable PointerBuffer ppUsageCounts,
        VkDeviceOrHostAddressConstKHR data,
        VkDeviceOrHostAddressKHR scratchData,
        VkDeviceOrHostAddressConstKHR triangleArray,
        long triangleArrayStride
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        flags(flags);
        mode(mode);
        dstMicromap(dstMicromap);
        usageCountsCount(usageCountsCount);
        pUsageCounts(pUsageCounts);
        ppUsageCounts(ppUsageCounts);
        data(data);
        scratchData(scratchData);
        triangleArray(triangleArray);
        triangleArrayStride(triangleArrayStride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMicromapBuildInfoEXT set(VkMicromapBuildInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMicromapBuildInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMicromapBuildInfoEXT malloc() {
        return new VkMicromapBuildInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapBuildInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMicromapBuildInfoEXT calloc() {
        return new VkMicromapBuildInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapBuildInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMicromapBuildInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapBuildInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMicromapBuildInfoEXT} instance for the specified memory address. */
    public static VkMicromapBuildInfoEXT create(long address) {
        return new VkMicromapBuildInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMicromapBuildInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkMicromapBuildInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkMicromapBuildInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMicromapBuildInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapBuildInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMicromapBuildInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMicromapBuildInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMicromapBuildInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapBuildInfoEXT malloc(MemoryStack stack) {
        return new VkMicromapBuildInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMicromapBuildInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapBuildInfoEXT calloc(MemoryStack stack) {
        return new VkMicromapBuildInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMicromapBuildInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapBuildInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMicromapBuildInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMicromapBuildInfoEXT.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkMicromapBuildInfoEXT.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkMicromapBuildInfoEXT.FLAGS); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + VkMicromapBuildInfoEXT.MODE); }
    /** Unsafe version of {@link #dstMicromap}. */
    public static long ndstMicromap(long struct) { return UNSAFE.getLong(null, struct + VkMicromapBuildInfoEXT.DSTMICROMAP); }
    /** Unsafe version of {@link #usageCountsCount}. */
    public static int nusageCountsCount(long struct) { return UNSAFE.getInt(null, struct + VkMicromapBuildInfoEXT.USAGECOUNTSCOUNT); }
    /** Unsafe version of {@link #pUsageCounts}. */
    @Nullable public static VkMicromapUsageEXT.Buffer npUsageCounts(long struct) { return VkMicromapUsageEXT.createSafe(memGetAddress(struct + VkMicromapBuildInfoEXT.PUSAGECOUNTS), nusageCountsCount(struct)); }
    /** Unsafe version of {@link #ppUsageCounts() ppUsageCounts}. */
    @Nullable public static PointerBuffer nppUsageCounts(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkMicromapBuildInfoEXT.PPUSAGECOUNTS), nusageCountsCount(struct)); }
    /** Unsafe version of {@link #data}. */
    public static VkDeviceOrHostAddressConstKHR ndata(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkMicromapBuildInfoEXT.DATA); }
    /** Unsafe version of {@link #scratchData}. */
    public static VkDeviceOrHostAddressKHR nscratchData(long struct) { return VkDeviceOrHostAddressKHR.create(struct + VkMicromapBuildInfoEXT.SCRATCHDATA); }
    /** Unsafe version of {@link #triangleArray}. */
    public static VkDeviceOrHostAddressConstKHR ntriangleArray(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkMicromapBuildInfoEXT.TRIANGLEARRAY); }
    /** Unsafe version of {@link #triangleArrayStride}. */
    public static long ntriangleArrayStride(long struct) { return UNSAFE.getLong(null, struct + VkMicromapBuildInfoEXT.TRIANGLEARRAYSTRIDE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapBuildInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMicromapBuildInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapBuildInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapBuildInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapBuildInfoEXT.MODE, value); }
    /** Unsafe version of {@link #dstMicromap(long) dstMicromap}. */
    public static void ndstMicromap(long struct, long value) { UNSAFE.putLong(null, struct + VkMicromapBuildInfoEXT.DSTMICROMAP, value); }
    /** Sets the specified value to the {@code usageCountsCount} field of the specified {@code struct}. */
    public static void nusageCountsCount(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapBuildInfoEXT.USAGECOUNTSCOUNT, value); }
    /** Unsafe version of {@link #pUsageCounts(VkMicromapUsageEXT.Buffer) pUsageCounts}. */
    public static void npUsageCounts(long struct, @Nullable VkMicromapUsageEXT.Buffer value) { memPutAddress(struct + VkMicromapBuildInfoEXT.PUSAGECOUNTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #ppUsageCounts(PointerBuffer) ppUsageCounts}. */
    public static void nppUsageCounts(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkMicromapBuildInfoEXT.PPUSAGECOUNTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #data(VkDeviceOrHostAddressConstKHR) data}. */
    public static void ndata(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkMicromapBuildInfoEXT.DATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #scratchData(VkDeviceOrHostAddressKHR) scratchData}. */
    public static void nscratchData(long struct, VkDeviceOrHostAddressKHR value) { memCopy(value.address(), struct + VkMicromapBuildInfoEXT.SCRATCHDATA, VkDeviceOrHostAddressKHR.SIZEOF); }
    /** Unsafe version of {@link #triangleArray(VkDeviceOrHostAddressConstKHR) triangleArray}. */
    public static void ntriangleArray(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkMicromapBuildInfoEXT.TRIANGLEARRAY, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #triangleArrayStride(long) triangleArrayStride}. */
    public static void ntriangleArrayStride(long struct, long value) { UNSAFE.putLong(null, struct + VkMicromapBuildInfoEXT.TRIANGLEARRAYSTRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkMicromapBuildInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMicromapBuildInfoEXT, Buffer> implements NativeResource {

        private static final VkMicromapBuildInfoEXT ELEMENT_FACTORY = VkMicromapBuildInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMicromapBuildInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMicromapBuildInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMicromapBuildInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMicromapBuildInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMicromapBuildInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkMicromapBuildInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMicromapBuildInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkMicromapBuildInfoEXT#type} field. */
        @NativeType("VkMicromapTypeEXT")
        public int type() { return VkMicromapBuildInfoEXT.ntype(address()); }
        /** @return the value of the {@link VkMicromapBuildInfoEXT#flags} field. */
        @NativeType("VkBuildMicromapFlagsEXT")
        public int flags() { return VkMicromapBuildInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkMicromapBuildInfoEXT#mode} field. */
        @NativeType("VkBuildMicromapModeEXT")
        public int mode() { return VkMicromapBuildInfoEXT.nmode(address()); }
        /** @return the value of the {@link VkMicromapBuildInfoEXT#dstMicromap} field. */
        @NativeType("VkMicromapEXT")
        public long dstMicromap() { return VkMicromapBuildInfoEXT.ndstMicromap(address()); }
        /** @return the value of the {@link VkMicromapBuildInfoEXT#usageCountsCount} field. */
        @NativeType("uint32_t")
        public int usageCountsCount() { return VkMicromapBuildInfoEXT.nusageCountsCount(address()); }
        /** @return a {@link VkMicromapUsageEXT.Buffer} view of the struct array pointed to by the {@link VkMicromapBuildInfoEXT#pUsageCounts} field. */
        @Nullable
        @NativeType("VkMicromapUsageEXT const *")
        public VkMicromapUsageEXT.Buffer pUsageCounts() { return VkMicromapBuildInfoEXT.npUsageCounts(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VkMicromapBuildInfoEXT#ppUsageCounts} field. */
        @Nullable
        @NativeType("VkMicromapUsageEXT const * const *")
        public PointerBuffer ppUsageCounts() { return VkMicromapBuildInfoEXT.nppUsageCounts(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@link VkMicromapBuildInfoEXT#data} field. */
        public VkDeviceOrHostAddressConstKHR data() { return VkMicromapBuildInfoEXT.ndata(address()); }
        /** @return a {@link VkDeviceOrHostAddressKHR} view of the {@link VkMicromapBuildInfoEXT#scratchData} field. */
        public VkDeviceOrHostAddressKHR scratchData() { return VkMicromapBuildInfoEXT.nscratchData(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@link VkMicromapBuildInfoEXT#triangleArray} field. */
        public VkDeviceOrHostAddressConstKHR triangleArray() { return VkMicromapBuildInfoEXT.ntriangleArray(address()); }
        /** @return the value of the {@link VkMicromapBuildInfoEXT#triangleArrayStride} field. */
        @NativeType("VkDeviceSize")
        public long triangleArrayStride() { return VkMicromapBuildInfoEXT.ntriangleArrayStride(address()); }

        /** Sets the specified value to the {@link VkMicromapBuildInfoEXT#sType} field. */
        public VkMicromapBuildInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMicromapBuildInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT} value to the {@link VkMicromapBuildInfoEXT#sType} field. */
        public VkMicromapBuildInfoEXT.Buffer sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT); }
        /** Sets the specified value to the {@link VkMicromapBuildInfoEXT#pNext} field. */
        public VkMicromapBuildInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkMicromapBuildInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapBuildInfoEXT#type} field. */
        public VkMicromapBuildInfoEXT.Buffer type(@NativeType("VkMicromapTypeEXT") int value) { VkMicromapBuildInfoEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapBuildInfoEXT#flags} field. */
        public VkMicromapBuildInfoEXT.Buffer flags(@NativeType("VkBuildMicromapFlagsEXT") int value) { VkMicromapBuildInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapBuildInfoEXT#mode} field. */
        public VkMicromapBuildInfoEXT.Buffer mode(@NativeType("VkBuildMicromapModeEXT") int value) { VkMicromapBuildInfoEXT.nmode(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapBuildInfoEXT#dstMicromap} field. */
        public VkMicromapBuildInfoEXT.Buffer dstMicromap(@NativeType("VkMicromapEXT") long value) { VkMicromapBuildInfoEXT.ndstMicromap(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapBuildInfoEXT#usageCountsCount} field. */
        public VkMicromapBuildInfoEXT.Buffer usageCountsCount(@NativeType("uint32_t") int value) { VkMicromapBuildInfoEXT.nusageCountsCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkMicromapUsageEXT.Buffer} to the {@link VkMicromapBuildInfoEXT#pUsageCounts} field. */
        public VkMicromapBuildInfoEXT.Buffer pUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) { VkMicromapBuildInfoEXT.npUsageCounts(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkMicromapBuildInfoEXT#ppUsageCounts} field. */
        public VkMicromapBuildInfoEXT.Buffer ppUsageCounts(@Nullable @NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) { VkMicromapBuildInfoEXT.nppUsageCounts(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link VkMicromapBuildInfoEXT#data} field. */
        public VkMicromapBuildInfoEXT.Buffer data(VkDeviceOrHostAddressConstKHR value) { VkMicromapBuildInfoEXT.ndata(address(), value); return this; }
        /** Passes the {@link VkMicromapBuildInfoEXT#data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkMicromapBuildInfoEXT.Buffer data(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(data()); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@link VkMicromapBuildInfoEXT#scratchData} field. */
        public VkMicromapBuildInfoEXT.Buffer scratchData(VkDeviceOrHostAddressKHR value) { VkMicromapBuildInfoEXT.nscratchData(address(), value); return this; }
        /** Passes the {@link VkMicromapBuildInfoEXT#scratchData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkMicromapBuildInfoEXT.Buffer scratchData(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(scratchData()); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link VkMicromapBuildInfoEXT#triangleArray} field. */
        public VkMicromapBuildInfoEXT.Buffer triangleArray(VkDeviceOrHostAddressConstKHR value) { VkMicromapBuildInfoEXT.ntriangleArray(address(), value); return this; }
        /** Passes the {@link VkMicromapBuildInfoEXT#triangleArray} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkMicromapBuildInfoEXT.Buffer triangleArray(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(triangleArray()); return this; }
        /** Sets the specified value to the {@link VkMicromapBuildInfoEXT#triangleArrayStride} field. */
        public VkMicromapBuildInfoEXT.Buffer triangleArrayStride(@NativeType("VkDeviceSize") long value) { VkMicromapBuildInfoEXT.ntriangleArrayStride(address(), value); return this; }

    }

}