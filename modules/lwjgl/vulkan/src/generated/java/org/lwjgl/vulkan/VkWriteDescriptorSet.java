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
 * <pre><code>
 * struct VkWriteDescriptorSet {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDescriptorSet dstSet;
 *     uint32_t dstBinding;
 *     uint32_t dstArrayElement;
 *     uint32_t descriptorCount;
 *     VkDescriptorType descriptorType;
 *     {@link VkDescriptorImageInfo VkDescriptorImageInfo} const * pImageInfo;
 *     {@link VkDescriptorBufferInfo VkDescriptorBufferInfo} const * pBufferInfo;
 *     VkBufferView const * pTexelBufferView;
 * }</code></pre>
 */
public class VkWriteDescriptorSet extends Struct<VkWriteDescriptorSet> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DSTSET,
        DSTBINDING,
        DSTARRAYELEMENT,
        DESCRIPTORCOUNT,
        DESCRIPTORTYPE,
        PIMAGEINFO,
        PBUFFERINFO,
        PTEXELBUFFERVIEW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DSTSET = layout.offsetof(2);
        DSTBINDING = layout.offsetof(3);
        DSTARRAYELEMENT = layout.offsetof(4);
        DESCRIPTORCOUNT = layout.offsetof(5);
        DESCRIPTORTYPE = layout.offsetof(6);
        PIMAGEINFO = layout.offsetof(7);
        PBUFFERINFO = layout.offsetof(8);
        PTEXELBUFFERVIEW = layout.offsetof(9);
    }

    protected VkWriteDescriptorSet(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkWriteDescriptorSet create(long address, @Nullable ByteBuffer container) {
        return new VkWriteDescriptorSet(address, container);
    }

    /**
     * Creates a {@code VkWriteDescriptorSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWriteDescriptorSet(ByteBuffer container) {
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
    /** @return the value of the {@code descriptorType} field. */
    @NativeType("VkDescriptorType")
    public int descriptorType() { return ndescriptorType(address()); }
    /** @return a {@link VkDescriptorImageInfo.Buffer} view of the struct array pointed to by the {@code pImageInfo} field. */
    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo.@Nullable Buffer pImageInfo() { return npImageInfo(address()); }
    /** @return a {@link VkDescriptorBufferInfo.Buffer} view of the struct array pointed to by the {@code pBufferInfo} field. */
    @NativeType("VkDescriptorBufferInfo const *")
    public VkDescriptorBufferInfo.@Nullable Buffer pBufferInfo() { return npBufferInfo(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pTexelBufferView} field. */
    @NativeType("VkBufferView const *")
    public @Nullable LongBuffer pTexelBufferView() { return npTexelBufferView(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkWriteDescriptorSet sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET} value to the {@code sType} field. */
    public VkWriteDescriptorSet sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkWriteDescriptorSet pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkWriteDescriptorSetAccelerationStructureKHR} value to the {@code pNext} chain. */
    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetAccelerationStructureKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWriteDescriptorSetAccelerationStructureNV} value to the {@code pNext} chain. */
    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetAccelerationStructureNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWriteDescriptorSetInlineUniformBlock} value to the {@code pNext} chain. */
    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetInlineUniformBlock value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWriteDescriptorSetInlineUniformBlockEXT} value to the {@code pNext} chain. */
    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetInlineUniformBlockEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWriteDescriptorSetPartitionedAccelerationStructureNV} value to the {@code pNext} chain. */
    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetPartitionedAccelerationStructureNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWriteDescriptorSetTensorARM} value to the {@code pNext} chain. */
    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetTensorARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code dstSet} field. */
    public VkWriteDescriptorSet dstSet(@NativeType("VkDescriptorSet") long value) { ndstSet(address(), value); return this; }
    /** Sets the specified value to the {@code dstBinding} field. */
    public VkWriteDescriptorSet dstBinding(@NativeType("uint32_t") int value) { ndstBinding(address(), value); return this; }
    /** Sets the specified value to the {@code dstArrayElement} field. */
    public VkWriteDescriptorSet dstArrayElement(@NativeType("uint32_t") int value) { ndstArrayElement(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorCount} field. */
    public VkWriteDescriptorSet descriptorCount(@NativeType("uint32_t") int value) { ndescriptorCount(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorType} field. */
    public VkWriteDescriptorSet descriptorType(@NativeType("VkDescriptorType") int value) { ndescriptorType(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorImageInfo.Buffer} to the {@code pImageInfo} field. */
    public VkWriteDescriptorSet pImageInfo(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo.@Nullable Buffer value) { npImageInfo(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorBufferInfo.Buffer} to the {@code pBufferInfo} field. */
    public VkWriteDescriptorSet pBufferInfo(@NativeType("VkDescriptorBufferInfo const *") VkDescriptorBufferInfo.@Nullable Buffer value) { npBufferInfo(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pTexelBufferView} field. */
    public VkWriteDescriptorSet pTexelBufferView(@Nullable @NativeType("VkBufferView const *") LongBuffer value) { npTexelBufferView(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWriteDescriptorSet set(
        int sType,
        long pNext,
        long dstSet,
        int dstBinding,
        int dstArrayElement,
        int descriptorCount,
        int descriptorType,
        VkDescriptorImageInfo.@Nullable Buffer pImageInfo,
        VkDescriptorBufferInfo.@Nullable Buffer pBufferInfo,
        @Nullable LongBuffer pTexelBufferView
    ) {
        sType(sType);
        pNext(pNext);
        dstSet(dstSet);
        dstBinding(dstBinding);
        dstArrayElement(dstArrayElement);
        descriptorCount(descriptorCount);
        descriptorType(descriptorType);
        pImageInfo(pImageInfo);
        pBufferInfo(pBufferInfo);
        pTexelBufferView(pTexelBufferView);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWriteDescriptorSet set(VkWriteDescriptorSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteDescriptorSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSet malloc() {
        return new VkWriteDescriptorSet(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkWriteDescriptorSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSet calloc() {
        return new VkWriteDescriptorSet(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkWriteDescriptorSet} instance allocated with {@link BufferUtils}. */
    public static VkWriteDescriptorSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteDescriptorSet(memAddress(container), container);
    }

    /** Returns a new {@code VkWriteDescriptorSet} instance for the specified memory address. */
    public static VkWriteDescriptorSet create(long address) {
        return new VkWriteDescriptorSet(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkWriteDescriptorSet createSafe(long address) {
        return address == NULL ? null : new VkWriteDescriptorSet(address, null);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkWriteDescriptorSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkWriteDescriptorSet.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkWriteDescriptorSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSet malloc(MemoryStack stack) {
        return new VkWriteDescriptorSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkWriteDescriptorSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSet calloc(MemoryStack stack) {
        return new VkWriteDescriptorSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkWriteDescriptorSet.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWriteDescriptorSet.PNEXT); }
    /** Unsafe version of {@link #dstSet}. */
    public static long ndstSet(long struct) { return memGetLong(struct + VkWriteDescriptorSet.DSTSET); }
    /** Unsafe version of {@link #dstBinding}. */
    public static int ndstBinding(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DSTBINDING); }
    /** Unsafe version of {@link #dstArrayElement}. */
    public static int ndstArrayElement(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DSTARRAYELEMENT); }
    /** Unsafe version of {@link #descriptorCount}. */
    public static int ndescriptorCount(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DESCRIPTORCOUNT); }
    /** Unsafe version of {@link #descriptorType}. */
    public static int ndescriptorType(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DESCRIPTORTYPE); }
    /** Unsafe version of {@link #pImageInfo}. */
    public static VkDescriptorImageInfo.@Nullable Buffer npImageInfo(long struct) { return VkDescriptorImageInfo.createSafe(memGetAddress(struct + VkWriteDescriptorSet.PIMAGEINFO), ndescriptorCount(struct)); }
    /** Unsafe version of {@link #pBufferInfo}. */
    public static VkDescriptorBufferInfo.@Nullable Buffer npBufferInfo(long struct) { return VkDescriptorBufferInfo.createSafe(memGetAddress(struct + VkWriteDescriptorSet.PBUFFERINFO), ndescriptorCount(struct)); }
    /** Unsafe version of {@link #pTexelBufferView() pTexelBufferView}. */
    public static @Nullable LongBuffer npTexelBufferView(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWriteDescriptorSet.PTEXELBUFFERVIEW), ndescriptorCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteDescriptorSet.PNEXT, value); }
    /** Unsafe version of {@link #dstSet(long) dstSet}. */
    public static void ndstSet(long struct, long value) { memPutLong(struct + VkWriteDescriptorSet.DSTSET, value); }
    /** Unsafe version of {@link #dstBinding(int) dstBinding}. */
    public static void ndstBinding(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DSTBINDING, value); }
    /** Unsafe version of {@link #dstArrayElement(int) dstArrayElement}. */
    public static void ndstArrayElement(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DSTARRAYELEMENT, value); }
    /** Sets the specified value to the {@code descriptorCount} field of the specified {@code struct}. */
    public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DESCRIPTORCOUNT, value); }
    /** Unsafe version of {@link #descriptorType(int) descriptorType}. */
    public static void ndescriptorType(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DESCRIPTORTYPE, value); }
    /** Unsafe version of {@link #pImageInfo(VkDescriptorImageInfo.Buffer) pImageInfo}. */
    public static void npImageInfo(long struct, VkDescriptorImageInfo.@Nullable Buffer value) { memPutAddress(struct + VkWriteDescriptorSet.PIMAGEINFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #pBufferInfo(VkDescriptorBufferInfo.Buffer) pBufferInfo}. */
    public static void npBufferInfo(long struct, VkDescriptorBufferInfo.@Nullable Buffer value) { memPutAddress(struct + VkWriteDescriptorSet.PBUFFERINFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #pTexelBufferView(LongBuffer) pTexelBufferView}. */
    public static void npTexelBufferView(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWriteDescriptorSet.PTEXELBUFFERVIEW, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkWriteDescriptorSet} structs. */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSet, Buffer> implements NativeResource {

        private static final VkWriteDescriptorSet ELEMENT_FACTORY = VkWriteDescriptorSet.create(-1L);

        /**
         * Creates a new {@code VkWriteDescriptorSet.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWriteDescriptorSet#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkWriteDescriptorSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWriteDescriptorSet.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWriteDescriptorSet.npNext(address()); }
        /** @return the value of the {@code dstSet} field. */
        @NativeType("VkDescriptorSet")
        public long dstSet() { return VkWriteDescriptorSet.ndstSet(address()); }
        /** @return the value of the {@code dstBinding} field. */
        @NativeType("uint32_t")
        public int dstBinding() { return VkWriteDescriptorSet.ndstBinding(address()); }
        /** @return the value of the {@code dstArrayElement} field. */
        @NativeType("uint32_t")
        public int dstArrayElement() { return VkWriteDescriptorSet.ndstArrayElement(address()); }
        /** @return the value of the {@code descriptorCount} field. */
        @NativeType("uint32_t")
        public int descriptorCount() { return VkWriteDescriptorSet.ndescriptorCount(address()); }
        /** @return the value of the {@code descriptorType} field. */
        @NativeType("VkDescriptorType")
        public int descriptorType() { return VkWriteDescriptorSet.ndescriptorType(address()); }
        /** @return a {@link VkDescriptorImageInfo.Buffer} view of the struct array pointed to by the {@code pImageInfo} field. */
        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo.@Nullable Buffer pImageInfo() { return VkWriteDescriptorSet.npImageInfo(address()); }
        /** @return a {@link VkDescriptorBufferInfo.Buffer} view of the struct array pointed to by the {@code pBufferInfo} field. */
        @NativeType("VkDescriptorBufferInfo const *")
        public VkDescriptorBufferInfo.@Nullable Buffer pBufferInfo() { return VkWriteDescriptorSet.npBufferInfo(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pTexelBufferView} field. */
        @NativeType("VkBufferView const *")
        public @Nullable LongBuffer pTexelBufferView() { return VkWriteDescriptorSet.npTexelBufferView(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkWriteDescriptorSet.Buffer sType(@NativeType("VkStructureType") int value) { VkWriteDescriptorSet.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET} value to the {@code sType} field. */
        public VkWriteDescriptorSet.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkWriteDescriptorSet.Buffer pNext(@NativeType("void const *") long value) { VkWriteDescriptorSet.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkWriteDescriptorSetAccelerationStructureKHR} value to the {@code pNext} chain. */
        public VkWriteDescriptorSet.Buffer pNext(VkWriteDescriptorSetAccelerationStructureKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWriteDescriptorSetAccelerationStructureNV} value to the {@code pNext} chain. */
        public VkWriteDescriptorSet.Buffer pNext(VkWriteDescriptorSetAccelerationStructureNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWriteDescriptorSetInlineUniformBlock} value to the {@code pNext} chain. */
        public VkWriteDescriptorSet.Buffer pNext(VkWriteDescriptorSetInlineUniformBlock value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWriteDescriptorSetInlineUniformBlockEXT} value to the {@code pNext} chain. */
        public VkWriteDescriptorSet.Buffer pNext(VkWriteDescriptorSetInlineUniformBlockEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWriteDescriptorSetPartitionedAccelerationStructureNV} value to the {@code pNext} chain. */
        public VkWriteDescriptorSet.Buffer pNext(VkWriteDescriptorSetPartitionedAccelerationStructureNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWriteDescriptorSetTensorARM} value to the {@code pNext} chain. */
        public VkWriteDescriptorSet.Buffer pNext(VkWriteDescriptorSetTensorARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code dstSet} field. */
        public VkWriteDescriptorSet.Buffer dstSet(@NativeType("VkDescriptorSet") long value) { VkWriteDescriptorSet.ndstSet(address(), value); return this; }
        /** Sets the specified value to the {@code dstBinding} field. */
        public VkWriteDescriptorSet.Buffer dstBinding(@NativeType("uint32_t") int value) { VkWriteDescriptorSet.ndstBinding(address(), value); return this; }
        /** Sets the specified value to the {@code dstArrayElement} field. */
        public VkWriteDescriptorSet.Buffer dstArrayElement(@NativeType("uint32_t") int value) { VkWriteDescriptorSet.ndstArrayElement(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorCount} field. */
        public VkWriteDescriptorSet.Buffer descriptorCount(@NativeType("uint32_t") int value) { VkWriteDescriptorSet.ndescriptorCount(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorType} field. */
        public VkWriteDescriptorSet.Buffer descriptorType(@NativeType("VkDescriptorType") int value) { VkWriteDescriptorSet.ndescriptorType(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorImageInfo.Buffer} to the {@code pImageInfo} field. */
        public VkWriteDescriptorSet.Buffer pImageInfo(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo.@Nullable Buffer value) { VkWriteDescriptorSet.npImageInfo(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorBufferInfo.Buffer} to the {@code pBufferInfo} field. */
        public VkWriteDescriptorSet.Buffer pBufferInfo(@NativeType("VkDescriptorBufferInfo const *") VkDescriptorBufferInfo.@Nullable Buffer value) { VkWriteDescriptorSet.npBufferInfo(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pTexelBufferView} field. */
        public VkWriteDescriptorSet.Buffer pTexelBufferView(@Nullable @NativeType("VkBufferView const *") LongBuffer value) { VkWriteDescriptorSet.npTexelBufferView(address(), value); return this; }

    }

}