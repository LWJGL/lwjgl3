/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure for NV internal use only.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV}</li>
 * <li>{@code pPrivateData} <b>must</b> be a pointer value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkOpticalFlowSessionCreatePrivateDataInfoNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #id};
 *     uint32_t {@link #size};
 *     void const * {@link #pPrivateData};
 * }</code></pre>
 */
public class VkOpticalFlowSessionCreatePrivateDataInfoNV extends Struct<VkOpticalFlowSessionCreatePrivateDataInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ID,
        SIZE,
        PPRIVATEDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ID = layout.offsetof(2);
        SIZE = layout.offsetof(3);
        PPRIVATEDATA = layout.offsetof(4);
    }

    protected VkOpticalFlowSessionCreatePrivateDataInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkOpticalFlowSessionCreatePrivateDataInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(address, container);
    }

    /**
     * Creates a {@code VkOpticalFlowSessionCreatePrivateDataInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkOpticalFlowSessionCreatePrivateDataInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** an identifier for data which is passed at a memory location specified in {@link VkOpticalFlowSessionCreatePrivateDataInfoNV}{@code ::pPrivateData}. */
    @NativeType("uint32_t")
    public int id() { return nid(address()); }
    /** the size of data in bytes which is passed at a memory location specified in {@link VkOpticalFlowSessionCreatePrivateDataInfoNV}{@code ::pPrivateData}. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }
    /** a pointer to NV internal data. */
    @NativeType("void const *")
    public long pPrivateData() { return npPrivateData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkOpticalFlowSessionCreatePrivateDataInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV} value to the {@link #sType} field. */
    public VkOpticalFlowSessionCreatePrivateDataInfoNV sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #id} field. */
    public VkOpticalFlowSessionCreatePrivateDataInfoNV id(@NativeType("uint32_t") int value) { nid(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkOpticalFlowSessionCreatePrivateDataInfoNV size(@NativeType("uint32_t") int value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@link #pPrivateData} field. */
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pPrivateData(@NativeType("void const *") long value) { npPrivateData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkOpticalFlowSessionCreatePrivateDataInfoNV set(
        int sType,
        long pNext,
        int id,
        int size,
        long pPrivateData
    ) {
        sType(sType);
        pNext(pNext);
        id(id);
        size(size);
        pPrivateData(pPrivateData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkOpticalFlowSessionCreatePrivateDataInfoNV set(VkOpticalFlowSessionCreatePrivateDataInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkOpticalFlowSessionCreatePrivateDataInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV malloc() {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkOpticalFlowSessionCreatePrivateDataInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV calloc() {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkOpticalFlowSessionCreatePrivateDataInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkOpticalFlowSessionCreatePrivateDataInfoNV} instance for the specified memory address. */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV create(long address) {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV createSafe(long address) {
        return address == NULL ? null : new VkOpticalFlowSessionCreatePrivateDataInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkOpticalFlowSessionCreatePrivateDataInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV malloc(MemoryStack stack) {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkOpticalFlowSessionCreatePrivateDataInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV calloc(MemoryStack stack) {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkOpticalFlowSessionCreatePrivateDataInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkOpticalFlowSessionCreatePrivateDataInfoNV.PNEXT); }
    /** Unsafe version of {@link #id}. */
    public static int nid(long struct) { return UNSAFE.getInt(null, struct + VkOpticalFlowSessionCreatePrivateDataInfoNV.ID); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + VkOpticalFlowSessionCreatePrivateDataInfoNV.SIZE); }
    /** Unsafe version of {@link #pPrivateData}. */
    public static long npPrivateData(long struct) { return memGetAddress(struct + VkOpticalFlowSessionCreatePrivateDataInfoNV.PPRIVATEDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkOpticalFlowSessionCreatePrivateDataInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkOpticalFlowSessionCreatePrivateDataInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #id(int) id}. */
    public static void nid(long struct, int value) { UNSAFE.putInt(null, struct + VkOpticalFlowSessionCreatePrivateDataInfoNV.ID, value); }
    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + VkOpticalFlowSessionCreatePrivateDataInfoNV.SIZE, value); }
    /** Unsafe version of {@link #pPrivateData(long) pPrivateData}. */
    public static void npPrivateData(long struct, long value) { memPutAddress(struct + VkOpticalFlowSessionCreatePrivateDataInfoNV.PPRIVATEDATA, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkOpticalFlowSessionCreatePrivateDataInfoNV.PPRIVATEDATA));
    }

    // -----------------------------------

    /** An array of {@link VkOpticalFlowSessionCreatePrivateDataInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkOpticalFlowSessionCreatePrivateDataInfoNV, Buffer> implements NativeResource {

        private static final VkOpticalFlowSessionCreatePrivateDataInfoNV ELEMENT_FACTORY = VkOpticalFlowSessionCreatePrivateDataInfoNV.create(-1L);

        /**
         * Creates a new {@code VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkOpticalFlowSessionCreatePrivateDataInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkOpticalFlowSessionCreatePrivateDataInfoNV.nsType(address()); }
        /** @return the value of the {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkOpticalFlowSessionCreatePrivateDataInfoNV.npNext(address()); }
        /** @return the value of the {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#id} field. */
        @NativeType("uint32_t")
        public int id() { return VkOpticalFlowSessionCreatePrivateDataInfoNV.nid(address()); }
        /** @return the value of the {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#size} field. */
        @NativeType("uint32_t")
        public int size() { return VkOpticalFlowSessionCreatePrivateDataInfoNV.nsize(address()); }
        /** @return the value of the {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#pPrivateData} field. */
        @NativeType("void const *")
        public long pPrivateData() { return VkOpticalFlowSessionCreatePrivateDataInfoNV.npPrivateData(address()); }

        /** Sets the specified value to the {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#sType} field. */
        public VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV} value to the {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#sType} field. */
        public VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV); }
        /** Sets the specified value to the {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#pNext} field. */
        public VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer pNext(@NativeType("void *") long value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#id} field. */
        public VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer id(@NativeType("uint32_t") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.nid(address(), value); return this; }
        /** Sets the specified value to the {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#size} field. */
        public VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer size(@NativeType("uint32_t") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.nsize(address(), value); return this; }
        /** Sets the specified value to the {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#pPrivateData} field. */
        public VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer pPrivateData(@NativeType("void const *") long value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.npPrivateData(address(), value); return this; }

    }

}