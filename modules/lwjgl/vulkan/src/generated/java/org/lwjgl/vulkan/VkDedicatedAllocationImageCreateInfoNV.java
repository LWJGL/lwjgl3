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
 * Specify that an image is bound to a dedicated memory resource.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Using a dedicated allocation for color and depth/stencil attachments or other large images <b>may</b> improve performance on some devices.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code dedicatedAllocation} is {@link VK10#VK_TRUE TRUE}, {@link VkImageCreateInfo}{@code ::flags} <b>must</b> not include {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, or {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDedicatedAllocationImageCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #dedicatedAllocation};
 * }</code></pre>
 */
public class VkDedicatedAllocationImageCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEDICATEDALLOCATION;

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
        DEDICATEDALLOCATION = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDedicatedAllocationImageCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDedicatedAllocationImageCreateInfoNV(ByteBuffer container) {
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
    /** specifies whether the image will have a dedicated allocation bound to it. */
    @NativeType("VkBool32")
    public boolean dedicatedAllocation() { return ndedicatedAllocation(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDedicatedAllocationImageCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkDedicatedAllocationImageCreateInfoNV sType$Default() { return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDedicatedAllocationImageCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #dedicatedAllocation} field. */
    public VkDedicatedAllocationImageCreateInfoNV dedicatedAllocation(@NativeType("VkBool32") boolean value) { ndedicatedAllocation(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkDedicatedAllocationImageCreateInfoNV set(
        int sType,
        long pNext,
        boolean dedicatedAllocation
    ) {
        sType(sType);
        pNext(pNext);
        dedicatedAllocation(dedicatedAllocation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDedicatedAllocationImageCreateInfoNV set(VkDedicatedAllocationImageCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDedicatedAllocationImageCreateInfoNV malloc() {
        return wrap(VkDedicatedAllocationImageCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDedicatedAllocationImageCreateInfoNV calloc() {
        return wrap(VkDedicatedAllocationImageCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkDedicatedAllocationImageCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDedicatedAllocationImageCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance for the specified memory address. */
    public static VkDedicatedAllocationImageCreateInfoNV create(long address) {
        return wrap(VkDedicatedAllocationImageCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDedicatedAllocationImageCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkDedicatedAllocationImageCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDedicatedAllocationImageCreateInfoNV malloc(MemoryStack stack) {
        return wrap(VkDedicatedAllocationImageCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDedicatedAllocationImageCreateInfoNV calloc(MemoryStack stack) {
        return wrap(VkDedicatedAllocationImageCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDedicatedAllocationImageCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDedicatedAllocationImageCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #dedicatedAllocation}. */
    public static int ndedicatedAllocation(long struct) { return UNSAFE.getInt(null, struct + VkDedicatedAllocationImageCreateInfoNV.DEDICATEDALLOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDedicatedAllocationImageCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDedicatedAllocationImageCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #dedicatedAllocation(boolean) dedicatedAllocation}. */
    public static void ndedicatedAllocation(long struct, int value) { UNSAFE.putInt(null, struct + VkDedicatedAllocationImageCreateInfoNV.DEDICATEDALLOCATION, value); }

    // -----------------------------------

    /** An array of {@link VkDedicatedAllocationImageCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkDedicatedAllocationImageCreateInfoNV, Buffer> implements NativeResource {

        private static final VkDedicatedAllocationImageCreateInfoNV ELEMENT_FACTORY = VkDedicatedAllocationImageCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkDedicatedAllocationImageCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDedicatedAllocationImageCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkDedicatedAllocationImageCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDedicatedAllocationImageCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDedicatedAllocationImageCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkDedicatedAllocationImageCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDedicatedAllocationImageCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkDedicatedAllocationImageCreateInfoNV#dedicatedAllocation} field. */
        @NativeType("VkBool32")
        public boolean dedicatedAllocation() { return VkDedicatedAllocationImageCreateInfoNV.ndedicatedAllocation(address()) != 0; }

        /** Sets the specified value to the {@link VkDedicatedAllocationImageCreateInfoNV#sType} field. */
        public VkDedicatedAllocationImageCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkDedicatedAllocationImageCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV} value to the {@link VkDedicatedAllocationImageCreateInfoNV#sType} field. */
        public VkDedicatedAllocationImageCreateInfoNV.Buffer sType$Default() { return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkDedicatedAllocationImageCreateInfoNV#pNext} field. */
        public VkDedicatedAllocationImageCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkDedicatedAllocationImageCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDedicatedAllocationImageCreateInfoNV#dedicatedAllocation} field. */
        public VkDedicatedAllocationImageCreateInfoNV.Buffer dedicatedAllocation(@NativeType("VkBool32") boolean value) { VkDedicatedAllocationImageCreateInfoNV.ndedicatedAllocation(address(), value ? 1 : 0); return this; }

    }

}