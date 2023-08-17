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
 * Structure describing the device address where pipeline’s metadata will be saved.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedComputePipelines">{@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV}{@code ::deviceGeneratedComputePipelines}</a> feature <b>must</b> be enabled</li>
 * <li>The pipeline creation flags in {@link VkComputePipelineCreateInfo}{@code ::flags} <b>must</b> include {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}</li>
 * <li>{@code deviceAddress} <b>must</b> be aligned to the {@link VkMemoryRequirements2}{@code ::alignment}, as returned by {@link NVDeviceGeneratedCommandsCompute#vkGetPipelineIndirectMemoryRequirementsNV GetPipelineIndirectMemoryRequirementsNV}</li>
 * <li>{@code deviceAddress} <b>must</b> have been allocated from a buffer that was created with usage {@link VK10#VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} and {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT}</li>
 * <li>{@code size} <b>must</b> be greater than or equal to the {@link VkMemoryRequirements2}{@code ::size}, as returned by {@link NVDeviceGeneratedCommandsCompute#vkGetPipelineIndirectMemoryRequirementsNV GetPipelineIndirectMemoryRequirementsNV}</li>
 * <li>If {@code pipelineDeviceAddressCaptureReplay} is non-zero then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedComputePipelines">{@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV}{@code ::deviceGeneratedComputeCaptureReplay}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code pipelineDeviceAddressCaptureReplay} is non-zero then that address <b>must</b> have been allocated with flag {@link VK12#VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT} set</li>
 * <li>If {@code pipelineDeviceAddressCaptureReplay} is non-zero, the {@code pipeline} <b>must</b> have been recreated for replay</li>
 * <li>{@code pipelineDeviceAddressCaptureReplay} <b>must</b> satisfy the {@code alignment} and {@code size} requirements similar to {@code deviceAddress}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceGeneratedCommandsCompute#VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkComputePipelineIndirectBufferInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceAddress deviceAddress;
 *     VkDeviceSize size;
 *     VkDeviceAddress pipelineDeviceAddressCaptureReplay;
 * }</code></pre>
 */
public class VkComputePipelineIndirectBufferInfoNV extends Struct<VkComputePipelineIndirectBufferInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEADDRESS,
        SIZE,
        PIPELINEDEVICEADDRESSCAPTUREREPLAY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEADDRESS = layout.offsetof(2);
        SIZE = layout.offsetof(3);
        PIPELINEDEVICEADDRESSCAPTUREREPLAY = layout.offsetof(4);
    }

    protected VkComputePipelineIndirectBufferInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkComputePipelineIndirectBufferInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkComputePipelineIndirectBufferInfoNV(address, container);
    }

    /**
     * Creates a {@code VkComputePipelineIndirectBufferInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkComputePipelineIndirectBufferInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code deviceAddress} field. */
    @NativeType("VkDeviceAddress")
    public long deviceAddress() { return ndeviceAddress(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code pipelineDeviceAddressCaptureReplay} field. */
    @NativeType("VkDeviceAddress")
    public long pipelineDeviceAddressCaptureReplay() { return npipelineDeviceAddressCaptureReplay(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkComputePipelineIndirectBufferInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommandsCompute#VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV} value to the {@code sType} field. */
    public VkComputePipelineIndirectBufferInfoNV sType$Default() { return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkComputePipelineIndirectBufferInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code deviceAddress} field. */
    public VkComputePipelineIndirectBufferInfoNV deviceAddress(@NativeType("VkDeviceAddress") long value) { ndeviceAddress(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkComputePipelineIndirectBufferInfoNV size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineDeviceAddressCaptureReplay} field. */
    public VkComputePipelineIndirectBufferInfoNV pipelineDeviceAddressCaptureReplay(@NativeType("VkDeviceAddress") long value) { npipelineDeviceAddressCaptureReplay(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkComputePipelineIndirectBufferInfoNV set(
        int sType,
        long pNext,
        long deviceAddress,
        long size,
        long pipelineDeviceAddressCaptureReplay
    ) {
        sType(sType);
        pNext(pNext);
        deviceAddress(deviceAddress);
        size(size);
        pipelineDeviceAddressCaptureReplay(pipelineDeviceAddressCaptureReplay);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkComputePipelineIndirectBufferInfoNV set(VkComputePipelineIndirectBufferInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkComputePipelineIndirectBufferInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkComputePipelineIndirectBufferInfoNV malloc() {
        return new VkComputePipelineIndirectBufferInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkComputePipelineIndirectBufferInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkComputePipelineIndirectBufferInfoNV calloc() {
        return new VkComputePipelineIndirectBufferInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkComputePipelineIndirectBufferInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkComputePipelineIndirectBufferInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkComputePipelineIndirectBufferInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkComputePipelineIndirectBufferInfoNV} instance for the specified memory address. */
    public static VkComputePipelineIndirectBufferInfoNV create(long address) {
        return new VkComputePipelineIndirectBufferInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkComputePipelineIndirectBufferInfoNV createSafe(long address) {
        return address == NULL ? null : new VkComputePipelineIndirectBufferInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkComputePipelineIndirectBufferInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineIndirectBufferInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineIndirectBufferInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineIndirectBufferInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineIndirectBufferInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineIndirectBufferInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkComputePipelineIndirectBufferInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineIndirectBufferInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkComputePipelineIndirectBufferInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkComputePipelineIndirectBufferInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComputePipelineIndirectBufferInfoNV malloc(MemoryStack stack) {
        return new VkComputePipelineIndirectBufferInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkComputePipelineIndirectBufferInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComputePipelineIndirectBufferInfoNV calloc(MemoryStack stack) {
        return new VkComputePipelineIndirectBufferInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkComputePipelineIndirectBufferInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineIndirectBufferInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineIndirectBufferInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineIndirectBufferInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkComputePipelineIndirectBufferInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkComputePipelineIndirectBufferInfoNV.PNEXT); }
    /** Unsafe version of {@link #deviceAddress}. */
    public static long ndeviceAddress(long struct) { return UNSAFE.getLong(null, struct + VkComputePipelineIndirectBufferInfoNV.DEVICEADDRESS); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkComputePipelineIndirectBufferInfoNV.SIZE); }
    /** Unsafe version of {@link #pipelineDeviceAddressCaptureReplay}. */
    public static long npipelineDeviceAddressCaptureReplay(long struct) { return UNSAFE.getLong(null, struct + VkComputePipelineIndirectBufferInfoNV.PIPELINEDEVICEADDRESSCAPTUREREPLAY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkComputePipelineIndirectBufferInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkComputePipelineIndirectBufferInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #deviceAddress(long) deviceAddress}. */
    public static void ndeviceAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkComputePipelineIndirectBufferInfoNV.DEVICEADDRESS, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkComputePipelineIndirectBufferInfoNV.SIZE, value); }
    /** Unsafe version of {@link #pipelineDeviceAddressCaptureReplay(long) pipelineDeviceAddressCaptureReplay}. */
    public static void npipelineDeviceAddressCaptureReplay(long struct, long value) { UNSAFE.putLong(null, struct + VkComputePipelineIndirectBufferInfoNV.PIPELINEDEVICEADDRESSCAPTUREREPLAY, value); }

    // -----------------------------------

    /** An array of {@link VkComputePipelineIndirectBufferInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkComputePipelineIndirectBufferInfoNV, Buffer> implements NativeResource {

        private static final VkComputePipelineIndirectBufferInfoNV ELEMENT_FACTORY = VkComputePipelineIndirectBufferInfoNV.create(-1L);

        /**
         * Creates a new {@code VkComputePipelineIndirectBufferInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkComputePipelineIndirectBufferInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkComputePipelineIndirectBufferInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkComputePipelineIndirectBufferInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkComputePipelineIndirectBufferInfoNV.npNext(address()); }
        /** @return the value of the {@code deviceAddress} field. */
        @NativeType("VkDeviceAddress")
        public long deviceAddress() { return VkComputePipelineIndirectBufferInfoNV.ndeviceAddress(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkComputePipelineIndirectBufferInfoNV.nsize(address()); }
        /** @return the value of the {@code pipelineDeviceAddressCaptureReplay} field. */
        @NativeType("VkDeviceAddress")
        public long pipelineDeviceAddressCaptureReplay() { return VkComputePipelineIndirectBufferInfoNV.npipelineDeviceAddressCaptureReplay(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkComputePipelineIndirectBufferInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkComputePipelineIndirectBufferInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommandsCompute#VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV} value to the {@code sType} field. */
        public VkComputePipelineIndirectBufferInfoNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkComputePipelineIndirectBufferInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkComputePipelineIndirectBufferInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code deviceAddress} field. */
        public VkComputePipelineIndirectBufferInfoNV.Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) { VkComputePipelineIndirectBufferInfoNV.ndeviceAddress(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkComputePipelineIndirectBufferInfoNV.Buffer size(@NativeType("VkDeviceSize") long value) { VkComputePipelineIndirectBufferInfoNV.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineDeviceAddressCaptureReplay} field. */
        public VkComputePipelineIndirectBufferInfoNV.Buffer pipelineDeviceAddressCaptureReplay(@NativeType("VkDeviceAddress") long value) { VkComputePipelineIndirectBufferInfoNV.npipelineDeviceAddressCaptureReplay(address(), value); return this; }

    }

}