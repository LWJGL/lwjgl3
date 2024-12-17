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
 * struct VkSamplerBorderColorComponentMappingCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkComponentMapping VkComponentMapping} components;
 *     VkBool32 srgb;
 * }}</pre>
 */
public class VkSamplerBorderColorComponentMappingCreateInfoEXT extends Struct<VkSamplerBorderColorComponentMappingCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMPONENTS,
        SRGB;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPONENTS = layout.offsetof(2);
        SRGB = layout.offsetof(3);
    }

    protected VkSamplerBorderColorComponentMappingCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSamplerBorderColorComponentMappingCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSamplerBorderColorComponentMappingCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerBorderColorComponentMappingCreateInfoEXT(ByteBuffer container) {
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
    /** @return a {@link VkComponentMapping} view of the {@code components} field. */
    public VkComponentMapping components() { return ncomponents(address()); }
    /** @return the value of the {@code srgb} field. */
    @NativeType("VkBool32")
    public boolean srgb() { return nsrgb(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkSamplerBorderColorComponentMappingCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTBorderColorSwizzle#VK_STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkSamplerBorderColorComponentMappingCreateInfoEXT sType$Default() { return sType(EXTBorderColorSwizzle.VK_STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSamplerBorderColorComponentMappingCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components(VkComponentMapping value) { ncomponents(address(), value); return this; }
    /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
    /** Sets the specified value to the {@code srgb} field. */
    public VkSamplerBorderColorComponentMappingCreateInfoEXT srgb(@NativeType("VkBool32") boolean value) { nsrgb(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerBorderColorComponentMappingCreateInfoEXT set(
        int sType,
        long pNext,
        VkComponentMapping components,
        boolean srgb
    ) {
        sType(sType);
        pNext(pNext);
        components(components);
        srgb(srgb);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerBorderColorComponentMappingCreateInfoEXT set(VkSamplerBorderColorComponentMappingCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerBorderColorComponentMappingCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT malloc() {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerBorderColorComponentMappingCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT calloc() {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerBorderColorComponentMappingCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerBorderColorComponentMappingCreateInfoEXT} instance for the specified memory address. */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT create(long address) {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSamplerBorderColorComponentMappingCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSamplerBorderColorComponentMappingCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSamplerBorderColorComponentMappingCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT malloc(MemoryStack stack) {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSamplerBorderColorComponentMappingCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT calloc(MemoryStack stack) {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSamplerBorderColorComponentMappingCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerBorderColorComponentMappingCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #components}. */
    public static VkComponentMapping ncomponents(long struct) { return VkComponentMapping.create(struct + VkSamplerBorderColorComponentMappingCreateInfoEXT.COMPONENTS); }
    /** Unsafe version of {@link #srgb}. */
    public static int nsrgb(long struct) { return memGetInt(struct + VkSamplerBorderColorComponentMappingCreateInfoEXT.SRGB); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSamplerBorderColorComponentMappingCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerBorderColorComponentMappingCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #components(VkComponentMapping) components}. */
    public static void ncomponents(long struct, VkComponentMapping value) { memCopy(value.address(), struct + VkSamplerBorderColorComponentMappingCreateInfoEXT.COMPONENTS, VkComponentMapping.SIZEOF); }
    /** Unsafe version of {@link #srgb(boolean) srgb}. */
    public static void nsrgb(long struct, int value) { memPutInt(struct + VkSamplerBorderColorComponentMappingCreateInfoEXT.SRGB, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerBorderColorComponentMappingCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSamplerBorderColorComponentMappingCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkSamplerBorderColorComponentMappingCreateInfoEXT ELEMENT_FACTORY = VkSamplerBorderColorComponentMappingCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerBorderColorComponentMappingCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSamplerBorderColorComponentMappingCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerBorderColorComponentMappingCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerBorderColorComponentMappingCreateInfoEXT.npNext(address()); }
        /** @return a {@link VkComponentMapping} view of the {@code components} field. */
        public VkComponentMapping components() { return VkSamplerBorderColorComponentMappingCreateInfoEXT.ncomponents(address()); }
        /** @return the value of the {@code srgb} field. */
        @NativeType("VkBool32")
        public boolean srgb() { return VkSamplerBorderColorComponentMappingCreateInfoEXT.nsrgb(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTBorderColorSwizzle#VK_STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer sType$Default() { return sType(EXTBorderColorSwizzle.VK_STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.npNext(address(), value); return this; }
        /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
        public VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer components(VkComponentMapping value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.ncomponents(address(), value); return this; }
        /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
        /** Sets the specified value to the {@code srgb} field. */
        public VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer srgb(@NativeType("VkBool32") boolean value) { VkSamplerBorderColorComponentMappingCreateInfoEXT.nsrgb(address(), value ? 1 : 0); return this; }

    }

}