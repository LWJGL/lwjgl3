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
 * Properties of external memory host pointer.
 * 
 * <h5>Description</h5>
 * 
 * <p>The value returned by {@code memoryTypeBits} <b>must</b> only include bits that identify memory types which are host visible.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTExternalMemoryHost#VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTExternalMemoryHost#vkGetMemoryHostPointerPropertiesEXT GetMemoryHostPointerPropertiesEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryHostPointerPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #memoryTypeBits};
 * }</code></pre>
 */
public class VkMemoryHostPointerPropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYTYPEBITS;

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
        MEMORYTYPEBITS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkMemoryHostPointerPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryHostPointerPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask containing one bit set for every memory type which the specified host pointer <b>can</b> be imported as. */
    @NativeType("uint32_t")
    public int memoryTypeBits() { return nmemoryTypeBits(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryHostPointerPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExternalMemoryHost#VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkMemoryHostPointerPropertiesEXT sType$Default() { return sType(EXTExternalMemoryHost.VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryHostPointerPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryHostPointerPropertiesEXT set(
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
    public VkMemoryHostPointerPropertiesEXT set(VkMemoryHostPointerPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryHostPointerPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryHostPointerPropertiesEXT malloc() {
        return wrap(VkMemoryHostPointerPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMemoryHostPointerPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryHostPointerPropertiesEXT calloc() {
        return wrap(VkMemoryHostPointerPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMemoryHostPointerPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkMemoryHostPointerPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMemoryHostPointerPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryHostPointerPropertiesEXT} instance for the specified memory address. */
    public static VkMemoryHostPointerPropertiesEXT create(long address) {
        return wrap(VkMemoryHostPointerPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryHostPointerPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkMemoryHostPointerPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkMemoryHostPointerPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryHostPointerPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryHostPointerPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryHostPointerPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryHostPointerPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryHostPointerPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMemoryHostPointerPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryHostPointerPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryHostPointerPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryHostPointerPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryHostPointerPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryHostPointerPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryHostPointerPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryHostPointerPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryHostPointerPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryHostPointerPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryHostPointerPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryHostPointerPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryHostPointerPropertiesEXT malloc(MemoryStack stack) {
        return wrap(VkMemoryHostPointerPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMemoryHostPointerPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryHostPointerPropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkMemoryHostPointerPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryHostPointerPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryHostPointerPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryHostPointerPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryHostPointerPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryHostPointerPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryHostPointerPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #memoryTypeBits}. */
    public static int nmemoryTypeBits(long struct) { return UNSAFE.getInt(null, struct + VkMemoryHostPointerPropertiesEXT.MEMORYTYPEBITS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryHostPointerPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryHostPointerPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryHostPointerPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkMemoryHostPointerPropertiesEXT, Buffer> implements NativeResource {

        private static final VkMemoryHostPointerPropertiesEXT ELEMENT_FACTORY = VkMemoryHostPointerPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkMemoryHostPointerPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryHostPointerPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryHostPointerPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryHostPointerPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryHostPointerPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkMemoryHostPointerPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkMemoryHostPointerPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkMemoryHostPointerPropertiesEXT#memoryTypeBits} field. */
        @NativeType("uint32_t")
        public int memoryTypeBits() { return VkMemoryHostPointerPropertiesEXT.nmemoryTypeBits(address()); }

        /** Sets the specified value to the {@link VkMemoryHostPointerPropertiesEXT#sType} field. */
        public VkMemoryHostPointerPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryHostPointerPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExternalMemoryHost#VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT} value to the {@link VkMemoryHostPointerPropertiesEXT#sType} field. */
        public VkMemoryHostPointerPropertiesEXT.Buffer sType$Default() { return sType(EXTExternalMemoryHost.VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkMemoryHostPointerPropertiesEXT#pNext} field. */
        public VkMemoryHostPointerPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkMemoryHostPointerPropertiesEXT.npNext(address(), value); return this; }

    }

}