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
 * Structure describing external memory host pointer limits that can be supported by an implementation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTExternalMemoryHost#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2KHR}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code minImportedHostPointerAlignment} &ndash; the minimum required: alignment, in bytes, for the base address and size of host pointers that <b>can</b> be imported to a Vulkan memory object.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceExternalMemoryHostPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceSize minImportedHostPointerAlignment;
 * }</pre></code>
 */
public class VkPhysicalDeviceExternalMemoryHostPropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINIMPORTEDHOSTPOINTERALIGNMENT;

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
        MINIMPORTEDHOSTPOINTERALIGNMENT = layout.offsetof(2);
    }

    VkPhysicalDeviceExternalMemoryHostPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code minImportedHostPointerAlignment} field. */
    @NativeType("VkDeviceSize")
    public long minImportedHostPointerAlignment() { return nminImportedHostPointerAlignment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code minImportedHostPointerAlignment} field. */
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT minImportedHostPointerAlignment(@NativeType("VkDeviceSize") long value) { nminImportedHostPointerAlignment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT set(
        int sType,
        long pNext,
        long minImportedHostPointerAlignment
    ) {
        sType(sType);
        pNext(pNext);
        minImportedHostPointerAlignment(minImportedHostPointerAlignment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT set(VkPhysicalDeviceExternalMemoryHostPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT create() {
        return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT create(long address) {
        return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceExternalMemoryHostPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExternalMemoryHostPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #minImportedHostPointerAlignment}. */
    public static long nminImportedHostPointerAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceExternalMemoryHostPropertiesEXT.MINIMPORTEDHOSTPOINTERALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExternalMemoryHostPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExternalMemoryHostPropertiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #minImportedHostPointerAlignment(long) minImportedHostPointerAlignment}. */
    public static void nminImportedHostPointerAlignment(long struct, long value) { memPutLong(struct + VkPhysicalDeviceExternalMemoryHostPropertiesEXT.MINIMPORTEDHOSTPOINTERALIGNMENT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalMemoryHostPropertiesEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkPhysicalDeviceExternalMemoryHostPropertiesEXT newInstance(long address) {
            return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExternalMemoryHostPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExternalMemoryHostPropertiesEXT.npNext(address()); }
        /** Returns the value of the {@code minImportedHostPointerAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minImportedHostPointerAlignment() { return VkPhysicalDeviceExternalMemoryHostPropertiesEXT.nminImportedHostPointerAlignment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExternalMemoryHostPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExternalMemoryHostPropertiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code minImportedHostPointerAlignment} field. */
        public VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Buffer minImportedHostPointerAlignment(@NativeType("VkDeviceSize") long value) { VkPhysicalDeviceExternalMemoryHostPropertiesEXT.nminImportedHostPointerAlignment(address(), value); return this; }

    }

}