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
 * Structure that identifies a VkDeviceMemory object and corresponding Metal MTLBuffer object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT}</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportMetalBufferInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceMemory {@link #memory};
 *     MTLBuffer_id {@link #mtlBuffer};
 * }</code></pre>
 */
public class VkExportMetalBufferInfoEXT extends Struct<VkExportMetalBufferInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORY,
        MTLBUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        MTLBUFFER = layout.offsetof(3);
    }

    protected VkExportMetalBufferInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportMetalBufferInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkExportMetalBufferInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkExportMetalBufferInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMetalBufferInfoEXT(ByteBuffer container) {
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
    /** a {@code VkDeviceMemory}. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** the Metal {@code id&lt;MTLBuffer&gt;} object underlying the {@code VkDeviceMemory} object in {@code memory}. The implementation will return the {@code MTLBuffer} in this member, or it will return {@code NULL} if no {@code MTLBuffer} could be found underlying the {@code VkDeviceMemory} object. */
    @NativeType("MTLBuffer_id")
    public long mtlBuffer() { return nmtlBuffer(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExportMetalBufferInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT} value to the {@link #sType} field. */
    public VkExportMetalBufferInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExportMetalBufferInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkExportMetalBufferInfoEXT memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@link #mtlBuffer} field. */
    public VkExportMetalBufferInfoEXT mtlBuffer(@NativeType("MTLBuffer_id") long value) { nmtlBuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMetalBufferInfoEXT set(
        int sType,
        long pNext,
        long memory,
        long mtlBuffer
    ) {
        sType(sType);
        pNext(pNext);
        memory(memory);
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
    public VkExportMetalBufferInfoEXT set(VkExportMetalBufferInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMetalBufferInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMetalBufferInfoEXT malloc() {
        return new VkExportMetalBufferInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalBufferInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMetalBufferInfoEXT calloc() {
        return new VkExportMetalBufferInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalBufferInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkExportMetalBufferInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalBufferInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkExportMetalBufferInfoEXT} instance for the specified memory address. */
    public static VkExportMetalBufferInfoEXT create(long address) {
        return new VkExportMetalBufferInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalBufferInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkExportMetalBufferInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkExportMetalBufferInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalBufferInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalBufferInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalBufferInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalBufferInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalBufferInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportMetalBufferInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMetalBufferInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalBufferInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExportMetalBufferInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalBufferInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalBufferInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportMetalBufferInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalBufferInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalBufferInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportMetalBufferInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalBufferInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalBufferInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalBufferInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExportMetalBufferInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMetalBufferInfoEXT.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkExportMetalBufferInfoEXT.MEMORY); }
    /** Unsafe version of {@link #mtlBuffer}. */
    public static long nmtlBuffer(long struct) { return memGetAddress(struct + VkExportMetalBufferInfoEXT.MTLBUFFER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMetalBufferInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMetalBufferInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkExportMetalBufferInfoEXT.MEMORY, value); }
    /** Unsafe version of {@link #mtlBuffer(long) mtlBuffer}. */
    public static void nmtlBuffer(long struct, long value) { memPutAddress(struct + VkExportMetalBufferInfoEXT.MTLBUFFER, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkExportMetalBufferInfoEXT.MTLBUFFER));
    }

    // -----------------------------------

    /** An array of {@link VkExportMetalBufferInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkExportMetalBufferInfoEXT, Buffer> implements NativeResource {

        private static final VkExportMetalBufferInfoEXT ELEMENT_FACTORY = VkExportMetalBufferInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkExportMetalBufferInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMetalBufferInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExportMetalBufferInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExportMetalBufferInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMetalBufferInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkExportMetalBufferInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMetalBufferInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkExportMetalBufferInfoEXT#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkExportMetalBufferInfoEXT.nmemory(address()); }
        /** @return the value of the {@link VkExportMetalBufferInfoEXT#mtlBuffer} field. */
        @NativeType("MTLBuffer_id")
        public long mtlBuffer() { return VkExportMetalBufferInfoEXT.nmtlBuffer(address()); }

        /** Sets the specified value to the {@link VkExportMetalBufferInfoEXT#sType} field. */
        public VkExportMetalBufferInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMetalBufferInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT} value to the {@link VkExportMetalBufferInfoEXT#sType} field. */
        public VkExportMetalBufferInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT); }
        /** Sets the specified value to the {@link VkExportMetalBufferInfoEXT#pNext} field. */
        public VkExportMetalBufferInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkExportMetalBufferInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMetalBufferInfoEXT#memory} field. */
        public VkExportMetalBufferInfoEXT.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkExportMetalBufferInfoEXT.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMetalBufferInfoEXT#mtlBuffer} field. */
        public VkExportMetalBufferInfoEXT.Buffer mtlBuffer(@NativeType("MTLBuffer_id") long value) { VkExportMetalBufferInfoEXT.nmtlBuffer(address(), value); return this; }

    }

}