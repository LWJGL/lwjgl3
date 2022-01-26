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
 * Describes a single descriptor update of the descriptor update template.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code dstBinding} <b>must</b> be a valid binding in the descriptor set layout implicitly specified when using a descriptor update template to update descriptors</li>
 * <li>{@code dstArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set binding implicitly specified when using a descriptor update template to update descriptors, and all applicable consecutive bindings, as described by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-updates-consecutive">consecutive binding updates</a></li>
 * <li>If {@code descriptor} type is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, {@code dstArrayElement} <b>must</b> be an integer multiple of 4</li>
 * <li>If {@code descriptor} type is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, {@code descriptorCount} <b>must</b> be an integer multiple of 4</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code descriptorType} <b>must</b> be a valid {@code VkDescriptorType} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorUpdateTemplateCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorUpdateTemplateEntry {
 *     uint32_t {@link #dstBinding};
 *     uint32_t {@link #dstArrayElement};
 *     uint32_t {@link #descriptorCount};
 *     VkDescriptorType {@link #descriptorType};
 *     size_t {@link #offset};
 *     size_t {@link #stride};
 * }</code></pre>
 */
public class VkDescriptorUpdateTemplateEntry extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DSTBINDING,
        DSTARRAYELEMENT,
        DESCRIPTORCOUNT,
        DESCRIPTORTYPE,
        OFFSET,
        STRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DSTBINDING = layout.offsetof(0);
        DSTARRAYELEMENT = layout.offsetof(1);
        DESCRIPTORCOUNT = layout.offsetof(2);
        DESCRIPTORTYPE = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        STRIDE = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkDescriptorUpdateTemplateEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorUpdateTemplateEntry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the descriptor binding to update when using this descriptor update template. */
    @NativeType("uint32_t")
    public int dstBinding() { return ndstBinding(address()); }
    /** the starting element in the array belonging to {@code dstBinding}. If the descriptor binding identified by {@code dstBinding} has a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then {@code dstArrayElement} specifies the starting byte offset to update. */
    @NativeType("uint32_t")
    public int dstArrayElement() { return ndstArrayElement(address()); }
    /** the number of descriptors to update. If {@code descriptorCount} is greater than the number of remaining array elements in the destination binding, those affect consecutive bindings in a manner similar to {@link VkWriteDescriptorSet} above. If the descriptor binding identified by {@code dstBinding} has a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then {@code descriptorCount} specifies the number of bytes to update and the remaining array elements in the destination binding refer to the remaining number of bytes in it. */
    @NativeType("uint32_t")
    public int descriptorCount() { return ndescriptorCount(address()); }
    /** a {@code VkDescriptorType} specifying the type of the descriptor. */
    @NativeType("VkDescriptorType")
    public int descriptorType() { return ndescriptorType(address()); }
    /** the offset in bytes of the first binding in the raw data structure. */
    @NativeType("size_t")
    public long offset() { return noffset(address()); }
    /**
     * the stride in bytes between two consecutive array elements of the descriptor update informations in the raw data structure. The actual pointer ptr for each array element j of update entry i is computed using the following formula:
     * 
     * <pre><code>
     *     const char *ptr = (const char *)pData + pDescriptorUpdateEntries[i].offset + j * pDescriptorUpdateEntries[i].stride</code></pre>
     * 
     * <p>The stride is useful in case the bindings are stored in structs along with other data. If {@code descriptorType} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then the value of {@code stride} is ignored and the stride is assumed to be 1, i.e. the descriptor update information for them is always specified as a contiguous range.</p>
     */
    @NativeType("size_t")
    public long stride() { return nstride(address()); }

    /** Sets the specified value to the {@link #dstBinding} field. */
    public VkDescriptorUpdateTemplateEntry dstBinding(@NativeType("uint32_t") int value) { ndstBinding(address(), value); return this; }
    /** Sets the specified value to the {@link #dstArrayElement} field. */
    public VkDescriptorUpdateTemplateEntry dstArrayElement(@NativeType("uint32_t") int value) { ndstArrayElement(address(), value); return this; }
    /** Sets the specified value to the {@link #descriptorCount} field. */
    public VkDescriptorUpdateTemplateEntry descriptorCount(@NativeType("uint32_t") int value) { ndescriptorCount(address(), value); return this; }
    /** Sets the specified value to the {@link #descriptorType} field. */
    public VkDescriptorUpdateTemplateEntry descriptorType(@NativeType("VkDescriptorType") int value) { ndescriptorType(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public VkDescriptorUpdateTemplateEntry offset(@NativeType("size_t") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@link #stride} field. */
    public VkDescriptorUpdateTemplateEntry stride(@NativeType("size_t") long value) { nstride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorUpdateTemplateEntry set(
        int dstBinding,
        int dstArrayElement,
        int descriptorCount,
        int descriptorType,
        long offset,
        long stride
    ) {
        dstBinding(dstBinding);
        dstArrayElement(dstArrayElement);
        descriptorCount(descriptorCount);
        descriptorType(descriptorType);
        offset(offset);
        stride(stride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorUpdateTemplateEntry set(VkDescriptorUpdateTemplateEntry src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorUpdateTemplateEntry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateEntry malloc() {
        return wrap(VkDescriptorUpdateTemplateEntry.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorUpdateTemplateEntry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateEntry calloc() {
        return wrap(VkDescriptorUpdateTemplateEntry.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorUpdateTemplateEntry} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorUpdateTemplateEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorUpdateTemplateEntry.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorUpdateTemplateEntry} instance for the specified memory address. */
    public static VkDescriptorUpdateTemplateEntry create(long address) {
        return wrap(VkDescriptorUpdateTemplateEntry.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorUpdateTemplateEntry createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorUpdateTemplateEntry.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorUpdateTemplateEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorUpdateTemplateEntry.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateEntry mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateEntry callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateEntry mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateEntry callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateEntry.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateEntry.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateEntry.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateEntry.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorUpdateTemplateEntry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateEntry malloc(MemoryStack stack) {
        return wrap(VkDescriptorUpdateTemplateEntry.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorUpdateTemplateEntry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateEntry calloc(MemoryStack stack) {
        return wrap(VkDescriptorUpdateTemplateEntry.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dstBinding}. */
    public static int ndstBinding(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorUpdateTemplateEntry.DSTBINDING); }
    /** Unsafe version of {@link #dstArrayElement}. */
    public static int ndstArrayElement(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorUpdateTemplateEntry.DSTARRAYELEMENT); }
    /** Unsafe version of {@link #descriptorCount}. */
    public static int ndescriptorCount(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorUpdateTemplateEntry.DESCRIPTORCOUNT); }
    /** Unsafe version of {@link #descriptorType}. */
    public static int ndescriptorType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorUpdateTemplateEntry.DESCRIPTORTYPE); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetAddress(struct + VkDescriptorUpdateTemplateEntry.OFFSET); }
    /** Unsafe version of {@link #stride}. */
    public static long nstride(long struct) { return memGetAddress(struct + VkDescriptorUpdateTemplateEntry.STRIDE); }

    /** Unsafe version of {@link #dstBinding(int) dstBinding}. */
    public static void ndstBinding(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorUpdateTemplateEntry.DSTBINDING, value); }
    /** Unsafe version of {@link #dstArrayElement(int) dstArrayElement}. */
    public static void ndstArrayElement(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorUpdateTemplateEntry.DSTARRAYELEMENT, value); }
    /** Unsafe version of {@link #descriptorCount(int) descriptorCount}. */
    public static void ndescriptorCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorUpdateTemplateEntry.DESCRIPTORCOUNT, value); }
    /** Unsafe version of {@link #descriptorType(int) descriptorType}. */
    public static void ndescriptorType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorUpdateTemplateEntry.DESCRIPTORTYPE, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutAddress(struct + VkDescriptorUpdateTemplateEntry.OFFSET, value); }
    /** Unsafe version of {@link #stride(long) stride}. */
    public static void nstride(long struct, long value) { memPutAddress(struct + VkDescriptorUpdateTemplateEntry.STRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorUpdateTemplateEntry} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorUpdateTemplateEntry, Buffer> implements NativeResource {

        private static final VkDescriptorUpdateTemplateEntry ELEMENT_FACTORY = VkDescriptorUpdateTemplateEntry.create(-1L);

        /**
         * Creates a new {@code VkDescriptorUpdateTemplateEntry.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorUpdateTemplateEntry#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorUpdateTemplateEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorUpdateTemplateEntry#dstBinding} field. */
        @NativeType("uint32_t")
        public int dstBinding() { return VkDescriptorUpdateTemplateEntry.ndstBinding(address()); }
        /** @return the value of the {@link VkDescriptorUpdateTemplateEntry#dstArrayElement} field. */
        @NativeType("uint32_t")
        public int dstArrayElement() { return VkDescriptorUpdateTemplateEntry.ndstArrayElement(address()); }
        /** @return the value of the {@link VkDescriptorUpdateTemplateEntry#descriptorCount} field. */
        @NativeType("uint32_t")
        public int descriptorCount() { return VkDescriptorUpdateTemplateEntry.ndescriptorCount(address()); }
        /** @return the value of the {@link VkDescriptorUpdateTemplateEntry#descriptorType} field. */
        @NativeType("VkDescriptorType")
        public int descriptorType() { return VkDescriptorUpdateTemplateEntry.ndescriptorType(address()); }
        /** @return the value of the {@link VkDescriptorUpdateTemplateEntry#offset} field. */
        @NativeType("size_t")
        public long offset() { return VkDescriptorUpdateTemplateEntry.noffset(address()); }
        /** @return the value of the {@link VkDescriptorUpdateTemplateEntry#stride} field. */
        @NativeType("size_t")
        public long stride() { return VkDescriptorUpdateTemplateEntry.nstride(address()); }

        /** Sets the specified value to the {@link VkDescriptorUpdateTemplateEntry#dstBinding} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer dstBinding(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.ndstBinding(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorUpdateTemplateEntry#dstArrayElement} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer dstArrayElement(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.ndstArrayElement(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorUpdateTemplateEntry#descriptorCount} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer descriptorCount(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.ndescriptorCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorUpdateTemplateEntry#descriptorType} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer descriptorType(@NativeType("VkDescriptorType") int value) { VkDescriptorUpdateTemplateEntry.ndescriptorType(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorUpdateTemplateEntry#offset} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer offset(@NativeType("size_t") long value) { VkDescriptorUpdateTemplateEntry.noffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorUpdateTemplateEntry#stride} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer stride(@NativeType("size_t") long value) { VkDescriptorUpdateTemplateEntry.nstride(address(), value); return this; }

    }

}