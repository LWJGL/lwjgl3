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
 * struct VkCommandBufferInheritanceDescriptorHeapInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkBindHeapInfoEXT VkBindHeapInfoEXT} const * pSamplerHeapBindInfo;
 *     {@link VkBindHeapInfoEXT VkBindHeapInfoEXT} const * pResourceHeapBindInfo;
 * }</code></pre>
 */
public class VkCommandBufferInheritanceDescriptorHeapInfoEXT extends Struct<VkCommandBufferInheritanceDescriptorHeapInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSAMPLERHEAPBINDINFO,
        PRESOURCEHEAPBINDINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSAMPLERHEAPBINDINFO = layout.offsetof(2);
        PRESOURCEHEAPBINDINFO = layout.offsetof(3);
    }

    protected VkCommandBufferInheritanceDescriptorHeapInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCommandBufferInheritanceDescriptorHeapInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkCommandBufferInheritanceDescriptorHeapInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferInheritanceDescriptorHeapInfoEXT(ByteBuffer container) {
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
    /** @return a {@link VkBindHeapInfoEXT} view of the struct pointed to by the {@code pSamplerHeapBindInfo} field. */
    @NativeType("VkBindHeapInfoEXT const *")
    public @Nullable VkBindHeapInfoEXT pSamplerHeapBindInfo() { return npSamplerHeapBindInfo(address()); }
    /** @return a {@link VkBindHeapInfoEXT} view of the struct pointed to by the {@code pResourceHeapBindInfo} field. */
    @NativeType("VkBindHeapInfoEXT const *")
    public @Nullable VkBindHeapInfoEXT pResourceHeapBindInfo() { return npResourceHeapBindInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCommandBufferInheritanceDescriptorHeapInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT} value to the {@code sType} field. */
    public VkCommandBufferInheritanceDescriptorHeapInfoEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCommandBufferInheritanceDescriptorHeapInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkBindHeapInfoEXT} to the {@code pSamplerHeapBindInfo} field. */
    public VkCommandBufferInheritanceDescriptorHeapInfoEXT pSamplerHeapBindInfo(@Nullable @NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT value) { npSamplerHeapBindInfo(address(), value); return this; }
    /** Sets the address of the specified {@link VkBindHeapInfoEXT} to the {@code pResourceHeapBindInfo} field. */
    public VkCommandBufferInheritanceDescriptorHeapInfoEXT pResourceHeapBindInfo(@Nullable @NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT value) { npResourceHeapBindInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferInheritanceDescriptorHeapInfoEXT set(
        int sType,
        long pNext,
        @Nullable VkBindHeapInfoEXT pSamplerHeapBindInfo,
        @Nullable VkBindHeapInfoEXT pResourceHeapBindInfo
    ) {
        sType(sType);
        pNext(pNext);
        pSamplerHeapBindInfo(pSamplerHeapBindInfo);
        pResourceHeapBindInfo(pResourceHeapBindInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferInheritanceDescriptorHeapInfoEXT set(VkCommandBufferInheritanceDescriptorHeapInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferInheritanceDescriptorHeapInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT malloc() {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceDescriptorHeapInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT calloc() {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceDescriptorHeapInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceDescriptorHeapInfoEXT} instance for the specified memory address. */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT create(long address) {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCommandBufferInheritanceDescriptorHeapInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkCommandBufferInheritanceDescriptorHeapInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceDescriptorHeapInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceDescriptorHeapInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCommandBufferInheritanceDescriptorHeapInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceDescriptorHeapInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pSamplerHeapBindInfo}. */
    public static @Nullable VkBindHeapInfoEXT npSamplerHeapBindInfo(long struct) { return VkBindHeapInfoEXT.createSafe(memGetAddress(struct + VkCommandBufferInheritanceDescriptorHeapInfoEXT.PSAMPLERHEAPBINDINFO)); }
    /** Unsafe version of {@link #pResourceHeapBindInfo}. */
    public static @Nullable VkBindHeapInfoEXT npResourceHeapBindInfo(long struct) { return VkBindHeapInfoEXT.createSafe(memGetAddress(struct + VkCommandBufferInheritanceDescriptorHeapInfoEXT.PRESOURCEHEAPBINDINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceDescriptorHeapInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceDescriptorHeapInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pSamplerHeapBindInfo(VkBindHeapInfoEXT) pSamplerHeapBindInfo}. */
    public static void npSamplerHeapBindInfo(long struct, @Nullable VkBindHeapInfoEXT value) { memPutAddress(struct + VkCommandBufferInheritanceDescriptorHeapInfoEXT.PSAMPLERHEAPBINDINFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #pResourceHeapBindInfo(VkBindHeapInfoEXT) pResourceHeapBindInfo}. */
    public static void npResourceHeapBindInfo(long struct, @Nullable VkBindHeapInfoEXT value) { memPutAddress(struct + VkCommandBufferInheritanceDescriptorHeapInfoEXT.PRESOURCEHEAPBINDINFO, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkCommandBufferInheritanceDescriptorHeapInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceDescriptorHeapInfoEXT, Buffer> implements NativeResource {

        private static final VkCommandBufferInheritanceDescriptorHeapInfoEXT ELEMENT_FACTORY = VkCommandBufferInheritanceDescriptorHeapInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceDescriptorHeapInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCommandBufferInheritanceDescriptorHeapInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferInheritanceDescriptorHeapInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferInheritanceDescriptorHeapInfoEXT.npNext(address()); }
        /** @return a {@link VkBindHeapInfoEXT} view of the struct pointed to by the {@code pSamplerHeapBindInfo} field. */
        @NativeType("VkBindHeapInfoEXT const *")
        public @Nullable VkBindHeapInfoEXT pSamplerHeapBindInfo() { return VkCommandBufferInheritanceDescriptorHeapInfoEXT.npSamplerHeapBindInfo(address()); }
        /** @return a {@link VkBindHeapInfoEXT} view of the struct pointed to by the {@code pResourceHeapBindInfo} field. */
        @NativeType("VkBindHeapInfoEXT const *")
        public @Nullable VkBindHeapInfoEXT pResourceHeapBindInfo() { return VkCommandBufferInheritanceDescriptorHeapInfoEXT.npResourceHeapBindInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceDescriptorHeapInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT} value to the {@code sType} field. */
        public VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferInheritanceDescriptorHeapInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkBindHeapInfoEXT} to the {@code pSamplerHeapBindInfo} field. */
        public VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer pSamplerHeapBindInfo(@Nullable @NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT value) { VkCommandBufferInheritanceDescriptorHeapInfoEXT.npSamplerHeapBindInfo(address(), value); return this; }
        /** Sets the address of the specified {@link VkBindHeapInfoEXT} to the {@code pResourceHeapBindInfo} field. */
        public VkCommandBufferInheritanceDescriptorHeapInfoEXT.Buffer pResourceHeapBindInfo(@Nullable @NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT value) { VkCommandBufferInheritanceDescriptorHeapInfoEXT.npResourceHeapBindInfo(address(), value); return this; }

    }

}