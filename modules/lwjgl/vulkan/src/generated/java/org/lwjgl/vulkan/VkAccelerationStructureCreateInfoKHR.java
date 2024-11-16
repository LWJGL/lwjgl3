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
 * Structure specifying the parameters of a newly created acceleration structure object.
 * 
 * <h5>Description</h5>
 * 
 * <p>Applications <b>should</b> avoid creating acceleration structures with application-provided addresses and implementation-provided addresses in the same process, to reduce the likelihood of {@link KHRBufferDeviceAddress#VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR} errors.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The expected usage for this is that a trace capture/replay tool will add the {@link VK12#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT} flag to all buffers that use {@link VK12#VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT}, and will add {@link VK12#VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT} to all buffers used as storage for an acceleration structure where {@code deviceAddress} is not zero. This also means that the tool will need to add {@link VK12#VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT} to memory allocations to allow the flag to be set where the application may not have otherwise required it. During capture the tool will save the queried opaque device addresses in the trace. During replay, the buffers will be created specifying the original address so any address values stored in the trace data will remain valid.</p>
 * 
 * <p>Implementations are expected to separate such buffers in the GPU address space so normal allocations will avoid using these addresses. Apps/tools should avoid mixing app-provided and implementation-provided addresses for buffers created with {@link VK12#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT}, to avoid address space allocation conflicts.</p>
 * </div>
 * 
 * <p>Applications <b>should</b> create an acceleration structure with a specific {@code VkAccelerationStructureTypeKHR} other than {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>{@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR} is intended to be used by API translation layers. This can be used at acceleration structure creation time in cases where the actual acceleration structure type (top or bottom) is not yet known. The actual acceleration structure type must be specified as {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR} or {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR} when the build is performed.</p>
 * </div>
 * 
 * <p>If the acceleration structure will be the target of a build operation, the required size for an acceleration structure <b>can</b> be queried with {@link KHRAccelerationStructure#vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR}. If the acceleration structure is going to be the target of a compacting copy, {@link KHRAccelerationStructure#vkCmdWriteAccelerationStructuresPropertiesKHR CmdWriteAccelerationStructuresPropertiesKHR} or {@link KHRAccelerationStructure#vkWriteAccelerationStructuresPropertiesKHR WriteAccelerationStructuresPropertiesKHR} <b>can</b> be used to obtain the compacted size required.</p>
 * 
 * <p>If the acceleration structure will be the target of a build operation with {@link NVRayTracingMotionBlur#VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV} it <b>must</b> include {@link NVRayTracingMotionBlur#VK_ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV} in {@code createFlags} and include {@link VkAccelerationStructureMotionInfoNV} as an extension structure in {@code pNext} with the number of instances as metadata for the object.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code deviceAddress} is not zero, {@code createFlags} <b>must</b> include {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR}</li>
 * <li>If {@code deviceAddress} is not zero, it <b>must</b> have been retrieved from an identically created acceleration structure, except for {@code buffer} and {@code deviceAddress}</li>
 * <li>If {@code deviceAddress} is not zero, {@code buffer} <b>must</b> have been created identically to the {@code buffer} used to create the acceleration structure from which {@code deviceAddress} was retrieved, except for {@link VkBufferOpaqueCaptureAddressCreateInfo}{@code ::opaqueCaptureAddress}</li>
 * <li>If {@code deviceAddress} is not zero, {@code buffer} <b>must</b> have been created with a {@link VkBufferOpaqueCaptureAddressCreateInfo}{@code ::opaqueCaptureAddress} that was retrieved from {@link VK12#vkGetBufferOpaqueCaptureAddress GetBufferOpaqueCaptureAddress} for the {@code buffer} that was used to create the acceleration structure from which {@code deviceAddress} was retrieved</li>
 * <li>If {@code createFlags} includes {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR}, {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR}{@code ::accelerationStructureCaptureReplay} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>{@code buffer} <b>must</b> have been created with a {@code usage} value containing {@link KHRAccelerationStructure#VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR}</li>
 * <li>{@code buffer} <b>must</b> not have been created with {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>The sum of {@code offset} and {@code size} <b>must</b> be less than the size of {@code buffer}</li>
 * <li>{@code offset} <b>must</b> be a multiple of 256 bytes</li>
 * <li>If {@link NVRayTracingMotionBlur#VK_ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV} is set in {@code createFlags} and {@code type} is {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR}, one member of the {@code pNext} chain <b>must</b> be a pointer to a valid instance of {@link VkAccelerationStructureMotionInfoNV}</li>
 * <li>If any geometry includes {@link VkAccelerationStructureGeometryMotionTrianglesDataNV} then {@code createFlags} <b>must</b> contain {@link NVRayTracingMotionBlur#VK_ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV}</li>
 * <li>If {@code createFlags} includes {@link EXTDescriptorBuffer#VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBufferCaptureReplay">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
 * <li>If the {@code pNext} chain includes a {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} structure, {@code createFlags} <b>must</b> contain {@link EXTDescriptorBuffer#VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkAccelerationStructureMotionInfoNV} or {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code createFlags} <b>must</b> be a valid combination of {@code VkAccelerationStructureCreateFlagBitsKHR} values</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkAccelerationStructureTypeKHR} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRAccelerationStructure#vkCreateAccelerationStructureKHR CreateAccelerationStructureKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAccelerationStructureCreateFlagsKHR {@link #createFlags};
 *     VkBuffer {@link #buffer};
 *     VkDeviceSize {@link #offset};
 *     VkDeviceSize {@link #size};
 *     VkAccelerationStructureTypeKHR {@link #type};
 *     VkDeviceAddress {@link #deviceAddress};
 * }</code></pre>
 */
public class VkAccelerationStructureCreateInfoKHR extends Struct<VkAccelerationStructureCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CREATEFLAGS,
        BUFFER,
        OFFSET,
        SIZE,
        TYPE,
        DEVICEADDRESS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CREATEFLAGS = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        SIZE = layout.offsetof(5);
        TYPE = layout.offsetof(6);
        DEVICEADDRESS = layout.offsetof(7);
    }

    protected VkAccelerationStructureCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureCreateInfoKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkAccelerationStructureCreateFlagBitsKHR} specifying additional creation parameters of the acceleration structure. */
    @NativeType("VkAccelerationStructureCreateFlagsKHR")
    public int createFlags() { return ncreateFlags(address()); }
    /** the buffer on which the acceleration structure will be stored. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** an offset in bytes from the base address of the buffer at which the acceleration structure will be stored, and <b>must</b> be a multiple of 256. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** the size required for the acceleration structure. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** a {@code VkAccelerationStructureTypeKHR} value specifying the type of acceleration structure that will be created. */
    @NativeType("VkAccelerationStructureTypeKHR")
    public int type() { return ntype(address()); }
    /** the device address requested for the acceleration structure if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-accelerationStructureCaptureReplay">{@code accelerationStructureCaptureReplay}</a> feature is being used. If {@code deviceAddress} is zero, no specific address is requested. */
    @NativeType("VkDeviceAddress")
    public long deviceAddress() { return ndeviceAddress(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkAccelerationStructureCreateInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkAccelerationStructureMotionInfoNV} value to the {@code pNext} chain. */
    public VkAccelerationStructureCreateInfoKHR pNext(VkAccelerationStructureMotionInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
    public VkAccelerationStructureCreateInfoKHR pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #createFlags} field. */
    public VkAccelerationStructureCreateInfoKHR createFlags(@NativeType("VkAccelerationStructureCreateFlagsKHR") int value) { ncreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #buffer} field. */
    public VkAccelerationStructureCreateInfoKHR buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public VkAccelerationStructureCreateInfoKHR offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkAccelerationStructureCreateInfoKHR size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkAccelerationStructureCreateInfoKHR type(@NativeType("VkAccelerationStructureTypeKHR") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceAddress} field. */
    public VkAccelerationStructureCreateInfoKHR deviceAddress(@NativeType("VkDeviceAddress") long value) { ndeviceAddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureCreateInfoKHR set(
        int sType,
        long pNext,
        int createFlags,
        long buffer,
        long offset,
        long size,
        int type,
        long deviceAddress
    ) {
        sType(sType);
        pNext(pNext);
        createFlags(createFlags);
        buffer(buffer);
        offset(offset);
        size(size);
        type(type);
        deviceAddress(deviceAddress);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureCreateInfoKHR set(VkAccelerationStructureCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCreateInfoKHR malloc() {
        return new VkAccelerationStructureCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCreateInfoKHR calloc() {
        return new VkAccelerationStructureCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance for the specified memory address. */
    public static VkAccelerationStructureCreateInfoKHR create(long address) {
        return new VkAccelerationStructureCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCreateInfoKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCreateInfoKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static int ncreateFlags(long struct) { return memGetInt(struct + VkAccelerationStructureCreateInfoKHR.CREATEFLAGS); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetLong(struct + VkAccelerationStructureCreateInfoKHR.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkAccelerationStructureCreateInfoKHR.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkAccelerationStructureCreateInfoKHR.SIZE); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkAccelerationStructureCreateInfoKHR.TYPE); }
    /** Unsafe version of {@link #deviceAddress}. */
    public static long ndeviceAddress(long struct) { return memGetLong(struct + VkAccelerationStructureCreateInfoKHR.DEVICEADDRESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #createFlags(int) createFlags}. */
    public static void ncreateFlags(long struct, int value) { memPutInt(struct + VkAccelerationStructureCreateInfoKHR.CREATEFLAGS, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutLong(struct + VkAccelerationStructureCreateInfoKHR.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkAccelerationStructureCreateInfoKHR.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkAccelerationStructureCreateInfoKHR.SIZE, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkAccelerationStructureCreateInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #deviceAddress(long) deviceAddress}. */
    public static void ndeviceAddress(long struct, long value) { memPutLong(struct + VkAccelerationStructureCreateInfoKHR.DEVICEADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureCreateInfoKHR ELEMENT_FACTORY = VkAccelerationStructureCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureCreateInfoKHR#createFlags} field. */
        @NativeType("VkAccelerationStructureCreateFlagsKHR")
        public int createFlags() { return VkAccelerationStructureCreateInfoKHR.ncreateFlags(address()); }
        /** @return the value of the {@link VkAccelerationStructureCreateInfoKHR#buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkAccelerationStructureCreateInfoKHR.nbuffer(address()); }
        /** @return the value of the {@link VkAccelerationStructureCreateInfoKHR#offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkAccelerationStructureCreateInfoKHR.noffset(address()); }
        /** @return the value of the {@link VkAccelerationStructureCreateInfoKHR#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkAccelerationStructureCreateInfoKHR.nsize(address()); }
        /** @return the value of the {@link VkAccelerationStructureCreateInfoKHR#type} field. */
        @NativeType("VkAccelerationStructureTypeKHR")
        public int type() { return VkAccelerationStructureCreateInfoKHR.ntype(address()); }
        /** @return the value of the {@link VkAccelerationStructureCreateInfoKHR#deviceAddress} field. */
        @NativeType("VkDeviceAddress")
        public long deviceAddress() { return VkAccelerationStructureCreateInfoKHR.ndeviceAddress(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureCreateInfoKHR#sType} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR} value to the {@link VkAccelerationStructureCreateInfoKHR#sType} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkAccelerationStructureCreateInfoKHR#pNext} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkAccelerationStructureMotionInfoNV} value to the {@code pNext} chain. */
        public VkAccelerationStructureCreateInfoKHR.Buffer pNext(VkAccelerationStructureMotionInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
        public VkAccelerationStructureCreateInfoKHR.Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkAccelerationStructureCreateInfoKHR#createFlags} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer createFlags(@NativeType("VkAccelerationStructureCreateFlagsKHR") int value) { VkAccelerationStructureCreateInfoKHR.ncreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureCreateInfoKHR#buffer} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer buffer(@NativeType("VkBuffer") long value) { VkAccelerationStructureCreateInfoKHR.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureCreateInfoKHR#offset} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer offset(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoKHR.noffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureCreateInfoKHR#size} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer size(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoKHR.nsize(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureCreateInfoKHR#type} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer type(@NativeType("VkAccelerationStructureTypeKHR") int value) { VkAccelerationStructureCreateInfoKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureCreateInfoKHR#deviceAddress} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) { VkAccelerationStructureCreateInfoKHR.ndeviceAddress(address(), value); return this; }

    }

}