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
 * Structure specifying the pipeline to query an address for.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceGeneratedCommandsCompute#VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
 * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVDeviceGeneratedCommandsCompute#vkGetPipelineIndirectDeviceAddressNV GetPipelineIndirectDeviceAddressNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineIndirectDeviceAddressInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     VkPipeline {@link #pipeline};
 * }</code></pre>
 */
public class VkPipelineIndirectDeviceAddressInfoNV extends Struct<VkPipelineIndirectDeviceAddressInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEBINDPOINT,
        PIPELINE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINDPOINT = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
    }

    protected VkPipelineIndirectDeviceAddressInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineIndirectDeviceAddressInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineIndirectDeviceAddressInfoNV(address, container);
    }

    /**
     * Creates a {@code VkPipelineIndirectDeviceAddressInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineIndirectDeviceAddressInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code pipelineBindPoint} field. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /**
     * <b>must</b> have been created with flag {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV} set
     * 
     * <p><b>must</b> have been created with a {@link VkComputePipelineIndirectBufferInfoNV} structure specifying a valid address where its metadata will be saved</p>
     */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineIndirectDeviceAddressInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommandsCompute#VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV} value to the {@code sType} field. */
    public VkPipelineIndirectDeviceAddressInfoNV sType$Default() { return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineIndirectDeviceAddressInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    public VkPipelineIndirectDeviceAddressInfoNV pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@link #pipeline} field. */
    public VkPipelineIndirectDeviceAddressInfoNV pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineIndirectDeviceAddressInfoNV set(
        int sType,
        long pNext,
        int pipelineBindPoint,
        long pipeline
    ) {
        sType(sType);
        pNext(pNext);
        pipelineBindPoint(pipelineBindPoint);
        pipeline(pipeline);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineIndirectDeviceAddressInfoNV set(VkPipelineIndirectDeviceAddressInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineIndirectDeviceAddressInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineIndirectDeviceAddressInfoNV malloc() {
        return new VkPipelineIndirectDeviceAddressInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineIndirectDeviceAddressInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineIndirectDeviceAddressInfoNV calloc() {
        return new VkPipelineIndirectDeviceAddressInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineIndirectDeviceAddressInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineIndirectDeviceAddressInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineIndirectDeviceAddressInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineIndirectDeviceAddressInfoNV} instance for the specified memory address. */
    public static VkPipelineIndirectDeviceAddressInfoNV create(long address) {
        return new VkPipelineIndirectDeviceAddressInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineIndirectDeviceAddressInfoNV createSafe(long address) {
        return address == NULL ? null : new VkPipelineIndirectDeviceAddressInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkPipelineIndirectDeviceAddressInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineIndirectDeviceAddressInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineIndirectDeviceAddressInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineIndirectDeviceAddressInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineIndirectDeviceAddressInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineIndirectDeviceAddressInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineIndirectDeviceAddressInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineIndirectDeviceAddressInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineIndirectDeviceAddressInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineIndirectDeviceAddressInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineIndirectDeviceAddressInfoNV malloc(MemoryStack stack) {
        return new VkPipelineIndirectDeviceAddressInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineIndirectDeviceAddressInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineIndirectDeviceAddressInfoNV calloc(MemoryStack stack) {
        return new VkPipelineIndirectDeviceAddressInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineIndirectDeviceAddressInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineIndirectDeviceAddressInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineIndirectDeviceAddressInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineIndirectDeviceAddressInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineIndirectDeviceAddressInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineIndirectDeviceAddressInfoNV.PNEXT); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return UNSAFE.getInt(null, struct + VkPipelineIndirectDeviceAddressInfoNV.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return UNSAFE.getLong(null, struct + VkPipelineIndirectDeviceAddressInfoNV.PIPELINE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineIndirectDeviceAddressInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineIndirectDeviceAddressInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineIndirectDeviceAddressInfoNV.PIPELINEBINDPOINT, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { UNSAFE.putLong(null, struct + VkPipelineIndirectDeviceAddressInfoNV.PIPELINE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineIndirectDeviceAddressInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineIndirectDeviceAddressInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineIndirectDeviceAddressInfoNV ELEMENT_FACTORY = VkPipelineIndirectDeviceAddressInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineIndirectDeviceAddressInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineIndirectDeviceAddressInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineIndirectDeviceAddressInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineIndirectDeviceAddressInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineIndirectDeviceAddressInfoNV.npNext(address()); }
        /** @return the value of the {@code pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkPipelineIndirectDeviceAddressInfoNV.npipelineBindPoint(address()); }
        /** @return the value of the {@link VkPipelineIndirectDeviceAddressInfoNV#pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkPipelineIndirectDeviceAddressInfoNV.npipeline(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineIndirectDeviceAddressInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineIndirectDeviceAddressInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommandsCompute#VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV} value to the {@code sType} field. */
        public VkPipelineIndirectDeviceAddressInfoNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineIndirectDeviceAddressInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineIndirectDeviceAddressInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        public VkPipelineIndirectDeviceAddressInfoNV.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkPipelineIndirectDeviceAddressInfoNV.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineIndirectDeviceAddressInfoNV#pipeline} field. */
        public VkPipelineIndirectDeviceAddressInfoNV.Buffer pipeline(@NativeType("VkPipeline") long value) { VkPipelineIndirectDeviceAddressInfoNV.npipeline(address(), value); return this; }

    }

}