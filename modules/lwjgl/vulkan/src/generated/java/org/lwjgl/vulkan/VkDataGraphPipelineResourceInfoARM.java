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
 * struct VkDataGraphPipelineResourceInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t descriptorSet;
 *     uint32_t binding;
 *     uint32_t arrayElement;
 * }}</pre>
 */
public class VkDataGraphPipelineResourceInfoARM extends Struct<VkDataGraphPipelineResourceInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORSET,
        BINDING,
        ARRAYELEMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORSET = layout.offsetof(2);
        BINDING = layout.offsetof(3);
        ARRAYELEMENT = layout.offsetof(4);
    }

    protected VkDataGraphPipelineResourceInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineResourceInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineResourceInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineResourceInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineResourceInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code binding} field. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** @return the value of the {@code arrayElement} field. */
    @NativeType("uint32_t")
    public int arrayElement() { return narrayElement(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineResourceInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineResourceInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineResourceInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkTensorDescriptionARM} value to the {@code pNext} chain. */
    public VkDataGraphPipelineResourceInfoARM pNext(VkTensorDescriptionARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code descriptorSet} field. */
    public VkDataGraphPipelineResourceInfoARM descriptorSet(@NativeType("uint32_t") int value) { ndescriptorSet(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public VkDataGraphPipelineResourceInfoARM binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code arrayElement} field. */
    public VkDataGraphPipelineResourceInfoARM arrayElement(@NativeType("uint32_t") int value) { narrayElement(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineResourceInfoARM set(
        int sType,
        long pNext,
        int descriptorSet,
        int binding,
        int arrayElement
    ) {
        sType(sType);
        pNext(pNext);
        descriptorSet(descriptorSet);
        binding(binding);
        arrayElement(arrayElement);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineResourceInfoARM set(VkDataGraphPipelineResourceInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineResourceInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineResourceInfoARM malloc() {
        return new VkDataGraphPipelineResourceInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineResourceInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineResourceInfoARM calloc() {
        return new VkDataGraphPipelineResourceInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineResourceInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineResourceInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineResourceInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineResourceInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineResourceInfoARM create(long address) {
        return new VkDataGraphPipelineResourceInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineResourceInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineResourceInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineResourceInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineResourceInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineResourceInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineResourceInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineResourceInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineResourceInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineResourceInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineResourceInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineResourceInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineResourceInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineResourceInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineResourceInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineResourceInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineResourceInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineResourceInfoARM.PNEXT); }
    /** Unsafe version of {@link #descriptorSet}. */
    public static int ndescriptorSet(long struct) { return memGetInt(struct + VkDataGraphPipelineResourceInfoARM.DESCRIPTORSET); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return memGetInt(struct + VkDataGraphPipelineResourceInfoARM.BINDING); }
    /** Unsafe version of {@link #arrayElement}. */
    public static int narrayElement(long struct) { return memGetInt(struct + VkDataGraphPipelineResourceInfoARM.ARRAYELEMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineResourceInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineResourceInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #descriptorSet(int) descriptorSet}. */
    public static void ndescriptorSet(long struct, int value) { memPutInt(struct + VkDataGraphPipelineResourceInfoARM.DESCRIPTORSET, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { memPutInt(struct + VkDataGraphPipelineResourceInfoARM.BINDING, value); }
    /** Unsafe version of {@link #arrayElement(int) arrayElement}. */
    public static void narrayElement(long struct, int value) { memPutInt(struct + VkDataGraphPipelineResourceInfoARM.ARRAYELEMENT, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineResourceInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineResourceInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineResourceInfoARM ELEMENT_FACTORY = VkDataGraphPipelineResourceInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineResourceInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineResourceInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineResourceInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineResourceInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineResourceInfoARM.npNext(address()); }
        /** @return the value of the {@code descriptorSet} field. */
        @NativeType("uint32_t")
        public int descriptorSet() { return VkDataGraphPipelineResourceInfoARM.ndescriptorSet(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkDataGraphPipelineResourceInfoARM.nbinding(address()); }
        /** @return the value of the {@code arrayElement} field. */
        @NativeType("uint32_t")
        public int arrayElement() { return VkDataGraphPipelineResourceInfoARM.narrayElement(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineResourceInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineResourceInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineResourceInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineResourceInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineResourceInfoARM.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkTensorDescriptionARM} value to the {@code pNext} chain. */
        public VkDataGraphPipelineResourceInfoARM.Buffer pNext(VkTensorDescriptionARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code descriptorSet} field. */
        public VkDataGraphPipelineResourceInfoARM.Buffer descriptorSet(@NativeType("uint32_t") int value) { VkDataGraphPipelineResourceInfoARM.ndescriptorSet(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public VkDataGraphPipelineResourceInfoARM.Buffer binding(@NativeType("uint32_t") int value) { VkDataGraphPipelineResourceInfoARM.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code arrayElement} field. */
        public VkDataGraphPipelineResourceInfoARM.Buffer arrayElement(@NativeType("uint32_t") int value) { VkDataGraphPipelineResourceInfoARM.narrayElement(address(), value); return this; }

    }

}