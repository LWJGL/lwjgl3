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
 * Structure describing cooperative matrix properties supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVCooperativeMatrix#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceCooperativeMatrixPropertiesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkShaderStageFlags {@link #cooperativeMatrixSupportedStages};
 * }</code></pre>
 */
public class VkPhysicalDeviceCooperativeMatrixPropertiesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COOPERATIVEMATRIXSUPPORTEDSTAGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEMATRIXSUPPORTEDSTAGES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeMatrixPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitfield of {@code VkShaderStageFlagBits} describing the shader stages that cooperative matrix instructions are supported in. {@code cooperativeMatrixSupportedStages} will have the {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT} bit set if any of the physical device’s queues support {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. */
    @NativeType("VkShaderStageFlags")
    public int cooperativeMatrixSupportedStages() { return ncooperativeMatrixSupportedStages(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCooperativeMatrix#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV sType$Default() { return sType(NVCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV set(
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
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV set(VkPhysicalDeviceCooperativeMatrixPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV malloc() {
        return wrap(VkPhysicalDeviceCooperativeMatrixPropertiesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV calloc() {
        return wrap(VkPhysicalDeviceCooperativeMatrixPropertiesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceCooperativeMatrixPropertiesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV create(long address) {
        return wrap(VkPhysicalDeviceCooperativeMatrixPropertiesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceCooperativeMatrixPropertiesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixPropertiesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixPropertiesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixPropertiesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixPropertiesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceCooperativeMatrixPropertiesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceCooperativeMatrixPropertiesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCooperativeMatrixPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeMatrixPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #cooperativeMatrixSupportedStages}. */
    public static int ncooperativeMatrixSupportedStages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCooperativeMatrixPropertiesNV.COOPERATIVEMATRIXSUPPORTEDSTAGES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCooperativeMatrixPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeMatrixPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrixPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCooperativeMatrixPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrixPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceCooperativeMatrixPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeMatrixPropertiesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCooperativeMatrixPropertiesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV#cooperativeMatrixSupportedStages} field. */
        @NativeType("VkShaderStageFlags")
        public int cooperativeMatrixSupportedStages() { return VkPhysicalDeviceCooperativeMatrixPropertiesNV.ncooperativeMatrixSupportedStages(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV#sType} field. */
        public VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCooperativeMatrix#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV} value to the {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV#sType} field. */
        public VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer sType$Default() { return sType(NVCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV#pNext} field. */
        public VkPhysicalDeviceCooperativeMatrixPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCooperativeMatrixPropertiesNV.npNext(address(), value); return this; }

    }

}