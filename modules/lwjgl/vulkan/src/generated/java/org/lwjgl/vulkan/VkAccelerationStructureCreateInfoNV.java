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
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code compactedSize} is not 0 then both {@code info.geometryCount} and {@code info.instanceCount} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code info} <b>must</b> be a valid {@link VkAccelerationStructureInfoNV} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureInfoNV}, {@link NVRayTracing#vkCreateAccelerationStructureNV CreateAccelerationStructureNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceSize {@link #compactedSize};
 *     {@link VkAccelerationStructureInfoNV VkAccelerationStructureInfoNV} {@link #info};
 * }</code></pre>
 */
public class VkAccelerationStructureCreateInfoNV extends Struct<VkAccelerationStructureCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMPACTEDSIZE,
        INFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(VkAccelerationStructureInfoNV.SIZEOF, VkAccelerationStructureInfoNV.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPACTEDSIZE = layout.offsetof(2);
        INFO = layout.offsetof(3);
    }

    protected VkAccelerationStructureCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureCreateInfoNV(ByteBuffer container) {
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
    /** the size from the result of {@link NVRayTracing#vkCmdWriteAccelerationStructuresPropertiesNV CmdWriteAccelerationStructuresPropertiesNV} if this acceleration structure is going to be the target of a compacting copy. */
    @NativeType("VkDeviceSize")
    public long compactedSize() { return ncompactedSize(address()); }
    /** the {@link VkAccelerationStructureInfoNV} structure specifying further parameters of the created acceleration structure. */
    public VkAccelerationStructureInfoNV info() { return ninfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkAccelerationStructureCreateInfoNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
    public VkAccelerationStructureCreateInfoNV pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #compactedSize} field. */
    public VkAccelerationStructureCreateInfoNV compactedSize(@NativeType("VkDeviceSize") long value) { ncompactedSize(address(), value); return this; }
    /** Copies the specified {@link VkAccelerationStructureInfoNV} to the {@link #info} field. */
    public VkAccelerationStructureCreateInfoNV info(VkAccelerationStructureInfoNV value) { ninfo(address(), value); return this; }
    /** Passes the {@link #info} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureCreateInfoNV info(java.util.function.Consumer<VkAccelerationStructureInfoNV> consumer) { consumer.accept(info()); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureCreateInfoNV set(
        int sType,
        long pNext,
        long compactedSize,
        VkAccelerationStructureInfoNV info
    ) {
        sType(sType);
        pNext(pNext);
        compactedSize(compactedSize);
        info(info);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureCreateInfoNV set(VkAccelerationStructureCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCreateInfoNV malloc() {
        return new VkAccelerationStructureCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCreateInfoNV calloc() {
        return new VkAccelerationStructureCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoNV} instance for the specified memory address. */
    public static VkAccelerationStructureCreateInfoNV create(long address) {
        return new VkAccelerationStructureCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCreateInfoNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCreateInfoNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #compactedSize}. */
    public static long ncompactedSize(long struct) { return memGetLong(struct + VkAccelerationStructureCreateInfoNV.COMPACTEDSIZE); }
    /** Unsafe version of {@link #info}. */
    public static VkAccelerationStructureInfoNV ninfo(long struct) { return VkAccelerationStructureInfoNV.create(struct + VkAccelerationStructureCreateInfoNV.INFO); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #compactedSize(long) compactedSize}. */
    public static void ncompactedSize(long struct, long value) { memPutLong(struct + VkAccelerationStructureCreateInfoNV.COMPACTEDSIZE, value); }
    /** Unsafe version of {@link #info(VkAccelerationStructureInfoNV) info}. */
    public static void ninfo(long struct, VkAccelerationStructureInfoNV value) { memCopy(value.address(), struct + VkAccelerationStructureCreateInfoNV.INFO, VkAccelerationStructureInfoNV.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        VkAccelerationStructureInfoNV.validate(struct + VkAccelerationStructureCreateInfoNV.INFO);
    }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureCreateInfoNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureCreateInfoNV ELEMENT_FACTORY = VkAccelerationStructureCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureCreateInfoNV#compactedSize} field. */
        @NativeType("VkDeviceSize")
        public long compactedSize() { return VkAccelerationStructureCreateInfoNV.ncompactedSize(address()); }
        /** @return a {@link VkAccelerationStructureInfoNV} view of the {@link VkAccelerationStructureCreateInfoNV#info} field. */
        public VkAccelerationStructureInfoNV info() { return VkAccelerationStructureCreateInfoNV.ninfo(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureCreateInfoNV#sType} field. */
        public VkAccelerationStructureCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV} value to the {@link VkAccelerationStructureCreateInfoNV#sType} field. */
        public VkAccelerationStructureCreateInfoNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkAccelerationStructureCreateInfoNV#pNext} field. */
        public VkAccelerationStructureCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureCreateInfoNV.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
        public VkAccelerationStructureCreateInfoNV.Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkAccelerationStructureCreateInfoNV#compactedSize} field. */
        public VkAccelerationStructureCreateInfoNV.Buffer compactedSize(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoNV.ncompactedSize(address(), value); return this; }
        /** Copies the specified {@link VkAccelerationStructureInfoNV} to the {@link VkAccelerationStructureCreateInfoNV#info} field. */
        public VkAccelerationStructureCreateInfoNV.Buffer info(VkAccelerationStructureInfoNV value) { VkAccelerationStructureCreateInfoNV.ninfo(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureCreateInfoNV#info} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureCreateInfoNV.Buffer info(java.util.function.Consumer<VkAccelerationStructureInfoNV> consumer) { consumer.accept(info()); return this; }

    }

}