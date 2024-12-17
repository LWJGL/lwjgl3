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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkImportMetalSharedEventInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     MTLSharedEvent_id mtlSharedEvent;
 * }}</pre>
 */
public class VkImportMetalSharedEventInfoEXT extends Struct<VkImportMetalSharedEventInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MTLSHAREDEVENT;

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
        MTLSHAREDEVENT = layout.offsetof(2);
    }

    protected VkImportMetalSharedEventInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImportMetalSharedEventInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImportMetalSharedEventInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkImportMetalSharedEventInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMetalSharedEventInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code mtlSharedEvent} field. */
    @NativeType("MTLSharedEvent_id")
    public long mtlSharedEvent() { return nmtlSharedEvent(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImportMetalSharedEventInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT} value to the {@code sType} field. */
    public VkImportMetalSharedEventInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImportMetalSharedEventInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code mtlSharedEvent} field. */
    public VkImportMetalSharedEventInfoEXT mtlSharedEvent(@NativeType("MTLSharedEvent_id") long value) { nmtlSharedEvent(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMetalSharedEventInfoEXT set(
        int sType,
        long pNext,
        long mtlSharedEvent
    ) {
        sType(sType);
        pNext(pNext);
        mtlSharedEvent(mtlSharedEvent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportMetalSharedEventInfoEXT set(VkImportMetalSharedEventInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportMetalSharedEventInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMetalSharedEventInfoEXT malloc() {
        return new VkImportMetalSharedEventInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImportMetalSharedEventInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMetalSharedEventInfoEXT calloc() {
        return new VkImportMetalSharedEventInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImportMetalSharedEventInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImportMetalSharedEventInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMetalSharedEventInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImportMetalSharedEventInfoEXT} instance for the specified memory address. */
    public static VkImportMetalSharedEventInfoEXT create(long address) {
        return new VkImportMetalSharedEventInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImportMetalSharedEventInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkImportMetalSharedEventInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkImportMetalSharedEventInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalSharedEventInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalSharedEventInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalSharedEventInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalSharedEventInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalSharedEventInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImportMetalSharedEventInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportMetalSharedEventInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImportMetalSharedEventInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImportMetalSharedEventInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMetalSharedEventInfoEXT malloc(MemoryStack stack) {
        return new VkImportMetalSharedEventInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImportMetalSharedEventInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMetalSharedEventInfoEXT calloc(MemoryStack stack) {
        return new VkImportMetalSharedEventInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImportMetalSharedEventInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMetalSharedEventInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalSharedEventInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMetalSharedEventInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImportMetalSharedEventInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMetalSharedEventInfoEXT.PNEXT); }
    /** Unsafe version of {@link #mtlSharedEvent}. */
    public static long nmtlSharedEvent(long struct) { return memGetAddress(struct + VkImportMetalSharedEventInfoEXT.MTLSHAREDEVENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImportMetalSharedEventInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMetalSharedEventInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #mtlSharedEvent(long) mtlSharedEvent}. */
    public static void nmtlSharedEvent(long struct, long value) { memPutAddress(struct + VkImportMetalSharedEventInfoEXT.MTLSHAREDEVENT, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImportMetalSharedEventInfoEXT.MTLSHAREDEVENT));
    }

    // -----------------------------------

    /** An array of {@link VkImportMetalSharedEventInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImportMetalSharedEventInfoEXT, Buffer> implements NativeResource {

        private static final VkImportMetalSharedEventInfoEXT ELEMENT_FACTORY = VkImportMetalSharedEventInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImportMetalSharedEventInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMetalSharedEventInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImportMetalSharedEventInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMetalSharedEventInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportMetalSharedEventInfoEXT.npNext(address()); }
        /** @return the value of the {@code mtlSharedEvent} field. */
        @NativeType("MTLSharedEvent_id")
        public long mtlSharedEvent() { return VkImportMetalSharedEventInfoEXT.nmtlSharedEvent(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImportMetalSharedEventInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMetalSharedEventInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT} value to the {@code sType} field. */
        public VkImportMetalSharedEventInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImportMetalSharedEventInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImportMetalSharedEventInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code mtlSharedEvent} field. */
        public VkImportMetalSharedEventInfoEXT.Buffer mtlSharedEvent(@NativeType("MTLSharedEvent_id") long value) { VkImportMetalSharedEventInfoEXT.nmtlSharedEvent(address(), value); return this; }

    }

}