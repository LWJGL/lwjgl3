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
 * Specify memory overallocation behavior for a Vulkan device.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDMemoryOverallocationBehavior#VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD}</li>
 * <li>{@code overallocationBehavior} <b>must</b> be a valid {@code VkMemoryOverallocationBehaviorAMD} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceMemoryOverallocationCreateInfoAMD {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkMemoryOverallocationBehaviorAMD {@link #overallocationBehavior};
 * }</code></pre>
 */
public class VkDeviceMemoryOverallocationCreateInfoAMD extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OVERALLOCATIONBEHAVIOR;

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
        OVERALLOCATIONBEHAVIOR = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDeviceMemoryOverallocationCreateInfoAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceMemoryOverallocationCreateInfoAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the desired overallocation behavior. */
    @NativeType("VkMemoryOverallocationBehaviorAMD")
    public int overallocationBehavior() { return noverallocationBehavior(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceMemoryOverallocationCreateInfoAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDMemoryOverallocationBehavior#VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD} value to the {@link #sType} field. */
    public VkDeviceMemoryOverallocationCreateInfoAMD sType$Default() { return sType(AMDMemoryOverallocationBehavior.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceMemoryOverallocationCreateInfoAMD pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #overallocationBehavior} field. */
    public VkDeviceMemoryOverallocationCreateInfoAMD overallocationBehavior(@NativeType("VkMemoryOverallocationBehaviorAMD") int value) { noverallocationBehavior(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceMemoryOverallocationCreateInfoAMD set(
        int sType,
        long pNext,
        int overallocationBehavior
    ) {
        sType(sType);
        pNext(pNext);
        overallocationBehavior(overallocationBehavior);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceMemoryOverallocationCreateInfoAMD set(VkDeviceMemoryOverallocationCreateInfoAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceMemoryOverallocationCreateInfoAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryOverallocationCreateInfoAMD malloc() {
        return wrap(VkDeviceMemoryOverallocationCreateInfoAMD.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceMemoryOverallocationCreateInfoAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryOverallocationCreateInfoAMD calloc() {
        return wrap(VkDeviceMemoryOverallocationCreateInfoAMD.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceMemoryOverallocationCreateInfoAMD} instance allocated with {@link BufferUtils}. */
    public static VkDeviceMemoryOverallocationCreateInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceMemoryOverallocationCreateInfoAMD.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceMemoryOverallocationCreateInfoAMD} instance for the specified memory address. */
    public static VkDeviceMemoryOverallocationCreateInfoAMD create(long address) {
        return wrap(VkDeviceMemoryOverallocationCreateInfoAMD.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceMemoryOverallocationCreateInfoAMD createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceMemoryOverallocationCreateInfoAMD.class, address);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOverallocationCreateInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOverallocationCreateInfoAMD.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOverallocationCreateInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOverallocationCreateInfoAMD.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOverallocationCreateInfoAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOverallocationCreateInfoAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceMemoryOverallocationCreateInfoAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOverallocationCreateInfoAMD.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceMemoryOverallocationCreateInfoAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceMemoryOverallocationCreateInfoAMD mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceMemoryOverallocationCreateInfoAMD callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceMemoryOverallocationCreateInfoAMD mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceMemoryOverallocationCreateInfoAMD callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceMemoryOverallocationCreateInfoAMD.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceMemoryOverallocationCreateInfoAMD.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceMemoryOverallocationCreateInfoAMD.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceMemoryOverallocationCreateInfoAMD.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceMemoryOverallocationCreateInfoAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryOverallocationCreateInfoAMD malloc(MemoryStack stack) {
        return wrap(VkDeviceMemoryOverallocationCreateInfoAMD.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceMemoryOverallocationCreateInfoAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryOverallocationCreateInfoAMD calloc(MemoryStack stack) {
        return wrap(VkDeviceMemoryOverallocationCreateInfoAMD.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceMemoryOverallocationCreateInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOverallocationCreateInfoAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOverallocationCreateInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOverallocationCreateInfoAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceMemoryOverallocationCreateInfoAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceMemoryOverallocationCreateInfoAMD.PNEXT); }
    /** Unsafe version of {@link #overallocationBehavior}. */
    public static int noverallocationBehavior(long struct) { return UNSAFE.getInt(null, struct + VkDeviceMemoryOverallocationCreateInfoAMD.OVERALLOCATIONBEHAVIOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceMemoryOverallocationCreateInfoAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceMemoryOverallocationCreateInfoAMD.PNEXT, value); }
    /** Unsafe version of {@link #overallocationBehavior(int) overallocationBehavior}. */
    public static void noverallocationBehavior(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceMemoryOverallocationCreateInfoAMD.OVERALLOCATIONBEHAVIOR, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceMemoryOverallocationCreateInfoAMD} structs. */
    public static class Buffer extends StructBuffer<VkDeviceMemoryOverallocationCreateInfoAMD, Buffer> implements NativeResource {

        private static final VkDeviceMemoryOverallocationCreateInfoAMD ELEMENT_FACTORY = VkDeviceMemoryOverallocationCreateInfoAMD.create(-1L);

        /**
         * Creates a new {@code VkDeviceMemoryOverallocationCreateInfoAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceMemoryOverallocationCreateInfoAMD#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceMemoryOverallocationCreateInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceMemoryOverallocationCreateInfoAMD#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceMemoryOverallocationCreateInfoAMD.nsType(address()); }
        /** @return the value of the {@link VkDeviceMemoryOverallocationCreateInfoAMD#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceMemoryOverallocationCreateInfoAMD.npNext(address()); }
        /** @return the value of the {@link VkDeviceMemoryOverallocationCreateInfoAMD#overallocationBehavior} field. */
        @NativeType("VkMemoryOverallocationBehaviorAMD")
        public int overallocationBehavior() { return VkDeviceMemoryOverallocationCreateInfoAMD.noverallocationBehavior(address()); }

        /** Sets the specified value to the {@link VkDeviceMemoryOverallocationCreateInfoAMD#sType} field. */
        public VkDeviceMemoryOverallocationCreateInfoAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceMemoryOverallocationCreateInfoAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDMemoryOverallocationBehavior#VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD} value to the {@link VkDeviceMemoryOverallocationCreateInfoAMD#sType} field. */
        public VkDeviceMemoryOverallocationCreateInfoAMD.Buffer sType$Default() { return sType(AMDMemoryOverallocationBehavior.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD); }
        /** Sets the specified value to the {@link VkDeviceMemoryOverallocationCreateInfoAMD#pNext} field. */
        public VkDeviceMemoryOverallocationCreateInfoAMD.Buffer pNext(@NativeType("void const *") long value) { VkDeviceMemoryOverallocationCreateInfoAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceMemoryOverallocationCreateInfoAMD#overallocationBehavior} field. */
        public VkDeviceMemoryOverallocationCreateInfoAMD.Buffer overallocationBehavior(@NativeType("VkMemoryOverallocationBehaviorAMD") int value) { VkDeviceMemoryOverallocationCreateInfoAMD.noverallocationBehavior(address(), value); return this; }

    }

}