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
 * Structure specifying descriptor pool size.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When creating a descriptor pool that will contain descriptors for combined image samplers of multi-planar formats, an application needs to account for non-trivial descriptor consumption when choosing the {@code descriptorCount} value, as indicated by {@link VkSamplerYcbcrConversionImageFormatProperties}{@code ::combinedImageSamplerDescriptorCount}.</p>
 * 
 * <p>For simplicity the application <b>can</b> use the {@link VkPhysicalDeviceMaintenance6PropertiesKHR}{@code ::maxCombinedImageSamplerDescriptorCount} property, which is sized to accommodate any and all <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">formats that require a sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> supported by the implementation.</p>
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
public class VkDescriptorPoolSize extends Struct<VkDescriptorPoolSize> implements NativeResource {

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

    protected VkDescriptorPoolSize(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorPoolSize create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorPoolSize(address, container);
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
        return new VkDescriptorPoolSize(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorPoolSize} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolSize calloc() {
        return new VkDescriptorPoolSize(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorPoolSize} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorPoolSize create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorPoolSize(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorPoolSize} instance for the specified memory address. */
    public static VkDescriptorPoolSize create(long address) {
        return new VkDescriptorPoolSize(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorPoolSize createSafe(long address) {
        return address == NULL ? null : new VkDescriptorPoolSize(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorPoolSize.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorPoolSize.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
        return new VkDescriptorPoolSize(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorPoolSize} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolSize calloc(MemoryStack stack) {
        return new VkDescriptorPoolSize(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolSize.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkDescriptorPoolSize.TYPE); }
    /** Unsafe version of {@link #descriptorCount}. */
    public static int ndescriptorCount(long struct) { return memGetInt(struct + VkDescriptorPoolSize.DESCRIPTORCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkDescriptorPoolSize.TYPE, value); }
    /** Unsafe version of {@link #descriptorCount(int) descriptorCount}. */
    public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkDescriptorPoolSize.DESCRIPTORCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorPoolSize} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorPoolSize, Buffer> implements NativeResource {

        private static final VkDescriptorPoolSize ELEMENT_FACTORY = VkDescriptorPoolSize.create(-1L);

        /**
         * Creates a new {@code VkDescriptorPoolSize.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorPoolSize#SIZEOF}, and its mark will be undefined.</p>
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