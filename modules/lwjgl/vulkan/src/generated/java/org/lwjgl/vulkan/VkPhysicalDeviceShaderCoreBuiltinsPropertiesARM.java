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
 * Structure describing shader core builtins properties supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ARMShaderCoreBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint64_t {@link #shaderCoreMask};
 *     uint32_t {@link #shaderCoreCount};
 *     uint32_t {@link #shaderWarpsPerCore};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM extends Struct<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERCOREMASK,
        SHADERCORECOUNT,
        SHADERWARPSPERCORE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERCOREMASK = layout.offsetof(2);
        SHADERCORECOUNT = layout.offsetof(3);
        SHADERWARPSPERCORE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(ByteBuffer container) {
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
    /** a bitfield where each bit set represents the presence of a shader core whose ID is the bit position. The highest ID for any shader core on the device is the position of the most significant bit set. */
    @NativeType("uint64_t")
    public long shaderCoreMask() { return nshaderCoreMask(address()); }
    /** the number of shader cores on the device. */
    @NativeType("uint32_t")
    public int shaderCoreCount() { return nshaderCoreCount(address()); }
    /** the maximum number of simultaneously executing warps on a shader core. */
    @NativeType("uint32_t")
    public int shaderWarpsPerCore() { return nshaderWarpsPerCore(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMShaderCoreBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM sType$Default() { return sType(ARMShaderCoreBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM set(
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
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM set(VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM malloc() {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM calloc() {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM create(long address) {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #shaderCoreMask}. */
    public static long nshaderCoreMask(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.SHADERCOREMASK); }
    /** Unsafe version of {@link #shaderCoreCount}. */
    public static int nshaderCoreCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.SHADERCORECOUNT); }
    /** Unsafe version of {@link #shaderWarpsPerCore}. */
    public static int nshaderWarpsPerCore(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.SHADERWARPSPERCORE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#shaderCoreMask} field. */
        @NativeType("uint64_t")
        public long shaderCoreMask() { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.nshaderCoreMask(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#shaderCoreCount} field. */
        @NativeType("uint32_t")
        public int shaderCoreCount() { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.nshaderCoreCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#shaderWarpsPerCore} field. */
        @NativeType("uint32_t")
        public int shaderWarpsPerCore() { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.nshaderWarpsPerCore(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#sType} field. */
        public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMShaderCoreBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM} value to the {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#sType} field. */
        public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer sType$Default() { return sType(ARMShaderCoreBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#pNext} field. */
        public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.npNext(address(), value); return this; }

    }

}