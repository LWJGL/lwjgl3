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
 * Structure specifying that external memory has remained unmodified since releasing ownership.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the application releases ownership of the subresource range to one of the special queue families reserved for external memory ownership transfers with a memory barrier structure, and later re-acquires ownership from the same queue family with a memory barrier structure, and if no range of {@code VkDeviceMemory} bound to the resource was modified at any time between the <em>release operation</em> and the <em>acquire operation</em>, then the application <b>should</b> add a {@link VkExternalMemoryAcquireUnmodifiedEXT} structure to the {@code pNext} chain of the <em>acquire operation</em>'s memory barrier structure because this <b>may</b> reduce the performance penalty.</p>
 * 
 * <p>This struct is ignored if {@code acquireUnmodifiedMemory} is {@link VK10#VK_FALSE FALSE}. In particular, {@link VK10#VK_FALSE FALSE} does <em>not</em> specify that memory was modified.</p>
 * 
 * <p>This struct is ignored if the memory barrier’s {@code srcQueueFamilyIndex} is not a special queue family reserved for external memory ownership transfers.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The method by which the application determines whether memory was modified between the <em>release operation</em> and <em>acquire operation</em> is outside the scope of Vulkan.</p>
 * 
 * <p>For any Vulkan operation that accesses a resource, the application <b>must</b> not assume the implementation accesses the resource’s memory as read-only, even for <em>apparently</em> read-only operations such as transfer commands and shader reads.</p>
 * 
 * <p>The validity of {@link VkExternalMemoryAcquireUnmodifiedEXT}{@code ::acquireUnmodifiedMemory} is independent of memory ranges outside the ranges of {@code VkDeviceMemory} bound to the resource. In particular, it is independent of any implementation-private memory associated with the resource.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code acquireUnmodifiedMemory} is {@link VK10#VK_TRUE TRUE}, and the memory barrier’s {@code srcQueueFamilyIndex} is a special queue family reserved for external memory ownership transfers (as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a>), then each range of {@code VkDeviceMemory} bound to the resource <b>must</b> have remained unmodified during all time since the resource’s most recent release of ownership to the queue family.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTExternalMemoryAcquireUnmodified#VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExternalMemoryAcquireUnmodifiedEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #acquireUnmodifiedMemory};
 * }</code></pre>
 */
