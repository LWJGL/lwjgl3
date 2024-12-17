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
 * <pre>{@code
 * struct VkDescriptorUpdateTemplateEntry {
 *     uint32_t dstBinding;
 *     uint32_t dstArrayElement;
 *     uint32_t descriptorCount;
 *     VkDescriptorType descriptorType;
 *     size_t offset;
 *     size_t stride;
 * }}</pre>
 */
public class VkDescriptorUpdateTemplateEntry extends Struct<VkDescriptorUpdateTemplateEntry> implements NativeResource {

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

    protected VkDescriptorUpdateTemplateEntry(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorUpdateTemplateEntry create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorUpdateTemplateEntry(address, container);
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

    /** @return the value of the {@code dstBinding} field. */
    @NativeType("uint32_t")
    public int dstBinding() { return ndstBinding(address()); }
    /** @return the value of the {@code dstArrayElement} field. */
    @NativeType("uint32_t")
    public int dstArrayElement() { return ndstArrayElement(address()); }
    /** @return the value of the {@code descriptorCount} field. */
    @NativeType("uint32_t")
    public int descriptorCount() { return ndescriptorCount(address()); }
    /** @return the value of the {@code descriptorType} field. */
    @NativeType("VkDescriptorType")
    public int descriptorType() { return ndescriptorType(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("size_t")
    public long offset() { return noffset(address()); }
    /** @return the value of the {@code stride} field. */
    @NativeType("size_t")
    public long stride() { return nstride(address()); }

    /** Sets the specified value to the {@code dstBinding} field. */
    public VkDescriptorUpdateTemplateEntry dstBinding(@NativeType("uint32_t") int value) { ndstBinding(address(), value); return this; }
    /** Sets the specified value to the {@code dstArrayElement} field. */
    public VkDescriptorUpdateTemplateEntry dstArrayElement(@NativeType("uint32_t") int value) { ndstArrayElement(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorCount} field. */
    public VkDescriptorUpdateTemplateEntry descriptorCount(@NativeType("uint32_t") int value) { ndescriptorCount(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorType} field. */
    public VkDescriptorUpdateTemplateEntry descriptorType(@NativeType("VkDescriptorType") int value) { ndescriptorType(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkDescriptorUpdateTemplateEntry offset(@NativeType("size_t") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
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
        return new VkDescriptorUpdateTemplateEntry(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorUpdateTemplateEntry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateEntry calloc() {
        return new VkDescriptorUpdateTemplateEntry(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorUpdateTemplateEntry} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorUpdateTemplateEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorUpdateTemplateEntry(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorUpdateTemplateEntry} instance for the specified memory address. */
    public static VkDescriptorUpdateTemplateEntry create(long address) {
        return new VkDescriptorUpdateTemplateEntry(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorUpdateTemplateEntry createSafe(long address) {
        return address == NULL ? null : new VkDescriptorUpdateTemplateEntry(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorUpdateTemplateEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorUpdateTemplateEntry.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
        return new VkDescriptorUpdateTemplateEntry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorUpdateTemplateEntry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateEntry calloc(MemoryStack stack) {
        return new VkDescriptorUpdateTemplateEntry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateEntry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateEntry.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dstBinding}. */
    public static int ndstBinding(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateEntry.DSTBINDING); }
    /** Unsafe version of {@link #dstArrayElement}. */
    public static int ndstArrayElement(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateEntry.DSTARRAYELEMENT); }
    /** Unsafe version of {@link #descriptorCount}. */
    public static int ndescriptorCount(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateEntry.DESCRIPTORCOUNT); }
    /** Unsafe version of {@link #descriptorType}. */
    public static int ndescriptorType(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateEntry.DESCRIPTORTYPE); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetAddress(struct + VkDescriptorUpdateTemplateEntry.OFFSET); }
    /** Unsafe version of {@link #stride}. */
    public static long nstride(long struct) { return memGetAddress(struct + VkDescriptorUpdateTemplateEntry.STRIDE); }

    /** Unsafe version of {@link #dstBinding(int) dstBinding}. */
    public static void ndstBinding(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateEntry.DSTBINDING, value); }
    /** Unsafe version of {@link #dstArrayElement(int) dstArrayElement}. */
    public static void ndstArrayElement(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateEntry.DSTARRAYELEMENT, value); }
    /** Unsafe version of {@link #descriptorCount(int) descriptorCount}. */
    public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateEntry.DESCRIPTORCOUNT, value); }
    /** Unsafe version of {@link #descriptorType(int) descriptorType}. */
    public static void ndescriptorType(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateEntry.DESCRIPTORTYPE, value); }
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
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorUpdateTemplateEntry#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorUpdateTemplateEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code dstBinding} field. */
        @NativeType("uint32_t")
        public int dstBinding() { return VkDescriptorUpdateTemplateEntry.ndstBinding(address()); }
        /** @return the value of the {@code dstArrayElement} field. */
        @NativeType("uint32_t")
        public int dstArrayElement() { return VkDescriptorUpdateTemplateEntry.ndstArrayElement(address()); }
        /** @return the value of the {@code descriptorCount} field. */
        @NativeType("uint32_t")
        public int descriptorCount() { return VkDescriptorUpdateTemplateEntry.ndescriptorCount(address()); }
        /** @return the value of the {@code descriptorType} field. */
        @NativeType("VkDescriptorType")
        public int descriptorType() { return VkDescriptorUpdateTemplateEntry.ndescriptorType(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("size_t")
        public long offset() { return VkDescriptorUpdateTemplateEntry.noffset(address()); }
        /** @return the value of the {@code stride} field. */
        @NativeType("size_t")
        public long stride() { return VkDescriptorUpdateTemplateEntry.nstride(address()); }

        /** Sets the specified value to the {@code dstBinding} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer dstBinding(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.ndstBinding(address(), value); return this; }
        /** Sets the specified value to the {@code dstArrayElement} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer dstArrayElement(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.ndstArrayElement(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorCount} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer descriptorCount(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.ndescriptorCount(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorType} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer descriptorType(@NativeType("VkDescriptorType") int value) { VkDescriptorUpdateTemplateEntry.ndescriptorType(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer offset(@NativeType("size_t") long value) { VkDescriptorUpdateTemplateEntry.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public VkDescriptorUpdateTemplateEntry.Buffer stride(@NativeType("size_t") long value) { VkDescriptorUpdateTemplateEntry.nstride(address(), value); return this; }

    }

}