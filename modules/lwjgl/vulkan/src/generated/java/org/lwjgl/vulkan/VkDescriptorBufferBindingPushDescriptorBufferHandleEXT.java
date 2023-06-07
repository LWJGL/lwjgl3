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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying push descriptor buffer binding information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT}</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorBufferBindingPushDescriptorBufferHandleEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBuffer buffer;
 * }</code></pre>
 */
public class VkDescriptorBufferBindingPushDescriptorBufferHandleEXT extends Struct<VkDescriptorBufferBindingPushDescriptorBufferHandleEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
    }

    protected VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorBufferBindingPushDescriptorBufferHandleEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorBufferBindingPushDescriptorBufferHandleEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(ByteBuffer container) {
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
    /** @return the value of the {@code buffer} field. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT} value to the {@code sType} field. */
    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT set(
        int sType,
        long pNext,
        long buffer
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT set(VkDescriptorBufferBindingPushDescriptorBufferHandleEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorBufferBindingPushDescriptorBufferHandleEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT malloc() {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorBufferBindingPushDescriptorBufferHandleEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT calloc() {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorBufferBindingPushDescriptorBufferHandleEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorBufferBindingPushDescriptorBufferHandleEXT} instance for the specified memory address. */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT create(long address) {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorBufferBindingPushDescriptorBufferHandleEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT malloc(MemoryStack stack) {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorBufferBindingPushDescriptorBufferHandleEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT calloc(MemoryStack stack) {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.PNEXT); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.BUFFER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.PNEXT, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.BUFFER, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorBufferBindingPushDescriptorBufferHandleEXT, Buffer> implements NativeResource {

        private static final VkDescriptorBufferBindingPushDescriptorBufferHandleEXT ELEMENT_FACTORY = VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorBufferBindingPushDescriptorBufferHandleEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorBufferBindingPushDescriptorBufferHandleEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.npNext(address()); }
        /** @return the value of the {@code buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.nbuffer(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT} value to the {@code sType} field. */
        public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer pNext(@NativeType("void *") long value) { VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.Buffer buffer(@NativeType("VkBuffer") long value) { VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.nbuffer(address(), value); return this; }

    }

}