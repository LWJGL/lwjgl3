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
 * union VkDescriptorMappingSourceDataEXT {
 *     {@link VkDescriptorMappingSourceConstantOffsetEXT VkDescriptorMappingSourceConstantOffsetEXT} constantOffset;
 *     {@link VkDescriptorMappingSourcePushIndexEXT VkDescriptorMappingSourcePushIndexEXT} pushIndex;
 *     {@link VkDescriptorMappingSourceIndirectIndexEXT VkDescriptorMappingSourceIndirectIndexEXT} indirectIndex;
 *     {@link VkDescriptorMappingSourceIndirectIndexArrayEXT VkDescriptorMappingSourceIndirectIndexArrayEXT} indirectIndexArray;
 *     {@link VkDescriptorMappingSourceHeapDataEXT VkDescriptorMappingSourceHeapDataEXT} heapData;
 *     uint32_t pushDataOffset;
 *     uint32_t pushAddressOffset;
 *     {@link VkDescriptorMappingSourceIndirectAddressEXT VkDescriptorMappingSourceIndirectAddressEXT} indirectAddress;
 *     {@link VkDescriptorMappingSourceShaderRecordIndexEXT VkDescriptorMappingSourceShaderRecordIndexEXT} shaderRecordIndex;
 *     uint32_t shaderRecordDataOffset;
 *     uint32_t shaderRecordAddressOffset;
 * }</code></pre>
 */
