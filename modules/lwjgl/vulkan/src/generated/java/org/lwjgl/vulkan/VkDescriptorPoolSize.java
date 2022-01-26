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
 * Structure specifying descriptor pool size.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When creating a descriptor pool that will contain descriptors for combined image samplers of multi-planar formats, an application needs to account for non-trivial descriptor consumption when choosing the {@code descriptorCount} value, as indicated by {@link VkSamplerYcbcrConversionImageFormatProperties}{@code ::combinedImageSamplerDescriptorCount}.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code descriptorCount} <b>must</b> be greater than 0</li>
 * <li>If {@code type} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then {@code descriptorCount} <b>must</b> be a multiple of 4</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be a valid {@code VkDescriptorType} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorPoolCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorPoolSize {
 *     VkDescriptorType {@link #type};
 *     uint32_t {@link #descriptorCount};
 * }</code></pre>
 */
public class VkDescriptorPoolSize extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        DESCRIPTORCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        DESCRIPTORCOUNT = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkDescriptorPoolSize} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorPoolSize(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of descriptor. */
    @NativeType("VkDescriptorType")
    public int type() { return ntype(address()); }
    /** the number of descriptors of that type to allocate. If {@code type} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then {@code descriptorCount} is the number of bytes to allocate for descriptors of this type. */
    @NativeType("uint32_t")
    public int descriptorCount() { return ndescriptorCount(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public VkDescriptorPoolSize type(@NativeType("VkDescriptorType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #descriptorCount} field. */
    public VkDescriptorPoolSize descriptorCount(@NativeType("uint32_t") int value) { ndescriptorCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorPoolSize set(
        int type,
        int descriptorCount
    ) {
        type(type);
        descriptorCount(descriptorCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorPoolSize set(VkDescriptorPoolSize src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorPoolSize} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolSize malloc() {
        return wrap(VkDescriptorPoolSize.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorPoolSize} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolSize calloc() {
        return wrap(VkDescriptorPoolSize.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorPoolSize} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorPoolSize create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorPoolSize.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorPoolSize} instance for the specified memory address. */
    public static VkDescriptorPoolSize create(long address) {
        return wrap(VkDescriptorPoolSize.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorPoolSize createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorPoolSize.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorPoolSize.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorPoolSize.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolSize mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolSize callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolSize mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolSize callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolSize.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolSize.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolSize.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolSize.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorPoolSize} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolSize malloc(MemoryStack stack) {
        return wrap(VkDescriptorPoolSize.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorPoolSize} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolSize calloc(MemoryStack stack) {
        return wrap(VkDescriptorPoolSize.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorPoolSize.TYPE); }
    /** Unsafe version of {@link #descriptorCount}. */
    public static int ndescriptorCount(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorPoolSize.DESCRIPTORCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorPoolSize.TYPE, value); }
    /** Unsafe version of {@link #descriptorCount(int) descriptorCount}. */
    public static void ndescriptorCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorPoolSize.DESCRIPTORCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorPoolSize} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorPoolSize, Buffer> implements NativeResource {

        private static final VkDescriptorPoolSize ELEMENT_FACTORY = VkDescriptorPoolSize.create(-1L);

        /**
         * Creates a new {@code VkDescriptorPoolSize.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorPoolSize#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorPoolSize getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorPoolSize#type} field. */
        @NativeType("VkDescriptorType")
        public int type() { return VkDescriptorPoolSize.ntype(address()); }
        /** @return the value of the {@link VkDescriptorPoolSize#descriptorCount} field. */
        @NativeType("uint32_t")
        public int descriptorCount() { return VkDescriptorPoolSize.ndescriptorCount(address()); }

        /** Sets the specified value to the {@link VkDescriptorPoolSize#type} field. */
        public VkDescriptorPoolSize.Buffer type(@NativeType("VkDescriptorType") int value) { VkDescriptorPoolSize.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorPoolSize#descriptorCount} field. */
        public VkDescriptorPoolSize.Buffer descriptorCount(@NativeType("uint32_t") int value) { VkDescriptorPoolSize.ndescriptorCount(address(), value); return this; }

    }

}