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
 * (None).
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSparseImageMemoryRequirements}, {@link VK13#vkGetDeviceImageSparseMemoryRequirements GetDeviceImageSparseMemoryRequirements}, {@link KHRMaintenance4#vkGetDeviceImageSparseMemoryRequirementsKHR GetDeviceImageSparseMemoryRequirementsKHR}, {@link VK11#vkGetImageSparseMemoryRequirements2 GetImageSparseMemoryRequirements2}, {@link KHRGetMemoryRequirements2#vkGetImageSparseMemoryRequirements2KHR GetImageSparseMemoryRequirements2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSparseImageMemoryRequirements2 {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkSparseImageMemoryRequirements VkSparseImageMemoryRequirements} {@link #memoryRequirements};
 * }</code></pre>
 */
public class VkSparseImageMemoryRequirements2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYREQUIREMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkSparseImageMemoryRequirements.SIZEOF, VkSparseImageMemoryRequirements.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYREQUIREMENTS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSparseImageMemoryRequirements2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSparseImageMemoryRequirements2(ByteBuffer container) {
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
    /** a {@link VkSparseImageMemoryRequirements} structure describing the memory requirements of the sparse image. */
    public VkSparseImageMemoryRequirements memoryRequirements() { return nmemoryRequirements(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSparseImageMemoryRequirements2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2} value to the {@link #sType} field. */
    public VkSparseImageMemoryRequirements2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSparseImageMemoryRequirements2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSparseImageMemoryRequirements2 set(
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
    public VkSparseImageMemoryRequirements2 set(VkSparseImageMemoryRequirements2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSparseImageMemoryRequirements2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseImageMemoryRequirements2 malloc() {
        return wrap(VkSparseImageMemoryRequirements2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseImageMemoryRequirements2 calloc() {
        return wrap(VkSparseImageMemoryRequirements2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements2} instance allocated with {@link BufferUtils}. */
    public static VkSparseImageMemoryRequirements2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSparseImageMemoryRequirements2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements2} instance for the specified memory address. */
    public static VkSparseImageMemoryRequirements2 create(long address) {
        return wrap(VkSparseImageMemoryRequirements2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSparseImageMemoryRequirements2 createSafe(long address) {
        return address == NULL ? null : wrap(VkSparseImageMemoryRequirements2.class, address);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSparseImageMemoryRequirements2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSparseImageMemoryRequirements2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSparseImageMemoryRequirements2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageMemoryRequirements2 malloc(MemoryStack stack) {
        return wrap(VkSparseImageMemoryRequirements2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSparseImageMemoryRequirements2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageMemoryRequirements2 calloc(MemoryStack stack) {
        return wrap(VkSparseImageMemoryRequirements2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSparseImageMemoryRequirements2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSparseImageMemoryRequirements2.PNEXT); }
    /** Unsafe version of {@link #memoryRequirements}. */
    public static VkSparseImageMemoryRequirements nmemoryRequirements(long struct) { return VkSparseImageMemoryRequirements.create(struct + VkSparseImageMemoryRequirements2.MEMORYREQUIREMENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSparseImageMemoryRequirements2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSparseImageMemoryRequirements2.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSparseImageMemoryRequirements2} structs. */
    public static class Buffer extends StructBuffer<VkSparseImageMemoryRequirements2, Buffer> implements NativeResource {

        private static final VkSparseImageMemoryRequirements2 ELEMENT_FACTORY = VkSparseImageMemoryRequirements2.create(-1L);

        /**
         * Creates a new {@code VkSparseImageMemoryRequirements2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseImageMemoryRequirements2#SIZEOF}, and its mark will be undefined.
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
        protected VkSparseImageMemoryRequirements2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSparseImageMemoryRequirements2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSparseImageMemoryRequirements2.nsType(address()); }
        /** @return the value of the {@link VkSparseImageMemoryRequirements2#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSparseImageMemoryRequirements2.npNext(address()); }
        /** @return a {@link VkSparseImageMemoryRequirements} view of the {@link VkSparseImageMemoryRequirements2#memoryRequirements} field. */
        public VkSparseImageMemoryRequirements memoryRequirements() { return VkSparseImageMemoryRequirements2.nmemoryRequirements(address()); }

        /** Sets the specified value to the {@link VkSparseImageMemoryRequirements2#sType} field. */
        public VkSparseImageMemoryRequirements2.Buffer sType(@NativeType("VkStructureType") int value) { VkSparseImageMemoryRequirements2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2} value to the {@link VkSparseImageMemoryRequirements2#sType} field. */
        public VkSparseImageMemoryRequirements2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2); }
        /** Sets the specified value to the {@link VkSparseImageMemoryRequirements2#pNext} field. */
        public VkSparseImageMemoryRequirements2.Buffer pNext(@NativeType("void *") long value) { VkSparseImageMemoryRequirements2.npNext(address(), value); return this; }

    }

}