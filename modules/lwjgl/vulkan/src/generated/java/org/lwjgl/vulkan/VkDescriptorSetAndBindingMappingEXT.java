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
 * struct VkDescriptorSetAndBindingMappingEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t descriptorSet;
 *     uint32_t firstBinding;
 *     uint32_t bindingCount;
 *     VkSpirvResourceTypeFlagsEXT resourceMask;
 *     VkDescriptorMappingSourceEXT source;
 *     {@link VkDescriptorMappingSourceDataEXT VkDescriptorMappingSourceDataEXT} sourceData;
 * }</code></pre>
 */
public class VkDescriptorSetAndBindingMappingEXT extends Struct<VkDescriptorSetAndBindingMappingEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORSET,
        FIRSTBINDING,
        BINDINGCOUNT,
        RESOURCEMASK,
        SOURCE,
        SOURCEDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkDescriptorMappingSourceDataEXT.SIZEOF, VkDescriptorMappingSourceDataEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORSET = layout.offsetof(2);
        FIRSTBINDING = layout.offsetof(3);
        BINDINGCOUNT = layout.offsetof(4);
        RESOURCEMASK = layout.offsetof(5);
        SOURCE = layout.offsetof(6);
        SOURCEDATA = layout.offsetof(7);
    }

    protected VkDescriptorSetAndBindingMappingEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorSetAndBindingMappingEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorSetAndBindingMappingEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorSetAndBindingMappingEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetAndBindingMappingEXT(ByteBuffer container) {
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
    /** @return the value of the {@code descriptorSet} field. */
    @NativeType("uint32_t")
    public int descriptorSet() { return ndescriptorSet(address()); }
    /** @return the value of the {@code firstBinding} field. */
    @NativeType("uint32_t")
    public int firstBinding() { return nfirstBinding(address()); }
    /** @return the value of the {@code bindingCount} field. */
    @NativeType("uint32_t")
    public int bindingCount() { return nbindingCount(address()); }
    /** @return the value of the {@code resourceMask} field. */
    @NativeType("VkSpirvResourceTypeFlagsEXT")
    public int resourceMask() { return nresourceMask(address()); }
    /** @return the value of the {@code source} field. */
    @NativeType("VkDescriptorMappingSourceEXT")
    public int source() { return nsource(address()); }
    /** @return a {@link VkDescriptorMappingSourceDataEXT} view of the {@code sourceData} field. */
    public VkDescriptorMappingSourceDataEXT sourceData() { return nsourceData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorSetAndBindingMappingEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT} value to the {@code sType} field. */
    public VkDescriptorSetAndBindingMappingEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorSetAndBindingMappingEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPushConstantBankInfoNV} value to the {@code pNext} chain. */
    public VkDescriptorSetAndBindingMappingEXT pNext(VkPushConstantBankInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code descriptorSet} field. */
    public VkDescriptorSetAndBindingMappingEXT descriptorSet(@NativeType("uint32_t") int value) { ndescriptorSet(address(), value); return this; }
    /** Sets the specified value to the {@code firstBinding} field. */
    public VkDescriptorSetAndBindingMappingEXT firstBinding(@NativeType("uint32_t") int value) { nfirstBinding(address(), value); return this; }
    /** Sets the specified value to the {@code bindingCount} field. */
    public VkDescriptorSetAndBindingMappingEXT bindingCount(@NativeType("uint32_t") int value) { nbindingCount(address(), value); return this; }
    /** Sets the specified value to the {@code resourceMask} field. */
    public VkDescriptorSetAndBindingMappingEXT resourceMask(@NativeType("VkSpirvResourceTypeFlagsEXT") int value) { nresourceMask(address(), value); return this; }
    /** Sets the specified value to the {@code source} field. */
    public VkDescriptorSetAndBindingMappingEXT source(@NativeType("VkDescriptorMappingSourceEXT") int value) { nsource(address(), value); return this; }
    /** Copies the specified {@link VkDescriptorMappingSourceDataEXT} to the {@code sourceData} field. */
    public VkDescriptorSetAndBindingMappingEXT sourceData(VkDescriptorMappingSourceDataEXT value) { nsourceData(address(), value); return this; }
    /** Passes the {@code sourceData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDescriptorSetAndBindingMappingEXT sourceData(java.util.function.Consumer<VkDescriptorMappingSourceDataEXT> consumer) { consumer.accept(sourceData()); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetAndBindingMappingEXT set(
        int sType,
        long pNext,
        int descriptorSet,
        int firstBinding,
        int bindingCount,
        int resourceMask,
        int source,
        VkDescriptorMappingSourceDataEXT sourceData
    ) {
        sType(sType);
        pNext(pNext);
        descriptorSet(descriptorSet);
        firstBinding(firstBinding);
        bindingCount(bindingCount);
        resourceMask(resourceMask);
        source(source);
        sourceData(sourceData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetAndBindingMappingEXT set(VkDescriptorSetAndBindingMappingEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetAndBindingMappingEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetAndBindingMappingEXT malloc() {
        return new VkDescriptorSetAndBindingMappingEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetAndBindingMappingEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetAndBindingMappingEXT calloc() {
        return new VkDescriptorSetAndBindingMappingEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetAndBindingMappingEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetAndBindingMappingEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetAndBindingMappingEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetAndBindingMappingEXT} instance for the specified memory address. */
    public static VkDescriptorSetAndBindingMappingEXT create(long address) {
        return new VkDescriptorSetAndBindingMappingEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorSetAndBindingMappingEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorSetAndBindingMappingEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorSetAndBindingMappingEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAndBindingMappingEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetAndBindingMappingEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAndBindingMappingEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetAndBindingMappingEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAndBindingMappingEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorSetAndBindingMappingEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAndBindingMappingEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorSetAndBindingMappingEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorSetAndBindingMappingEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetAndBindingMappingEXT malloc(MemoryStack stack) {
        return new VkDescriptorSetAndBindingMappingEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorSetAndBindingMappingEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetAndBindingMappingEXT calloc(MemoryStack stack) {
        return new VkDescriptorSetAndBindingMappingEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorSetAndBindingMappingEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAndBindingMappingEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetAndBindingMappingEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAndBindingMappingEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorSetAndBindingMappingEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetAndBindingMappingEXT.PNEXT); }
    /** Unsafe version of {@link #descriptorSet}. */
    public static int ndescriptorSet(long struct) { return memGetInt(struct + VkDescriptorSetAndBindingMappingEXT.DESCRIPTORSET); }
    /** Unsafe version of {@link #firstBinding}. */
    public static int nfirstBinding(long struct) { return memGetInt(struct + VkDescriptorSetAndBindingMappingEXT.FIRSTBINDING); }
    /** Unsafe version of {@link #bindingCount}. */
    public static int nbindingCount(long struct) { return memGetInt(struct + VkDescriptorSetAndBindingMappingEXT.BINDINGCOUNT); }
    /** Unsafe version of {@link #resourceMask}. */
    public static int nresourceMask(long struct) { return memGetInt(struct + VkDescriptorSetAndBindingMappingEXT.RESOURCEMASK); }
    /** Unsafe version of {@link #source}. */
    public static int nsource(long struct) { return memGetInt(struct + VkDescriptorSetAndBindingMappingEXT.SOURCE); }
    /** Unsafe version of {@link #sourceData}. */
    public static VkDescriptorMappingSourceDataEXT nsourceData(long struct) { return VkDescriptorMappingSourceDataEXT.create(struct + VkDescriptorSetAndBindingMappingEXT.SOURCEDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorSetAndBindingMappingEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetAndBindingMappingEXT.PNEXT, value); }
    /** Unsafe version of {@link #descriptorSet(int) descriptorSet}. */
    public static void ndescriptorSet(long struct, int value) { memPutInt(struct + VkDescriptorSetAndBindingMappingEXT.DESCRIPTORSET, value); }
    /** Unsafe version of {@link #firstBinding(int) firstBinding}. */
    public static void nfirstBinding(long struct, int value) { memPutInt(struct + VkDescriptorSetAndBindingMappingEXT.FIRSTBINDING, value); }
    /** Unsafe version of {@link #bindingCount(int) bindingCount}. */
    public static void nbindingCount(long struct, int value) { memPutInt(struct + VkDescriptorSetAndBindingMappingEXT.BINDINGCOUNT, value); }
    /** Unsafe version of {@link #resourceMask(int) resourceMask}. */
    public static void nresourceMask(long struct, int value) { memPutInt(struct + VkDescriptorSetAndBindingMappingEXT.RESOURCEMASK, value); }
    /** Unsafe version of {@link #source(int) source}. */
    public static void nsource(long struct, int value) { memPutInt(struct + VkDescriptorSetAndBindingMappingEXT.SOURCE, value); }
    /** Unsafe version of {@link #sourceData(VkDescriptorMappingSourceDataEXT) sourceData}. */
    public static void nsourceData(long struct, VkDescriptorMappingSourceDataEXT value) { memCopy(value.address(), struct + VkDescriptorSetAndBindingMappingEXT.SOURCEDATA, VkDescriptorMappingSourceDataEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetAndBindingMappingEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetAndBindingMappingEXT, Buffer> implements NativeResource {

        private static final VkDescriptorSetAndBindingMappingEXT ELEMENT_FACTORY = VkDescriptorSetAndBindingMappingEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetAndBindingMappingEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetAndBindingMappingEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorSetAndBindingMappingEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetAndBindingMappingEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorSetAndBindingMappingEXT.npNext(address()); }
        /** @return the value of the {@code descriptorSet} field. */
        @NativeType("uint32_t")
        public int descriptorSet() { return VkDescriptorSetAndBindingMappingEXT.ndescriptorSet(address()); }
        /** @return the value of the {@code firstBinding} field. */
        @NativeType("uint32_t")
        public int firstBinding() { return VkDescriptorSetAndBindingMappingEXT.nfirstBinding(address()); }
        /** @return the value of the {@code bindingCount} field. */
        @NativeType("uint32_t")
        public int bindingCount() { return VkDescriptorSetAndBindingMappingEXT.nbindingCount(address()); }
        /** @return the value of the {@code resourceMask} field. */
        @NativeType("VkSpirvResourceTypeFlagsEXT")
        public int resourceMask() { return VkDescriptorSetAndBindingMappingEXT.nresourceMask(address()); }
        /** @return the value of the {@code source} field. */
        @NativeType("VkDescriptorMappingSourceEXT")
        public int source() { return VkDescriptorSetAndBindingMappingEXT.nsource(address()); }
        /** @return a {@link VkDescriptorMappingSourceDataEXT} view of the {@code sourceData} field. */
        public VkDescriptorMappingSourceDataEXT sourceData() { return VkDescriptorSetAndBindingMappingEXT.nsourceData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorSetAndBindingMappingEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetAndBindingMappingEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT} value to the {@code sType} field. */
        public VkDescriptorSetAndBindingMappingEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorSetAndBindingMappingEXT.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorSetAndBindingMappingEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPushConstantBankInfoNV} value to the {@code pNext} chain. */
        public VkDescriptorSetAndBindingMappingEXT.Buffer pNext(VkPushConstantBankInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code descriptorSet} field. */
        public VkDescriptorSetAndBindingMappingEXT.Buffer descriptorSet(@NativeType("uint32_t") int value) { VkDescriptorSetAndBindingMappingEXT.ndescriptorSet(address(), value); return this; }
        /** Sets the specified value to the {@code firstBinding} field. */
        public VkDescriptorSetAndBindingMappingEXT.Buffer firstBinding(@NativeType("uint32_t") int value) { VkDescriptorSetAndBindingMappingEXT.nfirstBinding(address(), value); return this; }
        /** Sets the specified value to the {@code bindingCount} field. */
        public VkDescriptorSetAndBindingMappingEXT.Buffer bindingCount(@NativeType("uint32_t") int value) { VkDescriptorSetAndBindingMappingEXT.nbindingCount(address(), value); return this; }
        /** Sets the specified value to the {@code resourceMask} field. */
        public VkDescriptorSetAndBindingMappingEXT.Buffer resourceMask(@NativeType("VkSpirvResourceTypeFlagsEXT") int value) { VkDescriptorSetAndBindingMappingEXT.nresourceMask(address(), value); return this; }
        /** Sets the specified value to the {@code source} field. */
        public VkDescriptorSetAndBindingMappingEXT.Buffer source(@NativeType("VkDescriptorMappingSourceEXT") int value) { VkDescriptorSetAndBindingMappingEXT.nsource(address(), value); return this; }
        /** Copies the specified {@link VkDescriptorMappingSourceDataEXT} to the {@code sourceData} field. */
        public VkDescriptorSetAndBindingMappingEXT.Buffer sourceData(VkDescriptorMappingSourceDataEXT value) { VkDescriptorSetAndBindingMappingEXT.nsourceData(address(), value); return this; }
        /** Passes the {@code sourceData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDescriptorSetAndBindingMappingEXT.Buffer sourceData(java.util.function.Consumer<VkDescriptorMappingSourceDataEXT> consumer) { consumer.accept(sourceData()); return this; }

    }

}