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
 * Structure specifying subresource layout.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance5#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkImageCompressionPropertiesEXT} or {@link VkSubresourceHostMemcpySizeEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSubresourceLayout}, {@link KHRMaintenance5#vkGetDeviceImageSubresourceLayoutKHR GetDeviceImageSubresourceLayoutKHR}, {@link EXTHostImageCopy#vkGetImageSubresourceLayout2EXT GetImageSubresourceLayout2EXT}, {@link KHRMaintenance5#vkGetImageSubresourceLayout2KHR GetImageSubresourceLayout2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubresourceLayout2KHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkSubresourceLayout VkSubresourceLayout} {@link #subresourceLayout};
 * }</code></pre>
 */
public class VkSubresourceLayout2KHR extends Struct<VkSubresourceLayout2KHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBRESOURCELAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkSubresourceLayout.SIZEOF, VkSubresourceLayout.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUBRESOURCELAYOUT = layout.offsetof(2);
    }

    protected VkSubresourceLayout2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubresourceLayout2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkSubresourceLayout2KHR(address, container);
    }

    /**
     * Creates a {@code VkSubresourceLayout2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubresourceLayout2KHR(ByteBuffer container) {
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
    /** a {@link VkSubresourceLayout} structure. */
    public VkSubresourceLayout subresourceLayout() { return nsubresourceLayout(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubresourceLayout2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance5#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR} value to the {@link #sType} field. */
    public VkSubresourceLayout2KHR sType$Default() { return sType(KHRMaintenance5.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubresourceLayout2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkImageCompressionPropertiesEXT} value to the {@code pNext} chain. */
    public VkSubresourceLayout2KHR pNext(VkImageCompressionPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSubresourceHostMemcpySizeEXT} value to the {@code pNext} chain. */
    public VkSubresourceLayout2KHR pNext(VkSubresourceHostMemcpySizeEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkSubresourceLayout2KHR set(
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
    public VkSubresourceLayout2KHR set(VkSubresourceLayout2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubresourceLayout2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout2KHR malloc() {
        return new VkSubresourceLayout2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout2KHR calloc() {
        return new VkSubresourceLayout2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSubresourceLayout2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceLayout2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSubresourceLayout2KHR} instance for the specified memory address. */
    public static VkSubresourceLayout2KHR create(long address) {
        return new VkSubresourceLayout2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubresourceLayout2KHR createSafe(long address) {
        return address == NULL ? null : new VkSubresourceLayout2KHR(address, null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubresourceLayout2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubresourceLayout2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubresourceLayout2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout2KHR malloc(MemoryStack stack) {
        return new VkSubresourceLayout2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubresourceLayout2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout2KHR calloc(MemoryStack stack) {
        return new VkSubresourceLayout2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubresourceLayout2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubresourceLayout2KHR.PNEXT); }
    /** Unsafe version of {@link #subresourceLayout}. */
    public static VkSubresourceLayout nsubresourceLayout(long struct) { return VkSubresourceLayout.create(struct + VkSubresourceLayout2KHR.SUBRESOURCELAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubresourceLayout2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubresourceLayout2KHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSubresourceLayout2KHR} structs. */
    public static class Buffer extends StructBuffer<VkSubresourceLayout2KHR, Buffer> implements NativeResource {

        private static final VkSubresourceLayout2KHR ELEMENT_FACTORY = VkSubresourceLayout2KHR.create(-1L);

        /**
         * Creates a new {@code VkSubresourceLayout2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubresourceLayout2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubresourceLayout2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubresourceLayout2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubresourceLayout2KHR.nsType(address()); }
        /** @return the value of the {@link VkSubresourceLayout2KHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSubresourceLayout2KHR.npNext(address()); }
        /** @return a {@link VkSubresourceLayout} view of the {@link VkSubresourceLayout2KHR#subresourceLayout} field. */
        public VkSubresourceLayout subresourceLayout() { return VkSubresourceLayout2KHR.nsubresourceLayout(address()); }

        /** Sets the specified value to the {@link VkSubresourceLayout2KHR#sType} field. */
        public VkSubresourceLayout2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSubresourceLayout2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance5#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR} value to the {@link VkSubresourceLayout2KHR#sType} field. */
        public VkSubresourceLayout2KHR.Buffer sType$Default() { return sType(KHRMaintenance5.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR); }
        /** Sets the specified value to the {@link VkSubresourceLayout2KHR#pNext} field. */
        public VkSubresourceLayout2KHR.Buffer pNext(@NativeType("void *") long value) { VkSubresourceLayout2KHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkImageCompressionPropertiesEXT} value to the {@code pNext} chain. */
        public VkSubresourceLayout2KHR.Buffer pNext(VkImageCompressionPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSubresourceHostMemcpySizeEXT} value to the {@code pNext} chain. */
        public VkSubresourceLayout2KHR.Buffer pNext(VkSubresourceHostMemcpySizeEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}