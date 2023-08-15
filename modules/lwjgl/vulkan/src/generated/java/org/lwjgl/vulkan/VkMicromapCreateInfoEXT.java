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
 * Structure specifying the parameters of a newly created micromap object.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code deviceAddress} is zero, no specific address is requested.</p>
 * 
 * <p>If {@code deviceAddress} is not zero, {@code deviceAddress} <b>must</b> be an address retrieved from an identically created micromap on the same implementation. The micromap <b>must</b> also be placed on an identically created {@code buffer} and at the same {@code offset}.</p>
 * 
 * <p>Applications <b>should</b> avoid creating micromaps with application-provided addresses and implementation-provided addresses in the same process, to reduce the likelihood of {@link KHRBufferDeviceAddress#VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR} errors.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The expected usage for this is that a trace capture/replay tool will add the {@link VK12#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT} flag to all buffers that use {@link VK12#VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT}, and will add {@link VK12#VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT} to all buffers used as storage for a micromap where {@code deviceAddress} is not zero. This also means that the tool will need to add {@link VK12#VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT} to memory allocations to allow the flag to be set where the application may not have otherwise required it. During capture the tool will save the queried opaque device addresses in the trace. During replay, the buffers will be created specifying the original address so any address values stored in the trace data will remain valid.</p>
 * 
 * <p>Implementations are expected to separate such buffers in the GPU address space so normal allocations will avoid using these addresses. Apps/tools should avoid mixing app-provided and implementation-provided addresses for buffers created with {@link VK12#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT}, to avoid address space allocation conflicts.</p>
 * </div>
 * 
 * <p>If the micromap will be the target of a build operation, the required size for a micromap <b>can</b> be queried with {@link EXTOpacityMicromap#vkGetMicromapBuildSizesEXT GetMicromapBuildSizesEXT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code deviceAddress} is not zero, {@code createFlags} <b>must</b> include {@link EXTOpacityMicromap#VK_MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT}</li>
 * <li>If {@code createFlags} includes {@link EXTOpacityMicromap#VK_MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT}, {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT}{@code ::micromapCaptureReplay} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>{@code buffer} <b>must</b> have been created with a {@code usage} value containing {@link EXTOpacityMicromap#VK_BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT}</li>
 * <li>{@code buffer} <b>must</b> not have been created with {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>The sum of {@code offset} and {@code size} <b>must</b> be less than the size of {@code buffer}</li>
 * <li>{@code offset} <b>must</b> be a multiple of 256 bytes</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code createFlags} <b>must</b> be a valid combination of {@code VkMicromapCreateFlagBitsEXT} values</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkMicromapTypeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTOpacityMicromap#vkCreateMicromapEXT CreateMicromapEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMicromapCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkMicromapCreateFlagsEXT {@link #createFlags};
 *     VkBuffer {@link #buffer};
 *     VkDeviceSize {@link #offset};
 *     VkDeviceSize {@link #size};
 *     VkMicromapTypeEXT {@link #type};
 *     VkDeviceAddress {@link #deviceAddress};
 * }</code></pre>
 */
public class VkMicromapCreateInfoEXT extends Struct<VkMicromapCreateInfoEXT> implements NativeResource {

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

    protected VkMicromapCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMicromapCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMicromapCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkMicromapCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMicromapCreateInfoEXT(ByteBuffer container) {
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
    /** a bitmask of {@code VkMicromapCreateFlagBitsEXT} specifying additional creation parameters of the micromap. */
    @NativeType("VkMicromapCreateFlagsEXT")
    public int createFlags() { return ncreateFlags(address()); }
    /** the buffer on which the micromap will be stored. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** an offset in bytes from the base address of the buffer at which the micromap will be stored, and <b>must</b> be a multiple of 256. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** the size required for the micromap. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** a {@code VkMicromapTypeEXT} value specifying the type of micromap that will be created. */
    @NativeType("VkMicromapTypeEXT")
    public int type() { return ntype(address()); }
    /** the device address requested for the micromap if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-micromapCaptureReplay">{@code micromapCaptureReplay}</a> feature is being used. */
    @NativeType("VkDeviceAddress")
    public long deviceAddress() { return ndeviceAddress(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMicromapCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkMicromapCreateInfoEXT sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMicromapCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #createFlags} field. */
    public VkMicromapCreateInfoEXT createFlags(@NativeType("VkMicromapCreateFlagsEXT") int value) { ncreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #buffer} field. */
    public VkMicromapCreateInfoEXT buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public VkMicromapCreateInfoEXT offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkMicromapCreateInfoEXT size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkMicromapCreateInfoEXT type(@NativeType("VkMicromapTypeEXT") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceAddress} field. */
    public VkMicromapCreateInfoEXT deviceAddress(@NativeType("VkDeviceAddress") long value) { ndeviceAddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMicromapCreateInfoEXT set(
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
    public VkMicromapCreateInfoEXT set(VkMicromapCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMicromapCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMicromapCreateInfoEXT malloc() {
        return new VkMicromapCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMicromapCreateInfoEXT calloc() {
        return new VkMicromapCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMicromapCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMicromapCreateInfoEXT} instance for the specified memory address. */
    public static VkMicromapCreateInfoEXT create(long address) {
        return new VkMicromapCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMicromapCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkMicromapCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkMicromapCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMicromapCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMicromapCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMicromapCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMicromapCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapCreateInfoEXT malloc(MemoryStack stack) {
        return new VkMicromapCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMicromapCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapCreateInfoEXT calloc(MemoryStack stack) {
        return new VkMicromapCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMicromapCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMicromapCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMicromapCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static int ncreateFlags(long struct) { return UNSAFE.getInt(null, struct + VkMicromapCreateInfoEXT.CREATEFLAGS); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkMicromapCreateInfoEXT.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VkMicromapCreateInfoEXT.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkMicromapCreateInfoEXT.SIZE); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkMicromapCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #deviceAddress}. */
    public static long ndeviceAddress(long struct) { return UNSAFE.getLong(null, struct + VkMicromapCreateInfoEXT.DEVICEADDRESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMicromapCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #createFlags(int) createFlags}. */
    public static void ncreateFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapCreateInfoEXT.CREATEFLAGS, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkMicromapCreateInfoEXT.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { UNSAFE.putLong(null, struct + VkMicromapCreateInfoEXT.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkMicromapCreateInfoEXT.SIZE, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #deviceAddress(long) deviceAddress}. */
    public static void ndeviceAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkMicromapCreateInfoEXT.DEVICEADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkMicromapCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMicromapCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkMicromapCreateInfoEXT ELEMENT_FACTORY = VkMicromapCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMicromapCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMicromapCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMicromapCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMicromapCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMicromapCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkMicromapCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMicromapCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkMicromapCreateInfoEXT#createFlags} field. */
        @NativeType("VkMicromapCreateFlagsEXT")
        public int createFlags() { return VkMicromapCreateInfoEXT.ncreateFlags(address()); }
        /** @return the value of the {@link VkMicromapCreateInfoEXT#buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkMicromapCreateInfoEXT.nbuffer(address()); }
        /** @return the value of the {@link VkMicromapCreateInfoEXT#offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkMicromapCreateInfoEXT.noffset(address()); }
        /** @return the value of the {@link VkMicromapCreateInfoEXT#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkMicromapCreateInfoEXT.nsize(address()); }
        /** @return the value of the {@link VkMicromapCreateInfoEXT#type} field. */
        @NativeType("VkMicromapTypeEXT")
        public int type() { return VkMicromapCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@link VkMicromapCreateInfoEXT#deviceAddress} field. */
        @NativeType("VkDeviceAddress")
        public long deviceAddress() { return VkMicromapCreateInfoEXT.ndeviceAddress(address()); }

        /** Sets the specified value to the {@link VkMicromapCreateInfoEXT#sType} field. */
        public VkMicromapCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMicromapCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT} value to the {@link VkMicromapCreateInfoEXT#sType} field. */
        public VkMicromapCreateInfoEXT.Buffer sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkMicromapCreateInfoEXT#pNext} field. */
        public VkMicromapCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkMicromapCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapCreateInfoEXT#createFlags} field. */
        public VkMicromapCreateInfoEXT.Buffer createFlags(@NativeType("VkMicromapCreateFlagsEXT") int value) { VkMicromapCreateInfoEXT.ncreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapCreateInfoEXT#buffer} field. */
        public VkMicromapCreateInfoEXT.Buffer buffer(@NativeType("VkBuffer") long value) { VkMicromapCreateInfoEXT.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapCreateInfoEXT#offset} field. */
        public VkMicromapCreateInfoEXT.Buffer offset(@NativeType("VkDeviceSize") long value) { VkMicromapCreateInfoEXT.noffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapCreateInfoEXT#size} field. */
        public VkMicromapCreateInfoEXT.Buffer size(@NativeType("VkDeviceSize") long value) { VkMicromapCreateInfoEXT.nsize(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapCreateInfoEXT#type} field. */
        public VkMicromapCreateInfoEXT.Buffer type(@NativeType("VkMicromapTypeEXT") int value) { VkMicromapCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapCreateInfoEXT#deviceAddress} field. */
        public VkMicromapCreateInfoEXT.Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) { VkMicromapCreateInfoEXT.ndeviceAddress(address(), value); return this; }

    }

}