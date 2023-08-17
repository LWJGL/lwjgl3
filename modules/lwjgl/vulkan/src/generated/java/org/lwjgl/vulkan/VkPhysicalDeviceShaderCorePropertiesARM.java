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
 * Structure describing shader core properties that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If a throughput rate cannot be determined on the physical device, the value 0 will be returned for that rate.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderCorePropertiesARM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ARMShaderCoreProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderCorePropertiesARM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #pixelRate};
 *     uint32_t {@link #texelRate};
 *     uint32_t {@link #fmaRate};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderCorePropertiesARM extends Struct<VkPhysicalDeviceShaderCorePropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIXELRATE,
        TEXELRATE,
        FMARATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIXELRATE = layout.offsetof(2);
        TEXELRATE = layout.offsetof(3);
        FMARATE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShaderCorePropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderCorePropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderCorePropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderCorePropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderCorePropertiesARM(ByteBuffer container) {
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
    /** an unsigned integer value indicating the maximum number of pixels output per clock per shader core. */
    @NativeType("uint32_t")
    public int pixelRate() { return npixelRate(address()); }
    /** an unsigned integer value indicating the maximum number of texels per clock per shader core. */
    @NativeType("uint32_t")
    public int texelRate() { return ntexelRate(address()); }
    /** an unsigned integer value indicating the maximum number of single-precision fused multiply-add operations per clock per shader core. */
    @NativeType("uint32_t")
    public int fmaRate() { return nfmaRate(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderCorePropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMShaderCoreProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderCorePropertiesARM sType$Default() { return sType(ARMShaderCoreProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderCorePropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderCorePropertiesARM set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderCorePropertiesARM set(VkPhysicalDeviceShaderCorePropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderCorePropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderCorePropertiesARM malloc() {
        return new VkPhysicalDeviceShaderCorePropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCorePropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderCorePropertiesARM calloc() {
        return new VkPhysicalDeviceShaderCorePropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCorePropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderCorePropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderCorePropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCorePropertiesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderCorePropertiesARM create(long address) {
        return new VkPhysicalDeviceShaderCorePropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderCorePropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderCorePropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCorePropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCorePropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCorePropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderCorePropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderCorePropertiesARM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderCorePropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderCorePropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCorePropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderCorePropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderCorePropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCorePropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCorePropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCorePropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCorePropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderCorePropertiesARM.PNEXT); }
    /** Unsafe version of {@link #pixelRate}. */
    public static int npixelRate(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCorePropertiesARM.PIXELRATE); }
    /** Unsafe version of {@link #texelRate}. */
    public static int ntexelRate(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCorePropertiesARM.TEXELRATE); }
    /** Unsafe version of {@link #fmaRate}. */
    public static int nfmaRate(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCorePropertiesARM.FMARATE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderCorePropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderCorePropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderCorePropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderCorePropertiesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderCorePropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceShaderCorePropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderCorePropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderCorePropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderCorePropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderCorePropertiesARM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderCorePropertiesARM.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderCorePropertiesARM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderCorePropertiesARM.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderCorePropertiesARM#pixelRate} field. */
        @NativeType("uint32_t")
        public int pixelRate() { return VkPhysicalDeviceShaderCorePropertiesARM.npixelRate(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderCorePropertiesARM#texelRate} field. */
        @NativeType("uint32_t")
        public int texelRate() { return VkPhysicalDeviceShaderCorePropertiesARM.ntexelRate(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderCorePropertiesARM#fmaRate} field. */
        @NativeType("uint32_t")
        public int fmaRate() { return VkPhysicalDeviceShaderCorePropertiesARM.nfmaRate(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderCorePropertiesARM#sType} field. */
        public VkPhysicalDeviceShaderCorePropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderCorePropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMShaderCoreProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM} value to the {@link VkPhysicalDeviceShaderCorePropertiesARM#sType} field. */
        public VkPhysicalDeviceShaderCorePropertiesARM.Buffer sType$Default() { return sType(ARMShaderCoreProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderCorePropertiesARM#pNext} field. */
        public VkPhysicalDeviceShaderCorePropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderCorePropertiesARM.npNext(address(), value); return this; }

    }

}