public class VkDescriptorMappingSourceDataEXT extends Struct<VkDescriptorMappingSourceDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONSTANTOFFSET,
        PUSHINDEX,
        INDIRECTINDEX,
        INDIRECTINDEXARRAY,
        HEAPDATA,
        PUSHDATAOFFSET,
        PUSHADDRESSOFFSET,
        INDIRECTADDRESS,
        SHADERRECORDINDEX,
        SHADERRECORDDATAOFFSET,
        SHADERRECORDADDRESSOFFSET;

    static {
        Layout layout = __union(
            __member(VkDescriptorMappingSourceConstantOffsetEXT.SIZEOF, VkDescriptorMappingSourceConstantOffsetEXT.ALIGNOF),
            __member(VkDescriptorMappingSourcePushIndexEXT.SIZEOF, VkDescriptorMappingSourcePushIndexEXT.ALIGNOF),
            __member(VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF, VkDescriptorMappingSourceIndirectIndexEXT.ALIGNOF),
            __member(VkDescriptorMappingSourceIndirectIndexArrayEXT.SIZEOF, VkDescriptorMappingSourceIndirectIndexArrayEXT.ALIGNOF),
            __member(VkDescriptorMappingSourceHeapDataEXT.SIZEOF, VkDescriptorMappingSourceHeapDataEXT.ALIGNOF),
            __member(4),
            __member(4),
            __member(VkDescriptorMappingSourceIndirectAddressEXT.SIZEOF, VkDescriptorMappingSourceIndirectAddressEXT.ALIGNOF),
            __member(VkDescriptorMappingSourceShaderRecordIndexEXT.SIZEOF, VkDescriptorMappingSourceShaderRecordIndexEXT.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CONSTANTOFFSET = layout.offsetof(0);
        PUSHINDEX = layout.offsetof(1);
        INDIRECTINDEX = layout.offsetof(2);
        INDIRECTINDEXARRAY = layout.offsetof(3);
        HEAPDATA = layout.offsetof(4);
        PUSHDATAOFFSET = layout.offsetof(5);
        PUSHADDRESSOFFSET = layout.offsetof(6);
        INDIRECTADDRESS = layout.offsetof(7);
        SHADERRECORDINDEX = layout.offsetof(8);
        SHADERRECORDDATAOFFSET = layout.offsetof(9);
        SHADERRECORDADDRESSOFFSET = layout.offsetof(10);
    }

    protected VkDescriptorMappingSourceDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorMappingSourceDataEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorMappingSourceDataEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorMappingSourceDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorMappingSourceDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkDescriptorMappingSourceConstantOffsetEXT} view of the {@code constantOffset} field. */
    public VkDescriptorMappingSourceConstantOffsetEXT constantOffset() { return nconstantOffset(address()); }
    /** @return a {@link VkDescriptorMappingSourcePushIndexEXT} view of the {@code pushIndex} field. */
    public VkDescriptorMappingSourcePushIndexEXT pushIndex() { return npushIndex(address()); }
    /** @return a {@link VkDescriptorMappingSourceIndirectIndexEXT} view of the {@code indirectIndex} field. */
    public VkDescriptorMappingSourceIndirectIndexEXT indirectIndex() { return nindirectIndex(address()); }
    /** @return a {@link VkDescriptorMappingSourceIndirectIndexArrayEXT} view of the {@code indirectIndexArray} field. */
    public VkDescriptorMappingSourceIndirectIndexArrayEXT indirectIndexArray() { return nindirectIndexArray(address()); }
    /** @return a {@link VkDescriptorMappingSourceHeapDataEXT} view of the {@code heapData} field. */
    public VkDescriptorMappingSourceHeapDataEXT heapData() { return nheapData(address()); }
    /** @return the value of the {@code pushDataOffset} field. */
    @NativeType("uint32_t")
    public int pushDataOffset() { return npushDataOffset(address()); }
    /** @return the value of the {@code pushAddressOffset} field. */
    @NativeType("uint32_t")
    public int pushAddressOffset() { return npushAddressOffset(address()); }
    /** @return a {@link VkDescriptorMappingSourceIndirectAddressEXT} view of the {@code indirectAddress} field. */
    public VkDescriptorMappingSourceIndirectAddressEXT indirectAddress() { return nindirectAddress(address()); }
    /** @return a {@link VkDescriptorMappingSourceShaderRecordIndexEXT} view of the {@code shaderRecordIndex} field. */
    public VkDescriptorMappingSourceShaderRecordIndexEXT shaderRecordIndex() { return nshaderRecordIndex(address()); }
    /** @return the value of the {@code shaderRecordDataOffset} field. */
    @NativeType("uint32_t")
    public int shaderRecordDataOffset() { return nshaderRecordDataOffset(address()); }
    /** @return the value of the {@code shaderRecordAddressOffset} field. */
    @NativeType("uint32_t")
    public int shaderRecordAddressOffset() { return nshaderRecordAddressOffset(address()); }

    /** Copies the specified {@link VkDescriptorMappingSourceConstantOffsetEXT} to the {@code constantOffset} field. */
    public VkDescriptorMappingSourceDataEXT constantOffset(VkDescriptorMappingSourceConstantOffsetEXT value) { nconstantOffset(address(), value); return this; }
    /** Passes the {@code constantOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDescriptorMappingSourceDataEXT constantOffset(java.util.function.Consumer<VkDescriptorMappingSourceConstantOffsetEXT> consumer) { consumer.accept(constantOffset()); return this; }
    /** Copies the specified {@link VkDescriptorMappingSourcePushIndexEXT} to the {@code pushIndex} field. */
    public VkDescriptorMappingSourceDataEXT pushIndex(VkDescriptorMappingSourcePushIndexEXT value) { npushIndex(address(), value); return this; }
    /** Passes the {@code pushIndex} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDescriptorMappingSourceDataEXT pushIndex(java.util.function.Consumer<VkDescriptorMappingSourcePushIndexEXT> consumer) { consumer.accept(pushIndex()); return this; }
    /** Copies the specified {@link VkDescriptorMappingSourceIndirectIndexEXT} to the {@code indirectIndex} field. */
    public VkDescriptorMappingSourceDataEXT indirectIndex(VkDescriptorMappingSourceIndirectIndexEXT value) { nindirectIndex(address(), value); return this; }
    /** Passes the {@code indirectIndex} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDescriptorMappingSourceDataEXT indirectIndex(java.util.function.Consumer<VkDescriptorMappingSourceIndirectIndexEXT> consumer) { consumer.accept(indirectIndex()); return this; }
    /** Copies the specified {@link VkDescriptorMappingSourceIndirectIndexArrayEXT} to the {@code indirectIndexArray} field. */
    public VkDescriptorMappingSourceDataEXT indirectIndexArray(VkDescriptorMappingSourceIndirectIndexArrayEXT value) { nindirectIndexArray(address(), value); return this; }
    /** Passes the {@code indirectIndexArray} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDescriptorMappingSourceDataEXT indirectIndexArray(java.util.function.Consumer<VkDescriptorMappingSourceIndirectIndexArrayEXT> consumer) { consumer.accept(indirectIndexArray()); return this; }
    /** Copies the specified {@link VkDescriptorMappingSourceHeapDataEXT} to the {@code heapData} field. */
    public VkDescriptorMappingSourceDataEXT heapData(VkDescriptorMappingSourceHeapDataEXT value) { nheapData(address(), value); return this; }
    /** Passes the {@code heapData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDescriptorMappingSourceDataEXT heapData(java.util.function.Consumer<VkDescriptorMappingSourceHeapDataEXT> consumer) { consumer.accept(heapData()); return this; }
    /** Sets the specified value to the {@code pushDataOffset} field. */
    public VkDescriptorMappingSourceDataEXT pushDataOffset(@NativeType("uint32_t") int value) { npushDataOffset(address(), value); return this; }
    /** Sets the specified value to the {@code pushAddressOffset} field. */
    public VkDescriptorMappingSourceDataEXT pushAddressOffset(@NativeType("uint32_t") int value) { npushAddressOffset(address(), value); return this; }
    /** Copies the specified {@link VkDescriptorMappingSourceIndirectAddressEXT} to the {@code indirectAddress} field. */
    public VkDescriptorMappingSourceDataEXT indirectAddress(VkDescriptorMappingSourceIndirectAddressEXT value) { nindirectAddress(address(), value); return this; }
    /** Passes the {@code indirectAddress} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDescriptorMappingSourceDataEXT indirectAddress(java.util.function.Consumer<VkDescriptorMappingSourceIndirectAddressEXT> consumer) { consumer.accept(indirectAddress()); return this; }
    /** Copies the specified {@link VkDescriptorMappingSourceShaderRecordIndexEXT} to the {@code shaderRecordIndex} field. */
    public VkDescriptorMappingSourceDataEXT shaderRecordIndex(VkDescriptorMappingSourceShaderRecordIndexEXT value) { nshaderRecordIndex(address(), value); return this; }
    /** Passes the {@code shaderRecordIndex} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDescriptorMappingSourceDataEXT shaderRecordIndex(java.util.function.Consumer<VkDescriptorMappingSourceShaderRecordIndexEXT> consumer) { consumer.accept(shaderRecordIndex()); return this; }
    /** Sets the specified value to the {@code shaderRecordDataOffset} field. */
    public VkDescriptorMappingSourceDataEXT shaderRecordDataOffset(@NativeType("uint32_t") int value) { nshaderRecordDataOffset(address(), value); return this; }
    /** Sets the specified value to the {@code shaderRecordAddressOffset} field. */
    public VkDescriptorMappingSourceDataEXT shaderRecordAddressOffset(@NativeType("uint32_t") int value) { nshaderRecordAddressOffset(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorMappingSourceDataEXT set(VkDescriptorMappingSourceDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorMappingSourceDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceDataEXT malloc() {
        return new VkDescriptorMappingSourceDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceDataEXT calloc() {
        return new VkDescriptorMappingSourceDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceDataEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorMappingSourceDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorMappingSourceDataEXT} instance for the specified memory address. */
    public static VkDescriptorMappingSourceDataEXT create(long address) {
        return new VkDescriptorMappingSourceDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorMappingSourceDataEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorMappingSourceDataEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorMappingSourceDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorMappingSourceDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceDataEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceDataEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #constantOffset}. */
    public static VkDescriptorMappingSourceConstantOffsetEXT nconstantOffset(long struct) { return VkDescriptorMappingSourceConstantOffsetEXT.create(struct + VkDescriptorMappingSourceDataEXT.CONSTANTOFFSET); }
    /** Unsafe version of {@link #pushIndex}. */
    public static VkDescriptorMappingSourcePushIndexEXT npushIndex(long struct) { return VkDescriptorMappingSourcePushIndexEXT.create(struct + VkDescriptorMappingSourceDataEXT.PUSHINDEX); }
    /** Unsafe version of {@link #indirectIndex}. */
    public static VkDescriptorMappingSourceIndirectIndexEXT nindirectIndex(long struct) { return VkDescriptorMappingSourceIndirectIndexEXT.create(struct + VkDescriptorMappingSourceDataEXT.INDIRECTINDEX); }
    /** Unsafe version of {@link #indirectIndexArray}. */
    public static VkDescriptorMappingSourceIndirectIndexArrayEXT nindirectIndexArray(long struct) { return VkDescriptorMappingSourceIndirectIndexArrayEXT.create(struct + VkDescriptorMappingSourceDataEXT.INDIRECTINDEXARRAY); }
    /** Unsafe version of {@link #heapData}. */
    public static VkDescriptorMappingSourceHeapDataEXT nheapData(long struct) { return VkDescriptorMappingSourceHeapDataEXT.create(struct + VkDescriptorMappingSourceDataEXT.HEAPDATA); }
    /** Unsafe version of {@link #pushDataOffset}. */
    public static int npushDataOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceDataEXT.PUSHDATAOFFSET); }
    /** Unsafe version of {@link #pushAddressOffset}. */
    public static int npushAddressOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceDataEXT.PUSHADDRESSOFFSET); }
    /** Unsafe version of {@link #indirectAddress}. */
    public static VkDescriptorMappingSourceIndirectAddressEXT nindirectAddress(long struct) { return VkDescriptorMappingSourceIndirectAddressEXT.create(struct + VkDescriptorMappingSourceDataEXT.INDIRECTADDRESS); }
    /** Unsafe version of {@link #shaderRecordIndex}. */
    public static VkDescriptorMappingSourceShaderRecordIndexEXT nshaderRecordIndex(long struct) { return VkDescriptorMappingSourceShaderRecordIndexEXT.create(struct + VkDescriptorMappingSourceDataEXT.SHADERRECORDINDEX); }
    /** Unsafe version of {@link #shaderRecordDataOffset}. */
    public static int nshaderRecordDataOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceDataEXT.SHADERRECORDDATAOFFSET); }
    /** Unsafe version of {@link #shaderRecordAddressOffset}. */
    public static int nshaderRecordAddressOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceDataEXT.SHADERRECORDADDRESSOFFSET); }

    /** Unsafe version of {@link #constantOffset(VkDescriptorMappingSourceConstantOffsetEXT) constantOffset}. */
    public static void nconstantOffset(long struct, VkDescriptorMappingSourceConstantOffsetEXT value) { memCopy(value.address(), struct + VkDescriptorMappingSourceDataEXT.CONSTANTOFFSET, VkDescriptorMappingSourceConstantOffsetEXT.SIZEOF); }
    /** Unsafe version of {@link #pushIndex(VkDescriptorMappingSourcePushIndexEXT) pushIndex}. */
    public static void npushIndex(long struct, VkDescriptorMappingSourcePushIndexEXT value) { memCopy(value.address(), struct + VkDescriptorMappingSourceDataEXT.PUSHINDEX, VkDescriptorMappingSourcePushIndexEXT.SIZEOF); }
    /** Unsafe version of {@link #indirectIndex(VkDescriptorMappingSourceIndirectIndexEXT) indirectIndex}. */
    public static void nindirectIndex(long struct, VkDescriptorMappingSourceIndirectIndexEXT value) { memCopy(value.address(), struct + VkDescriptorMappingSourceDataEXT.INDIRECTINDEX, VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF); }
    /** Unsafe version of {@link #indirectIndexArray(VkDescriptorMappingSourceIndirectIndexArrayEXT) indirectIndexArray}. */
    public static void nindirectIndexArray(long struct, VkDescriptorMappingSourceIndirectIndexArrayEXT value) { memCopy(value.address(), struct + VkDescriptorMappingSourceDataEXT.INDIRECTINDEXARRAY, VkDescriptorMappingSourceIndirectIndexArrayEXT.SIZEOF); }
    /** Unsafe version of {@link #heapData(VkDescriptorMappingSourceHeapDataEXT) heapData}. */
    public static void nheapData(long struct, VkDescriptorMappingSourceHeapDataEXT value) { memCopy(value.address(), struct + VkDescriptorMappingSourceDataEXT.HEAPDATA, VkDescriptorMappingSourceHeapDataEXT.SIZEOF); }
    /** Unsafe version of {@link #pushDataOffset(int) pushDataOffset}. */
    public static void npushDataOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceDataEXT.PUSHDATAOFFSET, value); }
    /** Unsafe version of {@link #pushAddressOffset(int) pushAddressOffset}. */
    public static void npushAddressOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceDataEXT.PUSHADDRESSOFFSET, value); }
    /** Unsafe version of {@link #indirectAddress(VkDescriptorMappingSourceIndirectAddressEXT) indirectAddress}. */
    public static void nindirectAddress(long struct, VkDescriptorMappingSourceIndirectAddressEXT value) { memCopy(value.address(), struct + VkDescriptorMappingSourceDataEXT.INDIRECTADDRESS, VkDescriptorMappingSourceIndirectAddressEXT.SIZEOF); }
    /** Unsafe version of {@link #shaderRecordIndex(VkDescriptorMappingSourceShaderRecordIndexEXT) shaderRecordIndex}. */
    public static void nshaderRecordIndex(long struct, VkDescriptorMappingSourceShaderRecordIndexEXT value) { memCopy(value.address(), struct + VkDescriptorMappingSourceDataEXT.SHADERRECORDINDEX, VkDescriptorMappingSourceShaderRecordIndexEXT.SIZEOF); }
    /** Unsafe version of {@link #shaderRecordDataOffset(int) shaderRecordDataOffset}. */
    public static void nshaderRecordDataOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceDataEXT.SHADERRECORDDATAOFFSET, value); }
    /** Unsafe version of {@link #shaderRecordAddressOffset(int) shaderRecordAddressOffset}. */
    public static void nshaderRecordAddressOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceDataEXT.SHADERRECORDADDRESSOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorMappingSourceDataEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceDataEXT, Buffer> implements NativeResource {

        private static final VkDescriptorMappingSourceDataEXT ELEMENT_FACTORY = VkDescriptorMappingSourceDataEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorMappingSourceDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorMappingSourceDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorMappingSourceDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkDescriptorMappingSourceConstantOffsetEXT} view of the {@code constantOffset} field. */
        public VkDescriptorMappingSourceConstantOffsetEXT constantOffset() { return VkDescriptorMappingSourceDataEXT.nconstantOffset(address()); }
        /** @return a {@link VkDescriptorMappingSourcePushIndexEXT} view of the {@code pushIndex} field. */
        public VkDescriptorMappingSourcePushIndexEXT pushIndex() { return VkDescriptorMappingSourceDataEXT.npushIndex(address()); }
        /** @return a {@link VkDescriptorMappingSourceIndirectIndexEXT} view of the {@code indirectIndex} field. */
        public VkDescriptorMappingSourceIndirectIndexEXT indirectIndex() { return VkDescriptorMappingSourceDataEXT.nindirectIndex(address()); }
        /** @return a {@link VkDescriptorMappingSourceIndirectIndexArrayEXT} view of the {@code indirectIndexArray} field. */
        public VkDescriptorMappingSourceIndirectIndexArrayEXT indirectIndexArray() { return VkDescriptorMappingSourceDataEXT.nindirectIndexArray(address()); }
        /** @return a {@link VkDescriptorMappingSourceHeapDataEXT} view of the {@code heapData} field. */
        public VkDescriptorMappingSourceHeapDataEXT heapData() { return VkDescriptorMappingSourceDataEXT.nheapData(address()); }
        /** @return the value of the {@code pushDataOffset} field. */
        @NativeType("uint32_t")
        public int pushDataOffset() { return VkDescriptorMappingSourceDataEXT.npushDataOffset(address()); }
        /** @return the value of the {@code pushAddressOffset} field. */
        @NativeType("uint32_t")
        public int pushAddressOffset() { return VkDescriptorMappingSourceDataEXT.npushAddressOffset(address()); }
        /** @return a {@link VkDescriptorMappingSourceIndirectAddressEXT} view of the {@code indirectAddress} field. */
        public VkDescriptorMappingSourceIndirectAddressEXT indirectAddress() { return VkDescriptorMappingSourceDataEXT.nindirectAddress(address()); }
        /** @return a {@link VkDescriptorMappingSourceShaderRecordIndexEXT} view of the {@code shaderRecordIndex} field. */
        public VkDescriptorMappingSourceShaderRecordIndexEXT shaderRecordIndex() { return VkDescriptorMappingSourceDataEXT.nshaderRecordIndex(address()); }
        /** @return the value of the {@code shaderRecordDataOffset} field. */
        @NativeType("uint32_t")
        public int shaderRecordDataOffset() { return VkDescriptorMappingSourceDataEXT.nshaderRecordDataOffset(address()); }
        /** @return the value of the {@code shaderRecordAddressOffset} field. */
        @NativeType("uint32_t")
        public int shaderRecordAddressOffset() { return VkDescriptorMappingSourceDataEXT.nshaderRecordAddressOffset(address()); }

        /** Copies the specified {@link VkDescriptorMappingSourceConstantOffsetEXT} to the {@code constantOffset} field. */
        public VkDescriptorMappingSourceDataEXT.Buffer constantOffset(VkDescriptorMappingSourceConstantOffsetEXT value) { VkDescriptorMappingSourceDataEXT.nconstantOffset(address(), value); return this; }
        /** Passes the {@code constantOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDescriptorMappingSourceDataEXT.Buffer constantOffset(java.util.function.Consumer<VkDescriptorMappingSourceConstantOffsetEXT> consumer) { consumer.accept(constantOffset()); return this; }
        /** Copies the specified {@link VkDescriptorMappingSourcePushIndexEXT} to the {@code pushIndex} field. */
        public VkDescriptorMappingSourceDataEXT.Buffer pushIndex(VkDescriptorMappingSourcePushIndexEXT value) { VkDescriptorMappingSourceDataEXT.npushIndex(address(), value); return this; }
        /** Passes the {@code pushIndex} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDescriptorMappingSourceDataEXT.Buffer pushIndex(java.util.function.Consumer<VkDescriptorMappingSourcePushIndexEXT> consumer) { consumer.accept(pushIndex()); return this; }
        /** Copies the specified {@link VkDescriptorMappingSourceIndirectIndexEXT} to the {@code indirectIndex} field. */
        public VkDescriptorMappingSourceDataEXT.Buffer indirectIndex(VkDescriptorMappingSourceIndirectIndexEXT value) { VkDescriptorMappingSourceDataEXT.nindirectIndex(address(), value); return this; }
        /** Passes the {@code indirectIndex} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDescriptorMappingSourceDataEXT.Buffer indirectIndex(java.util.function.Consumer<VkDescriptorMappingSourceIndirectIndexEXT> consumer) { consumer.accept(indirectIndex()); return this; }
        /** Copies the specified {@link VkDescriptorMappingSourceIndirectIndexArrayEXT} to the {@code indirectIndexArray} field. */
        public VkDescriptorMappingSourceDataEXT.Buffer indirectIndexArray(VkDescriptorMappingSourceIndirectIndexArrayEXT value) { VkDescriptorMappingSourceDataEXT.nindirectIndexArray(address(), value); return this; }
        /** Passes the {@code indirectIndexArray} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDescriptorMappingSourceDataEXT.Buffer indirectIndexArray(java.util.function.Consumer<VkDescriptorMappingSourceIndirectIndexArrayEXT> consumer) { consumer.accept(indirectIndexArray()); return this; }
        /** Copies the specified {@link VkDescriptorMappingSourceHeapDataEXT} to the {@code heapData} field. */
        public VkDescriptorMappingSourceDataEXT.Buffer heapData(VkDescriptorMappingSourceHeapDataEXT value) { VkDescriptorMappingSourceDataEXT.nheapData(address(), value); return this; }
        /** Passes the {@code heapData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDescriptorMappingSourceDataEXT.Buffer heapData(java.util.function.Consumer<VkDescriptorMappingSourceHeapDataEXT> consumer) { consumer.accept(heapData()); return this; }
        /** Sets the specified value to the {@code pushDataOffset} field. */
        public VkDescriptorMappingSourceDataEXT.Buffer pushDataOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceDataEXT.npushDataOffset(address(), value); return this; }
        /** Sets the specified value to the {@code pushAddressOffset} field. */
        public VkDescriptorMappingSourceDataEXT.Buffer pushAddressOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceDataEXT.npushAddressOffset(address(), value); return this; }
        /** Copies the specified {@link VkDescriptorMappingSourceIndirectAddressEXT} to the {@code indirectAddress} field. */
        public VkDescriptorMappingSourceDataEXT.Buffer indirectAddress(VkDescriptorMappingSourceIndirectAddressEXT value) { VkDescriptorMappingSourceDataEXT.nindirectAddress(address(), value); return this; }
        /** Passes the {@code indirectAddress} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDescriptorMappingSourceDataEXT.Buffer indirectAddress(java.util.function.Consumer<VkDescriptorMappingSourceIndirectAddressEXT> consumer) { consumer.accept(indirectAddress()); return this; }
        /** Copies the specified {@link VkDescriptorMappingSourceShaderRecordIndexEXT} to the {@code shaderRecordIndex} field. */
        public VkDescriptorMappingSourceDataEXT.Buffer shaderRecordIndex(VkDescriptorMappingSourceShaderRecordIndexEXT value) { VkDescriptorMappingSourceDataEXT.nshaderRecordIndex(address(), value); return this; }
        /** Passes the {@code shaderRecordIndex} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDescriptorMappingSourceDataEXT.Buffer shaderRecordIndex(java.util.function.Consumer<VkDescriptorMappingSourceShaderRecordIndexEXT> consumer) { consumer.accept(shaderRecordIndex()); return this; }
        /** Sets the specified value to the {@code shaderRecordDataOffset} field. */
        public VkDescriptorMappingSourceDataEXT.Buffer shaderRecordDataOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceDataEXT.nshaderRecordDataOffset(address(), value); return this; }
        /** Sets the specified value to the {@code shaderRecordAddressOffset} field. */
        public VkDescriptorMappingSourceDataEXT.Buffer shaderRecordAddressOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceDataEXT.nshaderRecordAddressOffset(address(), value); return this; }

    }

}