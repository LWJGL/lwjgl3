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
 * struct VkCopyDescriptorSet {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDescriptorSet srcSet;
 *     uint32_t srcBinding;
 *     uint32_t srcArrayElement;
 *     VkDescriptorSet dstSet;
 *     uint32_t dstBinding;
 *     uint32_t dstArrayElement;
 *     uint32_t descriptorCount;
 * }}</pre>
 */
public class VkCopyDescriptorSet extends Struct<VkCopyDescriptorSet> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSET,
        SRCBINDING,
        SRCARRAYELEMENT,
        DSTSET,
        DSTBINDING,
        DSTARRAYELEMENT,
        DESCRIPTORCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSET = layout.offsetof(2);
        SRCBINDING = layout.offsetof(3);
        SRCARRAYELEMENT = layout.offsetof(4);
        DSTSET = layout.offsetof(5);
        DSTBINDING = layout.offsetof(6);
        DSTARRAYELEMENT = layout.offsetof(7);
        DESCRIPTORCOUNT = layout.offsetof(8);
    }

    protected VkCopyDescriptorSet(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyDescriptorSet create(long address, @Nullable ByteBuffer container) {
        return new VkCopyDescriptorSet(address, container);
    }

    /**
     * Creates a {@code VkCopyDescriptorSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyDescriptorSet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code srcSet} field. */
    @NativeType("VkDescriptorSet")
    public long srcSet() { return nsrcSet(address()); }
    /** @return the value of the {@code srcBinding} field. */
    @NativeType("uint32_t")
    public int srcBinding() { return nsrcBinding(address()); }
    /** @return the value of the {@code srcArrayElement} field. */
    @NativeType("uint32_t")
    public int srcArrayElement() { return nsrcArrayElement(address()); }
    /** @return the value of the {@code dstSet} field. */
    @NativeType("VkDescriptorSet")
    public long dstSet() { return ndstSet(address()); }
    /** @return the value of the {@code dstBinding} field. */
    @NativeType("uint32_t")
    public int dstBinding() { return ndstBinding(address()); }
    /** @return the value of the {@code dstArrayElement} field. */
    @NativeType("uint32_t")
    public int dstArrayElement() { return ndstArrayElement(address()); }
    /** @return the value of the {@code descriptorCount} field. */
    @NativeType("uint32_t")
    public int descriptorCount() { return ndescriptorCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyDescriptorSet sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET STRUCTURE_TYPE_COPY_DESCRIPTOR_SET} value to the {@code sType} field. */
    public VkCopyDescriptorSet sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyDescriptorSet pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcSet} field. */
    public VkCopyDescriptorSet srcSet(@NativeType("VkDescriptorSet") long value) { nsrcSet(address(), value); return this; }
    /** Sets the specified value to the {@code srcBinding} field. */
    public VkCopyDescriptorSet srcBinding(@NativeType("uint32_t") int value) { nsrcBinding(address(), value); return this; }
    /** Sets the specified value to the {@code srcArrayElement} field. */
    public VkCopyDescriptorSet srcArrayElement(@NativeType("uint32_t") int value) { nsrcArrayElement(address(), value); return this; }
    /** Sets the specified value to the {@code dstSet} field. */
    public VkCopyDescriptorSet dstSet(@NativeType("VkDescriptorSet") long value) { ndstSet(address(), value); return this; }
    /** Sets the specified value to the {@code dstBinding} field. */
    public VkCopyDescriptorSet dstBinding(@NativeType("uint32_t") int value) { ndstBinding(address(), value); return this; }
    /** Sets the specified value to the {@code dstArrayElement} field. */
    public VkCopyDescriptorSet dstArrayElement(@NativeType("uint32_t") int value) { ndstArrayElement(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorCount} field. */
    public VkCopyDescriptorSet descriptorCount(@NativeType("uint32_t") int value) { ndescriptorCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyDescriptorSet set(
        int sType,
        long pNext,
        long srcSet,
        int srcBinding,
        int srcArrayElement,
        long dstSet,
        int dstBinding,
        int dstArrayElement,
        int descriptorCount
    ) {
        sType(sType);
        pNext(pNext);
        srcSet(srcSet);
        srcBinding(srcBinding);
        srcArrayElement(srcArrayElement);
        dstSet(dstSet);
        dstBinding(dstBinding);
        dstArrayElement(dstArrayElement);
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
    public VkCopyDescriptorSet set(VkCopyDescriptorSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyDescriptorSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyDescriptorSet malloc() {
        return new VkCopyDescriptorSet(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyDescriptorSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyDescriptorSet calloc() {
        return new VkCopyDescriptorSet(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyDescriptorSet} instance allocated with {@link BufferUtils}. */
    public static VkCopyDescriptorSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyDescriptorSet(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyDescriptorSet} instance for the specified memory address. */
    public static VkCopyDescriptorSet create(long address) {
        return new VkCopyDescriptorSet(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyDescriptorSet createSafe(long address) {
        return address == NULL ? null : new VkCopyDescriptorSet(address, null);
    }

    /**
     * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyDescriptorSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyDescriptorSet.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCopyDescriptorSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyDescriptorSet malloc(MemoryStack stack) {
        return new VkCopyDescriptorSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyDescriptorSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyDescriptorSet calloc(MemoryStack stack) {
        return new VkCopyDescriptorSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyDescriptorSet.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyDescriptorSet.PNEXT); }
    /** Unsafe version of {@link #srcSet}. */
    public static long nsrcSet(long struct) { return memGetLong(struct + VkCopyDescriptorSet.SRCSET); }
    /** Unsafe version of {@link #srcBinding}. */
    public static int nsrcBinding(long struct) { return memGetInt(struct + VkCopyDescriptorSet.SRCBINDING); }
    /** Unsafe version of {@link #srcArrayElement}. */
    public static int nsrcArrayElement(long struct) { return memGetInt(struct + VkCopyDescriptorSet.SRCARRAYELEMENT); }
    /** Unsafe version of {@link #dstSet}. */
    public static long ndstSet(long struct) { return memGetLong(struct + VkCopyDescriptorSet.DSTSET); }
    /** Unsafe version of {@link #dstBinding}. */
    public static int ndstBinding(long struct) { return memGetInt(struct + VkCopyDescriptorSet.DSTBINDING); }
    /** Unsafe version of {@link #dstArrayElement}. */
    public static int ndstArrayElement(long struct) { return memGetInt(struct + VkCopyDescriptorSet.DSTARRAYELEMENT); }
    /** Unsafe version of {@link #descriptorCount}. */
    public static int ndescriptorCount(long struct) { return memGetInt(struct + VkCopyDescriptorSet.DESCRIPTORCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyDescriptorSet.PNEXT, value); }
    /** Unsafe version of {@link #srcSet(long) srcSet}. */
    public static void nsrcSet(long struct, long value) { memPutLong(struct + VkCopyDescriptorSet.SRCSET, value); }
    /** Unsafe version of {@link #srcBinding(int) srcBinding}. */
    public static void nsrcBinding(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.SRCBINDING, value); }
    /** Unsafe version of {@link #srcArrayElement(int) srcArrayElement}. */
    public static void nsrcArrayElement(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.SRCARRAYELEMENT, value); }
    /** Unsafe version of {@link #dstSet(long) dstSet}. */
    public static void ndstSet(long struct, long value) { memPutLong(struct + VkCopyDescriptorSet.DSTSET, value); }
    /** Unsafe version of {@link #dstBinding(int) dstBinding}. */
    public static void ndstBinding(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.DSTBINDING, value); }
    /** Unsafe version of {@link #dstArrayElement(int) dstArrayElement}. */
    public static void ndstArrayElement(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.DSTARRAYELEMENT, value); }
    /** Unsafe version of {@link #descriptorCount(int) descriptorCount}. */
    public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.DESCRIPTORCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkCopyDescriptorSet} structs. */
    public static class Buffer extends StructBuffer<VkCopyDescriptorSet, Buffer> implements NativeResource {

        private static final VkCopyDescriptorSet ELEMENT_FACTORY = VkCopyDescriptorSet.create(-1L);

        /**
         * Creates a new {@code VkCopyDescriptorSet.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyDescriptorSet#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyDescriptorSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyDescriptorSet.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyDescriptorSet.npNext(address()); }
        /** @return the value of the {@code srcSet} field. */
        @NativeType("VkDescriptorSet")
        public long srcSet() { return VkCopyDescriptorSet.nsrcSet(address()); }
        /** @return the value of the {@code srcBinding} field. */
        @NativeType("uint32_t")
        public int srcBinding() { return VkCopyDescriptorSet.nsrcBinding(address()); }
        /** @return the value of the {@code srcArrayElement} field. */
        @NativeType("uint32_t")
        public int srcArrayElement() { return VkCopyDescriptorSet.nsrcArrayElement(address()); }
        /** @return the value of the {@code dstSet} field. */
        @NativeType("VkDescriptorSet")
        public long dstSet() { return VkCopyDescriptorSet.ndstSet(address()); }
        /** @return the value of the {@code dstBinding} field. */
        @NativeType("uint32_t")
        public int dstBinding() { return VkCopyDescriptorSet.ndstBinding(address()); }
        /** @return the value of the {@code dstArrayElement} field. */
        @NativeType("uint32_t")
        public int dstArrayElement() { return VkCopyDescriptorSet.ndstArrayElement(address()); }
        /** @return the value of the {@code descriptorCount} field. */
        @NativeType("uint32_t")
        public int descriptorCount() { return VkCopyDescriptorSet.ndescriptorCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyDescriptorSet.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyDescriptorSet.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET STRUCTURE_TYPE_COPY_DESCRIPTOR_SET} value to the {@code sType} field. */
        public VkCopyDescriptorSet.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyDescriptorSet.Buffer pNext(@NativeType("void const *") long value) { VkCopyDescriptorSet.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcSet} field. */
        public VkCopyDescriptorSet.Buffer srcSet(@NativeType("VkDescriptorSet") long value) { VkCopyDescriptorSet.nsrcSet(address(), value); return this; }
        /** Sets the specified value to the {@code srcBinding} field. */
        public VkCopyDescriptorSet.Buffer srcBinding(@NativeType("uint32_t") int value) { VkCopyDescriptorSet.nsrcBinding(address(), value); return this; }
        /** Sets the specified value to the {@code srcArrayElement} field. */
        public VkCopyDescriptorSet.Buffer srcArrayElement(@NativeType("uint32_t") int value) { VkCopyDescriptorSet.nsrcArrayElement(address(), value); return this; }
        /** Sets the specified value to the {@code dstSet} field. */
        public VkCopyDescriptorSet.Buffer dstSet(@NativeType("VkDescriptorSet") long value) { VkCopyDescriptorSet.ndstSet(address(), value); return this; }
        /** Sets the specified value to the {@code dstBinding} field. */
        public VkCopyDescriptorSet.Buffer dstBinding(@NativeType("uint32_t") int value) { VkCopyDescriptorSet.ndstBinding(address(), value); return this; }
        /** Sets the specified value to the {@code dstArrayElement} field. */
        public VkCopyDescriptorSet.Buffer dstArrayElement(@NativeType("uint32_t") int value) { VkCopyDescriptorSet.ndstArrayElement(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorCount} field. */
        public VkCopyDescriptorSet.Buffer descriptorCount(@NativeType("uint32_t") int value) { VkCopyDescriptorSet.ndescriptorCount(address(), value); return this; }

    }

}