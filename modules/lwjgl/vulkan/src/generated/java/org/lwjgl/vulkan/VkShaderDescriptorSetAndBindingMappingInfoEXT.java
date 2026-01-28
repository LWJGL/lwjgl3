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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkShaderDescriptorSetAndBindingMappingInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t mappingCount;
 *     {@link VkDescriptorSetAndBindingMappingEXT VkDescriptorSetAndBindingMappingEXT} const * pMappings;
 * }</code></pre>
 */
public class VkShaderDescriptorSetAndBindingMappingInfoEXT extends Struct<VkShaderDescriptorSetAndBindingMappingInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAPPINGCOUNT,
        PMAPPINGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAPPINGCOUNT = layout.offsetof(2);
        PMAPPINGS = layout.offsetof(3);
    }

    protected VkShaderDescriptorSetAndBindingMappingInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkShaderDescriptorSetAndBindingMappingInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkShaderDescriptorSetAndBindingMappingInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderDescriptorSetAndBindingMappingInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code mappingCount} field. */
    @NativeType("uint32_t")
    public int mappingCount() { return nmappingCount(address()); }
    /** @return a {@link VkDescriptorSetAndBindingMappingEXT.Buffer} view of the struct array pointed to by the {@code pMappings} field. */
    @NativeType("VkDescriptorSetAndBindingMappingEXT const *")
    public VkDescriptorSetAndBindingMappingEXT.@Nullable Buffer pMappings() { return npMappings(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkShaderDescriptorSetAndBindingMappingInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT} value to the {@code sType} field. */
    public VkShaderDescriptorSetAndBindingMappingInfoEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkShaderDescriptorSetAndBindingMappingInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorSetAndBindingMappingEXT.Buffer} to the {@code pMappings} field. */
    public VkShaderDescriptorSetAndBindingMappingInfoEXT pMappings(@NativeType("VkDescriptorSetAndBindingMappingEXT const *") VkDescriptorSetAndBindingMappingEXT.@Nullable Buffer value) { npMappings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkShaderDescriptorSetAndBindingMappingInfoEXT set(
        int sType,
        long pNext,
        VkDescriptorSetAndBindingMappingEXT.@Nullable Buffer pMappings
    ) {
        sType(sType);
        pNext(pNext);
        pMappings(pMappings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkShaderDescriptorSetAndBindingMappingInfoEXT set(VkShaderDescriptorSetAndBindingMappingInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderDescriptorSetAndBindingMappingInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT malloc() {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkShaderDescriptorSetAndBindingMappingInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT calloc() {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkShaderDescriptorSetAndBindingMappingInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkShaderDescriptorSetAndBindingMappingInfoEXT} instance for the specified memory address. */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT create(long address) {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkShaderDescriptorSetAndBindingMappingInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkShaderDescriptorSetAndBindingMappingInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkShaderDescriptorSetAndBindingMappingInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT malloc(MemoryStack stack) {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkShaderDescriptorSetAndBindingMappingInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT calloc(MemoryStack stack) {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkShaderDescriptorSetAndBindingMappingInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkShaderDescriptorSetAndBindingMappingInfoEXT.PNEXT); }
    /** Unsafe version of {@link #mappingCount}. */
    public static int nmappingCount(long struct) { return memGetInt(struct + VkShaderDescriptorSetAndBindingMappingInfoEXT.MAPPINGCOUNT); }
    /** Unsafe version of {@link #pMappings}. */
    public static VkDescriptorSetAndBindingMappingEXT.@Nullable Buffer npMappings(long struct) { return VkDescriptorSetAndBindingMappingEXT.createSafe(memGetAddress(struct + VkShaderDescriptorSetAndBindingMappingInfoEXT.PMAPPINGS), nmappingCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkShaderDescriptorSetAndBindingMappingInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkShaderDescriptorSetAndBindingMappingInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code mappingCount} field of the specified {@code struct}. */
    public static void nmappingCount(long struct, int value) { memPutInt(struct + VkShaderDescriptorSetAndBindingMappingInfoEXT.MAPPINGCOUNT, value); }
    /** Unsafe version of {@link #pMappings(VkDescriptorSetAndBindingMappingEXT.Buffer) pMappings}. */
    public static void npMappings(long struct, VkDescriptorSetAndBindingMappingEXT.@Nullable Buffer value) { memPutAddress(struct + VkShaderDescriptorSetAndBindingMappingInfoEXT.PMAPPINGS, memAddressSafe(value)); nmappingCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nmappingCount(struct) != 0) {
            check(memGetAddress(struct + VkShaderDescriptorSetAndBindingMappingInfoEXT.PMAPPINGS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkShaderDescriptorSetAndBindingMappingInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkShaderDescriptorSetAndBindingMappingInfoEXT, Buffer> implements NativeResource {

        private static final VkShaderDescriptorSetAndBindingMappingInfoEXT ELEMENT_FACTORY = VkShaderDescriptorSetAndBindingMappingInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderDescriptorSetAndBindingMappingInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkShaderDescriptorSetAndBindingMappingInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkShaderDescriptorSetAndBindingMappingInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkShaderDescriptorSetAndBindingMappingInfoEXT.npNext(address()); }
        /** @return the value of the {@code mappingCount} field. */
        @NativeType("uint32_t")
        public int mappingCount() { return VkShaderDescriptorSetAndBindingMappingInfoEXT.nmappingCount(address()); }
        /** @return a {@link VkDescriptorSetAndBindingMappingEXT.Buffer} view of the struct array pointed to by the {@code pMappings} field. */
        @NativeType("VkDescriptorSetAndBindingMappingEXT const *")
        public VkDescriptorSetAndBindingMappingEXT.@Nullable Buffer pMappings() { return VkShaderDescriptorSetAndBindingMappingInfoEXT.npMappings(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkShaderDescriptorSetAndBindingMappingInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT} value to the {@code sType} field. */
        public VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkShaderDescriptorSetAndBindingMappingInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorSetAndBindingMappingEXT.Buffer} to the {@code pMappings} field. */
        public VkShaderDescriptorSetAndBindingMappingInfoEXT.Buffer pMappings(@NativeType("VkDescriptorSetAndBindingMappingEXT const *") VkDescriptorSetAndBindingMappingEXT.@Nullable Buffer value) { VkShaderDescriptorSetAndBindingMappingInfoEXT.npMappings(address(), value); return this; }

    }

}