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
 * struct VkPushDataInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t offset;
 *     {@link VkHostAddressRangeConstEXT VkHostAddressRangeConstEXT} data;
 * }</code></pre>
 */
public class VkPushDataInfoEXT extends Struct<VkPushDataInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OFFSET,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkHostAddressRangeConstEXT.SIZEOF, VkHostAddressRangeConstEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
        DATA = layout.offsetof(3);
    }

    protected VkPushDataInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPushDataInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPushDataInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPushDataInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushDataInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code offset} field. */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }
    /** @return a {@link VkHostAddressRangeConstEXT} view of the {@code data} field. */
    public VkHostAddressRangeConstEXT data() { return ndata(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPushDataInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_PUSH_DATA_INFO_EXT STRUCTURE_TYPE_PUSH_DATA_INFO_EXT} value to the {@code sType} field. */
    public VkPushDataInfoEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PUSH_DATA_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPushDataInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPushConstantBankInfoNV} value to the {@code pNext} chain. */
    public VkPushDataInfoEXT pNext(VkPushConstantBankInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code offset} field. */
    public VkPushDataInfoEXT offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }
    /** Copies the specified {@link VkHostAddressRangeConstEXT} to the {@code data} field. */
    public VkPushDataInfoEXT data(VkHostAddressRangeConstEXT value) { ndata(address(), value); return this; }
    /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPushDataInfoEXT data(java.util.function.Consumer<VkHostAddressRangeConstEXT> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public VkPushDataInfoEXT set(
        int sType,
        long pNext,
        int offset,
        VkHostAddressRangeConstEXT data
    ) {
        sType(sType);
        pNext(pNext);
        offset(offset);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPushDataInfoEXT set(VkPushDataInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPushDataInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushDataInfoEXT malloc() {
        return new VkPushDataInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPushDataInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushDataInfoEXT calloc() {
        return new VkPushDataInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPushDataInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPushDataInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushDataInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPushDataInfoEXT} instance for the specified memory address. */
    public static VkPushDataInfoEXT create(long address) {
        return new VkPushDataInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPushDataInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPushDataInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPushDataInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDataInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPushDataInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDataInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDataInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDataInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPushDataInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPushDataInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPushDataInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPushDataInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDataInfoEXT malloc(MemoryStack stack) {
        return new VkPushDataInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPushDataInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDataInfoEXT calloc(MemoryStack stack) {
        return new VkPushDataInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPushDataInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDataInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDataInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDataInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPushDataInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPushDataInfoEXT.PNEXT); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + VkPushDataInfoEXT.OFFSET); }
    /** Unsafe version of {@link #data}. */
    public static VkHostAddressRangeConstEXT ndata(long struct) { return VkHostAddressRangeConstEXT.create(struct + VkPushDataInfoEXT.DATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPushDataInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPushDataInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + VkPushDataInfoEXT.OFFSET, value); }
    /** Unsafe version of {@link #data(VkHostAddressRangeConstEXT) data}. */
    public static void ndata(long struct, VkHostAddressRangeConstEXT value) { memCopy(value.address(), struct + VkPushDataInfoEXT.DATA, VkHostAddressRangeConstEXT.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        VkHostAddressRangeConstEXT.validate(struct + VkPushDataInfoEXT.DATA);
    }

    // -----------------------------------

    /** An array of {@link VkPushDataInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPushDataInfoEXT, Buffer> implements NativeResource {

        private static final VkPushDataInfoEXT ELEMENT_FACTORY = VkPushDataInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPushDataInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushDataInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPushDataInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPushDataInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPushDataInfoEXT.npNext(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("uint32_t")
        public int offset() { return VkPushDataInfoEXT.noffset(address()); }
        /** @return a {@link VkHostAddressRangeConstEXT} view of the {@code data} field. */
        public VkHostAddressRangeConstEXT data() { return VkPushDataInfoEXT.ndata(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPushDataInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPushDataInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_PUSH_DATA_INFO_EXT STRUCTURE_TYPE_PUSH_DATA_INFO_EXT} value to the {@code sType} field. */
        public VkPushDataInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PUSH_DATA_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPushDataInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPushDataInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPushConstantBankInfoNV} value to the {@code pNext} chain. */
        public VkPushDataInfoEXT.Buffer pNext(VkPushConstantBankInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code offset} field. */
        public VkPushDataInfoEXT.Buffer offset(@NativeType("uint32_t") int value) { VkPushDataInfoEXT.noffset(address(), value); return this; }
        /** Copies the specified {@link VkHostAddressRangeConstEXT} to the {@code data} field. */
        public VkPushDataInfoEXT.Buffer data(VkHostAddressRangeConstEXT value) { VkPushDataInfoEXT.ndata(address(), value); return this; }
        /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPushDataInfoEXT.Buffer data(java.util.function.Consumer<VkHostAddressRangeConstEXT> consumer) { consumer.accept(data()); return this; }

    }

}