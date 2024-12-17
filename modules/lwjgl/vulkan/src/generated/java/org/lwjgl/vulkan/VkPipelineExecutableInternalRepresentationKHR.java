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

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre>{@code
 * struct VkPipelineExecutableInternalRepresentationKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     char name[VK_MAX_DESCRIPTION_SIZE];
 *     char description[VK_MAX_DESCRIPTION_SIZE];
 *     VkBool32 isText;
 *     size_t dataSize;
 *     void * pData;
 * }}</pre>
 */
public class VkPipelineExecutableInternalRepresentationKHR extends Struct<VkPipelineExecutableInternalRepresentationKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NAME,
        DESCRIPTION,
        ISTEXT,
        DATASIZE,
        PDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NAME = layout.offsetof(2);
        DESCRIPTION = layout.offsetof(3);
        ISTEXT = layout.offsetof(4);
        DATASIZE = layout.offsetof(5);
        PDATA = layout.offsetof(6);
    }

    protected VkPipelineExecutableInternalRepresentationKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineExecutableInternalRepresentationKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineExecutableInternalRepresentationKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineExecutableInternalRepresentationKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineExecutableInternalRepresentationKHR(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** @return the null-terminated string stored in the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
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
    public VkPipelineExecutableInternalRepresentationKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR} value to the {@code sType} field. */
    public VkPipelineExecutableInternalRepresentationKHR sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineExecutableInternalRepresentationKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineExecutableInternalRepresentationKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineExecutableInternalRepresentationKHR set(VkPipelineExecutableInternalRepresentationKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutableInternalRepresentationKHR malloc() {
        return new VkPipelineExecutableInternalRepresentationKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutableInternalRepresentationKHR calloc() {
        return new VkPipelineExecutableInternalRepresentationKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineExecutableInternalRepresentationKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineExecutableInternalRepresentationKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance for the specified memory address. */
    public static VkPipelineExecutableInternalRepresentationKHR create(long address) {
        return new VkPipelineExecutableInternalRepresentationKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineExecutableInternalRepresentationKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineExecutableInternalRepresentationKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineExecutableInternalRepresentationKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInternalRepresentationKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInternalRepresentationKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInternalRepresentationKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInternalRepresentationKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInternalRepresentationKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInternalRepresentationKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInternalRepresentationKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInternalRepresentationKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableInternalRepresentationKHR malloc(MemoryStack stack) {
        return new VkPipelineExecutableInternalRepresentationKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableInternalRepresentationKHR calloc(MemoryStack stack) {
        return new VkPipelineExecutableInternalRepresentationKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineExecutableInternalRepresentationKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineExecutableInternalRepresentationKHR.PNEXT); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + VkPipelineExecutableInternalRepresentationKHR.NAME, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + VkPipelineExecutableInternalRepresentationKHR.NAME); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkPipelineExecutableInternalRepresentationKHR.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkPipelineExecutableInternalRepresentationKHR.DESCRIPTION); }
    /** Unsafe version of {@link #isText}. */
    public static int nisText(long struct) { return memGetInt(struct + VkPipelineExecutableInternalRepresentationKHR.ISTEXT); }
    /** Unsafe version of {@link #dataSize}. */
    public static long ndataSize(long struct) { return memGetAddress(struct + VkPipelineExecutableInternalRepresentationKHR.DATASIZE); }
    /** Unsafe version of {@link #pData() pData}. */
    public static @Nullable ByteBuffer npData(long struct) { return memByteBufferSafe(memGetAddress(struct + VkPipelineExecutableInternalRepresentationKHR.PDATA), (int)ndataSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineExecutableInternalRepresentationKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineExecutableInternalRepresentationKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineExecutableInternalRepresentationKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineExecutableInternalRepresentationKHR, Buffer> implements NativeResource {

        private static final VkPipelineExecutableInternalRepresentationKHR ELEMENT_FACTORY = VkPipelineExecutableInternalRepresentationKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineExecutableInternalRepresentationKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineExecutableInternalRepresentationKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineExecutableInternalRepresentationKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineExecutableInternalRepresentationKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPipelineExecutableInternalRepresentationKHR.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer name() { return VkPipelineExecutableInternalRepresentationKHR.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String nameString() { return VkPipelineExecutableInternalRepresentationKHR.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkPipelineExecutableInternalRepresentationKHR.ndescription(address()); }
        /** @return the null-terminated string stored in the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkPipelineExecutableInternalRepresentationKHR.ndescriptionString(address()); }
        /** @return the value of the {@code isText} field. */
        @NativeType("VkBool32")
        public boolean isText() { return VkPipelineExecutableInternalRepresentationKHR.nisText(address()) != 0; }
        /** @return the value of the {@code dataSize} field. */
        @NativeType("size_t")
        public long dataSize() { return VkPipelineExecutableInternalRepresentationKHR.ndataSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
        @NativeType("void *")
        public @Nullable ByteBuffer pData() { return VkPipelineExecutableInternalRepresentationKHR.npData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineExecutableInternalRepresentationKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineExecutableInternalRepresentationKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR} value to the {@code sType} field. */
        public VkPipelineExecutableInternalRepresentationKHR.Buffer sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineExecutableInternalRepresentationKHR.Buffer pNext(@NativeType("void *") long value) { VkPipelineExecutableInternalRepresentationKHR.npNext(address(), value); return this; }

    }

}