public class VkExternalMemoryAcquireUnmodifiedEXT extends Struct<VkExternalMemoryAcquireUnmodifiedEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACQUIREUNMODIFIEDMEMORY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACQUIREUNMODIFIEDMEMORY = layout.offsetof(2);
    }

    protected VkExternalMemoryAcquireUnmodifiedEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExternalMemoryAcquireUnmodifiedEXT create(long address, @Nullable ByteBuffer container) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(address, container);
    }

    /**
     * Creates a {@code VkExternalMemoryAcquireUnmodifiedEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalMemoryAcquireUnmodifiedEXT(ByteBuffer container) {
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
    /** specifies, if {@link VK10#VK_TRUE TRUE}, that no range of {@code VkDeviceMemory} bound to the resource of the memory barrier’s subresource range was modified at any time since the resource’s most recent release of ownership to the queue family specified by the memory barrier’s {@code srcQueueFamilyIndex}. If {@link VK10#VK_FALSE FALSE}, it specifies nothing. */
    @NativeType("VkBool32")
    public boolean acquireUnmodifiedMemory() { return nacquireUnmodifiedMemory(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExternalMemoryAcquireUnmodifiedEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExternalMemoryAcquireUnmodified#VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT} value to the {@link #sType} field. */
    public VkExternalMemoryAcquireUnmodifiedEXT sType$Default() { return sType(EXTExternalMemoryAcquireUnmodified.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExternalMemoryAcquireUnmodifiedEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #acquireUnmodifiedMemory} field. */
    public VkExternalMemoryAcquireUnmodifiedEXT acquireUnmodifiedMemory(@NativeType("VkBool32") boolean value) { nacquireUnmodifiedMemory(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalMemoryAcquireUnmodifiedEXT set(
        int sType,
        long pNext,
        boolean acquireUnmodifiedMemory
    ) {
        sType(sType);
        pNext(pNext);
        acquireUnmodifiedMemory(acquireUnmodifiedMemory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExternalMemoryAcquireUnmodifiedEXT set(VkExternalMemoryAcquireUnmodifiedEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalMemoryAcquireUnmodifiedEXT malloc() {
        return new VkExternalMemoryAcquireUnmodifiedEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalMemoryAcquireUnmodifiedEXT calloc() {
        return new VkExternalMemoryAcquireUnmodifiedEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance allocated with {@link BufferUtils}. */
    public static VkExternalMemoryAcquireUnmodifiedEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalMemoryAcquireUnmodifiedEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance for the specified memory address. */
    public static VkExternalMemoryAcquireUnmodifiedEXT create(long address) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalMemoryAcquireUnmodifiedEXT createSafe(long address) {
        return address == NULL ? null : new VkExternalMemoryAcquireUnmodifiedEXT(address, null);
    }

    /**
     * Returns a new {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT malloc(MemoryStack stack) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExternalMemoryAcquireUnmodifiedEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT calloc(MemoryStack stack) {
        return new VkExternalMemoryAcquireUnmodifiedEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryAcquireUnmodifiedEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExternalMemoryAcquireUnmodifiedEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalMemoryAcquireUnmodifiedEXT.PNEXT); }
    /** Unsafe version of {@link #acquireUnmodifiedMemory}. */
    public static int nacquireUnmodifiedMemory(long struct) { return UNSAFE.getInt(null, struct + VkExternalMemoryAcquireUnmodifiedEXT.ACQUIREUNMODIFIEDMEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExternalMemoryAcquireUnmodifiedEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalMemoryAcquireUnmodifiedEXT.PNEXT, value); }
    /** Unsafe version of {@link #acquireUnmodifiedMemory(boolean) acquireUnmodifiedMemory}. */
    public static void nacquireUnmodifiedMemory(long struct, int value) { UNSAFE.putInt(null, struct + VkExternalMemoryAcquireUnmodifiedEXT.ACQUIREUNMODIFIEDMEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkExternalMemoryAcquireUnmodifiedEXT} structs. */
    public static class Buffer extends StructBuffer<VkExternalMemoryAcquireUnmodifiedEXT, Buffer> implements NativeResource {

        private static final VkExternalMemoryAcquireUnmodifiedEXT ELEMENT_FACTORY = VkExternalMemoryAcquireUnmodifiedEXT.create(-1L);

        /**
         * Creates a new {@code VkExternalMemoryAcquireUnmodifiedEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalMemoryAcquireUnmodifiedEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExternalMemoryAcquireUnmodifiedEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExternalMemoryAcquireUnmodifiedEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalMemoryAcquireUnmodifiedEXT.nsType(address()); }
        /** @return the value of the {@link VkExternalMemoryAcquireUnmodifiedEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExternalMemoryAcquireUnmodifiedEXT.npNext(address()); }
        /** @return the value of the {@link VkExternalMemoryAcquireUnmodifiedEXT#acquireUnmodifiedMemory} field. */
        @NativeType("VkBool32")
        public boolean acquireUnmodifiedMemory() { return VkExternalMemoryAcquireUnmodifiedEXT.nacquireUnmodifiedMemory(address()) != 0; }

        /** Sets the specified value to the {@link VkExternalMemoryAcquireUnmodifiedEXT#sType} field. */
        public VkExternalMemoryAcquireUnmodifiedEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalMemoryAcquireUnmodifiedEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExternalMemoryAcquireUnmodified#VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT} value to the {@link VkExternalMemoryAcquireUnmodifiedEXT#sType} field. */
        public VkExternalMemoryAcquireUnmodifiedEXT.Buffer sType$Default() { return sType(EXTExternalMemoryAcquireUnmodified.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT); }
        /** Sets the specified value to the {@link VkExternalMemoryAcquireUnmodifiedEXT#pNext} field. */
        public VkExternalMemoryAcquireUnmodifiedEXT.Buffer pNext(@NativeType("void const *") long value) { VkExternalMemoryAcquireUnmodifiedEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkExternalMemoryAcquireUnmodifiedEXT#acquireUnmodifiedMemory} field. */
        public VkExternalMemoryAcquireUnmodifiedEXT.Buffer acquireUnmodifiedMemory(@NativeType("VkBool32") boolean value) { VkExternalMemoryAcquireUnmodifiedEXT.nacquireUnmodifiedMemory(address(), value ? 1 : 0); return this; }

    }

}