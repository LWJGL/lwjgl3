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
 * Structure that identifies a Metal MTLBuffer object to use when creating a VkDeviceMemory object.
 * 
 * <h5>Description</h5>
 * 
 * <p>The app <b>must</b> ensure that the configuration of the {@code id&lt;MTLBuffer&gt;} object is compatible with the configuration of the {@code VkDeviceMemory}. Failure to do so results in undefined behavior.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMetalObjects#VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportMetalBufferInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     MTLBuffer_id {@link #mtlBuffer};
 * }</code></pre>
 */
public class VkImportMetalBufferInfoEXT extends Struct<VkImportMetalBufferInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MTLBUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MTLBUFFER = layout.offsetof(2);
    }

    protected VkImportMetalBufferInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImportMetalBufferInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImportMetalBufferInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkImportMetalBufferInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMetalBufferInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the Metal {@code id&lt;MTLBuffer&gt;} object that is to underlie the {@code VkDeviceMemory}. */
    @NativeType("MTLBuffer_id")
    public long mtlBuffer() { return nmtlBuffer(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImportMetalBufferInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT} value to the {@link #sType} field. */
    public VkImportMetalBufferInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImportMetalBufferInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #mtlBuffer} field. */
    public VkImportMetalBufferInfoEXT mtlBuffer(@NativeType("MTLBuffer_id") long value) { nmtlBuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMetalBufferInfoEXT set(
        int sType,
        long pNext,
        long mtlBuffer
    ) {
        sType(sType);
        pNext(pNext);
        mtlBuffer(mtlBuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportMetalBufferInfoEXT set(VkImportMetalBufferInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportMetalBufferInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMetalBufferInfoEXT malloc() {
        return new VkImportMetalBufferInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImportMetalBufferInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMetalBufferInfoEXT calloc() {
        return new VkImportMetalBufferInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImportMetalBufferInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImportMetalBufferInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMetalBufferInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImportMetalBufferInfoEXT} instance for the specified memory address. */
    public static VkImportMetalBufferInfoEXT create(long address) {
        return new VkImportMetalBufferInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMetalBufferInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkImportMetalBufferInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkImportMetalBufferInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalBufferInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalBufferInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalBufferInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalBufferInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalBufferInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImportMetalBufferInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportMetalBufferInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMetalBufferInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImportMetalBufferInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMetalBufferInfoEXT malloc(MemoryStack stack) {
        return new VkImportMetalBufferInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImportMetalBufferInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMetalBufferInfoEXT calloc(MemoryStack stack) {
        return new VkImportMetalBufferInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImportMetalBufferInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMetalBufferInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalBufferInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMetalBufferInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImportMetalBufferInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMetalBufferInfoEXT.PNEXT); }
    /** Unsafe version of {@link #mtlBuffer}. */
    public static long nmtlBuffer(long struct) { return memGetAddress(struct + VkImportMetalBufferInfoEXT.MTLBUFFER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMetalBufferInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMetalBufferInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #mtlBuffer(long) mtlBuffer}. */
    public static void nmtlBuffer(long struct, long value) { memPutAddress(struct + VkImportMetalBufferInfoEXT.MTLBUFFER, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImportMetalBufferInfoEXT.MTLBUFFER));
    }

    // -----------------------------------

    /** An array of {@link VkImportMetalBufferInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImportMetalBufferInfoEXT, Buffer> implements NativeResource {

        private static final VkImportMetalBufferInfoEXT ELEMENT_FACTORY = VkImportMetalBufferInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImportMetalBufferInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMetalBufferInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImportMetalBufferInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImportMetalBufferInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMetalBufferInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkImportMetalBufferInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportMetalBufferInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkImportMetalBufferInfoEXT#mtlBuffer} field. */
        @NativeType("MTLBuffer_id")
        public long mtlBuffer() { return VkImportMetalBufferInfoEXT.nmtlBuffer(address()); }

        /** Sets the specified value to the {@link VkImportMetalBufferInfoEXT#sType} field. */
        public VkImportMetalBufferInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMetalBufferInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT} value to the {@link VkImportMetalBufferInfoEXT#sType} field. */
        public VkImportMetalBufferInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT); }
        /** Sets the specified value to the {@link VkImportMetalBufferInfoEXT#pNext} field. */
        public VkImportMetalBufferInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImportMetalBufferInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportMetalBufferInfoEXT#mtlBuffer} field. */
        public VkImportMetalBufferInfoEXT.Buffer mtlBuffer(@NativeType("MTLBuffer_id") long value) { VkImportMetalBufferInfoEXT.nmtlBuffer(address(), value); return this; }

    }

}