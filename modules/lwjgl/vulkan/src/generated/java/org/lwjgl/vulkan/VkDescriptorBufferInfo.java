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
 * Structure specifying descriptor buffer information.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When setting {@code range} to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, the effective range <b>must</b> not be larger than the maximum range for the descriptor type (<a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxUniformBufferRange">{@code maxUniformBufferRange}</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxStorageBufferRange">{@code maxStorageBufferRange}</a>). This means that {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE} is not typically useful in the common case where uniform buffer descriptors are suballocated from a buffer that is much larger than {@code maxUniformBufferRange}.</p>
 * </div>
 * 
 * <p>For {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} and {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} descriptor types, {@code offset} is the base offset from which the dynamic offset is applied and {@code range} is the static size used for all dynamic offsets.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
 * <li>If {@code range} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code range} <b>must</b> be greater than 0</li>
 * <li>If {@code range} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code range} <b>must</b> be less than or equal to the size of {@code buffer} minus {@code offset}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">nullDescriptor</a> feature is not enabled, {@code buffer} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code buffer} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code offset} <b>must</b> be zero and {@code range} <b>must</b> be {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkWriteDescriptorSet}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorBufferInfo {
 *     VkBuffer {@link #buffer};
 *     VkDeviceSize {@link #offset};
 *     VkDeviceSize {@link #range};
 * }</code></pre>
 */
public class VkDescriptorBufferInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFER,
        OFFSET,
        RANGE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFER = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        RANGE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDescriptorBufferInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorBufferInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or the buffer resource. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** the offset in bytes from the start of {@code buffer}. Access to buffer memory via this descriptor uses addressing that is relative to this starting offset. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** the size in bytes that is used for this descriptor update, or {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE} to use the range from {@code offset} to the end of the buffer. */
    @NativeType("VkDeviceSize")
    public long range() { return nrange(address()); }

    /** Sets the specified value to the {@link #buffer} field. */
    public VkDescriptorBufferInfo buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public VkDescriptorBufferInfo offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@link #range} field. */
    public VkDescriptorBufferInfo range(@NativeType("VkDeviceSize") long value) { nrange(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorBufferInfo set(
        long buffer,
        long offset,
        long range
    ) {
        buffer(buffer);
        offset(offset);
        range(range);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorBufferInfo set(VkDescriptorBufferInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorBufferInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorBufferInfo malloc() {
        return wrap(VkDescriptorBufferInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorBufferInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorBufferInfo calloc() {
        return wrap(VkDescriptorBufferInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorBufferInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorBufferInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorBufferInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorBufferInfo} instance for the specified memory address. */
    public static VkDescriptorBufferInfo create(long address) {
        return wrap(VkDescriptorBufferInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorBufferInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorBufferInfo.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorBufferInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorBufferInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorBufferInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorBufferInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorBufferInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorBufferInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorBufferInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorBufferInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorBufferInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorBufferInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorBufferInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorBufferInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorBufferInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorBufferInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorBufferInfo malloc(MemoryStack stack) {
        return wrap(VkDescriptorBufferInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorBufferInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorBufferInfo calloc(MemoryStack stack) {
        return wrap(VkDescriptorBufferInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorBufferInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorBufferInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkDescriptorBufferInfo.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VkDescriptorBufferInfo.OFFSET); }
    /** Unsafe version of {@link #range}. */
    public static long nrange(long struct) { return UNSAFE.getLong(null, struct + VkDescriptorBufferInfo.RANGE); }

    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkDescriptorBufferInfo.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { UNSAFE.putLong(null, struct + VkDescriptorBufferInfo.OFFSET, value); }
    /** Unsafe version of {@link #range(long) range}. */
    public static void nrange(long struct, long value) { UNSAFE.putLong(null, struct + VkDescriptorBufferInfo.RANGE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorBufferInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorBufferInfo, Buffer> implements NativeResource {

        private static final VkDescriptorBufferInfo ELEMENT_FACTORY = VkDescriptorBufferInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorBufferInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorBufferInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorBufferInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorBufferInfo#buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkDescriptorBufferInfo.nbuffer(address()); }
        /** @return the value of the {@link VkDescriptorBufferInfo#offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkDescriptorBufferInfo.noffset(address()); }
        /** @return the value of the {@link VkDescriptorBufferInfo#range} field. */
        @NativeType("VkDeviceSize")
        public long range() { return VkDescriptorBufferInfo.nrange(address()); }

        /** Sets the specified value to the {@link VkDescriptorBufferInfo#buffer} field. */
        public VkDescriptorBufferInfo.Buffer buffer(@NativeType("VkBuffer") long value) { VkDescriptorBufferInfo.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorBufferInfo#offset} field. */
        public VkDescriptorBufferInfo.Buffer offset(@NativeType("VkDeviceSize") long value) { VkDescriptorBufferInfo.noffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorBufferInfo#range} field. */
        public VkDescriptorBufferInfo.Buffer range(@NativeType("VkDeviceSize") long value) { VkDescriptorBufferInfo.nrange(address(), value); return this; }

    }

}