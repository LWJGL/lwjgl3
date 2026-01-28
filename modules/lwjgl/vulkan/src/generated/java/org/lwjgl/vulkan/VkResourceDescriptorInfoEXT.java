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
 * struct VkResourceDescriptorInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDescriptorType type;
 *     {@link VkResourceDescriptorDataEXT VkResourceDescriptorDataEXT} data;
 * }</code></pre>
 */
public class VkResourceDescriptorInfoEXT extends Struct<VkResourceDescriptorInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkResourceDescriptorDataEXT.SIZEOF, VkResourceDescriptorDataEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        DATA = layout.offsetof(3);
    }

    protected VkResourceDescriptorInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkResourceDescriptorInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkResourceDescriptorInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkResourceDescriptorInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkResourceDescriptorInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code type} field. */
    @NativeType("VkDescriptorType")
    public int type() { return ntype(address()); }
    /** @return a {@link VkResourceDescriptorDataEXT} view of the {@code data} field. */
    public VkResourceDescriptorDataEXT data() { return ndata(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkResourceDescriptorInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT} value to the {@code sType} field. */
    public VkResourceDescriptorInfoEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkResourceDescriptorInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDebugUtilsObjectNameInfoEXT} value to the {@code pNext} chain. */
    public VkResourceDescriptorInfoEXT pNext(VkDebugUtilsObjectNameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code type} field. */
    public VkResourceDescriptorInfoEXT type(@NativeType("VkDescriptorType") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link VkResourceDescriptorDataEXT} to the {@code data} field. */
    public VkResourceDescriptorInfoEXT data(VkResourceDescriptorDataEXT value) { ndata(address(), value); return this; }
    /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkResourceDescriptorInfoEXT data(java.util.function.Consumer<VkResourceDescriptorDataEXT> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public VkResourceDescriptorInfoEXT set(
        int sType,
        long pNext,
        int type,
        VkResourceDescriptorDataEXT data
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
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
    public VkResourceDescriptorInfoEXT set(VkResourceDescriptorInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkResourceDescriptorInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkResourceDescriptorInfoEXT malloc() {
        return new VkResourceDescriptorInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkResourceDescriptorInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkResourceDescriptorInfoEXT calloc() {
        return new VkResourceDescriptorInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkResourceDescriptorInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkResourceDescriptorInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkResourceDescriptorInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkResourceDescriptorInfoEXT} instance for the specified memory address. */
    public static VkResourceDescriptorInfoEXT create(long address) {
        return new VkResourceDescriptorInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkResourceDescriptorInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkResourceDescriptorInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkResourceDescriptorInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkResourceDescriptorInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResourceDescriptorInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkResourceDescriptorInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkResourceDescriptorInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkResourceDescriptorInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResourceDescriptorInfoEXT malloc(MemoryStack stack) {
        return new VkResourceDescriptorInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkResourceDescriptorInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResourceDescriptorInfoEXT calloc(MemoryStack stack) {
        return new VkResourceDescriptorInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkResourceDescriptorInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResourceDescriptorInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResourceDescriptorInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkResourceDescriptorInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkResourceDescriptorInfoEXT.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkResourceDescriptorInfoEXT.TYPE); }
    /** Unsafe version of {@link #data}. */
    public static VkResourceDescriptorDataEXT ndata(long struct) { return VkResourceDescriptorDataEXT.create(struct + VkResourceDescriptorInfoEXT.DATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkResourceDescriptorInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkResourceDescriptorInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkResourceDescriptorInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #data(VkResourceDescriptorDataEXT) data}. */
    public static void ndata(long struct, VkResourceDescriptorDataEXT value) { memCopy(value.address(), struct + VkResourceDescriptorInfoEXT.DATA, VkResourceDescriptorDataEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkResourceDescriptorInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkResourceDescriptorInfoEXT, Buffer> implements NativeResource {

        private static final VkResourceDescriptorInfoEXT ELEMENT_FACTORY = VkResourceDescriptorInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkResourceDescriptorInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkResourceDescriptorInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkResourceDescriptorInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkResourceDescriptorInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkResourceDescriptorInfoEXT.npNext(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkDescriptorType")
        public int type() { return VkResourceDescriptorInfoEXT.ntype(address()); }
        /** @return a {@link VkResourceDescriptorDataEXT} view of the {@code data} field. */
        public VkResourceDescriptorDataEXT data() { return VkResourceDescriptorInfoEXT.ndata(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkResourceDescriptorInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkResourceDescriptorInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT} value to the {@code sType} field. */
        public VkResourceDescriptorInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkResourceDescriptorInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkResourceDescriptorInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDebugUtilsObjectNameInfoEXT} value to the {@code pNext} chain. */
        public VkResourceDescriptorInfoEXT.Buffer pNext(VkDebugUtilsObjectNameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code type} field. */
        public VkResourceDescriptorInfoEXT.Buffer type(@NativeType("VkDescriptorType") int value) { VkResourceDescriptorInfoEXT.ntype(address(), value); return this; }
        /** Copies the specified {@link VkResourceDescriptorDataEXT} to the {@code data} field. */
        public VkResourceDescriptorInfoEXT.Buffer data(VkResourceDescriptorDataEXT value) { VkResourceDescriptorInfoEXT.ndata(address(), value); return this; }
        /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkResourceDescriptorInfoEXT.Buffer data(java.util.function.Consumer<VkResourceDescriptorDataEXT> consumer) { consumer.accept(data()); return this; }

    }

}