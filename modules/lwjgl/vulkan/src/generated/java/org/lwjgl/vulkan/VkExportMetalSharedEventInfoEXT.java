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
 * Structure that identifies a VkSemaphore or VkEvent object and corresponding Metal MTLSharedEvent object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT}</li>
 * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * <li>If {@code event} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
 * <li>Both of {@code event}, and {@code semaphore} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportMetalSharedEventInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSemaphore {@link #semaphore};
 *     VkEvent {@link #event};
 *     MTLSharedEvent_id {@link #mtlSharedEvent};
 * }</code></pre>
 */
public class VkExportMetalSharedEventInfoEXT extends Struct<VkExportMetalSharedEventInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEMAPHORE,
        EVENT,
        MTLSHAREDEVENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORE = layout.offsetof(2);
        EVENT = layout.offsetof(3);
        MTLSHAREDEVENT = layout.offsetof(4);
    }

    protected VkExportMetalSharedEventInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportMetalSharedEventInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkExportMetalSharedEventInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkExportMetalSharedEventInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMetalSharedEventInfoEXT(ByteBuffer container) {
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
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a {@code VkSemaphore}. */
    @NativeType("VkSemaphore")
    public long semaphore() { return nsemaphore(address()); }
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a {@code VkEvent}. */
    @NativeType("VkEvent")
    public long event() { return nevent(address()); }
    /** the Metal {@code id&lt;MTLSharedEvent&gt;} object underlying the {@code VkSemaphore} or {@code VkEvent} object in {@code semaphore} or {@code event}, respectively. The implementation will return the {@code MTLSharedEvent} in this member, or it will return {@code NULL} if no {@code MTLSharedEvent} could be found underlying the {@code VkSemaphore} or {@code VkEvent} object. */
    @NativeType("MTLSharedEvent_id")
    public long mtlSharedEvent() { return nmtlSharedEvent(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExportMetalSharedEventInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT} value to the {@link #sType} field. */
    public VkExportMetalSharedEventInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExportMetalSharedEventInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #semaphore} field. */
    public VkExportMetalSharedEventInfoEXT semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@link #event} field. */
    public VkExportMetalSharedEventInfoEXT event(@NativeType("VkEvent") long value) { nevent(address(), value); return this; }
    /** Sets the specified value to the {@link #mtlSharedEvent} field. */
    public VkExportMetalSharedEventInfoEXT mtlSharedEvent(@NativeType("MTLSharedEvent_id") long value) { nmtlSharedEvent(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMetalSharedEventInfoEXT set(
        int sType,
        long pNext,
        long semaphore,
        long event,
        long mtlSharedEvent
    ) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        event(event);
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
    public VkExportMetalSharedEventInfoEXT set(VkExportMetalSharedEventInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMetalSharedEventInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMetalSharedEventInfoEXT malloc() {
        return new VkExportMetalSharedEventInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalSharedEventInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMetalSharedEventInfoEXT calloc() {
        return new VkExportMetalSharedEventInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalSharedEventInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkExportMetalSharedEventInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalSharedEventInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkExportMetalSharedEventInfoEXT} instance for the specified memory address. */
    public static VkExportMetalSharedEventInfoEXT create(long address) {
        return new VkExportMetalSharedEventInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalSharedEventInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkExportMetalSharedEventInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkExportMetalSharedEventInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalSharedEventInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalSharedEventInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalSharedEventInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalSharedEventInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalSharedEventInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportMetalSharedEventInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMetalSharedEventInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalSharedEventInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExportMetalSharedEventInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalSharedEventInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalSharedEventInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportMetalSharedEventInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalSharedEventInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalSharedEventInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportMetalSharedEventInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalSharedEventInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalSharedEventInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalSharedEventInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExportMetalSharedEventInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMetalSharedEventInfoEXT.PNEXT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return UNSAFE.getLong(null, struct + VkExportMetalSharedEventInfoEXT.SEMAPHORE); }
    /** Unsafe version of {@link #event}. */
    public static long nevent(long struct) { return UNSAFE.getLong(null, struct + VkExportMetalSharedEventInfoEXT.EVENT); }
    /** Unsafe version of {@link #mtlSharedEvent}. */
    public static long nmtlSharedEvent(long struct) { return memGetAddress(struct + VkExportMetalSharedEventInfoEXT.MTLSHAREDEVENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMetalSharedEventInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMetalSharedEventInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { UNSAFE.putLong(null, struct + VkExportMetalSharedEventInfoEXT.SEMAPHORE, value); }
    /** Unsafe version of {@link #event(long) event}. */
    public static void nevent(long struct, long value) { UNSAFE.putLong(null, struct + VkExportMetalSharedEventInfoEXT.EVENT, value); }
    /** Unsafe version of {@link #mtlSharedEvent(long) mtlSharedEvent}. */
    public static void nmtlSharedEvent(long struct, long value) { memPutAddress(struct + VkExportMetalSharedEventInfoEXT.MTLSHAREDEVENT, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkExportMetalSharedEventInfoEXT.MTLSHAREDEVENT));
    }

    // -----------------------------------

    /** An array of {@link VkExportMetalSharedEventInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkExportMetalSharedEventInfoEXT, Buffer> implements NativeResource {

        private static final VkExportMetalSharedEventInfoEXT ELEMENT_FACTORY = VkExportMetalSharedEventInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkExportMetalSharedEventInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMetalSharedEventInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExportMetalSharedEventInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExportMetalSharedEventInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMetalSharedEventInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkExportMetalSharedEventInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMetalSharedEventInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkExportMetalSharedEventInfoEXT#semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkExportMetalSharedEventInfoEXT.nsemaphore(address()); }
        /** @return the value of the {@link VkExportMetalSharedEventInfoEXT#event} field. */
        @NativeType("VkEvent")
        public long event() { return VkExportMetalSharedEventInfoEXT.nevent(address()); }
        /** @return the value of the {@link VkExportMetalSharedEventInfoEXT#mtlSharedEvent} field. */
        @NativeType("MTLSharedEvent_id")
        public long mtlSharedEvent() { return VkExportMetalSharedEventInfoEXT.nmtlSharedEvent(address()); }

        /** Sets the specified value to the {@link VkExportMetalSharedEventInfoEXT#sType} field. */
        public VkExportMetalSharedEventInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMetalSharedEventInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT} value to the {@link VkExportMetalSharedEventInfoEXT#sType} field. */
        public VkExportMetalSharedEventInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT); }
        /** Sets the specified value to the {@link VkExportMetalSharedEventInfoEXT#pNext} field. */
        public VkExportMetalSharedEventInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkExportMetalSharedEventInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMetalSharedEventInfoEXT#semaphore} field. */
        public VkExportMetalSharedEventInfoEXT.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkExportMetalSharedEventInfoEXT.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMetalSharedEventInfoEXT#event} field. */
        public VkExportMetalSharedEventInfoEXT.Buffer event(@NativeType("VkEvent") long value) { VkExportMetalSharedEventInfoEXT.nevent(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMetalSharedEventInfoEXT#mtlSharedEvent} field. */
        public VkExportMetalSharedEventInfoEXT.Buffer mtlSharedEvent(@NativeType("MTLSharedEvent_id") long value) { VkExportMetalSharedEventInfoEXT.nmtlSharedEvent(address(), value); return this; }

    }

}