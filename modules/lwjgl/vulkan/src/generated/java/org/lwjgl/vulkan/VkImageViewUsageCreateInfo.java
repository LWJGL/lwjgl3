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
 * Specify the intended usage of an image view.
 * 
 * <h5>Description</h5>
 * 
 * <p>When this structure is chained to {@link VkImageViewCreateInfo} the {@code usage} field overrides the implicit {@code usage} parameter inherited from image creation time and its value is used instead for the purposes of determining the valid usage conditions of {@link VkImageViewCreateInfo}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO}</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageViewUsageCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImageUsageFlags {@link #usage};
 * }</code></pre>
 */
public class VkImageViewUsageCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        USAGE;

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
        USAGE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkImageViewUsageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewUsageCreateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkImageUsageFlagBits} specifying allowed usages of the image view. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageViewUsageCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO} value to the {@link #sType} field. */
    public VkImageViewUsageCreateInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageViewUsageCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #usage} field. */
    public VkImageViewUsageCreateInfo usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewUsageCreateInfo set(
        int sType,
        long pNext,
        int usage
    ) {
        sType(sType);
        pNext(pNext);
        usage(usage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageViewUsageCreateInfo set(VkImageViewUsageCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewUsageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewUsageCreateInfo malloc() {
        return wrap(VkImageViewUsageCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageViewUsageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewUsageCreateInfo calloc() {
        return wrap(VkImageViewUsageCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageViewUsageCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkImageViewUsageCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageViewUsageCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewUsageCreateInfo} instance for the specified memory address. */
    public static VkImageViewUsageCreateInfo create(long address) {
        return wrap(VkImageViewUsageCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewUsageCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkImageViewUsageCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkImageViewUsageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewUsageCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewUsageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewUsageCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewUsageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewUsageCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageViewUsageCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewUsageCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewUsageCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewUsageCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewUsageCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewUsageCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewUsageCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewUsageCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewUsageCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewUsageCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewUsageCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageViewUsageCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewUsageCreateInfo malloc(MemoryStack stack) {
        return wrap(VkImageViewUsageCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageViewUsageCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewUsageCreateInfo calloc(MemoryStack stack) {
        return wrap(VkImageViewUsageCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageViewUsageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewUsageCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewUsageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewUsageCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageViewUsageCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewUsageCreateInfo.PNEXT); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return UNSAFE.getInt(null, struct + VkImageViewUsageCreateInfo.USAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewUsageCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewUsageCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewUsageCreateInfo.USAGE, value); }

    // -----------------------------------

    /** An array of {@link VkImageViewUsageCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkImageViewUsageCreateInfo, Buffer> implements NativeResource {

        private static final VkImageViewUsageCreateInfo ELEMENT_FACTORY = VkImageViewUsageCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkImageViewUsageCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewUsageCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkImageViewUsageCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageViewUsageCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewUsageCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkImageViewUsageCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewUsageCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkImageViewUsageCreateInfo#usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkImageViewUsageCreateInfo.nusage(address()); }

        /** Sets the specified value to the {@link VkImageViewUsageCreateInfo#sType} field. */
        public VkImageViewUsageCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewUsageCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO} value to the {@link VkImageViewUsageCreateInfo#sType} field. */
        public VkImageViewUsageCreateInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkImageViewUsageCreateInfo#pNext} field. */
        public VkImageViewUsageCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkImageViewUsageCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageViewUsageCreateInfo#usage} field. */
        public VkImageViewUsageCreateInfo.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkImageViewUsageCreateInfo.nusage(address(), value); return this; }

    }

}