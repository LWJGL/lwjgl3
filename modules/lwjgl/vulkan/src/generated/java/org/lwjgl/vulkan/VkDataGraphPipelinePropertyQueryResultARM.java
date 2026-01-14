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
 * struct VkDataGraphPipelinePropertyQueryResultARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDataGraphPipelinePropertyARM property;
 *     VkBool32 isText;
 *     size_t dataSize;
 *     void * pData;
 * }}</pre>
 */
public class VkDataGraphPipelinePropertyQueryResultARM extends Struct<VkDataGraphPipelinePropertyQueryResultARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROPERTY,
        ISTEXT,
        DATASIZE,
        PDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROPERTY = layout.offsetof(2);
        ISTEXT = layout.offsetof(3);
        DATASIZE = layout.offsetof(4);
        PDATA = layout.offsetof(5);
    }

    protected VkDataGraphPipelinePropertyQueryResultARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelinePropertyQueryResultARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelinePropertyQueryResultARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelinePropertyQueryResultARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelinePropertyQueryResultARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code property} field. */
    @NativeType("VkDataGraphPipelinePropertyARM")
    public int property() { return nproperty(address()); }
    /** @return the value of the {@code isText} field. */
    @NativeType("VkBool32")
    public boolean isText() { return nisText(address()) != 0; }
    /** @return the value of the {@code dataSize} field. */
    @NativeType("size_t")
    public long dataSize() { return ndataSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
    @NativeType("void *")
    public @Nullable ByteBuffer pData() { return npData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelinePropertyQueryResultARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelinePropertyQueryResultARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelinePropertyQueryResultARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code property} field. */
    public VkDataGraphPipelinePropertyQueryResultARM property(@NativeType("VkDataGraphPipelinePropertyARM") int value) { nproperty(address(), value); return this; }
    /** Sets the specified value to the {@code isText} field. */
    public VkDataGraphPipelinePropertyQueryResultARM isText(@NativeType("VkBool32") boolean value) { nisText(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dataSize} field. */
    public VkDataGraphPipelinePropertyQueryResultARM dataSize(@NativeType("size_t") long value) { ndataSize(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
    public VkDataGraphPipelinePropertyQueryResultARM pData(@Nullable @NativeType("void *") ByteBuffer value) { npData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelinePropertyQueryResultARM set(
        int sType,
        long pNext,
        int property,
        boolean isText,
        long dataSize,
        @Nullable ByteBuffer pData
    ) {
        sType(sType);
        pNext(pNext);
        property(property);
        isText(isText);
        dataSize(dataSize);
        pData(pData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelinePropertyQueryResultARM set(VkDataGraphPipelinePropertyQueryResultARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelinePropertyQueryResultARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelinePropertyQueryResultARM malloc() {
        return new VkDataGraphPipelinePropertyQueryResultARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelinePropertyQueryResultARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelinePropertyQueryResultARM calloc() {
        return new VkDataGraphPipelinePropertyQueryResultARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelinePropertyQueryResultARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelinePropertyQueryResultARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelinePropertyQueryResultARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelinePropertyQueryResultARM} instance for the specified memory address. */
    public static VkDataGraphPipelinePropertyQueryResultARM create(long address) {
        return new VkDataGraphPipelinePropertyQueryResultARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelinePropertyQueryResultARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelinePropertyQueryResultARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelinePropertyQueryResultARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelinePropertyQueryResultARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelinePropertyQueryResultARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelinePropertyQueryResultARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelinePropertyQueryResultARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelinePropertyQueryResultARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelinePropertyQueryResultARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelinePropertyQueryResultARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelinePropertyQueryResultARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelinePropertyQueryResultARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelinePropertyQueryResultARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelinePropertyQueryResultARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelinePropertyQueryResultARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelinePropertyQueryResultARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelinePropertyQueryResultARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelinePropertyQueryResultARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelinePropertyQueryResultARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelinePropertyQueryResultARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelinePropertyQueryResultARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelinePropertyQueryResultARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelinePropertyQueryResultARM.PNEXT); }
    /** Unsafe version of {@link #property}. */
    public static int nproperty(long struct) { return memGetInt(struct + VkDataGraphPipelinePropertyQueryResultARM.PROPERTY); }
    /** Unsafe version of {@link #isText}. */
    public static int nisText(long struct) { return memGetInt(struct + VkDataGraphPipelinePropertyQueryResultARM.ISTEXT); }
    /** Unsafe version of {@link #dataSize}. */
    public static long ndataSize(long struct) { return memGetAddress(struct + VkDataGraphPipelinePropertyQueryResultARM.DATASIZE); }
    /** Unsafe version of {@link #pData() pData}. */
    public static @Nullable ByteBuffer npData(long struct) { return memByteBufferSafe(memGetAddress(struct + VkDataGraphPipelinePropertyQueryResultARM.PDATA), (int)ndataSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelinePropertyQueryResultARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelinePropertyQueryResultARM.PNEXT, value); }
    /** Unsafe version of {@link #property(int) property}. */
    public static void nproperty(long struct, int value) { memPutInt(struct + VkDataGraphPipelinePropertyQueryResultARM.PROPERTY, value); }
    /** Unsafe version of {@link #isText(boolean) isText}. */
    public static void nisText(long struct, int value) { memPutInt(struct + VkDataGraphPipelinePropertyQueryResultARM.ISTEXT, value); }
    /** Sets the specified value to the {@code dataSize} field of the specified {@code struct}. */
    public static void ndataSize(long struct, long value) { memPutAddress(struct + VkDataGraphPipelinePropertyQueryResultARM.DATASIZE, value); }
    /** Unsafe version of {@link #pData(ByteBuffer) pData}. */
    public static void npData(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + VkDataGraphPipelinePropertyQueryResultARM.PDATA, memAddressSafe(value)); if (value != null) { ndataSize(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelinePropertyQueryResultARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelinePropertyQueryResultARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelinePropertyQueryResultARM ELEMENT_FACTORY = VkDataGraphPipelinePropertyQueryResultARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelinePropertyQueryResultARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelinePropertyQueryResultARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelinePropertyQueryResultARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelinePropertyQueryResultARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDataGraphPipelinePropertyQueryResultARM.npNext(address()); }
        /** @return the value of the {@code property} field. */
        @NativeType("VkDataGraphPipelinePropertyARM")
        public int property() { return VkDataGraphPipelinePropertyQueryResultARM.nproperty(address()); }
        /** @return the value of the {@code isText} field. */
        @NativeType("VkBool32")
        public boolean isText() { return VkDataGraphPipelinePropertyQueryResultARM.nisText(address()) != 0; }
        /** @return the value of the {@code dataSize} field. */
        @NativeType("size_t")
        public long dataSize() { return VkDataGraphPipelinePropertyQueryResultARM.ndataSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
        @NativeType("void *")
        public @Nullable ByteBuffer pData() { return VkDataGraphPipelinePropertyQueryResultARM.npData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelinePropertyQueryResultARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelinePropertyQueryResultARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelinePropertyQueryResultARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelinePropertyQueryResultARM.Buffer pNext(@NativeType("void *") long value) { VkDataGraphPipelinePropertyQueryResultARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code property} field. */
        public VkDataGraphPipelinePropertyQueryResultARM.Buffer property(@NativeType("VkDataGraphPipelinePropertyARM") int value) { VkDataGraphPipelinePropertyQueryResultARM.nproperty(address(), value); return this; }
        /** Sets the specified value to the {@code isText} field. */
        public VkDataGraphPipelinePropertyQueryResultARM.Buffer isText(@NativeType("VkBool32") boolean value) { VkDataGraphPipelinePropertyQueryResultARM.nisText(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dataSize} field. */
        public VkDataGraphPipelinePropertyQueryResultARM.Buffer dataSize(@NativeType("size_t") long value) { VkDataGraphPipelinePropertyQueryResultARM.ndataSize(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
        public VkDataGraphPipelinePropertyQueryResultARM.Buffer pData(@Nullable @NativeType("void *") ByteBuffer value) { VkDataGraphPipelinePropertyQueryResultARM.npData(address(), value); return this; }

    }

}